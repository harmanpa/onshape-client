/*
 * The MIT License
 *
 * Copyright 2022 CAE Tech Limited
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.onshape.api.base;

import java.io.IOException;
import java.io.InputStream;
import java.time.Instant;
import jakarta.annotation.Priority;
import jakarta.ws.rs.WebApplicationException;
import jakarta.ws.rs.core.MultivaluedMap;
import jakarta.ws.rs.ext.Provider;
import jakarta.ws.rs.ext.ReaderInterceptor;
import jakarta.ws.rs.ext.ReaderInterceptorContext;
import org.apache.commons.io.input.TeeInputStream;
import org.apache.commons.io.output.ByteArrayOutputStream;

/**
 *
 * @author Peter Harman peter.harman@cae.tech
 */
@Provider()
@Priority(0)
class CacheReaderInterceptor implements ReaderInterceptor {

    private final BaseClient client;

    CacheReaderInterceptor(BaseClient client) {
        this.client = client;
    }

    @Override
    public Object aroundReadFrom(ReaderInterceptorContext context) throws IOException, WebApplicationException {
        if (context.getProperty("CacheKey") != null && client.getCacheService() != null) {
            // Wrap the InputStream in order to capture the content to cache on reading
            context.setInputStream(
                    new CacheInputStream(
                            context.getInputStream(),
                            client.getCacheService(),
                            context.getProperty("CacheKey").toString(),
                            context.getHeaders(),
                            Instant.MAX));
        }
        return context.proceed();
    }

    /**
     * OutputStream that writes to cache on closing
     */
    static class CacheOutputStream extends ByteArrayOutputStream {

        private final InboundCacheService cache;
        private final String key;
        private final MultivaluedMap<String, String> headers;
        private final Instant expiry;

        CacheOutputStream(InboundCacheService cache, String key, MultivaluedMap<String, String> headers, Instant expiry) {
            this.cache = cache;
            this.key = key;
            this.headers = headers;
            this.expiry = expiry;
        }

        @Override
        public void close() throws IOException {
            super.close();
            this.cache.set(key, toByteArray(), headers, expiry);
        }

    }

    /**
     * InputStream that writes to cache on closing
     */
    static class CacheInputStream extends TeeInputStream {

        CacheInputStream(InputStream input, InboundCacheService cache, String key, MultivaluedMap<String, String> headers, Instant expiry) {
            super(input, new CacheOutputStream(cache, key, headers, expiry), true);
        }

    }
}
