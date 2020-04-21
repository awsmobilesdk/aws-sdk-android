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

package com.amazonaws.services.amazonroute53domains.model;

import java.io.Serializable;

/**
 * <p>
 * The CheckDomainAvailability response includes the following elements.
 * </p>
 */
public class CheckDomainAvailabilityResult implements Serializable {
    /**
     * <p>
     * Whether the domain name is available for registering.
     * </p>
     * <note>
     * <p>
     * You can register only domains designated as <code>AVAILABLE</code>.
     * </p>
     * </note>
     * <p>
     * Valid values:
     * </p>
     * <dl>
     * <dt>AVAILABLE</dt>
     * <dd>
     * <p>
     * The domain name is available.
     * </p>
     * </dd>
     * <dt>AVAILABLE_RESERVED</dt>
     * <dd>
     * <p>
     * The domain name is reserved under specific conditions.
     * </p>
     * </dd>
     * <dt>AVAILABLE_PREORDER</dt>
     * <dd>
     * <p>
     * The domain name is available and can be preordered.
     * </p>
     * </dd>
     * <dt>DONT_KNOW</dt>
     * <dd>
     * <p>
     * The TLD registry didn't reply with a definitive answer about whether the
     * domain name is available. Route 53 can return this response for a variety
     * of reasons, for example, the registry is performing maintenance. Try
     * again later.
     * </p>
     * </dd>
     * <dt>PENDING</dt>
     * <dd>
     * <p>
     * The TLD registry didn't return a response in the expected amount of time.
     * When the response is delayed, it usually takes just a few extra seconds.
     * You can resubmit the request immediately.
     * </p>
     * </dd>
     * <dt>RESERVED</dt>
     * <dd>
     * <p>
     * The domain name has been reserved for another person or organization.
     * </p>
     * </dd>
     * <dt>UNAVAILABLE</dt>
     * <dd>
     * <p>
     * The domain name is not available.
     * </p>
     * </dd>
     * <dt>UNAVAILABLE_PREMIUM</dt>
     * <dd>
     * <p>
     * The domain name is not available.
     * </p>
     * </dd>
     * <dt>UNAVAILABLE_RESTRICTED</dt>
     * <dd>
     * <p>
     * The domain name is forbidden.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, AVAILABLE_RESERVED, AVAILABLE_PREORDER,
     * UNAVAILABLE, UNAVAILABLE_PREMIUM, UNAVAILABLE_RESTRICTED, RESERVED,
     * DONT_KNOW
     */
    private String availability;

