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

package com.amazonaws.services.awswaf.model;

import java.io.Serializable;

/**
 * <note>
 * <p>
 * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
 * href=
 * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
 * >AWS WAF Classic</a> in the developer guide.
 * </p>
 * <p>
 * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the
 * <a href=
 * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS
 * WAF Developer Guide</a>. With the latest version, AWS WAF has a single set of
 * endpoints for regional and global use.
 * </p>
 * </note>
 * <p>
 * A collection of predefined rules that you can add to a web ACL.
 * </p>
 * <p>
 * Rule groups are subject to the following limits:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Three rule groups per account. You can request an increase to this limit by
 * contacting customer support.
 * </p>
 * </li>
 * <li>
 * <p>
 * One rule group per web ACL.
 * </p>
 * </li>
 * <li>
 * <p>
 * Ten rules per rule group.
 * </p>
 * </li>
 * </ul>
 */
public class RuleGroup implements Serializable {
    /**
     * <p>
     * A unique identifier for a <code>RuleGroup</code>. You use
     * <code>RuleGroupId</code> to get more information about a
     * <code>RuleGroup</code> (see <a>GetRuleGroup</a>), update a
     * <code>RuleGroup</code> (see <a>UpdateRuleGroup</a>), insert a
     * <code>RuleGroup</code> into a <code>WebACL</code> or delete a one from a
     * <code>WebACL</code> (see <a>UpdateWebACL</a>), or delete a
     * <code>RuleGroup</code> from AWS WAF (see <a>DeleteRuleGroup</a>).
     * </p>
     * <p>
     * <code>RuleGroupId</code> is returned by <a>CreateRuleGroup</a> and by
     * <a>ListRuleGroups</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String ruleGroupId;

    /**
     * <p>
     * The friendly name or description for the <code>RuleGroup</code>. You
     * can't change the name of a <code>RuleGroup</code> after you create it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String name;

    /**
     * <p>
     * A friendly name or description for the metrics for this
     * <code>RuleGroup</code>. The name can contain only alphanumeric characters
     * (A-Z, a-z, 0-9), with maximum length 128 and minimum length one. It can't
     * contain whitespace or metric names reserved for AWS WAF, including "All"
     * and "Default_Action." You can't change the name of the metric after you
     * create the <code>RuleGroup</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String metricName;

    /**
     * <p>
     * A unique identifier for a <code>RuleGroup</code>. You use
     * <code>RuleGroupId</code> to get more information about a
     * <code>RuleGroup</code> (see <a>GetRuleGroup</a>), update a
     * <code>RuleGroup</code> (see <a>UpdateRuleGroup</a>), insert a
     * <code>RuleGroup</code> into a <code>WebACL</code> or delete a one from a
     * <code>WebACL</code> (see <a>UpdateWebACL</a>), or delete a
     * <code>RuleGroup</code> from AWS WAF (see <a>DeleteRuleGroup</a>).
     * </p>
     * <p>
     * <code>RuleGroupId</code> is returned by <a>CreateRuleGroup</a> and by
     * <a>ListRuleGroups</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         A unique identifier for a <code>RuleGroup</code>. You use
     *         <code>RuleGroupId</code> to get more information about a
     *         <code>RuleGroup</code> (see <a>GetRuleGroup</a>), update a
     *         <code>RuleGroup</code> (see <a>UpdateRuleGroup</a>), insert a
     *         <code>RuleGroup</code> into a <code>WebACL</code> or delete a one
     *         from a <code>WebACL</code> (see <a>UpdateWebACL</a>), or delete a
     *         <code>RuleGroup</code> from AWS WAF (see <a>DeleteRuleGroup</a>).
     *         </p>
     *         <p>
     *         <code>RuleGroupId</code> is returned by <a>CreateRuleGroup</a>
     *         and by <a>ListRuleGroups</a>.
     *         </p>
     */
    public String getRuleGroupId() {
        return ruleGroupId;
    }

    /**
     * <p>
     * A unique identifier for a <code>RuleGroup</code>. You use
     * <code>RuleGroupId</code> to get more information about a
     * <code>RuleGroup</code> (see <a>GetRuleGroup</a>), update a
     * <code>RuleGroup</code> (see <a>UpdateRuleGroup</a>), insert a
     * <code>RuleGroup</code> into a <code>WebACL</code> or delete a one from a
     * <code>WebACL</code> (see <a>UpdateWebACL</a>), or delete a
     * <code>RuleGroup</code> from AWS WAF (see <a>DeleteRuleGroup</a>).
     * </p>
     * <p>
     * <code>RuleGroupId</code> is returned by <a>CreateRuleGroup</a> and by
     * <a>ListRuleGroups</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param ruleGroupId <p>
     *            A unique identifier for a <code>RuleGroup</code>. You use
     *            <code>RuleGroupId</code> to get more information about a
     *            <code>RuleGroup</code> (see <a>GetRuleGroup</a>), update a
     *            <code>RuleGroup</code> (see <a>UpdateRuleGroup</a>), insert a
     *            <code>RuleGroup</code> into a <code>WebACL</code> or delete a
     *            one from a <code>WebACL</code> (see <a>UpdateWebACL</a>), or
     *            delete a <code>RuleGroup</code> from AWS WAF (see
     *            <a>DeleteRuleGroup</a>).
     *            </p>
     *            <p>
     *            <code>RuleGroupId</code> is returned by <a>CreateRuleGroup</a>
     *            and by <a>ListRuleGroups</a>.
     *            </p>
     */
    public void setRuleGroupId(String ruleGroupId) {
        this.ruleGroupId = ruleGroupId;
    }

