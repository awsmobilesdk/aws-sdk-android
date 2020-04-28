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
 * JSON marshaller for POJO MultiplexProgramSummary
 */
class MultiplexProgramSummaryJsonMarshaller {

    public void marshall(MultiplexProgramSummary multiplexProgramSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (multiplexProgramSummary.getChannelId() != null) {
            String channelId = multiplexProgramSummary.getChannelId();
            jsonWriter.name("ChannelId");
            jsonWriter.value(channelId);
        }
        if (multiplexProgramSummary.getProgramName() != null) {
            String programName = multiplexProgramSummary.getProgramName();
            jsonWriter.name("ProgramName");
            jsonWriter.value(programName);
        }
        jsonWriter.endObject();
    }

    private static MultiplexProgramSummaryJsonMarshaller instance;

    public static MultiplexProgramSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MultiplexProgramSummaryJsonMarshaller();
        return instance;
    }
}
