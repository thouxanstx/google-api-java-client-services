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
 * The configuration data for an Ad Exchange performance report list.
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
public final class PerformanceReport extends com.google.api.client.json.GenericJson {

  /**
   * The number of bid responses with an ad.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double bidRate;

  /**
   * The number of bid requests sent to your bidder.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double bidRequestRate;

  /**
   * Rate of various prefiltering statuses per match. Please refer to the callout-status-codes.txt
   * file for different statuses.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.Object> calloutStatusRate;

  /**
   * Average QPS for cookie matcher operations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.Object> cookieMatcherStatusRate;

  /**
   * Rate of ads with a given status. Please refer to the creative-status-codes.txt file for
   * different statuses.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.Object> creativeStatusRate;

  /**
   * The number of bid responses that were filtered due to a policy violation or other errors.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double filteredBidRate;

  /**
   * Average QPS for hosted match operations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.Object> hostedMatchStatusRate;

  /**
   * The number of potential queries based on your pretargeting settings.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double inventoryMatchRate;

  /**
   * Resource type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The 50th percentile round trip latency(ms) as perceived from Google servers for the duration
   * period covered by the report.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double latency50thPercentile;

  /**
   * The 85th percentile round trip latency(ms) as perceived from Google servers for the duration
   * period covered by the report.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double latency85thPercentile;

  /**
   * The 95th percentile round trip latency(ms) as perceived from Google servers for the duration
   * period covered by the report.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double latency95thPercentile;

  /**
   * Rate of various quota account statuses per quota check.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double noQuotaInRegion;

  /**
   * Rate of various quota account statuses per quota check.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double outOfQuota;

  /**
   * Average QPS for pixel match requests from clients.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double pixelMatchRequests;

  /**
   * Average QPS for pixel match responses from clients.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double pixelMatchResponses;

  /**
   * The configured quota limits for this account.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double quotaConfiguredLimit;

  /**
   * The throttled quota limits for this account.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double quotaThrottledLimit;

  /**
   * The trading location of this data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String region;

  /**
   * The number of properly formed bid responses received by our servers within the deadline.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double successfulRequestRate;

  /**
   * The unix timestamp of the starting time of this performance data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long timestamp;

  /**
   * The number of bid responses that were unsuccessful due to timeouts, incorrect formatting, etc.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double unsuccessfulRequestRate;

  /**
   * The number of bid responses with an ad.
   * @return value or {@code null} for none
   */
  public java.lang.Double getBidRate() {
    return bidRate;
  }

  /**
   * The number of bid responses with an ad.
   * @param bidRate bidRate or {@code null} for none
   */
  public PerformanceReport setBidRate(java.lang.Double bidRate) {
    this.bidRate = bidRate;
    return this;
  }

  /**
   * The number of bid requests sent to your bidder.
   * @return value or {@code null} for none
   */
  public java.lang.Double getBidRequestRate() {
    return bidRequestRate;
  }

  /**
   * The number of bid requests sent to your bidder.
   * @param bidRequestRate bidRequestRate or {@code null} for none
   */
  public PerformanceReport setBidRequestRate(java.lang.Double bidRequestRate) {
    this.bidRequestRate = bidRequestRate;
    return this;
  }

  /**
   * Rate of various prefiltering statuses per match. Please refer to the callout-status-codes.txt
   * file for different statuses.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Object> getCalloutStatusRate() {
    return calloutStatusRate;
  }

  /**
   * Rate of various prefiltering statuses per match. Please refer to the callout-status-codes.txt
   * file for different statuses.
   * @param calloutStatusRate calloutStatusRate or {@code null} for none
   */
  public PerformanceReport setCalloutStatusRate(java.util.List<java.lang.Object> calloutStatusRate) {
    this.calloutStatusRate = calloutStatusRate;
    return this;
  }

  /**
   * Average QPS for cookie matcher operations.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Object> getCookieMatcherStatusRate() {
    return cookieMatcherStatusRate;
  }

  /**
   * Average QPS for cookie matcher operations.
   * @param cookieMatcherStatusRate cookieMatcherStatusRate or {@code null} for none
   */
  public PerformanceReport setCookieMatcherStatusRate(java.util.List<java.lang.Object> cookieMatcherStatusRate) {
    this.cookieMatcherStatusRate = cookieMatcherStatusRate;
    return this;
  }

