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
 * JSON request marshaller for DescribeSpotPriceHistoryRequest
 */
public class DescribeSpotPriceHistoryRequestMarshaller implements
        Marshaller<Request<DescribeSpotPriceHistoryRequest>, DescribeSpotPriceHistoryRequest> {

    public Request<DescribeSpotPriceHistoryRequest> marshall(
            DescribeSpotPriceHistoryRequest describeSpotPriceHistoryRequest) {
        if (describeSpotPriceHistoryRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeSpotPriceHistoryRequest)");
        }

        Request<DescribeSpotPriceHistoryRequest> request = new DefaultRequest<DescribeSpotPriceHistoryRequest>(
                describeSpotPriceHistoryRequest, "AmazonElasticComputeCloud");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (describeSpotPriceHistoryRequest.getFilters() != null) {
                java.util.List<Filter> filters = describeSpotPriceHistoryRequest.getFilters();
                jsonWriter.name("Filters");
                jsonWriter.beginArray();
                for (Filter filtersItem : filters) {
                    if (filtersItem != null) {
                        FilterJsonMarshaller.getInstance().marshall(filtersItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (describeSpotPriceHistoryRequest.getAvailabilityZone() != null) {
                String availabilityZone = describeSpotPriceHistoryRequest.getAvailabilityZone();
                jsonWriter.name("AvailabilityZone");
                jsonWriter.value(availabilityZone);
            }
            if (describeSpotPriceHistoryRequest.getDryRun() != null) {
                Boolean dryRun = describeSpotPriceHistoryRequest.getDryRun();
                jsonWriter.name("DryRun");
                jsonWriter.value(dryRun);
            }
            if (describeSpotPriceHistoryRequest.getEndTime() != null) {
                java.util.Date endTime = describeSpotPriceHistoryRequest.getEndTime();
                jsonWriter.name("EndTime");
                jsonWriter.value(endTime);
            }
            if (describeSpotPriceHistoryRequest.getInstanceTypes() != null) {
                java.util.List<String> instanceTypes = describeSpotPriceHistoryRequest
                        .getInstanceTypes();
                jsonWriter.name("InstanceTypes");
                jsonWriter.beginArray();
                for (String instanceTypesItem : instanceTypes) {
                    if (instanceTypesItem != null) {
                        jsonWriter.value(instanceTypesItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (describeSpotPriceHistoryRequest.getMaxResults() != null) {
                Integer maxResults = describeSpotPriceHistoryRequest.getMaxResults();
                jsonWriter.name("MaxResults");
                jsonWriter.value(maxResults);
            }
            if (describeSpotPriceHistoryRequest.getNextToken() != null) {
                String nextToken = describeSpotPriceHistoryRequest.getNextToken();
                jsonWriter.name("NextToken");
                jsonWriter.value(nextToken);
            }
            if (describeSpotPriceHistoryRequest.getProductDescriptions() != null) {
                java.util.List<String> productDescriptions = describeSpotPriceHistoryRequest
                        .getProductDescriptions();
                jsonWriter.name("ProductDescriptions");
                jsonWriter.beginArray();
                for (String productDescriptionsItem : productDescriptions) {
                    if (productDescriptionsItem != null) {
                        jsonWriter.value(productDescriptionsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (describeSpotPriceHistoryRequest.getStartTime() != null) {
                java.util.Date startTime = describeSpotPriceHistoryRequest.getStartTime();
                jsonWriter.name("StartTime");
                jsonWriter.value(startTime);
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