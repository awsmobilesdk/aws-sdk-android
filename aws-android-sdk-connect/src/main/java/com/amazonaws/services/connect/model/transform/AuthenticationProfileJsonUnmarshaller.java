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
 * JSON unmarshaller for POJO AuthenticationProfile
 */
class AuthenticationProfileJsonUnmarshaller implements
        Unmarshaller<AuthenticationProfile, JsonUnmarshallerContext> {

    public AuthenticationProfile unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AuthenticationProfile authenticationProfile = new AuthenticationProfile();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Id")) {
                authenticationProfile.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Arn")) {
                authenticationProfile.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                authenticationProfile.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                authenticationProfile.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AllowedIps")) {
                authenticationProfile.setAllowedIps(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("BlockedIps")) {
                authenticationProfile.setBlockedIps(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("IsDefault")) {
                authenticationProfile.setIsDefault(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreatedTime")) {
                authenticationProfile.setCreatedTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedTime")) {
                authenticationProfile.setLastModifiedTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedRegion")) {
                authenticationProfile.setLastModifiedRegion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PeriodicSessionDuration")) {
                authenticationProfile.setPeriodicSessionDuration(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("MaxSessionDuration")) {
                authenticationProfile.setMaxSessionDuration(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return authenticationProfile;
    }

    private static AuthenticationProfileJsonUnmarshaller instance;

    public static AuthenticationProfileJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AuthenticationProfileJsonUnmarshaller();
        return instance;
    }
}
