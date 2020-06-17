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

package com.amazonaws.services.route53.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Gets information about the traffic policy instances that you created in a
 * specified hosted zone.
 * </p>
 * <note>
 * <p>
 * After you submit a <code>CreateTrafficPolicyInstance</code> or an
 * <code>UpdateTrafficPolicyInstance</code> request, there's a brief delay while
 * Amazon Route 53 creates the resource record sets that are specified in the
 * traffic policy definition. For more information, see the <code>State</code>
 * response element.
 * </p>
 * </note>
 * <p>
 * Route 53 returns a maximum of 100 items in each response. If you have a lot
 * of traffic policy instances, you can use the <code>MaxItems</code> parameter
 * to list them in groups of up to 100.
 * </p>
 */
public class ListTrafficPolicyInstancesByHostedZoneRequest extends AmazonWebServiceRequest
        implements Serializable {
    /**
     * <p>
     * The ID of the hosted zone that you want to list traffic policy instances
     * for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     */
    private String hostedZoneId;

    /**
     * <p>
     * If the value of <code>IsTruncated</code> in the previous response is
     * true, you have more traffic policy instances. To get more traffic policy
     * instances, submit another <code>ListTrafficPolicyInstances</code>
     * request. For the value of <code>trafficpolicyinstancename</code>, specify
     * the value of <code>TrafficPolicyInstanceNameMarker</code> from the
     * previous response, which is the name of the first traffic policy instance
     * in the next group of traffic policy instances.
     * </p>
     * <p>
     * If the value of <code>IsTruncated</code> in the previous response was
     * <code>false</code>, there are no more traffic policy instances to get.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String trafficPolicyInstanceNameMarker;

    /**
     * <p>
     * If the value of <code>IsTruncated</code> in the previous response is
     * true, you have more traffic policy instances. To get more traffic policy
     * instances, submit another <code>ListTrafficPolicyInstances</code>
     * request. For the value of <code>trafficpolicyinstancetype</code>, specify
     * the value of <code>TrafficPolicyInstanceTypeMarker</code> from the
     * previous response, which is the type of the first traffic policy instance
     * in the next group of traffic policy instances.
     * </p>
     * <p>
     * If the value of <code>IsTruncated</code> in the previous response was
     * <code>false</code>, there are no more traffic policy instances to get.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, NAPTR, PTR, SRV, SPF,
     * AAAA, CAA
     */
    private String trafficPolicyInstanceTypeMarker;

    /**
     * <p>
     * The maximum number of traffic policy instances to be included in the
     * response body for this request. If you have more than
     * <code>MaxItems</code> traffic policy instances, the value of the
     * <code>IsTruncated</code> element in the response is <code>true</code>,
     * and the values of <code>HostedZoneIdMarker</code>,
     * <code>TrafficPolicyInstanceNameMarker</code>, and
     * <code>TrafficPolicyInstanceTypeMarker</code> represent the first traffic
     * policy instance that Amazon Route 53 will return if you submit another
     * request.
     * </p>
     */
    private String maxItems;

    /**
     * <p>
     * The ID of the hosted zone that you want to list traffic policy instances
     * for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @return <p>
     *         The ID of the hosted zone that you want to list traffic policy
     *         instances for.
     *         </p>
     */
    public String getHostedZoneId() {
        return hostedZoneId;
    }

    /**
     * <p>
     * The ID of the hosted zone that you want to list traffic policy instances
     * for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @param hostedZoneId <p>
     *            The ID of the hosted zone that you want to list traffic policy
     *            instances for.
     *            </p>
     */
    public void setHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
    }

    /**
     * <p>
     * The ID of the hosted zone that you want to list traffic policy instances
     * for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @param hostedZoneId <p>
     *            The ID of the hosted zone that you want to list traffic policy
     *            instances for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTrafficPolicyInstancesByHostedZoneRequest withHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
        return this;
    }

    /**
     * <p>
     * If the value of <code>IsTruncated</code> in the previous response is
     * true, you have more traffic policy instances. To get more traffic policy
     * instances, submit another <code>ListTrafficPolicyInstances</code>
     * request. For the value of <code>trafficpolicyinstancename</code>, specify
     * the value of <code>TrafficPolicyInstanceNameMarker</code> from the
     * previous response, which is the name of the first traffic policy instance
     * in the next group of traffic policy instances.
     * </p>
     * <p>
     * If the value of <code>IsTruncated</code> in the previous response was
     * <code>false</code>, there are no more traffic policy instances to get.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p>
     *         If the value of <code>IsTruncated</code> in the previous response
     *         is true, you have more traffic policy instances. To get more
     *         traffic policy instances, submit another
     *         <code>ListTrafficPolicyInstances</code> request. For the value of
     *         <code>trafficpolicyinstancename</code>, specify the value of
     *         <code>TrafficPolicyInstanceNameMarker</code> from the previous
     *         response, which is the name of the first traffic policy instance
     *         in the next group of traffic policy instances.
     *         </p>
     *         <p>
     *         If the value of <code>IsTruncated</code> in the previous response
     *         was <code>false</code>, there are no more traffic policy
     *         instances to get.
     *         </p>
     */
    public String getTrafficPolicyInstanceNameMarker() {
        return trafficPolicyInstanceNameMarker;
    }

    /**
     * <p>
     * If the value of <code>IsTruncated</code> in the previous response is
     * true, you have more traffic policy instances. To get more traffic policy
     * instances, submit another <code>ListTrafficPolicyInstances</code>
     * request. For the value of <code>trafficpolicyinstancename</code>, specify
     * the value of <code>TrafficPolicyInstanceNameMarker</code> from the
     * previous response, which is the name of the first traffic policy instance
     * in the next group of traffic policy instances.
     * </p>
     * <p>
     * If the value of <code>IsTruncated</code> in the previous response was
     * <code>false</code>, there are no more traffic policy instances to get.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param trafficPolicyInstanceNameMarker <p>
     *            If the value of <code>IsTruncated</code> in the previous
     *            response is true, you have more traffic policy instances. To
     *            get more traffic policy instances, submit another
     *            <code>ListTrafficPolicyInstances</code> request. For the value
     *            of <code>trafficpolicyinstancename</code>, specify the value
     *            of <code>TrafficPolicyInstanceNameMarker</code> from the
     *            previous response, which is the name of the first traffic
     *            policy instance in the next group of traffic policy instances.
     *            </p>
     *            <p>
     *            If the value of <code>IsTruncated</code> in the previous
     *            response was <code>false</code>, there are no more traffic
     *            policy instances to get.
     *            </p>
     */
    public void setTrafficPolicyInstanceNameMarker(String trafficPolicyInstanceNameMarker) {
        this.trafficPolicyInstanceNameMarker = trafficPolicyInstanceNameMarker;
    }

    /**
     * <p>
     * If the value of <code>IsTruncated</code> in the previous response is
     * true, you have more traffic policy instances. To get more traffic policy
     * instances, submit another <code>ListTrafficPolicyInstances</code>
     * request. For the value of <code>trafficpolicyinstancename</code>, specify
     * the value of <code>TrafficPolicyInstanceNameMarker</code> from the
     * previous response, which is the name of the first traffic policy instance
     * in the next group of traffic policy instances.
     * </p>
     * <p>
     * If the value of <code>IsTruncated</code> in the previous response was
     * <code>false</code>, there are no more traffic policy instances to get.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param trafficPolicyInstanceNameMarker <p>
     *            If the value of <code>IsTruncated</code> in the previous
     *            response is true, you have more traffic policy instances. To
     *            get more traffic policy instances, submit another
     *            <code>ListTrafficPolicyInstances</code> request. For the value
     *            of <code>trafficpolicyinstancename</code>, specify the value
     *            of <code>TrafficPolicyInstanceNameMarker</code> from the
     *            previous response, which is the name of the first traffic
     *            policy instance in the next group of traffic policy instances.
     *            </p>
     *            <p>
     *            If the value of <code>IsTruncated</code> in the previous
     *            response was <code>false</code>, there are no more traffic
     *            policy instances to get.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTrafficPolicyInstancesByHostedZoneRequest withTrafficPolicyInstanceNameMarker(
            String trafficPolicyInstanceNameMarker) {
        this.trafficPolicyInstanceNameMarker = trafficPolicyInstanceNameMarker;
        return this;
    }

    /**
     * <p>
     * If the value of <code>IsTruncated</code> in the previous response is
     * true, you have more traffic policy instances. To get more traffic policy
     * instances, submit another <code>ListTrafficPolicyInstances</code>
     * request. For the value of <code>trafficpolicyinstancetype</code>, specify
     * the value of <code>TrafficPolicyInstanceTypeMarker</code> from the
     * previous response, which is the type of the first traffic policy instance
     * in the next group of traffic policy instances.
     * </p>
     * <p>
     * If the value of <code>IsTruncated</code> in the previous response was
     * <code>false</code>, there are no more traffic policy instances to get.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, NAPTR, PTR, SRV, SPF,
     * AAAA, CAA
     *
     * @return <p>
     *         If the value of <code>IsTruncated</code> in the previous response
     *         is true, you have more traffic policy instances. To get more
     *         traffic policy instances, submit another
     *         <code>ListTrafficPolicyInstances</code> request. For the value of
     *         <code>trafficpolicyinstancetype</code>, specify the value of
     *         <code>TrafficPolicyInstanceTypeMarker</code> from the previous
     *         response, which is the type of the first traffic policy instance
     *         in the next group of traffic policy instances.
     *         </p>
     *         <p>
     *         If the value of <code>IsTruncated</code> in the previous response
     *         was <code>false</code>, there are no more traffic policy
     *         instances to get.
     *         </p>
     * @see RRType
     */
    public String getTrafficPolicyInstanceTypeMarker() {
        return trafficPolicyInstanceTypeMarker;
    }

    /**
     * <p>
     * If the value of <code>IsTruncated</code> in the previous response is
     * true, you have more traffic policy instances. To get more traffic policy
     * instances, submit another <code>ListTrafficPolicyInstances</code>
     * request. For the value of <code>trafficpolicyinstancetype</code>, specify
     * the value of <code>TrafficPolicyInstanceTypeMarker</code> from the
     * previous response, which is the type of the first traffic policy instance
     * in the next group of traffic policy instances.
     * </p>
     * <p>
     * If the value of <code>IsTruncated</code> in the previous response was
     * <code>false</code>, there are no more traffic policy instances to get.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, NAPTR, PTR, SRV, SPF,
     * AAAA, CAA
     *
     * @param trafficPolicyInstanceTypeMarker <p>
     *            If the value of <code>IsTruncated</code> in the previous
     *            response is true, you have more traffic policy instances. To
     *            get more traffic policy instances, submit another
     *            <code>ListTrafficPolicyInstances</code> request. For the value
     *            of <code>trafficpolicyinstancetype</code>, specify the value
     *            of <code>TrafficPolicyInstanceTypeMarker</code> from the
     *            previous response, which is the type of the first traffic
     *            policy instance in the next group of traffic policy instances.
     *            </p>
     *            <p>
     *            If the value of <code>IsTruncated</code> in the previous
     *            response was <code>false</code>, there are no more traffic
     *            policy instances to get.
     *            </p>
     * @see RRType
     */
    public void setTrafficPolicyInstanceTypeMarker(String trafficPolicyInstanceTypeMarker) {
        this.trafficPolicyInstanceTypeMarker = trafficPolicyInstanceTypeMarker;
    }

    /**
     * <p>
     * If the value of <code>IsTruncated</code> in the previous response is
     * true, you have more traffic policy instances. To get more traffic policy
     * instances, submit another <code>ListTrafficPolicyInstances</code>
     * request. For the value of <code>trafficpolicyinstancetype</code>, specify
     * the value of <code>TrafficPolicyInstanceTypeMarker</code> from the
     * previous response, which is the type of the first traffic policy instance
     * in the next group of traffic policy instances.
     * </p>
     * <p>
     * If the value of <code>IsTruncated</code> in the previous response was
     * <code>false</code>, there are no more traffic policy instances to get.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, NAPTR, PTR, SRV, SPF,
     * AAAA, CAA
     *
     * @param trafficPolicyInstanceTypeMarker <p>
     *            If the value of <code>IsTruncated</code> in the previous
     *            response is true, you have more traffic policy instances. To
     *            get more traffic policy instances, submit another
     *            <code>ListTrafficPolicyInstances</code> request. For the value
     *            of <code>trafficpolicyinstancetype</code>, specify the value
     *            of <code>TrafficPolicyInstanceTypeMarker</code> from the
     *            previous response, which is the type of the first traffic
     *            policy instance in the next group of traffic policy instances.
     *            </p>
     *            <p>
     *            If the value of <code>IsTruncated</code> in the previous
     *            response was <code>false</code>, there are no more traffic
     *            policy instances to get.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RRType
     */
    public ListTrafficPolicyInstancesByHostedZoneRequest withTrafficPolicyInstanceTypeMarker(
            String trafficPolicyInstanceTypeMarker) {
        this.trafficPolicyInstanceTypeMarker = trafficPolicyInstanceTypeMarker;
        return this;
    }

    /**
     * <p>
     * If the value of <code>IsTruncated</code> in the previous response is
     * true, you have more traffic policy instances. To get more traffic policy
     * instances, submit another <code>ListTrafficPolicyInstances</code>
     * request. For the value of <code>trafficpolicyinstancetype</code>, specify
     * the value of <code>TrafficPolicyInstanceTypeMarker</code> from the
     * previous response, which is the type of the first traffic policy instance
     * in the next group of traffic policy instances.
     * </p>
     * <p>
     * If the value of <code>IsTruncated</code> in the previous response was
     * <code>false</code>, there are no more traffic policy instances to get.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, NAPTR, PTR, SRV, SPF,
     * AAAA, CAA
     *
     * @param trafficPolicyInstanceTypeMarker <p>
     *            If the value of <code>IsTruncated</code> in the previous
     *            response is true, you have more traffic policy instances. To
     *            get more traffic policy instances, submit another
     *            <code>ListTrafficPolicyInstances</code> request. For the value
     *            of <code>trafficpolicyinstancetype</code>, specify the value
     *            of <code>TrafficPolicyInstanceTypeMarker</code> from the
     *            previous response, which is the type of the first traffic
     *            policy instance in the next group of traffic policy instances.
     *            </p>
     *            <p>
     *            If the value of <code>IsTruncated</code> in the previous
     *            response was <code>false</code>, there are no more traffic
     *            policy instances to get.
     *            </p>
     * @see RRType
     */
    public void setTrafficPolicyInstanceTypeMarker(RRType trafficPolicyInstanceTypeMarker) {
        this.trafficPolicyInstanceTypeMarker = trafficPolicyInstanceTypeMarker.toString();
    }

    /**
     * <p>
     * If the value of <code>IsTruncated</code> in the previous response is
     * true, you have more traffic policy instances. To get more traffic policy
     * instances, submit another <code>ListTrafficPolicyInstances</code>
     * request. For the value of <code>trafficpolicyinstancetype</code>, specify
     * the value of <code>TrafficPolicyInstanceTypeMarker</code> from the
     * previous response, which is the type of the first traffic policy instance
     * in the next group of traffic policy instances.
     * </p>
     * <p>
     * If the value of <code>IsTruncated</code> in the previous response was
     * <code>false</code>, there are no more traffic policy instances to get.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, NAPTR, PTR, SRV, SPF,
     * AAAA, CAA
     *
     * @param trafficPolicyInstanceTypeMarker <p>
     *            If the value of <code>IsTruncated</code> in the previous
     *            response is true, you have more traffic policy instances. To
     *            get more traffic policy instances, submit another
     *            <code>ListTrafficPolicyInstances</code> request. For the value
     *            of <code>trafficpolicyinstancetype</code>, specify the value
     *            of <code>TrafficPolicyInstanceTypeMarker</code> from the
     *            previous response, which is the type of the first traffic
     *            policy instance in the next group of traffic policy instances.
     *            </p>
     *            <p>
     *            If the value of <code>IsTruncated</code> in the previous
     *            response was <code>false</code>, there are no more traffic
     *            policy instances to get.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RRType
     */
    public ListTrafficPolicyInstancesByHostedZoneRequest withTrafficPolicyInstanceTypeMarker(
            RRType trafficPolicyInstanceTypeMarker) {
        this.trafficPolicyInstanceTypeMarker = trafficPolicyInstanceTypeMarker.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of traffic policy instances to be included in the
     * response body for this request. If you have more than
     * <code>MaxItems</code> traffic policy instances, the value of the
     * <code>IsTruncated</code> element in the response is <code>true</code>,
     * and the values of <code>HostedZoneIdMarker</code>,
     * <code>TrafficPolicyInstanceNameMarker</code>, and
     * <code>TrafficPolicyInstanceTypeMarker</code> represent the first traffic
     * policy instance that Amazon Route 53 will return if you submit another
     * request.
     * </p>
     *
     * @return <p>
     *         The maximum number of traffic policy instances to be included in
     *         the response body for this request. If you have more than
     *         <code>MaxItems</code> traffic policy instances, the value of the
     *         <code>IsTruncated</code> element in the response is
     *         <code>true</code>, and the values of
     *         <code>HostedZoneIdMarker</code>,
     *         <code>TrafficPolicyInstanceNameMarker</code>, and
     *         <code>TrafficPolicyInstanceTypeMarker</code> represent the first
     *         traffic policy instance that Amazon Route 53 will return if you
     *         submit another request.
     *         </p>
     */
    public String getMaxItems() {
        return maxItems;
    }

    /**
     * <p>
     * The maximum number of traffic policy instances to be included in the
     * response body for this request. If you have more than
     * <code>MaxItems</code> traffic policy instances, the value of the
     * <code>IsTruncated</code> element in the response is <code>true</code>,
     * and the values of <code>HostedZoneIdMarker</code>,
     * <code>TrafficPolicyInstanceNameMarker</code>, and
     * <code>TrafficPolicyInstanceTypeMarker</code> represent the first traffic
     * policy instance that Amazon Route 53 will return if you submit another
     * request.
     * </p>
     *
     * @param maxItems <p>
     *            The maximum number of traffic policy instances to be included
     *            in the response body for this request. If you have more than
     *            <code>MaxItems</code> traffic policy instances, the value of
     *            the <code>IsTruncated</code> element in the response is
     *            <code>true</code>, and the values of
     *            <code>HostedZoneIdMarker</code>,
     *            <code>TrafficPolicyInstanceNameMarker</code>, and
     *            <code>TrafficPolicyInstanceTypeMarker</code> represent the
     *            first traffic policy instance that Amazon Route 53 will return
     *            if you submit another request.
     *            </p>
     */
    public void setMaxItems(String maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * The maximum number of traffic policy instances to be included in the
     * response body for this request. If you have more than
     * <code>MaxItems</code> traffic policy instances, the value of the
     * <code>IsTruncated</code> element in the response is <code>true</code>,
     * and the values of <code>HostedZoneIdMarker</code>,
     * <code>TrafficPolicyInstanceNameMarker</code>, and
     * <code>TrafficPolicyInstanceTypeMarker</code> represent the first traffic
     * policy instance that Amazon Route 53 will return if you submit another
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxItems <p>
     *            The maximum number of traffic policy instances to be included
     *            in the response body for this request. If you have more than
     *            <code>MaxItems</code> traffic policy instances, the value of
     *            the <code>IsTruncated</code> element in the response is
     *            <code>true</code>, and the values of
     *            <code>HostedZoneIdMarker</code>,
     *            <code>TrafficPolicyInstanceNameMarker</code>, and
     *            <code>TrafficPolicyInstanceTypeMarker</code> represent the
     *            first traffic policy instance that Amazon Route 53 will return
     *            if you submit another request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTrafficPolicyInstancesByHostedZoneRequest withMaxItems(String maxItems) {
        this.maxItems = maxItems;
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
        if (getHostedZoneId() != null)
            sb.append("HostedZoneId: " + getHostedZoneId() + ",");
        if (getTrafficPolicyInstanceNameMarker() != null)
            sb.append("TrafficPolicyInstanceNameMarker: " + getTrafficPolicyInstanceNameMarker()
                    + ",");
        if (getTrafficPolicyInstanceTypeMarker() != null)
            sb.append("TrafficPolicyInstanceTypeMarker: " + getTrafficPolicyInstanceTypeMarker()
                    + ",");
        if (getMaxItems() != null)
            sb.append("MaxItems: " + getMaxItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getHostedZoneId() == null) ? 0 : getHostedZoneId().hashCode());
        hashCode = prime
                * hashCode
                + ((getTrafficPolicyInstanceNameMarker() == null) ? 0
                        : getTrafficPolicyInstanceNameMarker().hashCode());
        hashCode = prime
                * hashCode
                + ((getTrafficPolicyInstanceTypeMarker() == null) ? 0
                        : getTrafficPolicyInstanceTypeMarker().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTrafficPolicyInstancesByHostedZoneRequest == false)
            return false;
        ListTrafficPolicyInstancesByHostedZoneRequest other = (ListTrafficPolicyInstancesByHostedZoneRequest) obj;

        if (other.getHostedZoneId() == null ^ this.getHostedZoneId() == null)
            return false;
        if (other.getHostedZoneId() != null
                && other.getHostedZoneId().equals(this.getHostedZoneId()) == false)
            return false;
        if (other.getTrafficPolicyInstanceNameMarker() == null
                ^ this.getTrafficPolicyInstanceNameMarker() == null)
            return false;
        if (other.getTrafficPolicyInstanceNameMarker() != null
                && other.getTrafficPolicyInstanceNameMarker().equals(
                        this.getTrafficPolicyInstanceNameMarker()) == false)
            return false;
        if (other.getTrafficPolicyInstanceTypeMarker() == null
                ^ this.getTrafficPolicyInstanceTypeMarker() == null)
            return false;
        if (other.getTrafficPolicyInstanceTypeMarker() != null
                && other.getTrafficPolicyInstanceTypeMarker().equals(
                        this.getTrafficPolicyInstanceTypeMarker()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        return true;
    }
}
