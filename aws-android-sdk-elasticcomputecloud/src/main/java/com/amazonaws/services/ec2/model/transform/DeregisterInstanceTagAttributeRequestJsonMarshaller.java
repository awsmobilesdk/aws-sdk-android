/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DeregisterInstanceTagAttributeRequest
 */
class DeregisterInstanceTagAttributeRequestJsonMarshaller {

    public void marshall(
            DeregisterInstanceTagAttributeRequest deregisterInstanceTagAttributeRequest,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (deregisterInstanceTagAttributeRequest.getIncludeAllTagsOfInstance() != null) {
            Boolean includeAllTagsOfInstance = deregisterInstanceTagAttributeRequest
                    .getIncludeAllTagsOfInstance();
            jsonWriter.name("IncludeAllTagsOfInstance");
            jsonWriter.value(includeAllTagsOfInstance);
        }
        if (deregisterInstanceTagAttributeRequest.getInstanceTagKeys() != null) {
            java.util.List<String> instanceTagKeys = deregisterInstanceTagAttributeRequest
                    .getInstanceTagKeys();
            jsonWriter.name("InstanceTagKeys");
            jsonWriter.beginArray();
            for (String instanceTagKeysItem : instanceTagKeys) {
                if (instanceTagKeysItem != null) {
                    jsonWriter.value(instanceTagKeysItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static DeregisterInstanceTagAttributeRequestJsonMarshaller instance;

    public static DeregisterInstanceTagAttributeRequestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DeregisterInstanceTagAttributeRequestJsonMarshaller();
        return instance;
    }
}