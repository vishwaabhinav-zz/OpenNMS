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
 * This entity defines the test for sending mail. Attributes are
 * used to
 *  derive values of java mail properties, or, they can be
 * specified directly
 *  as key value pairs. Attributes will are easier to read but
 * there isn't 
 *  an attribute for every javamail property possible (some are
 * fairly obscure).
 *  
 *  
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class SendmailTest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _debug.
     */
    private boolean _debug = true;

    /**
     * keeps track of state for field: _debug
     */
    private boolean _has_debug;

    /**
     * Field _useAuthentication.
     */
    private boolean _useAuthentication = false;

    /**
     * keeps track of state for field: _useAuthentication
     */
    private boolean _has_useAuthentication;

    /**
     * Field _useJmta.
     */
    private boolean _useJmta = true;

    /**
     * keeps track of state for field: _useJmta
     */
    private boolean _has_useJmta;

    /**
     * Field _attemptInterval.
     */
    private long _attemptInterval = 3000;

    /**
     * keeps track of state for field: _attemptInterval
     */
    private boolean _has_attemptInterval;

    /**
     * Use these name value pairs to configure freeform properties
     * from the JavaMail class.
     *  
     *  
     */
    private java.util.List<org.opennms.netmgt.config.mailtransporttest.JavamailProperty> _javamailPropertyList;

    /**
     * Define the host and port of the sendmail server. If you
     * don't, defaults will be used and
     *  ${ipaddr} is replaced with the IP address of the service.
     *  
     *  
     */
    private org.opennms.netmgt.config.mailtransporttest.SendmailHost _sendmailHost;

    /**
     * Basically attributes that help setup the javamailer's
     * confusion set of properties.
     *  
     *  
     */
    private org.opennms.netmgt.config.mailtransporttest.SendmailProtocol _sendmailProtocol;

    /**
     * Define the to, from, subject, and body of a message. If not
     * defined, one will be defined
     *  for your benefit (or confusion ;-)
     *  
     *  
     */
    private org.opennms.netmgt.config.mailtransporttest.SendmailMessage _sendmailMessage;

    /**
     * Configure user based authentication.
     *  
     *  
     */
    private org.opennms.netmgt.config.mailtransporttest.UserAuth _userAuth;


      //----------------/
     //- Constructors -/
    //----------------/

    public SendmailTest() {
        super();
        this._javamailPropertyList = new java.util.ArrayList<org.opennms.netmgt.config.mailtransporttest.JavamailProperty>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vJavamailProperty
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addJavamailProperty(
            final org.opennms.netmgt.config.mailtransporttest.JavamailProperty vJavamailProperty)
    throws java.lang.IndexOutOfBoundsException {
        this._javamailPropertyList.add(vJavamailProperty);
    }

    /**
     * 
     * 
     * @param index
     * @param vJavamailProperty
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addJavamailProperty(
            final int index,
            final org.opennms.netmgt.config.mailtransporttest.JavamailProperty vJavamailProperty)
    throws java.lang.IndexOutOfBoundsException {
        this._javamailPropertyList.add(index, vJavamailProperty);
    }

    /**
     */
    public void deleteAttemptInterval(
    ) {
        this._has_attemptInterval= false;
    }

    /**
     */
    public void deleteDebug(
    ) {
        this._has_debug= false;
    }

    /**
     */
    public void deleteUseAuthentication(
    ) {
        this._has_useAuthentication= false;
    }

    /**
     */
    public void deleteUseJmta(
    ) {
        this._has_useJmta= false;
    }

    /**
     * Method enumerateJavamailProperty.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.mailtransporttest.JavamailProperty> enumerateJavamailProperty(
    ) {
        return java.util.Collections.enumeration(this._javamailPropertyList);
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
        
        if (obj instanceof SendmailTest) {
        
            SendmailTest temp = (SendmailTest)obj;
            if (this._debug != temp._debug)
                return false;
            if (this._has_debug != temp._has_debug)
                return false;
            if (this._useAuthentication != temp._useAuthentication)
                return false;
            if (this._has_useAuthentication != temp._has_useAuthentication)
                return false;
            if (this._useJmta != temp._useJmta)
                return false;
            if (this._has_useJmta != temp._has_useJmta)
                return false;
            if (this._attemptInterval != temp._attemptInterval)
                return false;
            if (this._has_attemptInterval != temp._has_attemptInterval)
                return false;
            if (this._javamailPropertyList != null) {
                if (temp._javamailPropertyList == null) return false;
                else if (!(this._javamailPropertyList.equals(temp._javamailPropertyList))) 
                    return false;
            }
            else if (temp._javamailPropertyList != null)
                return false;
            if (this._sendmailHost != null) {
                if (temp._sendmailHost == null) return false;
                else if (!(this._sendmailHost.equals(temp._sendmailHost))) 
                    return false;
            }
            else if (temp._sendmailHost != null)
                return false;
            if (this._sendmailProtocol != null) {
                if (temp._sendmailProtocol == null) return false;
                else if (!(this._sendmailProtocol.equals(temp._sendmailProtocol))) 
                    return false;
            }
            else if (temp._sendmailProtocol != null)
                return false;
            if (this._sendmailMessage != null) {
                if (temp._sendmailMessage == null) return false;
                else if (!(this._sendmailMessage.equals(temp._sendmailMessage))) 
                    return false;
            }
            else if (temp._sendmailMessage != null)
                return false;
            if (this._userAuth != null) {
                if (temp._userAuth == null) return false;
                else if (!(this._userAuth.equals(temp._userAuth))) 
                    return false;
            }
            else if (temp._userAuth != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'attemptInterval'.
     * 
     * @return the value of field 'AttemptInterval'.
     */
    public long getAttemptInterval(
    ) {
        return this._attemptInterval;
    }

    /**
     * Returns the value of field 'debug'.
     * 
     * @return the value of field 'Debug'.
     */
    public boolean getDebug(
    ) {
        return this._debug;
    }

    /**
     * Method getJavamailProperty.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.mailtransporttest.JavamailProperty
     * at the given index
     */
    public org.opennms.netmgt.config.mailtransporttest.JavamailProperty getJavamailProperty(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._javamailPropertyList.size()) {
            throw new IndexOutOfBoundsException("getJavamailProperty: Index value '" + index + "' not in range [0.." + (this._javamailPropertyList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.mailtransporttest.JavamailProperty) _javamailPropertyList.get(index);
    }

    /**
     * Method getJavamailProperty.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.mailtransporttest.JavamailProperty[] getJavamailProperty(
    ) {
        org.opennms.netmgt.config.mailtransporttest.JavamailProperty[] array = new org.opennms.netmgt.config.mailtransporttest.JavamailProperty[0];
        return (org.opennms.netmgt.config.mailtransporttest.JavamailProperty[]) this._javamailPropertyList.toArray(array);
    }

    /**
     * Method getJavamailPropertyCollection.Returns a reference to
     * '_javamailPropertyList'. No type checking is performed on
     * any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.mailtransporttest.JavamailProperty> getJavamailPropertyCollection(
    ) {
        return this._javamailPropertyList;
    }

    /**
     * Method getJavamailPropertyCount.
     * 
     * @return the size of this collection
     */
    public int getJavamailPropertyCount(
    ) {
        return this._javamailPropertyList.size();
    }

    /**
     * Returns the value of field 'sendmailHost'. The field
     * 'sendmailHost' has the following description: Define the
     * host and port of the sendmail server. If you don't, defaults
     * will be used and
     *  ${ipaddr} is replaced with the IP address of the service.
     *  
     *  
     * 
     * @return the value of field 'SendmailHost'.
     */
    public org.opennms.netmgt.config.mailtransporttest.SendmailHost getSendmailHost(
    ) {
        return this._sendmailHost;
    }

    /**
     * Returns the value of field 'sendmailMessage'. The field
     * 'sendmailMessage' has the following description: Define the
     * to, from, subject, and body of a message. If not defined,
     * one will be defined
     *  for your benefit (or confusion ;-)
     *  
     *  
     * 
     * @return the value of field 'SendmailMessage'.
     */
    public org.opennms.netmgt.config.mailtransporttest.SendmailMessage getSendmailMessage(
    ) {
        return this._sendmailMessage;
    }

    /**
     * Returns the value of field 'sendmailProtocol'. The field
     * 'sendmailProtocol' has the following description: Basically
     * attributes that help setup the javamailer's confusion set of
     * properties.
     *  
     *  
     * 
     * @return the value of field 'SendmailProtocol'.
     */
    public org.opennms.netmgt.config.mailtransporttest.SendmailProtocol getSendmailProtocol(
    ) {
        return this._sendmailProtocol;
    }

    /**
     * Returns the value of field 'useAuthentication'.
     * 
     * @return the value of field 'UseAuthentication'.
     */
    public boolean getUseAuthentication(
    ) {
        return this._useAuthentication;
    }

    /**
     * Returns the value of field 'useJmta'.
     * 
     * @return the value of field 'UseJmta'.
     */
    public boolean getUseJmta(
    ) {
        return this._useJmta;
    }

    /**
     * Returns the value of field 'userAuth'. The field 'userAuth'
     * has the following description: Configure user based
     * authentication.
     *  
     *  
     * 
     * @return the value of field 'UserAuth'.
     */
    public org.opennms.netmgt.config.mailtransporttest.UserAuth getUserAuth(
    ) {
        return this._userAuth;
    }

    /**
     * Method hasAttemptInterval.
     * 
     * @return true if at least one AttemptInterval has been added
     */
    public boolean hasAttemptInterval(
    ) {
        return this._has_attemptInterval;
    }

    /**
     * Method hasDebug.
     * 
     * @return true if at least one Debug has been added
     */
    public boolean hasDebug(
    ) {
        return this._has_debug;
    }

    /**
     * Method hasUseAuthentication.
     * 
     * @return true if at least one UseAuthentication has been added
     */
    public boolean hasUseAuthentication(
    ) {
        return this._has_useAuthentication;
    }

    /**
     * Method hasUseJmta.
     * 
     * @return true if at least one UseJmta has been added
     */
    public boolean hasUseJmta(
    ) {
        return this._has_useJmta;
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
        result = 37 * result + (_debug?0:1);
        result = 37 * result + (_useAuthentication?0:1);
        result = 37 * result + (_useJmta?0:1);
        result = 37 * result + (int)(_attemptInterval^(_attemptInterval>>>32));
        if (_javamailPropertyList != null) {
           result = 37 * result + _javamailPropertyList.hashCode();
        }
        if (_sendmailHost != null) {
           result = 37 * result + _sendmailHost.hashCode();
        }
        if (_sendmailProtocol != null) {
           result = 37 * result + _sendmailProtocol.hashCode();
        }
        if (_sendmailMessage != null) {
           result = 37 * result + _sendmailMessage.hashCode();
        }
        if (_userAuth != null) {
           result = 37 * result + _userAuth.hashCode();
        }
        
        return result;
    }

    /**
     * Returns the value of field 'debug'.
     * 
     * @return the value of field 'Debug'.
     */
    public boolean isDebug(
    ) {
        return this._debug;
    }

    /**
     * Returns the value of field 'useAuthentication'.
     * 
     * @return the value of field 'UseAuthentication'.
     */
    public boolean isUseAuthentication(
    ) {
        return this._useAuthentication;
    }

    /**
     * Returns the value of field 'useJmta'.
     * 
     * @return the value of field 'UseJmta'.
     */
    public boolean isUseJmta(
    ) {
        return this._useJmta;
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
     * Method iterateJavamailProperty.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.mailtransporttest.JavamailProperty> iterateJavamailProperty(
    ) {
        return this._javamailPropertyList.iterator();
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
    public void removeAllJavamailProperty(
    ) {
        this._javamailPropertyList.clear();
    }

    /**
     * Method removeJavamailProperty.
     * 
     * @param vJavamailProperty
     * @return true if the object was removed from the collection.
     */
    public boolean removeJavamailProperty(
            final org.opennms.netmgt.config.mailtransporttest.JavamailProperty vJavamailProperty) {
        boolean removed = _javamailPropertyList.remove(vJavamailProperty);
        return removed;
    }

    /**
     * Method removeJavamailPropertyAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.mailtransporttest.JavamailProperty removeJavamailPropertyAt(
            final int index) {
        java.lang.Object obj = this._javamailPropertyList.remove(index);
        return (org.opennms.netmgt.config.mailtransporttest.JavamailProperty) obj;
    }

    /**
     * Sets the value of field 'attemptInterval'.
     * 
     * @param attemptInterval the value of field 'attemptInterval'.
     */
    public void setAttemptInterval(
            final long attemptInterval) {
        this._attemptInterval = attemptInterval;
        this._has_attemptInterval = true;
    }

    /**
     * Sets the value of field 'debug'.
     * 
     * @param debug the value of field 'debug'.
     */
    public void setDebug(
            final boolean debug) {
        this._debug = debug;
        this._has_debug = true;
    }

    /**
     * 
     * 
     * @param index
     * @param vJavamailProperty
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setJavamailProperty(
            final int index,
            final org.opennms.netmgt.config.mailtransporttest.JavamailProperty vJavamailProperty)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._javamailPropertyList.size()) {
            throw new IndexOutOfBoundsException("setJavamailProperty: Index value '" + index + "' not in range [0.." + (this._javamailPropertyList.size() - 1) + "]");
        }
        
        this._javamailPropertyList.set(index, vJavamailProperty);
    }

    /**
     * 
     * 
     * @param vJavamailPropertyArray
     */
    public void setJavamailProperty(
            final org.opennms.netmgt.config.mailtransporttest.JavamailProperty[] vJavamailPropertyArray) {
        //-- copy array
        _javamailPropertyList.clear();
        
        for (int i = 0; i < vJavamailPropertyArray.length; i++) {
                this._javamailPropertyList.add(vJavamailPropertyArray[i]);
        }
    }

    /**
     * Sets the value of '_javamailPropertyList' by copying the
     * given Vector. All elements will be checked for type safety.
     * 
     * @param vJavamailPropertyList the Vector to copy.
     */
    public void setJavamailProperty(
            final java.util.List<org.opennms.netmgt.config.mailtransporttest.JavamailProperty> vJavamailPropertyList) {
        // copy vector
        this._javamailPropertyList.clear();
        
        this._javamailPropertyList.addAll(vJavamailPropertyList);
    }

    /**
     * Sets the value of '_javamailPropertyList' by setting it to
     * the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param javamailPropertyList the Vector to set.
     */
    public void setJavamailPropertyCollection(
            final java.util.List<org.opennms.netmgt.config.mailtransporttest.JavamailProperty> javamailPropertyList) {
        this._javamailPropertyList = javamailPropertyList;
    }

    /**
     * Sets the value of field 'sendmailHost'. The field
     * 'sendmailHost' has the following description: Define the
     * host and port of the sendmail server. If you don't, defaults
     * will be used and
     *  ${ipaddr} is replaced with the IP address of the service.
     *  
     *  
     * 
     * @param sendmailHost the value of field 'sendmailHost'.
     */
    public void setSendmailHost(
            final org.opennms.netmgt.config.mailtransporttest.SendmailHost sendmailHost) {
        this._sendmailHost = sendmailHost;
    }

    /**
     * Sets the value of field 'sendmailMessage'. The field
     * 'sendmailMessage' has the following description: Define the
     * to, from, subject, and body of a message. If not defined,
     * one will be defined
     *  for your benefit (or confusion ;-)
     *  
     *  
     * 
     * @param sendmailMessage the value of field 'sendmailMessage'.
     */
    public void setSendmailMessage(
            final org.opennms.netmgt.config.mailtransporttest.SendmailMessage sendmailMessage) {
        this._sendmailMessage = sendmailMessage;
    }

    /**
     * Sets the value of field 'sendmailProtocol'. The field
     * 'sendmailProtocol' has the following description: Basically
     * attributes that help setup the javamailer's confusion set of
     * properties.
     *  
     *  
     * 
     * @param sendmailProtocol the value of field 'sendmailProtocol'
     */
    public void setSendmailProtocol(
            final org.opennms.netmgt.config.mailtransporttest.SendmailProtocol sendmailProtocol) {
        this._sendmailProtocol = sendmailProtocol;
    }

    /**
     * Sets the value of field 'useAuthentication'.
     * 
     * @param useAuthentication the value of field
     * 'useAuthentication'.
     */
    public void setUseAuthentication(
            final boolean useAuthentication) {
        this._useAuthentication = useAuthentication;
        this._has_useAuthentication = true;
    }

    /**
     * Sets the value of field 'useJmta'.
     * 
     * @param useJmta the value of field 'useJmta'.
     */
    public void setUseJmta(
            final boolean useJmta) {
        this._useJmta = useJmta;
        this._has_useJmta = true;
    }

    /**
     * Sets the value of field 'userAuth'. The field 'userAuth' has
     * the following description: Configure user based
     * authentication.
     *  
     *  
     * 
     * @param userAuth the value of field 'userAuth'.
     */
    public void setUserAuth(
            final org.opennms.netmgt.config.mailtransporttest.UserAuth userAuth) {
        this._userAuth = userAuth;
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
     * org.opennms.netmgt.config.mailtransporttest.SendmailTest
     */
    public static org.opennms.netmgt.config.mailtransporttest.SendmailTest unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.mailtransporttest.SendmailTest) Unmarshaller.unmarshal(org.opennms.netmgt.config.mailtransporttest.SendmailTest.class, reader);
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
