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

package com.amazonaws.services.amazonapigatewayv2.model.transform;

import com.amazonaws.services.amazonapigatewayv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response CreateDeploymentResult
 */
public class CreateDeploymentResultJsonUnmarshaller implements
        Unmarshaller<CreateDeploymentResult, JsonUnmarshallerContext> {

    public CreateDeploymentResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateDeploymentResult createDeploymentResult = new CreateDeploymentResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AutoDeployed")) {
                createDeploymentResult.setAutoDeployed(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreatedDate")) {
                createDeploymentResult.setCreatedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DeploymentId")) {
                createDeploymentResult.setDeploymentId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DeploymentStatus")) {
                createDeploymentResult.setDeploymentStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DeploymentStatusMessage")) {
                createDeploymentResult.setDeploymentStatusMessage(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                createDeploymentResult.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return createDeploymentResult;
    }

    private static CreateDeploymentResultJsonUnmarshaller instance;

    public static CreateDeploymentResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateDeploymentResultJsonUnmarshaller();
        return instance;
    }
}
