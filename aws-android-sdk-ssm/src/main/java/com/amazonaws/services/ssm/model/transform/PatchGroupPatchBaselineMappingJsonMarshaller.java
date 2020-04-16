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
 * JSON marshaller for POJO PatchGroupPatchBaselineMapping
 */
class PatchGroupPatchBaselineMappingJsonMarshaller {

    public void marshall(PatchGroupPatchBaselineMapping patchGroupPatchBaselineMapping,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (patchGroupPatchBaselineMapping.getPatchGroup() != null) {
            String patchGroup = patchGroupPatchBaselineMapping.getPatchGroup();
            jsonWriter.name("PatchGroup");
            jsonWriter.value(patchGroup);
        }
        if (patchGroupPatchBaselineMapping.getBaselineIdentity() != null) {
            PatchBaselineIdentity baselineIdentity = patchGroupPatchBaselineMapping
                    .getBaselineIdentity();
            jsonWriter.name("BaselineIdentity");
            PatchBaselineIdentityJsonMarshaller.getInstance()
                    .marshall(baselineIdentity, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static PatchGroupPatchBaselineMappingJsonMarshaller instance;

    public static PatchGroupPatchBaselineMappingJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PatchGroupPatchBaselineMappingJsonMarshaller();
        return instance;
    }
}
