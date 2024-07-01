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

/**
 * <p>
 * This API is in preview release for Amazon Connect and is subject to change.
 * To request access to this API, contact Amazon Web Services Support.
 * </p>
 * <p>
 * A summary of a given authentication profile.
 * </p>
 */
public class AuthenticationProfileSummary implements Serializable {
    /**
     * <p>
     * The unique identifier of the authentication profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String id;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the authentication profile summary.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The name of the authentication profile summary.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String name;

    /**
     * <p>
     * Shows whether the authentication profile is the default authentication
     * profile for the Amazon Connect instance. The default authentication
     * profile applies to all agents in an Amazon Connect instance, unless
     * overridden by another authentication profile.
     * </p>
     */
    private Boolean isDefault;

    /**
     * <p>
     * The timestamp when the authentication profile summary was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * The Amazon Web Services Region when the authentication profile summary
     * was last modified.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z]{2}(-[a-z]+){1,2}(-[0-9])?<br/>
     */
    private String lastModifiedRegion;

    /**
     * <p>
     * The unique identifier of the authentication profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The unique identifier of the authentication profile.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The unique identifier of the authentication profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param id <p>
     *            The unique identifier of the authentication profile.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier of the authentication profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param id <p>
     *            The unique identifier of the authentication profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuthenticationProfileSummary withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the authentication profile summary.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the authentication profile
     *         summary.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the authentication profile summary.
     * </p>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the authentication profile
     *            summary.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the authentication profile summary.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the authentication profile
     *            summary.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuthenticationProfileSummary withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The name of the authentication profile summary.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>
     *         The name of the authentication profile summary.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the authentication profile summary.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param name <p>
     *            The name of the authentication profile summary.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the authentication profile summary.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param name <p>
     *            The name of the authentication profile summary.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuthenticationProfileSummary withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * Shows whether the authentication profile is the default authentication
     * profile for the Amazon Connect instance. The default authentication
     * profile applies to all agents in an Amazon Connect instance, unless
     * overridden by another authentication profile.
     * </p>
     *
     * @return <p>
     *         Shows whether the authentication profile is the default
     *         authentication profile for the Amazon Connect instance. The
     *         default authentication profile applies to all agents in an Amazon
     *         Connect instance, unless overridden by another authentication
     *         profile.
     *         </p>
     */
    public Boolean isIsDefault() {
        return isDefault;
    }

    /**
     * <p>
     * Shows whether the authentication profile is the default authentication
     * profile for the Amazon Connect instance. The default authentication
     * profile applies to all agents in an Amazon Connect instance, unless
     * overridden by another authentication profile.
     * </p>
     *
     * @return <p>
     *         Shows whether the authentication profile is the default
     *         authentication profile for the Amazon Connect instance. The
     *         default authentication profile applies to all agents in an Amazon
     *         Connect instance, unless overridden by another authentication
     *         profile.
     *         </p>
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    /**
     * <p>
     * Shows whether the authentication profile is the default authentication
     * profile for the Amazon Connect instance. The default authentication
     * profile applies to all agents in an Amazon Connect instance, unless
     * overridden by another authentication profile.
     * </p>
     *
     * @param isDefault <p>
     *            Shows whether the authentication profile is the default
     *            authentication profile for the Amazon Connect instance. The
     *            default authentication profile applies to all agents in an
     *            Amazon Connect instance, unless overridden by another
     *            authentication profile.
     *            </p>
     */
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * <p>
     * Shows whether the authentication profile is the default authentication
     * profile for the Amazon Connect instance. The default authentication
     * profile applies to all agents in an Amazon Connect instance, unless
     * overridden by another authentication profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isDefault <p>
     *            Shows whether the authentication profile is the default
     *            authentication profile for the Amazon Connect instance. The
     *            default authentication profile applies to all agents in an
     *            Amazon Connect instance, unless overridden by another
     *            authentication profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuthenticationProfileSummary withIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    /**
     * <p>
     * The timestamp when the authentication profile summary was last modified.
     * </p>
     *
     * @return <p>
     *         The timestamp when the authentication profile summary was last
     *         modified.
     *         </p>
     */
    public java.util.Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * <p>
     * The timestamp when the authentication profile summary was last modified.
     * </p>
     *
     * @param lastModifiedTime <p>
     *            The timestamp when the authentication profile summary was last
     *            modified.
     *            </p>
     */
    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The timestamp when the authentication profile summary was last modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedTime <p>
     *            The timestamp when the authentication profile summary was last
     *            modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuthenticationProfileSummary withLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Region when the authentication profile summary
     * was last modified.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z]{2}(-[a-z]+){1,2}(-[0-9])?<br/>
     *
     * @return <p>
     *         The Amazon Web Services Region when the authentication profile
     *         summary was last modified.
     *         </p>
     */
    public String getLastModifiedRegion() {
        return lastModifiedRegion;
    }

    /**
     * <p>
     * The Amazon Web Services Region when the authentication profile summary
     * was last modified.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z]{2}(-[a-z]+){1,2}(-[0-9])?<br/>
     *
     * @param lastModifiedRegion <p>
     *            The Amazon Web Services Region when the authentication profile
     *            summary was last modified.
     *            </p>
     */
    public void setLastModifiedRegion(String lastModifiedRegion) {
        this.lastModifiedRegion = lastModifiedRegion;
    }

    /**
     * <p>
     * The Amazon Web Services Region when the authentication profile summary
     * was last modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z]{2}(-[a-z]+){1,2}(-[0-9])?<br/>
     *
     * @param lastModifiedRegion <p>
     *            The Amazon Web Services Region when the authentication profile
     *            summary was last modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuthenticationProfileSummary withLastModifiedRegion(String lastModifiedRegion) {
        this.lastModifiedRegion = lastModifiedRegion;
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getIsDefault() != null)
            sb.append("IsDefault: " + getIsDefault() + ",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: " + getLastModifiedTime() + ",");
        if (getLastModifiedRegion() != null)
            sb.append("LastModifiedRegion: " + getLastModifiedRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getIsDefault() == null) ? 0 : getIsDefault().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedRegion() == null) ? 0 : getLastModifiedRegion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AuthenticationProfileSummary == false)
            return false;
        AuthenticationProfileSummary other = (AuthenticationProfileSummary) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getIsDefault() == null ^ this.getIsDefault() == null)
            return false;
        if (other.getIsDefault() != null
                && other.getIsDefault().equals(this.getIsDefault()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null
                && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getLastModifiedRegion() == null ^ this.getLastModifiedRegion() == null)
            return false;
        if (other.getLastModifiedRegion() != null
                && other.getLastModifiedRegion().equals(this.getLastModifiedRegion()) == false)
            return false;
        return true;
    }
}
