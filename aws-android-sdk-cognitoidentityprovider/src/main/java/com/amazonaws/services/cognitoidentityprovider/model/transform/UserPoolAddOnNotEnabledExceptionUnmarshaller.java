/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.JsonErrorResponseHandler.JsonErrorResponse;
import com.amazonaws.transform.JsonErrorUnmarshaller;
import com.amazonaws.services.cognitoidentityprovider.model.UserPoolAddOnNotEnabledException;

public class UserPoolAddOnNotEnabledExceptionUnmarshaller extends JsonErrorUnmarshaller {

    public UserPoolAddOnNotEnabledExceptionUnmarshaller() {
        super(UserPoolAddOnNotEnabledException.class);
    }

    @Override
    public boolean match(JsonErrorResponse error) throws Exception {
        return error.getErrorCode().equals("UserPoolAddOnNotEnabledException");
    }

    @Override
    public AmazonServiceException unmarshall(JsonErrorResponse error) throws Exception {

        UserPoolAddOnNotEnabledException e = (UserPoolAddOnNotEnabledException) super
                .unmarshall(error);
        e.setErrorCode("UserPoolAddOnNotEnabledException");

        return e;
    }
}
