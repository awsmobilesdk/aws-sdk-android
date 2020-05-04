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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response DetachVolumeResult
 */
public class DetachVolumeResultJsonUnmarshaller implements
        Unmarshaller<DetachVolumeResult, JsonUnmarshallerContext> {

    public DetachVolumeResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DetachVolumeResult detachVolumeResult = new DetachVolumeResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AttachTime")) {
                detachVolumeResult.setAttachTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Device")) {
                detachVolumeResult.setDevice(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InstanceId")) {
                detachVolumeResult.setInstanceId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("State")) {
                detachVolumeResult.setState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VolumeId")) {
                detachVolumeResult.setVolumeId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DeleteOnTermination")) {
                detachVolumeResult.setDeleteOnTermination(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return detachVolumeResult;
    }

    private static DetachVolumeResultJsonUnmarshaller instance;

    public static DetachVolumeResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DetachVolumeResultJsonUnmarshaller();
        return instance;
    }
}