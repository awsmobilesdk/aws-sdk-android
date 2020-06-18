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
 * JSON unmarshaller for POJO JobSettings
 */
class JobSettingsJsonUnmarshaller implements Unmarshaller<JobSettings, JsonUnmarshallerContext> {

    public JobSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        JobSettings jobSettings = new JobSettings();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AdAvailOffset")) {
                jobSettings.setAdAvailOffset(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AvailBlanking")) {
                jobSettings.setAvailBlanking(AvailBlankingJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Esam")) {
                jobSettings.setEsam(EsamSettingsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Inputs")) {
                jobSettings.setInputs(new ListUnmarshaller<Input>(InputJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("MotionImageInserter")) {
                jobSettings.setMotionImageInserter(MotionImageInserterJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("NielsenConfiguration")) {
                jobSettings.setNielsenConfiguration(NielsenConfigurationJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("OutputGroups")) {
                jobSettings.setOutputGroups(new ListUnmarshaller<OutputGroup>(
                        OutputGroupJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("TimecodeConfig")) {
                jobSettings.setTimecodeConfig(TimecodeConfigJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TimedMetadataInsertion")) {
                jobSettings.setTimedMetadataInsertion(TimedMetadataInsertionJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return jobSettings;
    }

    private static JobSettingsJsonUnmarshaller instance;

    public static JobSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new JobSettingsJsonUnmarshaller();
        return instance;
    }
}
