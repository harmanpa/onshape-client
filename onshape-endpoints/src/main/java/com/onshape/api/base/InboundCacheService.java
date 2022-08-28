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

import java.time.Instant;
import javax.ws.rs.core.MultivaluedMap;

/**
 *
 * @author Peter Harman peter.harman@cae.tech
 */
public interface InboundCacheService {

    /**
     * Get the data stored in the cache for the given key if present, and
     * collect headers stored
     *
     * @param key Unique key
     * @param headers Response headers
     * @return The bytes stored or null if not present
     */
    public byte[] get(String key, MultivaluedMap<String, String> headers);

    /**
     * Set the data and headers in the cache for a given key
     *
     * @param key Unique key
     * @param entity Raw data of response
     * @param headers Headers from the response
     * @param expiry Optional expiry of the cache entry
     */
    public void set(String key, byte[] entity, MultivaluedMap<String, String> headers, Instant expiry);
}
