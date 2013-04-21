/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.xmlrpcd;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * XMLRPC server information including hostname and port
 *  number
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class XmlrpcServer implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * URL of an XMLRPC server
     */
    private java.lang.String _url;

    /**
     * For non-https connections, specify a read timeout in
     * milliseconds.
     */
    private int _timeout = 0;

    /**
     * keeps track of state for field: _timeout
     */
    private boolean _has_timeout;


      //----------------/
     //- Constructors -/
    //----------------/

    public XmlrpcServer() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteTimeout(
    ) {
        this._has_timeout= false;
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
        
        if (obj instanceof XmlrpcServer) {
        
            XmlrpcServer temp = (XmlrpcServer)obj;
            if (this._url != null) {
                if (temp._url == null) return false;
                else if (!(this._url.equals(temp._url))) 
                    return false;
            }
            else if (temp._url != null)
                return false;
            if (this._timeout != temp._timeout)
                return false;
            if (this._has_timeout != temp._has_timeout)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'timeout'. The field 'timeout'
     * has the following description: For non-https connections,
     * specify a read timeout in milliseconds.
     * 
     * @return the value of field 'Timeout'.
     */
    public int getTimeout(
    ) {
        return this._timeout;
    }

    /**
     * Returns the value of field 'url'. The field 'url' has the
     * following description: URL of an XMLRPC server
     * 
     * @return the value of field 'Url'.
     */
    public java.lang.String getUrl(
    ) {
        return this._url;
    }

    /**
     * Method hasTimeout.
     * 
     * @return true if at least one Timeout has been added
     */
    public boolean hasTimeout(
    ) {
        return this._has_timeout;
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
        if (_url != null) {
           result = 37 * result + _url.hashCode();
        }
        result = 37 * result + _timeout;
        
        return result;
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
     * Sets the value of field 'timeout'. The field 'timeout' has
     * the following description: For non-https connections,
     * specify a read timeout in milliseconds.
     * 
     * @param timeout the value of field 'timeout'.
     */
    public void setTimeout(
            final int timeout) {
        this._timeout = timeout;
        this._has_timeout = true;
    }

    /**
     * Sets the value of field 'url'. The field 'url' has the
     * following description: URL of an XMLRPC server
     * 
     * @param url the value of field 'url'.
     */
    public void setUrl(
            final java.lang.String url) {
        this._url = url;
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
     * org.opennms.netmgt.config.xmlrpcd.XmlrpcServer
     */
    public static org.opennms.netmgt.config.xmlrpcd.XmlrpcServer unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.xmlrpcd.XmlrpcServer) Unmarshaller.unmarshal(org.opennms.netmgt.config.xmlrpcd.XmlrpcServer.class, reader);
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
