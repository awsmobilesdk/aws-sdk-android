/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <note>
 * <p>
 * This action might generate an SMS text message. Starting June 1, 2021, US
 * telecom carriers require you to register an origination phone number before
 * you can send SMS messages to US phone numbers. If you use SMS text messages
 * in Amazon Cognito, you must register a phone number with <a
 * href="https://console.aws.amazon.com/pinpoint/home/">Amazon Pinpoint</a>.
 * Amazon Cognito uses the registered number automatically. Otherwise, Amazon
 * Cognito users who must receive SMS messages might not be able to sign up,
 * activate their accounts, or sign in.
 * </p>
 * <p>
 * If you have never used SMS text messages with Amazon Cognito or any other
 * Amazon Web Service, Amazon Simple Notification Service might place your
 * account in the SMS sandbox. In <i> <a
 * href="https://docs.aws.amazon.com/sns/latest/dg/sns-sms-sandbox.html">sandbox
 * mode</a> </i>, you can send messages only to verified phone numbers. After
 * you test your app while in the sandbox environment, you can move out of the
 * sandbox and into production. For more information, see <a href=
 * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-sms-settings.html"
 * > SMS message settings for Amazon Cognito user pools</a> in the <i>Amazon
 * Cognito Developer Guide</i>.
 * </p>
 * </note>
 * <p>
 * Updates the specified user's attributes, including developer attributes, as
 * an administrator. Works on any user. To delete an attribute from your user,
 * submit the attribute in your API request with a blank value.
 * </p>
 * <p>
 * For custom attributes, you must prepend the <code>custom:</code> prefix to
 * the attribute name.
 * </p>
 * <p>
 * In addition to updating user attributes, this API can also be used to mark
 * phone and email as verified.
 * </p>
 * <note>
 * <p>
 * Amazon Cognito evaluates Identity and Access Management (IAM) policies in
 * requests for this API operation. For this operation, you must use IAM
 * credentials to authorize requests, and you must grant yourself the
 * corresponding IAM permission in a policy.
 * </p>
 * <p class="title">
 * <b>Learn more</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-signing.html"
 * >Signing Amazon Web Services API Requests</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
 * >Using the Amazon Cognito user pools API and user pool endpoints</a>
 * </p>
 * </li>
 * </ul>
 * </note>
 */
public class AdminUpdateUserAttributesRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The user pool ID for the user pool where you want to update user
     * attributes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     */
    private String userPoolId;

    /**
     * <p>
     * The username of the user that you want to query or modify. The value of
     * this parameter is typically your user's username, but it can be any of
     * their alias attributes. If <code>username</code> isn't an alias attribute
     * in your user pool, this value must be the <code>sub</code> of a local
     * user or the username of a user from a third-party IdP.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     */
    private String username;

    /**
     * <p>
     * An array of name-value pairs representing user attributes.
     * </p>
     * <p>
     * For custom attributes, you must prepend the <code>custom:</code> prefix
     * to the attribute name.
     * </p>
     * <p>
     * If your user pool requires verification before Amazon Cognito updates an
     * attribute value that you specify in this request, Amazon Cognito doesn’t
     * immediately update the value of that attribute. After your user receives
     * and responds to a verification message to verify the new value, Amazon
     * Cognito updates the attribute value. Your user can sign in and receive
     * messages with the original attribute value until they verify the new
     * value.
     * </p>
     * <p>
     * To update the value of an attribute that requires verification in the
     * same API request, include the <code>email_verified</code> or
     * <code>phone_number_verified</code> attribute, with a value of
     * <code>true</code>. If you set the <code>email_verified</code> or
     * <code>phone_number_verified</code> value for an <code>email</code> or
     * <code>phone_number</code> attribute that requires verification to
     * <code>true</code>, Amazon Cognito doesn’t send a verification message to
     * your user.
     * </p>
     */
    private java.util.List<AttributeType> userAttributes;

    /**
     * <p>
     * A map of custom key-value pairs that you can provide as input for any
     * custom workflows that this action triggers.
     * </p>
     * <p>
     * You create custom workflows by assigning Lambda functions to user pool
     * triggers. When you use the AdminUpdateUserAttributes API action, Amazon
     * Cognito invokes the function that is assigned to the <i>custom
     * message</i> trigger. When Amazon Cognito invokes this function, it passes
     * a JSON payload, which the function receives as input. This payload
     * contains a <code>clientMetadata</code> attribute, which provides the data
     * that you assigned to the ClientMetadata parameter in your
     * AdminUpdateUserAttributes request. In your function code in Lambda, you
     * can process the <code>clientMetadata</code> value to enhance your
     * workflow for your specific needs.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html"
     * > Customizing user pool Workflows with Lambda Triggers</a> in the
     * <i>Amazon Cognito Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * When you use the ClientMetadata parameter, remember that Amazon Cognito
     * won't do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Store the ClientMetadata value. This data is available only to Lambda
     * triggers that are assigned to a user pool to support custom workflows. If
     * your user pool configuration doesn't include triggers, the ClientMetadata
     * parameter serves no purpose.
     * </p>
     * </li>
     * <li>
     * <p>
     * Validate the ClientMetadata value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Encrypt the ClientMetadata value. Don't use Amazon Cognito to provide
     * sensitive information.
     * </p>
     * </li>
     * </ul>
     * </note>
     */
    private java.util.Map<String, String> clientMetadata;

    /**
     * <p>
     * The user pool ID for the user pool where you want to update user
     * attributes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @return <p>
     *         The user pool ID for the user pool where you want to update user
     *         attributes.
     *         </p>
     */
    public String getUserPoolId() {
        return userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool where you want to update user
     * attributes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @param userPoolId <p>
     *            The user pool ID for the user pool where you want to update
     *            user attributes.
     *            </p>
     */
    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool where you want to update user
     * attributes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @param userPoolId <p>
     *            The user pool ID for the user pool where you want to update
     *            user attributes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminUpdateUserAttributesRequest withUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
        return this;
    }

    /**
     * <p>
     * The username of the user that you want to query or modify. The value of
     * this parameter is typically your user's username, but it can be any of
     * their alias attributes. If <code>username</code> isn't an alias attribute
     * in your user pool, this value must be the <code>sub</code> of a local
     * user or the username of a user from a third-party IdP.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @return <p>
     *         The username of the user that you want to query or modify. The
     *         value of this parameter is typically your user's username, but it
     *         can be any of their alias attributes. If <code>username</code>
     *         isn't an alias attribute in your user pool, this value must be
     *         the <code>sub</code> of a local user or the username of a user
     *         from a third-party IdP.
     *         </p>
     */
    public String getUsername() {
        return username;
    }

    /**
     * <p>
     * The username of the user that you want to query or modify. The value of
     * this parameter is typically your user's username, but it can be any of
     * their alias attributes. If <code>username</code> isn't an alias attribute
     * in your user pool, this value must be the <code>sub</code> of a local
     * user or the username of a user from a third-party IdP.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @param username <p>
     *            The username of the user that you want to query or modify. The
     *            value of this parameter is typically your user's username, but
     *            it can be any of their alias attributes. If
     *            <code>username</code> isn't an alias attribute in your user
     *            pool, this value must be the <code>sub</code> of a local user
     *            or the username of a user from a third-party IdP.
     *            </p>
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The username of the user that you want to query or modify. The value of
     * this parameter is typically your user's username, but it can be any of
     * their alias attributes. If <code>username</code> isn't an alias attribute
     * in your user pool, this value must be the <code>sub</code> of a local
     * user or the username of a user from a third-party IdP.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @param username <p>
     *            The username of the user that you want to query or modify. The
     *            value of this parameter is typically your user's username, but
     *            it can be any of their alias attributes. If
     *            <code>username</code> isn't an alias attribute in your user
     *            pool, this value must be the <code>sub</code> of a local user
     *            or the username of a user from a third-party IdP.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminUpdateUserAttributesRequest withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * <p>
     * An array of name-value pairs representing user attributes.
     * </p>
     * <p>
     * For custom attributes, you must prepend the <code>custom:</code> prefix
     * to the attribute name.
     * </p>
     * <p>
     * If your user pool requires verification before Amazon Cognito updates an
     * attribute value that you specify in this request, Amazon Cognito doesn’t
     * immediately update the value of that attribute. After your user receives
     * and responds to a verification message to verify the new value, Amazon
     * Cognito updates the attribute value. Your user can sign in and receive
     * messages with the original attribute value until they verify the new
     * value.
     * </p>
     * <p>
     * To update the value of an attribute that requires verification in the
     * same API request, include the <code>email_verified</code> or
     * <code>phone_number_verified</code> attribute, with a value of
     * <code>true</code>. If you set the <code>email_verified</code> or
     * <code>phone_number_verified</code> value for an <code>email</code> or
     * <code>phone_number</code> attribute that requires verification to
     * <code>true</code>, Amazon Cognito doesn’t send a verification message to
     * your user.
     * </p>
     *
     * @return <p>
     *         An array of name-value pairs representing user attributes.
     *         </p>
     *         <p>
     *         For custom attributes, you must prepend the <code>custom:</code>
     *         prefix to the attribute name.
     *         </p>
     *         <p>
     *         If your user pool requires verification before Amazon Cognito
     *         updates an attribute value that you specify in this request,
     *         Amazon Cognito doesn’t immediately update the value of that
     *         attribute. After your user receives and responds to a
     *         verification message to verify the new value, Amazon Cognito
     *         updates the attribute value. Your user can sign in and receive
     *         messages with the original attribute value until they verify the
     *         new value.
     *         </p>
     *         <p>
     *         To update the value of an attribute that requires verification in
     *         the same API request, include the <code>email_verified</code> or
     *         <code>phone_number_verified</code> attribute, with a value of
     *         <code>true</code>. If you set the <code>email_verified</code> or
     *         <code>phone_number_verified</code> value for an
     *         <code>email</code> or <code>phone_number</code> attribute that
     *         requires verification to <code>true</code>, Amazon Cognito
     *         doesn’t send a verification message to your user.
     *         </p>
     */
    public java.util.List<AttributeType> getUserAttributes() {
        return userAttributes;
    }

    /**
     * <p>
     * An array of name-value pairs representing user attributes.
     * </p>
     * <p>
     * For custom attributes, you must prepend the <code>custom:</code> prefix
     * to the attribute name.
     * </p>
     * <p>
     * If your user pool requires verification before Amazon Cognito updates an
     * attribute value that you specify in this request, Amazon Cognito doesn’t
     * immediately update the value of that attribute. After your user receives
     * and responds to a verification message to verify the new value, Amazon
     * Cognito updates the attribute value. Your user can sign in and receive
     * messages with the original attribute value until they verify the new
     * value.
     * </p>
     * <p>
     * To update the value of an attribute that requires verification in the
     * same API request, include the <code>email_verified</code> or
     * <code>phone_number_verified</code> attribute, with a value of
     * <code>true</code>. If you set the <code>email_verified</code> or
     * <code>phone_number_verified</code> value for an <code>email</code> or
     * <code>phone_number</code> attribute that requires verification to
     * <code>true</code>, Amazon Cognito doesn’t send a verification message to
     * your user.
     * </p>
     *
     * @param userAttributes <p>
     *            An array of name-value pairs representing user attributes.
     *            </p>
     *            <p>
     *            For custom attributes, you must prepend the
     *            <code>custom:</code> prefix to the attribute name.
     *            </p>
     *            <p>
     *            If your user pool requires verification before Amazon Cognito
     *            updates an attribute value that you specify in this request,
     *            Amazon Cognito doesn’t immediately update the value of that
     *            attribute. After your user receives and responds to a
     *            verification message to verify the new value, Amazon Cognito
     *            updates the attribute value. Your user can sign in and receive
     *            messages with the original attribute value until they verify
     *            the new value.
     *            </p>
     *            <p>
     *            To update the value of an attribute that requires verification
     *            in the same API request, include the
     *            <code>email_verified</code> or
     *            <code>phone_number_verified</code> attribute, with a value of
     *            <code>true</code>. If you set the <code>email_verified</code>
     *            or <code>phone_number_verified</code> value for an
     *            <code>email</code> or <code>phone_number</code> attribute that
     *            requires verification to <code>true</code>, Amazon Cognito
     *            doesn’t send a verification message to your user.
     *            </p>
     */
    public void setUserAttributes(java.util.Collection<AttributeType> userAttributes) {
        if (userAttributes == null) {
            this.userAttributes = null;
            return;
        }

        this.userAttributes = new java.util.ArrayList<AttributeType>(userAttributes);
    }

    /**
     * <p>
     * An array of name-value pairs representing user attributes.
     * </p>
     * <p>
     * For custom attributes, you must prepend the <code>custom:</code> prefix
     * to the attribute name.
     * </p>
     * <p>
     * If your user pool requires verification before Amazon Cognito updates an
     * attribute value that you specify in this request, Amazon Cognito doesn’t
     * immediately update the value of that attribute. After your user receives
     * and responds to a verification message to verify the new value, Amazon
     * Cognito updates the attribute value. Your user can sign in and receive
     * messages with the original attribute value until they verify the new
     * value.
     * </p>
     * <p>
     * To update the value of an attribute that requires verification in the
     * same API request, include the <code>email_verified</code> or
     * <code>phone_number_verified</code> attribute, with a value of
     * <code>true</code>. If you set the <code>email_verified</code> or
     * <code>phone_number_verified</code> value for an <code>email</code> or
     * <code>phone_number</code> attribute that requires verification to
     * <code>true</code>, Amazon Cognito doesn’t send a verification message to
     * your user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userAttributes <p>
     *            An array of name-value pairs representing user attributes.
     *            </p>
     *            <p>
     *            For custom attributes, you must prepend the
     *            <code>custom:</code> prefix to the attribute name.
     *            </p>
     *            <p>
     *            If your user pool requires verification before Amazon Cognito
     *            updates an attribute value that you specify in this request,
     *            Amazon Cognito doesn’t immediately update the value of that
     *            attribute. After your user receives and responds to a
     *            verification message to verify the new value, Amazon Cognito
     *            updates the attribute value. Your user can sign in and receive
     *            messages with the original attribute value until they verify
     *            the new value.
     *            </p>
     *            <p>
     *            To update the value of an attribute that requires verification
     *            in the same API request, include the
     *            <code>email_verified</code> or
     *            <code>phone_number_verified</code> attribute, with a value of
     *            <code>true</code>. If you set the <code>email_verified</code>
     *            or <code>phone_number_verified</code> value for an
     *            <code>email</code> or <code>phone_number</code> attribute that
     *            requires verification to <code>true</code>, Amazon Cognito
     *            doesn’t send a verification message to your user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminUpdateUserAttributesRequest withUserAttributes(AttributeType... userAttributes) {
        if (getUserAttributes() == null) {
            this.userAttributes = new java.util.ArrayList<AttributeType>(userAttributes.length);
        }
        for (AttributeType value : userAttributes) {
            this.userAttributes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of name-value pairs representing user attributes.
     * </p>
     * <p>
     * For custom attributes, you must prepend the <code>custom:</code> prefix
     * to the attribute name.
     * </p>
     * <p>
     * If your user pool requires verification before Amazon Cognito updates an
     * attribute value that you specify in this request, Amazon Cognito doesn’t
     * immediately update the value of that attribute. After your user receives
     * and responds to a verification message to verify the new value, Amazon
     * Cognito updates the attribute value. Your user can sign in and receive
     * messages with the original attribute value until they verify the new
     * value.
     * </p>
     * <p>
     * To update the value of an attribute that requires verification in the
     * same API request, include the <code>email_verified</code> or
     * <code>phone_number_verified</code> attribute, with a value of
     * <code>true</code>. If you set the <code>email_verified</code> or
     * <code>phone_number_verified</code> value for an <code>email</code> or
     * <code>phone_number</code> attribute that requires verification to
     * <code>true</code>, Amazon Cognito doesn’t send a verification message to
     * your user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userAttributes <p>
     *            An array of name-value pairs representing user attributes.
     *            </p>
     *            <p>
     *            For custom attributes, you must prepend the
     *            <code>custom:</code> prefix to the attribute name.
     *            </p>
     *            <p>
     *            If your user pool requires verification before Amazon Cognito
     *            updates an attribute value that you specify in this request,
     *            Amazon Cognito doesn’t immediately update the value of that
     *            attribute. After your user receives and responds to a
     *            verification message to verify the new value, Amazon Cognito
     *            updates the attribute value. Your user can sign in and receive
     *            messages with the original attribute value until they verify
     *            the new value.
     *            </p>
     *            <p>
     *            To update the value of an attribute that requires verification
     *            in the same API request, include the
     *            <code>email_verified</code> or
     *            <code>phone_number_verified</code> attribute, with a value of
     *            <code>true</code>. If you set the <code>email_verified</code>
     *            or <code>phone_number_verified</code> value for an
     *            <code>email</code> or <code>phone_number</code> attribute that
     *            requires verification to <code>true</code>, Amazon Cognito
     *            doesn’t send a verification message to your user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminUpdateUserAttributesRequest withUserAttributes(
            java.util.Collection<AttributeType> userAttributes) {
        setUserAttributes(userAttributes);
        return this;
    }

    /**
     * <p>
     * A map of custom key-value pairs that you can provide as input for any
     * custom workflows that this action triggers.
     * </p>
     * <p>
     * You create custom workflows by assigning Lambda functions to user pool
     * triggers. When you use the AdminUpdateUserAttributes API action, Amazon
     * Cognito invokes the function that is assigned to the <i>custom
     * message</i> trigger. When Amazon Cognito invokes this function, it passes
     * a JSON payload, which the function receives as input. This payload
     * contains a <code>clientMetadata</code> attribute, which provides the data
     * that you assigned to the ClientMetadata parameter in your
     * AdminUpdateUserAttributes request. In your function code in Lambda, you
     * can process the <code>clientMetadata</code> value to enhance your
     * workflow for your specific needs.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html"
     * > Customizing user pool Workflows with Lambda Triggers</a> in the
     * <i>Amazon Cognito Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * When you use the ClientMetadata parameter, remember that Amazon Cognito
     * won't do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Store the ClientMetadata value. This data is available only to Lambda
     * triggers that are assigned to a user pool to support custom workflows. If
     * your user pool configuration doesn't include triggers, the ClientMetadata
     * parameter serves no purpose.
     * </p>
     * </li>
     * <li>
     * <p>
     * Validate the ClientMetadata value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Encrypt the ClientMetadata value. Don't use Amazon Cognito to provide
     * sensitive information.
     * </p>
     * </li>
     * </ul>
     * </note>
     *
     * @return <p>
     *         A map of custom key-value pairs that you can provide as input for
     *         any custom workflows that this action triggers.
     *         </p>
     *         <p>
     *         You create custom workflows by assigning Lambda functions to user
     *         pool triggers. When you use the AdminUpdateUserAttributes API
     *         action, Amazon Cognito invokes the function that is assigned to
     *         the <i>custom message</i> trigger. When Amazon Cognito invokes
     *         this function, it passes a JSON payload, which the function
     *         receives as input. This payload contains a
     *         <code>clientMetadata</code> attribute, which provides the data
     *         that you assigned to the ClientMetadata parameter in your
     *         AdminUpdateUserAttributes request. In your function code in
     *         Lambda, you can process the <code>clientMetadata</code> value to
     *         enhance your workflow for your specific needs.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html"
     *         > Customizing user pool Workflows with Lambda Triggers</a> in the
     *         <i>Amazon Cognito Developer Guide</i>.
     *         </p>
     *         <note>
     *         <p>
     *         When you use the ClientMetadata parameter, remember that Amazon
     *         Cognito won't do the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Store the ClientMetadata value. This data is available only to
     *         Lambda triggers that are assigned to a user pool to support
     *         custom workflows. If your user pool configuration doesn't include
     *         triggers, the ClientMetadata parameter serves no purpose.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Validate the ClientMetadata value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Encrypt the ClientMetadata value. Don't use Amazon Cognito to
     *         provide sensitive information.
     *         </p>
     *         </li>
     *         </ul>
     *         </note>
     */
    public java.util.Map<String, String> getClientMetadata() {
        return clientMetadata;
    }

    /**
     * <p>
     * A map of custom key-value pairs that you can provide as input for any
     * custom workflows that this action triggers.
     * </p>
     * <p>
     * You create custom workflows by assigning Lambda functions to user pool
     * triggers. When you use the AdminUpdateUserAttributes API action, Amazon
     * Cognito invokes the function that is assigned to the <i>custom
     * message</i> trigger. When Amazon Cognito invokes this function, it passes
     * a JSON payload, which the function receives as input. This payload
     * contains a <code>clientMetadata</code> attribute, which provides the data
     * that you assigned to the ClientMetadata parameter in your
     * AdminUpdateUserAttributes request. In your function code in Lambda, you
     * can process the <code>clientMetadata</code> value to enhance your
     * workflow for your specific needs.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html"
     * > Customizing user pool Workflows with Lambda Triggers</a> in the
     * <i>Amazon Cognito Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * When you use the ClientMetadata parameter, remember that Amazon Cognito
     * won't do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Store the ClientMetadata value. This data is available only to Lambda
     * triggers that are assigned to a user pool to support custom workflows. If
     * your user pool configuration doesn't include triggers, the ClientMetadata
     * parameter serves no purpose.
     * </p>
     * </li>
     * <li>
     * <p>
     * Validate the ClientMetadata value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Encrypt the ClientMetadata value. Don't use Amazon Cognito to provide
     * sensitive information.
     * </p>
     * </li>
     * </ul>
     * </note>
     *
     * @param clientMetadata <p>
     *            A map of custom key-value pairs that you can provide as input
     *            for any custom workflows that this action triggers.
     *            </p>
     *            <p>
     *            You create custom workflows by assigning Lambda functions to
     *            user pool triggers. When you use the AdminUpdateUserAttributes
     *            API action, Amazon Cognito invokes the function that is
     *            assigned to the <i>custom message</i> trigger. When Amazon
     *            Cognito invokes this function, it passes a JSON payload, which
     *            the function receives as input. This payload contains a
     *            <code>clientMetadata</code> attribute, which provides the data
     *            that you assigned to the ClientMetadata parameter in your
     *            AdminUpdateUserAttributes request. In your function code in
     *            Lambda, you can process the <code>clientMetadata</code> value
     *            to enhance your workflow for your specific needs.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html"
     *            > Customizing user pool Workflows with Lambda Triggers</a> in
     *            the <i>Amazon Cognito Developer Guide</i>.
     *            </p>
     *            <note>
     *            <p>
     *            When you use the ClientMetadata parameter, remember that
     *            Amazon Cognito won't do the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Store the ClientMetadata value. This data is available only to
     *            Lambda triggers that are assigned to a user pool to support
     *            custom workflows. If your user pool configuration doesn't
     *            include triggers, the ClientMetadata parameter serves no
     *            purpose.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Validate the ClientMetadata value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Encrypt the ClientMetadata value. Don't use Amazon Cognito to
     *            provide sensitive information.
     *            </p>
     *            </li>
     *            </ul>
     *            </note>
     */
    public void setClientMetadata(java.util.Map<String, String> clientMetadata) {
        this.clientMetadata = clientMetadata;
    }

    /**
     * <p>
     * A map of custom key-value pairs that you can provide as input for any
     * custom workflows that this action triggers.
     * </p>
     * <p>
     * You create custom workflows by assigning Lambda functions to user pool
     * triggers. When you use the AdminUpdateUserAttributes API action, Amazon
     * Cognito invokes the function that is assigned to the <i>custom
     * message</i> trigger. When Amazon Cognito invokes this function, it passes
     * a JSON payload, which the function receives as input. This payload
     * contains a <code>clientMetadata</code> attribute, which provides the data
     * that you assigned to the ClientMetadata parameter in your
     * AdminUpdateUserAttributes request. In your function code in Lambda, you
     * can process the <code>clientMetadata</code> value to enhance your
     * workflow for your specific needs.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html"
     * > Customizing user pool Workflows with Lambda Triggers</a> in the
     * <i>Amazon Cognito Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * When you use the ClientMetadata parameter, remember that Amazon Cognito
     * won't do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Store the ClientMetadata value. This data is available only to Lambda
     * triggers that are assigned to a user pool to support custom workflows. If
     * your user pool configuration doesn't include triggers, the ClientMetadata
     * parameter serves no purpose.
     * </p>
     * </li>
     * <li>
     * <p>
     * Validate the ClientMetadata value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Encrypt the ClientMetadata value. Don't use Amazon Cognito to provide
     * sensitive information.
     * </p>
     * </li>
     * </ul>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientMetadata <p>
     *            A map of custom key-value pairs that you can provide as input
     *            for any custom workflows that this action triggers.
     *            </p>
     *            <p>
     *            You create custom workflows by assigning Lambda functions to
     *            user pool triggers. When you use the AdminUpdateUserAttributes
     *            API action, Amazon Cognito invokes the function that is
     *            assigned to the <i>custom message</i> trigger. When Amazon
     *            Cognito invokes this function, it passes a JSON payload, which
     *            the function receives as input. This payload contains a
     *            <code>clientMetadata</code> attribute, which provides the data
     *            that you assigned to the ClientMetadata parameter in your
     *            AdminUpdateUserAttributes request. In your function code in
     *            Lambda, you can process the <code>clientMetadata</code> value
     *            to enhance your workflow for your specific needs.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html"
     *            > Customizing user pool Workflows with Lambda Triggers</a> in
     *            the <i>Amazon Cognito Developer Guide</i>.
     *            </p>
     *            <note>
     *            <p>
     *            When you use the ClientMetadata parameter, remember that
     *            Amazon Cognito won't do the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Store the ClientMetadata value. This data is available only to
     *            Lambda triggers that are assigned to a user pool to support
     *            custom workflows. If your user pool configuration doesn't
     *            include triggers, the ClientMetadata parameter serves no
     *            purpose.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Validate the ClientMetadata value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Encrypt the ClientMetadata value. Don't use Amazon Cognito to
     *            provide sensitive information.
     *            </p>
     *            </li>
     *            </ul>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminUpdateUserAttributesRequest withClientMetadata(
            java.util.Map<String, String> clientMetadata) {
        this.clientMetadata = clientMetadata;
        return this;
    }

    /**
     * <p>
     * A map of custom key-value pairs that you can provide as input for any
     * custom workflows that this action triggers.
     * </p>
     * <p>
     * You create custom workflows by assigning Lambda functions to user pool
     * triggers. When you use the AdminUpdateUserAttributes API action, Amazon
     * Cognito invokes the function that is assigned to the <i>custom
     * message</i> trigger. When Amazon Cognito invokes this function, it passes
     * a JSON payload, which the function receives as input. This payload
     * contains a <code>clientMetadata</code> attribute, which provides the data
     * that you assigned to the ClientMetadata parameter in your
     * AdminUpdateUserAttributes request. In your function code in Lambda, you
     * can process the <code>clientMetadata</code> value to enhance your
     * workflow for your specific needs.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html"
     * > Customizing user pool Workflows with Lambda Triggers</a> in the
     * <i>Amazon Cognito Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * When you use the ClientMetadata parameter, remember that Amazon Cognito
     * won't do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Store the ClientMetadata value. This data is available only to Lambda
     * triggers that are assigned to a user pool to support custom workflows. If
     * your user pool configuration doesn't include triggers, the ClientMetadata
     * parameter serves no purpose.
     * </p>
     * </li>
     * <li>
     * <p>
     * Validate the ClientMetadata value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Encrypt the ClientMetadata value. Don't use Amazon Cognito to provide
     * sensitive information.
     * </p>
     * </li>
     * </ul>
     * </note>
     * <p>
     * The method adds a new key-value pair into ClientMetadata parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into ClientMetadata.
     * @param value The corresponding value of the entry to be added into
     *            ClientMetadata.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminUpdateUserAttributesRequest addClientMetadataEntry(String key, String value) {
        if (null == this.clientMetadata) {
            this.clientMetadata = new java.util.HashMap<String, String>();
        }
        if (this.clientMetadata.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.clientMetadata.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ClientMetadata.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public AdminUpdateUserAttributesRequest clearClientMetadataEntries() {
        this.clientMetadata = null;
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
        if (getUserPoolId() != null)
            sb.append("UserPoolId: " + getUserPoolId() + ",");
        if (getUsername() != null)
            sb.append("Username: " + getUsername() + ",");
        if (getUserAttributes() != null)
            sb.append("UserAttributes: " + getUserAttributes() + ",");
        if (getClientMetadata() != null)
            sb.append("ClientMetadata: " + getClientMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode
                + ((getUserAttributes() == null) ? 0 : getUserAttributes().hashCode());
        hashCode = prime * hashCode
                + ((getClientMetadata() == null) ? 0 : getClientMetadata().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AdminUpdateUserAttributesRequest == false)
            return false;
        AdminUpdateUserAttributesRequest other = (AdminUpdateUserAttributesRequest) obj;

        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null
                && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        if (other.getUserAttributes() == null ^ this.getUserAttributes() == null)
            return false;
        if (other.getUserAttributes() != null
                && other.getUserAttributes().equals(this.getUserAttributes()) == false)
            return false;
        if (other.getClientMetadata() == null ^ this.getClientMetadata() == null)
            return false;
        if (other.getClientMetadata() != null
                && other.getClientMetadata().equals(this.getClientMetadata()) == false)
            return false;
        return true;
    }
}
