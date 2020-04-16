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

package com.amazonaws.services.awselementalmediaconvert.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Enable this setting to insert I-frames at scene changes that the service
 * automatically detects. This improves video quality and is enabled by default.
 */
public enum Mpeg2SceneChangeDetect {

    DISABLED("DISABLED"),
    ENABLED("ENABLED");

    private String value;

    private Mpeg2SceneChangeDetect(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, Mpeg2SceneChangeDetect> enumMap;
    static {
        enumMap = new HashMap<String, Mpeg2SceneChangeDetect>();
        enumMap.put("DISABLED", DISABLED);
        enumMap.put("ENABLED", ENABLED);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return Mpeg2SceneChangeDetect corresponding to the value
     */
    public static Mpeg2SceneChangeDetect fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
