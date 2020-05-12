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

package com.amazonaws.services.iotsitewise.model.transform;

import com.amazonaws.services.iotsitewise.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ErrorDetails
 */
class ErrorDetailsJsonMarshaller {

    public void marshall(ErrorDetails errorDetails, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (errorDetails.getCode() != null) {
            String code = errorDetails.getCode();
            jsonWriter.name("code");
            jsonWriter.value(code);
        }
        if (errorDetails.getMessage() != null) {
            String message = errorDetails.getMessage();
            jsonWriter.name("message");
            jsonWriter.value(message);
        }
        jsonWriter.endObject();
    }

    private static ErrorDetailsJsonMarshaller instance;

    public static ErrorDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ErrorDetailsJsonMarshaller();
        return instance;
    }
}