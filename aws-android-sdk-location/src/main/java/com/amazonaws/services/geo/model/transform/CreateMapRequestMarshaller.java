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

package com.amazonaws.services.geo.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;

import android.text.TextUtils;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.geo.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateMapRequest
 */
public class CreateMapRequestMarshaller implements
        Marshaller<Request<CreateMapRequest>, CreateMapRequest> {

    public Request<CreateMapRequest> marshall(CreateMapRequest createMapRequest) {
        if (createMapRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(CreateMapRequest)");
        }

        Request<CreateMapRequest> request = new DefaultRequest<CreateMapRequest>(createMapRequest,
                "AmazonLocation");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/maps/v0/maps";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createMapRequest.getMapName() != null) {
                String mapName = createMapRequest.getMapName();
                jsonWriter.name("MapName");
                jsonWriter.value(mapName);
            }
            if (createMapRequest.getConfiguration() != null) {
                MapConfiguration configuration = createMapRequest.getConfiguration();
                jsonWriter.name("Configuration");
                MapConfigurationJsonMarshaller.getInstance().marshall(configuration, jsonWriter);
            }
            if (createMapRequest.getPricingPlan() != null) {
                String pricingPlan = createMapRequest.getPricingPlan();
                jsonWriter.name("PricingPlan");
                jsonWriter.value(pricingPlan);
            }
            if (createMapRequest.getDescription() != null) {
                String description = createMapRequest.getDescription();
                jsonWriter.name("Description");
                jsonWriter.value(description);
            }
            if (createMapRequest.getTags() != null) {
                java.util.Map<String, String> tags = createMapRequest.getTags();
                jsonWriter.name("Tags");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, String> tagsEntry : tags.entrySet()) {
                    String tagsValue = tagsEntry.getValue();
                    if (tagsValue != null) {
                        jsonWriter.name(tagsEntry.getKey());
                        jsonWriter.value(tagsValue);
                    }
                }
                jsonWriter.endObject();
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
        request.setHostPrefix("cp.maps.");

        return request;
    }
}
