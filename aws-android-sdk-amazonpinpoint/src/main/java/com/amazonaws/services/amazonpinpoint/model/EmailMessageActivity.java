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
 * Specifies the settings for an email activity in a journey. This type of
 * activity sends an email message to participants.
 * </p>
 */
public class EmailMessageActivity implements Serializable {
    /**
     * <p>
     * The "From" address to use for the message.
     * </p>
     */
    private JourneyEmailMessage messageConfig;

    /**
     * <p>
     * The unique identifier for the next activity to perform, after the message
     * is sent.
     * </p>
     */
    private String nextActivity;

    /**
     * <p>
     * The name of the email template to use for the message.
     * </p>
     */
    private String templateName;

    /**
     * <p>
     * The unique identifier for the version of the email template to use for
     * the message. If specified, this value must match the identifier for an
     * existing template version. To retrieve a list of versions and version
     * identifiers for a template, use the <link
     * linkend="templates-template-name-template-type-versions">Template
     * Versions</link> resource.
     * </p>
     * <p>
     * If you don't specify a value for this property, Amazon Pinpoint uses the
     * <i>active version</i> of the template. The <i>active version</i> is
     * typically the version of a template that's been most recently reviewed
     * and approved for use, depending on your workflow. It isn't necessarily
     * the latest version of a template.
     * </p>
     */
    private String templateVersion;

    /**
     * <p>
     * The "From" address to use for the message.
     * </p>
     *
     * @return <p>
     *         The "From" address to use for the message.
     *         </p>
     */
    public JourneyEmailMessage getMessageConfig() {
        return messageConfig;
    }

    /**
     * <p>
     * The "From" address to use for the message.
     * </p>
     *
     * @param messageConfig <p>
     *            The "From" address to use for the message.
     *            </p>
     */
    public void setMessageConfig(JourneyEmailMessage messageConfig) {
        this.messageConfig = messageConfig;
    }

    /**
     * <p>
     * The "From" address to use for the message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param messageConfig <p>
     *            The "From" address to use for the message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EmailMessageActivity withMessageConfig(JourneyEmailMessage messageConfig) {
        this.messageConfig = messageConfig;
        return this;
    }

    /**
     * <p>
     * The unique identifier for the next activity to perform, after the message
     * is sent.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the next activity to perform, after the
     *         message is sent.
     *         </p>
     */
    public String getNextActivity() {
        return nextActivity;
    }

    /**
     * <p>
     * The unique identifier for the next activity to perform, after the message
     * is sent.
     * </p>
     *
     * @param nextActivity <p>
     *            The unique identifier for the next activity to perform, after
     *            the message is sent.
     *            </p>
     */
    public void setNextActivity(String nextActivity) {
        this.nextActivity = nextActivity;
    }

    /**
     * <p>
     * The unique identifier for the next activity to perform, after the message
     * is sent.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextActivity <p>
     *            The unique identifier for the next activity to perform, after
     *            the message is sent.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EmailMessageActivity withNextActivity(String nextActivity) {
        this.nextActivity = nextActivity;
        return this;
    }

    /**
     * <p>
     * The name of the email template to use for the message.
     * </p>
     *
     * @return <p>
     *         The name of the email template to use for the message.
     *         </p>
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * <p>
     * The name of the email template to use for the message.
     * </p>
     *
     * @param templateName <p>
     *            The name of the email template to use for the message.
     *            </p>
     */
    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The name of the email template to use for the message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param templateName <p>
     *            The name of the email template to use for the message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EmailMessageActivity withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * <p>
     * The unique identifier for the version of the email template to use for
     * the message. If specified, this value must match the identifier for an
     * existing template version. To retrieve a list of versions and version
     * identifiers for a template, use the <link
     * linkend="templates-template-name-template-type-versions">Template
     * Versions</link> resource.
     * </p>
     * <p>
     * If you don't specify a value for this property, Amazon Pinpoint uses the
     * <i>active version</i> of the template. The <i>active version</i> is
     * typically the version of a template that's been most recently reviewed
     * and approved for use, depending on your workflow. It isn't necessarily
     * the latest version of a template.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the version of the email template to
     *         use for the message. If specified, this value must match the
     *         identifier for an existing template version. To retrieve a list
     *         of versions and version identifiers for a template, use the <link
     *         linkend="templates-template-name-template-type-versions">Template
     *         Versions</link> resource.
     *         </p>
     *         <p>
     *         If you don't specify a value for this property, Amazon Pinpoint
     *         uses the <i>active version</i> of the template. The <i>active
     *         version</i> is typically the version of a template that's been
     *         most recently reviewed and approved for use, depending on your
     *         workflow. It isn't necessarily the latest version of a template.
     *         </p>
     */
    public String getTemplateVersion() {
        return templateVersion;
    }

