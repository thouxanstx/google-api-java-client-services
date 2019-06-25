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

package com.google.api.services.adexchangebuyer.model;

/**
 * Model definition for UpdatePrivateAuctionProposalRequest.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Ad Exchange Buyer API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UpdatePrivateAuctionProposalRequest extends com.google.api.client.json.GenericJson {

  /**
   * The externalDealId of the deal to be updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String externalDealId;

  /**
   * Optional note to be added.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MarketplaceNote note;

  /**
   * The current revision number of the proposal to be updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long proposalRevisionNumber;

  /**
   * The proposed action on the private auction proposal.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String updateAction;

  /**
   * The externalDealId of the deal to be updated.
   * @return value or {@code null} for none
   */
  public java.lang.String getExternalDealId() {
    return externalDealId;
  }

  /**
   * The externalDealId of the deal to be updated.
   * @param externalDealId externalDealId or {@code null} for none
   */
  public UpdatePrivateAuctionProposalRequest setExternalDealId(java.lang.String externalDealId) {
    this.externalDealId = externalDealId;
    return this;
  }

  /**
   * Optional note to be added.
   * @return value or {@code null} for none
   */
  public MarketplaceNote getNote() {
    return note;
  }

  /**
   * Optional note to be added.
   * @param note note or {@code null} for none
   */
  public UpdatePrivateAuctionProposalRequest setNote(MarketplaceNote note) {
    this.note = note;
    return this;
  }

  /**
   * The current revision number of the proposal to be updated.
   * @return value or {@code null} for none
   */
  public java.lang.Long getProposalRevisionNumber() {
    return proposalRevisionNumber;
  }

  /**
   * The current revision number of the proposal to be updated.
   * @param proposalRevisionNumber proposalRevisionNumber or {@code null} for none
   */
  public UpdatePrivateAuctionProposalRequest setProposalRevisionNumber(java.lang.Long proposalRevisionNumber) {
    this.proposalRevisionNumber = proposalRevisionNumber;
    return this;
  }

  /**
   * The proposed action on the private auction proposal.
   * @return value or {@code null} for none
   */
  public java.lang.String getUpdateAction() {
    return updateAction;
  }

  /**
   * The proposed action on the private auction proposal.
   * @param updateAction updateAction or {@code null} for none
   */
  public UpdatePrivateAuctionProposalRequest setUpdateAction(java.lang.String updateAction) {
    this.updateAction = updateAction;
    return this;
  }

  @Override
  public UpdatePrivateAuctionProposalRequest set(String fieldName, Object value) {
    return (UpdatePrivateAuctionProposalRequest) super.set(fieldName, value);
  }

  @Override
  public UpdatePrivateAuctionProposalRequest clone() {
    return (UpdatePrivateAuctionProposalRequest) super.clone();
  }

}
