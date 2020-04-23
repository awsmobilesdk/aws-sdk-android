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

import com.amazonaws.services.amazonpinpoint.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO EmailTemplateRequest
 */
class EmailTemplateRequestJsonUnmarshaller implements
        Unmarshaller<EmailTemplateRequest, JsonUnmarshallerContext> {

    public EmailTemplateRequest unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        EmailTemplateRequest emailTemplateRequest = new EmailTemplateRequest();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("DefaultSubstitutions")) {
                emailTemplateRequest.setDefaultSubstitutions(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("HtmlPart")) {
                emailTemplateRequest.setHtmlPart(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RecommenderId")) {
                emailTemplateRequest.setRecommenderId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Subject")) {
                emailTemplateRequest.setSubject(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("tags")) {
                emailTemplateRequest.setTags(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("TemplateDescription")) {
                emailTemplateRequest.setTemplateDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TextPart")) {
                emailTemplateRequest.setTextPart(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return emailTemplateRequest;
    }

    private static EmailTemplateRequestJsonUnmarshaller instance;

    public static EmailTemplateRequestJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EmailTemplateRequestJsonUnmarshaller();
        return instance;
    }
}
