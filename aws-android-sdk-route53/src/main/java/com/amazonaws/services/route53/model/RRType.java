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

package com.amazonaws.services.route53.model;

import java.util.HashMap;
import java.util.Map;

/**
 * RRType
 */
public enum RRType {

    SOA("SOA"),
    A("A"),
    TXT("TXT"),
    NS("NS"),
    CNAME("CNAME"),
    MX("MX"),
    NAPTR("NAPTR"),
    PTR("PTR"),
    SRV("SRV"),
    SPF("SPF"),
    AAAA("AAAA"),
    CAA("CAA");

    private String value;

    private RRType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, RRType> enumMap;
    static {
        enumMap = new HashMap<String, RRType>();
        enumMap.put("SOA", SOA);
        enumMap.put("A", A);
        enumMap.put("TXT", TXT);
        enumMap.put("NS", NS);
        enumMap.put("CNAME", CNAME);
        enumMap.put("MX", MX);
        enumMap.put("NAPTR", NAPTR);
        enumMap.put("PTR", PTR);
        enumMap.put("SRV", SRV);
        enumMap.put("SPF", SPF);
        enumMap.put("AAAA", AAAA);
        enumMap.put("CAA", CAA);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return RRType corresponding to the value
     */
    public static RRType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
