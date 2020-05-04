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
 * JSON marshaller for POJO VpnStaticRoute
 */
class VpnStaticRouteJsonMarshaller {

    public void marshall(VpnStaticRoute vpnStaticRoute, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (vpnStaticRoute.getDestinationCidrBlock() != null) {
            String destinationCidrBlock = vpnStaticRoute.getDestinationCidrBlock();
            jsonWriter.name("DestinationCidrBlock");
            jsonWriter.value(destinationCidrBlock);
        }
        if (vpnStaticRoute.getSource() != null) {
            String source = vpnStaticRoute.getSource();
            jsonWriter.name("Source");
            jsonWriter.value(source);
        }
        if (vpnStaticRoute.getState() != null) {
            String state = vpnStaticRoute.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        jsonWriter.endObject();
    }

    private static VpnStaticRouteJsonMarshaller instance;

    public static VpnStaticRouteJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VpnStaticRouteJsonMarshaller();
        return instance;
    }
}