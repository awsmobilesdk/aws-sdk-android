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

/**
 * <p>
 * A previously completed or stopped hyperparameter tuning job to be used as a
 * starting point for a new hyperparameter tuning job.
 * </p>
 */
public class ParentHyperParameterTuningJob implements Serializable {
    /**
     * <p>
     * The name of the hyperparameter tuning job to be used as a starting point
     * for a new hyperparameter tuning job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String hyperParameterTuningJobName;

    /**
     * <p>
     * The name of the hyperparameter tuning job to be used as a starting point
     * for a new hyperparameter tuning job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The name of the hyperparameter tuning job to be used as a
     *         starting point for a new hyperparameter tuning job.
     *         </p>
     */
    public String getHyperParameterTuningJobName() {
        return hyperParameterTuningJobName;
    }

    /**
     * <p>
     * The name of the hyperparameter tuning job to be used as a starting point
     * for a new hyperparameter tuning job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param hyperParameterTuningJobName <p>
     *            The name of the hyperparameter tuning job to be used as a
     *            starting point for a new hyperparameter tuning job.
     *            </p>
     */
    public void setHyperParameterTuningJobName(String hyperParameterTuningJobName) {
        this.hyperParameterTuningJobName = hyperParameterTuningJobName;
    }

    /**
     * <p>
     * The name of the hyperparameter tuning job to be used as a starting point
     * for a new hyperparameter tuning job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param hyperParameterTuningJobName <p>
     *            The name of the hyperparameter tuning job to be used as a
     *            starting point for a new hyperparameter tuning job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ParentHyperParameterTuningJob withHyperParameterTuningJobName(
            String hyperParameterTuningJobName) {
        this.hyperParameterTuningJobName = hyperParameterTuningJobName;
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
        if (getHyperParameterTuningJobName() != null)
            sb.append("HyperParameterTuningJobName: " + getHyperParameterTuningJobName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getHyperParameterTuningJobName() == null) ? 0
                        : getHyperParameterTuningJobName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ParentHyperParameterTuningJob == false)
            return false;
        ParentHyperParameterTuningJob other = (ParentHyperParameterTuningJob) obj;

        if (other.getHyperParameterTuningJobName() == null
                ^ this.getHyperParameterTuningJobName() == null)
            return false;
        if (other.getHyperParameterTuningJobName() != null
                && other.getHyperParameterTuningJobName().equals(
                        this.getHyperParameterTuningJobName()) == false)
            return false;
        return true;
    }
}
