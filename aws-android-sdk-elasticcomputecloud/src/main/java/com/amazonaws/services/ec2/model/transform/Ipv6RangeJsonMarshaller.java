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
 * JSON marshaller for POJO Ipv6Range
 */
class Ipv6RangeJsonMarshaller {

    public void marshall(Ipv6Range ipv6Range, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (ipv6Range.getCidrIpv6() != null) {
            String cidrIpv6 = ipv6Range.getCidrIpv6();
            jsonWriter.name("CidrIpv6");
            jsonWriter.value(cidrIpv6);
        }
        if (ipv6Range.getDescription() != null) {
            String description = ipv6Range.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        jsonWriter.endObject();
    }

    private static Ipv6RangeJsonMarshaller instance;

    public static Ipv6RangeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new Ipv6RangeJsonMarshaller();
        return instance;
    }
}