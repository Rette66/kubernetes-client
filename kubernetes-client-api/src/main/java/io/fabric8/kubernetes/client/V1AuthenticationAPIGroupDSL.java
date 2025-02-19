/**
 * Copyright (C) 2015 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.fabric8.kubernetes.client;

import io.fabric8.kubernetes.api.model.authentication.SelfSubjectReview;
import io.fabric8.kubernetes.api.model.authentication.TokenReview;
import io.fabric8.kubernetes.client.dsl.InOutCreateable;

public interface V1AuthenticationAPIGroupDSL extends Client {
  /**
   * API for creating authentication.k8s.io/v1 TokenReviews
   *
   * @return InOutCreateable instance for creating TokenReview object
   */
  InOutCreateable<TokenReview, TokenReview> tokenReviews();

  /**
   * API for creating authentication.k8s.io/v1 SelfSubjectReview
   * <p>
   * SelfSubjectReview contains the user information that the kube-apiserver has about the user making this request.
   * When using impersonation, users will receive the user info of the user being impersonated. If impersonation or
   * request header authentication is used, any extra keys will have their case ignored and returned as lowercase.
   * </p>
   * 
   * @return InOutCreateable instance for creating SelfSubjectReview object
   */
  InOutCreateable<SelfSubjectReview, SelfSubjectReview> selfSubjectReviews();
}
