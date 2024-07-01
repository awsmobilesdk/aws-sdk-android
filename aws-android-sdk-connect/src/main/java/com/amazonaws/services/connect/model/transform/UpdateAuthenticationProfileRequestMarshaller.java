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
import com.amazonaws.services.connect.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for UpdateAuthenticationProfileRequest
 */
public class UpdateAuthenticationProfileRequestMarshaller implements
        Marshaller<Request<UpdateAuthenticationProfileRequest>, UpdateAuthenticationProfileRequest> {

    public Request<UpdateAuthenticationProfileRequest> marshall(
            UpdateAuthenticationProfileRequest updateAuthenticationProfileRequest) {
        if (updateAuthenticationProfileRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateAuthenticationProfileRequest)");
        }

        Request<UpdateAuthenticationProfileRequest> request = new DefaultRequest<UpdateAuthenticationProfileRequest>(
                updateAuthenticationProfileRequest, "AmazonConnect");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/authentication-profiles/{InstanceId}/{AuthenticationProfileId}";
        uriResourcePath = uriResourcePath.replace(
                "{AuthenticationProfileId}",
                (updateAuthenticationProfileRequest.getAuthenticationProfileId() == null) ? ""
                        : StringUtils.fromString(updateAuthenticationProfileRequest
                                .getAuthenticationProfileId()));
        uriResourcePath = uriResourcePath.replace(
                "{InstanceId}",
                (updateAuthenticationProfileRequest.getInstanceId() == null) ? "" : StringUtils
                        .fromString(updateAuthenticationProfileRequest.getInstanceId()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateAuthenticationProfileRequest.getName() != null) {
                String name = updateAuthenticationProfileRequest.getName();
                jsonWriter.name("Name");
                jsonWriter.value(name);
            }
            if (updateAuthenticationProfileRequest.getDescription() != null) {
                String description = updateAuthenticationProfileRequest.getDescription();
                jsonWriter.name("Description");
                jsonWriter.value(description);
            }
            if (updateAuthenticationProfileRequest.getAllowedIps() != null) {
                java.util.List<String> allowedIps = updateAuthenticationProfileRequest
                        .getAllowedIps();
                jsonWriter.name("AllowedIps");
                jsonWriter.beginArray();
                for (String allowedIpsItem : allowedIps) {
                    if (allowedIpsItem != null) {
                        jsonWriter.value(allowedIpsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (updateAuthenticationProfileRequest.getBlockedIps() != null) {
                java.util.List<String> blockedIps = updateAuthenticationProfileRequest
                        .getBlockedIps();
                jsonWriter.name("BlockedIps");
                jsonWriter.beginArray();
                for (String blockedIpsItem : blockedIps) {
                    if (blockedIpsItem != null) {
                        jsonWriter.value(blockedIpsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (updateAuthenticationProfileRequest.getPeriodicSessionDuration() != null) {
                Integer periodicSessionDuration = updateAuthenticationProfileRequest
                        .getPeriodicSessionDuration();
                jsonWriter.name("PeriodicSessionDuration");
                jsonWriter.value(periodicSessionDuration);
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
