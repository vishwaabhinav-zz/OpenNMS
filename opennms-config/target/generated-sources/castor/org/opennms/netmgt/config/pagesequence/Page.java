/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.pagesequence;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * This element specifies all the possible attributes in as fine
 * grained detail as possible. All that
 *  is really required (as you can see below) is the "path"
 * attribute. From that one attribute,
 *  the IP address passed in through the ServiceMonitor and
 * ServiceCollector interface, the URL will be
 *  fully generated using the supplied defaults in this config.
 * Configure attributes these attributes to
 *  the level of detail you need to fully control the behavior.
 *  
 *  A little bit of indirection is possible here with the host
 * attribute. If the host attribute is anything
 *  other than the default, that value will be used instead of the
 * IP address passed in through the API (Interface).
 *  
 *  
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Page implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _method.
     */
    private java.lang.String _method = "GET";

    /**
     * Field _httpVersion.
     */
    private java.lang.String _httpVersion = "1.1";

    /**
     * Field _userAgent.
     */
    private java.lang.String _userAgent;

    /**
     * Field _virtualHost.
     */
    private java.lang.String _virtualHost;

    /**
     * Field _scheme.
     */
    private java.lang.String _scheme = "http";

    /**
     * Field _userInfo.
     */
    private java.lang.String _userInfo;

    /**
     * Field _host.
     */
    private java.lang.String _host = "${ipaddr}";

    /**
     * Field _requireIPv6.
     */
    private boolean _requireIPv6 = false;

    /**
     * keeps track of state for field: _requireIPv6
     */
    private boolean _has_requireIPv6;

    /**
     * Field _requireIPv4.
     */
    private boolean _requireIPv4 = false;

    /**
     * keeps track of state for field: _requireIPv4
     */
    private boolean _has_requireIPv4;

    /**
     * This element is used to enable or disable SSL host and
     * certificate verification. Default: true (verification is
     * disabled)
     *  
     */
    private java.lang.String _disableSslVerification = "true";

    /**
     * Field _port.
     */
    private int _port = 80;

    /**
     * keeps track of state for field: _port
     */
    private boolean _has_port;

    /**
     * Field _path.
     */
    private java.lang.String _path;

    /**
     * Field _query.
     */
    private java.lang.String _query;

    /**
     * Field _fragment.
     */
    private java.lang.String _fragment;

    /**
     * Field _failureMatch.
     */
    private java.lang.String _failureMatch;

    /**
     * Field _failureMessage.
     */
    private java.lang.String _failureMessage;

    /**
     * Field _successMatch.
     */
    private java.lang.String _successMatch;

    /**
     * Field _locationMatch.
     */
    private java.lang.String _locationMatch;

    /**
     * Field _responseRange.
     */
    private java.lang.String _responseRange = "100-399";

    /**
     * Field _dsName.
     */
    private java.lang.String _dsName;

    /**
     * Currently only used for HTTP form parameters.
     */
    private java.util.List<org.opennms.netmgt.config.pagesequence.Parameter> _parameterList;

    /**
     * Assign the value of a regex match group to a
     *  session variable with a user-defined name. The
     *  match group is identified by number and must
     *  be zero or greater.
     */
    private java.util.List<org.opennms.netmgt.config.pagesequence.SessionVariable> _sessionVariableList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Page() {
        super();
        setMethod("GET");
        setHttpVersion("1.1");
        setScheme("http");
        setHost("${ipaddr}");
        setDisableSslVerification("true");
        setResponseRange("100-399");
        this._parameterList = new java.util.ArrayList<org.opennms.netmgt.config.pagesequence.Parameter>();
        this._sessionVariableList = new java.util.ArrayList<org.opennms.netmgt.config.pagesequence.SessionVariable>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vParameter
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addParameter(
            final org.opennms.netmgt.config.pagesequence.Parameter vParameter)
    throws java.lang.IndexOutOfBoundsException {
        this._parameterList.add(vParameter);
    }

    /**
     * 
     * 
     * @param index
     * @param vParameter
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addParameter(
            final int index,
            final org.opennms.netmgt.config.pagesequence.Parameter vParameter)
    throws java.lang.IndexOutOfBoundsException {
        this._parameterList.add(index, vParameter);
    }

    /**
     * 
     * 
     * @param vSessionVariable
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSessionVariable(
            final org.opennms.netmgt.config.pagesequence.SessionVariable vSessionVariable)
    throws java.lang.IndexOutOfBoundsException {
        this._sessionVariableList.add(vSessionVariable);
    }

    /**
     * 
     * 
     * @param index
     * @param vSessionVariable
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSessionVariable(
            final int index,
            final org.opennms.netmgt.config.pagesequence.SessionVariable vSessionVariable)
    throws java.lang.IndexOutOfBoundsException {
        this._sessionVariableList.add(index, vSessionVariable);
    }

    /**
     */
    public void deletePort(
    ) {
        this._has_port= false;
    }

    /**
     */
    public void deleteRequireIPv4(
    ) {
        this._has_requireIPv4= false;
    }

    /**
     */
    public void deleteRequireIPv6(
    ) {
        this._has_requireIPv6= false;
    }

    /**
     * Method enumerateParameter.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.pagesequence.Parameter> enumerateParameter(
    ) {
        return java.util.Collections.enumeration(this._parameterList);
    }

    /**
     * Method enumerateSessionVariable.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.pagesequence.SessionVariable> enumerateSessionVariable(
    ) {
        return java.util.Collections.enumeration(this._sessionVariableList);
    }

    /**
     * Overrides the java.lang.Object.equals method.
     * 
     * @param obj
     * @return true if the objects are equal.
     */
    @Override()
    public boolean equals(
            final java.lang.Object obj) {
        if ( this == obj )
            return true;
        
        if (obj instanceof Page) {
        
            Page temp = (Page)obj;
            if (this._method != null) {
                if (temp._method == null) return false;
                else if (!(this._method.equals(temp._method))) 
                    return false;
            }
            else if (temp._method != null)
                return false;
            if (this._httpVersion != null) {
                if (temp._httpVersion == null) return false;
                else if (!(this._httpVersion.equals(temp._httpVersion))) 
                    return false;
            }
            else if (temp._httpVersion != null)
                return false;
            if (this._userAgent != null) {
                if (temp._userAgent == null) return false;
                else if (!(this._userAgent.equals(temp._userAgent))) 
                    return false;
            }
            else if (temp._userAgent != null)
                return false;
            if (this._virtualHost != null) {
                if (temp._virtualHost == null) return false;
                else if (!(this._virtualHost.equals(temp._virtualHost))) 
                    return false;
            }
            else if (temp._virtualHost != null)
                return false;
            if (this._scheme != null) {
                if (temp._scheme == null) return false;
                else if (!(this._scheme.equals(temp._scheme))) 
                    return false;
            }
            else if (temp._scheme != null)
                return false;
            if (this._userInfo != null) {
                if (temp._userInfo == null) return false;
                else if (!(this._userInfo.equals(temp._userInfo))) 
                    return false;
            }
            else if (temp._userInfo != null)
                return false;
            if (this._host != null) {
                if (temp._host == null) return false;
                else if (!(this._host.equals(temp._host))) 
                    return false;
            }
            else if (temp._host != null)
                return false;
            if (this._requireIPv6 != temp._requireIPv6)
                return false;
            if (this._has_requireIPv6 != temp._has_requireIPv6)
                return false;
            if (this._requireIPv4 != temp._requireIPv4)
                return false;
            if (this._has_requireIPv4 != temp._has_requireIPv4)
                return false;
            if (this._disableSslVerification != null) {
                if (temp._disableSslVerification == null) return false;
                else if (!(this._disableSslVerification.equals(temp._disableSslVerification))) 
                    return false;
            }
            else if (temp._disableSslVerification != null)
                return false;
            if (this._port != temp._port)
                return false;
            if (this._has_port != temp._has_port)
                return false;
            if (this._path != null) {
                if (temp._path == null) return false;
                else if (!(this._path.equals(temp._path))) 
                    return false;
            }
            else if (temp._path != null)
                return false;
            if (this._query != null) {
                if (temp._query == null) return false;
                else if (!(this._query.equals(temp._query))) 
                    return false;
            }
            else if (temp._query != null)
                return false;
            if (this._fragment != null) {
                if (temp._fragment == null) return false;
                else if (!(this._fragment.equals(temp._fragment))) 
                    return false;
            }
            else if (temp._fragment != null)
                return false;
            if (this._failureMatch != null) {
                if (temp._failureMatch == null) return false;
                else if (!(this._failureMatch.equals(temp._failureMatch))) 
                    return false;
            }
            else if (temp._failureMatch != null)
                return false;
            if (this._failureMessage != null) {
                if (temp._failureMessage == null) return false;
                else if (!(this._failureMessage.equals(temp._failureMessage))) 
                    return false;
            }
            else if (temp._failureMessage != null)
                return false;
            if (this._successMatch != null) {
                if (temp._successMatch == null) return false;
                else if (!(this._successMatch.equals(temp._successMatch))) 
                    return false;
            }
            else if (temp._successMatch != null)
                return false;
            if (this._locationMatch != null) {
                if (temp._locationMatch == null) return false;
                else if (!(this._locationMatch.equals(temp._locationMatch))) 
                    return false;
            }
            else if (temp._locationMatch != null)
                return false;
            if (this._responseRange != null) {
                if (temp._responseRange == null) return false;
                else if (!(this._responseRange.equals(temp._responseRange))) 
                    return false;
            }
            else if (temp._responseRange != null)
                return false;
            if (this._dsName != null) {
                if (temp._dsName == null) return false;
                else if (!(this._dsName.equals(temp._dsName))) 
                    return false;
            }
            else if (temp._dsName != null)
                return false;
            if (this._parameterList != null) {
                if (temp._parameterList == null) return false;
                else if (!(this._parameterList.equals(temp._parameterList))) 
                    return false;
            }
            else if (temp._parameterList != null)
                return false;
            if (this._sessionVariableList != null) {
                if (temp._sessionVariableList == null) return false;
                else if (!(this._sessionVariableList.equals(temp._sessionVariableList))) 
                    return false;
            }
            else if (temp._sessionVariableList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'disableSslVerification'. The
     * field 'disableSslVerification' has the following
     * description: This element is used to enable or disable SSL
     * host and certificate verification. Default: true
     * (verification is disabled)
     *  
     * 
     * @return the value of field 'DisableSslVerification'.
     */
    public java.lang.String getDisableSslVerification(
    ) {
        return this._disableSslVerification;
    }

    /**
     * Returns the value of field 'dsName'.
     * 
     * @return the value of field 'DsName'.
     */
    public java.lang.String getDsName(
    ) {
        return this._dsName;
    }

    /**
     * Returns the value of field 'failureMatch'.
     * 
     * @return the value of field 'FailureMatch'.
     */
    public java.lang.String getFailureMatch(
    ) {
        return this._failureMatch;
    }

    /**
     * Returns the value of field 'failureMessage'.
     * 
     * @return the value of field 'FailureMessage'.
     */
    public java.lang.String getFailureMessage(
    ) {
        return this._failureMessage;
    }

    /**
     * Returns the value of field 'fragment'.
     * 
     * @return the value of field 'Fragment'.
     */
    public java.lang.String getFragment(
    ) {
        return this._fragment;
    }

    /**
     * Returns the value of field 'host'.
     * 
     * @return the value of field 'Host'.
     */
    public java.lang.String getHost(
    ) {
        return this._host;
    }

    /**
     * Returns the value of field 'httpVersion'.
     * 
     * @return the value of field 'HttpVersion'.
     */
    public java.lang.String getHttpVersion(
    ) {
        return this._httpVersion;
    }

    /**
     * Returns the value of field 'locationMatch'.
     * 
     * @return the value of field 'LocationMatch'.
     */
    public java.lang.String getLocationMatch(
    ) {
        return this._locationMatch;
    }

    /**
     * Returns the value of field 'method'.
     * 
     * @return the value of field 'Method'.
     */
    public java.lang.String getMethod(
    ) {
        return this._method;
    }

    /**
     * Method getParameter.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.pagesequence.Parameter at the
     * given index
     */
    public org.opennms.netmgt.config.pagesequence.Parameter getParameter(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._parameterList.size()) {
            throw new IndexOutOfBoundsException("getParameter: Index value '" + index + "' not in range [0.." + (this._parameterList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.pagesequence.Parameter) _parameterList.get(index);
    }

    /**
     * Method getParameter.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.pagesequence.Parameter[] getParameter(
    ) {
        org.opennms.netmgt.config.pagesequence.Parameter[] array = new org.opennms.netmgt.config.pagesequence.Parameter[0];
        return (org.opennms.netmgt.config.pagesequence.Parameter[]) this._parameterList.toArray(array);
    }

    /**
     * Method getParameterCollection.Returns a reference to
     * '_parameterList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.pagesequence.Parameter> getParameterCollection(
    ) {
        return this._parameterList;
    }

    /**
     * Method getParameterCount.
     * 
     * @return the size of this collection
     */
    public int getParameterCount(
    ) {
        return this._parameterList.size();
    }

    /**
     * Returns the value of field 'path'.
     * 
     * @return the value of field 'Path'.
     */
    public java.lang.String getPath(
    ) {
        return this._path;
    }

    /**
     * Returns the value of field 'port'.
     * 
     * @return the value of field 'Port'.
     */
    public int getPort(
    ) {
        return this._port;
    }

    /**
     * Returns the value of field 'query'.
     * 
     * @return the value of field 'Query'.
     */
    public java.lang.String getQuery(
    ) {
        return this._query;
    }

    /**
     * Returns the value of field 'requireIPv4'.
     * 
     * @return the value of field 'RequireIPv4'.
     */
    public boolean getRequireIPv4(
    ) {
        return this._requireIPv4;
    }

    /**
     * Returns the value of field 'requireIPv6'.
     * 
     * @return the value of field 'RequireIPv6'.
     */
    public boolean getRequireIPv6(
    ) {
        return this._requireIPv6;
    }

    /**
     * Returns the value of field 'responseRange'.
     * 
     * @return the value of field 'ResponseRange'.
     */
    public java.lang.String getResponseRange(
    ) {
        return this._responseRange;
    }

    /**
     * Returns the value of field 'scheme'.
     * 
     * @return the value of field 'Scheme'.
     */
    public java.lang.String getScheme(
    ) {
        return this._scheme;
    }

    /**
     * Method getSessionVariable.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.pagesequence.SessionVariable at
     * the given index
     */
    public org.opennms.netmgt.config.pagesequence.SessionVariable getSessionVariable(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._sessionVariableList.size()) {
            throw new IndexOutOfBoundsException("getSessionVariable: Index value '" + index + "' not in range [0.." + (this._sessionVariableList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.pagesequence.SessionVariable) _sessionVariableList.get(index);
    }

    /**
     * Method getSessionVariable.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.pagesequence.SessionVariable[] getSessionVariable(
    ) {
        org.opennms.netmgt.config.pagesequence.SessionVariable[] array = new org.opennms.netmgt.config.pagesequence.SessionVariable[0];
        return (org.opennms.netmgt.config.pagesequence.SessionVariable[]) this._sessionVariableList.toArray(array);
    }

    /**
     * Method getSessionVariableCollection.Returns a reference to
     * '_sessionVariableList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.pagesequence.SessionVariable> getSessionVariableCollection(
    ) {
        return this._sessionVariableList;
    }

    /**
     * Method getSessionVariableCount.
     * 
     * @return the size of this collection
     */
    public int getSessionVariableCount(
    ) {
        return this._sessionVariableList.size();
    }

    /**
     * Returns the value of field 'successMatch'.
     * 
     * @return the value of field 'SuccessMatch'.
     */
    public java.lang.String getSuccessMatch(
    ) {
        return this._successMatch;
    }

    /**
     * Returns the value of field 'userAgent'.
     * 
     * @return the value of field 'UserAgent'.
     */
    public java.lang.String getUserAgent(
    ) {
        return this._userAgent;
    }

    /**
     * Returns the value of field 'userInfo'.
     * 
     * @return the value of field 'UserInfo'.
     */
    public java.lang.String getUserInfo(
    ) {
        return this._userInfo;
    }

    /**
     * Returns the value of field 'virtualHost'.
     * 
     * @return the value of field 'VirtualHost'.
     */
    public java.lang.String getVirtualHost(
    ) {
        return this._virtualHost;
    }

    /**
     * Method hasPort.
     * 
     * @return true if at least one Port has been added
     */
    public boolean hasPort(
    ) {
        return this._has_port;
    }

    /**
     * Method hasRequireIPv4.
     * 
     * @return true if at least one RequireIPv4 has been added
     */
    public boolean hasRequireIPv4(
    ) {
        return this._has_requireIPv4;
    }

    /**
     * Method hasRequireIPv6.
     * 
     * @return true if at least one RequireIPv6 has been added
     */
    public boolean hasRequireIPv6(
    ) {
        return this._has_requireIPv6;
    }

    /**
     * Overrides the java.lang.Object.hashCode method.
     * <p>
     * The following steps came from <b>Effective Java Programming
     * Language Guide</b> by Joshua Bloch, Chapter 3
     * 
     * @return a hash code value for the object.
     */
    public int hashCode(
    ) {
        int result = 17;
        
        long tmp;
        if (_method != null) {
           result = 37 * result + _method.hashCode();
        }
        if (_httpVersion != null) {
           result = 37 * result + _httpVersion.hashCode();
        }
        if (_userAgent != null) {
           result = 37 * result + _userAgent.hashCode();
        }
        if (_virtualHost != null) {
           result = 37 * result + _virtualHost.hashCode();
        }
        if (_scheme != null) {
           result = 37 * result + _scheme.hashCode();
        }
        if (_userInfo != null) {
           result = 37 * result + _userInfo.hashCode();
        }
        if (_host != null) {
           result = 37 * result + _host.hashCode();
        }
        result = 37 * result + (_requireIPv6?0:1);
        result = 37 * result + (_requireIPv4?0:1);
        if (_disableSslVerification != null) {
           result = 37 * result + _disableSslVerification.hashCode();
        }
        result = 37 * result + _port;
        if (_path != null) {
           result = 37 * result + _path.hashCode();
        }
        if (_query != null) {
           result = 37 * result + _query.hashCode();
        }
        if (_fragment != null) {
           result = 37 * result + _fragment.hashCode();
        }
        if (_failureMatch != null) {
           result = 37 * result + _failureMatch.hashCode();
        }
        if (_failureMessage != null) {
           result = 37 * result + _failureMessage.hashCode();
        }
        if (_successMatch != null) {
           result = 37 * result + _successMatch.hashCode();
        }
        if (_locationMatch != null) {
           result = 37 * result + _locationMatch.hashCode();
        }
        if (_responseRange != null) {
           result = 37 * result + _responseRange.hashCode();
        }
        if (_dsName != null) {
           result = 37 * result + _dsName.hashCode();
        }
        if (_parameterList != null) {
           result = 37 * result + _parameterList.hashCode();
        }
        if (_sessionVariableList != null) {
           result = 37 * result + _sessionVariableList.hashCode();
        }
        
        return result;
    }

    /**
     * Returns the value of field 'requireIPv4'.
     * 
     * @return the value of field 'RequireIPv4'.
     */
    public boolean isRequireIPv4(
    ) {
        return this._requireIPv4;
    }

    /**
     * Returns the value of field 'requireIPv6'.
     * 
     * @return the value of field 'RequireIPv6'.
     */
    public boolean isRequireIPv6(
    ) {
        return this._requireIPv6;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */
    public boolean isValid(
    ) {
        try {
            validate();
        } catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    }

    /**
     * Method iterateParameter.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.pagesequence.Parameter> iterateParameter(
    ) {
        return this._parameterList.iterator();
    }

    /**
     * Method iterateSessionVariable.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.pagesequence.SessionVariable> iterateSessionVariable(
    ) {
        return this._sessionVariableList.iterator();
    }

    /**
     * 
     * 
     * @param out
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */
    public void marshal(
            final java.io.Writer out)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        Marshaller.marshal(this, out);
    }

    /**
     * 
     * 
     * @param handler
     * @throws java.io.IOException if an IOException occurs during
     * marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     */
    public void marshal(
            final org.xml.sax.ContentHandler handler)
    throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        Marshaller.marshal(this, handler);
    }

    /**
     */
    public void removeAllParameter(
    ) {
        this._parameterList.clear();
    }

    /**
     */
    public void removeAllSessionVariable(
    ) {
        this._sessionVariableList.clear();
    }

    /**
     * Method removeParameter.
     * 
     * @param vParameter
     * @return true if the object was removed from the collection.
     */
    public boolean removeParameter(
            final org.opennms.netmgt.config.pagesequence.Parameter vParameter) {
        boolean removed = _parameterList.remove(vParameter);
        return removed;
    }

    /**
     * Method removeParameterAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.pagesequence.Parameter removeParameterAt(
            final int index) {
        java.lang.Object obj = this._parameterList.remove(index);
        return (org.opennms.netmgt.config.pagesequence.Parameter) obj;
    }

    /**
     * Method removeSessionVariable.
     * 
     * @param vSessionVariable
     * @return true if the object was removed from the collection.
     */
    public boolean removeSessionVariable(
            final org.opennms.netmgt.config.pagesequence.SessionVariable vSessionVariable) {
        boolean removed = _sessionVariableList.remove(vSessionVariable);
        return removed;
    }

    /**
     * Method removeSessionVariableAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.pagesequence.SessionVariable removeSessionVariableAt(
            final int index) {
        java.lang.Object obj = this._sessionVariableList.remove(index);
        return (org.opennms.netmgt.config.pagesequence.SessionVariable) obj;
    }

    /**
     * Sets the value of field 'disableSslVerification'. The field
     * 'disableSslVerification' has the following description: This
     * element is used to enable or disable SSL host and
     * certificate verification. Default: true (verification is
     * disabled)
     *  
     * 
     * @param disableSslVerification the value of field
     * 'disableSslVerification'.
     */
    public void setDisableSslVerification(
            final java.lang.String disableSslVerification) {
        this._disableSslVerification = disableSslVerification;
    }

    /**
     * Sets the value of field 'dsName'.
     * 
     * @param dsName the value of field 'dsName'.
     */
    public void setDsName(
            final java.lang.String dsName) {
        this._dsName = dsName;
    }

    /**
     * Sets the value of field 'failureMatch'.
     * 
     * @param failureMatch the value of field 'failureMatch'.
     */
    public void setFailureMatch(
            final java.lang.String failureMatch) {
        this._failureMatch = failureMatch;
    }

    /**
     * Sets the value of field 'failureMessage'.
     * 
     * @param failureMessage the value of field 'failureMessage'.
     */
    public void setFailureMessage(
            final java.lang.String failureMessage) {
        this._failureMessage = failureMessage;
    }

    /**
     * Sets the value of field 'fragment'.
     * 
     * @param fragment the value of field 'fragment'.
     */
    public void setFragment(
            final java.lang.String fragment) {
        this._fragment = fragment;
    }

    /**
     * Sets the value of field 'host'.
     * 
     * @param host the value of field 'host'.
     */
    public void setHost(
            final java.lang.String host) {
        this._host = host;
    }

    /**
     * Sets the value of field 'httpVersion'.
     * 
     * @param httpVersion the value of field 'httpVersion'.
     */
    public void setHttpVersion(
            final java.lang.String httpVersion) {
        this._httpVersion = httpVersion;
    }

    /**
     * Sets the value of field 'locationMatch'.
     * 
     * @param locationMatch the value of field 'locationMatch'.
     */
    public void setLocationMatch(
            final java.lang.String locationMatch) {
        this._locationMatch = locationMatch;
    }

    /**
     * Sets the value of field 'method'.
     * 
     * @param method the value of field 'method'.
     */
    public void setMethod(
            final java.lang.String method) {
        this._method = method;
    }

    /**
     * 
     * 
     * @param index
     * @param vParameter
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setParameter(
            final int index,
            final org.opennms.netmgt.config.pagesequence.Parameter vParameter)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._parameterList.size()) {
            throw new IndexOutOfBoundsException("setParameter: Index value '" + index + "' not in range [0.." + (this._parameterList.size() - 1) + "]");
        }
        
        this._parameterList.set(index, vParameter);
    }

    /**
     * 
     * 
     * @param vParameterArray
     */
    public void setParameter(
            final org.opennms.netmgt.config.pagesequence.Parameter[] vParameterArray) {
        //-- copy array
        _parameterList.clear();
        
        for (int i = 0; i < vParameterArray.length; i++) {
                this._parameterList.add(vParameterArray[i]);
        }
    }

    /**
     * Sets the value of '_parameterList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vParameterList the Vector to copy.
     */
    public void setParameter(
            final java.util.List<org.opennms.netmgt.config.pagesequence.Parameter> vParameterList) {
        // copy vector
        this._parameterList.clear();
        
        this._parameterList.addAll(vParameterList);
    }

    /**
     * Sets the value of '_parameterList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param parameterList the Vector to set.
     */
    public void setParameterCollection(
            final java.util.List<org.opennms.netmgt.config.pagesequence.Parameter> parameterList) {
        this._parameterList = parameterList;
    }

    /**
     * Sets the value of field 'path'.
     * 
     * @param path the value of field 'path'.
     */
    public void setPath(
            final java.lang.String path) {
        this._path = path;
    }

    /**
     * Sets the value of field 'port'.
     * 
     * @param port the value of field 'port'.
     */
    public void setPort(
            final int port) {
        this._port = port;
        this._has_port = true;
    }

    /**
     * Sets the value of field 'query'.
     * 
     * @param query the value of field 'query'.
     */
    public void setQuery(
            final java.lang.String query) {
        this._query = query;
    }

    /**
     * Sets the value of field 'requireIPv4'.
     * 
     * @param requireIPv4 the value of field 'requireIPv4'.
     */
    public void setRequireIPv4(
            final boolean requireIPv4) {
        this._requireIPv4 = requireIPv4;
        this._has_requireIPv4 = true;
    }

    /**
     * Sets the value of field 'requireIPv6'.
     * 
     * @param requireIPv6 the value of field 'requireIPv6'.
     */
    public void setRequireIPv6(
            final boolean requireIPv6) {
        this._requireIPv6 = requireIPv6;
        this._has_requireIPv6 = true;
    }

    /**
     * Sets the value of field 'responseRange'.
     * 
     * @param responseRange the value of field 'responseRange'.
     */
    public void setResponseRange(
            final java.lang.String responseRange) {
        this._responseRange = responseRange;
    }

    /**
     * Sets the value of field 'scheme'.
     * 
     * @param scheme the value of field 'scheme'.
     */
    public void setScheme(
            final java.lang.String scheme) {
        this._scheme = scheme;
    }

    /**
     * 
     * 
     * @param index
     * @param vSessionVariable
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSessionVariable(
            final int index,
            final org.opennms.netmgt.config.pagesequence.SessionVariable vSessionVariable)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._sessionVariableList.size()) {
            throw new IndexOutOfBoundsException("setSessionVariable: Index value '" + index + "' not in range [0.." + (this._sessionVariableList.size() - 1) + "]");
        }
        
        this._sessionVariableList.set(index, vSessionVariable);
    }

    /**
     * 
     * 
     * @param vSessionVariableArray
     */
    public void setSessionVariable(
            final org.opennms.netmgt.config.pagesequence.SessionVariable[] vSessionVariableArray) {
        //-- copy array
        _sessionVariableList.clear();
        
        for (int i = 0; i < vSessionVariableArray.length; i++) {
                this._sessionVariableList.add(vSessionVariableArray[i]);
        }
    }

    /**
     * Sets the value of '_sessionVariableList' by copying the
     * given Vector. All elements will be checked for type safety.
     * 
     * @param vSessionVariableList the Vector to copy.
     */
    public void setSessionVariable(
            final java.util.List<org.opennms.netmgt.config.pagesequence.SessionVariable> vSessionVariableList) {
        // copy vector
        this._sessionVariableList.clear();
        
        this._sessionVariableList.addAll(vSessionVariableList);
    }

    /**
     * Sets the value of '_sessionVariableList' by setting it to
     * the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param sessionVariableList the Vector to set.
     */
    public void setSessionVariableCollection(
            final java.util.List<org.opennms.netmgt.config.pagesequence.SessionVariable> sessionVariableList) {
        this._sessionVariableList = sessionVariableList;
    }

    /**
     * Sets the value of field 'successMatch'.
     * 
     * @param successMatch the value of field 'successMatch'.
     */
    public void setSuccessMatch(
            final java.lang.String successMatch) {
        this._successMatch = successMatch;
    }

    /**
     * Sets the value of field 'userAgent'.
     * 
     * @param userAgent the value of field 'userAgent'.
     */
    public void setUserAgent(
            final java.lang.String userAgent) {
        this._userAgent = userAgent;
    }

    /**
     * Sets the value of field 'userInfo'.
     * 
     * @param userInfo the value of field 'userInfo'.
     */
    public void setUserInfo(
            final java.lang.String userInfo) {
        this._userInfo = userInfo;
    }

    /**
     * Sets the value of field 'virtualHost'.
     * 
     * @param virtualHost the value of field 'virtualHost'.
     */
    public void setVirtualHost(
            final java.lang.String virtualHost) {
        this._virtualHost = virtualHost;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.opennms.netmgt.config.pagesequence.Page
     */
    public static org.opennms.netmgt.config.pagesequence.Page unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.pagesequence.Page) Unmarshaller.unmarshal(org.opennms.netmgt.config.pagesequence.Page.class, reader);
    }

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */
    public void validate(
    )
    throws org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    }

}
