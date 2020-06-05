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

package com.amazonaws.services.elasticbeanstalk.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.elasticbeanstalk.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO Queue
 */
class QueueStaxMarshaller {

    public void marshall(Queue _queue, Request<?> request, String _prefix) {
        String prefix;
        if (_queue.getName() != null) {
            prefix = _prefix + "Name";
            String name = _queue.getName();
            request.addParameter(prefix, StringUtils.fromString(name));
        }
        if (_queue.getURL() != null) {
            prefix = _prefix + "URL";
            String uRL = _queue.getURL();
            request.addParameter(prefix, StringUtils.fromString(uRL));
        }
    }

    private static QueueStaxMarshaller instance;

    public static QueueStaxMarshaller getInstance() {
        if (instance == null)
            instance = new QueueStaxMarshaller();
        return instance;
    }
}