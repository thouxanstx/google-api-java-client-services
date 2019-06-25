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

package com.google.api.services.adexchangebuyer2.v2beta1.model;

/**
 * The number of filtered bids with the specified dimension values, among those filtered due to the
 * requested filtering reason (i.e. creative status), that have the specified detail.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Ad Exchange Buyer API II. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class FilteredBidDetailRow extends com.google.api.client.json.GenericJson {

  /**
   * The number of bids with the specified detail.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MetricValue bidCount;

  /**
   * The ID of the detail. The associated value can be looked up in the dictionary file
   * corresponding to the DetailType in the response message.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer detailId;

  /**
   * The values of all dimensions associated with metric values in this row.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RowDimensions rowDimensions;

  /**
   * The number of bids with the specified detail.
   * @return value or {@code null} for none
   */
  public MetricValue getBidCount() {
    return bidCount;
  }

  /**
   * The number of bids with the specified detail.
   * @param bidCount bidCount or {@code null} for none
   */
  public FilteredBidDetailRow setBidCount(MetricValue bidCount) {
    this.bidCount = bidCount;
    return this;
  }

  /**
   * The ID of the detail. The associated value can be looked up in the dictionary file
   * corresponding to the DetailType in the response message.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getDetailId() {
    return detailId;
  }

  /**
   * The ID of the detail. The associated value can be looked up in the dictionary file
   * corresponding to the DetailType in the response message.
   * @param detailId detailId or {@code null} for none
   */
  public FilteredBidDetailRow setDetailId(java.lang.Integer detailId) {
    this.detailId = detailId;
    return this;
  }

  /**
   * The values of all dimensions associated with metric values in this row.
   * @return value or {@code null} for none
   */
  public RowDimensions getRowDimensions() {
    return rowDimensions;
  }

  /**
   * The values of all dimensions associated with metric values in this row.
   * @param rowDimensions rowDimensions or {@code null} for none
   */
  public FilteredBidDetailRow setRowDimensions(RowDimensions rowDimensions) {
    this.rowDimensions = rowDimensions;
    return this;
  }

  @Override
  public FilteredBidDetailRow set(String fieldName, Object value) {
    return (FilteredBidDetailRow) super.set(fieldName, value);
  }

  @Override
  public FilteredBidDetailRow clone() {
    return (FilteredBidDetailRow) super.clone();
  }

}
