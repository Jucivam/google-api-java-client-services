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

package com.google.api.services.documentai.v1.model;

/**
 * Request message for review document method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Document AI API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDocumentaiV1ReviewDocumentRequest extends com.google.api.client.json.GenericJson {

  /**
   * An inline document proto.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDocumentaiV1Document inlineDocument;

  /**
   * An inline document proto.
   * @return value or {@code null} for none
   */
  public GoogleCloudDocumentaiV1Document getInlineDocument() {
    return inlineDocument;
  }

  /**
   * An inline document proto.
   * @param inlineDocument inlineDocument or {@code null} for none
   */
  public GoogleCloudDocumentaiV1ReviewDocumentRequest setInlineDocument(GoogleCloudDocumentaiV1Document inlineDocument) {
    this.inlineDocument = inlineDocument;
    return this;
  }

  @Override
  public GoogleCloudDocumentaiV1ReviewDocumentRequest set(String fieldName, Object value) {
    return (GoogleCloudDocumentaiV1ReviewDocumentRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDocumentaiV1ReviewDocumentRequest clone() {
    return (GoogleCloudDocumentaiV1ReviewDocumentRequest) super.clone();
  }

}
