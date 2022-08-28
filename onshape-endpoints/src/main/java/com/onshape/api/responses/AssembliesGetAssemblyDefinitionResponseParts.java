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
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.Map;

/**
 * Object used in calls to getAssemblyDefinition API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class AssembliesGetAssemblyDefinitionResponseParts extends AbstractResponseObject implements ResponseWithDocument {
  /**
   * Document ID of the document containing the part
   */
  @JsonProperty("documentId")
  public String documentId;

  /**
   * Document microversion ID of the document containing the part
   */
  @JsonProperty("documentMicroversion")
  public String documentMicroversion;

  /**
   * Version ID of document containing the part, if reached through one or more version references
   */
  @JsonProperty("documentVersion")
  public String documentVersion;

  /**
   * Element ID
   */
  @JsonProperty("elementId")
  public String elementId;

  /**
   * Deterministic part ID. If the part cannot be resolved, the value will be the empty string. This can happen if a change in the source part studio causes the part that was originally referenced to be missing.
   */
  @JsonProperty("partId")
  public String partId;

  /**
   * Configuration of the Part studio element.
   */
  @JsonProperty("configuration")
  public String configuration;

  /**
   * Type of part body. Current values that are possible are solid, sheet. Others may be added in the future.
   */
  @JsonProperty("bodyType")
  public String bodyType;

  /**
   * Indicates whether the part is Standard Content.
   */
  @JsonProperty("isStandardContent")
  public Boolean isStandardContent;

  /**
   * The revision this part was inserted from, if any
   */
  @JsonProperty("revision")
  public String revision;

  /**
   * The part number, if from a revision
   */
  @JsonProperty("partNumber")
  public String partNumber;

  /**
   * Array of part mate connectors
   */
  @JsonProperty("mateConnectors")
  public Map[] mateConnectors;

  /**
   * Get Document ID of the document containing the part
   *
   * @return Document ID of the document containing the part
   *
   */
  public final String getDocumentId() {
    return this.documentId;
  }

  /**
   * Get Document microversion ID of the document containing the part
   *
   * @return Document microversion ID of the document containing the part
   *
   */
  public final String getDocumentMicroversion() {
    return this.documentMicroversion;
  }

  /**
   * Get Version ID of document containing the part, if reached through one or more version references
   *
   * @return Version ID of document containing the part, if reached through one or more version references
   *
   */
  public final String getDocumentVersion() {
    return this.documentVersion;
  }

  /**
   * Get Element ID
   *
   * @return Element ID
   *
   */
  public final String getElementId() {
    return this.elementId;
  }

  /**
   * Get Deterministic part ID. If the part cannot be resolved, the value will be the empty string. This can happen if a change in the source part studio causes the part that was originally referenced to be missing.
   *
   * @return Deterministic part ID. If the part cannot be resolved, the value will be the empty string. This can happen if a change in the source part studio causes the part that was originally referenced to be missing.
   *
   */
  public final String getPartId() {
    return this.partId;
  }

  /**
   * Get Configuration of the Part studio element.
   *
   * @return Configuration of the Part studio element.
   *
   */
  public final String getConfiguration() {
    return this.configuration;
  }

  /**
   * Get Type of part body. Current values that are possible are solid, sheet. Others may be added in the future.
   *
   * @return Type of part body. Current values that are possible are solid, sheet. Others may be added in the future.
   *
   */
  public final String getBodyType() {
    return this.bodyType;
  }

  /**
   * Get Indicates whether the part is Standard Content.
   *
   * @return Indicates whether the part is Standard Content.
   *
   */
  public final Boolean getIsStandardContent() {
    return this.isStandardContent;
  }

  /**
   * Get The revision this part was inserted from, if any
   *
   * @return The revision this part was inserted from, if any
   *
   */
  public final String getRevision() {
    return this.revision;
  }

  /**
   * Get The part number, if from a revision
   *
   * @return The part number, if from a revision
   *
   */
  public final String getPartNumber() {
    return this.partNumber;
  }

  /**
   * Get Array of part mate connectors
   *
   * @return Array of part mate connectors
   *
   */
  public final Map[] getMateConnectors() {
    return this.mateConnectors;
  }

  /**
   * Returns an OnshapeDocument object that can be used in subsequent calls to the related document
   * @return The OnshapeDocument object.
   */
  @JsonIgnore
  @Override
  public final OnshapeDocument getDocument() {
    return new OnshapeDocument(documentId, null, documentVersion, documentMicroversion, elementId);
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
