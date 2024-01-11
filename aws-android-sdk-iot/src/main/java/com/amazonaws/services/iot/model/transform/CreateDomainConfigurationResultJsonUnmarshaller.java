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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response CreateDomainConfigurationResult
 */
public class CreateDomainConfigurationResultJsonUnmarshaller implements
        Unmarshaller<CreateDomainConfigurationResult, JsonUnmarshallerContext> {

    public CreateDomainConfigurationResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        CreateDomainConfigurationResult createDomainConfigurationResult = new CreateDomainConfigurationResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("domainConfigurationName")) {
                createDomainConfigurationResult.setDomainConfigurationName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("domainConfigurationArn")) {
                createDomainConfigurationResult.setDomainConfigurationArn(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return createDomainConfigurationResult;
    }

    private static CreateDomainConfigurationResultJsonUnmarshaller instance;

    public static CreateDomainConfigurationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateDomainConfigurationResultJsonUnmarshaller();
        return instance;
    }
}
