/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response ListUserProficienciesResult
 */
public class ListUserProficienciesResultJsonUnmarshaller implements
        Unmarshaller<ListUserProficienciesResult, JsonUnmarshallerContext> {

    public ListUserProficienciesResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListUserProficienciesResult listUserProficienciesResult = new ListUserProficienciesResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("NextToken")) {
                listUserProficienciesResult.setNextToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("UserProficiencyList")) {
                listUserProficienciesResult
                        .setUserProficiencyList(new ListUnmarshaller<UserProficiency>(
                                UserProficiencyJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("LastModifiedTime")) {
                listUserProficienciesResult.setLastModifiedTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedRegion")) {
                listUserProficienciesResult.setLastModifiedRegion(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return listUserProficienciesResult;
    }

    private static ListUserProficienciesResultJsonUnmarshaller instance;

    public static ListUserProficienciesResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListUserProficienciesResultJsonUnmarshaller();
        return instance;
    }
}
