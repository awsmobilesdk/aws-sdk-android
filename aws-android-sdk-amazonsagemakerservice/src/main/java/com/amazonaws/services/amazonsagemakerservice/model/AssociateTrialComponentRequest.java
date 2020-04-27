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

package com.amazonaws.services.amazonsagemakerservice.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Associates a trial component with a trial. A trial component can be
 * associated with multiple trials. To disassociate a trial component from a
 * trial, call the <a>DisassociateTrialComponent</a> API.
 * </p>
 */
public class AssociateTrialComponentRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the component to associated with the trial.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String trialComponentName;

    /**
     * <p>
     * The name of the trial to associate with.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String trialName;

    /**
     * <p>
     * The name of the component to associated with the trial.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The name of the component to associated with the trial.
     *         </p>
     */
    public String getTrialComponentName() {
        return trialComponentName;
    }

    /**
     * <p>
     * The name of the component to associated with the trial.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param trialComponentName <p>
     *            The name of the component to associated with the trial.
     *            </p>
     */
    public void setTrialComponentName(String trialComponentName) {
        this.trialComponentName = trialComponentName;
    }

    /**
     * <p>
     * The name of the component to associated with the trial.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param trialComponentName <p>
     *            The name of the component to associated with the trial.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateTrialComponentRequest withTrialComponentName(String trialComponentName) {
        this.trialComponentName = trialComponentName;
        return this;
    }

    /**
     * <p>
     * The name of the trial to associate with.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The name of the trial to associate with.
     *         </p>
     */
    public String getTrialName() {
        return trialName;
    }

    /**
     * <p>
     * The name of the trial to associate with.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param trialName <p>
     *            The name of the trial to associate with.
     *            </p>
     */
    public void setTrialName(String trialName) {
        this.trialName = trialName;
    }

    /**
     * <p>
     * The name of the trial to associate with.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param trialName <p>
     *            The name of the trial to associate with.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateTrialComponentRequest withTrialName(String trialName) {
        this.trialName = trialName;
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
        if (getTrialComponentName() != null)
            sb.append("TrialComponentName: " + getTrialComponentName() + ",");
        if (getTrialName() != null)
            sb.append("TrialName: " + getTrialName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTrialComponentName() == null) ? 0 : getTrialComponentName().hashCode());
        hashCode = prime * hashCode + ((getTrialName() == null) ? 0 : getTrialName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateTrialComponentRequest == false)
            return false;
        AssociateTrialComponentRequest other = (AssociateTrialComponentRequest) obj;

        if (other.getTrialComponentName() == null ^ this.getTrialComponentName() == null)
            return false;
        if (other.getTrialComponentName() != null
                && other.getTrialComponentName().equals(this.getTrialComponentName()) == false)
            return false;
        if (other.getTrialName() == null ^ this.getTrialName() == null)
            return false;
        if (other.getTrialName() != null
                && other.getTrialName().equals(this.getTrialName()) == false)
            return false;
        return true;
    }
}
