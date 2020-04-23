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

package com.amazonaws.services.amazonpinpoint.model.transform;

import com.amazonaws.services.amazonpinpoint.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO EventCondition
 */
class EventConditionJsonMarshaller {

    public void marshall(EventCondition eventCondition, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (eventCondition.getDimensions() != null) {
            EventDimensions dimensions = eventCondition.getDimensions();
            jsonWriter.name("Dimensions");
            EventDimensionsJsonMarshaller.getInstance().marshall(dimensions, jsonWriter);
        }
        if (eventCondition.getMessageActivity() != null) {
            String messageActivity = eventCondition.getMessageActivity();
            jsonWriter.name("MessageActivity");
            jsonWriter.value(messageActivity);
        }
        jsonWriter.endObject();
    }

    private static EventConditionJsonMarshaller instance;

    public static EventConditionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EventConditionJsonMarshaller();
        return instance;
    }
}