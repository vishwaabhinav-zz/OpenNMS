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
 * Use this element to define a mail test with the
 * MailTransportMonitor. Supported
 *  use cases for the sequence are:
 *  
 *  a) Class will test that it can successfully send an email.
 *  b) Class will test that it can successfully connect to a mail
 * server and get mailbox contents.
 *  c) Class will test that it can successfully read a new email
 * message from a mail server.
 *  d) Class will test that it can send an email and read that same
 * email from a mail server.
 *  
 *  The sequence support a max of one send and one receive server.
 * If each are specified, the complete
 *  sequence is delivery of a message from one mail host to
 * another.
 *  
 *  
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class MailTransportTest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Defines a use case for testing mail. If both a send and a
     * read test are
     *  configured, then the use case (d) will be executed.
     *  
     */
    private org.opennms.netmgt.config.mailtransporttest.MailTest _mailTest;


      //----------------/
     //- Constructors -/
    //----------------/

    public MailTransportTest() {
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
        
        if (obj instanceof MailTransportTest) {
        
            MailTransportTest temp = (MailTransportTest)obj;
            if (this._mailTest != null) {
                if (temp._mailTest == null) return false;
                else if (!(this._mailTest.equals(temp._mailTest))) 
                    return false;
            }
            else if (temp._mailTest != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'mailTest'. The field 'mailTest'
     * has the following description: Defines a use case for
     * testing mail. If both a send and a read test are
     *  configured, then the use case (d) will be executed.
     *  
     * 
     * @return the value of field 'MailTest'.
     */
    public org.opennms.netmgt.config.mailtransporttest.MailTest getMailTest(
    ) {
        return this._mailTest;
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
        if (_mailTest != null) {
           result = 37 * result + _mailTest.hashCode();
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
     * Sets the value of field 'mailTest'. The field 'mailTest' has
     * the following description: Defines a use case for testing
     * mail. If both a send and a read test are
     *  configured, then the use case (d) will be executed.
     *  
     * 
     * @param mailTest the value of field 'mailTest'.
     */
    public void setMailTest(
            final org.opennms.netmgt.config.mailtransporttest.MailTest mailTest) {
        this._mailTest = mailTest;
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
     * org.opennms.netmgt.config.mailtransporttest.MailTransportTest
     */
    public static org.opennms.netmgt.config.mailtransporttest.MailTransportTest unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.mailtransporttest.MailTransportTest) Unmarshaller.unmarshal(org.opennms.netmgt.config.mailtransporttest.MailTransportTest.class, reader);
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
