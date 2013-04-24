/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.reporting.availability;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class Row.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Row implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _valueList.
     */
    private java.util.List<org.opennms.reporting.availability.Value> _valueList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Row() {
        super();
        this._valueList = new java.util.ArrayList<org.opennms.reporting.availability.Value>();
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
            final org.opennms.reporting.availability.Value vValue)
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
            final org.opennms.reporting.availability.Value vValue)
    throws java.lang.IndexOutOfBoundsException {
        this._valueList.add(index, vValue);
    }

    /**
     * Method enumerateValue.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.reporting.availability.Value> enumerateValue(
    ) {
        return java.util.Collections.enumeration(this._valueList);
    }

    /**
     * Method getValue.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.reporting.availability.Value at the given index
     */
    public org.opennms.reporting.availability.Value getValue(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._valueList.size()) {
            throw new IndexOutOfBoundsException("getValue: Index value '" + index + "' not in range [0.." + (this._valueList.size() - 1) + "]");
        }
        
        return (org.opennms.reporting.availability.Value) _valueList.get(index);
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
    public org.opennms.reporting.availability.Value[] getValue(
    ) {
        org.opennms.reporting.availability.Value[] array = new org.opennms.reporting.availability.Value[0];
        return (org.opennms.reporting.availability.Value[]) this._valueList.toArray(array);
    }

    /**
     * Method getValueCollection.Returns a reference to
     * '_valueList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.reporting.availability.Value> getValueCollection(
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
    public java.util.Iterator<org.opennms.reporting.availability.Value> iterateValue(
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
            final org.opennms.reporting.availability.Value vValue) {
        boolean removed = _valueList.remove(vValue);
        return removed;
    }

    /**
     * Method removeValueAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.reporting.availability.Value removeValueAt(
            final int index) {
        java.lang.Object obj = this._valueList.remove(index);
        return (org.opennms.reporting.availability.Value) obj;
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
            final org.opennms.reporting.availability.Value vValue)
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
            final org.opennms.reporting.availability.Value[] vValueArray) {
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
            final java.util.List<org.opennms.reporting.availability.Value> vValueList) {
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
            final java.util.List<org.opennms.reporting.availability.Value> valueList) {
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
     * @return the unmarshaled org.opennms.reporting.availability.Ro
     */
    public static org.opennms.reporting.availability.Row unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.reporting.availability.Row) Unmarshaller.unmarshal(org.opennms.reporting.availability.Row.class, reader);
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
