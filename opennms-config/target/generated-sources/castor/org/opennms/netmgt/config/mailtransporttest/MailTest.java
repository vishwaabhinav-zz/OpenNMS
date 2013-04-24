/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.mailtransporttest;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Defines a use case for testing mail. If both a send and a read
 * test are
 *  configured, then the use case (d) will be executed.
 *  
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class MailTest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * This entity defines the test for sending mail. Attributes
     * are used to
     *  derive values of java mail properties, or, they can be
     * specified directly
     *  as key value pairs. Attributes will are easier to read but
     * there isn't 
     *  an attribute for every javamail property possible (some are
     * fairly obscure).
     *  
     *  
     */
    private org.opennms.netmgt.config.mailtransporttest.SendmailTest _sendmailTest;

    /**
     * Field _readmailTest.
     */
    private org.opennms.netmgt.config.mailtransporttest.ReadmailTest _readmailTest;


      //----------------/
     //- Constructors -/
    //----------------/

    public MailTest() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

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
        
        if (obj instanceof MailTest) {
        
            MailTest temp = (MailTest)obj;
            if (this._sendmailTest != null) {
                if (temp._sendmailTest == null) return false;
                else if (!(this._sendmailTest.equals(temp._sendmailTest))) 
                    return false;
            }
            else if (temp._sendmailTest != null)
                return false;
            if (this._readmailTest != null) {
                if (temp._readmailTest == null) return false;
                else if (!(this._readmailTest.equals(temp._readmailTest))) 
                    return false;
            }
            else if (temp._readmailTest != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'readmailTest'.
     * 
     * @return the value of field 'ReadmailTest'.
     */
    public org.opennms.netmgt.config.mailtransporttest.ReadmailTest getReadmailTest(
    ) {
        return this._readmailTest;
    }

    /**
     * Returns the value of field 'sendmailTest'. The field
     * 'sendmailTest' has the following description: This entity
     * defines the test for sending mail. Attributes are used to
     *  derive values of java mail properties, or, they can be
     * specified directly
     *  as key value pairs. Attributes will are easier to read but
     * there isn't 
     *  an attribute for every javamail property possible (some are
     * fairly obscure).
     *  
     *  
     * 
     * @return the value of field 'SendmailTest'.
     */
    public org.opennms.netmgt.config.mailtransporttest.SendmailTest getSendmailTest(
    ) {
        return this._sendmailTest;
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
        if (_sendmailTest != null) {
           result = 37 * result + _sendmailTest.hashCode();
        }
        if (_readmailTest != null) {
           result = 37 * result + _readmailTest.hashCode();
        }
        
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
     * Sets the value of field 'readmailTest'.
     * 
     * @param readmailTest the value of field 'readmailTest'.
     */
    public void setReadmailTest(
            final org.opennms.netmgt.config.mailtransporttest.ReadmailTest readmailTest) {
        this._readmailTest = readmailTest;
    }

    /**
     * Sets the value of field 'sendmailTest'. The field
     * 'sendmailTest' has the following description: This entity
     * defines the test for sending mail. Attributes are used to
     *  derive values of java mail properties, or, they can be
     * specified directly
     *  as key value pairs. Attributes will are easier to read but
     * there isn't 
     *  an attribute for every javamail property possible (some are
     * fairly obscure).
     *  
     *  
     * 
     * @param sendmailTest the value of field 'sendmailTest'.
     */
    public void setSendmailTest(
            final org.opennms.netmgt.config.mailtransporttest.SendmailTest sendmailTest) {
        this._sendmailTest = sendmailTest;
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
     * org.opennms.netmgt.config.mailtransporttest.MailTest
     */
    public static org.opennms.netmgt.config.mailtransporttest.MailTest unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.mailtransporttest.MailTest) Unmarshaller.unmarshal(org.opennms.netmgt.config.mailtransporttest.MailTest.class, reader);
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
