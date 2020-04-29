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

package com.amazonaws.services.awswaf.model.transform;

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
import com.amazonaws.services.awswaf.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateWebACLMigrationStackRequest
 */
public class CreateWebACLMigrationStackRequestMarshaller implements
        Marshaller<Request<CreateWebACLMigrationStackRequest>, CreateWebACLMigrationStackRequest> {

    public Request<CreateWebACLMigrationStackRequest> marshall(
            CreateWebACLMigrationStackRequest createWebACLMigrationStackRequest) {
        if (createWebACLMigrationStackRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateWebACLMigrationStackRequest)");
        }

        Request<CreateWebACLMigrationStackRequest> request = new DefaultRequest<CreateWebACLMigrationStackRequest>(
                createWebACLMigrationStackRequest, "AWSWAF");
        String target = "AWSWAF_20150824.CreateWebACLMigrationStack";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createWebACLMigrationStackRequest.getWebACLId() != null) {
                String webACLId = createWebACLMigrationStackRequest.getWebACLId();
                jsonWriter.name("WebACLId");
                jsonWriter.value(webACLId);
            }
            if (createWebACLMigrationStackRequest.getS3BucketName() != null) {
                String s3BucketName = createWebACLMigrationStackRequest.getS3BucketName();
                jsonWriter.name("S3BucketName");
                jsonWriter.value(s3BucketName);
            }
            if (createWebACLMigrationStackRequest.getIgnoreUnsupportedType() != null) {
                Boolean ignoreUnsupportedType = createWebACLMigrationStackRequest
                        .getIgnoreUnsupportedType();
                jsonWriter.name("IgnoreUnsupportedType");
                jsonWriter.value(ignoreUnsupportedType);
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
