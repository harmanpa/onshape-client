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
 * Object used in calls to getVariables API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class VariablesGetVariablesResponseVariableTablesVariables extends AbstractResponseObject {
  /**
   * variable name
   */
  @JsonProperty("name")
  public String[] name;

  /**
   * variable type
   */
  @JsonProperty("type")
  public Map[] type;

  /**
   * variable expression
   */
  @JsonProperty("expression")
  public Map[] expression;

  /**
   * variable value (when requested)
   */
  @JsonProperty("value")
  public Map[] value;

  /**
   * variable description
   */
  @JsonProperty("description")
  public Map[] description;

  /**
   * Get variable name
   *
   * @return variable name
   *
   */
  public final String[] getName() {
    return this.name;
  }

  /**
   * Get variable type
   *
   * @return variable type
   *
   */
  public final Map[] getType() {
    return this.type;
  }

  /**
   * Get variable expression
   *
   * @return variable expression
   *
   */
  public final Map[] getExpression() {
    return this.expression;
  }

  /**
   * Get variable value (when requested)
   *
   * @return variable value (when requested)
   *
   */
  public final Map[] getValue() {
    return this.value;
  }

  /**
   * Get variable description
   *
   * @return variable description
   *
   */
  public final Map[] getDescription() {
    return this.description;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
