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
import java.util.Map;

/**
 * Object used in calls to getAuditLog API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class WorkflowGetAuditLogResponseEntriesPropertyUpdates extends AbstractResponseObject {
  /**
   * Property id that was changed
   */
  @JsonProperty("propertyId")
  public String propertyId;

  /**
   * Old value of the property
   */
  @JsonProperty("oldValue")
  public Map oldValue;

  /**
   * New value of the property
   */
  @JsonProperty("newValue")
  public Map newValue;

  /**
   * Get Property id that was changed
   *
   * @return Property id that was changed
   *
   */
  public final String getPropertyId() {
    return this.propertyId;
  }

  /**
   * Get Old value of the property
   *
   * @return Old value of the property
   *
   */
  public final Map getOldValue() {
    return this.oldValue;
  }

  /**
   * Get New value of the property
   *
   * @return New value of the property
   *
   */
  public final Map getNewValue() {
    return this.newValue;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
