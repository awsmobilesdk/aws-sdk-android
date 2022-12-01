/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.comprehend.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Page Based Error Code
 */
public enum PageBasedErrorCode {

    TEXTRACT_BAD_PAGE("TEXTRACT_BAD_PAGE"),
    TEXTRACT_PROVISIONED_THROUGHPUT_EXCEEDED("TEXTRACT_PROVISIONED_THROUGHPUT_EXCEEDED"),
    PAGE_CHARACTERS_EXCEEDED("PAGE_CHARACTERS_EXCEEDED"),
    PAGE_SIZE_EXCEEDED("PAGE_SIZE_EXCEEDED"),
    INTERNAL_SERVER_ERROR("INTERNAL_SERVER_ERROR");

    private String value;

    private PageBasedErrorCode(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, PageBasedErrorCode> enumMap;
    static {
        enumMap = new HashMap<String, PageBasedErrorCode>();
        enumMap.put("TEXTRACT_BAD_PAGE", TEXTRACT_BAD_PAGE);
        enumMap.put("TEXTRACT_PROVISIONED_THROUGHPUT_EXCEEDED",
                TEXTRACT_PROVISIONED_THROUGHPUT_EXCEEDED);
        enumMap.put("PAGE_CHARACTERS_EXCEEDED", PAGE_CHARACTERS_EXCEEDED);
        enumMap.put("PAGE_SIZE_EXCEEDED", PAGE_SIZE_EXCEEDED);
        enumMap.put("INTERNAL_SERVER_ERROR", INTERNAL_SERVER_ERROR);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return PageBasedErrorCode corresponding to the value
     */
    public static PageBasedErrorCode fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
