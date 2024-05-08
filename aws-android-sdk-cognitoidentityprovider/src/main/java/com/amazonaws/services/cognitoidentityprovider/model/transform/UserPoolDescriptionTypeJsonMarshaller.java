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

package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO UserPoolDescriptionType
 */
class UserPoolDescriptionTypeJsonMarshaller {

    public void marshall(UserPoolDescriptionType userPoolDescriptionType, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (userPoolDescriptionType.getId() != null) {
            String id = userPoolDescriptionType.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (userPoolDescriptionType.getName() != null) {
            String name = userPoolDescriptionType.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (userPoolDescriptionType.getLambdaConfig() != null) {
            LambdaConfigType lambdaConfig = userPoolDescriptionType.getLambdaConfig();
            jsonWriter.name("LambdaConfig");
            LambdaConfigTypeJsonMarshaller.getInstance().marshall(lambdaConfig, jsonWriter);
        }
        if (userPoolDescriptionType.getStatus() != null) {
            String status = userPoolDescriptionType.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (userPoolDescriptionType.getLastModifiedDate() != null) {
            java.util.Date lastModifiedDate = userPoolDescriptionType.getLastModifiedDate();
            jsonWriter.name("LastModifiedDate");
            jsonWriter.value(lastModifiedDate);
        }
        if (userPoolDescriptionType.getCreationDate() != null) {
            java.util.Date creationDate = userPoolDescriptionType.getCreationDate();
            jsonWriter.name("CreationDate");
            jsonWriter.value(creationDate);
        }
        jsonWriter.endObject();
    }

    private static UserPoolDescriptionTypeJsonMarshaller instance;

    public static UserPoolDescriptionTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UserPoolDescriptionTypeJsonMarshaller();
        return instance;
    }
}
