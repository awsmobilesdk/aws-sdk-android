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
 * JSON marshaller for POJO WaitActivity
 */
class WaitActivityJsonMarshaller {

    public void marshall(WaitActivity waitActivity, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (waitActivity.getNextActivity() != null) {
            String nextActivity = waitActivity.getNextActivity();
            jsonWriter.name("NextActivity");
            jsonWriter.value(nextActivity);
        }
        if (waitActivity.getWaitTime() != null) {
            WaitTime waitTime = waitActivity.getWaitTime();
            jsonWriter.name("WaitTime");
            WaitTimeJsonMarshaller.getInstance().marshall(waitTime, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static WaitActivityJsonMarshaller instance;

    public static WaitActivityJsonMarshaller getInstance() {
        if (instance == null)
            instance = new WaitActivityJsonMarshaller();
        return instance;
    }
}
