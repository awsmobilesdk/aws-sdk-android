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
 * JSON unmarshaller for response ImportKeyPairResult
 */
public class ImportKeyPairResultJsonUnmarshaller implements
        Unmarshaller<ImportKeyPairResult, JsonUnmarshallerContext> {

    public ImportKeyPairResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ImportKeyPairResult importKeyPairResult = new ImportKeyPairResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("KeyFingerprint")) {
                importKeyPairResult.setKeyFingerprint(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("KeyName")) {
                importKeyPairResult.setKeyName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("KeyPairId")) {
                importKeyPairResult.setKeyPairId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                importKeyPairResult.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return importKeyPairResult;
    }

    private static ImportKeyPairResultJsonUnmarshaller instance;

    public static ImportKeyPairResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ImportKeyPairResultJsonUnmarshaller();
        return instance;
    }
}