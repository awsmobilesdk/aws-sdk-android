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
 * The segmentation style parameter controls how segmentation markers are
 * inserted into the transport stream. With avails, it is possible that segments
 * may be truncated, which can influence where future segmentation markers are
 * inserted. When a segmentation style of "reset_cadence" is selected and a
 * segment is truncated due to an avail, we will reset the segmentation cadence.
 * This means the subsequent segment will have a duration of of
 * $segmentation_time seconds. When a segmentation style of "maintain_cadence"
 * is selected and a segment is truncated due to an avail, we will not reset the
 * segmentation cadence. This means the subsequent segment will likely be
 * truncated as well. However, all segments after that will have a duration of
 * $segmentation_time seconds. Note that EBP lookahead is a slight exception to
 * this rule.
 */
public enum M2tsSegmentationStyle {

    MAINTAIN_CADENCE("MAINTAIN_CADENCE"),
    RESET_CADENCE("RESET_CADENCE");

    private String value;

    private M2tsSegmentationStyle(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, M2tsSegmentationStyle> enumMap;
    static {
        enumMap = new HashMap<String, M2tsSegmentationStyle>();
        enumMap.put("MAINTAIN_CADENCE", MAINTAIN_CADENCE);
        enumMap.put("RESET_CADENCE", RESET_CADENCE);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return M2tsSegmentationStyle corresponding to the value
     */
    public static M2tsSegmentationStyle fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
