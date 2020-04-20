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

package com.amazonaws.services.awsiotevents.model.transform;

import com.amazonaws.services.awsiotevents.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response VerifyResourcesExistForTagrisResult
 */
public class VerifyResourcesExistForTagrisResultJsonUnmarshaller implements
        Unmarshaller<VerifyResourcesExistForTagrisResult, JsonUnmarshallerContext> {

    public VerifyResourcesExistForTagrisResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        VerifyResourcesExistForTagrisResult verifyResourcesExistForTagrisResult = new VerifyResourcesExistForTagrisResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("TagrisSweepListResult")) {
                verifyResourcesExistForTagrisResult
                        .setTagrisSweepListResult(new MapUnmarshaller<String>(
                                StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return verifyResourcesExistForTagrisResult;
    }

    private static VerifyResourcesExistForTagrisResultJsonUnmarshaller instance;

    public static VerifyResourcesExistForTagrisResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new VerifyResourcesExistForTagrisResultJsonUnmarshaller();
        return instance;
    }
}
