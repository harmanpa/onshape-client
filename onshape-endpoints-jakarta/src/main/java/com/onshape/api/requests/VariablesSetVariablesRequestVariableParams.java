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
 * Object used in calls to setVariables API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class VariablesSetVariablesRequestVariableParams {
  /**
   * variable name
   */
  @JsonProperty("name")
  public String name;

  /**
   * variable type
   */
  @JsonProperty("type")
  public String type;

  /**
   * variable expression
   */
  @JsonProperty("expression")
  public String expression;

  /**
   * variable description
   */
  @JsonProperty("description")
  public String description;

  VariablesSetVariablesRequestVariableParams(String name, String type, String expression,
      String description) {
    this.name = name;
    this.type = type;
    this.expression = expression;
    this.description = description;
  }

  /**
   * Get variable name
   *
   * @return variable name
   *
   */
  public final String getName() {
    return this.name;
  }

  /**
   * Get variable type
   *
   * @return variable type
   *
   */
  public final String getType() {
    return this.type;
  }

  /**
   * Get variable expression
   *
   * @return variable expression
   *
   */
  public final String getExpression() {
    return this.expression;
  }

  /**
   * Get variable description
   *
   * @return variable description
   *
   */
  public final String getDescription() {
    return this.description;
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
     * variable name
     */
    private String name;

    /**
     * variable type
     */
    private String type;

    /**
     * variable expression
     */
    private String expression;

    /**
     * variable description
     */
    private String description;

    Builder() {
    }

    /**
     * Get variable name
     *
     * @return variable name
     *
     */
    public final String name() {
      return this.name;
    }

    /**
     * Set variable name
     *
     * @param value variable name
     *
     * @return the Builder object.
     */
    public final Builder name(String value) {
      this.name = value;
      return this;
    }

    /**
     * Get variable type
     *
     * @return variable type
     *
     */
    public final String type() {
      return this.type;
    }

    /**
     * Set variable type
     *
     * @param value variable type
     *
     * @return the Builder object.
     */
    public final Builder type(String value) {
      this.type = value;
      return this;
    }

    /**
     * Get variable expression
     *
     * @return variable expression
     *
     */
    public final String expression() {
      return this.expression;
    }

    /**
     * Set variable expression
     *
     * @param value variable expression
     *
     * @return the Builder object.
     */
    public final Builder expression(String value) {
      this.expression = value;
      return this;
    }

    /**
     * Get variable description
     *
     * @return variable description
     *
     */
    public final String description() {
      return this.description;
    }

    /**
     * Set variable description
     *
     * @param value variable description
     *
     * @return the Builder object.
     */
    public final Builder description(String value) {
      this.description = value;
      return this;
    }

    public final VariablesSetVariablesRequestVariableParams build() {
      return new com.onshape.api.requests.VariablesSetVariablesRequestVariableParams(name,type,expression,description);
    }
  }
}
