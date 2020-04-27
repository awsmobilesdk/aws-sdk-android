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

package com.amazonaws.services.amazonsagemakerservice.model.transform;

import com.amazonaws.services.amazonsagemakerservice.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO AutoMLJobSummary
 */
class AutoMLJobSummaryJsonUnmarshaller implements
        Unmarshaller<AutoMLJobSummary, JsonUnmarshallerContext> {

    public AutoMLJobSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AutoMLJobSummary autoMLJobSummary = new AutoMLJobSummary();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AutoMLJobName")) {
                autoMLJobSummary.setAutoMLJobName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AutoMLJobArn")) {
                autoMLJobSummary.setAutoMLJobArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AutoMLJobStatus")) {
                autoMLJobSummary.setAutoMLJobStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AutoMLJobSecondaryStatus")) {
                autoMLJobSummary.setAutoMLJobSecondaryStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationTime")) {
                autoMLJobSummary.setCreationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EndTime")) {
                autoMLJobSummary.setEndTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedTime")) {
                autoMLJobSummary.setLastModifiedTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FailureReason")) {
                autoMLJobSummary.setFailureReason(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return autoMLJobSummary;
    }

    private static AutoMLJobSummaryJsonUnmarshaller instance;

    public static AutoMLJobSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AutoMLJobSummaryJsonUnmarshaller();
        return instance;
    }
}
