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
 * Provides information about the content and settings for a message template
 * that can be used in text messages that are sent through the SMS channel.
 * </p>
 */
public class SMSTemplateResponse implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the message template.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The message body that's used in text messages that are based on the
     * message template.
     * </p>
     */
    private String body;

    /**
     * <p>
     * The date, in ISO 8601 format, when the message template was created.
     * </p>
     */
    private String creationDate;

    /**
     * <p>
     * The JSON object that specifies the default values that are used for
     * message variables in the message template. This object is a set of
     * key-value pairs. Each key defines a message variable in the template. The
     * corresponding value defines the default value for that variable.
     * </p>
     */
    private String defaultSubstitutions;

    /**
     * <p>
     * The date, in ISO 8601 format, when the message template was last
     * modified.
     * </p>
     */
    private String lastModifiedDate;

    /**
     * <p>
     * The unique identifier for the recommender model that's used by the
     * message template.
     * </p>
     */
    private String recommenderId;

    /**
     * <p>
     * A string-to-string map of key-value pairs that identifies the tags that
     * are associated with the message template. Each tag consists of a required
     * tag key and an associated tag value.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The custom description of the message template.
     * </p>
     */
    private String templateDescription;

    /**
     * <p>
     * The name of the message template.
     * </p>
     */
    private String templateName;

    /**
     * <p>
     * The type of channel that the message template is designed for. For an SMS
     * template, this value is SMS.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EMAIL, SMS, VOICE, PUSH
     */
    private String templateType;

    /**
     * <p>
     * The unique identifier, as an integer, for the active version of the
     * message template, or the version of the template that you specified by
     * using the version parameter in your request.
     * </p>
     */
    private String version;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the message template.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the message template.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the message template.
     * </p>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the message template.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the message template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the message template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SMSTemplateResponse withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The message body that's used in text messages that are based on the
     * message template.
     * </p>
     *
     * @return <p>
     *         The message body that's used in text messages that are based on
     *         the message template.
     *         </p>
     */
    public String getBody() {
        return body;
    }

    /**
     * <p>
     * The message body that's used in text messages that are based on the
     * message template.
     * </p>
     *
     * @param body <p>
     *            The message body that's used in text messages that are based
     *            on the message template.
     *            </p>
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * <p>
     * The message body that's used in text messages that are based on the
     * message template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param body <p>
     *            The message body that's used in text messages that are based
     *            on the message template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SMSTemplateResponse withBody(String body) {
        this.body = body;
        return this;
    }

    /**
     * <p>
     * The date, in ISO 8601 format, when the message template was created.
     * </p>
     *
     * @return <p>
     *         The date, in ISO 8601 format, when the message template was
     *         created.
     *         </p>
     */
    public String getCreationDate() {
        return creationDate;
    }

    /**
     * <p>
     * The date, in ISO 8601 format, when the message template was created.
     * </p>
     *
     * @param creationDate <p>
     *            The date, in ISO 8601 format, when the message template was
     *            created.
     *            </p>
     */
    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date, in ISO 8601 format, when the message template was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDate <p>
     *            The date, in ISO 8601 format, when the message template was
     *            created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SMSTemplateResponse withCreationDate(String creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * <p>
     * The JSON object that specifies the default values that are used for
     * message variables in the message template. This object is a set of
     * key-value pairs. Each key defines a message variable in the template. The
     * corresponding value defines the default value for that variable.
     * </p>
     *
     * @return <p>
     *         The JSON object that specifies the default values that are used
     *         for message variables in the message template. This object is a
     *         set of key-value pairs. Each key defines a message variable in
     *         the template. The corresponding value defines the default value
     *         for that variable.
     *         </p>
     */
    public String getDefaultSubstitutions() {
        return defaultSubstitutions;
    }

    /**
     * <p>
     * The JSON object that specifies the default values that are used for
     * message variables in the message template. This object is a set of
     * key-value pairs. Each key defines a message variable in the template. The
     * corresponding value defines the default value for that variable.
     * </p>
     *
     * @param defaultSubstitutions <p>
     *            The JSON object that specifies the default values that are
     *            used for message variables in the message template. This
     *            object is a set of key-value pairs. Each key defines a message
     *            variable in the template. The corresponding value defines the
     *            default value for that variable.
     *            </p>
     */
    public void setDefaultSubstitutions(String defaultSubstitutions) {
        this.defaultSubstitutions = defaultSubstitutions;
    }

    /**
     * <p>
     * The JSON object that specifies the default values that are used for
     * message variables in the message template. This object is a set of
     * key-value pairs. Each key defines a message variable in the template. The
     * corresponding value defines the default value for that variable.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultSubstitutions <p>
     *            The JSON object that specifies the default values that are
     *            used for message variables in the message template. This
     *            object is a set of key-value pairs. Each key defines a message
     *            variable in the template. The corresponding value defines the
     *            default value for that variable.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SMSTemplateResponse withDefaultSubstitutions(String defaultSubstitutions) {
        this.defaultSubstitutions = defaultSubstitutions;
        return this;
    }

    /**
     * <p>
     * The date, in ISO 8601 format, when the message template was last
     * modified.
     * </p>
     *
     * @return <p>
     *         The date, in ISO 8601 format, when the message template was last
     *         modified.
     *         </p>
     */
    public String getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * <p>
     * The date, in ISO 8601 format, when the message template was last
     * modified.
     * </p>
     *
     * @param lastModifiedDate <p>
     *            The date, in ISO 8601 format, when the message template was
     *            last modified.
     *            </p>
     */
    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The date, in ISO 8601 format, when the message template was last
     * modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedDate <p>
     *            The date, in ISO 8601 format, when the message template was
     *            last modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SMSTemplateResponse withLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }

    /**
     * <p>
     * The unique identifier for the recommender model that's used by the
     * message template.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the recommender model that's used by
     *         the message template.
     *         </p>
     */
    public String getRecommenderId() {
        return recommenderId;
    }

    /**
     * <p>
     * The unique identifier for the recommender model that's used by the
     * message template.
     * </p>
     *
     * @param recommenderId <p>
     *            The unique identifier for the recommender model that's used by
     *            the message template.
     *            </p>
     */
    public void setRecommenderId(String recommenderId) {
        this.recommenderId = recommenderId;
    }

    /**
     * <p>
     * The unique identifier for the recommender model that's used by the
     * message template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recommenderId <p>
     *            The unique identifier for the recommender model that's used by
     *            the message template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SMSTemplateResponse withRecommenderId(String recommenderId) {
        this.recommenderId = recommenderId;
        return this;
    }

    /**
     * <p>
     * A string-to-string map of key-value pairs that identifies the tags that
     * are associated with the message template. Each tag consists of a required
     * tag key and an associated tag value.
     * </p>
     *
     * @return <p>
     *         A string-to-string map of key-value pairs that identifies the
     *         tags that are associated with the message template. Each tag
     *         consists of a required tag key and an associated tag value.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A string-to-string map of key-value pairs that identifies the tags that
     * are associated with the message template. Each tag consists of a required
     * tag key and an associated tag value.
     * </p>
     *
     * @param tags <p>
     *            A string-to-string map of key-value pairs that identifies the
     *            tags that are associated with the message template. Each tag
     *            consists of a required tag key and an associated tag value.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A string-to-string map of key-value pairs that identifies the tags that
     * are associated with the message template. Each tag consists of a required
     * tag key and an associated tag value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A string-to-string map of key-value pairs that identifies the
     *            tags that are associated with the message template. Each tag
     *            consists of a required tag key and an associated tag value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SMSTemplateResponse withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * A string-to-string map of key-value pairs that identifies the tags that
     * are associated with the message template. Each tag consists of a required
     * tag key and an associated tag value.
     * </p>
     * <p>
     * The method adds a new key-value pair into tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into tags.
     * @param value The corresponding value of the entry to be added into tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SMSTemplateResponse addtagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public SMSTemplateResponse cleartagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The custom description of the message template.
     * </p>
     *
     * @return <p>
     *         The custom description of the message template.
     *         </p>
     */
    public String getTemplateDescription() {
        return templateDescription;
    }

    /**
     * <p>
     * The custom description of the message template.
     * </p>
     *
     * @param templateDescription <p>
     *            The custom description of the message template.
     *            </p>
     */
    public void setTemplateDescription(String templateDescription) {
        this.templateDescription = templateDescription;
    }

    /**
     * <p>
     * The custom description of the message template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param templateDescription <p>
     *            The custom description of the message template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SMSTemplateResponse withTemplateDescription(String templateDescription) {
        this.templateDescription = templateDescription;
        return this;
    }

    /**
     * <p>
     * The name of the message template.
     * </p>
     *
     * @return <p>
     *         The name of the message template.
     *         </p>
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * <p>
     * The name of the message template.
     * </p>
     *
     * @param templateName <p>
     *            The name of the message template.
     *            </p>
     */
    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The name of the message template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param templateName <p>
     *            The name of the message template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SMSTemplateResponse withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * <p>
     * The type of channel that the message template is designed for. For an SMS
     * template, this value is SMS.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EMAIL, SMS, VOICE, PUSH
     *
     * @return <p>
     *         The type of channel that the message template is designed for.
     *         For an SMS template, this value is SMS.
     *         </p>
     * @see TemplateType
     */
    public String getTemplateType() {
        return templateType;
    }

    /**
     * <p>
     * The type of channel that the message template is designed for. For an SMS
     * template, this value is SMS.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EMAIL, SMS, VOICE, PUSH
     *
     * @param templateType <p>
     *            The type of channel that the message template is designed for.
     *            For an SMS template, this value is SMS.
     *            </p>
     * @see TemplateType
     */
    public void setTemplateType(String templateType) {
        this.templateType = templateType;
    }

    /**
     * <p>
     * The type of channel that the message template is designed for. For an SMS
     * template, this value is SMS.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EMAIL, SMS, VOICE, PUSH
     *
     * @param templateType <p>
     *            The type of channel that the message template is designed for.
     *            For an SMS template, this value is SMS.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TemplateType
     */
    public SMSTemplateResponse withTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }

    /**
     * <p>
     * The type of channel that the message template is designed for. For an SMS
     * template, this value is SMS.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EMAIL, SMS, VOICE, PUSH
     *
     * @param templateType <p>
     *            The type of channel that the message template is designed for.
     *            For an SMS template, this value is SMS.
     *            </p>
     * @see TemplateType
     */
    public void setTemplateType(TemplateType templateType) {
        this.templateType = templateType.toString();
    }

    /**
     * <p>
     * The type of channel that the message template is designed for. For an SMS
     * template, this value is SMS.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EMAIL, SMS, VOICE, PUSH
     *
     * @param templateType <p>
     *            The type of channel that the message template is designed for.
     *            For an SMS template, this value is SMS.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TemplateType
     */
    public SMSTemplateResponse withTemplateType(TemplateType templateType) {
        this.templateType = templateType.toString();
        return this;
    }

    /**
     * <p>
     * The unique identifier, as an integer, for the active version of the
     * message template, or the version of the template that you specified by
     * using the version parameter in your request.
     * </p>
     *
     * @return <p>
     *         The unique identifier, as an integer, for the active version of
     *         the message template, or the version of the template that you
     *         specified by using the version parameter in your request.
     *         </p>
     */
    public String getVersion() {
        return version;
    }

    /**
     * <p>
     * The unique identifier, as an integer, for the active version of the
     * message template, or the version of the template that you specified by
     * using the version parameter in your request.
     * </p>
     *
     * @param version <p>
     *            The unique identifier, as an integer, for the active version
     *            of the message template, or the version of the template that
     *            you specified by using the version parameter in your request.
     *            </p>
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The unique identifier, as an integer, for the active version of the
     * message template, or the version of the template that you specified by
     * using the version parameter in your request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param version <p>
     *            The unique identifier, as an integer, for the active version
     *            of the message template, or the version of the template that
     *            you specified by using the version parameter in your request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SMSTemplateResponse withVersion(String version) {
        this.version = version;
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
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getBody() != null)
            sb.append("Body: " + getBody() + ",");
        if (getCreationDate() != null)
            sb.append("CreationDate: " + getCreationDate() + ",");
        if (getDefaultSubstitutions() != null)
            sb.append("DefaultSubstitutions: " + getDefaultSubstitutions() + ",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: " + getLastModifiedDate() + ",");
        if (getRecommenderId() != null)
            sb.append("RecommenderId: " + getRecommenderId() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags() + ",");
        if (getTemplateDescription() != null)
            sb.append("TemplateDescription: " + getTemplateDescription() + ",");
        if (getTemplateName() != null)
            sb.append("TemplateName: " + getTemplateName() + ",");
        if (getTemplateType() != null)
            sb.append("TemplateType: " + getTemplateType() + ",");
        if (getVersion() != null)
            sb.append("Version: " + getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode());
        hashCode = prime * hashCode
                + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode
                + ((getDefaultSubstitutions() == null) ? 0 : getDefaultSubstitutions().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode
                + ((getRecommenderId() == null) ? 0 : getRecommenderId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getTemplateDescription() == null) ? 0 : getTemplateDescription().hashCode());
        hashCode = prime * hashCode
                + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        hashCode = prime * hashCode
                + ((getTemplateType() == null) ? 0 : getTemplateType().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SMSTemplateResponse == false)
            return false;
        SMSTemplateResponse other = (SMSTemplateResponse) obj;

        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null
                && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getDefaultSubstitutions() == null ^ this.getDefaultSubstitutions() == null)
            return false;
        if (other.getDefaultSubstitutions() != null
                && other.getDefaultSubstitutions().equals(this.getDefaultSubstitutions()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null
                && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        if (other.getRecommenderId() == null ^ this.getRecommenderId() == null)
            return false;
        if (other.getRecommenderId() != null
                && other.getRecommenderId().equals(this.getRecommenderId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getTemplateDescription() == null ^ this.getTemplateDescription() == null)
            return false;
        if (other.getTemplateDescription() != null
                && other.getTemplateDescription().equals(this.getTemplateDescription()) == false)
            return false;
        if (other.getTemplateName() == null ^ this.getTemplateName() == null)
            return false;
        if (other.getTemplateName() != null
                && other.getTemplateName().equals(this.getTemplateName()) == false)
            return false;
        if (other.getTemplateType() == null ^ this.getTemplateType() == null)
            return false;
        if (other.getTemplateType() != null
                && other.getTemplateType().equals(this.getTemplateType()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }
}