    /**
     * <p>
     * Whether the domain name is available for registering.
     * </p>
     * <note>
     * <p>
     * You can register only domains designated as <code>AVAILABLE</code>.
     * </p>
     * </note>
     * <p>
     * Valid values:
     * </p>
     * <dl>
     * <dt>AVAILABLE</dt>
     * <dd>
     * <p>
     * The domain name is available.
     * </p>
     * </dd>
     * <dt>AVAILABLE_RESERVED</dt>
     * <dd>
     * <p>
     * The domain name is reserved under specific conditions.
     * </p>
     * </dd>
     * <dt>AVAILABLE_PREORDER</dt>
     * <dd>
     * <p>
     * The domain name is available and can be preordered.
     * </p>
     * </dd>
     * <dt>DONT_KNOW</dt>
     * <dd>
     * <p>
     * The TLD registry didn't reply with a definitive answer about whether the
     * domain name is available. Route 53 can return this response for a variety
     * of reasons, for example, the registry is performing maintenance. Try
     * again later.
     * </p>
     * </dd>
     * <dt>PENDING</dt>
     * <dd>
     * <p>
     * The TLD registry didn't return a response in the expected amount of time.
     * When the response is delayed, it usually takes just a few extra seconds.
     * You can resubmit the request immediately.
     * </p>
     * </dd>
     * <dt>RESERVED</dt>
     * <dd>
     * <p>
     * The domain name has been reserved for another person or organization.
     * </p>
     * </dd>
     * <dt>UNAVAILABLE</dt>
     * <dd>
     * <p>
     * The domain name is not available.
     * </p>
     * </dd>
     * <dt>UNAVAILABLE_PREMIUM</dt>
     * <dd>
     * <p>
     * The domain name is not available.
     * </p>
     * </dd>
     * <dt>UNAVAILABLE_RESTRICTED</dt>
     * <dd>
     * <p>
     * The domain name is forbidden.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, AVAILABLE_RESERVED, AVAILABLE_PREORDER,
     * UNAVAILABLE, UNAVAILABLE_PREMIUM, UNAVAILABLE_RESTRICTED, RESERVED,
     * DONT_KNOW
     *
     * @return <p>
     *         Whether the domain name is available for registering.
     *         </p>
     *         <note>
     *         <p>
     *         You can register only domains designated as
     *         <code>AVAILABLE</code>.
     *         </p>
     *         </note>
     *         <p>
     *         Valid values:
     *         </p>
     *         <dl>
     *         <dt>AVAILABLE</dt>
     *         <dd>
     *         <p>
     *         The domain name is available.
     *         </p>
     *         </dd>
     *         <dt>AVAILABLE_RESERVED</dt>
     *         <dd>
     *         <p>
     *         The domain name is reserved under specific conditions.
     *         </p>
     *         </dd>
     *         <dt>AVAILABLE_PREORDER</dt>
     *         <dd>
     *         <p>
     *         The domain name is available and can be preordered.
     *         </p>
     *         </dd>
     *         <dt>DONT_KNOW</dt>
     *         <dd>
     *         <p>
     *         The TLD registry didn't reply with a definitive answer about
     *         whether the domain name is available. Route 53 can return this
     *         response for a variety of reasons, for example, the registry is
     *         performing maintenance. Try again later.
     *         </p>
     *         </dd>
     *         <dt>PENDING</dt>
     *         <dd>
     *         <p>
     *         The TLD registry didn't return a response in the expected amount
     *         of time. When the response is delayed, it usually takes just a
     *         few extra seconds. You can resubmit the request immediately.
     *         </p>
     *         </dd>
     *         <dt>RESERVED</dt>
     *         <dd>
     *         <p>
     *         The domain name has been reserved for another person or
     *         organization.
     *         </p>
     *         </dd>
     *         <dt>UNAVAILABLE</dt>
     *         <dd>
     *         <p>
     *         The domain name is not available.
     *         </p>
     *         </dd>
     *         <dt>UNAVAILABLE_PREMIUM</dt>
     *         <dd>
     *         <p>
     *         The domain name is not available.
     *         </p>
     *         </dd>
     *         <dt>UNAVAILABLE_RESTRICTED</dt>
     *         <dd>
     *         <p>
     *         The domain name is forbidden.
     *         </p>
     *         </dd>
     *         </dl>
     * @see DomainAvailability
     */
    public String getAvailability() {
        return availability;
    }

