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
import com.onshape.api.responses.VariablesSetVariableStudioReferencesResponse;
import com.onshape.api.types.OnshapeDocument;
import jakarta.validation.constraints.NotNull;
import java.lang.Override;
import java.lang.String;

/**
 * Request object for setVariableStudioReferences API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class VariablesSetVariableStudioReferencesRequest {
  /**
   * wrapper for list of variable studio references
   */
  @JsonProperty("wrapper")
  @NotNull
  VariablesSetVariableStudioReferencesRequestWrapper wrapper;

  VariablesSetVariableStudioReferencesRequest(VariablesSetVariableStudioReferencesRequestWrapper wrapper) {
    this.wrapper = wrapper;
  }

  /**
   * Get wrapper for list of variable studio references
   *
   * @return wrapper for list of variable studio references
   *
   */
  public final VariablesSetVariableStudioReferencesRequestWrapper getWrapper() {
    return this.wrapper;
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
     * wrapper for list of variable studio references
     */
    private VariablesSetVariableStudioReferencesRequestWrapper wrapper;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get wrapper for list of variable studio references
     *
     * @return wrapper for list of variable studio references
     *
     */
    public final VariablesSetVariableStudioReferencesRequestWrapper wrapper() {
      return this.wrapper;
    }

    /**
     * Set wrapper for list of variable studio references
     *
     * @param value wrapper for list of variable studio references
     *
     * @return the Builder object.
     */
    public final Builder wrapper(VariablesSetVariableStudioReferencesRequestWrapper value) {
      this.wrapper = value;
      return this;
    }

    private VariablesSetVariableStudioReferencesRequest build() {
      return new com.onshape.api.requests.VariablesSetVariableStudioReferencesRequest(wrapper);
    }

    /**
     * Calls setVariableStudioReferences method, Set an element's variable studio references
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param did Document ID
     *
     * @param wid Workspace ID
     *
     * @param eid Element ID
     */
    public final VariablesSetVariableStudioReferencesResponse call(String did, String wid,
        String eid) throws OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/variables/d/:did/w/:wid/e/:eid/variablestudioreferences", build(), onshape.buildMap("did", did, "wid", wid, "eid", eid), onshape.buildMap(), com.onshape.api.responses.VariablesSetVariableStudioReferencesResponse.class);
    }

    /**
     * Calls setVariableStudioReferences method, Set an element's variable studio references
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final VariablesSetVariableStudioReferencesResponse call(OnshapeDocument document) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/variables/d/:did/w/:wid/e/:eid/variablestudioreferences", build(), onshape.buildMap("did", document.getDocumentId(), "wid", document.getWorkspaceId(), "eid", document.getElementId()), onshape.buildMap(), com.onshape.api.responses.VariablesSetVariableStudioReferencesResponse.class);
    }
  }
}
