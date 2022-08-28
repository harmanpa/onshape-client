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

import com.fasterxml.jackson.annotation.JsonProperty;
import com.onshape.api.Onshape;
import com.onshape.api.types.AbstractResponseObject;
import java.lang.Number;
import java.lang.Override;
import java.lang.String;
import java.util.Map;

/**
 * Object used in calls to getElementsMetadata API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class MetadataGetElementsMetadataResponseItems extends AbstractResponseObject {
  /**
   * Element properties
   */
  @JsonProperty("properties")
  public Map[] properties;

  /**
   * Element id
   */
  @JsonProperty("elementId")
  public String elementId;

  /**
   * Element type
   */
  @JsonProperty("elementType")
  public Number elementType;

  /**
   * Element mime type
   */
  @JsonProperty("mimeType")
  public String mimeType;

  /**
   * Element&#39;s thumbnail
   */
  @JsonProperty("thumbnail")
  public Map thumbnail;

  /**
   * URI of Element metadata
   */
  @JsonProperty("href")
  public String href;

  /**
   * Part list if element is a PartStudio
   */
  @JsonProperty("parts")
  public MetadataGetElementsMetadataResponseItemsParts[] parts;

  /**
   * Get Element properties
   *
   * @return Element properties
   *
   */
  public final Map[] getProperties() {
    return this.properties;
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
   * Get Element type
   *
   * @return Element type
   *
   */
  public final Number getElementType() {
    return this.elementType;
  }

  /**
   * Get Element mime type
   *
   * @return Element mime type
   *
   */
  public final String getMimeType() {
    return this.mimeType;
  }

  /**
   * Get Element&#39;s thumbnail
   *
   * @return Element&#39;s thumbnail
   *
   */
  public final Map getThumbnail() {
    return this.thumbnail;
  }

  /**
   * Get URI of Element metadata
   *
   * @return URI of Element metadata
   *
   */
  public final String getHref() {
    return this.href;
  }

  /**
   * Get Part list if element is a PartStudio
   *
   * @return Part list if element is a PartStudio
   *
   */
  public final MetadataGetElementsMetadataResponseItemsParts[] getParts() {
    return this.parts;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