    /**
     * <p>
     * Whether the domain name is available for registering.
     * </p>
     * <note>
     * <p>
     * You can register only domains designated as <code>AVAILABLE</code>.
     * </p>
     * </note>
     * <p>
     * Valid values:
     * </p>
     * <dl>
     * <dt>AVAILABLE</dt>
     * <dd>
     * <p>
     * The domain name is available.
     * </p>
     * </dd>
     * <dt>AVAILABLE_RESERVED</dt>
     * <dd>
     * <p>
     * The domain name is reserved under specific conditions.
     * </p>
     * </dd>
     * <dt>AVAILABLE_PREORDER</dt>
     * <dd>
     * <p>
     * The domain name is available and can be preordered.
     * </p>
     * </dd>
     * <dt>DONT_KNOW</dt>
     * <dd>
     * <p>
     * The TLD registry didn't reply with a definitive answer about whether the
     * domain name is available. Route 53 can return this response for a variety
     * of reasons, for example, the registry is performing maintenance. Try
     * again later.
     * </p>
     * </dd>
     * <dt>PENDING</dt>
     * <dd>
     * <p>
     * The TLD registry didn't return a response in the expected amount of time.
     * When the response is delayed, it usually takes just a few extra seconds.
     * You can resubmit the request immediately.
     * </p>
     * </dd>
     * <dt>RESERVED</dt>
     * <dd>
     * <p>
     * The domain name has been reserved for another person or organization.
     * </p>
     * </dd>
     * <dt>UNAVAILABLE</dt>
     * <dd>
     * <p>
     * The domain name is not available.
     * </p>
     * </dd>
     * <dt>UNAVAILABLE_PREMIUM</dt>
     * <dd>
     * <p>
     * The domain name is not available.
     * </p>
     * </dd>
     * <dt>UNAVAILABLE_RESTRICTED</dt>
     * <dd>
     * <p>
     * The domain name is forbidden.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, AVAILABLE_RESERVED, AVAILABLE_PREORDER,
     * UNAVAILABLE, UNAVAILABLE_PREMIUM, UNAVAILABLE_RESTRICTED, RESERVED,
     * DONT_KNOW
     *
     * @param availability <p>
     *            Whether the domain name is available for registering.
     *            </p>
     *            <note>
     *            <p>
     *            You can register only domains designated as
     *            <code>AVAILABLE</code>.
     *            </p>
     *            </note>
     *            <p>
     *            Valid values:
     *            </p>
     *            <dl>
     *            <dt>AVAILABLE</dt>
     *            <dd>
     *            <p>
     *            The domain name is available.
     *            </p>
     *            </dd>
     *            <dt>AVAILABLE_RESERVED</dt>
     *            <dd>
     *            <p>
     *            The domain name is reserved under specific conditions.
     *            </p>
     *            </dd>
     *            <dt>AVAILABLE_PREORDER</dt>
     *            <dd>
     *            <p>
     *            The domain name is available and can be preordered.
     *            </p>
     *            </dd>
     *            <dt>DONT_KNOW</dt>
     *            <dd>
     *            <p>
     *            The TLD registry didn't reply with a definitive answer about
     *            whether the domain name is available. Route 53 can return this
     *            response for a variety of reasons, for example, the registry
     *            is performing maintenance. Try again later.
     *            </p>
     *            </dd>
     *            <dt>PENDING</dt>
     *            <dd>
     *            <p>
     *            The TLD registry didn't return a response in the expected
     *            amount of time. When the response is delayed, it usually takes
     *            just a few extra seconds. You can resubmit the request
     *            immediately.
     *            </p>
     *            </dd>
     *            <dt>RESERVED</dt>
     *            <dd>
     *            <p>
     *            The domain name has been reserved for another person or
     *            organization.
     *            </p>
     *            </dd>
     *            <dt>UNAVAILABLE</dt>
     *            <dd>
     *            <p>
     *            The domain name is not available.
     *            </p>
     *            </dd>
     *            <dt>UNAVAILABLE_PREMIUM</dt>
     *            <dd>
     *            <p>
     *            The domain name is not available.
     *            </p>
     *            </dd>
     *            <dt>UNAVAILABLE_RESTRICTED</dt>
     *            <dd>
     *            <p>
     *            The domain name is forbidden.
     *            </p>
     *            </dd>
     *            </dl>
     * @see DomainAvailability
     */
    public void setAvailability(String availability) {
        this.availability = availability;
    }

