/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.realtimebidding.v1alpha.model;

/**
 * The bidding function to be executed as part of the TURTLEDOVE simulation experiment bidding flow.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Real-time Bidding API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BiddingFunction extends com.google.api.client.json.GenericJson {

  /**
   * The raw Javascript source code of the bidding function.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String biddingFunction;

  /**
   * The name of the bidding function that must follow the pattern:
   * `bidders/{bidder_account_id}/biddingFunctions/{bidding_function_name}`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The type of the bidding function to be created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The raw Javascript source code of the bidding function.
   * @return value or {@code null} for none
   */
  public java.lang.String getBiddingFunction() {
    return biddingFunction;
  }

  /**
   * The raw Javascript source code of the bidding function.
   * @param biddingFunction biddingFunction or {@code null} for none
   */
  public BiddingFunction setBiddingFunction(java.lang.String biddingFunction) {
    this.biddingFunction = biddingFunction;
    return this;
  }

  /**
   * The name of the bidding function that must follow the pattern:
   * `bidders/{bidder_account_id}/biddingFunctions/{bidding_function_name}`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the bidding function that must follow the pattern:
   * `bidders/{bidder_account_id}/biddingFunctions/{bidding_function_name}`.
   * @param name name or {@code null} for none
   */
  public BiddingFunction setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The type of the bidding function to be created.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type of the bidding function to be created.
   * @param type type or {@code null} for none
   */
  public BiddingFunction setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public BiddingFunction set(String fieldName, Object value) {
    return (BiddingFunction) super.set(fieldName, value);
  }

  @Override
  public BiddingFunction clone() {
    return (BiddingFunction) super.clone();
  }

}
