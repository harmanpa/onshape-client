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
 * Object used in calls to getVariables API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class VariablesGetVariablesResponseVariableTables extends AbstractResponseObject {
  /**
   * variable studio reference (for non-local variable tables)
   */
  @JsonProperty("variableStudioReference")
  public VariablesGetVariablesResponseVariableTablesVariableStudioReference variableStudioReference;

  /**
   * array of the variables in the variable table
   */
  @JsonProperty("variables")
  public VariablesGetVariablesResponseVariableTablesVariables[] variables;

  /**
   * Get variable studio reference (for non-local variable tables)
   *
   * @return variable studio reference (for non-local variable tables)
   *
   */
  public final VariablesGetVariablesResponseVariableTablesVariableStudioReference getVariableStudioReference() {
    return this.variableStudioReference;
  }

  /**
   * Get array of the variables in the variable table
   *
   * @return array of the variables in the variable table
   *
   */
  public final VariablesGetVariablesResponseVariableTablesVariables[] getVariables() {
    return this.variables;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
