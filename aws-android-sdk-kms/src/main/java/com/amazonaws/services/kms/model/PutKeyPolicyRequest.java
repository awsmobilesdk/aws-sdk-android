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

package com.amazonaws.services.kms.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Attaches a key policy to the specified KMS key.
 * </p>
 * <p>
 * For more information about key policies, see <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html">Key
 * Policies</a> in the <i>Key Management Service Developer Guide</i>. For help
 * writing and formatting a JSON policy document, see the <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies.html"
 * >IAM JSON Policy Reference</a> in the <i> <i>Identity and Access Management
 * User Guide</i> </i>. For examples of adding a key policy in multiple
 * programming languages, see <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/programming-key-policies.html#put-policy"
 * >Setting a key policy</a> in the <i>Key Management Service Developer
 * Guide</i>.
 * </p>
 * <p>
 * <b>Cross-account use</b>: No. You cannot perform this operation on a KMS key
 * in a different Amazon Web Services account.
 * </p>
 * <p>
 * <b>Required permissions</b>: <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
 * >kms:PutKeyPolicy</a> (key policy)
 * </p>
 * <p>
 * <b>Related operations</b>: <a>GetKeyPolicy</a>
 * </p>
 * <p>
 * <b>Eventual consistency</b>: The KMS API follows an eventual consistency
 * model. For more information, see <a href=
 * "https://docs.aws.amazon.com/kms/latest/developerguide/programming-eventual-consistency.html"
 * >KMS eventual consistency</a>.
 * </p>
 */
