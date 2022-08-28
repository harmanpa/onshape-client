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
import java.lang.Override;
import java.lang.String;

/**
 * Object used in calls to revertUnchangedToRevisions API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class DocumentsRevertUnchangedToRevisionsRequestElements {
  /**
   * Element id
   */
  @JsonProperty("elementId")
  public String elementId;

  /**
   * Configuration
   */
  @JsonProperty("configuration")
  public String configuration;

  /**
   * Reference ids; if empty, will check all references
   */
  @JsonProperty("referenceIds")
  public String[] referenceIds;

  DocumentsRevertUnchangedToRevisionsRequestElements(String elementId, String configuration,
      String[] referenceIds) {
    this.elementId = elementId;
    this.configuration = configuration;
    this.referenceIds = referenceIds;
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
   * Get Configuration
   *
   * @return Configuration
   *
   */
  public final String getConfiguration() {
    return this.configuration;
  }

  /**
   * Get Reference ids; if empty, will check all references
   *
   * @return Reference ids; if empty, will check all references
   *
   */
  public final String[] getReferenceIds() {
    return this.referenceIds;
  }

  public static final Builder builder() {
    Builder builder = new Builder();
    return builder;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }

  public static final class Builder {
    /**
     * Element id
     */
    private String elementId;

    /**
     * Configuration
     */
    private String configuration;

    /**
     * Reference ids; if empty, will check all references
     */
    private String[] referenceIds;

    Builder() {
    }

    /**
     * Get Element id
     *
     * @return Element id
     *
     */
    public final String elementId() {
      return this.elementId;
    }

    /**
     * Set Element id
     *
     * @param value Element id
     *
     * @return the Builder object.
     */
    public final Builder elementId(String value) {
      this.elementId = value;
      return this;
    }

    /**
     * Get Configuration
     *
     * @return Configuration
     *
     */
    public final String configuration() {
      return this.configuration;
    }

    /**
     * Set Configuration
     *
     * @param value Configuration
     *
     * @return the Builder object.
     */
    public final Builder configuration(String value) {
      this.configuration = value;
      return this;
    }

    /**
     * Get Reference ids; if empty, will check all references
     *
     * @return Reference ids; if empty, will check all references
     *
     */
    public final String[] referenceIds() {
      return this.referenceIds;
    }

    /**
     * Set Reference ids; if empty, will check all references
     *
     * @param value Reference ids; if empty, will check all references
     *
     * @return the Builder object.
     */
    public final Builder referenceIds(String[] value) {
      this.referenceIds = value;
      return this;
    }

    public final DocumentsRevertUnchangedToRevisionsRequestElements build() {
      return new com.onshape.api.requests.DocumentsRevertUnchangedToRevisionsRequestElements(elementId,configuration,referenceIds);
    }
  }
}
