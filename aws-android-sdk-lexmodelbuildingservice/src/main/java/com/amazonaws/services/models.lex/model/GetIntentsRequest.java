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

package com.amazonaws.services.models.lex.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns intent information as follows:
 * </p>
 * <ul>
 * <li>
 * <p>
 * If you specify the <code>nameContains</code> field, returns the
 * <code>$LATEST</code> version of all intents that contain the specified
 * string.
 * </p>
 * </li>
 * <li>
 * <p>
 * If you don't specify the <code>nameContains</code> field, returns information
 * about the <code>$LATEST</code> version of all intents.
 * </p>
 * </li>
 * </ul>
 * <p>
 * The operation requires permission for the <code>lex:GetIntents</code> action.
 * </p>
 */
public class GetIntentsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A pagination token that fetches the next page of intents. If the response
     * to this API call is truncated, Amazon Lex returns a pagination token in
     * the response. To fetch the next page of intents, specify the pagination
     * token in the next request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of intents to return in the response. The default is
     * 10.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * Substring to match in intent names. An intent will be returned if any
     * part of its name matches the substring. For example, "xyz" matches both
     * "xyzabc" and "abcxyz."
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     */
    private String nameContains;

    /**
     * <p>
     * A pagination token that fetches the next page of intents. If the response
     * to this API call is truncated, Amazon Lex returns a pagination token in
     * the response. To fetch the next page of intents, specify the pagination
     * token in the next request.
     * </p>
     *
     * @return <p>
     *         A pagination token that fetches the next page of intents. If the
     *         response to this API call is truncated, Amazon Lex returns a
     *         pagination token in the response. To fetch the next page of
     *         intents, specify the pagination token in the next request.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A pagination token that fetches the next page of intents. If the response
     * to this API call is truncated, Amazon Lex returns a pagination token in
     * the response. To fetch the next page of intents, specify the pagination
     * token in the next request.
     * </p>
     *
     * @param nextToken <p>
     *            A pagination token that fetches the next page of intents. If
     *            the response to this API call is truncated, Amazon Lex returns
     *            a pagination token in the response. To fetch the next page of
     *            intents, specify the pagination token in the next request.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token that fetches the next page of intents. If the response
     * to this API call is truncated, Amazon Lex returns a pagination token in
     * the response. To fetch the next page of intents, specify the pagination
     * token in the next request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A pagination token that fetches the next page of intents. If
     *            the response to this API call is truncated, Amazon Lex returns
     *            a pagination token in the response. To fetch the next page of
     *            intents, specify the pagination token in the next request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetIntentsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of intents to return in the response. The default is
     * 10.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @return <p>
     *         The maximum number of intents to return in the response. The
     *         default is 10.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of intents to return in the response. The default is
     * 10.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @param maxResults <p>
     *            The maximum number of intents to return in the response. The
     *            default is 10.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of intents to return in the response. The default is
     * 10.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @param maxResults <p>
     *            The maximum number of intents to return in the response. The
     *            default is 10.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetIntentsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * Substring to match in intent names. An intent will be returned if any
     * part of its name matches the substring. For example, "xyz" matches both
     * "xyzabc" and "abcxyz."
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     *
     * @return <p>
     *         Substring to match in intent names. An intent will be returned if
     *         any part of its name matches the substring. For example, "xyz"
     *         matches both "xyzabc" and "abcxyz."
     *         </p>
     */
    public String getNameContains() {
        return nameContains;
    }

    /**
     * <p>
     * Substring to match in intent names. An intent will be returned if any
     * part of its name matches the substring. For example, "xyz" matches both
     * "xyzabc" and "abcxyz."
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     *
     * @param nameContains <p>
     *            Substring to match in intent names. An intent will be returned
     *            if any part of its name matches the substring. For example,
     *            "xyz" matches both "xyzabc" and "abcxyz."
     *            </p>
     */
    public void setNameContains(String nameContains) {
        this.nameContains = nameContains;
    }

    /**
     * <p>
     * Substring to match in intent names. An intent will be returned if any
     * part of its name matches the substring. For example, "xyz" matches both
     * "xyzabc" and "abcxyz."
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     *
     * @param nameContains <p>
     *            Substring to match in intent names. An intent will be returned
     *            if any part of its name matches the substring. For example,
     *            "xyz" matches both "xyzabc" and "abcxyz."
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetIntentsRequest withNameContains(String nameContains) {
        this.nameContains = nameContains;
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
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("maxResults: " + getMaxResults() + ",");
        if (getNameContains() != null)
            sb.append("nameContains: " + getNameContains());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode
                + ((getNameContains() == null) ? 0 : getNameContains().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetIntentsRequest == false)
            return false;
        GetIntentsRequest other = (GetIntentsRequest) obj;

        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNameContains() == null ^ this.getNameContains() == null)
            return false;
        if (other.getNameContains() != null
                && other.getNameContains().equals(this.getNameContains()) == false)
            return false;
        return true;
    }
}
