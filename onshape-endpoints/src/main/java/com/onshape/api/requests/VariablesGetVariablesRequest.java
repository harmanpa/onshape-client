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

import com.fasterxml.jackson.annotation.JsonProperty;
import com.onshape.api.Onshape;
import com.onshape.api.exceptions.OnshapeException;
import com.onshape.api.responses.VariablesGetVariablesResponse;
import com.onshape.api.types.OnshapeDocument;
import com.onshape.api.types.WV;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;

/**
 * Request object for getVariables API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class VariablesGetVariablesRequest {
  /**
   * includeValuesAndReferencedVariables optional. indicates that variable values and contents of referenced variable studios should be included. default is false.
   */
  @JsonProperty("includeValuesAndReferencedVariables")
  Boolean includeValuesAndReferencedVariables;

  VariablesGetVariablesRequest(Boolean includeValuesAndReferencedVariables) {
    this.includeValuesAndReferencedVariables = includeValuesAndReferencedVariables;
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
    /**
     * includeValuesAndReferencedVariables optional. indicates that variable values and contents of referenced variable studios should be included. default is false.
     */
    private Boolean includeValuesAndReferencedVariables;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get includeValuesAndReferencedVariables optional. indicates that variable values and contents of referenced variable studios should be included. default is false.
     *
     * @return includeValuesAndReferencedVariables optional. indicates that variable values and contents of referenced variable studios should be included. default is false.
     *
     */
    public final Boolean includeValuesAndReferencedVariables() {
      return this.includeValuesAndReferencedVariables;
    }

    /**
     * Set includeValuesAndReferencedVariables optional. indicates that variable values and contents of referenced variable studios should be included. default is false.
     *
     * @param value includeValuesAndReferencedVariables optional. indicates that variable values and contents of referenced variable studios should be included. default is false.
     *
     * @return the Builder object.
     */
    public final Builder includeValuesAndReferencedVariables(Boolean value) {
      this.includeValuesAndReferencedVariables = value;
      return this;
    }

    private VariablesGetVariablesRequest build() {
      return new com.onshape.api.requests.VariablesGetVariablesRequest(includeValuesAndReferencedVariables);
    }

    /**
     * Calls getVariables method, Get contents of variable tables, optionally including variable values and referenced variable studios
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param did Document ID
     *
     * @param wvType Type of Workspace or Version
     *
     * @param wv Workspace (w) or Version (v) ID
     *
     * @param eid Element ID
     */
    public final VariablesGetVariablesResponse call(String did, WV wvType, String wv, String eid)
        throws OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/variables/d/:did/[wv]/:wv/e/:eid/variables", build(), onshape.buildMap("did", did, "wvType", wvType, "wv", wv, "eid", eid), onshape.buildMap("includeValuesAndReferencedVariables", includeValuesAndReferencedVariables), com.onshape.api.responses.VariablesGetVariablesResponse.class);
    }

    /**
     * Calls getVariables method, Get contents of variable tables, optionally including variable values and referenced variable studios
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final VariablesGetVariablesResponse call(OnshapeDocument document) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/variables/d/:did/[wv]/:wv/e/:eid/variables", build(), onshape.buildMap("did", document.getDocumentId(), "wvType", document.getWV(), "wv", document.getWVId(), "eid", document.getElementId()), onshape.buildMap("includeValuesAndReferencedVariables", includeValuesAndReferencedVariables), com.onshape.api.responses.VariablesGetVariablesResponse.class);
    }
  }
}
