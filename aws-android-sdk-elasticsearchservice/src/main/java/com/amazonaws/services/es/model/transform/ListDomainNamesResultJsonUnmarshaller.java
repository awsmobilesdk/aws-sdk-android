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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response ListDomainNamesResult
 */
public class ListDomainNamesResultJsonUnmarshaller implements
        Unmarshaller<ListDomainNamesResult, JsonUnmarshallerContext> {

    public ListDomainNamesResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListDomainNamesResult listDomainNamesResult = new ListDomainNamesResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("DomainNames")) {
                listDomainNamesResult.setDomainNames(new ListUnmarshaller<DomainInfo>(
                        DomainInfoJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return listDomainNamesResult;
    }

    private static ListDomainNamesResultJsonUnmarshaller instance;

    public static ListDomainNamesResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListDomainNamesResultJsonUnmarshaller();
        return instance;
    }
}
