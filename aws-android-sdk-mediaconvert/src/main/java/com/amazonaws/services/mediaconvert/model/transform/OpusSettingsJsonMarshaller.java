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
 * JSON marshaller for POJO OpusSettings
 */
class OpusSettingsJsonMarshaller {

    public void marshall(OpusSettings opusSettings, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (opusSettings.getBitrate() != null) {
            Integer bitrate = opusSettings.getBitrate();
            jsonWriter.name("Bitrate");
            jsonWriter.value(bitrate);
        }
        if (opusSettings.getChannels() != null) {
            Integer channels = opusSettings.getChannels();
            jsonWriter.name("Channels");
            jsonWriter.value(channels);
        }
        if (opusSettings.getSampleRate() != null) {
            Integer sampleRate = opusSettings.getSampleRate();
            jsonWriter.name("SampleRate");
            jsonWriter.value(sampleRate);
        }
        jsonWriter.endObject();
    }

    private static OpusSettingsJsonMarshaller instance;

    public static OpusSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new OpusSettingsJsonMarshaller();
        return instance;
    }
}
