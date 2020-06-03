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

package com.amazonaws.services.es.model.transform;

import com.amazonaws.services.es.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO RecurringCharge
 */
class RecurringChargeJsonMarshaller {

    public void marshall(RecurringCharge recurringCharge, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (recurringCharge.getRecurringChargeAmount() != null) {
            Double recurringChargeAmount = recurringCharge.getRecurringChargeAmount();
            jsonWriter.name("RecurringChargeAmount");
            jsonWriter.value(recurringChargeAmount);
        }
        if (recurringCharge.getRecurringChargeFrequency() != null) {
            String recurringChargeFrequency = recurringCharge.getRecurringChargeFrequency();
            jsonWriter.name("RecurringChargeFrequency");
            jsonWriter.value(recurringChargeFrequency);
        }
        jsonWriter.endObject();
    }

    private static RecurringChargeJsonMarshaller instance;

    public static RecurringChargeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RecurringChargeJsonMarshaller();
        return instance;
    }
}