public class PutKeyPolicyRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Sets the key policy on the specified KMS key.
     * </p>
     * <p>
     * Specify the key ID or key ARN of the KMS key.
     * </p>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN:
     * <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the key ID and key ARN for a KMS key, use <a>ListKeys</a> or
     * <a>DescribeKey</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String keyId;

    /**
     * <p>
     * The name of the key policy. The only valid value is <code>default</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w]+<br/>
     */
    private String policyName;

    /**
     * <p>
     * The key policy to attach to the KMS key.
     * </p>
     * <p>
     * The key policy must meet the following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The key policy must allow the calling principal to make a subsequent
     * <code>PutKeyPolicy</code> request on the KMS key. This reduces the risk
     * that the KMS key becomes unmanageable. For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policy-default.html#prevent-unmanageable-key"
     * >Default key policy</a> in the <i>Key Management Service Developer
     * Guide</i>. (To omit this condition, set
     * <code>BypassPolicyLockoutSafetyCheck</code> to true.)
     * </p>
     * </li>
     * <li>
     * <p>
     * Each statement in the key policy must contain one or more principals. The
     * principals in the key policy must exist and be visible to KMS. When you
     * create a new Amazon Web Services principal, you might need to enforce a
     * delay before including the new principal in a key policy because the new
     * principal might not be immediately visible to KMS. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_eventual-consistency"
     * >Changes that I make are not always immediately visible</a> in the
     * <i>Amazon Web Services Identity and Access Management User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * A key policy document can include only the following characters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Printable ASCII characters from the space character (<code>\u0020</code>)
     * through the end of the ASCII character range.
     * </p>
     * </li>
     * <li>
     * <p>
     * Printable characters in the Basic Latin and Latin-1 Supplement character
     * set (through <code>\u00FF</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * The tab (<code>\u0009</code>), line feed (<code>\u000A</code>), and
     * carriage return (<code>\u000D</code>) special characters
     * </p>
     * </li>
     * </ul>
     * <p>
     * For information about key policies, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html"
     * >Key policies in KMS</a> in the <i>Key Management Service Developer
     * Guide</i>.For help writing and formatting a JSON policy document, see the
     * <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies.html"
     * >IAM JSON Policy Reference</a> in the <i> <i>Identity and Access
     * Management User Guide</i> </i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     */
    private String policy;

    /**
     * <p>
     * Skips ("bypasses") the key policy lockout safety check. The default value
     * is false.
     * </p>
     * <important>
     * <p>
     * Setting this value to true increases the risk that the KMS key becomes
     * unmanageable. Do not set this value to true indiscriminately.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policy-default.html#prevent-unmanageable-key"
     * >Default key policy</a> in the <i>Key Management Service Developer
     * Guide</i>.
     * </p>
     * </important>
     * <p>
     * Use this parameter only when you intend to prevent the principal that is
     * making the request from making a subsequent <a href=
     * "https://docs.aws.amazon.com/kms/latest/APIReference/API_PutKeyPolicy.html"
     * >PutKeyPolicy</a> request on the KMS key.
     * </p>
     */
    private Boolean bypassPolicyLockoutSafetyCheck;

    /**
     * <p>
     * Sets the key policy on the specified KMS key.
     * </p>
     * <p>
     * Specify the key ID or key ARN of the KMS key.
     * </p>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN:
     * <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the key ID and key ARN for a KMS key, use <a>ListKeys</a> or
     * <a>DescribeKey</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         Sets the key policy on the specified KMS key.
     *         </p>
     *         <p>
     *         Specify the key ID or key ARN of the KMS key.
     *         </p>
     *         <p>
     *         For example:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key ARN:
     *         <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         To get the key ID and key ARN for a KMS key, use <a>ListKeys</a>
     *         or <a>DescribeKey</a>.
     *         </p>
     */
    public String getKeyId() {
        return keyId;
    }

    /**
     * <p>
     * Sets the key policy on the specified KMS key.
     * </p>
     * <p>
     * Specify the key ID or key ARN of the KMS key.
     * </p>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN:
     * <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the key ID and key ARN for a KMS key, use <a>ListKeys</a> or
     * <a>DescribeKey</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param keyId <p>
     *            Sets the key policy on the specified KMS key.
     *            </p>
     *            <p>
     *            Specify the key ID or key ARN of the KMS key.
     *            </p>
     *            <p>
     *            For example:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key ARN:
     *            <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            To get the key ID and key ARN for a KMS key, use
     *            <a>ListKeys</a> or <a>DescribeKey</a>.
     *            </p>
     */
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * Sets the key policy on the specified KMS key.
     * </p>
     * <p>
     * Specify the key ID or key ARN of the KMS key.
     * </p>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN:
     * <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the key ID and key ARN for a KMS key, use <a>ListKeys</a> or
     * <a>DescribeKey</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param keyId <p>
     *            Sets the key policy on the specified KMS key.
     *            </p>
     *            <p>
     *            Specify the key ID or key ARN of the KMS key.
     *            </p>
     *            <p>
     *            For example:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key ARN:
     *            <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            To get the key ID and key ARN for a KMS key, use
     *            <a>ListKeys</a> or <a>DescribeKey</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutKeyPolicyRequest withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * <p>
     * The name of the key policy. The only valid value is <code>default</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w]+<br/>
     *
     * @return <p>
     *         The name of the key policy. The only valid value is
     *         <code>default</code>.
     *         </p>
     */
    public String getPolicyName() {
        return policyName;
    }

    /**
     * <p>
     * The name of the key policy. The only valid value is <code>default</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w]+<br/>
     *
     * @param policyName <p>
     *            The name of the key policy. The only valid value is
     *            <code>default</code>.
     *            </p>
     */
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * <p>
     * The name of the key policy. The only valid value is <code>default</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w]+<br/>
     *
     * @param policyName <p>
     *            The name of the key policy. The only valid value is
     *            <code>default</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutKeyPolicyRequest withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * <p>
     * The key policy to attach to the KMS key.
     * </p>
     * <p>
     * The key policy must meet the following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The key policy must allow the calling principal to make a subsequent
     * <code>PutKeyPolicy</code> request on the KMS key. This reduces the risk
     * that the KMS key becomes unmanageable. For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policy-default.html#prevent-unmanageable-key"
     * >Default key policy</a> in the <i>Key Management Service Developer
     * Guide</i>. (To omit this condition, set
     * <code>BypassPolicyLockoutSafetyCheck</code> to true.)
     * </p>
     * </li>
     * <li>
     * <p>
     * Each statement in the key policy must contain one or more principals. The
     * principals in the key policy must exist and be visible to KMS. When you
     * create a new Amazon Web Services principal, you might need to enforce a
     * delay before including the new principal in a key policy because the new
     * principal might not be immediately visible to KMS. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_eventual-consistency"
     * >Changes that I make are not always immediately visible</a> in the
     * <i>Amazon Web Services Identity and Access Management User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * A key policy document can include only the following characters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Printable ASCII characters from the space character (<code>\u0020</code>)
     * through the end of the ASCII character range.
     * </p>
     * </li>
     * <li>
     * <p>
     * Printable characters in the Basic Latin and Latin-1 Supplement character
     * set (through <code>\u00FF</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * The tab (<code>\u0009</code>), line feed (<code>\u000A</code>), and
     * carriage return (<code>\u000D</code>) special characters
     * </p>
     * </li>
     * </ul>
     * <p>
     * For information about key policies, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html"
     * >Key policies in KMS</a> in the <i>Key Management Service Developer
     * Guide</i>.For help writing and formatting a JSON policy document, see the
     * <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies.html"
     * >IAM JSON Policy Reference</a> in the <i> <i>Identity and Access
     * Management User Guide</i> </i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @return <p>
     *         The key policy to attach to the KMS key.
     *         </p>
     *         <p>
     *         The key policy must meet the following criteria:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The key policy must allow the calling principal to make a
     *         subsequent <code>PutKeyPolicy</code> request on the KMS key. This
     *         reduces the risk that the KMS key becomes unmanageable. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/key-policy-default.html#prevent-unmanageable-key"
     *         >Default key policy</a> in the <i>Key Management Service
     *         Developer Guide</i>. (To omit this condition, set
     *         <code>BypassPolicyLockoutSafetyCheck</code> to true.)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Each statement in the key policy must contain one or more
     *         principals. The principals in the key policy must exist and be
     *         visible to KMS. When you create a new Amazon Web Services
     *         principal, you might need to enforce a delay before including the
     *         new principal in a key policy because the new principal might not
     *         be immediately visible to KMS. For more information, see <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_eventual-consistency"
     *         >Changes that I make are not always immediately visible</a> in
     *         the <i>Amazon Web Services Identity and Access Management User
     *         Guide</i>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         A key policy document can include only the following characters:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Printable ASCII characters from the space character (
     *         <code>\u0020</code>) through the end of the ASCII character
     *         range.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Printable characters in the Basic Latin and Latin-1 Supplement
     *         character set (through <code>\u00FF</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The tab (<code>\u0009</code>), line feed (<code>\u000A</code>),
     *         and carriage return (<code>\u000D</code>) special characters
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For information about key policies, see <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html"
     *         >Key policies in KMS</a> in the <i>Key Management Service
     *         Developer Guide</i>.For help writing and formatting a JSON policy
     *         document, see the <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies.html"
     *         >IAM JSON Policy Reference</a> in the <i> <i>Identity and Access
     *         Management User Guide</i> </i>.
     *         </p>
     */
    public String getPolicy() {
        return policy;
    }

    /**
     * <p>
     * The key policy to attach to the KMS key.
     * </p>
     * <p>
     * The key policy must meet the following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The key policy must allow the calling principal to make a subsequent
     * <code>PutKeyPolicy</code> request on the KMS key. This reduces the risk
     * that the KMS key becomes unmanageable. For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policy-default.html#prevent-unmanageable-key"
     * >Default key policy</a> in the <i>Key Management Service Developer
     * Guide</i>. (To omit this condition, set
     * <code>BypassPolicyLockoutSafetyCheck</code> to true.)
     * </p>
     * </li>
     * <li>
     * <p>
     * Each statement in the key policy must contain one or more principals. The
     * principals in the key policy must exist and be visible to KMS. When you
     * create a new Amazon Web Services principal, you might need to enforce a
     * delay before including the new principal in a key policy because the new
     * principal might not be immediately visible to KMS. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_eventual-consistency"
     * >Changes that I make are not always immediately visible</a> in the
     * <i>Amazon Web Services Identity and Access Management User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * A key policy document can include only the following characters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Printable ASCII characters from the space character (<code>\u0020</code>)
     * through the end of the ASCII character range.
     * </p>
     * </li>
     * <li>
     * <p>
     * Printable characters in the Basic Latin and Latin-1 Supplement character
     * set (through <code>\u00FF</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * The tab (<code>\u0009</code>), line feed (<code>\u000A</code>), and
     * carriage return (<code>\u000D</code>) special characters
     * </p>
     * </li>
     * </ul>
     * <p>
     * For information about key policies, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html"
     * >Key policies in KMS</a> in the <i>Key Management Service Developer
     * Guide</i>.For help writing and formatting a JSON policy document, see the
     * <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies.html"
     * >IAM JSON Policy Reference</a> in the <i> <i>Identity and Access
     * Management User Guide</i> </i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param policy <p>
     *            The key policy to attach to the KMS key.
     *            </p>
     *            <p>
     *            The key policy must meet the following criteria:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The key policy must allow the calling principal to make a
     *            subsequent <code>PutKeyPolicy</code> request on the KMS key.
     *            This reduces the risk that the KMS key becomes unmanageable.
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/key-policy-default.html#prevent-unmanageable-key"
     *            >Default key policy</a> in the <i>Key Management Service
     *            Developer Guide</i>. (To omit this condition, set
     *            <code>BypassPolicyLockoutSafetyCheck</code> to true.)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Each statement in the key policy must contain one or more
     *            principals. The principals in the key policy must exist and be
     *            visible to KMS. When you create a new Amazon Web Services
     *            principal, you might need to enforce a delay before including
     *            the new principal in a key policy because the new principal
     *            might not be immediately visible to KMS. For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_eventual-consistency"
     *            >Changes that I make are not always immediately visible</a> in
     *            the <i>Amazon Web Services Identity and Access Management User
     *            Guide</i>.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            A key policy document can include only the following
     *            characters:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Printable ASCII characters from the space character (
     *            <code>\u0020</code>) through the end of the ASCII character
     *            range.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Printable characters in the Basic Latin and Latin-1 Supplement
     *            character set (through <code>\u00FF</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The tab (<code>\u0009</code>), line feed (<code>\u000A</code>
     *            ), and carriage return (<code>\u000D</code>) special
     *            characters
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For information about key policies, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html"
     *            >Key policies in KMS</a> in the <i>Key Management Service
     *            Developer Guide</i>.For help writing and formatting a JSON
     *            policy document, see the <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies.html"
     *            >IAM JSON Policy Reference</a> in the <i> <i>Identity and
     *            Access Management User Guide</i> </i>.
     *            </p>
     */
    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * The key policy to attach to the KMS key.
     * </p>
     * <p>
     * The key policy must meet the following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The key policy must allow the calling principal to make a subsequent
     * <code>PutKeyPolicy</code> request on the KMS key. This reduces the risk
     * that the KMS key becomes unmanageable. For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policy-default.html#prevent-unmanageable-key"
     * >Default key policy</a> in the <i>Key Management Service Developer
     * Guide</i>. (To omit this condition, set
     * <code>BypassPolicyLockoutSafetyCheck</code> to true.)
     * </p>
     * </li>
     * <li>
     * <p>
     * Each statement in the key policy must contain one or more principals. The
     * principals in the key policy must exist and be visible to KMS. When you
     * create a new Amazon Web Services principal, you might need to enforce a
     * delay before including the new principal in a key policy because the new
     * principal might not be immediately visible to KMS. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_eventual-consistency"
     * >Changes that I make are not always immediately visible</a> in the
     * <i>Amazon Web Services Identity and Access Management User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * A key policy document can include only the following characters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Printable ASCII characters from the space character (<code>\u0020</code>)
     * through the end of the ASCII character range.
     * </p>
     * </li>
     * <li>
     * <p>
     * Printable characters in the Basic Latin and Latin-1 Supplement character
     * set (through <code>\u00FF</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * The tab (<code>\u0009</code>), line feed (<code>\u000A</code>), and
     * carriage return (<code>\u000D</code>) special characters
     * </p>
     * </li>
     * </ul>
     * <p>
     * For information about key policies, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html"
     * >Key policies in KMS</a> in the <i>Key Management Service Developer
     * Guide</i>.For help writing and formatting a JSON policy document, see the
     * <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies.html"
     * >IAM JSON Policy Reference</a> in the <i> <i>Identity and Access
     * Management User Guide</i> </i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param policy <p>
     *            The key policy to attach to the KMS key.
     *            </p>
     *            <p>
     *            The key policy must meet the following criteria:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The key policy must allow the calling principal to make a
     *            subsequent <code>PutKeyPolicy</code> request on the KMS key.
     *            This reduces the risk that the KMS key becomes unmanageable.
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/key-policy-default.html#prevent-unmanageable-key"
     *            >Default key policy</a> in the <i>Key Management Service
     *            Developer Guide</i>. (To omit this condition, set
     *            <code>BypassPolicyLockoutSafetyCheck</code> to true.)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Each statement in the key policy must contain one or more
     *            principals. The principals in the key policy must exist and be
     *            visible to KMS. When you create a new Amazon Web Services
     *            principal, you might need to enforce a delay before including
     *            the new principal in a key policy because the new principal
     *            might not be immediately visible to KMS. For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/troubleshoot_general.html#troubleshoot_general_eventual-consistency"
     *            >Changes that I make are not always immediately visible</a> in
     *            the <i>Amazon Web Services Identity and Access Management User
     *            Guide</i>.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            A key policy document can include only the following
     *            characters:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Printable ASCII characters from the space character (
     *            <code>\u0020</code>) through the end of the ASCII character
     *            range.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Printable characters in the Basic Latin and Latin-1 Supplement
     *            character set (through <code>\u00FF</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The tab (<code>\u0009</code>), line feed (<code>\u000A</code>
     *            ), and carriage return (<code>\u000D</code>) special
     *            characters
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For information about key policies, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html"
     *            >Key policies in KMS</a> in the <i>Key Management Service
     *            Developer Guide</i>.For help writing and formatting a JSON
     *            policy document, see the <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies.html"
     *            >IAM JSON Policy Reference</a> in the <i> <i>Identity and
     *            Access Management User Guide</i> </i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutKeyPolicyRequest withPolicy(String policy) {
        this.policy = policy;
        return this;
    }

    /**
     * <p>
     * Skips ("bypasses") the key policy lockout safety check. The default value
     * is false.
     * </p>
     * <important>
     * <p>
     * Setting this value to true increases the risk that the KMS key becomes
     * unmanageable. Do not set this value to true indiscriminately.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policy-default.html#prevent-unmanageable-key"
     * >Default key policy</a> in the <i>Key Management Service Developer
     * Guide</i>.
     * </p>
     * </important>
     * <p>
     * Use this parameter only when you intend to prevent the principal that is
     * making the request from making a subsequent <a href=
     * "https://docs.aws.amazon.com/kms/latest/APIReference/API_PutKeyPolicy.html"
     * >PutKeyPolicy</a> request on the KMS key.
     * </p>
     *
     * @return <p>
     *         Skips ("bypasses") the key policy lockout safety check. The
     *         default value is false.
     *         </p>
     *         <important>
     *         <p>
     *         Setting this value to true increases the risk that the KMS key
     *         becomes unmanageable. Do not set this value to true
     *         indiscriminately.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/key-policy-default.html#prevent-unmanageable-key"
     *         >Default key policy</a> in the <i>Key Management Service
     *         Developer Guide</i>.
     *         </p>
     *         </important>
     *         <p>
     *         Use this parameter only when you intend to prevent the principal
     *         that is making the request from making a subsequent <a href=
     *         "https://docs.aws.amazon.com/kms/latest/APIReference/API_PutKeyPolicy.html"
     *         >PutKeyPolicy</a> request on the KMS key.
     *         </p>
     */
    public Boolean isBypassPolicyLockoutSafetyCheck() {
        return bypassPolicyLockoutSafetyCheck;
    }

    /**
     * <p>
     * Skips ("bypasses") the key policy lockout safety check. The default value
     * is false.
     * </p>
     * <important>
     * <p>
     * Setting this value to true increases the risk that the KMS key becomes
     * unmanageable. Do not set this value to true indiscriminately.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policy-default.html#prevent-unmanageable-key"
     * >Default key policy</a> in the <i>Key Management Service Developer
     * Guide</i>.
     * </p>
     * </important>
     * <p>
     * Use this parameter only when you intend to prevent the principal that is
     * making the request from making a subsequent <a href=
     * "https://docs.aws.amazon.com/kms/latest/APIReference/API_PutKeyPolicy.html"
     * >PutKeyPolicy</a> request on the KMS key.
     * </p>
     *
     * @return <p>
     *         Skips ("bypasses") the key policy lockout safety check. The
     *         default value is false.
     *         </p>
     *         <important>
     *         <p>
     *         Setting this value to true increases the risk that the KMS key
     *         becomes unmanageable. Do not set this value to true
     *         indiscriminately.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/key-policy-default.html#prevent-unmanageable-key"
     *         >Default key policy</a> in the <i>Key Management Service
     *         Developer Guide</i>.
     *         </p>
     *         </important>
     *         <p>
     *         Use this parameter only when you intend to prevent the principal
     *         that is making the request from making a subsequent <a href=
     *         "https://docs.aws.amazon.com/kms/latest/APIReference/API_PutKeyPolicy.html"
     *         >PutKeyPolicy</a> request on the KMS key.
     *         </p>
     */
    public Boolean getBypassPolicyLockoutSafetyCheck() {
        return bypassPolicyLockoutSafetyCheck;
    }

    /**
     * <p>
     * Skips ("bypasses") the key policy lockout safety check. The default value
     * is false.
     * </p>
     * <important>
     * <p>
     * Setting this value to true increases the risk that the KMS key becomes
     * unmanageable. Do not set this value to true indiscriminately.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policy-default.html#prevent-unmanageable-key"
     * >Default key policy</a> in the <i>Key Management Service Developer
     * Guide</i>.
     * </p>
     * </important>
     * <p>
     * Use this parameter only when you intend to prevent the principal that is
     * making the request from making a subsequent <a href=
     * "https://docs.aws.amazon.com/kms/latest/APIReference/API_PutKeyPolicy.html"
     * >PutKeyPolicy</a> request on the KMS key.
     * </p>
     *
     * @param bypassPolicyLockoutSafetyCheck <p>
     *            Skips ("bypasses") the key policy lockout safety check. The
     *            default value is false.
     *            </p>
     *            <important>
     *            <p>
     *            Setting this value to true increases the risk that the KMS key
     *            becomes unmanageable. Do not set this value to true
     *            indiscriminately.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/key-policy-default.html#prevent-unmanageable-key"
     *            >Default key policy</a> in the <i>Key Management Service
     *            Developer Guide</i>.
     *            </p>
     *            </important>
     *            <p>
     *            Use this parameter only when you intend to prevent the
     *            principal that is making the request from making a subsequent
     *            <a href=
     *            "https://docs.aws.amazon.com/kms/latest/APIReference/API_PutKeyPolicy.html"
     *            >PutKeyPolicy</a> request on the KMS key.
     *            </p>
     */
    public void setBypassPolicyLockoutSafetyCheck(Boolean bypassPolicyLockoutSafetyCheck) {
        this.bypassPolicyLockoutSafetyCheck = bypassPolicyLockoutSafetyCheck;
    }

    /**
     * <p>
     * Skips ("bypasses") the key policy lockout safety check. The default value
     * is false.
     * </p>
     * <important>
     * <p>
     * Setting this value to true increases the risk that the KMS key becomes
     * unmanageable. Do not set this value to true indiscriminately.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/key-policy-default.html#prevent-unmanageable-key"
     * >Default key policy</a> in the <i>Key Management Service Developer
     * Guide</i>.
     * </p>
     * </important>
     * <p>
     * Use this parameter only when you intend to prevent the principal that is
     * making the request from making a subsequent <a href=
     * "https://docs.aws.amazon.com/kms/latest/APIReference/API_PutKeyPolicy.html"
     * >PutKeyPolicy</a> request on the KMS key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bypassPolicyLockoutSafetyCheck <p>
     *            Skips ("bypasses") the key policy lockout safety check. The
     *            default value is false.
     *            </p>
     *            <important>
     *            <p>
     *            Setting this value to true increases the risk that the KMS key
     *            becomes unmanageable. Do not set this value to true
     *            indiscriminately.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/key-policy-default.html#prevent-unmanageable-key"
     *            >Default key policy</a> in the <i>Key Management Service
     *            Developer Guide</i>.
     *            </p>
     *            </important>
     *            <p>
     *            Use this parameter only when you intend to prevent the
     *            principal that is making the request from making a subsequent
     *            <a href=
     *            "https://docs.aws.amazon.com/kms/latest/APIReference/API_PutKeyPolicy.html"
     *            >PutKeyPolicy</a> request on the KMS key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutKeyPolicyRequest withBypassPolicyLockoutSafetyCheck(
            Boolean bypassPolicyLockoutSafetyCheck) {
        this.bypassPolicyLockoutSafetyCheck = bypassPolicyLockoutSafetyCheck;
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
        if (getKeyId() != null)
            sb.append("KeyId: " + getKeyId() + ",");
        if (getPolicyName() != null)
            sb.append("PolicyName: " + getPolicyName() + ",");
        if (getPolicy() != null)
            sb.append("Policy: " + getPolicy() + ",");
        if (getBypassPolicyLockoutSafetyCheck() != null)
            sb.append("BypassPolicyLockoutSafetyCheck: " + getBypassPolicyLockoutSafetyCheck());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode());
        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        hashCode = prime
                * hashCode
                + ((getBypassPolicyLockoutSafetyCheck() == null) ? 0
                        : getBypassPolicyLockoutSafetyCheck().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutKeyPolicyRequest == false)
            return false;
        PutKeyPolicyRequest other = (PutKeyPolicyRequest) obj;

        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getPolicyName() == null ^ this.getPolicyName() == null)
            return false;
        if (other.getPolicyName() != null
                && other.getPolicyName().equals(this.getPolicyName()) == false)
            return false;
        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false)
            return false;
        if (other.getBypassPolicyLockoutSafetyCheck() == null
                ^ this.getBypassPolicyLockoutSafetyCheck() == null)
            return false;
        if (other.getBypassPolicyLockoutSafetyCheck() != null
                && other.getBypassPolicyLockoutSafetyCheck().equals(
                        this.getBypassPolicyLockoutSafetyCheck()) == false)
            return false;
        return true;
    }
}
