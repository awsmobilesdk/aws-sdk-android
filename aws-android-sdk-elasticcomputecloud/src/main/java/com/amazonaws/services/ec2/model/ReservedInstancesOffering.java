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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a Reserved Instance offering.
 * </p>
 */
public class ReservedInstancesOffering implements Serializable {
    /**
     * <p>
     * The Availability Zone in which the Reserved Instance can be used.
     * </p>
     */
    private String availabilityZone;

    /**
     * <p>
     * The duration of the Reserved Instance, in seconds.
     * </p>
     */
    private Long duration;

    /**
     * <p>
     * The purchase price of the Reserved Instance.
     * </p>
     */
    private Float fixedPrice;

    /**
     * <p>
     * The instance type on which the Reserved Instance can be used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, t2.nano, t2.micro, t2.small, t2.medium,
     * t2.large, t2.xlarge, t2.2xlarge, t3.nano, t3.micro, t3.small, t3.medium,
     * t3.large, t3.xlarge, t3.2xlarge, t3a.nano, t3a.micro, t3a.small,
     * t3a.medium, t3a.large, t3a.xlarge, t3a.2xlarge, m1.small, m1.medium,
     * m1.large, m1.xlarge, m3.medium, m3.large, m3.xlarge, m3.2xlarge,
     * m4.large, m4.xlarge, m4.2xlarge, m4.4xlarge, m4.10xlarge, m4.16xlarge,
     * m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, r3.large, r3.xlarge,
     * r3.2xlarge, r3.4xlarge, r3.8xlarge, r4.large, r4.xlarge, r4.2xlarge,
     * r4.4xlarge, r4.8xlarge, r4.16xlarge, r5.large, r5.xlarge, r5.2xlarge,
     * r5.4xlarge, r5.8xlarge, r5.12xlarge, r5.16xlarge, r5.24xlarge, r5.metal,
     * r5a.large, r5a.xlarge, r5a.2xlarge, r5a.4xlarge, r5a.8xlarge,
     * r5a.12xlarge, r5a.16xlarge, r5a.24xlarge, r5d.large, r5d.xlarge,
     * r5d.2xlarge, r5d.4xlarge, r5d.8xlarge, r5d.12xlarge, r5d.16xlarge,
     * r5d.24xlarge, r5d.metal, r5ad.large, r5ad.xlarge, r5ad.2xlarge,
     * r5ad.4xlarge, r5ad.8xlarge, r5ad.12xlarge, r5ad.16xlarge, r5ad.24xlarge,
     * x1.16xlarge, x1.32xlarge, x1e.xlarge, x1e.2xlarge, x1e.4xlarge,
     * x1e.8xlarge, x1e.16xlarge, x1e.32xlarge, i2.xlarge, i2.2xlarge,
     * i2.4xlarge, i2.8xlarge, i3.large, i3.xlarge, i3.2xlarge, i3.4xlarge,
     * i3.8xlarge, i3.16xlarge, i3.metal, i3en.large, i3en.xlarge, i3en.2xlarge,
     * i3en.3xlarge, i3en.6xlarge, i3en.12xlarge, i3en.24xlarge, i3en.metal,
     * hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge,
     * c3.2xlarge, c3.4xlarge, c3.8xlarge, c4.large, c4.xlarge, c4.2xlarge,
     * c4.4xlarge, c4.8xlarge, c5.large, c5.xlarge, c5.2xlarge, c5.4xlarge,
     * c5.9xlarge, c5.12xlarge, c5.18xlarge, c5.24xlarge, c5.metal, c5d.large,
     * c5d.xlarge, c5d.2xlarge, c5d.4xlarge, c5d.9xlarge, c5d.12xlarge,
     * c5d.18xlarge, c5d.24xlarge, c5d.metal, c5n.large, c5n.xlarge,
     * c5n.2xlarge, c5n.4xlarge, c5n.9xlarge, c5n.18xlarge, cc1.4xlarge,
     * cc2.8xlarge, g2.2xlarge, g2.8xlarge, g3.4xlarge, g3.8xlarge, g3.16xlarge,
     * g3s.xlarge, g4dn.xlarge, g4dn.2xlarge, g4dn.4xlarge, g4dn.8xlarge,
     * g4dn.12xlarge, g4dn.16xlarge, cg1.4xlarge, p2.xlarge, p2.8xlarge,
     * p2.16xlarge, p3.2xlarge, p3.8xlarge, p3.16xlarge, p3dn.24xlarge,
     * d2.xlarge, d2.2xlarge, d2.4xlarge, d2.8xlarge, f1.2xlarge, f1.4xlarge,
     * f1.16xlarge, m5.large, m5.xlarge, m5.2xlarge, m5.4xlarge, m5.8xlarge,
     * m5.12xlarge, m5.16xlarge, m5.24xlarge, m5.metal, m5a.large, m5a.xlarge,
     * m5a.2xlarge, m5a.4xlarge, m5a.8xlarge, m5a.12xlarge, m5a.16xlarge,
     * m5a.24xlarge, m5d.large, m5d.xlarge, m5d.2xlarge, m5d.4xlarge,
     * m5d.8xlarge, m5d.12xlarge, m5d.16xlarge, m5d.24xlarge, m5d.metal,
     * m5ad.large, m5ad.xlarge, m5ad.2xlarge, m5ad.4xlarge, m5ad.8xlarge,
     * m5ad.12xlarge, m5ad.16xlarge, m5ad.24xlarge, h1.2xlarge, h1.4xlarge,
     * h1.8xlarge, h1.16xlarge, z1d.large, z1d.xlarge, z1d.2xlarge, z1d.3xlarge,
     * z1d.6xlarge, z1d.12xlarge, z1d.metal, u-6tb1.metal, u-9tb1.metal,
     * u-12tb1.metal, u-18tb1.metal, u-24tb1.metal, a1.medium, a1.large,
     * a1.xlarge, a1.2xlarge, a1.4xlarge, a1.metal, m5dn.large, m5dn.xlarge,
     * m5dn.2xlarge, m5dn.4xlarge, m5dn.8xlarge, m5dn.12xlarge, m5dn.16xlarge,
     * m5dn.24xlarge, m5n.large, m5n.xlarge, m5n.2xlarge, m5n.4xlarge,
     * m5n.8xlarge, m5n.12xlarge, m5n.16xlarge, m5n.24xlarge, r5dn.large,
     * r5dn.xlarge, r5dn.2xlarge, r5dn.4xlarge, r5dn.8xlarge, r5dn.12xlarge,
     * r5dn.16xlarge, r5dn.24xlarge, r5n.large, r5n.xlarge, r5n.2xlarge,
     * r5n.4xlarge, r5n.8xlarge, r5n.12xlarge, r5n.16xlarge, r5n.24xlarge,
     * inf1.xlarge, inf1.2xlarge, inf1.6xlarge, inf1.24xlarge
     */
    private String instanceType;

    /**
     * <p>
     * The Reserved Instance product platform description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Linux/UNIX, Linux/UNIX (Amazon VPC), Windows,
     * Windows (Amazon VPC)
     */
    private String productDescription;

    /**
     * <p>
     * The ID of the Reserved Instance offering. This is the offering ID used in
     * <a>GetReservedInstancesExchangeQuote</a> to confirm that an exchange can
     * be made.
     * </p>
     */
    private String reservedInstancesOfferingId;

    /**
     * <p>
     * The usage price of the Reserved Instance, per hour.
     * </p>
     */
    private Float usagePrice;

    /**
     * <p>
     * The currency of the Reserved Instance offering you are purchasing. It's
     * specified using ISO 4217 standard currency codes. At this time, the only
     * supported currency is <code>USD</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USD
     */
    private String currencyCode;

    /**
     * <p>
     * The tenancy of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated, host
     */
    private String instanceTenancy;

    /**
     * <p>
     * Indicates whether the offering is available through the Reserved Instance
     * Marketplace (resale) or AWS. If it's a Reserved Instance Marketplace
     * offering, this is <code>true</code>.
     * </p>
     */
    private Boolean marketplace;

    /**
     * <p>
     * If <code>convertible</code> it can be exchanged for Reserved Instances of
     * the same or higher monetary value, with different configurations. If
     * <code>standard</code>, it is not possible to perform an exchange.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, convertible
     */
    private String offeringClass;

    /**
     * <p>
     * The Reserved Instance offering type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Heavy Utilization, Medium Utilization, Light
     * Utilization, No Upfront, Partial Upfront, All Upfront
     */
    private String offeringType;

    /**
     * <p>
     * The pricing details of the Reserved Instance offering.
     * </p>
     */
    private java.util.List<PricingDetail> pricingDetails;

