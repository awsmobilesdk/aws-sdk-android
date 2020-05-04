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
 * Describes the storage parameters for S3 and S3 buckets for an instance
 * store-backed AMI.
 * </p>
 */
public class S3Storage implements Serializable {
    /**
     * <p>
     * The access key ID of the owner of the bucket. Before you specify a value
     * for your access key ID, review and follow the guidance in <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-access-keys-best-practices.html"
     * >Best Practices for Managing AWS Access Keys</a>.
     * </p>
     */
    private String aWSAccessKeyId;

    /**
     * <p>
     * The bucket in which to store the AMI. You can specify a bucket that you
     * already own or a new bucket that Amazon EC2 creates on your behalf. If
     * you specify a bucket that belongs to someone else, Amazon EC2 returns an
     * error.
     * </p>
     */
    private String bucket;

    /**
     * <p>
     * The beginning of the file name of the AMI.
     * </p>
     */
    private String prefix;

    /**
     * <p>
     * An Amazon S3 upload policy that gives Amazon EC2 permission to upload
     * items into Amazon S3 on your behalf.
     * </p>
     */
    private java.nio.ByteBuffer uploadPolicy;

    /**
     * <p>
     * The signature of the JSON document.
     * </p>
     */
    private String uploadPolicySignature;

    /**
     * <p>
     * The access key ID of the owner of the bucket. Before you specify a value
     * for your access key ID, review and follow the guidance in <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-access-keys-best-practices.html"
     * >Best Practices for Managing AWS Access Keys</a>.
     * </p>
     *
     * @return <p>
     *         The access key ID of the owner of the bucket. Before you specify
     *         a value for your access key ID, review and follow the guidance in
     *         <a href=
     *         "https://docs.aws.amazon.com/general/latest/gr/aws-access-keys-best-practices.html"
     *         >Best Practices for Managing AWS Access Keys</a>.
     *         </p>
     */
    public String getAWSAccessKeyId() {
        return aWSAccessKeyId;
    }

    /**
     * <p>
     * The access key ID of the owner of the bucket. Before you specify a value
     * for your access key ID, review and follow the guidance in <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-access-keys-best-practices.html"
     * >Best Practices for Managing AWS Access Keys</a>.
     * </p>
     *
     * @param aWSAccessKeyId <p>
     *            The access key ID of the owner of the bucket. Before you
     *            specify a value for your access key ID, review and follow the
     *            guidance in <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/aws-access-keys-best-practices.html"
     *            >Best Practices for Managing AWS Access Keys</a>.
     *            </p>
     */
    public void setAWSAccessKeyId(String aWSAccessKeyId) {
        this.aWSAccessKeyId = aWSAccessKeyId;
    }

    /**
     * <p>
     * The access key ID of the owner of the bucket. Before you specify a value
     * for your access key ID, review and follow the guidance in <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-access-keys-best-practices.html"
     * >Best Practices for Managing AWS Access Keys</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param aWSAccessKeyId <p>
     *            The access key ID of the owner of the bucket. Before you
     *            specify a value for your access key ID, review and follow the
     *            guidance in <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/aws-access-keys-best-practices.html"
     *            >Best Practices for Managing AWS Access Keys</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3Storage withAWSAccessKeyId(String aWSAccessKeyId) {
        this.aWSAccessKeyId = aWSAccessKeyId;
        return this;
    }

    /**
     * <p>
     * The bucket in which to store the AMI. You can specify a bucket that you
     * already own or a new bucket that Amazon EC2 creates on your behalf. If
     * you specify a bucket that belongs to someone else, Amazon EC2 returns an
     * error.
     * </p>
     *
     * @return <p>
     *         The bucket in which to store the AMI. You can specify a bucket
     *         that you already own or a new bucket that Amazon EC2 creates on
     *         your behalf. If you specify a bucket that belongs to someone
     *         else, Amazon EC2 returns an error.
     *         </p>
     */
    public String getBucket() {
        return bucket;
    }

