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

package com.amazonaws.services.amazonpinpoint.model.transform;

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
import com.amazonaws.services.amazonpinpoint.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for UpdateEmailTemplateRequest
 */
public class UpdateEmailTemplateRequestMarshaller implements
        Marshaller<Request<UpdateEmailTemplateRequest>, UpdateEmailTemplateRequest> {

    public Request<UpdateEmailTemplateRequest> marshall(
            UpdateEmailTemplateRequest updateEmailTemplateRequest) {
        if (updateEmailTemplateRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateEmailTemplateRequest)");
        }

        Request<UpdateEmailTemplateRequest> request = new DefaultRequest<UpdateEmailTemplateRequest>(
                updateEmailTemplateRequest, "AmazonPinpoint");
        request.setHttpMethod(HttpMethodName.PUT);

        String uriResourcePath = "/v1/templates/{template-name}/email";
        if (updateEmailTemplateRequest.getCreateNewVersion() != null) {
            request.addParameter("create-new-version",
                    StringUtils.fromBoolean(updateEmailTemplateRequest.getCreateNewVersion()));
        }
        uriResourcePath = uriResourcePath.replace(
                "{template-name}",
                (updateEmailTemplateRequest.getTemplateName() == null) ? "" : StringUtils
                        .fromString(updateEmailTemplateRequest.getTemplateName()));
        if (updateEmailTemplateRequest.getVersion() != null) {
            request.addParameter("version",
                    StringUtils.fromString(updateEmailTemplateRequest.getVersion()));
        }
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            if (updateEmailTemplateRequest.getEmailTemplateRequest() != null) {
                EmailTemplateRequest emailTemplateRequest = updateEmailTemplateRequest
                        .getEmailTemplateRequest();
                EmailTemplateRequestJsonMarshaller.getInstance().marshall(emailTemplateRequest,
                        jsonWriter);
            }
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