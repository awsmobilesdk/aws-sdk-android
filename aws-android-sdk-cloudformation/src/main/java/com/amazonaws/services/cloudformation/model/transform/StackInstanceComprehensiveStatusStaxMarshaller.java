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

package com.amazonaws.services.cloudformation.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.cloudformation.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO StackInstanceComprehensiveStatus
 */
class StackInstanceComprehensiveStatusStaxMarshaller {

    public void marshall(StackInstanceComprehensiveStatus _stackInstanceComprehensiveStatus,
            Request<?> request, String _prefix) {
        String prefix;
        if (_stackInstanceComprehensiveStatus.getDetailedStatus() != null) {
            prefix = _prefix + "DetailedStatus";
            String detailedStatus = _stackInstanceComprehensiveStatus.getDetailedStatus();
            request.addParameter(prefix, StringUtils.fromString(detailedStatus));
        }
    }

    private static StackInstanceComprehensiveStatusStaxMarshaller instance;

    public static StackInstanceComprehensiveStatusStaxMarshaller getInstance() {
        if (instance == null)
            instance = new StackInstanceComprehensiveStatusStaxMarshaller();
        return instance;
    }
}
