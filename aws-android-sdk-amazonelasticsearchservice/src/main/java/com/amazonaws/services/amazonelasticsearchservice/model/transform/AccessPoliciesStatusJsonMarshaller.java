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

package com.amazonaws.services.amazonelasticsearchservice.model.transform;

import com.amazonaws.services.amazonelasticsearchservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AccessPoliciesStatus
 */
class AccessPoliciesStatusJsonMarshaller {

    public void marshall(AccessPoliciesStatus accessPoliciesStatus, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (accessPoliciesStatus.getOptions() != null) {
            String options = accessPoliciesStatus.getOptions();
            jsonWriter.name("Options");
            jsonWriter.value(options);
        }
        if (accessPoliciesStatus.getStatus() != null) {
            OptionStatus status = accessPoliciesStatus.getStatus();
            jsonWriter.name("Status");
            OptionStatusJsonMarshaller.getInstance().marshall(status, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static AccessPoliciesStatusJsonMarshaller instance;

    public static AccessPoliciesStatusJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AccessPoliciesStatusJsonMarshaller();
        return instance;
    }
}
