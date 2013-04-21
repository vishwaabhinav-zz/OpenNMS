/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.wmi;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * This is the top-level element for wmi-config.xml
 *  
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class WmiConfig implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Default timeout (in milliseconds).
     *  
     */
    private int _timeout;

    /**
     * keeps track of state for field: _timeout
     */
    private boolean _has_timeout;

    /**
     * Default number of retries.
     *  
     */
    private int _retry;

    /**
     * keeps track of state for field: _retry
     */
    private boolean _has_retry;

    /**
     * Default username.
     */
    private java.lang.String _username;

    /**
     * Default Windows Domain.
     *  
     */
    private java.lang.String _domain;

    /**
     * Default user password.
     *  
     */
    private java.lang.String _password;

    /**
     * Maps IP addresses to specific SNMP parmeters
     *  (retries, timeouts...)
     */
    private java.util.List<org.opennms.netmgt.config.wmi.Definition> _definitionList;


      //----------------/
     //- Constructors -/
    //----------------/

    public WmiConfig() {
        super();
        this._definitionList = new java.util.ArrayList<org.opennms.netmgt.config.wmi.Definition>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vDefinition
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDefinition(
            final org.opennms.netmgt.config.wmi.Definition vDefinition)
    throws java.lang.IndexOutOfBoundsException {
        this._definitionList.add(vDefinition);
    }

    /**
     * 
     * 
     * @param index
     * @param vDefinition
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDefinition(
            final int index,
            final org.opennms.netmgt.config.wmi.Definition vDefinition)
    throws java.lang.IndexOutOfBoundsException {
        this._definitionList.add(index, vDefinition);
    }

    /**
     */
    public void deleteRetry(
    ) {
        this._has_retry= false;
    }

    /**
     */
    public void deleteTimeout(
    ) {
        this._has_timeout= false;
    }

    /**
     * Method enumerateDefinition.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.wmi.Definition> enumerateDefinition(
    ) {
        return java.util.Collections.enumeration(this._definitionList);
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
        
        if (obj instanceof WmiConfig) {
        
            WmiConfig temp = (WmiConfig)obj;
            if (this._timeout != temp._timeout)
                return false;
            if (this._has_timeout != temp._has_timeout)
                return false;
            if (this._retry != temp._retry)
                return false;
            if (this._has_retry != temp._has_retry)
                return false;
            if (this._username != null) {
                if (temp._username == null) return false;
                else if (!(this._username.equals(temp._username))) 
                    return false;
            }
            else if (temp._username != null)
                return false;
            if (this._domain != null) {
                if (temp._domain == null) return false;
                else if (!(this._domain.equals(temp._domain))) 
                    return false;
            }
            else if (temp._domain != null)
                return false;
            if (this._password != null) {
                if (temp._password == null) return false;
                else if (!(this._password.equals(temp._password))) 
                    return false;
            }
            else if (temp._password != null)
                return false;
            if (this._definitionList != null) {
                if (temp._definitionList == null) return false;
                else if (!(this._definitionList.equals(temp._definitionList))) 
                    return false;
            }
            else if (temp._definitionList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Method getDefinition.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.wmi.Definition at the given index
     */
    public org.opennms.netmgt.config.wmi.Definition getDefinition(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._definitionList.size()) {
            throw new IndexOutOfBoundsException("getDefinition: Index value '" + index + "' not in range [0.." + (this._definitionList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.wmi.Definition) _definitionList.get(index);
    }

    /**
     * Method getDefinition.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.wmi.Definition[] getDefinition(
    ) {
        org.opennms.netmgt.config.wmi.Definition[] array = new org.opennms.netmgt.config.wmi.Definition[0];
        return (org.opennms.netmgt.config.wmi.Definition[]) this._definitionList.toArray(array);
    }

    /**
     * Method getDefinitionCollection.Returns a reference to
     * '_definitionList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.wmi.Definition> getDefinitionCollection(
    ) {
        return this._definitionList;
    }

    /**
     * Method getDefinitionCount.
     * 
     * @return the size of this collection
     */
    public int getDefinitionCount(
    ) {
        return this._definitionList.size();
    }

    /**
     * Returns the value of field 'domain'. The field 'domain' has
     * the following description: Default Windows Domain.
     *  
     * 
     * @return the value of field 'Domain'.
     */
    public java.lang.String getDomain(
    ) {
        return this._domain;
    }

    /**
     * Returns the value of field 'password'. The field 'password'
     * has the following description: Default user password.
     *  
     * 
     * @return the value of field 'Password'.
     */
    public java.lang.String getPassword(
    ) {
        return this._password;
    }

    /**
     * Returns the value of field 'retry'. The field 'retry' has
     * the following description: Default number of retries.
     *  
     * 
     * @return the value of field 'Retry'.
     */
    public int getRetry(
    ) {
        return this._retry;
    }

    /**
     * Returns the value of field 'timeout'. The field 'timeout'
     * has the following description: Default timeout (in
     * milliseconds).
     *  
     * 
     * @return the value of field 'Timeout'.
     */
    public int getTimeout(
    ) {
        return this._timeout;
    }

    /**
     * Returns the value of field 'username'. The field 'username'
     * has the following description: Default username.
     * 
     * @return the value of field 'Username'.
     */
    public java.lang.String getUsername(
    ) {
        return this._username;
    }

    /**
     * Method hasRetry.
     * 
     * @return true if at least one Retry has been added
     */
    public boolean hasRetry(
    ) {
        return this._has_retry;
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
        result = 37 * result + _timeout;
        result = 37 * result + _retry;
        if (_username != null) {
           result = 37 * result + _username.hashCode();
        }
        if (_domain != null) {
           result = 37 * result + _domain.hashCode();
        }
        if (_password != null) {
           result = 37 * result + _password.hashCode();
        }
        if (_definitionList != null) {
           result = 37 * result + _definitionList.hashCode();
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
     * Method iterateDefinition.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.wmi.Definition> iterateDefinition(
    ) {
        return this._definitionList.iterator();
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
    public void removeAllDefinition(
    ) {
        this._definitionList.clear();
    }

    /**
     * Method removeDefinition.
     * 
     * @param vDefinition
     * @return true if the object was removed from the collection.
     */
    public boolean removeDefinition(
            final org.opennms.netmgt.config.wmi.Definition vDefinition) {
        boolean removed = _definitionList.remove(vDefinition);
        return removed;
    }

    /**
     * Method removeDefinitionAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.wmi.Definition removeDefinitionAt(
            final int index) {
        java.lang.Object obj = this._definitionList.remove(index);
        return (org.opennms.netmgt.config.wmi.Definition) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vDefinition
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setDefinition(
            final int index,
            final org.opennms.netmgt.config.wmi.Definition vDefinition)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._definitionList.size()) {
            throw new IndexOutOfBoundsException("setDefinition: Index value '" + index + "' not in range [0.." + (this._definitionList.size() - 1) + "]");
        }
        
        this._definitionList.set(index, vDefinition);
    }

    /**
     * 
     * 
     * @param vDefinitionArray
     */
    public void setDefinition(
            final org.opennms.netmgt.config.wmi.Definition[] vDefinitionArray) {
        //-- copy array
        _definitionList.clear();
        
        for (int i = 0; i < vDefinitionArray.length; i++) {
                this._definitionList.add(vDefinitionArray[i]);
        }
    }

    /**
     * Sets the value of '_definitionList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vDefinitionList the Vector to copy.
     */
    public void setDefinition(
            final java.util.List<org.opennms.netmgt.config.wmi.Definition> vDefinitionList) {
        // copy vector
        this._definitionList.clear();
        
        this._definitionList.addAll(vDefinitionList);
    }

    /**
     * Sets the value of '_definitionList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param definitionList the Vector to set.
     */
    public void setDefinitionCollection(
            final java.util.List<org.opennms.netmgt.config.wmi.Definition> definitionList) {
        this._definitionList = definitionList;
    }

    /**
     * Sets the value of field 'domain'. The field 'domain' has the
     * following description: Default Windows Domain.
     *  
     * 
     * @param domain the value of field 'domain'.
     */
    public void setDomain(
            final java.lang.String domain) {
        this._domain = domain;
    }

    /**
     * Sets the value of field 'password'. The field 'password' has
     * the following description: Default user password.
     *  
     * 
     * @param password the value of field 'password'.
     */
    public void setPassword(
            final java.lang.String password) {
        this._password = password;
    }

    /**
     * Sets the value of field 'retry'. The field 'retry' has the
     * following description: Default number of retries.
     *  
     * 
     * @param retry the value of field 'retry'.
     */
    public void setRetry(
            final int retry) {
        this._retry = retry;
        this._has_retry = true;
    }

    /**
     * Sets the value of field 'timeout'. The field 'timeout' has
     * the following description: Default timeout (in
     * milliseconds).
     *  
     * 
     * @param timeout the value of field 'timeout'.
     */
    public void setTimeout(
            final int timeout) {
        this._timeout = timeout;
        this._has_timeout = true;
    }

    /**
     * Sets the value of field 'username'. The field 'username' has
     * the following description: Default username.
     * 
     * @param username the value of field 'username'.
     */
    public void setUsername(
            final java.lang.String username) {
        this._username = username;
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
     * org.opennms.netmgt.config.wmi.WmiConfig
     */
    public static org.opennms.netmgt.config.wmi.WmiConfig unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.wmi.WmiConfig) Unmarshaller.unmarshal(org.opennms.netmgt.config.wmi.WmiConfig.class, reader);
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
