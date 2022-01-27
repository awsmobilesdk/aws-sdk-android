/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Associates an existing vocabulary as the default. Contact Lens for Amazon
 * Connect uses the vocabulary in post-call and real-time analysis sessions for
 * the given language.
 * </p>
 */
public class AssociateDefaultVocabularyRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String instanceId;

    /**
     * <p>
     * The language code of the vocabulary entries. For a list of languages and
     * their corresponding language codes, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/transcribe-whatis.html"
     * >What is Amazon Transcribe?</a>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ar-AE, de-CH, de-DE, en-AB, en-AU, en-GB, en-IE,
     * en-IN, en-US, en-WL, es-ES, es-US, fr-CA, fr-FR, hi-IN, it-IT, ja-JP,
     * ko-KR, pt-BR, pt-PT, zh-CN
     */
    private String languageCode;

    /**
     * <p>
     * The identifier of the custom vocabulary. If this is empty, the default is
     * set to none.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     */
    private String vocabularyId;

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The identifier of the Amazon Connect instance. You can find the
     *         instanceId in the ARN of the instance.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance. You can find
     *            the instanceId in the ARN of the instance.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance. You can find
     *            the instanceId in the ARN of the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateDefaultVocabularyRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * The language code of the vocabulary entries. For a list of languages and
     * their corresponding language codes, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/transcribe-whatis.html"
     * >What is Amazon Transcribe?</a>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ar-AE, de-CH, de-DE, en-AB, en-AU, en-GB, en-IE,
     * en-IN, en-US, en-WL, es-ES, es-US, fr-CA, fr-FR, hi-IN, it-IT, ja-JP,
     * ko-KR, pt-BR, pt-PT, zh-CN
     *
     * @return <p>
     *         The language code of the vocabulary entries. For a list of
     *         languages and their corresponding language codes, see <a href=
     *         "https://docs.aws.amazon.com/transcribe/latest/dg/transcribe-whatis.html"
     *         >What is Amazon Transcribe?</a>
     *         </p>
     * @see VocabularyLanguageCode
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * <p>
     * The language code of the vocabulary entries. For a list of languages and
     * their corresponding language codes, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/transcribe-whatis.html"
     * >What is Amazon Transcribe?</a>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ar-AE, de-CH, de-DE, en-AB, en-AU, en-GB, en-IE,
     * en-IN, en-US, en-WL, es-ES, es-US, fr-CA, fr-FR, hi-IN, it-IT, ja-JP,
     * ko-KR, pt-BR, pt-PT, zh-CN
     *
     * @param languageCode <p>
     *            The language code of the vocabulary entries. For a list of
     *            languages and their corresponding language codes, see <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/transcribe-whatis.html"
     *            >What is Amazon Transcribe?</a>
     *            </p>
     * @see VocabularyLanguageCode
     */
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language code of the vocabulary entries. For a list of languages and
     * their corresponding language codes, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/transcribe-whatis.html"
     * >What is Amazon Transcribe?</a>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ar-AE, de-CH, de-DE, en-AB, en-AU, en-GB, en-IE,
     * en-IN, en-US, en-WL, es-ES, es-US, fr-CA, fr-FR, hi-IN, it-IT, ja-JP,
     * ko-KR, pt-BR, pt-PT, zh-CN
     *
     * @param languageCode <p>
     *            The language code of the vocabulary entries. For a list of
     *            languages and their corresponding language codes, see <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/transcribe-whatis.html"
     *            >What is Amazon Transcribe?</a>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VocabularyLanguageCode
     */
    public AssociateDefaultVocabularyRequest withLanguageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * <p>
     * The language code of the vocabulary entries. For a list of languages and
     * their corresponding language codes, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/transcribe-whatis.html"
     * >What is Amazon Transcribe?</a>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ar-AE, de-CH, de-DE, en-AB, en-AU, en-GB, en-IE,
     * en-IN, en-US, en-WL, es-ES, es-US, fr-CA, fr-FR, hi-IN, it-IT, ja-JP,
     * ko-KR, pt-BR, pt-PT, zh-CN
     *
     * @param languageCode <p>
     *            The language code of the vocabulary entries. For a list of
     *            languages and their corresponding language codes, see <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/transcribe-whatis.html"
     *            >What is Amazon Transcribe?</a>
     *            </p>
     * @see VocabularyLanguageCode
     */
    public void setLanguageCode(VocabularyLanguageCode languageCode) {
        this.languageCode = languageCode.toString();
    }

    /**
     * <p>
     * The language code of the vocabulary entries. For a list of languages and
     * their corresponding language codes, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/transcribe-whatis.html"
     * >What is Amazon Transcribe?</a>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ar-AE, de-CH, de-DE, en-AB, en-AU, en-GB, en-IE,
     * en-IN, en-US, en-WL, es-ES, es-US, fr-CA, fr-FR, hi-IN, it-IT, ja-JP,
     * ko-KR, pt-BR, pt-PT, zh-CN
     *
     * @param languageCode <p>
     *            The language code of the vocabulary entries. For a list of
     *            languages and their corresponding language codes, see <a href=
     *            "https://docs.aws.amazon.com/transcribe/latest/dg/transcribe-whatis.html"
     *            >What is Amazon Transcribe?</a>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VocabularyLanguageCode
     */
    public AssociateDefaultVocabularyRequest withLanguageCode(VocabularyLanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * The identifier of the custom vocabulary. If this is empty, the default is
     * set to none.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     *
     * @return <p>
     *         The identifier of the custom vocabulary. If this is empty, the
     *         default is set to none.
     *         </p>
     */
    public String getVocabularyId() {
        return vocabularyId;
    }

    /**
     * <p>
     * The identifier of the custom vocabulary. If this is empty, the default is
     * set to none.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     *
     * @param vocabularyId <p>
     *            The identifier of the custom vocabulary. If this is empty, the
     *            default is set to none.
     *            </p>
     */
    public void setVocabularyId(String vocabularyId) {
        this.vocabularyId = vocabularyId;
    }

    /**
     * <p>
     * The identifier of the custom vocabulary. If this is empty, the default is
     * set to none.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     *
     * @param vocabularyId <p>
     *            The identifier of the custom vocabulary. If this is empty, the
     *            default is set to none.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateDefaultVocabularyRequest withVocabularyId(String vocabularyId) {
        this.vocabularyId = vocabularyId;
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
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: " + getLanguageCode() + ",");
        if (getVocabularyId() != null)
            sb.append("VocabularyId: " + getVocabularyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode
                + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode
                + ((getVocabularyId() == null) ? 0 : getVocabularyId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateDefaultVocabularyRequest == false)
            return false;
        AssociateDefaultVocabularyRequest other = (AssociateDefaultVocabularyRequest) obj;

        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null
                && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getVocabularyId() == null ^ this.getVocabularyId() == null)
            return false;
        if (other.getVocabularyId() != null
                && other.getVocabularyId().equals(this.getVocabularyId()) == false)
            return false;
        return true;
    }
}
