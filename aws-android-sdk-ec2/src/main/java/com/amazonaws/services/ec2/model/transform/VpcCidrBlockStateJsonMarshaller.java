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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO VpcCidrBlockState
 */
class VpcCidrBlockStateJsonMarshaller {

    public void marshall(VpcCidrBlockState vpcCidrBlockState, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (vpcCidrBlockState.getState() != null) {
            String state = vpcCidrBlockState.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (vpcCidrBlockState.getStatusMessage() != null) {
            String statusMessage = vpcCidrBlockState.getStatusMessage();
            jsonWriter.name("StatusMessage");
            jsonWriter.value(statusMessage);
        }
        jsonWriter.endObject();
    }

    private static VpcCidrBlockStateJsonMarshaller instance;

    public static VpcCidrBlockStateJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VpcCidrBlockStateJsonMarshaller();
        return instance;
    }
}
