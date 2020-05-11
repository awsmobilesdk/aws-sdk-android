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

package com.amazonaws.services.kendra.model.transform;

import com.amazonaws.services.kendra.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO FacetResult
 */
class FacetResultJsonMarshaller {

    public void marshall(FacetResult facetResult, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (facetResult.getDocumentAttributeKey() != null) {
            String documentAttributeKey = facetResult.getDocumentAttributeKey();
            jsonWriter.name("DocumentAttributeKey");
            jsonWriter.value(documentAttributeKey);
        }
        if (facetResult.getDocumentAttributeValueCountPairs() != null) {
            java.util.List<DocumentAttributeValueCountPair> documentAttributeValueCountPairs = facetResult
                    .getDocumentAttributeValueCountPairs();
            jsonWriter.name("DocumentAttributeValueCountPairs");
            jsonWriter.beginArray();
            for (DocumentAttributeValueCountPair documentAttributeValueCountPairsItem : documentAttributeValueCountPairs) {
                if (documentAttributeValueCountPairsItem != null) {
                    DocumentAttributeValueCountPairJsonMarshaller.getInstance().marshall(
                            documentAttributeValueCountPairsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static FacetResultJsonMarshaller instance;

    public static FacetResultJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FacetResultJsonMarshaller();
        return instance;
    }
}
