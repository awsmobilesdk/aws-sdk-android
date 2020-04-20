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

package com.amazonaws.services.amazonapigatewayv2.model.transform;

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
import com.amazonaws.services.amazonapigatewayv2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for UpdateDomainNameRequest
 */
public class UpdateDomainNameRequestMarshaller implements
        Marshaller<Request<UpdateDomainNameRequest>, UpdateDomainNameRequest> {

    public Request<UpdateDomainNameRequest> marshall(UpdateDomainNameRequest updateDomainNameRequest) {
        if (updateDomainNameRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateDomainNameRequest)");
        }

        Request<UpdateDomainNameRequest> request = new DefaultRequest<UpdateDomainNameRequest>(
                updateDomainNameRequest, "AmazonApiGatewayV2");
        request.setHttpMethod(HttpMethodName.PATCH);

        String uriResourcePath = "/v2/domainnames/{domainName}";
        uriResourcePath = uriResourcePath.replace(
                "{domainName}",
                (updateDomainNameRequest.getDomainName() == null) ? "" : StringUtils
                        .fromString(updateDomainNameRequest.getDomainName()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (updateDomainNameRequest.getDomainNameConfigurations() != null) {
                java.util.List<DomainNameConfiguration> domainNameConfigurations = updateDomainNameRequest
                        .getDomainNameConfigurations();
                jsonWriter.name("DomainNameConfigurations");
                jsonWriter.beginArray();
                for (DomainNameConfiguration domainNameConfigurationsItem : domainNameConfigurations) {
                    if (domainNameConfigurationsItem != null) {
                        DomainNameConfigurationJsonMarshaller.getInstance().marshall(
                                domainNameConfigurationsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
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
