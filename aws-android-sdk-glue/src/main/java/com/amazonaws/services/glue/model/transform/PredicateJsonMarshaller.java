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

package com.amazonaws.services.glue.model.transform;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Predicate
 */
class PredicateJsonMarshaller {

    public void marshall(Predicate predicate, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (predicate.getLogical() != null) {
            String logical = predicate.getLogical();
            jsonWriter.name("Logical");
            jsonWriter.value(logical);
        }
        if (predicate.getConditions() != null) {
            java.util.List<Condition> conditions = predicate.getConditions();
            jsonWriter.name("Conditions");
            jsonWriter.beginArray();
            for (Condition conditionsItem : conditions) {
                if (conditionsItem != null) {
                    ConditionJsonMarshaller.getInstance().marshall(conditionsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static PredicateJsonMarshaller instance;

    public static PredicateJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PredicateJsonMarshaller();
        return instance;
    }
}
