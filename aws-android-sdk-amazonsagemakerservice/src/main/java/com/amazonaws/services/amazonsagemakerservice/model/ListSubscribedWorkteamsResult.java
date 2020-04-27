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

public class ListSubscribedWorkteamsResult implements Serializable {
    /**
     * <p>
     * An array of <code>Workteam</code> objects, each describing a work team.
     * </p>
     */
    private java.util.List<SubscribedWorkteam> subscribedWorkteams;

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To
     * retrieve the next set of work teams, use it in the subsequent request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String nextToken;

    /**
     * <p>
     * An array of <code>Workteam</code> objects, each describing a work team.
     * </p>
     *
     * @return <p>
     *         An array of <code>Workteam</code> objects, each describing a work
     *         team.
     *         </p>
     */
    public java.util.List<SubscribedWorkteam> getSubscribedWorkteams() {
        return subscribedWorkteams;
    }

    /**
     * <p>
     * An array of <code>Workteam</code> objects, each describing a work team.
     * </p>
     *
     * @param subscribedWorkteams <p>
     *            An array of <code>Workteam</code> objects, each describing a
     *            work team.
     *            </p>
     */
    public void setSubscribedWorkteams(java.util.Collection<SubscribedWorkteam> subscribedWorkteams) {
        if (subscribedWorkteams == null) {
            this.subscribedWorkteams = null;
            return;
        }

        this.subscribedWorkteams = new java.util.ArrayList<SubscribedWorkteam>(subscribedWorkteams);
    }

    /**
     * <p>
     * An array of <code>Workteam</code> objects, each describing a work team.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subscribedWorkteams <p>
     *            An array of <code>Workteam</code> objects, each describing a
     *            work team.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListSubscribedWorkteamsResult withSubscribedWorkteams(
            SubscribedWorkteam... subscribedWorkteams) {
        if (getSubscribedWorkteams() == null) {
            this.subscribedWorkteams = new java.util.ArrayList<SubscribedWorkteam>(
                    subscribedWorkteams.length);
        }
        for (SubscribedWorkteam value : subscribedWorkteams) {
            this.subscribedWorkteams.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>Workteam</code> objects, each describing a work team.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subscribedWorkteams <p>
     *            An array of <code>Workteam</code> objects, each describing a
     *            work team.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListSubscribedWorkteamsResult withSubscribedWorkteams(
            java.util.Collection<SubscribedWorkteam> subscribedWorkteams) {
        setSubscribedWorkteams(subscribedWorkteams);
        return this;
    }

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To
     * retrieve the next set of work teams, use it in the subsequent request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         If the response is truncated, Amazon SageMaker returns this
     *         token. To retrieve the next set of work teams, use it in the
     *         subsequent request.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To
     * retrieve the next set of work teams, use it in the subsequent request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param nextToken <p>
     *            If the response is truncated, Amazon SageMaker returns this
     *            token. To retrieve the next set of work teams, use it in the
     *            subsequent request.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To
     * retrieve the next set of work teams, use it in the subsequent request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param nextToken <p>
     *            If the response is truncated, Amazon SageMaker returns this
     *            token. To retrieve the next set of work teams, use it in the
     *            subsequent request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListSubscribedWorkteamsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getSubscribedWorkteams() != null)
            sb.append("SubscribedWorkteams: " + getSubscribedWorkteams() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSubscribedWorkteams() == null) ? 0 : getSubscribedWorkteams().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSubscribedWorkteamsResult == false)
            return false;
        ListSubscribedWorkteamsResult other = (ListSubscribedWorkteamsResult) obj;

        if (other.getSubscribedWorkteams() == null ^ this.getSubscribedWorkteams() == null)
            return false;
        if (other.getSubscribedWorkteams() != null
                && other.getSubscribedWorkteams().equals(this.getSubscribedWorkteams()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
