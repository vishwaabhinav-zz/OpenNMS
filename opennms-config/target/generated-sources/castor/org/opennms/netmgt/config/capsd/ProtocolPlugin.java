/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.capsd;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * protocol plugin definition
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class ProtocolPlugin implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * protocol name
     */
    private java.lang.String _protocol;

    /**
     * Java class name of the plugin used for testing this
     *  protocol.
     */
    private java.lang.String _className;

    /**
     * Controls whether this protocol is scanned by Capsd.
     *  The default is 'on'.
     */
    private java.lang.String _scan = "on";

    /**
     * Specifies if the protocol was added by the user via
     *  the UI.
     */
    private java.lang.String _userDefined = "false";

    /**
     * IP address/range specific protocol
     *  configuration
     */
    private java.util.List<org.opennms.netmgt.config.capsd.ProtocolConfiguration> _protocolConfigurationList;

    /**
     * key/value pair passed in to the
     *  plugin
     */
    private java.util.List<org.opennms.netmgt.config.capsd.Property> _propertyList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ProtocolPlugin() {
        super();
        setScan("on");
        setUserDefined("false");
        this._protocolConfigurationList = new java.util.ArrayList<org.opennms.netmgt.config.capsd.ProtocolConfiguration>();
        this._propertyList = new java.util.ArrayList<org.opennms.netmgt.config.capsd.Property>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vProperty
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addProperty(
            final org.opennms.netmgt.config.capsd.Property vProperty)
    throws java.lang.IndexOutOfBoundsException {
        this._propertyList.add(vProperty);
    }

    /**
     * 
     * 
     * @param index
     * @param vProperty
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addProperty(
            final int index,
            final org.opennms.netmgt.config.capsd.Property vProperty)
    throws java.lang.IndexOutOfBoundsException {
        this._propertyList.add(index, vProperty);
    }

    /**
     * 
     * 
     * @param vProtocolConfiguration
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addProtocolConfiguration(
            final org.opennms.netmgt.config.capsd.ProtocolConfiguration vProtocolConfiguration)
    throws java.lang.IndexOutOfBoundsException {
        this._protocolConfigurationList.add(vProtocolConfiguration);
    }

    /**
     * 
     * 
     * @param index
     * @param vProtocolConfiguration
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addProtocolConfiguration(
            final int index,
            final org.opennms.netmgt.config.capsd.ProtocolConfiguration vProtocolConfiguration)
    throws java.lang.IndexOutOfBoundsException {
        this._protocolConfigurationList.add(index, vProtocolConfiguration);
    }

    /**
     * Method enumerateProperty.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.capsd.Property> enumerateProperty(
    ) {
        return java.util.Collections.enumeration(this._propertyList);
    }

    /**
     * Method enumerateProtocolConfiguration.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.capsd.ProtocolConfiguration> enumerateProtocolConfiguration(
    ) {
        return java.util.Collections.enumeration(this._protocolConfigurationList);
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
        
        if (obj instanceof ProtocolPlugin) {
        
            ProtocolPlugin temp = (ProtocolPlugin)obj;
            if (this._protocol != null) {
                if (temp._protocol == null) return false;
                else if (!(this._protocol.equals(temp._protocol))) 
                    return false;
            }
            else if (temp._protocol != null)
                return false;
            if (this._className != null) {
                if (temp._className == null) return false;
                else if (!(this._className.equals(temp._className))) 
                    return false;
            }
            else if (temp._className != null)
                return false;
            if (this._scan != null) {
                if (temp._scan == null) return false;
                else if (!(this._scan.equals(temp._scan))) 
                    return false;
            }
            else if (temp._scan != null)
                return false;
            if (this._userDefined != null) {
                if (temp._userDefined == null) return false;
                else if (!(this._userDefined.equals(temp._userDefined))) 
                    return false;
            }
            else if (temp._userDefined != null)
                return false;
            if (this._protocolConfigurationList != null) {
                if (temp._protocolConfigurationList == null) return false;
                else if (!(this._protocolConfigurationList.equals(temp._protocolConfigurationList))) 
                    return false;
            }
            else if (temp._protocolConfigurationList != null)
                return false;
            if (this._propertyList != null) {
                if (temp._propertyList == null) return false;
                else if (!(this._propertyList.equals(temp._propertyList))) 
                    return false;
            }
            else if (temp._propertyList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'className'. The field
     * 'className' has the following description: Java class name
     * of the plugin used for testing this
     *  protocol.
     * 
     * @return the value of field 'ClassName'.
     */
    public java.lang.String getClassName(
    ) {
        return this._className;
    }

    /**
     * Method getProperty.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.capsd.Property at the given index
     */
    public org.opennms.netmgt.config.capsd.Property getProperty(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._propertyList.size()) {
            throw new IndexOutOfBoundsException("getProperty: Index value '" + index + "' not in range [0.." + (this._propertyList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.capsd.Property) _propertyList.get(index);
    }

    /**
     * Method getProperty.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.capsd.Property[] getProperty(
    ) {
        org.opennms.netmgt.config.capsd.Property[] array = new org.opennms.netmgt.config.capsd.Property[0];
        return (org.opennms.netmgt.config.capsd.Property[]) this._propertyList.toArray(array);
    }

    /**
     * Method getPropertyCollection.Returns a reference to
     * '_propertyList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.capsd.Property> getPropertyCollection(
    ) {
        return this._propertyList;
    }

    /**
     * Method getPropertyCount.
     * 
     * @return the size of this collection
     */
    public int getPropertyCount(
    ) {
        return this._propertyList.size();
    }

    /**
     * Returns the value of field 'protocol'. The field 'protocol'
     * has the following description: protocol name
     * 
     * @return the value of field 'Protocol'.
     */
    public java.lang.String getProtocol(
    ) {
        return this._protocol;
    }

    /**
     * Method getProtocolConfiguration.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.capsd.ProtocolConfiguration at the
     * given index
     */
    public org.opennms.netmgt.config.capsd.ProtocolConfiguration getProtocolConfiguration(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._protocolConfigurationList.size()) {
            throw new IndexOutOfBoundsException("getProtocolConfiguration: Index value '" + index + "' not in range [0.." + (this._protocolConfigurationList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.capsd.ProtocolConfiguration) _protocolConfigurationList.get(index);
    }

    /**
     * Method getProtocolConfiguration.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.capsd.ProtocolConfiguration[] getProtocolConfiguration(
    ) {
        org.opennms.netmgt.config.capsd.ProtocolConfiguration[] array = new org.opennms.netmgt.config.capsd.ProtocolConfiguration[0];
        return (org.opennms.netmgt.config.capsd.ProtocolConfiguration[]) this._protocolConfigurationList.toArray(array);
    }

    /**
     * Method getProtocolConfigurationCollection.Returns a
     * reference to '_protocolConfigurationList'. No type checking
     * is performed on any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.capsd.ProtocolConfiguration> getProtocolConfigurationCollection(
    ) {
        return this._protocolConfigurationList;
    }

    /**
     * Method getProtocolConfigurationCount.
     * 
     * @return the size of this collection
     */
    public int getProtocolConfigurationCount(
    ) {
        return this._protocolConfigurationList.size();
    }

    /**
     * Returns the value of field 'scan'. The field 'scan' has the
     * following description: Controls whether this protocol is
     * scanned by Capsd.
     *  The default is 'on'.
     * 
     * @return the value of field 'Scan'.
     */
    public java.lang.String getScan(
    ) {
        return this._scan;
    }

    /**
     * Returns the value of field 'userDefined'. The field
     * 'userDefined' has the following description: Specifies if
     * the protocol was added by the user via
     *  the UI.
     * 
     * @return the value of field 'UserDefined'.
     */
    public java.lang.String getUserDefined(
    ) {
        return this._userDefined;
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
        if (_protocol != null) {
           result = 37 * result + _protocol.hashCode();
        }
        if (_className != null) {
           result = 37 * result + _className.hashCode();
        }
        if (_scan != null) {
           result = 37 * result + _scan.hashCode();
        }
        if (_userDefined != null) {
           result = 37 * result + _userDefined.hashCode();
        }
        if (_protocolConfigurationList != null) {
           result = 37 * result + _protocolConfigurationList.hashCode();
        }
        if (_propertyList != null) {
           result = 37 * result + _propertyList.hashCode();
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
     * Method iterateProperty.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.capsd.Property> iterateProperty(
    ) {
        return this._propertyList.iterator();
    }

    /**
     * Method iterateProtocolConfiguration.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.capsd.ProtocolConfiguration> iterateProtocolConfiguration(
    ) {
        return this._protocolConfigurationList.iterator();
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
    public void removeAllProperty(
    ) {
        this._propertyList.clear();
    }

    /**
     */
    public void removeAllProtocolConfiguration(
    ) {
        this._protocolConfigurationList.clear();
    }

    /**
     * Method removeProperty.
     * 
     * @param vProperty
     * @return true if the object was removed from the collection.
     */
    public boolean removeProperty(
            final org.opennms.netmgt.config.capsd.Property vProperty) {
        boolean removed = _propertyList.remove(vProperty);
        return removed;
    }

    /**
     * Method removePropertyAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.capsd.Property removePropertyAt(
            final int index) {
        java.lang.Object obj = this._propertyList.remove(index);
        return (org.opennms.netmgt.config.capsd.Property) obj;
    }

    /**
     * Method removeProtocolConfiguration.
     * 
     * @param vProtocolConfiguration
     * @return true if the object was removed from the collection.
     */
    public boolean removeProtocolConfiguration(
            final org.opennms.netmgt.config.capsd.ProtocolConfiguration vProtocolConfiguration) {
        boolean removed = _protocolConfigurationList.remove(vProtocolConfiguration);
        return removed;
    }

    /**
     * Method removeProtocolConfigurationAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.capsd.ProtocolConfiguration removeProtocolConfigurationAt(
            final int index) {
        java.lang.Object obj = this._protocolConfigurationList.remove(index);
        return (org.opennms.netmgt.config.capsd.ProtocolConfiguration) obj;
    }

    /**
     * Sets the value of field 'className'. The field 'className'
     * has the following description: Java class name of the plugin
     * used for testing this
     *  protocol.
     * 
     * @param className the value of field 'className'.
     */
    public void setClassName(
            final java.lang.String className) {
        this._className = className;
    }

    /**
     * 
     * 
     * @param index
     * @param vProperty
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setProperty(
            final int index,
            final org.opennms.netmgt.config.capsd.Property vProperty)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._propertyList.size()) {
            throw new IndexOutOfBoundsException("setProperty: Index value '" + index + "' not in range [0.." + (this._propertyList.size() - 1) + "]");
        }
        
        this._propertyList.set(index, vProperty);
    }

    /**
     * 
     * 
     * @param vPropertyArray
     */
    public void setProperty(
            final org.opennms.netmgt.config.capsd.Property[] vPropertyArray) {
        //-- copy array
        _propertyList.clear();
        
        for (int i = 0; i < vPropertyArray.length; i++) {
                this._propertyList.add(vPropertyArray[i]);
        }
    }

    /**
     * Sets the value of '_propertyList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vPropertyList the Vector to copy.
     */
    public void setProperty(
            final java.util.List<org.opennms.netmgt.config.capsd.Property> vPropertyList) {
        // copy vector
        this._propertyList.clear();
        
        this._propertyList.addAll(vPropertyList);
    }

    /**
     * Sets the value of '_propertyList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param propertyList the Vector to set.
     */
    public void setPropertyCollection(
            final java.util.List<org.opennms.netmgt.config.capsd.Property> propertyList) {
        this._propertyList = propertyList;
    }

    /**
     * Sets the value of field 'protocol'. The field 'protocol' has
     * the following description: protocol name
     * 
     * @param protocol the value of field 'protocol'.
     */
    public void setProtocol(
            final java.lang.String protocol) {
        this._protocol = protocol;
    }

    /**
     * 
     * 
     * @param index
     * @param vProtocolConfiguration
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setProtocolConfiguration(
            final int index,
            final org.opennms.netmgt.config.capsd.ProtocolConfiguration vProtocolConfiguration)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._protocolConfigurationList.size()) {
            throw new IndexOutOfBoundsException("setProtocolConfiguration: Index value '" + index + "' not in range [0.." + (this._protocolConfigurationList.size() - 1) + "]");
        }
        
        this._protocolConfigurationList.set(index, vProtocolConfiguration);
    }

    /**
     * 
     * 
     * @param vProtocolConfigurationArray
     */
    public void setProtocolConfiguration(
            final org.opennms.netmgt.config.capsd.ProtocolConfiguration[] vProtocolConfigurationArray) {
        //-- copy array
        _protocolConfigurationList.clear();
        
        for (int i = 0; i < vProtocolConfigurationArray.length; i++) {
                this._protocolConfigurationList.add(vProtocolConfigurationArray[i]);
        }
    }

    /**
     * Sets the value of '_protocolConfigurationList' by copying
     * the given Vector. All elements will be checked for type
     * safety.
     * 
     * @param vProtocolConfigurationList the Vector to copy.
     */
    public void setProtocolConfiguration(
            final java.util.List<org.opennms.netmgt.config.capsd.ProtocolConfiguration> vProtocolConfigurationList) {
        // copy vector
        this._protocolConfigurationList.clear();
        
        this._protocolConfigurationList.addAll(vProtocolConfigurationList);
    }

    /**
     * Sets the value of '_protocolConfigurationList' by setting it
     * to the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param protocolConfigurationList the Vector to set.
     */
    public void setProtocolConfigurationCollection(
            final java.util.List<org.opennms.netmgt.config.capsd.ProtocolConfiguration> protocolConfigurationList) {
        this._protocolConfigurationList = protocolConfigurationList;
    }

    /**
     * Sets the value of field 'scan'. The field 'scan' has the
     * following description: Controls whether this protocol is
     * scanned by Capsd.
     *  The default is 'on'.
     * 
     * @param scan the value of field 'scan'.
     */
    public void setScan(
            final java.lang.String scan) {
        this._scan = scan;
    }

    /**
     * Sets the value of field 'userDefined'. The field
     * 'userDefined' has the following description: Specifies if
     * the protocol was added by the user via
     *  the UI.
     * 
     * @param userDefined the value of field 'userDefined'.
     */
    public void setUserDefined(
            final java.lang.String userDefined) {
        this._userDefined = userDefined;
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
     * org.opennms.netmgt.config.capsd.ProtocolPlugin
     */
    public static org.opennms.netmgt.config.capsd.ProtocolPlugin unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.capsd.ProtocolPlugin) Unmarshaller.unmarshal(org.opennms.netmgt.config.capsd.ProtocolPlugin.class, reader);
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
