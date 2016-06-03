/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.cognitoidentityprovider.AmazonCognitoIdentityProvider#listUserPools(ListUserPoolsRequest) ListUserPools operation}.
 * <p>
 * Lists the user pools associated with an AWS account.
 * </p>
 *
 * @see com.amazonaws.services.cognitoidentityprovider.AmazonCognitoIdentityProvider#listUserPools(ListUserPoolsRequest)
 */
public class ListUserPoolsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * An identifier that was returned from the previous call to this
     * operation, which can be used to return the next set of items in the
     * list.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[\S]+<br/>
     */
    private String nextToken;

    /**
     * The maximum number of results you want the request to return when
     * listing the user pools.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 60<br/>
     */
    private Integer maxResults;

    /**
     * An identifier that was returned from the previous call to this
     * operation, which can be used to return the next set of items in the
     * list.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @return An identifier that was returned from the previous call to this
     *         operation, which can be used to return the next set of items in the
     *         list.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * An identifier that was returned from the previous call to this
     * operation, which can be used to return the next set of items in the
     * list.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @param nextToken An identifier that was returned from the previous call to this
     *         operation, which can be used to return the next set of items in the
     *         list.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * An identifier that was returned from the previous call to this
     * operation, which can be used to return the next set of items in the
     * list.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @param nextToken An identifier that was returned from the previous call to this
     *         operation, which can be used to return the next set of items in the
     *         list.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListUserPoolsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * The maximum number of results you want the request to return when
     * listing the user pools.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 60<br/>
     *
     * @return The maximum number of results you want the request to return when
     *         listing the user pools.
     */
    public Integer getMaxResults() {
        return maxResults;
    }
    
    /**
     * The maximum number of results you want the request to return when
     * listing the user pools.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 60<br/>
     *
     * @param maxResults The maximum number of results you want the request to return when
     *         listing the user pools.
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }
    
    /**
     * The maximum number of results you want the request to return when
     * listing the user pools.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 60<br/>
     *
     * @param maxResults The maximum number of results you want the request to return when
     *         listing the user pools.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListUserPoolsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null) sb.append("MaxResults: " + getMaxResults() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListUserPoolsRequest == false) return false;
        ListUserPoolsRequest other = (ListUserPoolsRequest)obj;
        
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        if (other.getMaxResults() == null ^ this.getMaxResults() == null) return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false) return false; 
        return true;
    }
    
}
    