    /**
     * <p>
     * Whether the domain name is available for registering.
     * </p>
     * <note>
     * <p>
     * You can register only domains designated as <code>AVAILABLE</code>.
     * </p>
     * </note>
     * <p>
     * Valid values:
     * </p>
     * <dl>
     * <dt>AVAILABLE</dt>
     * <dd>
     * <p>
     * The domain name is available.
     * </p>
     * </dd>
     * <dt>AVAILABLE_RESERVED</dt>
     * <dd>
     * <p>
     * The domain name is reserved under specific conditions.
     * </p>
     * </dd>
     * <dt>AVAILABLE_PREORDER</dt>
     * <dd>
     * <p>
     * The domain name is available and can be preordered.
     * </p>
     * </dd>
     * <dt>DONT_KNOW</dt>
     * <dd>
     * <p>
     * The TLD registry didn't reply with a definitive answer about whether the
     * domain name is available. Route 53 can return this response for a variety
     * of reasons, for example, the registry is performing maintenance. Try
     * again later.
     * </p>
     * </dd>
     * <dt>PENDING</dt>
     * <dd>
     * <p>
     * The TLD registry didn't return a response in the expected amount of time.
     * When the response is delayed, it usually takes just a few extra seconds.
     * You can resubmit the request immediately.
     * </p>
     * </dd>
     * <dt>RESERVED</dt>
     * <dd>
     * <p>
     * The domain name has been reserved for another person or organization.
     * </p>
     * </dd>
     * <dt>UNAVAILABLE</dt>
     * <dd>
     * <p>
     * The domain name is not available.
     * </p>
     * </dd>
     * <dt>UNAVAILABLE_PREMIUM</dt>
     * <dd>
     * <p>
     * The domain name is not available.
     * </p>
     * </dd>
     * <dt>UNAVAILABLE_RESTRICTED</dt>
     * <dd>
     * <p>
     * The domain name is forbidden.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, AVAILABLE_RESERVED, AVAILABLE_PREORDER,
     * UNAVAILABLE, UNAVAILABLE_PREMIUM, UNAVAILABLE_RESTRICTED, RESERVED,
     * DONT_KNOW
     *
     * @param availability <p>
     *            Whether the domain name is available for registering.
     *            </p>
     *            <note>
     *            <p>
     *            You can register only domains designated as
     *            <code>AVAILABLE</code>.
     *            </p>
     *            </note>
     *            <p>
     *            Valid values:
     *            </p>
     *            <dl>
     *            <dt>AVAILABLE</dt>
     *            <dd>
     *            <p>
     *            The domain name is available.
     *            </p>
     *            </dd>
     *            <dt>AVAILABLE_RESERVED</dt>
     *            <dd>
     *            <p>
     *            The domain name is reserved under specific conditions.
     *            </p>
     *            </dd>
     *            <dt>AVAILABLE_PREORDER</dt>
     *            <dd>
     *            <p>
     *            The domain name is available and can be preordered.
     *            </p>
     *            </dd>
     *            <dt>DONT_KNOW</dt>
     *            <dd>
     *            <p>
     *            The TLD registry didn't reply with a definitive answer about
     *            whether the domain name is available. Route 53 can return this
     *            response for a variety of reasons, for example, the registry
     *            is performing maintenance. Try again later.
     *            </p>
     *            </dd>
     *            <dt>PENDING</dt>
     *            <dd>
     *            <p>
     *            The TLD registry didn't return a response in the expected
     *            amount of time. When the response is delayed, it usually takes
     *            just a few extra seconds. You can resubmit the request
     *            immediately.
     *            </p>
     *            </dd>
     *            <dt>RESERVED</dt>
     *            <dd>
     *            <p>
     *            The domain name has been reserved for another person or
     *            organization.
     *            </p>
     *            </dd>
     *            <dt>UNAVAILABLE</dt>
     *            <dd>
     *            <p>
     *            The domain name is not available.
     *            </p>
     *            </dd>
     *            <dt>UNAVAILABLE_PREMIUM</dt>
     *            <dd>
     *            <p>
     *            The domain name is not available.
     *            </p>
     *            </dd>
     *            <dt>UNAVAILABLE_RESTRICTED</dt>
     *            <dd>
     *            <p>
     *            The domain name is forbidden.
     *            </p>
     *            </dd>
     *            </dl>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DomainAvailability
     */
    public CheckDomainAvailabilityResult withAvailability(String availability) {
        this.availability = availability;
        return this;
    }

