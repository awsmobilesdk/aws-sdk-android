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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO UnsuccessfulItemError
 */
class UnsuccessfulItemErrorJsonMarshaller {

    public void marshall(UnsuccessfulItemError unsuccessfulItemError, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (unsuccessfulItemError.getCode() != null) {
            String code = unsuccessfulItemError.getCode();
            jsonWriter.name("Code");
            jsonWriter.value(code);
        }
        if (unsuccessfulItemError.getMessage() != null) {
            String message = unsuccessfulItemError.getMessage();
            jsonWriter.name("Message");
            jsonWriter.value(message);
        }
        jsonWriter.endObject();
    }

    private static UnsuccessfulItemErrorJsonMarshaller instance;

    public static UnsuccessfulItemErrorJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UnsuccessfulItemErrorJsonMarshaller();
        return instance;
    }
}