    /**
     * <p>
     * The recurring charge tag assigned to the resource.
     * </p>
     */
    private java.util.List<RecurringCharge> recurringCharges;

    /**
     * <p>
     * Whether the Reserved Instance is applied to instances in a Region or an
     * Availability Zone.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Availability Zone, Region
     */
    private String scope;

    /**
     * <p>
     * The Availability Zone in which the Reserved Instance can be used.
     * </p>
     *
     * @return <p>
     *         The Availability Zone in which the Reserved Instance can be used.
     *         </p>
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone in which the Reserved Instance can be used.
     * </p>
     *
     * @param availabilityZone <p>
     *            The Availability Zone in which the Reserved Instance can be
     *            used.
     *            </p>
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone in which the Reserved Instance can be used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZone <p>
     *            The Availability Zone in which the Reserved Instance can be
     *            used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedInstancesOffering withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * <p>
     * The duration of the Reserved Instance, in seconds.
     * </p>
     *
     * @return <p>
     *         The duration of the Reserved Instance, in seconds.
     *         </p>
     */
    public Long getDuration() {
        return duration;
    }

    /**
     * <p>
     * The duration of the Reserved Instance, in seconds.
     * </p>
     *
     * @param duration <p>
     *            The duration of the Reserved Instance, in seconds.
     *            </p>
     */
    public void setDuration(Long duration) {
        this.duration = duration;
    }

    /**
     * <p>
     * The duration of the Reserved Instance, in seconds.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param duration <p>
     *            The duration of the Reserved Instance, in seconds.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedInstancesOffering withDuration(Long duration) {
        this.duration = duration;
        return this;
    }

    /**
     * <p>
     * The purchase price of the Reserved Instance.
     * </p>
     *
     * @return <p>
     *         The purchase price of the Reserved Instance.
     *         </p>
     */
    public Float getFixedPrice() {
        return fixedPrice;
    }

    /**
     * <p>
     * The purchase price of the Reserved Instance.
     * </p>
     *
     * @param fixedPrice <p>
     *            The purchase price of the Reserved Instance.
     *            </p>
     */
    public void setFixedPrice(Float fixedPrice) {
        this.fixedPrice = fixedPrice;
    }

