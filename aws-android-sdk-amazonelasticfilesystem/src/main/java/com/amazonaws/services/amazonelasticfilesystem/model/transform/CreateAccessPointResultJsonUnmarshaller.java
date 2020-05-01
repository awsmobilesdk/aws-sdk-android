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

package com.amazonaws.services.amazonelasticfilesystem.model.transform;

import com.amazonaws.services.amazonelasticfilesystem.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response CreateAccessPointResult
 */
public class CreateAccessPointResultJsonUnmarshaller implements
        Unmarshaller<CreateAccessPointResult, JsonUnmarshallerContext> {

    public CreateAccessPointResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateAccessPointResult createAccessPointResult = new CreateAccessPointResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ClientToken")) {
                createAccessPointResult.setClientToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                createAccessPointResult.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                createAccessPointResult.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("AccessPointId")) {
                createAccessPointResult.setAccessPointId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AccessPointArn")) {
                createAccessPointResult.setAccessPointArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FileSystemId")) {
                createAccessPointResult.setFileSystemId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PosixUser")) {
                createAccessPointResult.setPosixUser(PosixUserJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RootDirectory")) {
                createAccessPointResult.setRootDirectory(RootDirectoryJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("OwnerId")) {
                createAccessPointResult.setOwnerId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LifeCycleState")) {
                createAccessPointResult.setLifeCycleState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return createAccessPointResult;
    }

    private static CreateAccessPointResultJsonUnmarshaller instance;

    public static CreateAccessPointResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateAccessPointResultJsonUnmarshaller();
        return instance;
    }
}
