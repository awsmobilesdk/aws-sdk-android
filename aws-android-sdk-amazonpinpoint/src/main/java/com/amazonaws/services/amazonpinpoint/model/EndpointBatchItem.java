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

package com.amazonaws.services.amazonpinpoint.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies an endpoint to create or update and the settings and attributes to
 * set or change for the endpoint.
 * </p>
 */
public class EndpointBatchItem implements Serializable {
    /**
     * <p>
     * The destination address for messages or push notifications that you send
     * to the endpoint. The address varies by channel. For a push-notification
     * channel, use the token provided by the push notification service, such as
     * an Apple Push Notification service (APNs) device token or a Firebase
     * Cloud Messaging (FCM) registration token. For the SMS channel, use a
     * phone number in E.164 format, such as +12065550100. For the email
     * channel, use an email address.
     * </p>
     */
    private String address;

    /**
     * <p>
     * One or more custom attributes that describe the endpoint by associating a
     * name with an array of values. For example, the value of a custom
     * attribute named Interests might be: ["Science", "Music", "Travel"]. You
     * can use these attributes as filter criteria when you create segments.
     * Attribute names are case sensitive.
     * </p>
     * <p>
     * An attribute name can contain up to 50 characters. An attribute value can
     * contain up to 100 characters. When you define the name of a custom
     * attribute, avoid using the following characters: number sign (#), colon
     * (:), question mark (?), backslash (\), and slash (/). The Amazon Pinpoint
     * console can't display attribute names that contain these characters. This
     * restriction doesn't apply to attribute values.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> attributes;

    /**
     * <p>
     * The channel to use when sending messages or push notifications to the
     * endpoint.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GCM, APNS, APNS_SANDBOX, APNS_VOIP,
     * APNS_VOIP_SANDBOX, ADM, SMS, VOICE, EMAIL, BAIDU, CUSTOM
     */
    private String channelType;

    /**
     * <p>
     * The demographic information for the endpoint, such as the time zone and
     * platform.
     * </p>
     */
    private EndpointDemographic demographic;

    /**
     * <p>
     * The date and time, in ISO 8601 format, when the endpoint was created or
     * updated.
     * </p>
     */
    private String effectiveDate;

    /**
     * <p>
     * Specifies whether to send messages or push notifications to the endpoint.
     * Valid values are: ACTIVE, messages are sent to the endpoint; and,
     * INACTIVE, messages aren’t sent to the endpoint.
     * </p>
     * <p>
     * Amazon Pinpoint automatically sets this value to ACTIVE when you create
     * an endpoint or update an existing endpoint. Amazon Pinpoint automatically
     * sets this value to INACTIVE if you update another endpoint that has the
     * same address specified by the Address property.
     * </p>
     */
    private String endpointStatus;

    /**
     * <p>
     * The unique identifier for the endpoint in the context of the batch.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The geographic information for the endpoint.
     * </p>
     */
    private EndpointLocation location;

    /**
     * <p>
     * One or more custom metrics that your app reports to Amazon Pinpoint for
     * the endpoint.
     * </p>
     */
    private java.util.Map<String, Double> metrics;

    /**
     * <p>
     * Specifies whether the user who's associated with the endpoint has opted
     * out of receiving messages and push notifications from you. Possible
     * values are: ALL, the user has opted out and doesn't want to receive any
     * messages or push notifications; and, NONE, the user hasn't opted out and
     * wants to receive all messages and push notifications.
     * </p>
     */
    private String optOut;

    /**
     * <p>
     * The unique identifier for the request to create or update the endpoint.
     * </p>
     */
    private String requestId;

    /**
     * <p>
     * One or more custom attributes that describe the user who's associated
     * with the endpoint.
     * </p>
     */
    private EndpointUser user;

    /**
     * <p>
     * The destination address for messages or push notifications that you send
     * to the endpoint. The address varies by channel. For a push-notification
     * channel, use the token provided by the push notification service, such as
     * an Apple Push Notification service (APNs) device token or a Firebase
     * Cloud Messaging (FCM) registration token. For the SMS channel, use a
     * phone number in E.164 format, such as +12065550100. For the email
     * channel, use an email address.
     * </p>
     *
     * @return <p>
     *         The destination address for messages or push notifications that
     *         you send to the endpoint. The address varies by channel. For a
     *         push-notification channel, use the token provided by the push
     *         notification service, such as an Apple Push Notification service
     *         (APNs) device token or a Firebase Cloud Messaging (FCM)
     *         registration token. For the SMS channel, use a phone number in
     *         E.164 format, such as +12065550100. For the email channel, use an
     *         email address.
     *         </p>
     */
    public String getAddress() {
        return address;
    }