    /**
     * <p>
     * Whether the domain name is available for registering.
     * </p>
     * <note>
     * <p>
     * You can register only domains designated as <code>AVAILABLE</code>.
     * </p>
     * </note>
     * <p>
     * Valid values:
     * </p>
     * <dl>
     * <dt>AVAILABLE</dt>
     * <dd>
     * <p>
     * The domain name is available.
     * </p>
     * </dd>
     * <dt>AVAILABLE_RESERVED</dt>
     * <dd>
     * <p>
     * The domain name is reserved under specific conditions.
     * </p>
     * </dd>
     * <dt>AVAILABLE_PREORDER</dt>
     * <dd>
     * <p>
     * The domain name is available and can be preordered.
     * </p>
     * </dd>
     * <dt>DONT_KNOW</dt>
     * <dd>
     * <p>
     * The TLD registry didn't reply with a definitive answer about whether the
     * domain name is available. Route 53 can return this response for a variety
     * of reasons, for example, the registry is performing maintenance. Try
     * again later.
     * </p>
     * </dd>
     * <dt>PENDING</dt>
     * <dd>
     * <p>
     * The TLD registry didn't return a response in the expected amount of time.
     * When the response is delayed, it usually takes just a few extra seconds.
     * You can resubmit the request immediately.
     * </p>
     * </dd>
     * <dt>RESERVED</dt>
     * <dd>
     * <p>
     * The domain name has been reserved for another person or organization.
     * </p>
     * </dd>
     * <dt>UNAVAILABLE</dt>
     * <dd>
     * <p>
     * The domain name is not available.
     * </p>
     * </dd>
     * <dt>UNAVAILABLE_PREMIUM</dt>
     * <dd>
     * <p>
     * The domain name is not available.
     * </p>
     * </dd>
     * <dt>UNAVAILABLE_RESTRICTED</dt>
     * <dd>
     * <p>
     * The domain name is forbidden.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, AVAILABLE_RESERVED, AVAILABLE_PREORDER,
     * UNAVAILABLE, UNAVAILABLE_PREMIUM, UNAVAILABLE_RESTRICTED, RESERVED,
     * DONT_KNOW
     *
     * @param availability <p>
     *            Whether the domain name is available for registering.
     *            </p>
     *            <note>
     *            <p>
     *            You can register only domains designated as
     *            <code>AVAILABLE</code>.
     *            </p>
     *            </note>
     *            <p>
     *            Valid values:
     *            </p>
     *            <dl>
     *            <dt>AVAILABLE</dt>
     *            <dd>
     *            <p>
     *            The domain name is available.
     *            </p>
     *            </dd>
     *            <dt>AVAILABLE_RESERVED</dt>
     *            <dd>
     *            <p>
     *            The domain name is reserved under specific conditions.
     *            </p>
     *            </dd>
     *            <dt>AVAILABLE_PREORDER</dt>
     *            <dd>
     *            <p>
     *            The domain name is available and can be preordered.
     *            </p>
     *            </dd>
     *            <dt>DONT_KNOW</dt>
     *            <dd>
     *            <p>
     *            The TLD registry didn't reply with a definitive answer about
     *            whether the domain name is available. Route 53 can return this
     *            response for a variety of reasons, for example, the registry
     *            is performing maintenance. Try again later.
     *            </p>
     *            </dd>
     *            <dt>PENDING</dt>
     *            <dd>
     *            <p>
     *            The TLD registry didn't return a response in the expected
     *            amount of time. When the response is delayed, it usually takes
     *            just a few extra seconds. You can resubmit the request
     *            immediately.
     *            </p>
     *            </dd>
     *            <dt>RESERVED</dt>
     *            <dd>
     *            <p>
     *            The domain name has been reserved for another person or
     *            organization.
     *            </p>
     *            </dd>
     *            <dt>UNAVAILABLE</dt>
     *            <dd>
     *            <p>
     *            The domain name is not available.
     *            </p>
     *            </dd>
     *            <dt>UNAVAILABLE_PREMIUM</dt>
     *            <dd>
     *            <p>
     *            The domain name is not available.
     *            </p>
     *            </dd>
     *            <dt>UNAVAILABLE_RESTRICTED</dt>
     *            <dd>
     *            <p>
     *            The domain name is forbidden.
     *            </p>
     *            </dd>
     *            </dl>
     * @see DomainAvailability
     */
    public void setAvailability(DomainAvailability availability) {
        this.availability = availability.toString();
    }

