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

package com.amazonaws.services.awselementalmedialive.model.transform;

import com.amazonaws.services.awselementalmedialive.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Scte20SourceSettings
 */
class Scte20SourceSettingsJsonMarshaller {

    public void marshall(Scte20SourceSettings scte20SourceSettings, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (scte20SourceSettings.getConvert608To708() != null) {
            String convert608To708 = scte20SourceSettings.getConvert608To708();
            jsonWriter.name("Convert608To708");
            jsonWriter.value(convert608To708);
        }
        if (scte20SourceSettings.getSource608ChannelNumber() != null) {
            Integer source608ChannelNumber = scte20SourceSettings.getSource608ChannelNumber();
            jsonWriter.name("Source608ChannelNumber");
            jsonWriter.value(source608ChannelNumber);
        }
        jsonWriter.endObject();
    }

    private static Scte20SourceSettingsJsonMarshaller instance;

    public static Scte20SourceSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new Scte20SourceSettingsJsonMarshaller();
        return instance;
    }
}
