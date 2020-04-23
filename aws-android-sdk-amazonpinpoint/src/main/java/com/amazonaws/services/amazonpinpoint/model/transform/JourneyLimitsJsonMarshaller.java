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
 * JSON marshaller for POJO JourneyLimits
 */
class JourneyLimitsJsonMarshaller {

    public void marshall(JourneyLimits journeyLimits, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (journeyLimits.getDailyCap() != null) {
            Integer dailyCap = journeyLimits.getDailyCap();
            jsonWriter.name("DailyCap");
            jsonWriter.value(dailyCap);
        }
        if (journeyLimits.getEndpointReentryCap() != null) {
            Integer endpointReentryCap = journeyLimits.getEndpointReentryCap();
            jsonWriter.name("EndpointReentryCap");
            jsonWriter.value(endpointReentryCap);
        }
        if (journeyLimits.getMessagesPerSecond() != null) {
            Integer messagesPerSecond = journeyLimits.getMessagesPerSecond();
            jsonWriter.name("MessagesPerSecond");
            jsonWriter.value(messagesPerSecond);
        }
        jsonWriter.endObject();
    }

    private static JourneyLimitsJsonMarshaller instance;

    public static JourneyLimitsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new JourneyLimitsJsonMarshaller();
        return instance;
    }
}