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

package com.amazonaws.services.models.lex.model.transform;

import com.amazonaws.services.models.lex.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Statement
 */
class StatementJsonMarshaller {

    public void marshall(Statement statement, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (statement.getMessages() != null) {
            java.util.List<Message> messages = statement.getMessages();
            jsonWriter.name("messages");
            jsonWriter.beginArray();
            for (Message messagesItem : messages) {
                if (messagesItem != null) {
                    MessageJsonMarshaller.getInstance().marshall(messagesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (statement.getResponseCard() != null) {
            String responseCard = statement.getResponseCard();
            jsonWriter.name("responseCard");
            jsonWriter.value(responseCard);
        }
        jsonWriter.endObject();
    }

    private static StatementJsonMarshaller instance;

    public static StatementJsonMarshaller getInstance() {
        if (instance == null)
            instance = new StatementJsonMarshaller();
        return instance;
    }
}