    /**
     * <p>
     * The purchase price of the Reserved Instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fixedPrice <p>
     *            The purchase price of the Reserved Instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedInstancesOffering withFixedPrice(Float fixedPrice) {
        this.fixedPrice = fixedPrice;
        return this;
    }

    /**
     * <p>
     * The instance type on which the Reserved Instance can be used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, t2.nano, t2.micro, t2.small, t2.medium,
     * t2.large, t2.xlarge, t2.2xlarge, t3.nano, t3.micro, t3.small, t3.medium,
     * t3.large, t3.xlarge, t3.2xlarge, t3a.nano, t3a.micro, t3a.small,
     * t3a.medium, t3a.large, t3a.xlarge, t3a.2xlarge, m1.small, m1.medium,
     * m1.large, m1.xlarge, m3.medium, m3.large, m3.xlarge, m3.2xlarge,
     * m4.large, m4.xlarge, m4.2xlarge, m4.4xlarge, m4.10xlarge, m4.16xlarge,
     * m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, r3.large, r3.xlarge,
     * r3.2xlarge, r3.4xlarge, r3.8xlarge, r4.large, r4.xlarge, r4.2xlarge,
     * r4.4xlarge, r4.8xlarge, r4.16xlarge, r5.large, r5.xlarge, r5.2xlarge,
     * r5.4xlarge, r5.8xlarge, r5.12xlarge, r5.16xlarge, r5.24xlarge, r5.metal,
     * r5a.large, r5a.xlarge, r5a.2xlarge, r5a.4xlarge, r5a.8xlarge,
     * r5a.12xlarge, r5a.16xlarge, r5a.24xlarge, r5d.large, r5d.xlarge,
     * r5d.2xlarge, r5d.4xlarge, r5d.8xlarge, r5d.12xlarge, r5d.16xlarge,
     * r5d.24xlarge, r5d.metal, r5ad.large, r5ad.xlarge, r5ad.2xlarge,
     * r5ad.4xlarge, r5ad.8xlarge, r5ad.12xlarge, r5ad.16xlarge, r5ad.24xlarge,
     * x1.16xlarge, x1.32xlarge, x1e.xlarge, x1e.2xlarge, x1e.4xlarge,
     * x1e.8xlarge, x1e.16xlarge, x1e.32xlarge, i2.xlarge, i2.2xlarge,
     * i2.4xlarge, i2.8xlarge, i3.large, i3.xlarge, i3.2xlarge, i3.4xlarge,
     * i3.8xlarge, i3.16xlarge, i3.metal, i3en.large, i3en.xlarge, i3en.2xlarge,
     * i3en.3xlarge, i3en.6xlarge, i3en.12xlarge, i3en.24xlarge, i3en.metal,
     * hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge,
     * c3.2xlarge, c3.4xlarge, c3.8xlarge, c4.large, c4.xlarge, c4.2xlarge,
     * c4.4xlarge, c4.8xlarge, c5.large, c5.xlarge, c5.2xlarge, c5.4xlarge,
     * c5.9xlarge, c5.12xlarge, c5.18xlarge, c5.24xlarge, c5.metal, c5d.large,
     * c5d.xlarge, c5d.2xlarge, c5d.4xlarge, c5d.9xlarge, c5d.12xlarge,
     * c5d.18xlarge, c5d.24xlarge, c5d.metal, c5n.large, c5n.xlarge,
     * c5n.2xlarge, c5n.4xlarge, c5n.9xlarge, c5n.18xlarge, cc1.4xlarge,
     * cc2.8xlarge, g2.2xlarge, g2.8xlarge, g3.4xlarge, g3.8xlarge, g3.16xlarge,
     * g3s.xlarge, g4dn.xlarge, g4dn.2xlarge, g4dn.4xlarge, g4dn.8xlarge,
     * g4dn.12xlarge, g4dn.16xlarge, cg1.4xlarge, p2.xlarge, p2.8xlarge,
     * p2.16xlarge, p3.2xlarge, p3.8xlarge, p3.16xlarge, p3dn.24xlarge,
     * d2.xlarge, d2.2xlarge, d2.4xlarge, d2.8xlarge, f1.2xlarge, f1.4xlarge,
     * f1.16xlarge, m5.large, m5.xlarge, m5.2xlarge, m5.4xlarge, m5.8xlarge,
     * m5.12xlarge, m5.16xlarge, m5.24xlarge, m5.metal, m5a.large, m5a.xlarge,
     * m5a.2xlarge, m5a.4xlarge, m5a.8xlarge, m5a.12xlarge, m5a.16xlarge,
     * m5a.24xlarge, m5d.large, m5d.xlarge, m5d.2xlarge, m5d.4xlarge,
     * m5d.8xlarge, m5d.12xlarge, m5d.16xlarge, m5d.24xlarge, m5d.metal,
     * m5ad.large, m5ad.xlarge, m5ad.2xlarge, m5ad.4xlarge, m5ad.8xlarge,
     * m5ad.12xlarge, m5ad.16xlarge, m5ad.24xlarge, h1.2xlarge, h1.4xlarge,
     * h1.8xlarge, h1.16xlarge, z1d.large, z1d.xlarge, z1d.2xlarge, z1d.3xlarge,
     * z1d.6xlarge, z1d.12xlarge, z1d.metal, u-6tb1.metal, u-9tb1.metal,
     * u-12tb1.metal, u-18tb1.metal, u-24tb1.metal, a1.medium, a1.large,
     * a1.xlarge, a1.2xlarge, a1.4xlarge, a1.metal, m5dn.large, m5dn.xlarge,
     * m5dn.2xlarge, m5dn.4xlarge, m5dn.8xlarge, m5dn.12xlarge, m5dn.16xlarge,
     * m5dn.24xlarge, m5n.large, m5n.xlarge, m5n.2xlarge, m5n.4xlarge,
     * m5n.8xlarge, m5n.12xlarge, m5n.16xlarge, m5n.24xlarge, r5dn.large,
     * r5dn.xlarge, r5dn.2xlarge, r5dn.4xlarge, r5dn.8xlarge, r5dn.12xlarge,
     * r5dn.16xlarge, r5dn.24xlarge, r5n.large, r5n.xlarge, r5n.2xlarge,
     * r5n.4xlarge, r5n.8xlarge, r5n.12xlarge, r5n.16xlarge, r5n.24xlarge,
     * inf1.xlarge, inf1.2xlarge, inf1.6xlarge, inf1.24xlarge
     *
     * @return <p>
     *         The instance type on which the Reserved Instance can be used.
     *         </p>
     * @see InstanceType
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * <p>
     * The instance type on which the Reserved Instance can be used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, t2.nano, t2.micro, t2.small, t2.medium,
     * t2.large, t2.xlarge, t2.2xlarge, t3.nano, t3.micro, t3.small, t3.medium,
     * t3.large, t3.xlarge, t3.2xlarge, t3a.nano, t3a.micro, t3a.small,
     * t3a.medium, t3a.large, t3a.xlarge, t3a.2xlarge, m1.small, m1.medium,
     * m1.large, m1.xlarge, m3.medium, m3.large, m3.xlarge, m3.2xlarge,
     * m4.large, m4.xlarge, m4.2xlarge, m4.4xlarge, m4.10xlarge, m4.16xlarge,
     * m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, r3.large, r3.xlarge,
     * r3.2xlarge, r3.4xlarge, r3.8xlarge, r4.large, r4.xlarge, r4.2xlarge,
     * r4.4xlarge, r4.8xlarge, r4.16xlarge, r5.large, r5.xlarge, r5.2xlarge,
     * r5.4xlarge, r5.8xlarge, r5.12xlarge, r5.16xlarge, r5.24xlarge, r5.metal,
     * r5a.large, r5a.xlarge, r5a.2xlarge, r5a.4xlarge, r5a.8xlarge,
     * r5a.12xlarge, r5a.16xlarge, r5a.24xlarge, r5d.large, r5d.xlarge,
     * r5d.2xlarge, r5d.4xlarge, r5d.8xlarge, r5d.12xlarge, r5d.16xlarge,
     * r5d.24xlarge, r5d.metal, r5ad.large, r5ad.xlarge, r5ad.2xlarge,
     * r5ad.4xlarge, r5ad.8xlarge, r5ad.12xlarge, r5ad.16xlarge, r5ad.24xlarge,
     * x1.16xlarge, x1.32xlarge, x1e.xlarge, x1e.2xlarge, x1e.4xlarge,
     * x1e.8xlarge, x1e.16xlarge, x1e.32xlarge, i2.xlarge, i2.2xlarge,
     * i2.4xlarge, i2.8xlarge, i3.large, i3.xlarge, i3.2xlarge, i3.4xlarge,
     * i3.8xlarge, i3.16xlarge, i3.metal, i3en.large, i3en.xlarge, i3en.2xlarge,
     * i3en.3xlarge, i3en.6xlarge, i3en.12xlarge, i3en.24xlarge, i3en.metal,
     * hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge,
     * c3.2xlarge, c3.4xlarge, c3.8xlarge, c4.large, c4.xlarge, c4.2xlarge,
     * c4.4xlarge, c4.8xlarge, c5.large, c5.xlarge, c5.2xlarge, c5.4xlarge,
     * c5.9xlarge, c5.12xlarge, c5.18xlarge, c5.24xlarge, c5.metal, c5d.large,
     * c5d.xlarge, c5d.2xlarge, c5d.4xlarge, c5d.9xlarge, c5d.12xlarge,
     * c5d.18xlarge, c5d.24xlarge, c5d.metal, c5n.large, c5n.xlarge,
     * c5n.2xlarge, c5n.4xlarge, c5n.9xlarge, c5n.18xlarge, cc1.4xlarge,
     * cc2.8xlarge, g2.2xlarge, g2.8xlarge, g3.4xlarge, g3.8xlarge, g3.16xlarge,
     * g3s.xlarge, g4dn.xlarge, g4dn.2xlarge, g4dn.4xlarge, g4dn.8xlarge,
     * g4dn.12xlarge, g4dn.16xlarge, cg1.4xlarge, p2.xlarge, p2.8xlarge,
     * p2.16xlarge, p3.2xlarge, p3.8xlarge, p3.16xlarge, p3dn.24xlarge,
     * d2.xlarge, d2.2xlarge, d2.4xlarge, d2.8xlarge, f1.2xlarge, f1.4xlarge,
     * f1.16xlarge, m5.large, m5.xlarge, m5.2xlarge, m5.4xlarge, m5.8xlarge,
     * m5.12xlarge, m5.16xlarge, m5.24xlarge, m5.metal, m5a.large, m5a.xlarge,
     * m5a.2xlarge, m5a.4xlarge, m5a.8xlarge, m5a.12xlarge, m5a.16xlarge,
     * m5a.24xlarge, m5d.large, m5d.xlarge, m5d.2xlarge, m5d.4xlarge,
     * m5d.8xlarge, m5d.12xlarge, m5d.16xlarge, m5d.24xlarge, m5d.metal,
     * m5ad.large, m5ad.xlarge, m5ad.2xlarge, m5ad.4xlarge, m5ad.8xlarge,
     * m5ad.12xlarge, m5ad.16xlarge, m5ad.24xlarge, h1.2xlarge, h1.4xlarge,
     * h1.8xlarge, h1.16xlarge, z1d.large, z1d.xlarge, z1d.2xlarge, z1d.3xlarge,
     * z1d.6xlarge, z1d.12xlarge, z1d.metal, u-6tb1.metal, u-9tb1.metal,
     * u-12tb1.metal, u-18tb1.metal, u-24tb1.metal, a1.medium, a1.large,
     * a1.xlarge, a1.2xlarge, a1.4xlarge, a1.metal, m5dn.large, m5dn.xlarge,
     * m5dn.2xlarge, m5dn.4xlarge, m5dn.8xlarge, m5dn.12xlarge, m5dn.16xlarge,
     * m5dn.24xlarge, m5n.large, m5n.xlarge, m5n.2xlarge, m5n.4xlarge,
     * m5n.8xlarge, m5n.12xlarge, m5n.16xlarge, m5n.24xlarge, r5dn.large,
     * r5dn.xlarge, r5dn.2xlarge, r5dn.4xlarge, r5dn.8xlarge, r5dn.12xlarge,
     * r5dn.16xlarge, r5dn.24xlarge, r5n.large, r5n.xlarge, r5n.2xlarge,
     * r5n.4xlarge, r5n.8xlarge, r5n.12xlarge, r5n.16xlarge, r5n.24xlarge,
     * inf1.xlarge, inf1.2xlarge, inf1.6xlarge, inf1.24xlarge
     *
     * @param instanceType <p>
     *            The instance type on which the Reserved Instance can be used.
     *            </p>
     * @see InstanceType
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type on which the Reserved Instance can be used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, t2.nano, t2.micro, t2.small, t2.medium,
     * t2.large, t2.xlarge, t2.2xlarge, t3.nano, t3.micro, t3.small, t3.medium,
     * t3.large, t3.xlarge, t3.2xlarge, t3a.nano, t3a.micro, t3a.small,
     * t3a.medium, t3a.large, t3a.xlarge, t3a.2xlarge, m1.small, m1.medium,
     * m1.large, m1.xlarge, m3.medium, m3.large, m3.xlarge, m3.2xlarge,
     * m4.large, m4.xlarge, m4.2xlarge, m4.4xlarge, m4.10xlarge, m4.16xlarge,
     * m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, r3.large, r3.xlarge,
     * r3.2xlarge, r3.4xlarge, r3.8xlarge, r4.large, r4.xlarge, r4.2xlarge,
     * r4.4xlarge, r4.8xlarge, r4.16xlarge, r5.large, r5.xlarge, r5.2xlarge,
     * r5.4xlarge, r5.8xlarge, r5.12xlarge, r5.16xlarge, r5.24xlarge, r5.metal,
     * r5a.large, r5a.xlarge, r5a.2xlarge, r5a.4xlarge, r5a.8xlarge,
     * r5a.12xlarge, r5a.16xlarge, r5a.24xlarge, r5d.large, r5d.xlarge,
     * r5d.2xlarge, r5d.4xlarge, r5d.8xlarge, r5d.12xlarge, r5d.16xlarge,
     * r5d.24xlarge, r5d.metal, r5ad.large, r5ad.xlarge, r5ad.2xlarge,
     * r5ad.4xlarge, r5ad.8xlarge, r5ad.12xlarge, r5ad.16xlarge, r5ad.24xlarge,
     * x1.16xlarge, x1.32xlarge, x1e.xlarge, x1e.2xlarge, x1e.4xlarge,
     * x1e.8xlarge, x1e.16xlarge, x1e.32xlarge, i2.xlarge, i2.2xlarge,
     * i2.4xlarge, i2.8xlarge, i3.large, i3.xlarge, i3.2xlarge, i3.4xlarge,
     * i3.8xlarge, i3.16xlarge, i3.metal, i3en.large, i3en.xlarge, i3en.2xlarge,
     * i3en.3xlarge, i3en.6xlarge, i3en.12xlarge, i3en.24xlarge, i3en.metal,
     * hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge,
     * c3.2xlarge, c3.4xlarge, c3.8xlarge, c4.large, c4.xlarge, c4.2xlarge,
     * c4.4xlarge, c4.8xlarge, c5.large, c5.xlarge, c5.2xlarge, c5.4xlarge,
     * c5.9xlarge, c5.12xlarge, c5.18xlarge, c5.24xlarge, c5.metal, c5d.large,
     * c5d.xlarge, c5d.2xlarge, c5d.4xlarge, c5d.9xlarge, c5d.12xlarge,
     * c5d.18xlarge, c5d.24xlarge, c5d.metal, c5n.large, c5n.xlarge,
     * c5n.2xlarge, c5n.4xlarge, c5n.9xlarge, c5n.18xlarge, cc1.4xlarge,
     * cc2.8xlarge, g2.2xlarge, g2.8xlarge, g3.4xlarge, g3.8xlarge, g3.16xlarge,
     * g3s.xlarge, g4dn.xlarge, g4dn.2xlarge, g4dn.4xlarge, g4dn.8xlarge,
     * g4dn.12xlarge, g4dn.16xlarge, cg1.4xlarge, p2.xlarge, p2.8xlarge,
     * p2.16xlarge, p3.2xlarge, p3.8xlarge, p3.16xlarge, p3dn.24xlarge,
     * d2.xlarge, d2.2xlarge, d2.4xlarge, d2.8xlarge, f1.2xlarge, f1.4xlarge,
     * f1.16xlarge, m5.large, m5.xlarge, m5.2xlarge, m5.4xlarge, m5.8xlarge,
     * m5.12xlarge, m5.16xlarge, m5.24xlarge, m5.metal, m5a.large, m5a.xlarge,
     * m5a.2xlarge, m5a.4xlarge, m5a.8xlarge, m5a.12xlarge, m5a.16xlarge,
     * m5a.24xlarge, m5d.large, m5d.xlarge, m5d.2xlarge, m5d.4xlarge,
     * m5d.8xlarge, m5d.12xlarge, m5d.16xlarge, m5d.24xlarge, m5d.metal,
     * m5ad.large, m5ad.xlarge, m5ad.2xlarge, m5ad.4xlarge, m5ad.8xlarge,
     * m5ad.12xlarge, m5ad.16xlarge, m5ad.24xlarge, h1.2xlarge, h1.4xlarge,
     * h1.8xlarge, h1.16xlarge, z1d.large, z1d.xlarge, z1d.2xlarge, z1d.3xlarge,
     * z1d.6xlarge, z1d.12xlarge, z1d.metal, u-6tb1.metal, u-9tb1.metal,
     * u-12tb1.metal, u-18tb1.metal, u-24tb1.metal, a1.medium, a1.large,
     * a1.xlarge, a1.2xlarge, a1.4xlarge, a1.metal, m5dn.large, m5dn.xlarge,
     * m5dn.2xlarge, m5dn.4xlarge, m5dn.8xlarge, m5dn.12xlarge, m5dn.16xlarge,
     * m5dn.24xlarge, m5n.large, m5n.xlarge, m5n.2xlarge, m5n.4xlarge,
     * m5n.8xlarge, m5n.12xlarge, m5n.16xlarge, m5n.24xlarge, r5dn.large,
     * r5dn.xlarge, r5dn.2xlarge, r5dn.4xlarge, r5dn.8xlarge, r5dn.12xlarge,
     * r5dn.16xlarge, r5dn.24xlarge, r5n.large, r5n.xlarge, r5n.2xlarge,
     * r5n.4xlarge, r5n.8xlarge, r5n.12xlarge, r5n.16xlarge, r5n.24xlarge,
     * inf1.xlarge, inf1.2xlarge, inf1.6xlarge, inf1.24xlarge
     *
     * @param instanceType <p>
     *            The instance type on which the Reserved Instance can be used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceType
     */
    public ReservedInstancesOffering withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * <p>
     * The instance type on which the Reserved Instance can be used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, t2.nano, t2.micro, t2.small, t2.medium,
     * t2.large, t2.xlarge, t2.2xlarge, t3.nano, t3.micro, t3.small, t3.medium,
     * t3.large, t3.xlarge, t3.2xlarge, t3a.nano, t3a.micro, t3a.small,
     * t3a.medium, t3a.large, t3a.xlarge, t3a.2xlarge, m1.small, m1.medium,
     * m1.large, m1.xlarge, m3.medium, m3.large, m3.xlarge, m3.2xlarge,
     * m4.large, m4.xlarge, m4.2xlarge, m4.4xlarge, m4.10xlarge, m4.16xlarge,
     * m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, r3.large, r3.xlarge,
     * r3.2xlarge, r3.4xlarge, r3.8xlarge, r4.large, r4.xlarge, r4.2xlarge,
     * r4.4xlarge, r4.8xlarge, r4.16xlarge, r5.large, r5.xlarge, r5.2xlarge,
     * r5.4xlarge, r5.8xlarge, r5.12xlarge, r5.16xlarge, r5.24xlarge, r5.metal,
     * r5a.large, r5a.xlarge, r5a.2xlarge, r5a.4xlarge, r5a.8xlarge,
     * r5a.12xlarge, r5a.16xlarge, r5a.24xlarge, r5d.large, r5d.xlarge,
     * r5d.2xlarge, r5d.4xlarge, r5d.8xlarge, r5d.12xlarge, r5d.16xlarge,
     * r5d.24xlarge, r5d.metal, r5ad.large, r5ad.xlarge, r5ad.2xlarge,
     * r5ad.4xlarge, r5ad.8xlarge, r5ad.12xlarge, r5ad.16xlarge, r5ad.24xlarge,
     * x1.16xlarge, x1.32xlarge, x1e.xlarge, x1e.2xlarge, x1e.4xlarge,
     * x1e.8xlarge, x1e.16xlarge, x1e.32xlarge, i2.xlarge, i2.2xlarge,
     * i2.4xlarge, i2.8xlarge, i3.large, i3.xlarge, i3.2xlarge, i3.4xlarge,
     * i3.8xlarge, i3.16xlarge, i3.metal, i3en.large, i3en.xlarge, i3en.2xlarge,
     * i3en.3xlarge, i3en.6xlarge, i3en.12xlarge, i3en.24xlarge, i3en.metal,
     * hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge,
     * c3.2xlarge, c3.4xlarge, c3.8xlarge, c4.large, c4.xlarge, c4.2xlarge,
     * c4.4xlarge, c4.8xlarge, c5.large, c5.xlarge, c5.2xlarge, c5.4xlarge,
     * c5.9xlarge, c5.12xlarge, c5.18xlarge, c5.24xlarge, c5.metal, c5d.large,
     * c5d.xlarge, c5d.2xlarge, c5d.4xlarge, c5d.9xlarge, c5d.12xlarge,
     * c5d.18xlarge, c5d.24xlarge, c5d.metal, c5n.large, c5n.xlarge,
     * c5n.2xlarge, c5n.4xlarge, c5n.9xlarge, c5n.18xlarge, cc1.4xlarge,
     * cc2.8xlarge, g2.2xlarge, g2.8xlarge, g3.4xlarge, g3.8xlarge, g3.16xlarge,
     * g3s.xlarge, g4dn.xlarge, g4dn.2xlarge, g4dn.4xlarge, g4dn.8xlarge,
     * g4dn.12xlarge, g4dn.16xlarge, cg1.4xlarge, p2.xlarge, p2.8xlarge,
     * p2.16xlarge, p3.2xlarge, p3.8xlarge, p3.16xlarge, p3dn.24xlarge,
     * d2.xlarge, d2.2xlarge, d2.4xlarge, d2.8xlarge, f1.2xlarge, f1.4xlarge,
     * f1.16xlarge, m5.large, m5.xlarge, m5.2xlarge, m5.4xlarge, m5.8xlarge,
     * m5.12xlarge, m5.16xlarge, m5.24xlarge, m5.metal, m5a.large, m5a.xlarge,
     * m5a.2xlarge, m5a.4xlarge, m5a.8xlarge, m5a.12xlarge, m5a.16xlarge,
     * m5a.24xlarge, m5d.large, m5d.xlarge, m5d.2xlarge, m5d.4xlarge,
     * m5d.8xlarge, m5d.12xlarge, m5d.16xlarge, m5d.24xlarge, m5d.metal,
     * m5ad.large, m5ad.xlarge, m5ad.2xlarge, m5ad.4xlarge, m5ad.8xlarge,
     * m5ad.12xlarge, m5ad.16xlarge, m5ad.24xlarge, h1.2xlarge, h1.4xlarge,
     * h1.8xlarge, h1.16xlarge, z1d.large, z1d.xlarge, z1d.2xlarge, z1d.3xlarge,
     * z1d.6xlarge, z1d.12xlarge, z1d.metal, u-6tb1.metal, u-9tb1.metal,
     * u-12tb1.metal, u-18tb1.metal, u-24tb1.metal, a1.medium, a1.large,
     * a1.xlarge, a1.2xlarge, a1.4xlarge, a1.metal, m5dn.large, m5dn.xlarge,
     * m5dn.2xlarge, m5dn.4xlarge, m5dn.8xlarge, m5dn.12xlarge, m5dn.16xlarge,
     * m5dn.24xlarge, m5n.large, m5n.xlarge, m5n.2xlarge, m5n.4xlarge,
     * m5n.8xlarge, m5n.12xlarge, m5n.16xlarge, m5n.24xlarge, r5dn.large,
     * r5dn.xlarge, r5dn.2xlarge, r5dn.4xlarge, r5dn.8xlarge, r5dn.12xlarge,
     * r5dn.16xlarge, r5dn.24xlarge, r5n.large, r5n.xlarge, r5n.2xlarge,
     * r5n.4xlarge, r5n.8xlarge, r5n.12xlarge, r5n.16xlarge, r5n.24xlarge,
     * inf1.xlarge, inf1.2xlarge, inf1.6xlarge, inf1.24xlarge
     *
     * @param instanceType <p>
     *            The instance type on which the Reserved Instance can be used.
     *            </p>
     * @see InstanceType
     */
    public void setInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType.toString();
    }

    /**
     * <p>
     * The instance type on which the Reserved Instance can be used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, t2.nano, t2.micro, t2.small, t2.medium,
     * t2.large, t2.xlarge, t2.2xlarge, t3.nano, t3.micro, t3.small, t3.medium,
     * t3.large, t3.xlarge, t3.2xlarge, t3a.nano, t3a.micro, t3a.small,
     * t3a.medium, t3a.large, t3a.xlarge, t3a.2xlarge, m1.small, m1.medium,
     * m1.large, m1.xlarge, m3.medium, m3.large, m3.xlarge, m3.2xlarge,
     * m4.large, m4.xlarge, m4.2xlarge, m4.4xlarge, m4.10xlarge, m4.16xlarge,
     * m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, r3.large, r3.xlarge,
     * r3.2xlarge, r3.4xlarge, r3.8xlarge, r4.large, r4.xlarge, r4.2xlarge,
     * r4.4xlarge, r4.8xlarge, r4.16xlarge, r5.large, r5.xlarge, r5.2xlarge,
     * r5.4xlarge, r5.8xlarge, r5.12xlarge, r5.16xlarge, r5.24xlarge, r5.metal,
     * r5a.large, r5a.xlarge, r5a.2xlarge, r5a.4xlarge, r5a.8xlarge,
     * r5a.12xlarge, r5a.16xlarge, r5a.24xlarge, r5d.large, r5d.xlarge,
     * r5d.2xlarge, r5d.4xlarge, r5d.8xlarge, r5d.12xlarge, r5d.16xlarge,
     * r5d.24xlarge, r5d.metal, r5ad.large, r5ad.xlarge, r5ad.2xlarge,
     * r5ad.4xlarge, r5ad.8xlarge, r5ad.12xlarge, r5ad.16xlarge, r5ad.24xlarge,
     * x1.16xlarge, x1.32xlarge, x1e.xlarge, x1e.2xlarge, x1e.4xlarge,
     * x1e.8xlarge, x1e.16xlarge, x1e.32xlarge, i2.xlarge, i2.2xlarge,
     * i2.4xlarge, i2.8xlarge, i3.large, i3.xlarge, i3.2xlarge, i3.4xlarge,
     * i3.8xlarge, i3.16xlarge, i3.metal, i3en.large, i3en.xlarge, i3en.2xlarge,
     * i3en.3xlarge, i3en.6xlarge, i3en.12xlarge, i3en.24xlarge, i3en.metal,
     * hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge,
     * c3.2xlarge, c3.4xlarge, c3.8xlarge, c4.large, c4.xlarge, c4.2xlarge,
     * c4.4xlarge, c4.8xlarge, c5.large, c5.xlarge, c5.2xlarge, c5.4xlarge,
     * c5.9xlarge, c5.12xlarge, c5.18xlarge, c5.24xlarge, c5.metal, c5d.large,
     * c5d.xlarge, c5d.2xlarge, c5d.4xlarge, c5d.9xlarge, c5d.12xlarge,
     * c5d.18xlarge, c5d.24xlarge, c5d.metal, c5n.large, c5n.xlarge,
     * c5n.2xlarge, c5n.4xlarge, c5n.9xlarge, c5n.18xlarge, cc1.4xlarge,
     * cc2.8xlarge, g2.2xlarge, g2.8xlarge, g3.4xlarge, g3.8xlarge, g3.16xlarge,
     * g3s.xlarge, g4dn.xlarge, g4dn.2xlarge, g4dn.4xlarge, g4dn.8xlarge,
     * g4dn.12xlarge, g4dn.16xlarge, cg1.4xlarge, p2.xlarge, p2.8xlarge,
     * p2.16xlarge, p3.2xlarge, p3.8xlarge, p3.16xlarge, p3dn.24xlarge,
     * d2.xlarge, d2.2xlarge, d2.4xlarge, d2.8xlarge, f1.2xlarge, f1.4xlarge,
     * f1.16xlarge, m5.large, m5.xlarge, m5.2xlarge, m5.4xlarge, m5.8xlarge,
     * m5.12xlarge, m5.16xlarge, m5.24xlarge, m5.metal, m5a.large, m5a.xlarge,
     * m5a.2xlarge, m5a.4xlarge, m5a.8xlarge, m5a.12xlarge, m5a.16xlarge,
     * m5a.24xlarge, m5d.large, m5d.xlarge, m5d.2xlarge, m5d.4xlarge,
     * m5d.8xlarge, m5d.12xlarge, m5d.16xlarge, m5d.24xlarge, m5d.metal,
     * m5ad.large, m5ad.xlarge, m5ad.2xlarge, m5ad.4xlarge, m5ad.8xlarge,
     * m5ad.12xlarge, m5ad.16xlarge, m5ad.24xlarge, h1.2xlarge, h1.4xlarge,
     * h1.8xlarge, h1.16xlarge, z1d.large, z1d.xlarge, z1d.2xlarge, z1d.3xlarge,
     * z1d.6xlarge, z1d.12xlarge, z1d.metal, u-6tb1.metal, u-9tb1.metal,
     * u-12tb1.metal, u-18tb1.metal, u-24tb1.metal, a1.medium, a1.large,
     * a1.xlarge, a1.2xlarge, a1.4xlarge, a1.metal, m5dn.large, m5dn.xlarge,
     * m5dn.2xlarge, m5dn.4xlarge, m5dn.8xlarge, m5dn.12xlarge, m5dn.16xlarge,
     * m5dn.24xlarge, m5n.large, m5n.xlarge, m5n.2xlarge, m5n.4xlarge,
     * m5n.8xlarge, m5n.12xlarge, m5n.16xlarge, m5n.24xlarge, r5dn.large,
     * r5dn.xlarge, r5dn.2xlarge, r5dn.4xlarge, r5dn.8xlarge, r5dn.12xlarge,
     * r5dn.16xlarge, r5dn.24xlarge, r5n.large, r5n.xlarge, r5n.2xlarge,
     * r5n.4xlarge, r5n.8xlarge, r5n.12xlarge, r5n.16xlarge, r5n.24xlarge,
     * inf1.xlarge, inf1.2xlarge, inf1.6xlarge, inf1.24xlarge
     *
     * @param instanceType <p>
     *            The instance type on which the Reserved Instance can be used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceType
     */
    public ReservedInstancesOffering withInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * <p>
     * The Reserved Instance product platform description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Linux/UNIX, Linux/UNIX (Amazon VPC), Windows,
     * Windows (Amazon VPC)
     *
     * @return <p>
     *         The Reserved Instance product platform description.
     *         </p>
     * @see RIProductDescription
     */
    public String getProductDescription() {
        return productDescription;
    }

    /**
     * <p>
     * The Reserved Instance product platform description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Linux/UNIX, Linux/UNIX (Amazon VPC), Windows,
     * Windows (Amazon VPC)
     *
     * @param productDescription <p>
     *            The Reserved Instance product platform description.
     *            </p>
     * @see RIProductDescription
     */
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    /**
     * <p>
     * The Reserved Instance product platform description.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Linux/UNIX, Linux/UNIX (Amazon VPC), Windows,
     * Windows (Amazon VPC)
     *
     * @param productDescription <p>
     *            The Reserved Instance product platform description.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RIProductDescription
     */
    public ReservedInstancesOffering withProductDescription(String productDescription) {
        this.productDescription = productDescription;
        return this;
    }

    /**
     * <p>
     * The Reserved Instance product platform description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Linux/UNIX, Linux/UNIX (Amazon VPC), Windows,
     * Windows (Amazon VPC)
     *
     * @param productDescription <p>
     *            The Reserved Instance product platform description.
     *            </p>
     * @see RIProductDescription
     */
    public void setProductDescription(RIProductDescription productDescription) {
        this.productDescription = productDescription.toString();
    }

    /**
     * <p>
     * The Reserved Instance product platform description.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Linux/UNIX, Linux/UNIX (Amazon VPC), Windows,
     * Windows (Amazon VPC)
     *
     * @param productDescription <p>
     *            The Reserved Instance product platform description.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RIProductDescription
     */
    public ReservedInstancesOffering withProductDescription(RIProductDescription productDescription) {
        this.productDescription = productDescription.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the Reserved Instance offering. This is the offering ID used in
     * <a>GetReservedInstancesExchangeQuote</a> to confirm that an exchange can
     * be made.
     * </p>
     *
     * @return <p>
     *         The ID of the Reserved Instance offering. This is the offering ID
     *         used in <a>GetReservedInstancesExchangeQuote</a> to confirm that
     *         an exchange can be made.
     *         </p>
     */
    public String getReservedInstancesOfferingId() {
        return reservedInstancesOfferingId;
    }

    /**
     * <p>
     * The ID of the Reserved Instance offering. This is the offering ID used in
     * <a>GetReservedInstancesExchangeQuote</a> to confirm that an exchange can
     * be made.
     * </p>
     *
     * @param reservedInstancesOfferingId <p>
     *            The ID of the Reserved Instance offering. This is the offering
     *            ID used in <a>GetReservedInstancesExchangeQuote</a> to confirm
     *            that an exchange can be made.
     *            </p>
     */
    public void setReservedInstancesOfferingId(String reservedInstancesOfferingId) {
        this.reservedInstancesOfferingId = reservedInstancesOfferingId;
    }

    /**
     * <p>
     * The ID of the Reserved Instance offering. This is the offering ID used in
     * <a>GetReservedInstancesExchangeQuote</a> to confirm that an exchange can
     * be made.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reservedInstancesOfferingId <p>
     *            The ID of the Reserved Instance offering. This is the offering
     *            ID used in <a>GetReservedInstancesExchangeQuote</a> to confirm
     *            that an exchange can be made.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedInstancesOffering withReservedInstancesOfferingId(
            String reservedInstancesOfferingId) {
        this.reservedInstancesOfferingId = reservedInstancesOfferingId;
        return this;
    }

    /**
     * <p>
     * The usage price of the Reserved Instance, per hour.
     * </p>
     *
     * @return <p>
     *         The usage price of the Reserved Instance, per hour.
     *         </p>
     */
    public Float getUsagePrice() {
        return usagePrice;
    }

    /**
     * <p>
     * The usage price of the Reserved Instance, per hour.
     * </p>
     *
     * @param usagePrice <p>
     *            The usage price of the Reserved Instance, per hour.
     *            </p>
     */
    public void setUsagePrice(Float usagePrice) {
        this.usagePrice = usagePrice;
    }

    /**
     * <p>
     * The usage price of the Reserved Instance, per hour.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param usagePrice <p>
     *            The usage price of the Reserved Instance, per hour.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedInstancesOffering withUsagePrice(Float usagePrice) {
        this.usagePrice = usagePrice;
        return this;
    }

    /**
     * <p>
     * The currency of the Reserved Instance offering you are purchasing. It's
     * specified using ISO 4217 standard currency codes. At this time, the only
     * supported currency is <code>USD</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USD
     *
     * @return <p>
     *         The currency of the Reserved Instance offering you are
     *         purchasing. It's specified using ISO 4217 standard currency
     *         codes. At this time, the only supported currency is
     *         <code>USD</code>.
     *         </p>
     * @see CurrencyCodeValues
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * <p>
     * The currency of the Reserved Instance offering you are purchasing. It's
     * specified using ISO 4217 standard currency codes. At this time, the only
     * supported currency is <code>USD</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USD
     *
     * @param currencyCode <p>
     *            The currency of the Reserved Instance offering you are
     *            purchasing. It's specified using ISO 4217 standard currency
     *            codes. At this time, the only supported currency is
     *            <code>USD</code>.
     *            </p>
     * @see CurrencyCodeValues
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * <p>
     * The currency of the Reserved Instance offering you are purchasing. It's
     * specified using ISO 4217 standard currency codes. At this time, the only
     * supported currency is <code>USD</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USD
     *
     * @param currencyCode <p>
     *            The currency of the Reserved Instance offering you are
     *            purchasing. It's specified using ISO 4217 standard currency
     *            codes. At this time, the only supported currency is
     *            <code>USD</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CurrencyCodeValues
     */
    public ReservedInstancesOffering withCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    /**
     * <p>
     * The currency of the Reserved Instance offering you are purchasing. It's
     * specified using ISO 4217 standard currency codes. At this time, the only
     * supported currency is <code>USD</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USD
     *
     * @param currencyCode <p>
     *            The currency of the Reserved Instance offering you are
     *            purchasing. It's specified using ISO 4217 standard currency
     *            codes. At this time, the only supported currency is
     *            <code>USD</code>.
     *            </p>
     * @see CurrencyCodeValues
     */
    public void setCurrencyCode(CurrencyCodeValues currencyCode) {
        this.currencyCode = currencyCode.toString();
    }

    /**
     * <p>
     * The currency of the Reserved Instance offering you are purchasing. It's
     * specified using ISO 4217 standard currency codes. At this time, the only
     * supported currency is <code>USD</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USD
     *
     * @param currencyCode <p>
     *            The currency of the Reserved Instance offering you are
     *            purchasing. It's specified using ISO 4217 standard currency
     *            codes. At this time, the only supported currency is
     *            <code>USD</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CurrencyCodeValues
     */
    public ReservedInstancesOffering withCurrencyCode(CurrencyCodeValues currencyCode) {
        this.currencyCode = currencyCode.toString();
        return this;
    }

    /**
     * <p>
     * The tenancy of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated, host
     *
     * @return <p>
     *         The tenancy of the instance.
     *         </p>
     * @see Tenancy
     */
    public String getInstanceTenancy() {
        return instanceTenancy;
    }

    /**
     * <p>
     * The tenancy of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated, host
     *
     * @param instanceTenancy <p>
     *            The tenancy of the instance.
     *            </p>
     * @see Tenancy
     */
    public void setInstanceTenancy(String instanceTenancy) {
        this.instanceTenancy = instanceTenancy;
    }

    /**
     * <p>
     * The tenancy of the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated, host
     *
     * @param instanceTenancy <p>
     *            The tenancy of the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Tenancy
     */
    public ReservedInstancesOffering withInstanceTenancy(String instanceTenancy) {
        this.instanceTenancy = instanceTenancy;
        return this;
    }

    /**
     * <p>
     * The tenancy of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated, host
     *
     * @param instanceTenancy <p>
     *            The tenancy of the instance.
     *            </p>
     * @see Tenancy
     */
    public void setInstanceTenancy(Tenancy instanceTenancy) {
        this.instanceTenancy = instanceTenancy.toString();
    }

    /**
     * <p>
     * The tenancy of the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated, host
     *
     * @param instanceTenancy <p>
     *            The tenancy of the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Tenancy
     */
    public ReservedInstancesOffering withInstanceTenancy(Tenancy instanceTenancy) {
        this.instanceTenancy = instanceTenancy.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether the offering is available through the Reserved Instance
     * Marketplace (resale) or AWS. If it's a Reserved Instance Marketplace
     * offering, this is <code>true</code>.
     * </p>
     *
     * @return <p>
     *         Indicates whether the offering is available through the Reserved
     *         Instance Marketplace (resale) or AWS. If it's a Reserved Instance
     *         Marketplace offering, this is <code>true</code>.
     *         </p>
     */
    public Boolean isMarketplace() {
        return marketplace;
    }

    /**
     * <p>
     * Indicates whether the offering is available through the Reserved Instance
     * Marketplace (resale) or AWS. If it's a Reserved Instance Marketplace
     * offering, this is <code>true</code>.
     * </p>
     *
     * @return <p>
     *         Indicates whether the offering is available through the Reserved
     *         Instance Marketplace (resale) or AWS. If it's a Reserved Instance
     *         Marketplace offering, this is <code>true</code>.
     *         </p>
     */
    public Boolean getMarketplace() {
        return marketplace;
    }

    /**
     * <p>
     * Indicates whether the offering is available through the Reserved Instance
     * Marketplace (resale) or AWS. If it's a Reserved Instance Marketplace
     * offering, this is <code>true</code>.
     * </p>
     *
     * @param marketplace <p>
     *            Indicates whether the offering is available through the
     *            Reserved Instance Marketplace (resale) or AWS. If it's a
     *            Reserved Instance Marketplace offering, this is
     *            <code>true</code>.
     *            </p>
     */
    public void setMarketplace(Boolean marketplace) {
        this.marketplace = marketplace;
    }

    /**
     * <p>
     * Indicates whether the offering is available through the Reserved Instance
     * Marketplace (resale) or AWS. If it's a Reserved Instance Marketplace
     * offering, this is <code>true</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param marketplace <p>
     *            Indicates whether the offering is available through the
     *            Reserved Instance Marketplace (resale) or AWS. If it's a
     *            Reserved Instance Marketplace offering, this is
     *            <code>true</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedInstancesOffering withMarketplace(Boolean marketplace) {
        this.marketplace = marketplace;
        return this;
    }

    /**
     * <p>
     * If <code>convertible</code> it can be exchanged for Reserved Instances of
     * the same or higher monetary value, with different configurations. If
     * <code>standard</code>, it is not possible to perform an exchange.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, convertible
     *
     * @return <p>
     *         If <code>convertible</code> it can be exchanged for Reserved
     *         Instances of the same or higher monetary value, with different
     *         configurations. If <code>standard</code>, it is not possible to
     *         perform an exchange.
     *         </p>
     * @see OfferingClassType
     */
    public String getOfferingClass() {
        return offeringClass;
    }

    /**
     * <p>
     * If <code>convertible</code> it can be exchanged for Reserved Instances of
     * the same or higher monetary value, with different configurations. If
     * <code>standard</code>, it is not possible to perform an exchange.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, convertible
     *
     * @param offeringClass <p>
     *            If <code>convertible</code> it can be exchanged for Reserved
     *            Instances of the same or higher monetary value, with different
     *            configurations. If <code>standard</code>, it is not possible
     *            to perform an exchange.
     *            </p>
     * @see OfferingClassType
     */
    public void setOfferingClass(String offeringClass) {
        this.offeringClass = offeringClass;
    }

    /**
     * <p>
     * If <code>convertible</code> it can be exchanged for Reserved Instances of
     * the same or higher monetary value, with different configurations. If
     * <code>standard</code>, it is not possible to perform an exchange.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, convertible
     *
     * @param offeringClass <p>
     *            If <code>convertible</code> it can be exchanged for Reserved
     *            Instances of the same or higher monetary value, with different
     *            configurations. If <code>standard</code>, it is not possible
     *            to perform an exchange.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OfferingClassType
     */
    public ReservedInstancesOffering withOfferingClass(String offeringClass) {
        this.offeringClass = offeringClass;
        return this;
    }

    /**
     * <p>
     * If <code>convertible</code> it can be exchanged for Reserved Instances of
     * the same or higher monetary value, with different configurations. If
     * <code>standard</code>, it is not possible to perform an exchange.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, convertible
     *
     * @param offeringClass <p>
     *            If <code>convertible</code> it can be exchanged for Reserved
     *            Instances of the same or higher monetary value, with different
     *            configurations. If <code>standard</code>, it is not possible
     *            to perform an exchange.
     *            </p>
     * @see OfferingClassType
     */
    public void setOfferingClass(OfferingClassType offeringClass) {
        this.offeringClass = offeringClass.toString();
    }

    /**
     * <p>
     * If <code>convertible</code> it can be exchanged for Reserved Instances of
     * the same or higher monetary value, with different configurations. If
     * <code>standard</code>, it is not possible to perform an exchange.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, convertible
     *
     * @param offeringClass <p>
     *            If <code>convertible</code> it can be exchanged for Reserved
     *            Instances of the same or higher monetary value, with different
     *            configurations. If <code>standard</code>, it is not possible
     *            to perform an exchange.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OfferingClassType
     */
    public ReservedInstancesOffering withOfferingClass(OfferingClassType offeringClass) {
        this.offeringClass = offeringClass.toString();
        return this;
    }

    /**
     * <p>
     * The Reserved Instance offering type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Heavy Utilization, Medium Utilization, Light
     * Utilization, No Upfront, Partial Upfront, All Upfront
     *
     * @return <p>
     *         The Reserved Instance offering type.
     *         </p>
     * @see OfferingTypeValues
     */
    public String getOfferingType() {
        return offeringType;
    }

    /**
     * <p>
     * The Reserved Instance offering type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Heavy Utilization, Medium Utilization, Light
     * Utilization, No Upfront, Partial Upfront, All Upfront
     *
     * @param offeringType <p>
     *            The Reserved Instance offering type.
     *            </p>
     * @see OfferingTypeValues
     */
    public void setOfferingType(String offeringType) {
        this.offeringType = offeringType;
    }

    /**
     * <p>
     * The Reserved Instance offering type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Heavy Utilization, Medium Utilization, Light
     * Utilization, No Upfront, Partial Upfront, All Upfront
     *
     * @param offeringType <p>
     *            The Reserved Instance offering type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OfferingTypeValues
     */
    public ReservedInstancesOffering withOfferingType(String offeringType) {
        this.offeringType = offeringType;
        return this;
    }

    /**
     * <p>
     * The Reserved Instance offering type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Heavy Utilization, Medium Utilization, Light
     * Utilization, No Upfront, Partial Upfront, All Upfront
     *
     * @param offeringType <p>
     *            The Reserved Instance offering type.
     *            </p>
     * @see OfferingTypeValues
     */
    public void setOfferingType(OfferingTypeValues offeringType) {
        this.offeringType = offeringType.toString();
    }

    /**
     * <p>
     * The Reserved Instance offering type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Heavy Utilization, Medium Utilization, Light
     * Utilization, No Upfront, Partial Upfront, All Upfront
     *
     * @param offeringType <p>
     *            The Reserved Instance offering type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OfferingTypeValues
     */
    public ReservedInstancesOffering withOfferingType(OfferingTypeValues offeringType) {
        this.offeringType = offeringType.toString();
        return this;
    }

    /**
     * <p>
     * The pricing details of the Reserved Instance offering.
     * </p>
     *
     * @return <p>
     *         The pricing details of the Reserved Instance offering.
     *         </p>
     */
    public java.util.List<PricingDetail> getPricingDetails() {
        return pricingDetails;
    }

    /**
     * <p>
     * The pricing details of the Reserved Instance offering.
     * </p>
     *
     * @param pricingDetails <p>
     *            The pricing details of the Reserved Instance offering.
     *            </p>
     */
    public void setPricingDetails(java.util.Collection<PricingDetail> pricingDetails) {
        if (pricingDetails == null) {
            this.pricingDetails = null;
            return;
        }

        this.pricingDetails = new java.util.ArrayList<PricingDetail>(pricingDetails);
    }

    /**
     * <p>
     * The pricing details of the Reserved Instance offering.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pricingDetails <p>
     *            The pricing details of the Reserved Instance offering.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedInstancesOffering withPricingDetails(PricingDetail... pricingDetails) {
        if (getPricingDetails() == null) {
            this.pricingDetails = new java.util.ArrayList<PricingDetail>(pricingDetails.length);
        }
        for (PricingDetail value : pricingDetails) {
            this.pricingDetails.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The pricing details of the Reserved Instance offering.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pricingDetails <p>
     *            The pricing details of the Reserved Instance offering.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedInstancesOffering withPricingDetails(
            java.util.Collection<PricingDetail> pricingDetails) {
        setPricingDetails(pricingDetails);
        return this;
    }

    /**
     * <p>
     * The recurring charge tag assigned to the resource.
     * </p>
     *
     * @return <p>
     *         The recurring charge tag assigned to the resource.
     *         </p>
     */
    public java.util.List<RecurringCharge> getRecurringCharges() {
        return recurringCharges;
    }

    /**
     * <p>
     * The recurring charge tag assigned to the resource.
     * </p>
     *
     * @param recurringCharges <p>
     *            The recurring charge tag assigned to the resource.
     *            </p>
     */
    public void setRecurringCharges(java.util.Collection<RecurringCharge> recurringCharges) {
        if (recurringCharges == null) {
            this.recurringCharges = null;
            return;
        }

        this.recurringCharges = new java.util.ArrayList<RecurringCharge>(recurringCharges);
    }

    /**
     * <p>
     * The recurring charge tag assigned to the resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recurringCharges <p>
     *            The recurring charge tag assigned to the resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedInstancesOffering withRecurringCharges(RecurringCharge... recurringCharges) {
        if (getRecurringCharges() == null) {
            this.recurringCharges = new java.util.ArrayList<RecurringCharge>(
                    recurringCharges.length);
        }
        for (RecurringCharge value : recurringCharges) {
            this.recurringCharges.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The recurring charge tag assigned to the resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recurringCharges <p>
     *            The recurring charge tag assigned to the resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedInstancesOffering withRecurringCharges(
            java.util.Collection<RecurringCharge> recurringCharges) {
        setRecurringCharges(recurringCharges);
        return this;
    }

    /**
     * <p>
     * Whether the Reserved Instance is applied to instances in a Region or an
     * Availability Zone.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Availability Zone, Region
     *
     * @return <p>
     *         Whether the Reserved Instance is applied to instances in a Region
     *         or an Availability Zone.
     *         </p>
     * @see Scope
     */
    public String getScope() {
        return scope;
    }

    /**
     * <p>
     * Whether the Reserved Instance is applied to instances in a Region or an
     * Availability Zone.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Availability Zone, Region
     *
     * @param scope <p>
     *            Whether the Reserved Instance is applied to instances in a
     *            Region or an Availability Zone.
     *            </p>
     * @see Scope
     */
    public void setScope(String scope) {
        this.scope = scope;
    }

    /**
     * <p>
     * Whether the Reserved Instance is applied to instances in a Region or an
     * Availability Zone.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Availability Zone, Region
     *
     * @param scope <p>
     *            Whether the Reserved Instance is applied to instances in a
     *            Region or an Availability Zone.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Scope
     */
    public ReservedInstancesOffering withScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * <p>
     * Whether the Reserved Instance is applied to instances in a Region or an
     * Availability Zone.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Availability Zone, Region
     *
     * @param scope <p>
     *            Whether the Reserved Instance is applied to instances in a
     *            Region or an Availability Zone.
     *            </p>
     * @see Scope
     */
    public void setScope(Scope scope) {
        this.scope = scope.toString();
    }

    /**
     * <p>
     * Whether the Reserved Instance is applied to instances in a Region or an
     * Availability Zone.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Availability Zone, Region
     *
     * @param scope <p>
     *            Whether the Reserved Instance is applied to instances in a
     *            Region or an Availability Zone.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Scope
     */
    public ReservedInstancesOffering withScope(Scope scope) {
        this.scope = scope.toString();
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getDuration() != null)
            sb.append("Duration: " + getDuration() + ",");
        if (getFixedPrice() != null)
            sb.append("FixedPrice: " + getFixedPrice() + ",");
        if (getInstanceType() != null)
            sb.append("InstanceType: " + getInstanceType() + ",");
        if (getProductDescription() != null)
            sb.append("ProductDescription: " + getProductDescription() + ",");
        if (getReservedInstancesOfferingId() != null)
            sb.append("ReservedInstancesOfferingId: " + getReservedInstancesOfferingId() + ",");
        if (getUsagePrice() != null)
            sb.append("UsagePrice: " + getUsagePrice() + ",");
        if (getCurrencyCode() != null)
            sb.append("CurrencyCode: " + getCurrencyCode() + ",");
        if (getInstanceTenancy() != null)
            sb.append("InstanceTenancy: " + getInstanceTenancy() + ",");
        if (getMarketplace() != null)
            sb.append("Marketplace: " + getMarketplace() + ",");
        if (getOfferingClass() != null)
            sb.append("OfferingClass: " + getOfferingClass() + ",");
        if (getOfferingType() != null)
            sb.append("OfferingType: " + getOfferingType() + ",");
        if (getPricingDetails() != null)
            sb.append("PricingDetails: " + getPricingDetails() + ",");
        if (getRecurringCharges() != null)
            sb.append("RecurringCharges: " + getRecurringCharges() + ",");
        if (getScope() != null)
            sb.append("Scope: " + getScope());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode());
        hashCode = prime * hashCode + ((getFixedPrice() == null) ? 0 : getFixedPrice().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode
                + ((getProductDescription() == null) ? 0 : getProductDescription().hashCode());
        hashCode = prime
                * hashCode
                + ((getReservedInstancesOfferingId() == null) ? 0
                        : getReservedInstancesOfferingId().hashCode());
        hashCode = prime * hashCode + ((getUsagePrice() == null) ? 0 : getUsagePrice().hashCode());
        hashCode = prime * hashCode
                + ((getCurrencyCode() == null) ? 0 : getCurrencyCode().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceTenancy() == null) ? 0 : getInstanceTenancy().hashCode());
        hashCode = prime * hashCode
                + ((getMarketplace() == null) ? 0 : getMarketplace().hashCode());
        hashCode = prime * hashCode
                + ((getOfferingClass() == null) ? 0 : getOfferingClass().hashCode());
        hashCode = prime * hashCode
                + ((getOfferingType() == null) ? 0 : getOfferingType().hashCode());
        hashCode = prime * hashCode
                + ((getPricingDetails() == null) ? 0 : getPricingDetails().hashCode());
        hashCode = prime * hashCode
                + ((getRecurringCharges() == null) ? 0 : getRecurringCharges().hashCode());
        hashCode = prime * hashCode + ((getScope() == null) ? 0 : getScope().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReservedInstancesOffering == false)
            return false;
        ReservedInstancesOffering other = (ReservedInstancesOffering) obj;

        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null
                && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getDuration() == null ^ this.getDuration() == null)
            return false;
        if (other.getDuration() != null && other.getDuration().equals(this.getDuration()) == false)
            return false;
        if (other.getFixedPrice() == null ^ this.getFixedPrice() == null)
            return false;
        if (other.getFixedPrice() != null
                && other.getFixedPrice().equals(this.getFixedPrice()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null
                && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getProductDescription() == null ^ this.getProductDescription() == null)
            return false;
        if (other.getProductDescription() != null
                && other.getProductDescription().equals(this.getProductDescription()) == false)
            return false;
        if (other.getReservedInstancesOfferingId() == null
                ^ this.getReservedInstancesOfferingId() == null)
            return false;
        if (other.getReservedInstancesOfferingId() != null
                && other.getReservedInstancesOfferingId().equals(
                        this.getReservedInstancesOfferingId()) == false)
            return false;
        if (other.getUsagePrice() == null ^ this.getUsagePrice() == null)
            return false;
        if (other.getUsagePrice() != null
                && other.getUsagePrice().equals(this.getUsagePrice()) == false)
            return false;
        if (other.getCurrencyCode() == null ^ this.getCurrencyCode() == null)
            return false;
        if (other.getCurrencyCode() != null
                && other.getCurrencyCode().equals(this.getCurrencyCode()) == false)
            return false;
        if (other.getInstanceTenancy() == null ^ this.getInstanceTenancy() == null)
            return false;
        if (other.getInstanceTenancy() != null
                && other.getInstanceTenancy().equals(this.getInstanceTenancy()) == false)
            return false;
        if (other.getMarketplace() == null ^ this.getMarketplace() == null)
            return false;
        if (other.getMarketplace() != null
                && other.getMarketplace().equals(this.getMarketplace()) == false)
            return false;
        if (other.getOfferingClass() == null ^ this.getOfferingClass() == null)
            return false;
        if (other.getOfferingClass() != null
                && other.getOfferingClass().equals(this.getOfferingClass()) == false)
            return false;
        if (other.getOfferingType() == null ^ this.getOfferingType() == null)
            return false;
        if (other.getOfferingType() != null
                && other.getOfferingType().equals(this.getOfferingType()) == false)
            return false;
        if (other.getPricingDetails() == null ^ this.getPricingDetails() == null)
            return false;
        if (other.getPricingDetails() != null
                && other.getPricingDetails().equals(this.getPricingDetails()) == false)
            return false;
        if (other.getRecurringCharges() == null ^ this.getRecurringCharges() == null)
            return false;
        if (other.getRecurringCharges() != null
                && other.getRecurringCharges().equals(this.getRecurringCharges()) == false)
            return false;
        if (other.getScope() == null ^ this.getScope() == null)
            return false;
        if (other.getScope() != null && other.getScope().equals(this.getScope()) == false)
            return false;
        return true;
    }
}