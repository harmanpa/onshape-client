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
import com.onshape.api.responses.DocumentsRevertUnchangedToRevisionsResponse;
import com.onshape.api.types.OnshapeDocument;
import jakarta.validation.constraints.NotNull;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;

/**
 * Request object for revertUnchangedToRevisions API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class DocumentsRevertUnchangedToRevisionsRequest {
  /**
   * Whether to update unchanged references to found revisions or just detect them
   */
  @JsonProperty("doUpdate")
  Boolean doUpdate;

  /**
   * Elements in the workspace whose references to check
   */
  @JsonProperty("elements")
  @NotNull
  DocumentsRevertUnchangedToRevisionsRequestElements[] elements;

  DocumentsRevertUnchangedToRevisionsRequest(Boolean doUpdate,
      DocumentsRevertUnchangedToRevisionsRequestElements[] elements) {
    this.doUpdate = doUpdate;
    this.elements = elements;
  }

  /**
   * Get Whether to update unchanged references to found revisions or just detect them
   *
   * @return Whether to update unchanged references to found revisions or just detect them
   *
   */
  public final Boolean getDoUpdate() {
    return this.doUpdate;
  }

  /**
   * Get Elements in the workspace whose references to check
   *
   * @return Elements in the workspace whose references to check
   *
   */
  public final DocumentsRevertUnchangedToRevisionsRequestElements[] getElements() {
    return this.elements;
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
     * Whether to update unchanged references to found revisions or just detect them
     */
    private Boolean doUpdate;

    /**
     * Elements in the workspace whose references to check
     */
    private DocumentsRevertUnchangedToRevisionsRequestElements[] elements;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get Whether to update unchanged references to found revisions or just detect them
     *
     * @return Whether to update unchanged references to found revisions or just detect them
     *
     */
    public final Boolean doUpdate() {
      return this.doUpdate;
    }

    /**
     * Set Whether to update unchanged references to found revisions or just detect them
     *
     * @param value Whether to update unchanged references to found revisions or just detect them
     *
     * @return the Builder object.
     */
    public final Builder doUpdate(Boolean value) {
      this.doUpdate = value;
      return this;
    }

    /**
     * Get Elements in the workspace whose references to check
     *
     * @return Elements in the workspace whose references to check
     *
     */
    public final DocumentsRevertUnchangedToRevisionsRequestElements[] elements() {
      return this.elements;
    }

    /**
     * Set Elements in the workspace whose references to check
     *
     * @param value Elements in the workspace whose references to check
     *
     * @return the Builder object.
     */
    public final Builder elements(DocumentsRevertUnchangedToRevisionsRequestElements[] value) {
      this.elements = value;
      return this;
    }

    private DocumentsRevertUnchangedToRevisionsRequest build() {
      return new com.onshape.api.requests.DocumentsRevertUnchangedToRevisionsRequest(doUpdate,elements);
    }

    /**
     * Calls revertUnchangedToRevisions method, Detect, and optionally revert to revisions, unchanged references in a drawing or assembly
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param did Document ID
     *
     * @param wid Workspace ID
     */
    public final DocumentsRevertUnchangedToRevisionsResponse call(String did, String wid) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/documents/d/:did/w/:wid/revertunchangedtorevisions", build(), onshape.buildMap("did", did, "wid", wid), onshape.buildMap(), com.onshape.api.responses.DocumentsRevertUnchangedToRevisionsResponse.class);
    }

    /**
     * Calls revertUnchangedToRevisions method, Detect, and optionally revert to revisions, unchanged references in a drawing or assembly
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final DocumentsRevertUnchangedToRevisionsResponse call(OnshapeDocument document) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/documents/d/:did/w/:wid/revertunchangedtorevisions", build(), onshape.buildMap("did", document.getDocumentId(), "wid", document.getWorkspaceId()), onshape.buildMap(), com.onshape.api.responses.DocumentsRevertUnchangedToRevisionsResponse.class);
    }
  }
}
