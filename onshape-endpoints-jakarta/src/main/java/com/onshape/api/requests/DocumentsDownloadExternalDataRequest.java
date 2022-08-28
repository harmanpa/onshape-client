// The MIT License (MIT)
//
// Copyright (c) 2018 - Present Onshape Inc. 
//
// Permission is hereby granted, free of charge, to any person obtaining a copy
// of this software and associated documentation files (the "Software"), to deal
// in the Software without restriction, including without limitation the rights
// to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
// copies of the Software, and to permit persons to whom the Software is
// furnished to do so, subject to the following conditions:
//
// The above copyright notice and this permission notice shall be included in all
// copies or substantial portions of the Software.
//
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
// OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
// SOFTWARE.
//
package com.onshape.api.requests;

import com.onshape.api.Onshape;
import com.onshape.api.exceptions.OnshapeException;
import com.onshape.api.responses.DocumentsDownloadExternalDataResponse;
import com.onshape.api.types.InputStreamWithHeaders;
import com.onshape.api.types.OnshapeDocument;
import java.lang.Override;
import java.lang.String;

/**
 * Request object for downloadExternalData API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class DocumentsDownloadExternalDataRequest {
  DocumentsDownloadExternalDataRequest() {
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }

  public static final Builder builder(Onshape onshape) {
    Builder builder = new Builder();
    builder.onshape = onshape;
    return builder;
  }

  public static final class Builder {
    Onshape onshape;

    Builder() {
    }

    private DocumentsDownloadExternalDataRequest build() {
      return new com.onshape.api.requests.DocumentsDownloadExternalDataRequest();
    }

    /**
     * Calls downloadExternalData method, Download external data
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param fid External data ID
     *
     * @param did Document ID
     */
    public final DocumentsDownloadExternalDataResponse call(String fid, String did) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/documents/d/:did/externaldata/:fid", build(), onshape.buildMap("fid", fid, "did", did), onshape.buildMap(), com.onshape.api.responses.DocumentsDownloadExternalDataResponse.class);
    }

    /**
     * Calls downloadExternalData method, Download external data
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param fid External data ID
     */
    public final DocumentsDownloadExternalDataResponse call(OnshapeDocument document, String fid)
        throws OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/documents/d/:did/externaldata/:fid", build(), onshape.buildMap("fid", fid, "did", document.getDocumentId()), onshape.buildMap(), com.onshape.api.responses.DocumentsDownloadExternalDataResponse.class);
    }

    /**
     * Calls downloadExternalData method, Download external data
     * @return InputStreamWithHeaders stream with headers
     * @throws OnshapeException On HTTP error
     *
     * @param fid External data ID
     *
     * @param did Document ID
     */
    public final InputStreamWithHeaders callToStream(String fid, String did) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/documents/d/:did/externaldata/:fid", build(), onshape.buildMap("fid", fid, "did", did), onshape.buildMap(), InputStreamWithHeaders.class);
    }
  }
}
