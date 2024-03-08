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

package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO AccountTakeoverRiskConfigurationType
 */
class AccountTakeoverRiskConfigurationTypeJsonUnmarshaller implements
        Unmarshaller<AccountTakeoverRiskConfigurationType, JsonUnmarshallerContext> {

    public AccountTakeoverRiskConfigurationType unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AccountTakeoverRiskConfigurationType accountTakeoverRiskConfigurationType = new AccountTakeoverRiskConfigurationType();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("NotifyConfiguration")) {
                accountTakeoverRiskConfigurationType
                        .setNotifyConfiguration(NotifyConfigurationTypeJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("Actions")) {
                accountTakeoverRiskConfigurationType
                        .setActions(AccountTakeoverActionsTypeJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return accountTakeoverRiskConfigurationType;
    }

    private static AccountTakeoverRiskConfigurationTypeJsonUnmarshaller instance;

    public static AccountTakeoverRiskConfigurationTypeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AccountTakeoverRiskConfigurationTypeJsonUnmarshaller();
        return instance;
    }
}
