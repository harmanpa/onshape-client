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
import com.onshape.api.responses.PartsGetPartsInPartstudioResponse;
import com.onshape.api.types.OnshapeDocument;
import com.onshape.api.types.WVM;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;

/**
 * Request object for getPartsInPartstudio API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class PartsGetPartsInPartstudioRequest {
  /**
   * Whether or not to include thumbnails (not supported for microversion)
   */
  @JsonProperty("withThumbnails")
  Boolean withThumbnails;

  /**
   * Whether or not to include flattened sheet metal parts
   */
  @JsonProperty("includeFlatParts")
  Boolean includeFlatParts;

  /**
   * Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
   */
  @JsonProperty("linkDocumentId")
  String linkDocumentId;

  /**
   * If true, include metadata schema property defaults in response
   */
  @JsonProperty("includePropertyDefaults")
  Boolean includePropertyDefaults;

  PartsGetPartsInPartstudioRequest(Boolean withThumbnails, Boolean includeFlatParts,
      String linkDocumentId, Boolean includePropertyDefaults) {
    this.withThumbnails = withThumbnails;
    this.includeFlatParts = includeFlatParts;
    this.linkDocumentId = linkDocumentId;
    this.includePropertyDefaults = includePropertyDefaults;
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
     * Whether or not to include thumbnails (not supported for microversion)
     */
    private Boolean withThumbnails;

    /**
     * Whether or not to include flattened sheet metal parts
     */
    private Boolean includeFlatParts;

    /**
     * Id of document that links to the document being accessed. This may provide additional access rights to the document. Allowed only with version (v) path parameter.
     */
    private String linkDocumentId;

    /**
     * If true, include metadata schema property defaults in response
     */
    private Boolean includePropertyDefaults;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get Whether or not to include thumbnails (not supported for microversion)
     *
     * @return Whether or not to include thumbnails (not supported for microversion)
     *
     */
    public final Boolean withThumbnails() {
      return this.withThumbnails;
    }

    /**
     * Set Whether or not to include thumbnails (not supported for microversion)
     *
     * @param value Whether or not to include thumbnails (not supported for microversion)
     *
     * @return the Builder object.
     */
    public final Builder withThumbnails(Boolean value) {
      this.withThumbnails = value;
      return this;
    }

    /**
     * Get Whether or not to include flattened sheet metal parts
     *
     * @return Whether or not to include flattened sheet metal parts
     *
     */
    public final Boolean includeFlatParts() {
      return this.includeFlatParts;
    }

    /**
     * Set Whether or not to include flattened sheet metal parts
     *
     * @param value Whether or not to include flattened sheet metal parts
     *
     * @return the Builder object.
     */
    public final Builder includeFlatParts(Boolean value) {
      this.includeFlatParts = value;
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

    /**
     * Get If true, include metadata schema property defaults in response
     *
     * @return If true, include metadata schema property defaults in response
     *
     */
    public final Boolean includePropertyDefaults() {
      return this.includePropertyDefaults;
    }

    /**
     * Set If true, include metadata schema property defaults in response
     *
     * @param value If true, include metadata schema property defaults in response
     *
     * @return the Builder object.
     */
    public final Builder includePropertyDefaults(Boolean value) {
      this.includePropertyDefaults = value;
      return this;
    }

    private PartsGetPartsInPartstudioRequest build() {
      return new com.onshape.api.requests.PartsGetPartsInPartstudioRequest(withThumbnails,includeFlatParts,linkDocumentId,includePropertyDefaults);
    }

    /**
     * Calls getPartsInPartstudio method, Get list of parts in a part studio. An error is returned if the specified element is not a part
     *                 studio. Surface, wire, and mesh parts are not returned for a version but are included for a
     *                 workspace or microversion.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param did Document ID
     *
     * @param wvmType Type of Workspace, Version or Microversion
     *
     * @param wvm Workspace (w), Version (v) or Microversion (m) ID
     *
     * @param eid Part studio element ID
     */
    public final PartsGetPartsInPartstudioResponse call(String did, WVM wvmType, String wvm,
        String eid) throws OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/parts/d/:did/[wvm]/:wvm/e/:eid", build(), onshape.buildMap("did", did, "wvmType", wvmType, "wvm", wvm, "eid", eid), onshape.buildMap("withThumbnails", withThumbnails, "includeFlatParts", includeFlatParts, "linkDocumentId", linkDocumentId, "includePropertyDefaults", includePropertyDefaults), com.onshape.api.responses.PartsGetPartsInPartstudioResponse.class);
    }

    /**
     * Calls getPartsInPartstudio method, Get list of parts in a part studio. An error is returned if the specified element is not a part
     *                 studio. Surface, wire, and mesh parts are not returned for a version but are included for a
     *                 workspace or microversion.
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final PartsGetPartsInPartstudioResponse call(OnshapeDocument document) throws
        OnshapeException {
      onshape.validate(build());
      return onshape.call("get", "/parts/d/:did/[wvm]/:wvm/e/:eid", build(), onshape.buildMap("did", document.getDocumentId(), "wvmType", document.getWVM(), "wvm", document.getWVMId(), "eid", document.getElementId()), onshape.buildMap("withThumbnails", withThumbnails, "includeFlatParts", includeFlatParts, "linkDocumentId", linkDocumentId, "includePropertyDefaults", includePropertyDefaults), com.onshape.api.responses.PartsGetPartsInPartstudioResponse.class);
    }
  }
}
