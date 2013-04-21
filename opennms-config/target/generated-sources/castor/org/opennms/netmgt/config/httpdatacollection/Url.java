/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.httpdatacollection;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class Url.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Url implements java.io.Serializable {


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
     * Field _matches.
     */
    private java.lang.String _matches = "(.*)";

    /**
     * Field _responseRange.
     */
    private java.lang.String _responseRange = "100-399";

    /**
     * Field _canonicalEquivalence.
     */
    private boolean _canonicalEquivalence = false;

    /**
     * keeps track of state for field: _canonicalEquivalence
     */
    private boolean _has_canonicalEquivalence;

    /**
     * Field _caseInsensitive.
     */
    private boolean _caseInsensitive = false;

    /**
     * keeps track of state for field: _caseInsensitive
     */
    private boolean _has_caseInsensitive;

    /**
     * Field _comments.
     */
    private boolean _comments = false;

    /**
     * keeps track of state for field: _comments
     */
    private boolean _has_comments;

    /**
     * Field _dotall.
     */
    private boolean _dotall = false;

    /**
     * keeps track of state for field: _dotall
     */
    private boolean _has_dotall;

    /**
     * Field _literal.
     */
    private boolean _literal = false;

    /**
     * keeps track of state for field: _literal
     */
    private boolean _has_literal;

    /**
     * Field _multiline.
     */
    private boolean _multiline = false;

    /**
     * keeps track of state for field: _multiline
     */
    private boolean _has_multiline;

    /**
     * Field _unicodeCase.
     */
    private boolean _unicodeCase = false;

    /**
     * keeps track of state for field: _unicodeCase
     */
    private boolean _has_unicodeCase;

    /**
     * Field _unixLines.
     */
    private boolean _unixLines = false;

    /**
     * keeps track of state for field: _unixLines
     */
    private boolean _has_unixLines;

    /**
     * Field _parameters.
     */
    private org.opennms.netmgt.config.httpdatacollection.Parameters _parameters;


      //----------------/
     //- Constructors -/
    //----------------/

    public Url() {
        super();
        setMethod("GET");
        setHttpVersion("1.1");
        setScheme("http");
        setHost("${ipaddr}");
        setMatches("(.*)");
        setResponseRange("100-399");
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteCanonicalEquivalence(
    ) {
        this._has_canonicalEquivalence= false;
    }

    /**
     */
    public void deleteCaseInsensitive(
    ) {
        this._has_caseInsensitive= false;
    }

    /**
     */
    public void deleteComments(
    ) {
        this._has_comments= false;
    }

    /**
     */
    public void deleteDotall(
    ) {
        this._has_dotall= false;
    }

    /**
     */
    public void deleteLiteral(
    ) {
        this._has_literal= false;
    }

    /**
     */
    public void deleteMultiline(
    ) {
        this._has_multiline= false;
    }

    /**
     */
    public void deletePort(
    ) {
        this._has_port= false;
    }

    /**
     */
    public void deleteUnicodeCase(
    ) {
        this._has_unicodeCase= false;
    }

    /**
     */
    public void deleteUnixLines(
    ) {
        this._has_unixLines= false;
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
        
        if (obj instanceof Url) {
        
            Url temp = (Url)obj;
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
            if (this._matches != null) {
                if (temp._matches == null) return false;
                else if (!(this._matches.equals(temp._matches))) 
                    return false;
            }
            else if (temp._matches != null)
                return false;
            if (this._responseRange != null) {
                if (temp._responseRange == null) return false;
                else if (!(this._responseRange.equals(temp._responseRange))) 
                    return false;
            }
            else if (temp._responseRange != null)
                return false;
            if (this._canonicalEquivalence != temp._canonicalEquivalence)
                return false;
            if (this._has_canonicalEquivalence != temp._has_canonicalEquivalence)
                return false;
            if (this._caseInsensitive != temp._caseInsensitive)
                return false;
            if (this._has_caseInsensitive != temp._has_caseInsensitive)
                return false;
            if (this._comments != temp._comments)
                return false;
            if (this._has_comments != temp._has_comments)
                return false;
            if (this._dotall != temp._dotall)
                return false;
            if (this._has_dotall != temp._has_dotall)
                return false;
            if (this._literal != temp._literal)
                return false;
            if (this._has_literal != temp._has_literal)
                return false;
            if (this._multiline != temp._multiline)
                return false;
            if (this._has_multiline != temp._has_multiline)
                return false;
            if (this._unicodeCase != temp._unicodeCase)
                return false;
            if (this._has_unicodeCase != temp._has_unicodeCase)
                return false;
            if (this._unixLines != temp._unixLines)
                return false;
            if (this._has_unixLines != temp._has_unixLines)
                return false;
            if (this._parameters != null) {
                if (temp._parameters == null) return false;
                else if (!(this._parameters.equals(temp._parameters))) 
                    return false;
            }
            else if (temp._parameters != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'canonicalEquivalence'.
     * 
     * @return the value of field 'CanonicalEquivalence'.
     */
    public boolean getCanonicalEquivalence(
    ) {
        return this._canonicalEquivalence;
    }

    /**
     * Returns the value of field 'caseInsensitive'.
     * 
     * @return the value of field 'CaseInsensitive'.
     */
    public boolean getCaseInsensitive(
    ) {
        return this._caseInsensitive;
    }

    /**
     * Returns the value of field 'comments'.
     * 
     * @return the value of field 'Comments'.
     */
    public boolean getComments(
    ) {
        return this._comments;
    }

    /**
     * Returns the value of field 'dotall'.
     * 
     * @return the value of field 'Dotall'.
     */
    public boolean getDotall(
    ) {
        return this._dotall;
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
     * Returns the value of field 'literal'.
     * 
     * @return the value of field 'Literal'.
     */
    public boolean getLiteral(
    ) {
        return this._literal;
    }

    /**
     * Returns the value of field 'matches'.
     * 
     * @return the value of field 'Matches'.
     */
    public java.lang.String getMatches(
    ) {
        return this._matches;
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
     * Returns the value of field 'multiline'.
     * 
     * @return the value of field 'Multiline'.
     */
    public boolean getMultiline(
    ) {
        return this._multiline;
    }

    /**
     * Returns the value of field 'parameters'.
     * 
     * @return the value of field 'Parameters'.
     */
    public org.opennms.netmgt.config.httpdatacollection.Parameters getParameters(
    ) {
        return this._parameters;
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
     * Returns the value of field 'unicodeCase'.
     * 
     * @return the value of field 'UnicodeCase'.
     */
    public boolean getUnicodeCase(
    ) {
        return this._unicodeCase;
    }

    /**
     * Returns the value of field 'unixLines'.
     * 
     * @return the value of field 'UnixLines'.
     */
    public boolean getUnixLines(
    ) {
        return this._unixLines;
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
     * Method hasCanonicalEquivalence.
     * 
     * @return true if at least one CanonicalEquivalence has been
     * added
     */
    public boolean hasCanonicalEquivalence(
    ) {
        return this._has_canonicalEquivalence;
    }

    /**
     * Method hasCaseInsensitive.
     * 
     * @return true if at least one CaseInsensitive has been added
     */
    public boolean hasCaseInsensitive(
    ) {
        return this._has_caseInsensitive;
    }

    /**
     * Method hasComments.
     * 
     * @return true if at least one Comments has been added
     */
    public boolean hasComments(
    ) {
        return this._has_comments;
    }

    /**
     * Method hasDotall.
     * 
     * @return true if at least one Dotall has been added
     */
    public boolean hasDotall(
    ) {
        return this._has_dotall;
    }

    /**
     * Method hasLiteral.
     * 
     * @return true if at least one Literal has been added
     */
    public boolean hasLiteral(
    ) {
        return this._has_literal;
    }

    /**
     * Method hasMultiline.
     * 
     * @return true if at least one Multiline has been added
     */
    public boolean hasMultiline(
    ) {
        return this._has_multiline;
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
     * Method hasUnicodeCase.
     * 
     * @return true if at least one UnicodeCase has been added
     */
    public boolean hasUnicodeCase(
    ) {
        return this._has_unicodeCase;
    }

    /**
     * Method hasUnixLines.
     * 
     * @return true if at least one UnixLines has been added
     */
    public boolean hasUnixLines(
    ) {
        return this._has_unixLines;
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
        if (_matches != null) {
           result = 37 * result + _matches.hashCode();
        }
        if (_responseRange != null) {
           result = 37 * result + _responseRange.hashCode();
        }
        result = 37 * result + (_canonicalEquivalence?0:1);
        result = 37 * result + (_caseInsensitive?0:1);
        result = 37 * result + (_comments?0:1);
        result = 37 * result + (_dotall?0:1);
        result = 37 * result + (_literal?0:1);
        result = 37 * result + (_multiline?0:1);
        result = 37 * result + (_unicodeCase?0:1);
        result = 37 * result + (_unixLines?0:1);
        if (_parameters != null) {
           result = 37 * result + _parameters.hashCode();
        }
        
        return result;
    }

    /**
     * Returns the value of field 'canonicalEquivalence'.
     * 
     * @return the value of field 'CanonicalEquivalence'.
     */
    public boolean isCanonicalEquivalence(
    ) {
        return this._canonicalEquivalence;
    }

    /**
     * Returns the value of field 'caseInsensitive'.
     * 
     * @return the value of field 'CaseInsensitive'.
     */
    public boolean isCaseInsensitive(
    ) {
        return this._caseInsensitive;
    }

    /**
     * Returns the value of field 'comments'.
     * 
     * @return the value of field 'Comments'.
     */
    public boolean isComments(
    ) {
        return this._comments;
    }

    /**
     * Returns the value of field 'dotall'.
     * 
     * @return the value of field 'Dotall'.
     */
    public boolean isDotall(
    ) {
        return this._dotall;
    }

    /**
     * Returns the value of field 'literal'.
     * 
     * @return the value of field 'Literal'.
     */
    public boolean isLiteral(
    ) {
        return this._literal;
    }

    /**
     * Returns the value of field 'multiline'.
     * 
     * @return the value of field 'Multiline'.
     */
    public boolean isMultiline(
    ) {
        return this._multiline;
    }

    /**
     * Returns the value of field 'unicodeCase'.
     * 
     * @return the value of field 'UnicodeCase'.
     */
    public boolean isUnicodeCase(
    ) {
        return this._unicodeCase;
    }

    /**
     * Returns the value of field 'unixLines'.
     * 
     * @return the value of field 'UnixLines'.
     */
    public boolean isUnixLines(
    ) {
        return this._unixLines;
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
     * Sets the value of field 'canonicalEquivalence'.
     * 
     * @param canonicalEquivalence the value of field
     * 'canonicalEquivalence'.
     */
    public void setCanonicalEquivalence(
            final boolean canonicalEquivalence) {
        this._canonicalEquivalence = canonicalEquivalence;
        this._has_canonicalEquivalence = true;
    }

    /**
     * Sets the value of field 'caseInsensitive'.
     * 
     * @param caseInsensitive the value of field 'caseInsensitive'.
     */
    public void setCaseInsensitive(
            final boolean caseInsensitive) {
        this._caseInsensitive = caseInsensitive;
        this._has_caseInsensitive = true;
    }

    /**
     * Sets the value of field 'comments'.
     * 
     * @param comments the value of field 'comments'.
     */
    public void setComments(
            final boolean comments) {
        this._comments = comments;
        this._has_comments = true;
    }

    /**
     * Sets the value of field 'dotall'.
     * 
     * @param dotall the value of field 'dotall'.
     */
    public void setDotall(
            final boolean dotall) {
        this._dotall = dotall;
        this._has_dotall = true;
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
     * Sets the value of field 'literal'.
     * 
     * @param literal the value of field 'literal'.
     */
    public void setLiteral(
            final boolean literal) {
        this._literal = literal;
        this._has_literal = true;
    }

    /**
     * Sets the value of field 'matches'.
     * 
     * @param matches the value of field 'matches'.
     */
    public void setMatches(
            final java.lang.String matches) {
        this._matches = matches;
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
     * Sets the value of field 'multiline'.
     * 
     * @param multiline the value of field 'multiline'.
     */
    public void setMultiline(
            final boolean multiline) {
        this._multiline = multiline;
        this._has_multiline = true;
    }

    /**
     * Sets the value of field 'parameters'.
     * 
     * @param parameters the value of field 'parameters'.
     */
    public void setParameters(
            final org.opennms.netmgt.config.httpdatacollection.Parameters parameters) {
        this._parameters = parameters;
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
     * Sets the value of field 'unicodeCase'.
     * 
     * @param unicodeCase the value of field 'unicodeCase'.
     */
    public void setUnicodeCase(
            final boolean unicodeCase) {
        this._unicodeCase = unicodeCase;
        this._has_unicodeCase = true;
    }

    /**
     * Sets the value of field 'unixLines'.
     * 
     * @param unixLines the value of field 'unixLines'.
     */
    public void setUnixLines(
            final boolean unixLines) {
        this._unixLines = unixLines;
        this._has_unixLines = true;
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
     * org.opennms.netmgt.config.httpdatacollection.Url
     */
    public static org.opennms.netmgt.config.httpdatacollection.Url unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.httpdatacollection.Url) Unmarshaller.unmarshal(org.opennms.netmgt.config.httpdatacollection.Url.class, reader);
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
