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

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for ReplaceRouteRequest
 */
public class ReplaceRouteRequestMarshaller implements
        Marshaller<Request<ReplaceRouteRequest>, ReplaceRouteRequest> {

    public Request<ReplaceRouteRequest> marshall(ReplaceRouteRequest replaceRouteRequest) {
        if (replaceRouteRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ReplaceRouteRequest)");
        }

        Request<ReplaceRouteRequest> request = new DefaultRequest<ReplaceRouteRequest>(
                replaceRouteRequest, "AmazonElasticComputeCloud");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (replaceRouteRequest.getDestinationCidrBlock() != null) {
                String destinationCidrBlock = replaceRouteRequest.getDestinationCidrBlock();
                jsonWriter.name("DestinationCidrBlock");
                jsonWriter.value(destinationCidrBlock);
            }
            if (replaceRouteRequest.getDestinationIpv6CidrBlock() != null) {
                String destinationIpv6CidrBlock = replaceRouteRequest.getDestinationIpv6CidrBlock();
                jsonWriter.name("DestinationIpv6CidrBlock");
                jsonWriter.value(destinationIpv6CidrBlock);
            }
            if (replaceRouteRequest.getDryRun() != null) {
                Boolean dryRun = replaceRouteRequest.getDryRun();
                jsonWriter.name("DryRun");
                jsonWriter.value(dryRun);
            }
            if (replaceRouteRequest.getEgressOnlyInternetGatewayId() != null) {
                String egressOnlyInternetGatewayId = replaceRouteRequest
                        .getEgressOnlyInternetGatewayId();
                jsonWriter.name("EgressOnlyInternetGatewayId");
                jsonWriter.value(egressOnlyInternetGatewayId);
            }
            if (replaceRouteRequest.getGatewayId() != null) {
                String gatewayId = replaceRouteRequest.getGatewayId();
                jsonWriter.name("GatewayId");
                jsonWriter.value(gatewayId);
            }
            if (replaceRouteRequest.getInstanceId() != null) {
                String instanceId = replaceRouteRequest.getInstanceId();
                jsonWriter.name("InstanceId");
                jsonWriter.value(instanceId);
            }
            if (replaceRouteRequest.getLocalTarget() != null) {
                Boolean localTarget = replaceRouteRequest.getLocalTarget();
                jsonWriter.name("LocalTarget");
                jsonWriter.value(localTarget);
            }
            if (replaceRouteRequest.getNatGatewayId() != null) {
                String natGatewayId = replaceRouteRequest.getNatGatewayId();
                jsonWriter.name("NatGatewayId");
                jsonWriter.value(natGatewayId);
            }
            if (replaceRouteRequest.getTransitGatewayId() != null) {
                String transitGatewayId = replaceRouteRequest.getTransitGatewayId();
                jsonWriter.name("TransitGatewayId");
                jsonWriter.value(transitGatewayId);
            }
            if (replaceRouteRequest.getLocalGatewayId() != null) {
                String localGatewayId = replaceRouteRequest.getLocalGatewayId();
                jsonWriter.name("LocalGatewayId");
                jsonWriter.value(localGatewayId);
            }
            if (replaceRouteRequest.getNetworkInterfaceId() != null) {
                String networkInterfaceId = replaceRouteRequest.getNetworkInterfaceId();
                jsonWriter.name("NetworkInterfaceId");
                jsonWriter.value(networkInterfaceId);
            }
            if (replaceRouteRequest.getRouteTableId() != null) {
                String routeTableId = replaceRouteRequest.getRouteTableId();
                jsonWriter.name("RouteTableId");
                jsonWriter.value(routeTableId);
            }
            if (replaceRouteRequest.getVpcPeeringConnectionId() != null) {
                String vpcPeeringConnectionId = replaceRouteRequest.getVpcPeeringConnectionId();
                jsonWriter.name("VpcPeeringConnectionId");
                jsonWriter.value(vpcPeeringConnectionId);
            }

            jsonWriter.endObject();
            jsonWriter.close();
            String snippet = stringWriter.toString();
            byte[] content = snippet.getBytes(UTF8);
            request.setContent(new StringInputStream(snippet));
            request.addHeader("Content-Length", Integer.toString(content.length));
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.0");
        }

        return request;
    }
}