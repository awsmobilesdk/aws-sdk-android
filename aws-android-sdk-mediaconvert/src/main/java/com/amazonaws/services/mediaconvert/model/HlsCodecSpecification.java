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

package com.amazonaws.services.mediaconvert.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Specification to use (RFC-6381 or the default RFC-4281) during m3u8 playlist
 * generation.
 */
public enum HlsCodecSpecification {

    RFC_6381("RFC_6381"),
    RFC_4281("RFC_4281");

    private String value;

    private HlsCodecSpecification(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, HlsCodecSpecification> enumMap;
    static {
        enumMap = new HashMap<String, HlsCodecSpecification>();
        enumMap.put("RFC_6381", RFC_6381);
        enumMap.put("RFC_4281", RFC_4281);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return HlsCodecSpecification corresponding to the value
     */
    public static HlsCodecSpecification fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
