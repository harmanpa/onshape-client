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
import com.onshape.api.responses.DocumentsCreateDocumentResponse;
import jakarta.validation.constraints.NotNull;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.Override;
import java.lang.String;

/**
 * Request object for createDocument API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class DocumentsCreateDocumentRequest {
  /**
   * Document name
   */
  @JsonProperty("name")
  @NotNull
  String name;

  /**
   * Id of a folder to place the created document in
   */
  @JsonProperty("parentId")
  @NotNull
  String parentId;

  /**
   * Owner&#39;s user ID (default: current user)
   */
  @JsonProperty("ownerId")
  String ownerId;

  /**
   * Owner&#39;s user type, which can be 0: user, 1: company
   */
  @JsonProperty("ownerType")
  @NotNull
  Number ownerType;

  /**
   * Onshape internal use
   */
  @JsonProperty("betaCapabilityIds")
  String[] betaCapabilityIds;

  /**
   * Whether document is public
   */
  @JsonProperty("isPublic")
  @NotNull
  Boolean isPublic;

  /**
   * Onshape internal use
   */
  @JsonProperty("isGenerateUnknownMessages")
  Boolean isGenerateUnknownMessages;

  /**
   * Onshape internal use
   */
  @JsonProperty("tags")
  String[] tags;

  /**
   * custom elements definition to be created with document.
   */
  @JsonProperty("elements")
  DocumentsCreateDocumentRequestElements[] elements;

  DocumentsCreateDocumentRequest(String name, String parentId, String ownerId, Number ownerType,
      String[] betaCapabilityIds, Boolean isPublic, Boolean isGenerateUnknownMessages,
      String[] tags, DocumentsCreateDocumentRequestElements[] elements) {
    this.name = name;
    this.parentId = parentId;
    this.ownerId = ownerId;
    this.ownerType = ownerType;
    this.betaCapabilityIds = betaCapabilityIds;
    this.isPublic = isPublic;
    this.isGenerateUnknownMessages = isGenerateUnknownMessages;
    this.tags = tags;
    this.elements = elements;
  }

  /**
   * Get Document name
   *
   * @return Document name
   *
   */
  public final String getName() {
    return this.name;
  }

  /**
   * Get Id of a folder to place the created document in
   *
   * @return Id of a folder to place the created document in
   *
   */
  public final String getParentId() {
    return this.parentId;
  }

  /**
   * Get Owner&#39;s user ID (default: current user)
   *
   * @return Owner&#39;s user ID (default: current user)
   *
   */
  public final String getOwnerId() {
    return this.ownerId;
  }

  /**
   * Get Owner&#39;s user type, which can be 0: user, 1: company
   *
   * @return Owner&#39;s user type, which can be 0: user, 1: company
   *
   */
  public final Number getOwnerType() {
    return this.ownerType;
  }

  /**
   * Get Onshape internal use
   *
   * @return Onshape internal use
   *
   */
  public final String[] getBetaCapabilityIds() {
    return this.betaCapabilityIds;
  }

  /**
   * Get Whether document is public
   *
   * @return Whether document is public
   *
   */
  public final Boolean getIsPublic() {
    return this.isPublic;
  }

  /**
   * Get Onshape internal use
   *
   * @return Onshape internal use
   *
   */
  public final Boolean getIsGenerateUnknownMessages() {
    return this.isGenerateUnknownMessages;
  }

  /**
   * Get Onshape internal use
   *
   * @return Onshape internal use
   *
   */
  public final String[] getTags() {
    return this.tags;
  }

  /**
   * Get custom elements definition to be created with document.
   *
   * @return custom elements definition to be created with document.
   *
   */
  public final DocumentsCreateDocumentRequestElements[] getElements() {
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
     * Document name
     */
    private String name;

    /**
     * Id of a folder to place the created document in
     */
    private String parentId;

    /**
     * Owner&#39;s user ID (default: current user)
     */
    private String ownerId;

    /**
     * Owner&#39;s user type, which can be 0: user, 1: company
     */
    private Number ownerType;

    /**
     * Onshape internal use
     */
    private String[] betaCapabilityIds;

    /**
     * Whether document is public
     */
    private Boolean isPublic;

    /**
     * Onshape internal use
     */
    private Boolean isGenerateUnknownMessages;

    /**
     * Onshape internal use
     */
    private String[] tags;

    /**
     * custom elements definition to be created with document.
     */
    private DocumentsCreateDocumentRequestElements[] elements;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get Document name
     *
     * @return Document name
     *
     */
    public final String name() {
      return this.name;
    }

    /**
     * Set Document name
     *
     * @param value Document name
     *
     * @return the Builder object.
     */
    public final Builder name(String value) {
      this.name = value;
      return this;
    }

    /**
     * Get Id of a folder to place the created document in
     *
     * @return Id of a folder to place the created document in
     *
     */
    public final String parentId() {
      return this.parentId;
    }

    /**
     * Set Id of a folder to place the created document in
     *
     * @param value Id of a folder to place the created document in
     *
     * @return the Builder object.
     */
    public final Builder parentId(String value) {
      this.parentId = value;
      return this;
    }

    /**
     * Get Owner&#39;s user ID (default: current user)
     *
     * @return Owner&#39;s user ID (default: current user)
     *
     */
    public final String ownerId() {
      return this.ownerId;
    }

    /**
     * Set Owner&#39;s user ID (default: current user)
     *
     * @param value Owner&#39;s user ID (default: current user)
     *
     * @return the Builder object.
     */
    public final Builder ownerId(String value) {
      this.ownerId = value;
      return this;
    }

    /**
     * Get Owner&#39;s user type, which can be 0: user, 1: company
     *
     * @return Owner&#39;s user type, which can be 0: user, 1: company
     *
     */
    public final Number ownerType() {
      return this.ownerType;
    }

    /**
     * Set Owner&#39;s user type, which can be 0: user, 1: company
     *
     * @param value Owner&#39;s user type, which can be 0: user, 1: company
     *
     * @return the Builder object.
     */
    public final Builder ownerType(Number value) {
      this.ownerType = value;
      return this;
    }

    /**
     * Get Onshape internal use
     *
     * @return Onshape internal use
     *
     */
    public final String[] betaCapabilityIds() {
      return this.betaCapabilityIds;
    }

    /**
     * Set Onshape internal use
     *
     * @param value Onshape internal use
     *
     * @return the Builder object.
     */
    public final Builder betaCapabilityIds(String[] value) {
      this.betaCapabilityIds = value;
      return this;
    }

    /**
     * Get Whether document is public
     *
     * @return Whether document is public
     *
     */
    public final Boolean isPublic() {
      return this.isPublic;
    }

    /**
     * Set Whether document is public
     *
     * @param value Whether document is public
     *
     * @return the Builder object.
     */
    public final Builder isPublic(Boolean value) {
      this.isPublic = value;
      return this;
    }

    /**
     * Get Onshape internal use
     *
     * @return Onshape internal use
     *
     */
    public final Boolean isGenerateUnknownMessages() {
      return this.isGenerateUnknownMessages;
    }

    /**
     * Set Onshape internal use
     *
     * @param value Onshape internal use
     *
     * @return the Builder object.
     */
    public final Builder isGenerateUnknownMessages(Boolean value) {
      this.isGenerateUnknownMessages = value;
      return this;
    }

    /**
     * Get Onshape internal use
     *
     * @return Onshape internal use
     *
     */
    public final String[] tags() {
      return this.tags;
    }

    /**
     * Set Onshape internal use
     *
     * @param value Onshape internal use
     *
     * @return the Builder object.
     */
    public final Builder tags(String[] value) {
      this.tags = value;
      return this;
    }

    /**
     * Get custom elements definition to be created with document.
     *
     * @return custom elements definition to be created with document.
     *
     */
    public final DocumentsCreateDocumentRequestElements[] elements() {
      return this.elements;
    }

    /**
     * Set custom elements definition to be created with document.
     *
     * @param value custom elements definition to be created with document.
     *
     * @return the Builder object.
     */
    public final Builder elements(DocumentsCreateDocumentRequestElements[] value) {
      this.elements = value;
      return this;
    }

    private DocumentsCreateDocumentRequest build() {
      return new com.onshape.api.requests.DocumentsCreateDocumentRequest(name,parentId,ownerId,ownerType,betaCapabilityIds,isPublic,isGenerateUnknownMessages,tags,elements);
    }

    /**
     * Calls createDocument method, Create document
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     */
    public final DocumentsCreateDocumentResponse call() throws OnshapeException {
      onshape.validate(build());
      return onshape.call("post", "/documents", build(), onshape.buildMap(), onshape.buildMap(), com.onshape.api.responses.DocumentsCreateDocumentResponse.class);
    }
  }
}