    /**
     * <p>
     * Whether the domain name is available for registering.
     * </p>
     * <note>
     * <p>
     * You can register only domains designated as <code>AVAILABLE</code>.
     * </p>
     * </note>
     * <p>
     * Valid values:
     * </p>
     * <dl>
     * <dt>AVAILABLE</dt>
     * <dd>
     * <p>
     * The domain name is available.
     * </p>
     * </dd>
     * <dt>AVAILABLE_RESERVED</dt>
     * <dd>
     * <p>
     * The domain name is reserved under specific conditions.
     * </p>
     * </dd>
     * <dt>AVAILABLE_PREORDER</dt>
     * <dd>
     * <p>
     * The domain name is available and can be preordered.
     * </p>
     * </dd>
     * <dt>DONT_KNOW</dt>
     * <dd>
     * <p>
     * The TLD registry didn't reply with a definitive answer about whether the
     * domain name is available. Route 53 can return this response for a variety
     * of reasons, for example, the registry is performing maintenance. Try
     * again later.
     * </p>
     * </dd>
     * <dt>PENDING</dt>
     * <dd>
     * <p>
     * The TLD registry didn't return a response in the expected amount of time.
     * When the response is delayed, it usually takes just a few extra seconds.
     * You can resubmit the request immediately.
     * </p>
     * </dd>
     * <dt>RESERVED</dt>
     * <dd>
     * <p>
     * The domain name has been reserved for another person or organization.
     * </p>
     * </dd>
     * <dt>UNAVAILABLE</dt>
     * <dd>
     * <p>
     * The domain name is not available.
     * </p>
     * </dd>
     * <dt>UNAVAILABLE_PREMIUM</dt>
     * <dd>
     * <p>
     * The domain name is not available.
     * </p>
     * </dd>
     * <dt>UNAVAILABLE_RESTRICTED</dt>
     * <dd>
     * <p>
     * The domain name is forbidden.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, AVAILABLE_RESERVED, AVAILABLE_PREORDER,
     * UNAVAILABLE, UNAVAILABLE_PREMIUM, UNAVAILABLE_RESTRICTED, RESERVED,
     * DONT_KNOW
     *
     * @param availability <p>
     *            Whether the domain name is available for registering.
     *            </p>
     *            <note>
     *            <p>
     *            You can register only domains designated as
     *            <code>AVAILABLE</code>.
     *            </p>
     *            </note>
     *            <p>
     *            Valid values:
     *            </p>
     *            <dl>
     *            <dt>AVAILABLE</dt>
     *            <dd>
     *            <p>
     *            The domain name is available.
     *            </p>
     *            </dd>
     *            <dt>AVAILABLE_RESERVED</dt>
     *            <dd>
     *            <p>
     *            The domain name is reserved under specific conditions.
     *            </p>
     *            </dd>
     *            <dt>AVAILABLE_PREORDER</dt>
     *            <dd>
     *            <p>
     *            The domain name is available and can be preordered.
     *            </p>
     *            </dd>
     *            <dt>DONT_KNOW</dt>
     *            <dd>
     *            <p>
     *            The TLD registry didn't reply with a definitive answer about
     *            whether the domain name is available. Route 53 can return this
     *            response for a variety of reasons, for example, the registry
     *            is performing maintenance. Try again later.
     *            </p>
     *            </dd>
     *            <dt>PENDING</dt>
     *            <dd>
     *            <p>
     *            The TLD registry didn't return a response in the expected
     *            amount of time. When the response is delayed, it usually takes
     *            just a few extra seconds. You can resubmit the request
     *            immediately.
     *            </p>
     *            </dd>
     *            <dt>RESERVED</dt>
     *            <dd>
     *            <p>
     *            The domain name has been reserved for another person or
     *            organization.
     *            </p>
     *            </dd>
     *            <dt>UNAVAILABLE</dt>
     *            <dd>
     *            <p>
     *            The domain name is not available.
     *            </p>
     *            </dd>
     *            <dt>UNAVAILABLE_PREMIUM</dt>
     *            <dd>
     *            <p>
     *            The domain name is not available.
     *            </p>
     *            </dd>
     *            <dt>UNAVAILABLE_RESTRICTED</dt>
     *            <dd>
     *            <p>
     *            The domain name is forbidden.
     *            </p>
     *            </dd>
     *            </dl>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DomainAvailability
     */
    public CheckDomainAvailabilityResult withAvailability(DomainAvailability availability) {
        this.availability = availability.toString();
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
        if (getAvailability() != null)
            sb.append("Availability: " + getAvailability());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAvailability() == null) ? 0 : getAvailability().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CheckDomainAvailabilityResult == false)
            return false;
        CheckDomainAvailabilityResult other = (CheckDomainAvailabilityResult) obj;

        if (other.getAvailability() == null ^ this.getAvailability() == null)
            return false;
        if (other.getAvailability() != null
                && other.getAvailability().equals(this.getAvailability()) == false)
            return false;
        return true;
    }
}
