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

package com.amazonaws.services.amazonsagemakerservice.model.transform;

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
import com.amazonaws.services.amazonsagemakerservice.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for ListMonitoringSchedulesRequest
 */
public class ListMonitoringSchedulesRequestMarshaller implements
        Marshaller<Request<ListMonitoringSchedulesRequest>, ListMonitoringSchedulesRequest> {

    public Request<ListMonitoringSchedulesRequest> marshall(
            ListMonitoringSchedulesRequest listMonitoringSchedulesRequest) {
        if (listMonitoringSchedulesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ListMonitoringSchedulesRequest)");
        }

        Request<ListMonitoringSchedulesRequest> request = new DefaultRequest<ListMonitoringSchedulesRequest>(
                listMonitoringSchedulesRequest, "AmazonSageMakerService");
        String target = "SageMaker.ListMonitoringSchedules";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (listMonitoringSchedulesRequest.getEndpointName() != null) {
                String endpointName = listMonitoringSchedulesRequest.getEndpointName();
                jsonWriter.name("EndpointName");
                jsonWriter.value(endpointName);
            }
            if (listMonitoringSchedulesRequest.getSortBy() != null) {
                String sortBy = listMonitoringSchedulesRequest.getSortBy();
                jsonWriter.name("SortBy");
                jsonWriter.value(sortBy);
            }
            if (listMonitoringSchedulesRequest.getSortOrder() != null) {
                String sortOrder = listMonitoringSchedulesRequest.getSortOrder();
                jsonWriter.name("SortOrder");
                jsonWriter.value(sortOrder);
            }
            if (listMonitoringSchedulesRequest.getNextToken() != null) {
                String nextToken = listMonitoringSchedulesRequest.getNextToken();
                jsonWriter.name("NextToken");
                jsonWriter.value(nextToken);
            }
            if (listMonitoringSchedulesRequest.getMaxResults() != null) {
                Integer maxResults = listMonitoringSchedulesRequest.getMaxResults();
                jsonWriter.name("MaxResults");
                jsonWriter.value(maxResults);
            }
            if (listMonitoringSchedulesRequest.getNameContains() != null) {
                String nameContains = listMonitoringSchedulesRequest.getNameContains();
                jsonWriter.name("NameContains");
                jsonWriter.value(nameContains);
            }
            if (listMonitoringSchedulesRequest.getCreationTimeBefore() != null) {
                java.util.Date creationTimeBefore = listMonitoringSchedulesRequest
                        .getCreationTimeBefore();
                jsonWriter.name("CreationTimeBefore");
                jsonWriter.value(creationTimeBefore);
            }
            if (listMonitoringSchedulesRequest.getCreationTimeAfter() != null) {
                java.util.Date creationTimeAfter = listMonitoringSchedulesRequest
                        .getCreationTimeAfter();
                jsonWriter.name("CreationTimeAfter");
                jsonWriter.value(creationTimeAfter);
            }
            if (listMonitoringSchedulesRequest.getLastModifiedTimeBefore() != null) {
                java.util.Date lastModifiedTimeBefore = listMonitoringSchedulesRequest
                        .getLastModifiedTimeBefore();
                jsonWriter.name("LastModifiedTimeBefore");
                jsonWriter.value(lastModifiedTimeBefore);
            }
            if (listMonitoringSchedulesRequest.getLastModifiedTimeAfter() != null) {
                java.util.Date lastModifiedTimeAfter = listMonitoringSchedulesRequest
                        .getLastModifiedTimeAfter();
                jsonWriter.name("LastModifiedTimeAfter");
                jsonWriter.value(lastModifiedTimeAfter);
            }
            if (listMonitoringSchedulesRequest.getStatusEquals() != null) {
                String statusEquals = listMonitoringSchedulesRequest.getStatusEquals();
                jsonWriter.name("StatusEquals");
                jsonWriter.value(statusEquals);
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
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}
