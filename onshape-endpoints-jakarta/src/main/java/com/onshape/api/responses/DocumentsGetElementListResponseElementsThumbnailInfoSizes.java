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
import java.lang.Override;
import java.lang.String;

/**
 * Object used in calls to getElementList API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class DocumentsGetElementListResponseElementsThumbnailInfoSizes extends AbstractResponseObject {
  /**
   * Size of thumbnail, in wxh format (ex: 70x40)
   */
  @JsonProperty("size")
  public String size;

  /**
   * MIME type of thumbnail, image/png
   */
  @JsonProperty("mediaType")
  public String mediaType;

  /**
   * Thumbnail URL
   */
  @JsonProperty("href")
  public String href;

  /**
   * Get Size of thumbnail, in wxh format (ex: 70x40)
   *
   * @return Size of thumbnail, in wxh format (ex: 70x40)
   *
   */
  public final String getSize() {
    return this.size;
  }

  /**
   * Get MIME type of thumbnail, image/png
   *
   * @return MIME type of thumbnail, image/png
   *
   */
  public final String getMediaType() {
    return this.mediaType;
  }

  /**
   * Get Thumbnail URL
   *
   * @return Thumbnail URL
   *
   */
  public final String getHref() {
    return this.href;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
