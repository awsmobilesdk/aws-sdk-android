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

package com.amazonaws.services.amazonpinpoint.model.transform;

import com.amazonaws.services.amazonpinpoint.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response UpdateJourneyResult
 */
public class UpdateJourneyResultJsonUnmarshaller implements
        Unmarshaller<UpdateJourneyResult, JsonUnmarshallerContext> {

    public UpdateJourneyResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateJourneyResult updateJourneyResult = new UpdateJourneyResult();

        return updateJourneyResult;
    }

    private static UpdateJourneyResultJsonUnmarshaller instance;

    public static UpdateJourneyResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateJourneyResultJsonUnmarshaller();
        return instance;
    }
}