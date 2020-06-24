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

package com.amazonaws.services.backup.model.transform;

import com.amazonaws.services.backup.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO Lifecycle
 */
class LifecycleJsonUnmarshaller implements Unmarshaller<Lifecycle, JsonUnmarshallerContext> {

    public Lifecycle unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Lifecycle lifecycle = new Lifecycle();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("MoveToColdStorageAfterDays")) {
                lifecycle.setMoveToColdStorageAfterDays(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DeleteAfterDays")) {
                lifecycle.setDeleteAfterDays(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return lifecycle;
    }

    private static LifecycleJsonUnmarshaller instance;

    public static LifecycleJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new LifecycleJsonUnmarshaller();
        return instance;
    }
}
