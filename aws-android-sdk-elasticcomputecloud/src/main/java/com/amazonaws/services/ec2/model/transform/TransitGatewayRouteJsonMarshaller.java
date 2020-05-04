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
 * JSON marshaller for POJO TransitGatewayRoute
 */
class TransitGatewayRouteJsonMarshaller {

    public void marshall(TransitGatewayRoute transitGatewayRoute, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (transitGatewayRoute.getDestinationCidrBlock() != null) {
            String destinationCidrBlock = transitGatewayRoute.getDestinationCidrBlock();
            jsonWriter.name("DestinationCidrBlock");
            jsonWriter.value(destinationCidrBlock);
        }
        if (transitGatewayRoute.getTransitGatewayAttachments() != null) {
            java.util.List<TransitGatewayRouteAttachment> transitGatewayAttachments = transitGatewayRoute
                    .getTransitGatewayAttachments();
            jsonWriter.name("TransitGatewayAttachments");
            jsonWriter.beginArray();
            for (TransitGatewayRouteAttachment transitGatewayAttachmentsItem : transitGatewayAttachments) {
                if (transitGatewayAttachmentsItem != null) {
                    TransitGatewayRouteAttachmentJsonMarshaller.getInstance().marshall(
                            transitGatewayAttachmentsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (transitGatewayRoute.getType() != null) {
            String type = transitGatewayRoute.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (transitGatewayRoute.getState() != null) {
            String state = transitGatewayRoute.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        jsonWriter.endObject();
    }

    private static TransitGatewayRouteJsonMarshaller instance;

    public static TransitGatewayRouteJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TransitGatewayRouteJsonMarshaller();
        return instance;
    }
}