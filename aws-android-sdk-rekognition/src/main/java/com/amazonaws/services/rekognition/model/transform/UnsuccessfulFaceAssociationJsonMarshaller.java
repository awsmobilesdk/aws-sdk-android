/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO UnsuccessfulFaceAssociation
 */
class UnsuccessfulFaceAssociationJsonMarshaller {

    public void marshall(UnsuccessfulFaceAssociation unsuccessfulFaceAssociation,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (unsuccessfulFaceAssociation.getFaceId() != null) {
            String faceId = unsuccessfulFaceAssociation.getFaceId();
            jsonWriter.name("FaceId");
            jsonWriter.value(faceId);
        }
        if (unsuccessfulFaceAssociation.getUserId() != null) {
            String userId = unsuccessfulFaceAssociation.getUserId();
            jsonWriter.name("UserId");
            jsonWriter.value(userId);
        }
        if (unsuccessfulFaceAssociation.getConfidence() != null) {
            Float confidence = unsuccessfulFaceAssociation.getConfidence();
            jsonWriter.name("Confidence");
            jsonWriter.value(confidence);
        }
        if (unsuccessfulFaceAssociation.getReasons() != null) {
            java.util.List<String> reasons = unsuccessfulFaceAssociation.getReasons();
            jsonWriter.name("Reasons");
            jsonWriter.beginArray();
            for (String reasonsItem : reasons) {
                if (reasonsItem != null) {
                    jsonWriter.value(reasonsItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static UnsuccessfulFaceAssociationJsonMarshaller instance;

    public static UnsuccessfulFaceAssociationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UnsuccessfulFaceAssociationJsonMarshaller();
        return instance;
    }
}
