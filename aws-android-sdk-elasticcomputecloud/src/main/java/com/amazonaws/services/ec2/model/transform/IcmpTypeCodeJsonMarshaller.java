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
 * JSON marshaller for POJO IcmpTypeCode
 */
class IcmpTypeCodeJsonMarshaller {

    public void marshall(IcmpTypeCode icmpTypeCode, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (icmpTypeCode.getCode() != null) {
            Integer code = icmpTypeCode.getCode();
            jsonWriter.name("Code");
            jsonWriter.value(code);
        }
        if (icmpTypeCode.getType() != null) {
            Integer type = icmpTypeCode.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        jsonWriter.endObject();
    }

    private static IcmpTypeCodeJsonMarshaller instance;

    public static IcmpTypeCodeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new IcmpTypeCodeJsonMarshaller();
        return instance;
    }
}