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

package com.amazonaws.services.awselementalmediaconvert.model.transform;

import com.amazonaws.services.awselementalmediaconvert.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO VideoCodecSettings
 */
class VideoCodecSettingsJsonUnmarshaller implements
        Unmarshaller<VideoCodecSettings, JsonUnmarshallerContext> {

    public VideoCodecSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        VideoCodecSettings videoCodecSettings = new VideoCodecSettings();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Av1Settings")) {
                videoCodecSettings.setAv1Settings(Av1SettingsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Codec")) {
                videoCodecSettings.setCodec(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FrameCaptureSettings")) {
                videoCodecSettings.setFrameCaptureSettings(FrameCaptureSettingsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("H264Settings")) {
                videoCodecSettings.setH264Settings(H264SettingsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("H265Settings")) {
                videoCodecSettings.setH265Settings(H265SettingsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Mpeg2Settings")) {
                videoCodecSettings.setMpeg2Settings(Mpeg2SettingsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ProresSettings")) {
                videoCodecSettings.setProresSettings(ProresSettingsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return videoCodecSettings;
    }

    private static VideoCodecSettingsJsonUnmarshaller instance;

    public static VideoCodecSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new VideoCodecSettingsJsonUnmarshaller();
        return instance;
    }
}
