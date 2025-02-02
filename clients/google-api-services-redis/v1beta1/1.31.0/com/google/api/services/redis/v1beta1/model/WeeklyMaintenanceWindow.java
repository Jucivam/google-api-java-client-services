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

package com.google.api.services.redis.v1beta1.model;

/**
 * Time window in which disruptive maintenance updates occur. Non-disruptive updates can occur
 * inside or outside this window.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Cloud Memorystore for Redis API. For a
 * detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class WeeklyMaintenanceWindow extends com.google.api.client.json.GenericJson {

  /**
   * Required. The day of week that maintenance updates occur.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String day;

  /**
   * Output only. Duration of the maintenance window. The current window is fixed at 3 hours.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String duration;

  /**
   * Required. Start time of the window in UTC time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TimeOfDay startTime;

  /**
   * Required. The day of week that maintenance updates occur.
   * @return value or {@code null} for none
   */
  public java.lang.String getDay() {
    return day;
  }

  /**
   * Required. The day of week that maintenance updates occur.
   * @param day day or {@code null} for none
   */
  public WeeklyMaintenanceWindow setDay(java.lang.String day) {
    this.day = day;
    return this;
  }

  /**
   * Output only. Duration of the maintenance window. The current window is fixed at 3 hours.
   * @return value or {@code null} for none
   */
  public String getDuration() {
    return duration;
  }

  /**
   * Output only. Duration of the maintenance window. The current window is fixed at 3 hours.
   * @param duration duration or {@code null} for none
   */
  public WeeklyMaintenanceWindow setDuration(String duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Required. Start time of the window in UTC time.
   * @return value or {@code null} for none
   */
  public TimeOfDay getStartTime() {
    return startTime;
  }

  /**
   * Required. Start time of the window in UTC time.
   * @param startTime startTime or {@code null} for none
   */
  public WeeklyMaintenanceWindow setStartTime(TimeOfDay startTime) {
    this.startTime = startTime;
    return this;
  }

  @Override
  public WeeklyMaintenanceWindow set(String fieldName, Object value) {
    return (WeeklyMaintenanceWindow) super.set(fieldName, value);
  }

  @Override
  public WeeklyMaintenanceWindow clone() {
    return (WeeklyMaintenanceWindow) super.clone();
  }

}
