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
import java.lang.Boolean;
import java.lang.Number;
import java.lang.Override;
import java.lang.String;

/**
 * Object used in calls to getNamedViews API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class AssembliesGetNamedViewsResponseNamedViewsValue extends AbstractResponseObject {
  /**
   * A 16-element array storing the view matrix of the view
   */
  @JsonProperty("viewMatrix")
  public Number[] viewMatrix;

  /**
   * Whether or not the view is in perspective mode
   */
  @JsonProperty("perspective")
  public Boolean perspective;

  /**
   * The angle of the view
   */
  @JsonProperty("angle")
  public Number angle;

  /**
   * The viewport of the camera of the view
   */
  @JsonProperty("cameraViewport")
  public Number[] cameraViewport;

  /**
   * An array of objects that represent the section planes in the view
   */
  @JsonProperty("sectionPlanes")
  public AssembliesGetNamedViewsResponseNamedViewsValueSectionPlanes[] sectionPlanes;

  /**
   * Get A 16-element array storing the view matrix of the view
   *
   * @return A 16-element array storing the view matrix of the view
   *
   */
  public final Number[] getViewMatrix() {
    return this.viewMatrix;
  }

  /**
   * Get Whether or not the view is in perspective mode
   *
   * @return Whether or not the view is in perspective mode
   *
   */
  public final Boolean getPerspective() {
    return this.perspective;
  }

  /**
   * Get The angle of the view
   *
   * @return The angle of the view
   *
   */
  public final Number getAngle() {
    return this.angle;
  }

  /**
   * Get The viewport of the camera of the view
   *
   * @return The viewport of the camera of the view
   *
   */
  public final Number[] getCameraViewport() {
    return this.cameraViewport;
  }

  /**
   * Get An array of objects that represent the section planes in the view
   *
   * @return An array of objects that represent the section planes in the view
   *
   */
  public final AssembliesGetNamedViewsResponseNamedViewsValueSectionPlanes[] getSectionPlanes() {
    return this.sectionPlanes;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
