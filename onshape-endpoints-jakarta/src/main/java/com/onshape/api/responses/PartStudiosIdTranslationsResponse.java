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
package com.onshape.api.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.onshape.api.Onshape;
import com.onshape.api.types.AbstractResponseObject;
import com.onshape.api.types.OnshapeDocument;
import com.onshape.api.types.ResponseWithDocument;
import jakarta.validation.constraints.NotNull;
import java.lang.Override;
import java.lang.String;

/**
 * Response object for idTranslations API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class PartStudiosIdTranslationsResponse extends AbstractResponseObject implements ResponseWithDocument {
  /**
   * Document id
   */
  @JsonProperty("documentId")
  @NotNull
  String documentId;

  /**
   * Element id
   */
  @JsonProperty("elementId")
  @NotNull
  String elementId;

  /**
   * Source document microversion
   */
  @JsonProperty("sourceDocumentMicroversion")
  @NotNull
  String sourceDocumentMicroversion;

  /**
   * Target document microversion
   */
  @JsonProperty("targetDocumentMicroversion")
  @NotNull
  String targetDocumentMicroversion;

  /**
   * Array of id translation results
   */
  @JsonProperty("ids")
  @NotNull
  PartStudiosIdTranslationsResponseIds[] ids;

  /**
   * Returns an OnshapeDocument object that can be used in subsequent calls to the related document
   * @return The OnshapeDocument object.
   */
  @JsonIgnore
  @Override
  public final OnshapeDocument getDocument() {
    return new OnshapeDocument(documentId, null, null, null, elementId);
  }

  /**
   * Get Document id
   *
   * @return Document id
   *
   */
  public final String getDocumentId() {
    return this.documentId;
  }

  /**
   * Get Element id
   *
   * @return Element id
   *
   */
  public final String getElementId() {
    return this.elementId;
  }

  /**
   * Get Source document microversion
   *
   * @return Source document microversion
   *
   */
  public final String getSourceDocumentMicroversion() {
    return this.sourceDocumentMicroversion;
  }

  /**
   * Get Target document microversion
   *
   * @return Target document microversion
   *
   */
  public final String getTargetDocumentMicroversion() {
    return this.targetDocumentMicroversion;
  }

  /**
   * Get Array of id translation results
   *
   * @return Array of id translation results
   *
   */
  public final PartStudiosIdTranslationsResponseIds[] getIds() {
    return this.ids;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
