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

package com.amazonaws.services.awssecurityhub.model.transform;

import com.amazonaws.services.awssecurityhub.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO IpFilter
 */
class IpFilterJsonMarshaller {

    public void marshall(IpFilter ipFilter, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (ipFilter.getCidr() != null) {
            String cidr = ipFilter.getCidr();
            jsonWriter.name("Cidr");
            jsonWriter.value(cidr);
        }
        jsonWriter.endObject();
    }

    private static IpFilterJsonMarshaller instance;

    public static IpFilterJsonMarshaller getInstance() {
        if (instance == null)
            instance = new IpFilterJsonMarshaller();
        return instance;
    }
}
