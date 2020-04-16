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

package com.amazonaws.services.ssm.model.transform;

import com.amazonaws.services.ssm.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO InventoryDeletionSummaryItem
 */
class InventoryDeletionSummaryItemJsonMarshaller {

    public void marshall(InventoryDeletionSummaryItem inventoryDeletionSummaryItem,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (inventoryDeletionSummaryItem.getVersion() != null) {
            String version = inventoryDeletionSummaryItem.getVersion();
            jsonWriter.name("Version");
            jsonWriter.value(version);
        }
        if (inventoryDeletionSummaryItem.getCount() != null) {
            Integer count = inventoryDeletionSummaryItem.getCount();
            jsonWriter.name("Count");
            jsonWriter.value(count);
        }
        if (inventoryDeletionSummaryItem.getRemainingCount() != null) {
            Integer remainingCount = inventoryDeletionSummaryItem.getRemainingCount();
            jsonWriter.name("RemainingCount");
            jsonWriter.value(remainingCount);
        }
        jsonWriter.endObject();
    }

    private static InventoryDeletionSummaryItemJsonMarshaller instance;

    public static InventoryDeletionSummaryItemJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InventoryDeletionSummaryItemJsonMarshaller();
        return instance;
    }
}
