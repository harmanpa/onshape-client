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
import jakarta.validation.constraints.NotNull;
import java.lang.Number;
import java.lang.Override;
import java.lang.String;

/**
 * Response object for consumePurchase API endpoint.
 * &copy; 2018-Present Onshape Inc.
 */
public final class AccountsConsumePurchaseResponse extends AbstractResponseObject {
  /**
   * Purchase Id
   */
  @JsonProperty("id")
  @NotNull
  String id;

  /**
   * User Ids
   */
  @JsonProperty("userIds")
  @NotNull
  String[] userIds;

  /**
   * Consumed Ids
   */
  @JsonProperty("consumedIds")
  @NotNull
  String[] consumedIds;

  /**
   * Number of seats
   */
  @JsonProperty("seats")
  @NotNull
  Number seats;

  /**
   * Account id
   */
  @JsonProperty("accountId")
  @NotNull
  String accountId;

  /**
   * Plan id
   */
  @JsonProperty("planId")
  @NotNull
  String planId;

  /**
   * Plan type (0-RECURRING, 1-CONSUMABLE, 2-ONE_TIME)
   */
  @JsonProperty("planType")
  @NotNull
  Number planType;

  /**
   * Plan name
   */
  @JsonProperty("planName")
  @NotNull
  String planName;

  /**
   * Group
   */
  @JsonProperty("group")
  @NotNull
  String group;

  /**
   * Application Id
   */
  @JsonProperty("applicationId")
  @NotNull
  String applicationId;

  /**
   * Purchase state (1-DELETED, 2-CANCELED, 3-UNPAID, 4-PAST_DUE, 5-TRIALING, 6-ACTIVE, 7-CONSUMED)
   */
  @JsonProperty("state")
  @NotNull
  Number state;

  /**
   * Purchase canceled at
   */
  @JsonProperty("canceledAt")
  @NotNull
  String canceledAt;

  /**
   * Subscription end at
   */
  @JsonProperty("subscriptionEndAt")
  @NotNull
  String subscriptionEndAt;

  /**
   * Amount cents
   */
  @JsonProperty("amountCents")
  @NotNull
  Number amountCents;

  /**
   * Card information
   */
  @JsonProperty("card")
  @NotNull
  AccountsConsumePurchaseResponseCard card;

  /**
   * Get Purchase Id
   *
   * @return Purchase Id
   *
   */
  public final String getId() {
    return this.id;
  }

  /**
   * Get User Ids
   *
   * @return User Ids
   *
   */
  public final String[] getUserIds() {
    return this.userIds;
  }

  /**
   * Get Consumed Ids
   *
   * @return Consumed Ids
   *
   */
  public final String[] getConsumedIds() {
    return this.consumedIds;
  }

  /**
   * Get Number of seats
   *
   * @return Number of seats
   *
   */
  public final Number getSeats() {
    return this.seats;
  }

  /**
   * Get Account id
   *
   * @return Account id
   *
   */
  public final String getAccountId() {
    return this.accountId;
  }

  /**
   * Get Plan id
   *
   * @return Plan id
   *
   */
  public final String getPlanId() {
    return this.planId;
  }

  /**
   * Get Plan type (0-RECURRING, 1-CONSUMABLE, 2-ONE_TIME)
   *
   * @return Plan type (0-RECURRING, 1-CONSUMABLE, 2-ONE_TIME)
   *
   */
  public final Number getPlanType() {
    return this.planType;
  }

  /**
   * Get Plan name
   *
   * @return Plan name
   *
   */
  public final String getPlanName() {
    return this.planName;
  }

  /**
   * Get Group
   *
   * @return Group
   *
   */
  public final String getGroup() {
    return this.group;
  }

  /**
   * Get Application Id
   *
   * @return Application Id
   *
   */
  public final String getApplicationId() {
    return this.applicationId;
  }

  /**
   * Get Purchase state (1-DELETED, 2-CANCELED, 3-UNPAID, 4-PAST_DUE, 5-TRIALING, 6-ACTIVE, 7-CONSUMED)
   *
   * @return Purchase state (1-DELETED, 2-CANCELED, 3-UNPAID, 4-PAST_DUE, 5-TRIALING, 6-ACTIVE, 7-CONSUMED)
   *
   */
  public final Number getState() {
    return this.state;
  }

  /**
   * Get Purchase canceled at
   *
   * @return Purchase canceled at
   *
   */
  public final String getCanceledAt() {
    return this.canceledAt;
  }

  /**
   * Get Subscription end at
   *
   * @return Subscription end at
   *
   */
  public final String getSubscriptionEndAt() {
    return this.subscriptionEndAt;
  }

  /**
   * Get Amount cents
   *
   * @return Amount cents
   *
   */
  public final Number getAmountCents() {
    return this.amountCents;
  }

  /**
   * Get Card information
   *
   * @return Card information
   *
   */
  public final AccountsConsumePurchaseResponseCard getCard() {
    return this.card;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
