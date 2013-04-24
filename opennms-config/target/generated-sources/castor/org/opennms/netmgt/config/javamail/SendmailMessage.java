/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.javamail;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Define the To, From, Subject, and body of a message. If not
 * defined, one will be defined
 *  for your benefit (or confusion ;-)
 *  
 *  
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class SendmailMessage implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _to.
     */
    private java.lang.String _to = "root@localhost";

    /**
     * Field _from.
     */
    private java.lang.String _from = "root@[127.0.0.1]";

    /**
     * Field _subject.
     */
    private java.lang.String _subject = "OpenNMS Test Message";

    /**
     * Field _body.
     */
    private java.lang.String _body = "This is an OpenNMS test message.";


      //----------------/
     //- Constructors -/
    //----------------/

    public SendmailMessage() {
        super();
        setTo("root@localhost");
        setFrom("root@[127.0.0.1]");
        setSubject("OpenNMS Test Message");
        setBody("This is an OpenNMS test message.");
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
        
        if (obj instanceof SendmailMessage) {
        
            SendmailMessage temp = (SendmailMessage)obj;
            if (this._to != null) {
                if (temp._to == null) return false;
                else if (!(this._to.equals(temp._to))) 
                    return false;
            }
            else if (temp._to != null)
                return false;
            if (this._from != null) {
                if (temp._from == null) return false;
                else if (!(this._from.equals(temp._from))) 
                    return false;
            }
            else if (temp._from != null)
                return false;
            if (this._subject != null) {
                if (temp._subject == null) return false;
                else if (!(this._subject.equals(temp._subject))) 
                    return false;
            }
            else if (temp._subject != null)
                return false;
            if (this._body != null) {
                if (temp._body == null) return false;
                else if (!(this._body.equals(temp._body))) 
                    return false;
            }
            else if (temp._body != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'body'.
     * 
     * @return the value of field 'Body'.
     */
    public java.lang.String getBody(
    ) {
        return this._body;
    }

    /**
     * Returns the value of field 'from'.
     * 
     * @return the value of field 'From'.
     */
    public java.lang.String getFrom(
    ) {
        return this._from;
    }

    /**
     * Returns the value of field 'subject'.
     * 
     * @return the value of field 'Subject'.
     */
    public java.lang.String getSubject(
    ) {
        return this._subject;
    }

    /**
     * Returns the value of field 'to'.
     * 
     * @return the value of field 'To'.
     */
    public java.lang.String getTo(
    ) {
        return this._to;
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
        if (_to != null) {
           result = 37 * result + _to.hashCode();
        }
        if (_from != null) {
           result = 37 * result + _from.hashCode();
        }
        if (_subject != null) {
           result = 37 * result + _subject.hashCode();
        }
        if (_body != null) {
           result = 37 * result + _body.hashCode();
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
     * Sets the value of field 'body'.
     * 
     * @param body the value of field 'body'.
     */
    public void setBody(
            final java.lang.String body) {
        this._body = body;
    }

    /**
     * Sets the value of field 'from'.
     * 
     * @param from the value of field 'from'.
     */
    public void setFrom(
            final java.lang.String from) {
        this._from = from;
    }

    /**
     * Sets the value of field 'subject'.
     * 
     * @param subject the value of field 'subject'.
     */
    public void setSubject(
            final java.lang.String subject) {
        this._subject = subject;
    }

    /**
     * Sets the value of field 'to'.
     * 
     * @param to the value of field 'to'.
     */
    public void setTo(
            final java.lang.String to) {
        this._to = to;
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
     * org.opennms.netmgt.config.javamail.SendmailMessage
     */
    public static org.opennms.netmgt.config.javamail.SendmailMessage unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.javamail.SendmailMessage) Unmarshaller.unmarshal(org.opennms.netmgt.config.javamail.SendmailMessage.class, reader);
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
