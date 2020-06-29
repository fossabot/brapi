/*
 * See the NOTICE file distributed with this work for additional information
 * regarding copyright ownership.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.brapi.v2.core.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;

/**
 * Person
 */
@Data
@SuperBuilder
@NoArgsConstructor
public class BrApiPerson {
  private String personDbId;

  @Valid
  private Map<String, String> additionalInfo;

  private String description;

  private String emailAddress;

  private List<BrApiExternalReference> externalReferences;

  private String firstName;

  private String lastName;

  private String mailingAddress;

  private String middleName;

  private String phoneNumber;

  private String userID;

}
