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

package com.amazonaws.services.glue.model.transform;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DynamoDBTarget
 */
class DynamoDBTargetJsonMarshaller {

    public void marshall(DynamoDBTarget dynamoDBTarget, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (dynamoDBTarget.getPath() != null) {
            String path = dynamoDBTarget.getPath();
            jsonWriter.name("Path");
            jsonWriter.value(path);
        }
        if (dynamoDBTarget.getScanAll() != null) {
            Boolean scanAll = dynamoDBTarget.getScanAll();
            jsonWriter.name("scanAll");
            jsonWriter.value(scanAll);
        }
        if (dynamoDBTarget.getScanRate() != null) {
            Double scanRate = dynamoDBTarget.getScanRate();
            jsonWriter.name("scanRate");
            jsonWriter.value(scanRate);
        }
        jsonWriter.endObject();
    }

    private static DynamoDBTargetJsonMarshaller instance;

    public static DynamoDBTargetJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DynamoDBTargetJsonMarshaller();
        return instance;
    }
}
