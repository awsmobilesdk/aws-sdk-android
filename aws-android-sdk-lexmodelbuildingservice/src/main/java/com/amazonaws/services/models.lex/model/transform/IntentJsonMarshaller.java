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
 * JSON marshaller for POJO Intent
 */
class IntentJsonMarshaller {

    public void marshall(Intent intent, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (intent.getIntentName() != null) {
            String intentName = intent.getIntentName();
            jsonWriter.name("intentName");
            jsonWriter.value(intentName);
        }
        if (intent.getIntentVersion() != null) {
            String intentVersion = intent.getIntentVersion();
            jsonWriter.name("intentVersion");
            jsonWriter.value(intentVersion);
        }
        jsonWriter.endObject();
    }

    private static IntentJsonMarshaller instance;

    public static IntentJsonMarshaller getInstance() {
        if (instance == null)
            instance = new IntentJsonMarshaller();
        return instance;
    }
}
