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
package io.fabric8.kubernetes.client.impl;

import io.fabric8.kubernetes.api.model.authentication.SelfSubjectReview;
import io.fabric8.kubernetes.api.model.authentication.TokenReview;
import io.fabric8.kubernetes.client.V1AuthenticationAPIGroupDSL;
import io.fabric8.kubernetes.client.dsl.InOutCreateable;
import io.fabric8.kubernetes.client.extension.ClientAdapter;

public class V1AuthenticationAPIGroupClient extends ClientAdapter<V1AuthenticationAPIGroupClient>
    implements V1AuthenticationAPIGroupDSL {
  @Override
  public InOutCreateable<TokenReview, TokenReview> tokenReviews() {
    return getClient().adapt(BaseClient.class).getHandlers().getNonListingOperation(TokenReview.class, this);
  }

  @Override
  public InOutCreateable<SelfSubjectReview, SelfSubjectReview> selfSubjectReviews() {
    return getClient().adapt(BaseClient.class).getHandlers().getNonListingOperation(SelfSubjectReview.class, this);
  }

  @Override
  public V1AuthenticationAPIGroupClient newInstance() {
    return new V1AuthenticationAPIGroupClient();
  }
}
