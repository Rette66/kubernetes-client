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

package io.fabric8.kubernetes.client.server.mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class OutputStreamMessageTest {

  private OutputStreamMessage message;

  @BeforeEach
  void setUp() {
    message = new OutputStreamMessage("foobar");
  }

  @Test
  void isBinaryReturnsTrue() {
    assertThat(message.isBinary()).isTrue();
  }

  @Test
  void isToBeRemovedReturnsTrue() {
    assertThat(message.isToBeRemoved()).isTrue();
  }

  @Test
  void bodyStartsWithOutStreamId() {
    assertThat(message.getBytes()).startsWith(1);
  }

  @Test
  void bodyContainsMessage() {
    assertThat(message.getBody().substring(1)).isEqualTo("foobar");
  }
}
