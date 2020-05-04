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
package com.amazonaws.services.s3-control.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.s3-control.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO S3Grantee
 */
class S3GranteeStaxMarshaller {

    public void marshall(S3Grantee _s3Grantee, Request<?> request, String _prefix) {
        String prefix;
        if (_s3Grantee.getTypeIdentifier() != null) {
            prefix = _prefix + "TypeIdentifier";
            String typeIdentifier = _s3Grantee.getTypeIdentifier();
            request.addParameter(prefix, StringUtils.fromString(typeIdentifier));
        }
        if (_s3Grantee.getIdentifier() != null) {
            prefix = _prefix + "Identifier";
            String identifier = _s3Grantee.getIdentifier();
            request.addParameter(prefix, StringUtils.fromString(identifier));
        }
        if (_s3Grantee.getDisplayName() != null) {
            prefix = _prefix + "DisplayName";
            String displayName = _s3Grantee.getDisplayName();
            request.addParameter(prefix, StringUtils.fromString(displayName));
        }
    }

    private static S3GranteeStaxMarshaller instance;
    public static S3GranteeStaxMarshaller getInstance() {
        if (instance == null) instance = new S3GranteeStaxMarshaller();
        return instance;
    }
}
