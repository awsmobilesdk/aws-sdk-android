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

package com.amazonaws.services.mediaconvert.model.transform;

import com.amazonaws.services.mediaconvert.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Timing
 */
class TimingJsonMarshaller {

    public void marshall(Timing timing, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (timing.getFinishTime() != null) {
            java.util.Date finishTime = timing.getFinishTime();
            jsonWriter.name("FinishTime");
            jsonWriter.value(finishTime);
        }
        if (timing.getStartTime() != null) {
            java.util.Date startTime = timing.getStartTime();
            jsonWriter.name("StartTime");
            jsonWriter.value(startTime);
        }
        if (timing.getSubmitTime() != null) {
            java.util.Date submitTime = timing.getSubmitTime();
            jsonWriter.name("SubmitTime");
            jsonWriter.value(submitTime);
        }
        jsonWriter.endObject();
    }

    private static TimingJsonMarshaller instance;

    public static TimingJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TimingJsonMarshaller();
        return instance;
    }
}
