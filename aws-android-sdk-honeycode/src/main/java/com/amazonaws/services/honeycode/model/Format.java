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

package com.amazonaws.services.honeycode.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Format
 */
public enum Format {

    AUTO("AUTO"),
    NUMBER("NUMBER"),
    CURRENCY("CURRENCY"),
    DATE("DATE"),
    TIME("TIME"),
    DATE_TIME("DATE_TIME"),
    PERCENTAGE("PERCENTAGE"),
    TEXT("TEXT"),
    ACCOUNTING("ACCOUNTING"),
    CONTACT("CONTACT"),
    ROWLINK("ROWLINK");

    private String value;

    private Format(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, Format> enumMap;
    static {
        enumMap = new HashMap<String, Format>();
        enumMap.put("AUTO", AUTO);
        enumMap.put("NUMBER", NUMBER);
        enumMap.put("CURRENCY", CURRENCY);
        enumMap.put("DATE", DATE);
        enumMap.put("TIME", TIME);
        enumMap.put("DATE_TIME", DATE_TIME);
        enumMap.put("PERCENTAGE", PERCENTAGE);
        enumMap.put("TEXT", TEXT);
        enumMap.put("ACCOUNTING", ACCOUNTING);
        enumMap.put("CONTACT", CONTACT);
        enumMap.put("ROWLINK", ROWLINK);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return Format corresponding to the value
     */
    public static Format fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
