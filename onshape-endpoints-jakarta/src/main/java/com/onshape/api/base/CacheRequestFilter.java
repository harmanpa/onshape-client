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
import jakarta.annotation.Priority;
import jakarta.ws.rs.client.ClientRequestContext;
import jakarta.ws.rs.client.ClientRequestFilter;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.Provider;
import org.glassfish.jersey.internal.util.collection.MultivaluedStringMap;

/**
 *
 * @author Peter Harman peter.harman@cae.tech
 */
@Provider()
@Priority(0)
class CacheRequestFilter implements ClientRequestFilter {

    private final BaseClient client;

    CacheRequestFilter(BaseClient client) {
        this.client = client;
    }

    @Override
    public void filter(ClientRequestContext crc) throws IOException {
        if (crc.getProperty("CacheKey") != null && client.getCacheService() != null) {
            // If key is in cache, abort with cached result
            MultivaluedStringMap cacheHeaders = new MultivaluedStringMap();
            byte[] response = client.getCacheService().get(crc.getProperty("CacheKey").toString(), cacheHeaders);
            if (response != null) {
                Response.ResponseBuilder rb = Response.ok(response, cacheHeaders.getFirst("Content-Type"));
                cacheHeaders.forEach((k, v1) -> {
                    if (!"Content-Type".equals(k)) {
                        v1.forEach(v2 -> rb.header(k, v2));
                    }
                });
                // Remove the property so we skip writing to the cache
                crc.removeProperty("CacheKey");
                crc.abortWith(rb.build());
            }
        }
    }

}
