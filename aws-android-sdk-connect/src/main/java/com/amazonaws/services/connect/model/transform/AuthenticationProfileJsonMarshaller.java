/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AuthenticationProfile
 */
class AuthenticationProfileJsonMarshaller {

    public void marshall(AuthenticationProfile authenticationProfile, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (authenticationProfile.getId() != null) {
            String id = authenticationProfile.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (authenticationProfile.getArn() != null) {
            String arn = authenticationProfile.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (authenticationProfile.getName() != null) {
            String name = authenticationProfile.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (authenticationProfile.getDescription() != null) {
            String description = authenticationProfile.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (authenticationProfile.getAllowedIps() != null) {
            java.util.List<String> allowedIps = authenticationProfile.getAllowedIps();
            jsonWriter.name("AllowedIps");
            jsonWriter.beginArray();
            for (String allowedIpsItem : allowedIps) {
                if (allowedIpsItem != null) {
                    jsonWriter.value(allowedIpsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (authenticationProfile.getBlockedIps() != null) {
            java.util.List<String> blockedIps = authenticationProfile.getBlockedIps();
            jsonWriter.name("BlockedIps");
            jsonWriter.beginArray();
            for (String blockedIpsItem : blockedIps) {
                if (blockedIpsItem != null) {
                    jsonWriter.value(blockedIpsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (authenticationProfile.getIsDefault() != null) {
            Boolean isDefault = authenticationProfile.getIsDefault();
            jsonWriter.name("IsDefault");
            jsonWriter.value(isDefault);
        }
        if (authenticationProfile.getCreatedTime() != null) {
            java.util.Date createdTime = authenticationProfile.getCreatedTime();
            jsonWriter.name("CreatedTime");
            jsonWriter.value(createdTime);
        }
        if (authenticationProfile.getLastModifiedTime() != null) {
            java.util.Date lastModifiedTime = authenticationProfile.getLastModifiedTime();
            jsonWriter.name("LastModifiedTime");
            jsonWriter.value(lastModifiedTime);
        }
        if (authenticationProfile.getLastModifiedRegion() != null) {
            String lastModifiedRegion = authenticationProfile.getLastModifiedRegion();
            jsonWriter.name("LastModifiedRegion");
            jsonWriter.value(lastModifiedRegion);
        }
        if (authenticationProfile.getPeriodicSessionDuration() != null) {
            Integer periodicSessionDuration = authenticationProfile.getPeriodicSessionDuration();
            jsonWriter.name("PeriodicSessionDuration");
            jsonWriter.value(periodicSessionDuration);
        }
        if (authenticationProfile.getMaxSessionDuration() != null) {
            Integer maxSessionDuration = authenticationProfile.getMaxSessionDuration();
            jsonWriter.name("MaxSessionDuration");
            jsonWriter.value(maxSessionDuration);
        }
        jsonWriter.endObject();
    }

    private static AuthenticationProfileJsonMarshaller instance;

    public static AuthenticationProfileJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AuthenticationProfileJsonMarshaller();
        return instance;
    }
}
