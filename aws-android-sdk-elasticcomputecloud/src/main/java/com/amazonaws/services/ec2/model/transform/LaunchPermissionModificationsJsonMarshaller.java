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
 * JSON marshaller for POJO LaunchPermissionModifications
 */
class LaunchPermissionModificationsJsonMarshaller {

    public void marshall(LaunchPermissionModifications launchPermissionModifications,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (launchPermissionModifications.getAdd() != null) {
            java.util.List<LaunchPermission> add = launchPermissionModifications.getAdd();
            jsonWriter.name("Add");
            jsonWriter.beginArray();
            for (LaunchPermission addItem : add) {
                if (addItem != null) {
                    LaunchPermissionJsonMarshaller.getInstance().marshall(addItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (launchPermissionModifications.getRemove() != null) {
            java.util.List<LaunchPermission> remove = launchPermissionModifications.getRemove();
            jsonWriter.name("Remove");
            jsonWriter.beginArray();
            for (LaunchPermission removeItem : remove) {
                if (removeItem != null) {
                    LaunchPermissionJsonMarshaller.getInstance().marshall(removeItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static LaunchPermissionModificationsJsonMarshaller instance;

    public static LaunchPermissionModificationsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LaunchPermissionModificationsJsonMarshaller();
        return instance;
    }
}