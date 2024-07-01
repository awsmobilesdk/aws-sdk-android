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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * This API is in preview release for Amazon Connect and is subject to change.
 * To request access to this API, contact Amazon Web Services Support.
 * </p>
 * <p>
 * Updates the selected authentication profile.
 * </p>
 */
public class UpdateAuthenticationProfileRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * A unique identifier for the authentication profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String authenticationProfileId;

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     * >find the instance ID</a> in the Amazon Resource Name (ARN) of the
     * instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String instanceId;

    /**
     * <p>
     * The name for the authentication profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String name;

    /**
     * <p>
     * The description for the authentication profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 250<br/>
     */
    private String description;

    /**
     * <p>
     * A list of IP address range strings that are allowed to access the
     * instance. For more information on how to configure IP addresses, see<a
     * href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-session-timeouts"
     * >Configure session timeouts</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
     * </p>
     */
    private java.util.List<String> allowedIps;

    /**
     * <p>
     * A list of IP address range strings that are blocked from accessing the
     * instance. For more information on how to configure IP addresses, For more
     * information on how to configure IP addresses, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-ip-based-ac"
     * >Configure IP-based access control</a> in the <i>Amazon Connect
     * Administrator Guide</i>.
     * </p>
     */
    private java.util.List<String> blockedIps;

    /**
     * <p>
     * The short lived session duration configuration for users logged in to
     * Amazon Connect, in minutes. This value determines the maximum possible
     * time before an agent is authenticated. For more information, For more
     * information on how to configure IP addresses, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-session-timeouts"
     * >Configure session timeouts</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>10 - 60<br/>
     */
    private Integer periodicSessionDuration;

    /**
     * <p>
     * A unique identifier for the authentication profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         A unique identifier for the authentication profile.
     *         </p>
     */
    public String getAuthenticationProfileId() {
        return authenticationProfileId;
    }

    /**
     * <p>
     * A unique identifier for the authentication profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param authenticationProfileId <p>
     *            A unique identifier for the authentication profile.
     *            </p>
     */
    public void setAuthenticationProfileId(String authenticationProfileId) {
        this.authenticationProfileId = authenticationProfileId;
    }

    /**
     * <p>
     * A unique identifier for the authentication profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param authenticationProfileId <p>
     *            A unique identifier for the authentication profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAuthenticationProfileRequest withAuthenticationProfileId(
            String authenticationProfileId) {
        this.authenticationProfileId = authenticationProfileId;
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     * >find the instance ID</a> in the Amazon Resource Name (ARN) of the
     * instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The identifier of the Amazon Connect instance. You can <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     *         >find the instance ID</a> in the Amazon Resource Name (ARN) of
     *         the instance.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     * >find the instance ID</a> in the Amazon Resource Name (ARN) of the
     * instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance. You can <a
     *            href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     *            >find the instance ID</a> in the Amazon Resource Name (ARN) of
     *            the instance.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     * >find the instance ID</a> in the Amazon Resource Name (ARN) of the
     * instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance. You can <a
     *            href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     *            >find the instance ID</a> in the Amazon Resource Name (ARN) of
     *            the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAuthenticationProfileRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * The name for the authentication profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>
     *         The name for the authentication profile.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name for the authentication profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param name <p>
     *            The name for the authentication profile.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name for the authentication profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param name <p>
     *            The name for the authentication profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAuthenticationProfileRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The description for the authentication profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 250<br/>
     *
     * @return <p>
     *         The description for the authentication profile.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description for the authentication profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 250<br/>
     *
     * @param description <p>
     *            The description for the authentication profile.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for the authentication profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 250<br/>
     *
     * @param description <p>
     *            The description for the authentication profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAuthenticationProfileRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * A list of IP address range strings that are allowed to access the
     * instance. For more information on how to configure IP addresses, see<a
     * href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-session-timeouts"
     * >Configure session timeouts</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         A list of IP address range strings that are allowed to access the
     *         instance. For more information on how to configure IP addresses,
     *         see<a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-session-timeouts"
     *         >Configure session timeouts</a> in the <i>Amazon Connect
     *         Administrator Guide</i>.
     *         </p>
     */
    public java.util.List<String> getAllowedIps() {
        return allowedIps;
    }

    /**
     * <p>
     * A list of IP address range strings that are allowed to access the
     * instance. For more information on how to configure IP addresses, see<a
     * href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-session-timeouts"
     * >Configure session timeouts</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
     * </p>
     *
     * @param allowedIps <p>
     *            A list of IP address range strings that are allowed to access
     *            the instance. For more information on how to configure IP
     *            addresses, see<a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-session-timeouts"
     *            >Configure session timeouts</a> in the <i>Amazon Connect
     *            Administrator Guide</i>.
     *            </p>
     */
    public void setAllowedIps(java.util.Collection<String> allowedIps) {
        if (allowedIps == null) {
            this.allowedIps = null;
            return;
        }

        this.allowedIps = new java.util.ArrayList<String>(allowedIps);
    }

    /**
     * <p>
     * A list of IP address range strings that are allowed to access the
     * instance. For more information on how to configure IP addresses, see<a
     * href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-session-timeouts"
     * >Configure session timeouts</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowedIps <p>
     *            A list of IP address range strings that are allowed to access
     *            the instance. For more information on how to configure IP
     *            addresses, see<a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-session-timeouts"
     *            >Configure session timeouts</a> in the <i>Amazon Connect
     *            Administrator Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAuthenticationProfileRequest withAllowedIps(String... allowedIps) {
        if (getAllowedIps() == null) {
            this.allowedIps = new java.util.ArrayList<String>(allowedIps.length);
        }
        for (String value : allowedIps) {
            this.allowedIps.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of IP address range strings that are allowed to access the
     * instance. For more information on how to configure IP addresses, see<a
     * href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-session-timeouts"
     * >Configure session timeouts</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowedIps <p>
     *            A list of IP address range strings that are allowed to access
     *            the instance. For more information on how to configure IP
     *            addresses, see<a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-session-timeouts"
     *            >Configure session timeouts</a> in the <i>Amazon Connect
     *            Administrator Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAuthenticationProfileRequest withAllowedIps(java.util.Collection<String> allowedIps) {
        setAllowedIps(allowedIps);
        return this;
    }

    /**
     * <p>
     * A list of IP address range strings that are blocked from accessing the
     * instance. For more information on how to configure IP addresses, For more
     * information on how to configure IP addresses, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-ip-based-ac"
     * >Configure IP-based access control</a> in the <i>Amazon Connect
     * Administrator Guide</i>.
     * </p>
     *
     * @return <p>
     *         A list of IP address range strings that are blocked from
     *         accessing the instance. For more information on how to configure
     *         IP addresses, For more information on how to configure IP
     *         addresses, see <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-ip-based-ac"
     *         >Configure IP-based access control</a> in the <i>Amazon Connect
     *         Administrator Guide</i>.
     *         </p>
     */
    public java.util.List<String> getBlockedIps() {
        return blockedIps;
    }

    /**
     * <p>
     * A list of IP address range strings that are blocked from accessing the
     * instance. For more information on how to configure IP addresses, For more
     * information on how to configure IP addresses, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-ip-based-ac"
     * >Configure IP-based access control</a> in the <i>Amazon Connect
     * Administrator Guide</i>.
     * </p>
     *
     * @param blockedIps <p>
     *            A list of IP address range strings that are blocked from
     *            accessing the instance. For more information on how to
     *            configure IP addresses, For more information on how to
     *            configure IP addresses, see <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-ip-based-ac"
     *            >Configure IP-based access control</a> in the <i>Amazon
     *            Connect Administrator Guide</i>.
     *            </p>
     */
    public void setBlockedIps(java.util.Collection<String> blockedIps) {
        if (blockedIps == null) {
            this.blockedIps = null;
            return;
        }

        this.blockedIps = new java.util.ArrayList<String>(blockedIps);
    }

    /**
     * <p>
     * A list of IP address range strings that are blocked from accessing the
     * instance. For more information on how to configure IP addresses, For more
     * information on how to configure IP addresses, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-ip-based-ac"
     * >Configure IP-based access control</a> in the <i>Amazon Connect
     * Administrator Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param blockedIps <p>
     *            A list of IP address range strings that are blocked from
     *            accessing the instance. For more information on how to
     *            configure IP addresses, For more information on how to
     *            configure IP addresses, see <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-ip-based-ac"
     *            >Configure IP-based access control</a> in the <i>Amazon
     *            Connect Administrator Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAuthenticationProfileRequest withBlockedIps(String... blockedIps) {
        if (getBlockedIps() == null) {
            this.blockedIps = new java.util.ArrayList<String>(blockedIps.length);
        }
        for (String value : blockedIps) {
            this.blockedIps.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of IP address range strings that are blocked from accessing the
     * instance. For more information on how to configure IP addresses, For more
     * information on how to configure IP addresses, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-ip-based-ac"
     * >Configure IP-based access control</a> in the <i>Amazon Connect
     * Administrator Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param blockedIps <p>
     *            A list of IP address range strings that are blocked from
     *            accessing the instance. For more information on how to
     *            configure IP addresses, For more information on how to
     *            configure IP addresses, see <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-ip-based-ac"
     *            >Configure IP-based access control</a> in the <i>Amazon
     *            Connect Administrator Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAuthenticationProfileRequest withBlockedIps(java.util.Collection<String> blockedIps) {
        setBlockedIps(blockedIps);
        return this;
    }

    /**
     * <p>
     * The short lived session duration configuration for users logged in to
     * Amazon Connect, in minutes. This value determines the maximum possible
     * time before an agent is authenticated. For more information, For more
     * information on how to configure IP addresses, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-session-timeouts"
     * >Configure session timeouts</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>10 - 60<br/>
     *
     * @return <p>
     *         The short lived session duration configuration for users logged
     *         in to Amazon Connect, in minutes. This value determines the
     *         maximum possible time before an agent is authenticated. For more
     *         information, For more information on how to configure IP
     *         addresses, see <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-session-timeouts"
     *         >Configure session timeouts</a> in the <i>Amazon Connect
     *         Administrator Guide</i>.
     *         </p>
     */
    public Integer getPeriodicSessionDuration() {
        return periodicSessionDuration;
    }

    /**
     * <p>
     * The short lived session duration configuration for users logged in to
     * Amazon Connect, in minutes. This value determines the maximum possible
     * time before an agent is authenticated. For more information, For more
     * information on how to configure IP addresses, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-session-timeouts"
     * >Configure session timeouts</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>10 - 60<br/>
     *
     * @param periodicSessionDuration <p>
     *            The short lived session duration configuration for users
     *            logged in to Amazon Connect, in minutes. This value determines
     *            the maximum possible time before an agent is authenticated.
     *            For more information, For more information on how to configure
     *            IP addresses, see <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-session-timeouts"
     *            >Configure session timeouts</a> in the <i>Amazon Connect
     *            Administrator Guide</i>.
     *            </p>
     */
    public void setPeriodicSessionDuration(Integer periodicSessionDuration) {
        this.periodicSessionDuration = periodicSessionDuration;
    }

    /**
     * <p>
     * The short lived session duration configuration for users logged in to
     * Amazon Connect, in minutes. This value determines the maximum possible
     * time before an agent is authenticated. For more information, For more
     * information on how to configure IP addresses, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-session-timeouts"
     * >Configure session timeouts</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>10 - 60<br/>
     *
     * @param periodicSessionDuration <p>
     *            The short lived session duration configuration for users
     *            logged in to Amazon Connect, in minutes. This value determines
     *            the maximum possible time before an agent is authenticated.
     *            For more information, For more information on how to configure
     *            IP addresses, see <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/authentication-profiles.html#configure-session-timeouts"
     *            >Configure session timeouts</a> in the <i>Amazon Connect
     *            Administrator Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAuthenticationProfileRequest withPeriodicSessionDuration(
            Integer periodicSessionDuration) {
        this.periodicSessionDuration = periodicSessionDuration;
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
        if (getAuthenticationProfileId() != null)
            sb.append("AuthenticationProfileId: " + getAuthenticationProfileId() + ",");
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getAllowedIps() != null)
            sb.append("AllowedIps: " + getAllowedIps() + ",");
        if (getBlockedIps() != null)
            sb.append("BlockedIps: " + getBlockedIps() + ",");
        if (getPeriodicSessionDuration() != null)
            sb.append("PeriodicSessionDuration: " + getPeriodicSessionDuration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAuthenticationProfileId() == null) ? 0 : getAuthenticationProfileId()
                        .hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getAllowedIps() == null) ? 0 : getAllowedIps().hashCode());
        hashCode = prime * hashCode + ((getBlockedIps() == null) ? 0 : getBlockedIps().hashCode());
        hashCode = prime
                * hashCode
                + ((getPeriodicSessionDuration() == null) ? 0 : getPeriodicSessionDuration()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAuthenticationProfileRequest == false)
            return false;
        UpdateAuthenticationProfileRequest other = (UpdateAuthenticationProfileRequest) obj;

        if (other.getAuthenticationProfileId() == null ^ this.getAuthenticationProfileId() == null)
            return false;
        if (other.getAuthenticationProfileId() != null
                && other.getAuthenticationProfileId().equals(this.getAuthenticationProfileId()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getAllowedIps() == null ^ this.getAllowedIps() == null)
            return false;
        if (other.getAllowedIps() != null
                && other.getAllowedIps().equals(this.getAllowedIps()) == false)
            return false;
        if (other.getBlockedIps() == null ^ this.getBlockedIps() == null)
            return false;
        if (other.getBlockedIps() != null
                && other.getBlockedIps().equals(this.getBlockedIps()) == false)
            return false;
        if (other.getPeriodicSessionDuration() == null ^ this.getPeriodicSessionDuration() == null)
            return false;
        if (other.getPeriodicSessionDuration() != null
                && other.getPeriodicSessionDuration().equals(this.getPeriodicSessionDuration()) == false)
            return false;
        return true;
    }
}