    /**
     * <p>
     * The bucket in which to store the AMI. You can specify a bucket that you
     * already own or a new bucket that Amazon EC2 creates on your behalf. If
     * you specify a bucket that belongs to someone else, Amazon EC2 returns an
     * error.
     * </p>
     *
     * @param bucket <p>
     *            The bucket in which to store the AMI. You can specify a bucket
     *            that you already own or a new bucket that Amazon EC2 creates
     *            on your behalf. If you specify a bucket that belongs to
     *            someone else, Amazon EC2 returns an error.
     *            </p>
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The bucket in which to store the AMI. You can specify a bucket that you
     * already own or a new bucket that Amazon EC2 creates on your behalf. If
     * you specify a bucket that belongs to someone else, Amazon EC2 returns an
     * error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucket <p>
     *            The bucket in which to store the AMI. You can specify a bucket
     *            that you already own or a new bucket that Amazon EC2 creates
     *            on your behalf. If you specify a bucket that belongs to
     *            someone else, Amazon EC2 returns an error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3Storage withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * <p>
     * The beginning of the file name of the AMI.
     * </p>
     *
     * @return <p>
     *         The beginning of the file name of the AMI.
     *         </p>
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * <p>
     * The beginning of the file name of the AMI.
     * </p>
     *
     * @param prefix <p>
     *            The beginning of the file name of the AMI.
     *            </p>
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * The beginning of the file name of the AMI.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param prefix <p>
     *            The beginning of the file name of the AMI.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3Storage withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * <p>
     * An Amazon S3 upload policy that gives Amazon EC2 permission to upload
     * items into Amazon S3 on your behalf.
     * </p>
     *
     * @return <p>
     *         An Amazon S3 upload policy that gives Amazon EC2 permission to
     *         upload items into Amazon S3 on your behalf.
     *         </p>
     */
    public java.nio.ByteBuffer getUploadPolicy() {
        return uploadPolicy;
    }

    /**
     * <p>
     * An Amazon S3 upload policy that gives Amazon EC2 permission to upload
     * items into Amazon S3 on your behalf.
     * </p>
     *
     * @param uploadPolicy <p>
     *            An Amazon S3 upload policy that gives Amazon EC2 permission to
     *            upload items into Amazon S3 on your behalf.
     *            </p>
     */
    public void setUploadPolicy(java.nio.ByteBuffer uploadPolicy) {
        this.uploadPolicy = uploadPolicy;
    }

    /**
     * <p>
     * An Amazon S3 upload policy that gives Amazon EC2 permission to upload
     * items into Amazon S3 on your behalf.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param uploadPolicy <p>
     *            An Amazon S3 upload policy that gives Amazon EC2 permission to
     *            upload items into Amazon S3 on your behalf.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3Storage withUploadPolicy(java.nio.ByteBuffer uploadPolicy) {
        this.uploadPolicy = uploadPolicy;
        return this;
    }

    /**
     * <p>
     * The signature of the JSON document.
     * </p>
     *
     * @return <p>
     *         The signature of the JSON document.
     *         </p>
     */
    public String getUploadPolicySignature() {
        return uploadPolicySignature;
    }

    /**
     * <p>
     * The signature of the JSON document.
     * </p>
     *
     * @param uploadPolicySignature <p>
     *            The signature of the JSON document.
     *            </p>
     */
    public void setUploadPolicySignature(String uploadPolicySignature) {
        this.uploadPolicySignature = uploadPolicySignature;
    }

    /**
     * <p>
     * The signature of the JSON document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param uploadPolicySignature <p>
     *            The signature of the JSON document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3Storage withUploadPolicySignature(String uploadPolicySignature) {
        this.uploadPolicySignature = uploadPolicySignature;
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
        if (getAWSAccessKeyId() != null)
            sb.append("AWSAccessKeyId: " + getAWSAccessKeyId() + ",");
        if (getBucket() != null)
            sb.append("Bucket: " + getBucket() + ",");
        if (getPrefix() != null)
            sb.append("Prefix: " + getPrefix() + ",");
        if (getUploadPolicy() != null)
            sb.append("UploadPolicy: " + getUploadPolicy() + ",");
        if (getUploadPolicySignature() != null)
            sb.append("UploadPolicySignature: " + getUploadPolicySignature());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAWSAccessKeyId() == null) ? 0 : getAWSAccessKeyId().hashCode());
        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        hashCode = prime * hashCode
                + ((getUploadPolicy() == null) ? 0 : getUploadPolicy().hashCode());
        hashCode = prime
                * hashCode
                + ((getUploadPolicySignature() == null) ? 0 : getUploadPolicySignature().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3Storage == false)
            return false;
        S3Storage other = (S3Storage) obj;

        if (other.getAWSAccessKeyId() == null ^ this.getAWSAccessKeyId() == null)
            return false;
        if (other.getAWSAccessKeyId() != null
                && other.getAWSAccessKeyId().equals(this.getAWSAccessKeyId()) == false)
            return false;
        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getPrefix() == null ^ this.getPrefix() == null)
            return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false)
            return false;
        if (other.getUploadPolicy() == null ^ this.getUploadPolicy() == null)
            return false;
        if (other.getUploadPolicy() != null
                && other.getUploadPolicy().equals(this.getUploadPolicy()) == false)
            return false;
        if (other.getUploadPolicySignature() == null ^ this.getUploadPolicySignature() == null)
            return false;
        if (other.getUploadPolicySignature() != null
                && other.getUploadPolicySignature().equals(this.getUploadPolicySignature()) == false)
            return false;
        return true;
    }
}