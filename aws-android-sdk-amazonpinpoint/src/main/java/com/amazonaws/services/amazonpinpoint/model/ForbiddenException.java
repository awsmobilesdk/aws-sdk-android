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

package com.amazonaws.services.amazonpinpoint.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * Provides information about an API request or response.
 * </p>
 */
public class ForbiddenException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The unique identifier for the request or response.
     * </p>
     */
    private String requestID;

    /**
     * Constructs a new ForbiddenException with the specified error message.
     *
     * @param message Describes the error encountered.
     */
    public ForbiddenException(String message) {
        super(message);
    }

    /**
     * <p>
     * The unique identifier for the request or response.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the request or response.
     *         </p>
     */
    public String getRequestID() {
        return requestID;
    }

    /**
     * <p>
     * The unique identifier for the request or response.
     * </p>
     *
     * @param requestID <p>
     *            The unique identifier for the request or response.
     *            </p>
     */
    public void setRequestID(String requestID) {
        this.requestID = requestID;
    }
}