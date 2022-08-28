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
import com.onshape.api.responses.AppElementsResolveReferencesResponse;
import com.onshape.api.types.OnshapeDocument;
import com.onshape.api.types.WVM;
import java.lang.Override;
import java.lang.String;

/**
 * Request object for resolveReferences API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class AppElementsResolveReferencesRequest {
  /**
   * Id of the transaction in which the references should be retrieved. Valid only when used with a workspaceId
   */
  @JsonProperty("transactionId")
  String transactionId;

  /**
   * Id of the change at which the references should be retrieved. Valid only when used with a workspaceId
   */
  @JsonProperty("parentChangeId")
  String parentChangeId;

  /**
   * A list of ids (comma-separated) of the references to resolve, or empty if all.
   */
  @JsonProperty("referenceIds")
  String referenceIds;

  /**
   * Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
   */
  @JsonProperty("linkDocumentId")
  String linkDocumentId;

  AppElementsResolveReferencesRequest(String transactionId, String parentChangeId,
      String referenceIds, String linkDocumentId) {
    this.transactionId = transactionId;
    this.parentChangeId = parentChangeId;
    this.referenceIds = referenceIds;
    this.linkDocumentId = linkDocumentId;
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
     * Id of the transaction in which the references should be retrieved. Valid only when used with a workspaceId
     */
    private String transactionId;

    /**
     * Id of the change at which the references should be retrieved. Valid only when used with a workspaceId
     */
    private String parentChangeId;

    /**
     * A list of ids (comma-separated) of the references to resolve, or empty if all.
     */
    private String referenceIds;

    /**
     * Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
     */
    private String linkDocumentId;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get Id of the transaction in which the references should be retrieved. Valid only when used with a workspaceId
     *
     * @return Id of the transaction in which the references should be retrieved. Valid only when used with a workspaceId
     *
     */
    public final String transactionId() {
      return this.transactionId;
    }

    /**
     * Set Id of the transaction in which the references should be retrieved. Valid only when used with a workspaceId
     *
     * @param value Id of the transaction in which the references should be retrieved. Valid only when used with a workspaceId
     *
     * @return the Builder object.
     */
    public final Builder transactionId(String value) {
      this.transactionId = value;
      return this;
    }

    /**
     * Get Id of the change at which the references should be retrieved. Valid only when used with a workspaceId
     *
     * @return Id of the change at which the references should be retrieved. Valid only when used with a workspaceId
     *
     */
    public final String parentChangeId() {
      return this.parentChangeId;
    }

    /**
     * Set Id of the change at which the references should be retrieved. Valid only when used with a workspaceId
     *
     * @param value Id of the change at which the references should be retrieved. Valid only when used with a workspaceId
     *
     * @return the Builder object.
     */
    public final Builder parentChangeId(String value) {
      this.parentChangeId = value;
      return this;
    }

    /**
     * Get A list of ids (comma-separated) of the references to resolve, or empty if all.
     *
     * @return A list of ids (comma-separated) of the references to resolve, or empty if all.
     *
     */
    public final String referenceIds() {
      return this.referenceIds;
    }

    /**
     * Set A list of ids (comma-separated) of the references to resolve, or empty if all.
     *
     * @param value A list of ids (comma-separated) of the references to resolve, or empty if all.
     *
     * @return the Builder object.
     */
    public final Builder referenceIds(String value) {
      this.referenceIds = value;
      return this;
    }

    /**
     * Get Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
     *
     * @return Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
     *
     */
    public final String linkDocumentId() {
      return this.linkDocumentId;
    }

    /**
     * Set Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
     *
     * @param value Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
     *
     * @return the Builder object.
     */
    public final Builder linkDocumentId(String value) {
      this.linkDocumentId = value;
      return this;
    }

    private AppElementsResolveReferencesRequest build() {
      return new com.onshape.api.requests.AppElementsResolveReferencesRequest(transactionId,parentChangeId,referenceIds,linkDocumentId);
    }

    /**
     * Calls resolveReferences method, Resolve references for an app element
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param did Document ID
     *
     * @param wvmType Type of Workspace, Version or Microversion
     *
     * @param wvm Workspace (w), Version (v) or Microversion (m) ID
     *
     * @param eid Element ID
     */
    public final AppElementsResolveReferencesResponse call(String did, WVM wvmType, String wvm,
        String eid) throws OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/appelements/d/:did/[wvm]/:wvm/e/:eid/resolvereferences", build(), onshape.buildMap("did", did, "wvmType", wvmType, "wvm", wvm, "eid", eid), onshape.buildMap("transactionId", transactionId, "parentChangeId", parentChangeId, "referenceIds", referenceIds, "linkDocumentId", linkDocumentId), com.onshape.api.responses.AppElementsResolveReferencesResponse.class);
    }

    /**
     * Calls resolveReferences method, Resolve references for an app element
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final AppElementsResolveReferencesResponse call(OnshapeDocument document) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/appelements/d/:did/[wvm]/:wvm/e/:eid/resolvereferences", build(), onshape.buildMap("did", document.getDocumentId(), "wvmType", document.getWVM(), "wvm", document.getWVMId(), "eid", document.getElementId()), onshape.buildMap("transactionId", transactionId, "parentChangeId", parentChangeId, "referenceIds", referenceIds, "linkDocumentId", linkDocumentId), com.onshape.api.responses.AppElementsResolveReferencesResponse.class);
    }
  }
}
