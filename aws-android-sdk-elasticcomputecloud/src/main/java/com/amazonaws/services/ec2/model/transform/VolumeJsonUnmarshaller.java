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
 * JSON unmarshaller for POJO Volume
 */
class VolumeJsonUnmarshaller implements Unmarshaller<Volume, JsonUnmarshallerContext> {

    public Volume unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Volume volume = new Volume();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Attachments")) {
                volume.setAttachments(new ListUnmarshaller<VolumeAttachment>(
                        VolumeAttachmentJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("AvailabilityZone")) {
                volume.setAvailabilityZone(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreateTime")) {
                volume.setCreateTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Encrypted")) {
                volume.setEncrypted(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("KmsKeyId")) {
                volume.setKmsKeyId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OutpostArn")) {
                volume.setOutpostArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Size")) {
                volume.setSize(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SnapshotId")) {
                volume.setSnapshotId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("State")) {
                volume.setState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VolumeId")) {
                volume.setVolumeId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Iops")) {
                volume.setIops(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                volume.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("VolumeType")) {
                volume.setVolumeType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FastRestored")) {
                volume.setFastRestored(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MultiAttachEnabled")) {
                volume.setMultiAttachEnabled(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return volume;
    }

    private static VolumeJsonUnmarshaller instance;

    public static VolumeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new VolumeJsonUnmarshaller();
        return instance;
    }
}