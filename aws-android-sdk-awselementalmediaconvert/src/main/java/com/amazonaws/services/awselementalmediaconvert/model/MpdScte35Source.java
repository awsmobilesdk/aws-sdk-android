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
 * Ignore this setting unless you have SCTE-35 markers in your input video file.
 * Choose Passthrough (PASSTHROUGH) if you want SCTE-35 markers that appear in
 * your input to also appear in this output. Choose None (NONE) if you don't
 * want those SCTE-35 markers in this output.
 */
public enum MpdScte35Source {

    PASSTHROUGH("PASSTHROUGH"),
    NONE("NONE");

    private String value;

    private MpdScte35Source(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, MpdScte35Source> enumMap;
    static {
        enumMap = new HashMap<String, MpdScte35Source>();
        enumMap.put("PASSTHROUGH", PASSTHROUGH);
        enumMap.put("NONE", NONE);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return MpdScte35Source corresponding to the value
     */
    public static MpdScte35Source fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