    /**
     * <p>
     * The unique identifier for the version of the email template to use for
     * the message. If specified, this value must match the identifier for an
     * existing template version. To retrieve a list of versions and version
     * identifiers for a template, use the <link
     * linkend="templates-template-name-template-type-versions">Template
     * Versions</link> resource.
     * </p>
     * <p>
     * If you don't specify a value for this property, Amazon Pinpoint uses the
     * <i>active version</i> of the template. The <i>active version</i> is
     * typically the version of a template that's been most recently reviewed
     * and approved for use, depending on your workflow. It isn't necessarily
     * the latest version of a template.
     * </p>
     *
     * @param templateVersion <p>
     *            The unique identifier for the version of the email template to
     *            use for the message. If specified, this value must match the
     *            identifier for an existing template version. To retrieve a
     *            list of versions and version identifiers for a template, use
     *            the <link
     *            linkend="templates-template-name-template-type-versions"
     *            >Template Versions</link> resource.
     *            </p>
     *            <p>
     *            If you don't specify a value for this property, Amazon
     *            Pinpoint uses the <i>active version</i> of the template. The
     *            <i>active version</i> is typically the version of a template
     *            that's been most recently reviewed and approved for use,
     *            depending on your workflow. It isn't necessarily the latest
     *            version of a template.
     *            </p>
     */
    public void setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
    }

    /**
     * <p>
     * The unique identifier for the version of the email template to use for
     * the message. If specified, this value must match the identifier for an
     * existing template version. To retrieve a list of versions and version
     * identifiers for a template, use the <link
     * linkend="templates-template-name-template-type-versions">Template
     * Versions</link> resource.
     * </p>
     * <p>
     * If you don't specify a value for this property, Amazon Pinpoint uses the
     * <i>active version</i> of the template. The <i>active version</i> is
     * typically the version of a template that's been most recently reviewed
     * and approved for use, depending on your workflow. It isn't necessarily
     * the latest version of a template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param templateVersion <p>
     *            The unique identifier for the version of the email template to
     *            use for the message. If specified, this value must match the
     *            identifier for an existing template version. To retrieve a
     *            list of versions and version identifiers for a template, use
     *            the <link
     *            linkend="templates-template-name-template-type-versions"
     *            >Template Versions</link> resource.
     *            </p>
     *            <p>
     *            If you don't specify a value for this property, Amazon
     *            Pinpoint uses the <i>active version</i> of the template. The
     *            <i>active version</i> is typically the version of a template
     *            that's been most recently reviewed and approved for use,
     *            depending on your workflow. It isn't necessarily the latest
     *            version of a template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EmailMessageActivity withTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
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
        if (getMessageConfig() != null)
            sb.append("MessageConfig: " + getMessageConfig() + ",");
        if (getNextActivity() != null)
            sb.append("NextActivity: " + getNextActivity() + ",");
        if (getTemplateName() != null)
            sb.append("TemplateName: " + getTemplateName() + ",");
        if (getTemplateVersion() != null)
            sb.append("TemplateVersion: " + getTemplateVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMessageConfig() == null) ? 0 : getMessageConfig().hashCode());
        hashCode = prime * hashCode
                + ((getNextActivity() == null) ? 0 : getNextActivity().hashCode());
        hashCode = prime * hashCode
                + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        hashCode = prime * hashCode
                + ((getTemplateVersion() == null) ? 0 : getTemplateVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EmailMessageActivity == false)
            return false;
        EmailMessageActivity other = (EmailMessageActivity) obj;

        if (other.getMessageConfig() == null ^ this.getMessageConfig() == null)
            return false;
        if (other.getMessageConfig() != null
                && other.getMessageConfig().equals(this.getMessageConfig()) == false)
            return false;
        if (other.getNextActivity() == null ^ this.getNextActivity() == null)
            return false;
        if (other.getNextActivity() != null
                && other.getNextActivity().equals(this.getNextActivity()) == false)
            return false;
        if (other.getTemplateName() == null ^ this.getTemplateName() == null)
            return false;
        if (other.getTemplateName() != null
                && other.getTemplateName().equals(this.getTemplateName()) == false)
            return false;
        if (other.getTemplateVersion() == null ^ this.getTemplateVersion() == null)
            return false;
        if (other.getTemplateVersion() != null
                && other.getTemplateVersion().equals(this.getTemplateVersion()) == false)
            return false;
        return true;
    }
}