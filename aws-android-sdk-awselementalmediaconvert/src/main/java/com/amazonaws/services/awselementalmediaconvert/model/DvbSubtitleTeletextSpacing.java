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
 * Only applies to jobs with input captions in Teletext or STL formats. Specify
 * whether the spacing between letters in your captions is set by the captions
 * grid or varies depending on letter width. Choose fixed grid to conform to the
 * spacing specified in the captions file more accurately. Choose proportional
 * to make the text easier to read if the captions are closed caption.
 */
public enum DvbSubtitleTeletextSpacing {

    FIXED_GRID("FIXED_GRID"),
    PROPORTIONAL("PROPORTIONAL");

    private String value;

    private DvbSubtitleTeletextSpacing(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, DvbSubtitleTeletextSpacing> enumMap;
    static {
        enumMap = new HashMap<String, DvbSubtitleTeletextSpacing>();
        enumMap.put("FIXED_GRID", FIXED_GRID);
        enumMap.put("PROPORTIONAL", PROPORTIONAL);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return DvbSubtitleTeletextSpacing corresponding to the value
     */
    public static DvbSubtitleTeletextSpacing fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
