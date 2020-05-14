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

package com.amazonaws.services.imagebuilder.model.transform;

import com.amazonaws.services.imagebuilder.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO OutputResources
 */
class OutputResourcesJsonMarshaller {

    public void marshall(OutputResources outputResources, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (outputResources.getAmis() != null) {
            java.util.List<Ami> amis = outputResources.getAmis();
            jsonWriter.name("amis");
            jsonWriter.beginArray();
            for (Ami amisItem : amis) {
                if (amisItem != null) {
                    AmiJsonMarshaller.getInstance().marshall(amisItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static OutputResourcesJsonMarshaller instance;

    public static OutputResourcesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new OutputResourcesJsonMarshaller();
        return instance;
    }
}
