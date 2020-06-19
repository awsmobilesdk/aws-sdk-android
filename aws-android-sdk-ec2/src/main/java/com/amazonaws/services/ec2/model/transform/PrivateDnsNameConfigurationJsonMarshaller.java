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
 * JSON marshaller for POJO PrivateDnsNameConfiguration
 */
class PrivateDnsNameConfigurationJsonMarshaller {

    public void marshall(PrivateDnsNameConfiguration privateDnsNameConfiguration,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (privateDnsNameConfiguration.getState() != null) {
            String state = privateDnsNameConfiguration.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (privateDnsNameConfiguration.getType() != null) {
            String type = privateDnsNameConfiguration.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (privateDnsNameConfiguration.getValue() != null) {
            String value = privateDnsNameConfiguration.getValue();
            jsonWriter.name("Value");
            jsonWriter.value(value);
        }
        if (privateDnsNameConfiguration.getName() != null) {
            String name = privateDnsNameConfiguration.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        jsonWriter.endObject();
    }

    private static PrivateDnsNameConfigurationJsonMarshaller instance;

    public static PrivateDnsNameConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PrivateDnsNameConfigurationJsonMarshaller();
        return instance;
    }
}
