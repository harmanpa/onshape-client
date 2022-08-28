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
 * Object used in calls to getAllowedApprovers API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class WorkflowGetAllowedApproversResponseItems extends AbstractResponseObject {
  /**
   * Type of identity: 0=user, 1=team, 2=role, 3=alias
   */
  @JsonProperty("identityType")
  public Number identityType;

  /**
   * The user, if the identity is a user
   */
  @JsonProperty("user")
  public Map user;

  /**
   * The team, if the identity is a team
   */
  @JsonProperty("team")
  public Map team;

  /**
   * The role, if the identity is a role
   */
  @JsonProperty("role")
  public Map role;

  /**
   * The alias, if the identity is an alias
   */
  @JsonProperty("alias")
  public Map alias;

  /**
   * Get Type of identity: 0=user, 1=team, 2=role, 3=alias
   *
   * @return Type of identity: 0=user, 1=team, 2=role, 3=alias
   *
   */
  public final Number getIdentityType() {
    return this.identityType;
  }

  /**
   * Get The user, if the identity is a user
   *
   * @return The user, if the identity is a user
   *
   */
  public final Map getUser() {
    return this.user;
  }

  /**
   * Get The team, if the identity is a team
   *
   * @return The team, if the identity is a team
   *
   */
  public final Map getTeam() {
    return this.team;
  }

  /**
   * Get The role, if the identity is a role
   *
   * @return The role, if the identity is a role
   *
   */
  public final Map getRole() {
    return this.role;
  }

  /**
   * Get The alias, if the identity is an alias
   *
   * @return The alias, if the identity is an alias
   *
   */
  public final Map getAlias() {
    return this.alias;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
