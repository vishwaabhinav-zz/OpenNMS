/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.translator;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * An element representing a value to be used in a
 *  translation. 
 *  
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Value implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _result.
     */
    private java.lang.String _result;

    /**
     * Field _matches.
     */
    private java.lang.String _matches;

    /**
     * Field _type.
     */
    private java.lang.String _type;

    /**
     * Field _name.
     */
    private java.lang.String _name;

    /**
     * An element representing a value to be used in a
     *  translation. 
     *  
     */
    private java.util.List<org.opennms.netmgt.config.translator.Value> _valueList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Value() {
        super();
        this._valueList = new java.util.ArrayList<org.opennms.netmgt.config.translator.Value>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vValue
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addValue(
            final org.opennms.netmgt.config.translator.Value vValue)
    throws java.lang.IndexOutOfBoundsException {
        this._valueList.add(vValue);
    }

    /**
     * 
     * 
     * @param index
     * @param vValue
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addValue(
            final int index,
            final org.opennms.netmgt.config.translator.Value vValue)
    throws java.lang.IndexOutOfBoundsException {
        this._valueList.add(index, vValue);
    }

    /**
     * Method enumerateValue.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.translator.Value> enumerateValue(
    ) {
        return java.util.Collections.enumeration(this._valueList);
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
        
        if (obj instanceof Value) {
        
            Value temp = (Value)obj;
            if (this._result != null) {
                if (temp._result == null) return false;
                else if (!(this._result.equals(temp._result))) 
                    return false;
            }
            else if (temp._result != null)
                return false;
            if (this._matches != null) {
                if (temp._matches == null) return false;
                else if (!(this._matches.equals(temp._matches))) 
                    return false;
            }
            else if (temp._matches != null)
                return false;
            if (this._type != null) {
                if (temp._type == null) return false;
                else if (!(this._type.equals(temp._type))) 
                    return false;
            }
            else if (temp._type != null)
                return false;
            if (this._name != null) {
                if (temp._name == null) return false;
                else if (!(this._name.equals(temp._name))) 
                    return false;
            }
            else if (temp._name != null)
                return false;
            if (this._valueList != null) {
                if (temp._valueList == null) return false;
                else if (!(this._valueList.equals(temp._valueList))) 
                    return false;
            }
            else if (temp._valueList != null)
                return false;
            return true;
        }
        return false;
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
     * Returns the value of field 'name'.
     * 
     * @return the value of field 'Name'.
     */
    public java.lang.String getName(
    ) {
        return this._name;
    }

    /**
     * Returns the value of field 'result'.
     * 
     * @return the value of field 'Result'.
     */
    public java.lang.String getResult(
    ) {
        return this._result;
    }

    /**
     * Returns the value of field 'type'.
     * 
     * @return the value of field 'Type'.
     */
    public java.lang.String getType(
    ) {
        return this._type;
    }

    /**
     * Method getValue.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.translator.Value at the given index
     */
    public org.opennms.netmgt.config.translator.Value getValue(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._valueList.size()) {
            throw new IndexOutOfBoundsException("getValue: Index value '" + index + "' not in range [0.." + (this._valueList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.translator.Value) _valueList.get(index);
    }

    /**
     * Method getValue.Returns the contents of the collection in an
     * Array.  <p>Note:  Just in case the collection contents are
     * changing in another thread, we pass a 0-length Array of the
     * correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.translator.Value[] getValue(
    ) {
        org.opennms.netmgt.config.translator.Value[] array = new org.opennms.netmgt.config.translator.Value[0];
        return (org.opennms.netmgt.config.translator.Value[]) this._valueList.toArray(array);
    }

    /**
     * Method getValueCollection.Returns a reference to
     * '_valueList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.translator.Value> getValueCollection(
    ) {
        return this._valueList;
    }

    /**
     * Method getValueCount.
     * 
     * @return the size of this collection
     */
    public int getValueCount(
    ) {
        return this._valueList.size();
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
        if (_result != null) {
           result = 37 * result + _result.hashCode();
        }
        if (_matches != null) {
           result = 37 * result + _matches.hashCode();
        }
        if (_type != null) {
           result = 37 * result + _type.hashCode();
        }
        if (_name != null) {
           result = 37 * result + _name.hashCode();
        }
        if (_valueList != null) {
           result = 37 * result + _valueList.hashCode();
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
     * Method iterateValue.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.translator.Value> iterateValue(
    ) {
        return this._valueList.iterator();
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
    public void removeAllValue(
    ) {
        this._valueList.clear();
    }

    /**
     * Method removeValue.
     * 
     * @param vValue
     * @return true if the object was removed from the collection.
     */
    public boolean removeValue(
            final org.opennms.netmgt.config.translator.Value vValue) {
        boolean removed = _valueList.remove(vValue);
        return removed;
    }

    /**
     * Method removeValueAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.translator.Value removeValueAt(
            final int index) {
        java.lang.Object obj = this._valueList.remove(index);
        return (org.opennms.netmgt.config.translator.Value) obj;
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
     * Sets the value of field 'name'.
     * 
     * @param name the value of field 'name'.
     */
    public void setName(
            final java.lang.String name) {
        this._name = name;
    }

    /**
     * Sets the value of field 'result'.
     * 
     * @param result the value of field 'result'.
     */
    public void setResult(
            final java.lang.String result) {
        this._result = result;
    }

    /**
     * Sets the value of field 'type'.
     * 
     * @param type the value of field 'type'.
     */
    public void setType(
            final java.lang.String type) {
        this._type = type;
    }

    /**
     * 
     * 
     * @param index
     * @param vValue
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setValue(
            final int index,
            final org.opennms.netmgt.config.translator.Value vValue)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._valueList.size()) {
            throw new IndexOutOfBoundsException("setValue: Index value '" + index + "' not in range [0.." + (this._valueList.size() - 1) + "]");
        }
        
        this._valueList.set(index, vValue);
    }

    /**
     * 
     * 
     * @param vValueArray
     */
    public void setValue(
            final org.opennms.netmgt.config.translator.Value[] vValueArray) {
        //-- copy array
        _valueList.clear();
        
        for (int i = 0; i < vValueArray.length; i++) {
                this._valueList.add(vValueArray[i]);
        }
    }

    /**
     * Sets the value of '_valueList' by copying the given Vector.
     * All elements will be checked for type safety.
     * 
     * @param vValueList the Vector to copy.
     */
    public void setValue(
            final java.util.List<org.opennms.netmgt.config.translator.Value> vValueList) {
        // copy vector
        this._valueList.clear();
        
        this._valueList.addAll(vValueList);
    }

    /**
     * Sets the value of '_valueList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param valueList the Vector to set.
     */
    public void setValueCollection(
            final java.util.List<org.opennms.netmgt.config.translator.Value> valueList) {
        this._valueList = valueList;
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
     * org.opennms.netmgt.config.translator.Value
     */
    public static org.opennms.netmgt.config.translator.Value unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.translator.Value) Unmarshaller.unmarshal(org.opennms.netmgt.config.translator.Value.class, reader);
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