    /**
     * <p>
     * A unique identifier for a <code>RuleGroup</code>. You use
     * <code>RuleGroupId</code> to get more information about a
     * <code>RuleGroup</code> (see <a>GetRuleGroup</a>), update a
     * <code>RuleGroup</code> (see <a>UpdateRuleGroup</a>), insert a
     * <code>RuleGroup</code> into a <code>WebACL</code> or delete a one from a
     * <code>WebACL</code> (see <a>UpdateWebACL</a>), or delete a
     * <code>RuleGroup</code> from AWS WAF (see <a>DeleteRuleGroup</a>).
     * </p>
     * <p>
     * <code>RuleGroupId</code> is returned by <a>CreateRuleGroup</a> and by
     * <a>ListRuleGroups</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param ruleGroupId <p>
     *            A unique identifier for a <code>RuleGroup</code>. You use
     *            <code>RuleGroupId</code> to get more information about a
     *            <code>RuleGroup</code> (see <a>GetRuleGroup</a>), update a
     *            <code>RuleGroup</code> (see <a>UpdateRuleGroup</a>), insert a
     *            <code>RuleGroup</code> into a <code>WebACL</code> or delete a
     *            one from a <code>WebACL</code> (see <a>UpdateWebACL</a>), or
     *            delete a <code>RuleGroup</code> from AWS WAF (see
     *            <a>DeleteRuleGroup</a>).
     *            </p>
     *            <p>
     *            <code>RuleGroupId</code> is returned by <a>CreateRuleGroup</a>
     *            and by <a>ListRuleGroups</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RuleGroup withRuleGroupId(String ruleGroupId) {
        this.ruleGroupId = ruleGroupId;
        return this;
    }

    /**
     * <p>
     * The friendly name or description for the <code>RuleGroup</code>. You
     * can't change the name of a <code>RuleGroup</code> after you create it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The friendly name or description for the <code>RuleGroup</code>.
     *         You can't change the name of a <code>RuleGroup</code> after you
     *         create it.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The friendly name or description for the <code>RuleGroup</code>. You
     * can't change the name of a <code>RuleGroup</code> after you create it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param name <p>
     *            The friendly name or description for the
     *            <code>RuleGroup</code>. You can't change the name of a
     *            <code>RuleGroup</code> after you create it.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The friendly name or description for the <code>RuleGroup</code>. You
     * can't change the name of a <code>RuleGroup</code> after you create it.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param name <p>
     *            The friendly name or description for the
     *            <code>RuleGroup</code>. You can't change the name of a
     *            <code>RuleGroup</code> after you create it.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RuleGroup withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * A friendly name or description for the metrics for this
     * <code>RuleGroup</code>. The name can contain only alphanumeric characters
     * (A-Z, a-z, 0-9), with maximum length 128 and minimum length one. It can't
     * contain whitespace or metric names reserved for AWS WAF, including "All"
     * and "Default_Action." You can't change the name of the metric after you
     * create the <code>RuleGroup</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         A friendly name or description for the metrics for this
     *         <code>RuleGroup</code>. The name can contain only alphanumeric
     *         characters (A-Z, a-z, 0-9), with maximum length 128 and minimum
     *         length one. It can't contain whitespace or metric names reserved
     *         for AWS WAF, including "All" and "Default_Action." You can't
     *         change the name of the metric after you create the
     *         <code>RuleGroup</code>.
     *         </p>
     */
    public String getMetricName() {
        return metricName;
    }

    /**
     * <p>
     * A friendly name or description for the metrics for this
     * <code>RuleGroup</code>. The name can contain only alphanumeric characters
     * (A-Z, a-z, 0-9), with maximum length 128 and minimum length one. It can't
     * contain whitespace or metric names reserved for AWS WAF, including "All"
     * and "Default_Action." You can't change the name of the metric after you
     * create the <code>RuleGroup</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param metricName <p>
     *            A friendly name or description for the metrics for this
     *            <code>RuleGroup</code>. The name can contain only alphanumeric
     *            characters (A-Z, a-z, 0-9), with maximum length 128 and
     *            minimum length one. It can't contain whitespace or metric
     *            names reserved for AWS WAF, including "All" and
     *            "Default_Action." You can't change the name of the metric
     *            after you create the <code>RuleGroup</code>.
     *            </p>
     */
    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * A friendly name or description for the metrics for this
     * <code>RuleGroup</code>. The name can contain only alphanumeric characters
     * (A-Z, a-z, 0-9), with maximum length 128 and minimum length one. It can't
     * contain whitespace or metric names reserved for AWS WAF, including "All"
     * and "Default_Action." You can't change the name of the metric after you
     * create the <code>RuleGroup</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param metricName <p>
     *            A friendly name or description for the metrics for this
     *            <code>RuleGroup</code>. The name can contain only alphanumeric
     *            characters (A-Z, a-z, 0-9), with maximum length 128 and
     *            minimum length one. It can't contain whitespace or metric
     *            names reserved for AWS WAF, including "All" and
     *            "Default_Action." You can't change the name of the metric
     *            after you create the <code>RuleGroup</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RuleGroup withMetricName(String metricName) {
        this.metricName = metricName;
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
        if (getRuleGroupId() != null)
            sb.append("RuleGroupId: " + getRuleGroupId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getMetricName() != null)
            sb.append("MetricName: " + getMetricName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRuleGroupId() == null) ? 0 : getRuleGroupId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RuleGroup == false)
            return false;
        RuleGroup other = (RuleGroup) obj;

        if (other.getRuleGroupId() == null ^ this.getRuleGroupId() == null)
            return false;
        if (other.getRuleGroupId() != null
                && other.getRuleGroupId().equals(this.getRuleGroupId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null
                && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        return true;
    }
}
