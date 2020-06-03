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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO MpdSettings
 */
class MpdSettingsJsonUnmarshaller implements Unmarshaller<MpdSettings, JsonUnmarshallerContext> {

    public MpdSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        MpdSettings mpdSettings = new MpdSettings();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("CaptionContainerType")) {
                mpdSettings.setCaptionContainerType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Scte35Esam")) {
                mpdSettings.setScte35Esam(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Scte35Source")) {
                mpdSettings.setScte35Source(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return mpdSettings;
    }

    private static MpdSettingsJsonUnmarshaller instance;

    public static MpdSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MpdSettingsJsonUnmarshaller();
        return instance;
    }
}