    /**
     * <p>
     * The destination address for messages or push notifications that you send
     * to the endpoint. The address varies by channel. For a push-notification
     * channel, use the token provided by the push notification service, such as
     * an Apple Push Notification service (APNs) device token or a Firebase
     * Cloud Messaging (FCM) registration token. For the SMS channel, use a
     * phone number in E.164 format, such as +12065550100. For the email
     * channel, use an email address.
     * </p>
     *
     * @param address <p>
     *            The destination address for messages or push notifications
     *            that you send to the endpoint. The address varies by channel.
     *            For a push-notification channel, use the token provided by the
     *            push notification service, such as an Apple Push Notification
     *            service (APNs) device token or a Firebase Cloud Messaging
     *            (FCM) registration token. For the SMS channel, use a phone
     *            number in E.164 format, such as +12065550100. For the email
     *            channel, use an email address.
     *            </p>
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * <p>
     * The destination address for messages or push notifications that you send
     * to the endpoint. The address varies by channel. For a push-notification
     * channel, use the token provided by the push notification service, such as
     * an Apple Push Notification service (APNs) device token or a Firebase
     * Cloud Messaging (FCM) registration token. For the SMS channel, use a
     * phone number in E.164 format, such as +12065550100. For the email
     * channel, use an email address.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param address <p>
     *            The destination address for messages or push notifications
     *            that you send to the endpoint. The address varies by channel.
     *            For a push-notification channel, use the token provided by the
     *            push notification service, such as an Apple Push Notification
     *            service (APNs) device token or a Firebase Cloud Messaging
     *            (FCM) registration token. For the SMS channel, use a phone
     *            number in E.164 format, such as +12065550100. For the email
     *            channel, use an email address.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointBatchItem withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * <p>
     * One or more custom attributes that describe the endpoint by associating a
     * name with an array of values. For example, the value of a custom
     * attribute named Interests might be: ["Science", "Music", "Travel"]. You
     * can use these attributes as filter criteria when you create segments.
     * Attribute names are case sensitive.
     * </p>
     * <p>
     * An attribute name can contain up to 50 characters. An attribute value can
     * contain up to 100 characters. When you define the name of a custom
     * attribute, avoid using the following characters: number sign (#), colon
     * (:), question mark (?), backslash (\), and slash (/). The Amazon Pinpoint
     * console can't display attribute names that contain these characters. This
     * restriction doesn't apply to attribute values.
     * </p>
     *
     * @return <p>
     *         One or more custom attributes that describe the endpoint by
     *         associating a name with an array of values. For example, the
     *         value of a custom attribute named Interests might be: ["Science",
     *         "Music", "Travel"]. You can use these attributes as filter
     *         criteria when you create segments. Attribute names are case
     *         sensitive.
     *         </p>
     *         <p>
     *         An attribute name can contain up to 50 characters. An attribute
     *         value can contain up to 100 characters. When you define the name
     *         of a custom attribute, avoid using the following characters:
     *         number sign (#), colon (:), question mark (?), backslash (\), and
     *         slash (/). The Amazon Pinpoint console can't display attribute
     *         names that contain these characters. This restriction doesn't
     *         apply to attribute values.
     *         </p>
     */
    public java.util.Map<String, java.util.List<String>> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * One or more custom attributes that describe the endpoint by associating a
     * name with an array of values. For example, the value of a custom
     * attribute named Interests might be: ["Science", "Music", "Travel"]. You
     * can use these attributes as filter criteria when you create segments.
     * Attribute names are case sensitive.
     * </p>
     * <p>
     * An attribute name can contain up to 50 characters. An attribute value can
     * contain up to 100 characters. When you define the name of a custom
     * attribute, avoid using the following characters: number sign (#), colon
     * (:), question mark (?), backslash (\), and slash (/). The Amazon Pinpoint
     * console can't display attribute names that contain these characters. This
     * restriction doesn't apply to attribute values.
     * </p>
     *
     * @param attributes <p>
     *            One or more custom attributes that describe the endpoint by
     *            associating a name with an array of values. For example, the
     *            value of a custom attribute named Interests might be:
     *            ["Science", "Music", "Travel"]. You can use these attributes
     *            as filter criteria when you create segments. Attribute names
     *            are case sensitive.
     *            </p>
     *            <p>
     *            An attribute name can contain up to 50 characters. An
     *            attribute value can contain up to 100 characters. When you
     *            define the name of a custom attribute, avoid using the
     *            following characters: number sign (#), colon (:), question
     *            mark (?), backslash (\), and slash (/). The Amazon Pinpoint
     *            console can't display attribute names that contain these
     *            characters. This restriction doesn't apply to attribute
     *            values.
     *            </p>
     */
    public void setAttributes(java.util.Map<String, java.util.List<String>> attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * One or more custom attributes that describe the endpoint by associating a
     * name with an array of values. For example, the value of a custom
     * attribute named Interests might be: ["Science", "Music", "Travel"]. You
     * can use these attributes as filter criteria when you create segments.
     * Attribute names are case sensitive.
     * </p>
     * <p>
     * An attribute name can contain up to 50 characters. An attribute value can
     * contain up to 100 characters. When you define the name of a custom
     * attribute, avoid using the following characters: number sign (#), colon
     * (:), question mark (?), backslash (\), and slash (/). The Amazon Pinpoint
     * console can't display attribute names that contain these characters. This
     * restriction doesn't apply to attribute values.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributes <p>
     *            One or more custom attributes that describe the endpoint by
     *            associating a name with an array of values. For example, the
     *            value of a custom attribute named Interests might be:
     *            ["Science", "Music", "Travel"]. You can use these attributes
     *            as filter criteria when you create segments. Attribute names
     *            are case sensitive.
     *            </p>
     *            <p>
     *            An attribute name can contain up to 50 characters. An
     *            attribute value can contain up to 100 characters. When you
     *            define the name of a custom attribute, avoid using the
     *            following characters: number sign (#), colon (:), question
     *            mark (?), backslash (\), and slash (/). The Amazon Pinpoint
     *            console can't display attribute names that contain these
     *            characters. This restriction doesn't apply to attribute
     *            values.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointBatchItem withAttributes(java.util.Map<String, java.util.List<String>> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * <p>
     * One or more custom attributes that describe the endpoint by associating a
     * name with an array of values. For example, the value of a custom
     * attribute named Interests might be: ["Science", "Music", "Travel"]. You
     * can use these attributes as filter criteria when you create segments.
     * Attribute names are case sensitive.
     * </p>
     * <p>
     * An attribute name can contain up to 50 characters. An attribute value can
     * contain up to 100 characters. When you define the name of a custom
     * attribute, avoid using the following characters: number sign (#), colon
     * (:), question mark (?), backslash (\), and slash (/). The Amazon Pinpoint
     * console can't display attribute names that contain these characters. This
     * restriction doesn't apply to attribute values.
     * </p>
     * <p>
     * The method adds a new key-value pair into Attributes parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Attributes.
     * @param value The corresponding value of the entry to be added into
     *            Attributes.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointBatchItem addAttributesEntry(String key, java.util.List<String> value) {
        if (null == this.attributes) {
            this.attributes = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.attributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.attributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Attributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public EndpointBatchItem clearAttributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * <p>
     * The channel to use when sending messages or push notifications to the
     * endpoint.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GCM, APNS, APNS_SANDBOX, APNS_VOIP,
     * APNS_VOIP_SANDBOX, ADM, SMS, VOICE, EMAIL, BAIDU, CUSTOM
     *
     * @return <p>
     *         The channel to use when sending messages or push notifications to
     *         the endpoint.
     *         </p>
     * @see ChannelType
     */
    public String getChannelType() {
        return channelType;
    }

    /**
     * <p>
     * The channel to use when sending messages or push notifications to the
     * endpoint.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GCM, APNS, APNS_SANDBOX, APNS_VOIP,
     * APNS_VOIP_SANDBOX, ADM, SMS, VOICE, EMAIL, BAIDU, CUSTOM
     *
     * @param channelType <p>
     *            The channel to use when sending messages or push notifications
     *            to the endpoint.
     *            </p>
     * @see ChannelType
     */
    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    /**
     * <p>
     * The channel to use when sending messages or push notifications to the
     * endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GCM, APNS, APNS_SANDBOX, APNS_VOIP,
     * APNS_VOIP_SANDBOX, ADM, SMS, VOICE, EMAIL, BAIDU, CUSTOM
     *
     * @param channelType <p>
     *            The channel to use when sending messages or push notifications
     *            to the endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChannelType
     */
    public EndpointBatchItem withChannelType(String channelType) {
        this.channelType = channelType;
        return this;
    }

    /**
     * <p>
     * The channel to use when sending messages or push notifications to the
     * endpoint.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GCM, APNS, APNS_SANDBOX, APNS_VOIP,
     * APNS_VOIP_SANDBOX, ADM, SMS, VOICE, EMAIL, BAIDU, CUSTOM
     *
     * @param channelType <p>
     *            The channel to use when sending messages or push notifications
     *            to the endpoint.
     *            </p>
     * @see ChannelType
     */
    public void setChannelType(ChannelType channelType) {
        this.channelType = channelType.toString();
    }

    /**
     * <p>
     * The channel to use when sending messages or push notifications to the
     * endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GCM, APNS, APNS_SANDBOX, APNS_VOIP,
     * APNS_VOIP_SANDBOX, ADM, SMS, VOICE, EMAIL, BAIDU, CUSTOM
     *
     * @param channelType <p>
     *            The channel to use when sending messages or push notifications
     *            to the endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChannelType
     */
    public EndpointBatchItem withChannelType(ChannelType channelType) {
        this.channelType = channelType.toString();
        return this;
    }

    /**
     * <p>
     * The demographic information for the endpoint, such as the time zone and
     * platform.
     * </p>
     *
     * @return <p>
     *         The demographic information for the endpoint, such as the time
     *         zone and platform.
     *         </p>
     */
    public EndpointDemographic getDemographic() {
        return demographic;
    }

    /**
     * <p>
     * The demographic information for the endpoint, such as the time zone and
     * platform.
     * </p>
     *
     * @param demographic <p>
     *            The demographic information for the endpoint, such as the time
     *            zone and platform.
     *            </p>
     */
    public void setDemographic(EndpointDemographic demographic) {
        this.demographic = demographic;
    }

    /**
     * <p>
     * The demographic information for the endpoint, such as the time zone and
     * platform.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param demographic <p>
     *            The demographic information for the endpoint, such as the time
     *            zone and platform.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointBatchItem withDemographic(EndpointDemographic demographic) {
        this.demographic = demographic;
        return this;
    }

    /**
     * <p>
     * The date and time, in ISO 8601 format, when the endpoint was created or
     * updated.
     * </p>
     *
     * @return <p>
     *         The date and time, in ISO 8601 format, when the endpoint was
     *         created or updated.
     *         </p>
     */
    public String getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * <p>
     * The date and time, in ISO 8601 format, when the endpoint was created or
     * updated.
     * </p>
     *
     * @param effectiveDate <p>
     *            The date and time, in ISO 8601 format, when the endpoint was
     *            created or updated.
     *            </p>
     */
    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    /**
     * <p>
     * The date and time, in ISO 8601 format, when the endpoint was created or
     * updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param effectiveDate <p>
     *            The date and time, in ISO 8601 format, when the endpoint was
     *            created or updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointBatchItem withEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    /**
     * <p>
     * Specifies whether to send messages or push notifications to the endpoint.
     * Valid values are: ACTIVE, messages are sent to the endpoint; and,
     * INACTIVE, messages aren’t sent to the endpoint.
     * </p>
     * <p>
     * Amazon Pinpoint automatically sets this value to ACTIVE when you create
     * an endpoint or update an existing endpoint. Amazon Pinpoint automatically
     * sets this value to INACTIVE if you update another endpoint that has the
     * same address specified by the Address property.
     * </p>
     *
     * @return <p>
     *         Specifies whether to send messages or push notifications to the
     *         endpoint. Valid values are: ACTIVE, messages are sent to the
     *         endpoint; and, INACTIVE, messages aren’t sent to the endpoint.
     *         </p>
     *         <p>
     *         Amazon Pinpoint automatically sets this value to ACTIVE when you
     *         create an endpoint or update an existing endpoint. Amazon
     *         Pinpoint automatically sets this value to INACTIVE if you update
     *         another endpoint that has the same address specified by the
     *         Address property.
     *         </p>
     */
    public String getEndpointStatus() {
        return endpointStatus;
    }

    /**
     * <p>
     * Specifies whether to send messages or push notifications to the endpoint.
     * Valid values are: ACTIVE, messages are sent to the endpoint; and,
     * INACTIVE, messages aren’t sent to the endpoint.
     * </p>
     * <p>
     * Amazon Pinpoint automatically sets this value to ACTIVE when you create
     * an endpoint or update an existing endpoint. Amazon Pinpoint automatically
     * sets this value to INACTIVE if you update another endpoint that has the
     * same address specified by the Address property.
     * </p>
     *
     * @param endpointStatus <p>
     *            Specifies whether to send messages or push notifications to
     *            the endpoint. Valid values are: ACTIVE, messages are sent to
     *            the endpoint; and, INACTIVE, messages aren’t sent to the
     *            endpoint.
     *            </p>
     *            <p>
     *            Amazon Pinpoint automatically sets this value to ACTIVE when
     *            you create an endpoint or update an existing endpoint. Amazon
     *            Pinpoint automatically sets this value to INACTIVE if you
     *            update another endpoint that has the same address specified by
     *            the Address property.
     *            </p>
     */
    public void setEndpointStatus(String endpointStatus) {
        this.endpointStatus = endpointStatus;
    }

    /**
     * <p>
     * Specifies whether to send messages or push notifications to the endpoint.
     * Valid values are: ACTIVE, messages are sent to the endpoint; and,
     * INACTIVE, messages aren’t sent to the endpoint.
     * </p>
     * <p>
     * Amazon Pinpoint automatically sets this value to ACTIVE when you create
     * an endpoint or update an existing endpoint. Amazon Pinpoint automatically
     * sets this value to INACTIVE if you update another endpoint that has the
     * same address specified by the Address property.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endpointStatus <p>
     *            Specifies whether to send messages or push notifications to
     *            the endpoint. Valid values are: ACTIVE, messages are sent to
     *            the endpoint; and, INACTIVE, messages aren’t sent to the
     *            endpoint.
     *            </p>
     *            <p>
     *            Amazon Pinpoint automatically sets this value to ACTIVE when
     *            you create an endpoint or update an existing endpoint. Amazon
     *            Pinpoint automatically sets this value to INACTIVE if you
     *            update another endpoint that has the same address specified by
     *            the Address property.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointBatchItem withEndpointStatus(String endpointStatus) {
        this.endpointStatus = endpointStatus;
        return this;
    }

    /**
     * <p>
     * The unique identifier for the endpoint in the context of the batch.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the endpoint in the context of the
     *         batch.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The unique identifier for the endpoint in the context of the batch.
     * </p>
     *
     * @param id <p>
     *            The unique identifier for the endpoint in the context of the
     *            batch.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the endpoint in the context of the batch.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The unique identifier for the endpoint in the context of the
     *            batch.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointBatchItem withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The geographic information for the endpoint.
     * </p>
     *
     * @return <p>
     *         The geographic information for the endpoint.
     *         </p>
     */
    public EndpointLocation getLocation() {
        return location;
    }

    /**
     * <p>
     * The geographic information for the endpoint.
     * </p>
     *
     * @param location <p>
     *            The geographic information for the endpoint.
     *            </p>
     */
    public void setLocation(EndpointLocation location) {
        this.location = location;
    }

    /**
     * <p>
     * The geographic information for the endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param location <p>
     *            The geographic information for the endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointBatchItem withLocation(EndpointLocation location) {
        this.location = location;
        return this;
    }

    /**
     * <p>
     * One or more custom metrics that your app reports to Amazon Pinpoint for
     * the endpoint.
     * </p>
     *
     * @return <p>
     *         One or more custom metrics that your app reports to Amazon
     *         Pinpoint for the endpoint.
     *         </p>
     */
    public java.util.Map<String, Double> getMetrics() {
        return metrics;
    }

    /**
     * <p>
     * One or more custom metrics that your app reports to Amazon Pinpoint for
     * the endpoint.
     * </p>
     *
     * @param metrics <p>
     *            One or more custom metrics that your app reports to Amazon
     *            Pinpoint for the endpoint.
     *            </p>
     */
    public void setMetrics(java.util.Map<String, Double> metrics) {
        this.metrics = metrics;
    }

    /**
     * <p>
     * One or more custom metrics that your app reports to Amazon Pinpoint for
     * the endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metrics <p>
     *            One or more custom metrics that your app reports to Amazon
     *            Pinpoint for the endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointBatchItem withMetrics(java.util.Map<String, Double> metrics) {
        this.metrics = metrics;
        return this;
    }

    /**
     * <p>
     * One or more custom metrics that your app reports to Amazon Pinpoint for
     * the endpoint.
     * </p>
     * <p>
     * The method adds a new key-value pair into Metrics parameter, and returns
     * a reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Metrics.
     * @param value The corresponding value of the entry to be added into
     *            Metrics.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointBatchItem addMetricsEntry(String key, Double value) {
        if (null == this.metrics) {
            this.metrics = new java.util.HashMap<String, Double>();
        }
        if (this.metrics.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.metrics.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Metrics.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public EndpointBatchItem clearMetricsEntries() {
        this.metrics = null;
        return this;
    }

    /**
     * <p>
     * Specifies whether the user who's associated with the endpoint has opted
     * out of receiving messages and push notifications from you. Possible
     * values are: ALL, the user has opted out and doesn't want to receive any
     * messages or push notifications; and, NONE, the user hasn't opted out and
     * wants to receive all messages and push notifications.
     * </p>
     *
     * @return <p>
     *         Specifies whether the user who's associated with the endpoint has
     *         opted out of receiving messages and push notifications from you.
     *         Possible values are: ALL, the user has opted out and doesn't want
     *         to receive any messages or push notifications; and, NONE, the
     *         user hasn't opted out and wants to receive all messages and push
     *         notifications.
     *         </p>
     */
    public String getOptOut() {
        return optOut;
    }

    /**
     * <p>
     * Specifies whether the user who's associated with the endpoint has opted
     * out of receiving messages and push notifications from you. Possible
     * values are: ALL, the user has opted out and doesn't want to receive any
     * messages or push notifications; and, NONE, the user hasn't opted out and
     * wants to receive all messages and push notifications.
     * </p>
     *
     * @param optOut <p>
     *            Specifies whether the user who's associated with the endpoint
     *            has opted out of receiving messages and push notifications
     *            from you. Possible values are: ALL, the user has opted out and
     *            doesn't want to receive any messages or push notifications;
     *            and, NONE, the user hasn't opted out and wants to receive all
     *            messages and push notifications.
     *            </p>
     */
    public void setOptOut(String optOut) {
        this.optOut = optOut;
    }

    /**
     * <p>
     * Specifies whether the user who's associated with the endpoint has opted
     * out of receiving messages and push notifications from you. Possible
     * values are: ALL, the user has opted out and doesn't want to receive any
     * messages or push notifications; and, NONE, the user hasn't opted out and
     * wants to receive all messages and push notifications.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optOut <p>
     *            Specifies whether the user who's associated with the endpoint
     *            has opted out of receiving messages and push notifications
     *            from you. Possible values are: ALL, the user has opted out and
     *            doesn't want to receive any messages or push notifications;
     *            and, NONE, the user hasn't opted out and wants to receive all
     *            messages and push notifications.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointBatchItem withOptOut(String optOut) {
        this.optOut = optOut;
        return this;
    }

    /**
     * <p>
     * The unique identifier for the request to create or update the endpoint.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the request to create or update the
     *         endpoint.
     *         </p>
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * <p>
     * The unique identifier for the request to create or update the endpoint.
     * </p>
     *
     * @param requestId <p>
     *            The unique identifier for the request to create or update the
     *            endpoint.
     *            </p>
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * The unique identifier for the request to create or update the endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requestId <p>
     *            The unique identifier for the request to create or update the
     *            endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointBatchItem withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * <p>
     * One or more custom attributes that describe the user who's associated
     * with the endpoint.
     * </p>
     *
     * @return <p>
     *         One or more custom attributes that describe the user who's
     *         associated with the endpoint.
     *         </p>
     */
    public EndpointUser getUser() {
        return user;
    }

    /**
     * <p>
     * One or more custom attributes that describe the user who's associated
     * with the endpoint.
     * </p>
     *
     * @param user <p>
     *            One or more custom attributes that describe the user who's
     *            associated with the endpoint.
     *            </p>
     */
    public void setUser(EndpointUser user) {
        this.user = user;
    }

    /**
     * <p>
     * One or more custom attributes that describe the user who's associated
     * with the endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param user <p>
     *            One or more custom attributes that describe the user who's
     *            associated with the endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointBatchItem withUser(EndpointUser user) {
        this.user = user;
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
        if (getAddress() != null)
            sb.append("Address: " + getAddress() + ",");
        if (getAttributes() != null)
            sb.append("Attributes: " + getAttributes() + ",");
        if (getChannelType() != null)
            sb.append("ChannelType: " + getChannelType() + ",");
        if (getDemographic() != null)
            sb.append("Demographic: " + getDemographic() + ",");
        if (getEffectiveDate() != null)
            sb.append("EffectiveDate: " + getEffectiveDate() + ",");
        if (getEndpointStatus() != null)
            sb.append("EndpointStatus: " + getEndpointStatus() + ",");
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getLocation() != null)
            sb.append("Location: " + getLocation() + ",");
        if (getMetrics() != null)
            sb.append("Metrics: " + getMetrics() + ",");
        if (getOptOut() != null)
            sb.append("OptOut: " + getOptOut() + ",");
        if (getRequestId() != null)
            sb.append("RequestId: " + getRequestId() + ",");
        if (getUser() != null)
            sb.append("User: " + getUser());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAddress() == null) ? 0 : getAddress().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode
                + ((getChannelType() == null) ? 0 : getChannelType().hashCode());
        hashCode = prime * hashCode
                + ((getDemographic() == null) ? 0 : getDemographic().hashCode());
        hashCode = prime * hashCode
                + ((getEffectiveDate() == null) ? 0 : getEffectiveDate().hashCode());
        hashCode = prime * hashCode
                + ((getEndpointStatus() == null) ? 0 : getEndpointStatus().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getMetrics() == null) ? 0 : getMetrics().hashCode());
        hashCode = prime * hashCode + ((getOptOut() == null) ? 0 : getOptOut().hashCode());
        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        hashCode = prime * hashCode + ((getUser() == null) ? 0 : getUser().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EndpointBatchItem == false)
            return false;
        EndpointBatchItem other = (EndpointBatchItem) obj;

        if (other.getAddress() == null ^ this.getAddress() == null)
            return false;
        if (other.getAddress() != null && other.getAddress().equals(this.getAddress()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null
                && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getChannelType() == null ^ this.getChannelType() == null)
            return false;
        if (other.getChannelType() != null
                && other.getChannelType().equals(this.getChannelType()) == false)
            return false;
        if (other.getDemographic() == null ^ this.getDemographic() == null)
            return false;
        if (other.getDemographic() != null
                && other.getDemographic().equals(this.getDemographic()) == false)
            return false;
        if (other.getEffectiveDate() == null ^ this.getEffectiveDate() == null)
            return false;
        if (other.getEffectiveDate() != null
                && other.getEffectiveDate().equals(this.getEffectiveDate()) == false)
            return false;
        if (other.getEndpointStatus() == null ^ this.getEndpointStatus() == null)
            return false;
        if (other.getEndpointStatus() != null
                && other.getEndpointStatus().equals(this.getEndpointStatus()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getMetrics() == null ^ this.getMetrics() == null)
            return false;
        if (other.getMetrics() != null && other.getMetrics().equals(this.getMetrics()) == false)
            return false;
        if (other.getOptOut() == null ^ this.getOptOut() == null)
            return false;
        if (other.getOptOut() != null && other.getOptOut().equals(this.getOptOut()) == false)
            return false;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null
                && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        if (other.getUser() == null ^ this.getUser() == null)
            return false;
        if (other.getUser() != null && other.getUser().equals(this.getUser()) == false)
            return false;
        return true;
    }
}