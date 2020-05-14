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

package com.amazonaws.services.imagebuilder.model.transform;

import com.amazonaws.services.imagebuilder.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response GetImagePolicyResult
 */
public class GetImagePolicyResultJsonUnmarshaller implements
        Unmarshaller<GetImagePolicyResult, JsonUnmarshallerContext> {

    public GetImagePolicyResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetImagePolicyResult getImagePolicyResult = new GetImagePolicyResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("requestId")) {
                getImagePolicyResult.setRequestId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("policy")) {
                getImagePolicyResult.setPolicy(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getImagePolicyResult;
    }

    private static GetImagePolicyResultJsonUnmarshaller instance;

    public static GetImagePolicyResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetImagePolicyResultJsonUnmarshaller();
        return instance;
    }
}
