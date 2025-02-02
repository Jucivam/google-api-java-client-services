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

package com.google.api.services.managedidentities.v1beta1.model;

/**
 * SloMetadata contains resources required for proper SLO classification of the instance.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Managed Service for Microsoft Active Directory API.
 * For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudSaasacceleratorManagementProvidersV1SloMetadata extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Global per-instance SLI eligibility which applies to all defined SLIs. Exactly one of
   * 'eligibility' and 'per_sli_eligibility' fields must be used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudSaasacceleratorManagementProvidersV1SloEligibility eligibility;

  /**
   * List of SLO exclusion windows. When multiple entries in the list match (matching the exclusion
   * time-window against current time point) the exclusion reason used in the first matching entry
   * will be published. It is not needed to include expired exclusion in this list, as only the
   * currently applicable exclusions are taken into account by the eligibility exporting subsystem
   * (the historical state of exclusions will be reflected in the historically produced timeseries
   * regardless of the current state). This field can be used to mark the instance as temporary
   * ineligible for the purpose of SLO calculation. For permanent instance SLO exclusion, use of
   * custom instance eligibility is recommended. See 'eligibility' field below.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudSaasacceleratorManagementProvidersV1SloExclusion> exclusions;

  static {
    // hack to force ProGuard to consider GoogleCloudSaasacceleratorManagementProvidersV1SloExclusion used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudSaasacceleratorManagementProvidersV1SloExclusion.class);
  }

  /**
   * Optional. List of nodes. Some producers need to use per-node metadata to calculate SLO. This
   * field allows such producers to publish per-node SLO meta data, which will be consumed by SSA
   * Eligibility Exporter and published in the form of per node metric to Monarch.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudSaasacceleratorManagementProvidersV1NodeSloMetadata> nodes;

  static {
    // hack to force ProGuard to consider GoogleCloudSaasacceleratorManagementProvidersV1NodeSloMetadata used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudSaasacceleratorManagementProvidersV1NodeSloMetadata.class);
  }

  /**
   * Optional. Multiple per-instance SLI eligibilities which apply for individual SLIs. Exactly one
   * of 'eligibility' and 'per_sli_eligibility' fields must be used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudSaasacceleratorManagementProvidersV1PerSliSloEligibility perSliEligibility;

  /**
   * Name of the SLO tier the Instance belongs to. This name will be expected to match the tiers
   * specified in the service SLO configuration. Field is mandatory and must not be empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tier;

  /**
   * Optional. Global per-instance SLI eligibility which applies to all defined SLIs. Exactly one of
   * 'eligibility' and 'per_sli_eligibility' fields must be used.
   * @return value or {@code null} for none
   */
  public GoogleCloudSaasacceleratorManagementProvidersV1SloEligibility getEligibility() {
    return eligibility;
  }

  /**
   * Optional. Global per-instance SLI eligibility which applies to all defined SLIs. Exactly one of
   * 'eligibility' and 'per_sli_eligibility' fields must be used.
   * @param eligibility eligibility or {@code null} for none
   */
  public GoogleCloudSaasacceleratorManagementProvidersV1SloMetadata setEligibility(GoogleCloudSaasacceleratorManagementProvidersV1SloEligibility eligibility) {
    this.eligibility = eligibility;
    return this;
  }

  /**
   * List of SLO exclusion windows. When multiple entries in the list match (matching the exclusion
   * time-window against current time point) the exclusion reason used in the first matching entry
   * will be published. It is not needed to include expired exclusion in this list, as only the
   * currently applicable exclusions are taken into account by the eligibility exporting subsystem
   * (the historical state of exclusions will be reflected in the historically produced timeseries
   * regardless of the current state). This field can be used to mark the instance as temporary
   * ineligible for the purpose of SLO calculation. For permanent instance SLO exclusion, use of
   * custom instance eligibility is recommended. See 'eligibility' field below.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudSaasacceleratorManagementProvidersV1SloExclusion> getExclusions() {
    return exclusions;
  }

  /**
   * List of SLO exclusion windows. When multiple entries in the list match (matching the exclusion
   * time-window against current time point) the exclusion reason used in the first matching entry
   * will be published. It is not needed to include expired exclusion in this list, as only the
   * currently applicable exclusions are taken into account by the eligibility exporting subsystem
   * (the historical state of exclusions will be reflected in the historically produced timeseries
   * regardless of the current state). This field can be used to mark the instance as temporary
   * ineligible for the purpose of SLO calculation. For permanent instance SLO exclusion, use of
   * custom instance eligibility is recommended. See 'eligibility' field below.
   * @param exclusions exclusions or {@code null} for none
   */
  public GoogleCloudSaasacceleratorManagementProvidersV1SloMetadata setExclusions(java.util.List<GoogleCloudSaasacceleratorManagementProvidersV1SloExclusion> exclusions) {
    this.exclusions = exclusions;
    return this;
  }

  /**
   * Optional. List of nodes. Some producers need to use per-node metadata to calculate SLO. This
   * field allows such producers to publish per-node SLO meta data, which will be consumed by SSA
   * Eligibility Exporter and published in the form of per node metric to Monarch.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudSaasacceleratorManagementProvidersV1NodeSloMetadata> getNodes() {
    return nodes;
  }

  /**
   * Optional. List of nodes. Some producers need to use per-node metadata to calculate SLO. This
   * field allows such producers to publish per-node SLO meta data, which will be consumed by SSA
   * Eligibility Exporter and published in the form of per node metric to Monarch.
   * @param nodes nodes or {@code null} for none
   */
  public GoogleCloudSaasacceleratorManagementProvidersV1SloMetadata setNodes(java.util.List<GoogleCloudSaasacceleratorManagementProvidersV1NodeSloMetadata> nodes) {
    this.nodes = nodes;
    return this;
  }

  /**
   * Optional. Multiple per-instance SLI eligibilities which apply for individual SLIs. Exactly one
   * of 'eligibility' and 'per_sli_eligibility' fields must be used.
   * @return value or {@code null} for none
   */
  public GoogleCloudSaasacceleratorManagementProvidersV1PerSliSloEligibility getPerSliEligibility() {
    return perSliEligibility;
  }

  /**
   * Optional. Multiple per-instance SLI eligibilities which apply for individual SLIs. Exactly one
   * of 'eligibility' and 'per_sli_eligibility' fields must be used.
   * @param perSliEligibility perSliEligibility or {@code null} for none
   */
  public GoogleCloudSaasacceleratorManagementProvidersV1SloMetadata setPerSliEligibility(GoogleCloudSaasacceleratorManagementProvidersV1PerSliSloEligibility perSliEligibility) {
    this.perSliEligibility = perSliEligibility;
    return this;
  }

  /**
   * Name of the SLO tier the Instance belongs to. This name will be expected to match the tiers
   * specified in the service SLO configuration. Field is mandatory and must not be empty.
   * @return value or {@code null} for none
   */
  public java.lang.String getTier() {
    return tier;
  }

  /**
   * Name of the SLO tier the Instance belongs to. This name will be expected to match the tiers
   * specified in the service SLO configuration. Field is mandatory and must not be empty.
   * @param tier tier or {@code null} for none
   */
  public GoogleCloudSaasacceleratorManagementProvidersV1SloMetadata setTier(java.lang.String tier) {
    this.tier = tier;
    return this;
  }

  @Override
  public GoogleCloudSaasacceleratorManagementProvidersV1SloMetadata set(String fieldName, Object value) {
    return (GoogleCloudSaasacceleratorManagementProvidersV1SloMetadata) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudSaasacceleratorManagementProvidersV1SloMetadata clone() {
    return (GoogleCloudSaasacceleratorManagementProvidersV1SloMetadata) super.clone();
  }

}