  /**
   * Rate of ads with a given status. Please refer to the creative-status-codes.txt file for
   * different statuses.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Object> getCreativeStatusRate() {
    return creativeStatusRate;
  }

  /**
   * Rate of ads with a given status. Please refer to the creative-status-codes.txt file for
   * different statuses.
   * @param creativeStatusRate creativeStatusRate or {@code null} for none
   */
  public PerformanceReport setCreativeStatusRate(java.util.List<java.lang.Object> creativeStatusRate) {
    this.creativeStatusRate = creativeStatusRate;
    return this;
  }

  /**
   * The number of bid responses that were filtered due to a policy violation or other errors.
   * @return value or {@code null} for none
   */
  public java.lang.Double getFilteredBidRate() {
    return filteredBidRate;
  }

  /**
   * The number of bid responses that were filtered due to a policy violation or other errors.
   * @param filteredBidRate filteredBidRate or {@code null} for none
   */
  public PerformanceReport setFilteredBidRate(java.lang.Double filteredBidRate) {
    this.filteredBidRate = filteredBidRate;
    return this;
  }

  /**
   * Average QPS for hosted match operations.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Object> getHostedMatchStatusRate() {
    return hostedMatchStatusRate;
  }

  /**
   * Average QPS for hosted match operations.
   * @param hostedMatchStatusRate hostedMatchStatusRate or {@code null} for none
   */
  public PerformanceReport setHostedMatchStatusRate(java.util.List<java.lang.Object> hostedMatchStatusRate) {
    this.hostedMatchStatusRate = hostedMatchStatusRate;
    return this;
  }

  /**
   * The number of potential queries based on your pretargeting settings.
   * @return value or {@code null} for none
   */
  public java.lang.Double getInventoryMatchRate() {
    return inventoryMatchRate;
  }

  /**
   * The number of potential queries based on your pretargeting settings.
   * @param inventoryMatchRate inventoryMatchRate or {@code null} for none
   */
  public PerformanceReport setInventoryMatchRate(java.lang.Double inventoryMatchRate) {
    this.inventoryMatchRate = inventoryMatchRate;
    return this;
  }

  /**
   * Resource type.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Resource type.
   * @param kind kind or {@code null} for none
   */
  public PerformanceReport setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The 50th percentile round trip latency(ms) as perceived from Google servers for the duration
   * period covered by the report.
   * @return value or {@code null} for none
   */
  public java.lang.Double getLatency50thPercentile() {
    return latency50thPercentile;
  }

  /**
   * The 50th percentile round trip latency(ms) as perceived from Google servers for the duration
   * period covered by the report.
   * @param latency50thPercentile latency50thPercentile or {@code null} for none
   */
  public PerformanceReport setLatency50thPercentile(java.lang.Double latency50thPercentile) {
    this.latency50thPercentile = latency50thPercentile;
    return this;
  }

  /**
   * The 85th percentile round trip latency(ms) as perceived from Google servers for the duration
   * period covered by the report.
   * @return value or {@code null} for none
   */
  public java.lang.Double getLatency85thPercentile() {
    return latency85thPercentile;
  }

  /**
   * The 85th percentile round trip latency(ms) as perceived from Google servers for the duration
   * period covered by the report.
   * @param latency85thPercentile latency85thPercentile or {@code null} for none
   */
  public PerformanceReport setLatency85thPercentile(java.lang.Double latency85thPercentile) {
    this.latency85thPercentile = latency85thPercentile;
    return this;
  }

  /**
   * The 95th percentile round trip latency(ms) as perceived from Google servers for the duration
   * period covered by the report.
   * @return value or {@code null} for none
   */
  public java.lang.Double getLatency95thPercentile() {
    return latency95thPercentile;
  }

  /**
   * The 95th percentile round trip latency(ms) as perceived from Google servers for the duration
   * period covered by the report.
   * @param latency95thPercentile latency95thPercentile or {@code null} for none
   */
  public PerformanceReport setLatency95thPercentile(java.lang.Double latency95thPercentile) {
    this.latency95thPercentile = latency95thPercentile;
    return this;
  }

  /**
   * Rate of various quota account statuses per quota check.
   * @return value or {@code null} for none
   */
  public java.lang.Double getNoQuotaInRegion() {
    return noQuotaInRegion;
  }

  /**
   * Rate of various quota account statuses per quota check.
   * @param noQuotaInRegion noQuotaInRegion or {@code null} for none
   */
  public PerformanceReport setNoQuotaInRegion(java.lang.Double noQuotaInRegion) {
    this.noQuotaInRegion = noQuotaInRegion;
    return this;
  }

  /**
   * Rate of various quota account statuses per quota check.
   * @return value or {@code null} for none
   */
  public java.lang.Double getOutOfQuota() {
    return outOfQuota;
  }

