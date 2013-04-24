/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.discovery;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * A specific addresses to be polled
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Specific implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * internal content storage
     */
    private java.lang.String _content = "";

    /**
     * The number of times a ping is retried for this
     *  specific address. If there is no response after the first
     * ping
     *  to an address, it is tried again for the specified number
     * of
     *  retries. This retry count overrides the default.
     */
    private int _retries;

    /**
     * keeps track of state for field: _retries
     */
    private boolean _has_retries;

    /**
     * The timeout on each poll for this specific
     *  address. This timeout overrides the default.
     */
    private long _timeout;

    /**
     * keeps track of state for field: _timeout
     */
    private boolean _has_timeout;


      //----------------/
     //- Constructors -/
    //----------------/

    public Specific() {
        super();
        setContent("");
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteRetries(
    ) {
        this._has_retries= false;
    }

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
        
        if (obj instanceof Specific) {
        
            Specific temp = (Specific)obj;
            if (this._content != null) {
                if (temp._content == null) return false;
                else if (!(this._content.equals(temp._content))) 
                    return false;
            }
            else if (temp._content != null)
                return false;
            if (this._retries != temp._retries)
                return false;
            if (this._has_retries != temp._has_retries)
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
     * Returns the value of field 'content'. The field 'content'
     * has the following description: internal content storage
     * 
     * @return the value of field 'Content'.
     */
    public java.lang.String getContent(
    ) {
        return this._content;
    }

    /**
     * Returns the value of field 'retries'. The field 'retries'
     * has the following description: The number of times a ping is
     * retried for this
     *  specific address. If there is no response after the first
     * ping
     *  to an address, it is tried again for the specified number
     * of
     *  retries. This retry count overrides the default.
     * 
     * @return the value of field 'Retries'.
     */
    public int getRetries(
    ) {
        return this._retries;
    }

    /**
     * Returns the value of field 'timeout'. The field 'timeout'
     * has the following description: The timeout on each poll for
     * this specific
     *  address. This timeout overrides the default.
     * 
     * @return the value of field 'Timeout'.
     */
    public long getTimeout(
    ) {
        return this._timeout;
    }

    /**
     * Method hasRetries.
     * 
     * @return true if at least one Retries has been added
     */
    public boolean hasRetries(
    ) {
        return this._has_retries;
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
        if (_content != null) {
           result = 37 * result + _content.hashCode();
        }
        result = 37 * result + _retries;
        result = 37 * result + (int)(_timeout^(_timeout>>>32));
        
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
     * Sets the value of field 'content'. The field 'content' has
     * the following description: internal content storage
     * 
     * @param content the value of field 'content'.
     */
    public void setContent(
            final java.lang.String content) {
        this._content = content;
    }

    /**
     * Sets the value of field 'retries'. The field 'retries' has
     * the following description: The number of times a ping is
     * retried for this
     *  specific address. If there is no response after the first
     * ping
     *  to an address, it is tried again for the specified number
     * of
     *  retries. This retry count overrides the default.
     * 
     * @param retries the value of field 'retries'.
     */
    public void setRetries(
            final int retries) {
        this._retries = retries;
        this._has_retries = true;
    }

    /**
     * Sets the value of field 'timeout'. The field 'timeout' has
     * the following description: The timeout on each poll for this
     * specific
     *  address. This timeout overrides the default.
     * 
     * @param timeout the value of field 'timeout'.
     */
    public void setTimeout(
            final long timeout) {
        this._timeout = timeout;
        this._has_timeout = true;
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
     * org.opennms.netmgt.config.discovery.Specific
     */
    public static org.opennms.netmgt.config.discovery.Specific unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.discovery.Specific) Unmarshaller.unmarshal(org.opennms.netmgt.config.discovery.Specific.class, reader);
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
