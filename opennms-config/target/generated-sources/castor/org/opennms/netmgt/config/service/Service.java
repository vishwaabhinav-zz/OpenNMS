/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.service;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Service to be launched by the manager.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Service implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _name.
     */
    private java.lang.String _name;

    /**
     * Field _className.
     */
    private java.lang.String _className;

    /**
     * Field _attributeList.
     */
    private java.util.List<org.opennms.netmgt.config.service.Attribute> _attributeList;

    /**
     * Field _invokeList.
     */
    private java.util.List<org.opennms.netmgt.config.service.Invoke> _invokeList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Service() {
        super();
        this._attributeList = new java.util.ArrayList<org.opennms.netmgt.config.service.Attribute>();
        this._invokeList = new java.util.ArrayList<org.opennms.netmgt.config.service.Invoke>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vAttribute
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAttribute(
            final org.opennms.netmgt.config.service.Attribute vAttribute)
    throws java.lang.IndexOutOfBoundsException {
        this._attributeList.add(vAttribute);
    }

    /**
     * 
     * 
     * @param index
     * @param vAttribute
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAttribute(
            final int index,
            final org.opennms.netmgt.config.service.Attribute vAttribute)
    throws java.lang.IndexOutOfBoundsException {
        this._attributeList.add(index, vAttribute);
    }

    /**
     * 
     * 
     * @param vInvoke
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addInvoke(
            final org.opennms.netmgt.config.service.Invoke vInvoke)
    throws java.lang.IndexOutOfBoundsException {
        this._invokeList.add(vInvoke);
    }

    /**
     * 
     * 
     * @param index
     * @param vInvoke
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addInvoke(
            final int index,
            final org.opennms.netmgt.config.service.Invoke vInvoke)
    throws java.lang.IndexOutOfBoundsException {
        this._invokeList.add(index, vInvoke);
    }

    /**
     * Method enumerateAttribute.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.service.Attribute> enumerateAttribute(
    ) {
        return java.util.Collections.enumeration(this._attributeList);
    }

    /**
     * Method enumerateInvoke.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.service.Invoke> enumerateInvoke(
    ) {
        return java.util.Collections.enumeration(this._invokeList);
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
        
        if (obj instanceof Service) {
        
            Service temp = (Service)obj;
            if (this._name != null) {
                if (temp._name == null) return false;
                else if (!(this._name.equals(temp._name))) 
                    return false;
            }
            else if (temp._name != null)
                return false;
            if (this._className != null) {
                if (temp._className == null) return false;
                else if (!(this._className.equals(temp._className))) 
                    return false;
            }
            else if (temp._className != null)
                return false;
            if (this._attributeList != null) {
                if (temp._attributeList == null) return false;
                else if (!(this._attributeList.equals(temp._attributeList))) 
                    return false;
            }
            else if (temp._attributeList != null)
                return false;
            if (this._invokeList != null) {
                if (temp._invokeList == null) return false;
                else if (!(this._invokeList.equals(temp._invokeList))) 
                    return false;
            }
            else if (temp._invokeList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Method getAttribute.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.service.Attribute at the given inde
     */
    public org.opennms.netmgt.config.service.Attribute getAttribute(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._attributeList.size()) {
            throw new IndexOutOfBoundsException("getAttribute: Index value '" + index + "' not in range [0.." + (this._attributeList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.service.Attribute) _attributeList.get(index);
    }

    /**
     * Method getAttribute.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.service.Attribute[] getAttribute(
    ) {
        org.opennms.netmgt.config.service.Attribute[] array = new org.opennms.netmgt.config.service.Attribute[0];
        return (org.opennms.netmgt.config.service.Attribute[]) this._attributeList.toArray(array);
    }

    /**
     * Method getAttributeCollection.Returns a reference to
     * '_attributeList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.service.Attribute> getAttributeCollection(
    ) {
        return this._attributeList;
    }

    /**
     * Method getAttributeCount.
     * 
     * @return the size of this collection
     */
    public int getAttributeCount(
    ) {
        return this._attributeList.size();
    }

    /**
     * Returns the value of field 'className'.
     * 
     * @return the value of field 'ClassName'.
     */
    public java.lang.String getClassName(
    ) {
        return this._className;
    }

    /**
     * Method getInvoke.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.service.Invoke at the given index
     */
    public org.opennms.netmgt.config.service.Invoke getInvoke(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._invokeList.size()) {
            throw new IndexOutOfBoundsException("getInvoke: Index value '" + index + "' not in range [0.." + (this._invokeList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.service.Invoke) _invokeList.get(index);
    }

    /**
     * Method getInvoke.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.service.Invoke[] getInvoke(
    ) {
        org.opennms.netmgt.config.service.Invoke[] array = new org.opennms.netmgt.config.service.Invoke[0];
        return (org.opennms.netmgt.config.service.Invoke[]) this._invokeList.toArray(array);
    }

    /**
     * Method getInvokeCollection.Returns a reference to
     * '_invokeList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.service.Invoke> getInvokeCollection(
    ) {
        return this._invokeList;
    }

    /**
     * Method getInvokeCount.
     * 
     * @return the size of this collection
     */
    public int getInvokeCount(
    ) {
        return this._invokeList.size();
    }

    /**
     * Returns the value of field 'name'.
     * 
     * @return the value of field 'Name'.
     */
    public java.lang.String getName(
    ) {
        return this._name;
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
        if (_name != null) {
           result = 37 * result + _name.hashCode();
        }
        if (_className != null) {
           result = 37 * result + _className.hashCode();
        }
        if (_attributeList != null) {
           result = 37 * result + _attributeList.hashCode();
        }
        if (_invokeList != null) {
           result = 37 * result + _invokeList.hashCode();
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
     * Method iterateAttribute.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.service.Attribute> iterateAttribute(
    ) {
        return this._attributeList.iterator();
    }

    /**
     * Method iterateInvoke.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.service.Invoke> iterateInvoke(
    ) {
        return this._invokeList.iterator();
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
    public void removeAllAttribute(
    ) {
        this._attributeList.clear();
    }

    /**
     */
    public void removeAllInvoke(
    ) {
        this._invokeList.clear();
    }

    /**
     * Method removeAttribute.
     * 
     * @param vAttribute
     * @return true if the object was removed from the collection.
     */
    public boolean removeAttribute(
            final org.opennms.netmgt.config.service.Attribute vAttribute) {
        boolean removed = _attributeList.remove(vAttribute);
        return removed;
    }

    /**
     * Method removeAttributeAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.service.Attribute removeAttributeAt(
            final int index) {
        java.lang.Object obj = this._attributeList.remove(index);
        return (org.opennms.netmgt.config.service.Attribute) obj;
    }

    /**
     * Method removeInvoke.
     * 
     * @param vInvoke
     * @return true if the object was removed from the collection.
     */
    public boolean removeInvoke(
            final org.opennms.netmgt.config.service.Invoke vInvoke) {
        boolean removed = _invokeList.remove(vInvoke);
        return removed;
    }

    /**
     * Method removeInvokeAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.service.Invoke removeInvokeAt(
            final int index) {
        java.lang.Object obj = this._invokeList.remove(index);
        return (org.opennms.netmgt.config.service.Invoke) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vAttribute
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setAttribute(
            final int index,
            final org.opennms.netmgt.config.service.Attribute vAttribute)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._attributeList.size()) {
            throw new IndexOutOfBoundsException("setAttribute: Index value '" + index + "' not in range [0.." + (this._attributeList.size() - 1) + "]");
        }
        
        this._attributeList.set(index, vAttribute);
    }

    /**
     * 
     * 
     * @param vAttributeArray
     */
    public void setAttribute(
            final org.opennms.netmgt.config.service.Attribute[] vAttributeArray) {
        //-- copy array
        _attributeList.clear();
        
        for (int i = 0; i < vAttributeArray.length; i++) {
                this._attributeList.add(vAttributeArray[i]);
        }
    }

    /**
     * Sets the value of '_attributeList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vAttributeList the Vector to copy.
     */
    public void setAttribute(
            final java.util.List<org.opennms.netmgt.config.service.Attribute> vAttributeList) {
        // copy vector
        this._attributeList.clear();
        
        this._attributeList.addAll(vAttributeList);
    }

    /**
     * Sets the value of '_attributeList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param attributeList the Vector to set.
     */
    public void setAttributeCollection(
            final java.util.List<org.opennms.netmgt.config.service.Attribute> attributeList) {
        this._attributeList = attributeList;
    }

    /**
     * Sets the value of field 'className'.
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
     * @param vInvoke
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setInvoke(
            final int index,
            final org.opennms.netmgt.config.service.Invoke vInvoke)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._invokeList.size()) {
            throw new IndexOutOfBoundsException("setInvoke: Index value '" + index + "' not in range [0.." + (this._invokeList.size() - 1) + "]");
        }
        
        this._invokeList.set(index, vInvoke);
    }

    /**
     * 
     * 
     * @param vInvokeArray
     */
    public void setInvoke(
            final org.opennms.netmgt.config.service.Invoke[] vInvokeArray) {
        //-- copy array
        _invokeList.clear();
        
        for (int i = 0; i < vInvokeArray.length; i++) {
                this._invokeList.add(vInvokeArray[i]);
        }
    }

    /**
     * Sets the value of '_invokeList' by copying the given Vector.
     * All elements will be checked for type safety.
     * 
     * @param vInvokeList the Vector to copy.
     */
    public void setInvoke(
            final java.util.List<org.opennms.netmgt.config.service.Invoke> vInvokeList) {
        // copy vector
        this._invokeList.clear();
        
        this._invokeList.addAll(vInvokeList);
    }

    /**
     * Sets the value of '_invokeList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param invokeList the Vector to set.
     */
    public void setInvokeCollection(
            final java.util.List<org.opennms.netmgt.config.service.Invoke> invokeList) {
        this._invokeList = invokeList;
    }

    /**
     * Sets the value of field 'name'.
     * 
     * @param name the value of field 'name'.
     */
    public void setName(
            final java.lang.String name) {
        this._name = name;
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
     * org.opennms.netmgt.config.service.Service
     */
    public static org.opennms.netmgt.config.service.Service unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.service.Service) Unmarshaller.unmarshal(org.opennms.netmgt.config.service.Service.class, reader);
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