  /**
   * Rate of various quota account statuses per quota check.
   * @param outOfQuota outOfQuota or {@code null} for none
   */
  public PerformanceReport setOutOfQuota(java.lang.Double outOfQuota) {
    this.outOfQuota = outOfQuota;
    return this;
  }

  /**
   * Average QPS for pixel match requests from clients.
   * @return value or {@code null} for none
   */
  public java.lang.Double getPixelMatchRequests() {
    return pixelMatchRequests;
  }

  /**
   * Average QPS for pixel match requests from clients.
   * @param pixelMatchRequests pixelMatchRequests or {@code null} for none
   */
  public PerformanceReport setPixelMatchRequests(java.lang.Double pixelMatchRequests) {
    this.pixelMatchRequests = pixelMatchRequests;
    return this;
  }

  /**
   * Average QPS for pixel match responses from clients.
   * @return value or {@code null} for none
   */
  public java.lang.Double getPixelMatchResponses() {
    return pixelMatchResponses;
  }

  /**
   * Average QPS for pixel match responses from clients.
   * @param pixelMatchResponses pixelMatchResponses or {@code null} for none
   */
  public PerformanceReport setPixelMatchResponses(java.lang.Double pixelMatchResponses) {
    this.pixelMatchResponses = pixelMatchResponses;
    return this;
  }

  /**
   * The configured quota limits for this account.
   * @return value or {@code null} for none
   */
  public java.lang.Double getQuotaConfiguredLimit() {
    return quotaConfiguredLimit;
  }

  /**
   * The configured quota limits for this account.
   * @param quotaConfiguredLimit quotaConfiguredLimit or {@code null} for none
   */
  public PerformanceReport setQuotaConfiguredLimit(java.lang.Double quotaConfiguredLimit) {
    this.quotaConfiguredLimit = quotaConfiguredLimit;
    return this;
  }

  /**
   * The throttled quota limits for this account.
   * @return value or {@code null} for none
   */
  public java.lang.Double getQuotaThrottledLimit() {
    return quotaThrottledLimit;
  }

  /**
   * The throttled quota limits for this account.
   * @param quotaThrottledLimit quotaThrottledLimit or {@code null} for none
   */
  public PerformanceReport setQuotaThrottledLimit(java.lang.Double quotaThrottledLimit) {
    this.quotaThrottledLimit = quotaThrottledLimit;
    return this;
  }

  /**
   * The trading location of this data.
   * @return value or {@code null} for none
   */
  public java.lang.String getRegion() {
    return region;
  }

  /**
   * The trading location of this data.
   * @param region region or {@code null} for none
   */
  public PerformanceReport setRegion(java.lang.String region) {
    this.region = region;
    return this;
  }

  /**
   * The number of properly formed bid responses received by our servers within the deadline.
   * @return value or {@code null} for none
   */
  public java.lang.Double getSuccessfulRequestRate() {
    return successfulRequestRate;
  }

  /**
   * The number of properly formed bid responses received by our servers within the deadline.
   * @param successfulRequestRate successfulRequestRate or {@code null} for none
   */
  public PerformanceReport setSuccessfulRequestRate(java.lang.Double successfulRequestRate) {
    this.successfulRequestRate = successfulRequestRate;
    return this;
  }

  /**
   * The unix timestamp of the starting time of this performance data.
   * @return value or {@code null} for none
   */
  public java.lang.Long getTimestamp() {
    return timestamp;
  }

  /**
   * The unix timestamp of the starting time of this performance data.
   * @param timestamp timestamp or {@code null} for none
   */
  public PerformanceReport setTimestamp(java.lang.Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * The number of bid responses that were unsuccessful due to timeouts, incorrect formatting, etc.
   * @return value or {@code null} for none
   */
  public java.lang.Double getUnsuccessfulRequestRate() {
    return unsuccessfulRequestRate;
  }

  /**
   * The number of bid responses that were unsuccessful due to timeouts, incorrect formatting, etc.
   * @param unsuccessfulRequestRate unsuccessfulRequestRate or {@code null} for none
   */
  public PerformanceReport setUnsuccessfulRequestRate(java.lang.Double unsuccessfulRequestRate) {
    this.unsuccessfulRequestRate = unsuccessfulRequestRate;
    return this;
  }

  @Override
  public PerformanceReport set(String fieldName, Object value) {
    return (PerformanceReport) super.set(fieldName, value);
  }

  @Override
  public PerformanceReport clone() {
    return (PerformanceReport) super.clone();
  }

}
