/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.reporting;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class Parameters.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Parameters implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _stringParmList.
     */
    private java.util.List<org.opennms.netmgt.config.reporting.StringParm> _stringParmList;

    /**
     * Field _dateParmList.
     */
    private java.util.List<org.opennms.netmgt.config.reporting.DateParm> _dateParmList;

    /**
     * Field _intParmList.
     */
    private java.util.List<org.opennms.netmgt.config.reporting.IntParm> _intParmList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Parameters() {
        super();
        this._stringParmList = new java.util.ArrayList<org.opennms.netmgt.config.reporting.StringParm>();
        this._dateParmList = new java.util.ArrayList<org.opennms.netmgt.config.reporting.DateParm>();
        this._intParmList = new java.util.ArrayList<org.opennms.netmgt.config.reporting.IntParm>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vDateParm
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDateParm(
            final org.opennms.netmgt.config.reporting.DateParm vDateParm)
    throws java.lang.IndexOutOfBoundsException {
        this._dateParmList.add(vDateParm);
    }

    /**
     * 
     * 
     * @param index
     * @param vDateParm
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDateParm(
            final int index,
            final org.opennms.netmgt.config.reporting.DateParm vDateParm)
    throws java.lang.IndexOutOfBoundsException {
        this._dateParmList.add(index, vDateParm);
    }

    /**
     * 
     * 
     * @param vIntParm
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addIntParm(
            final org.opennms.netmgt.config.reporting.IntParm vIntParm)
    throws java.lang.IndexOutOfBoundsException {
        this._intParmList.add(vIntParm);
    }

    /**
     * 
     * 
     * @param index
     * @param vIntParm
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addIntParm(
            final int index,
            final org.opennms.netmgt.config.reporting.IntParm vIntParm)
    throws java.lang.IndexOutOfBoundsException {
        this._intParmList.add(index, vIntParm);
    }

    /**
     * 
     * 
     * @param vStringParm
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addStringParm(
            final org.opennms.netmgt.config.reporting.StringParm vStringParm)
    throws java.lang.IndexOutOfBoundsException {
        this._stringParmList.add(vStringParm);
    }

    /**
     * 
     * 
     * @param index
     * @param vStringParm
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addStringParm(
            final int index,
            final org.opennms.netmgt.config.reporting.StringParm vStringParm)
    throws java.lang.IndexOutOfBoundsException {
        this._stringParmList.add(index, vStringParm);
    }

    /**
     * Method enumerateDateParm.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.reporting.DateParm> enumerateDateParm(
    ) {
        return java.util.Collections.enumeration(this._dateParmList);
    }

    /**
     * Method enumerateIntParm.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.reporting.IntParm> enumerateIntParm(
    ) {
        return java.util.Collections.enumeration(this._intParmList);
    }

    /**
     * Method enumerateStringParm.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.reporting.StringParm> enumerateStringParm(
    ) {
        return java.util.Collections.enumeration(this._stringParmList);
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
        
        if (obj instanceof Parameters) {
        
            Parameters temp = (Parameters)obj;
            if (this._stringParmList != null) {
                if (temp._stringParmList == null) return false;
                else if (!(this._stringParmList.equals(temp._stringParmList))) 
                    return false;
            }
            else if (temp._stringParmList != null)
                return false;
            if (this._dateParmList != null) {
                if (temp._dateParmList == null) return false;
                else if (!(this._dateParmList.equals(temp._dateParmList))) 
                    return false;
            }
            else if (temp._dateParmList != null)
                return false;
            if (this._intParmList != null) {
                if (temp._intParmList == null) return false;
                else if (!(this._intParmList.equals(temp._intParmList))) 
                    return false;
            }
            else if (temp._intParmList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Method getDateParm.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.reporting.DateParm at the given
     * index
     */
    public org.opennms.netmgt.config.reporting.DateParm getDateParm(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._dateParmList.size()) {
            throw new IndexOutOfBoundsException("getDateParm: Index value '" + index + "' not in range [0.." + (this._dateParmList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.reporting.DateParm) _dateParmList.get(index);
    }

    /**
     * Method getDateParm.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.reporting.DateParm[] getDateParm(
    ) {
        org.opennms.netmgt.config.reporting.DateParm[] array = new org.opennms.netmgt.config.reporting.DateParm[0];
        return (org.opennms.netmgt.config.reporting.DateParm[]) this._dateParmList.toArray(array);
    }

    /**
     * Method getDateParmCollection.Returns a reference to
     * '_dateParmList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.reporting.DateParm> getDateParmCollection(
    ) {
        return this._dateParmList;
    }

    /**
     * Method getDateParmCount.
     * 
     * @return the size of this collection
     */
    public int getDateParmCount(
    ) {
        return this._dateParmList.size();
    }

    /**
     * Method getIntParm.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.reporting.IntParm at the given inde
     */
    public org.opennms.netmgt.config.reporting.IntParm getIntParm(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._intParmList.size()) {
            throw new IndexOutOfBoundsException("getIntParm: Index value '" + index + "' not in range [0.." + (this._intParmList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.reporting.IntParm) _intParmList.get(index);
    }

    /**
     * Method getIntParm.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.reporting.IntParm[] getIntParm(
    ) {
        org.opennms.netmgt.config.reporting.IntParm[] array = new org.opennms.netmgt.config.reporting.IntParm[0];
        return (org.opennms.netmgt.config.reporting.IntParm[]) this._intParmList.toArray(array);
    }

    /**
     * Method getIntParmCollection.Returns a reference to
     * '_intParmList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.reporting.IntParm> getIntParmCollection(
    ) {
        return this._intParmList;
    }

    /**
     * Method getIntParmCount.
     * 
     * @return the size of this collection
     */
    public int getIntParmCount(
    ) {
        return this._intParmList.size();
    }

    /**
     * Method getStringParm.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.reporting.StringParm at the given
     * index
     */
    public org.opennms.netmgt.config.reporting.StringParm getStringParm(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._stringParmList.size()) {
            throw new IndexOutOfBoundsException("getStringParm: Index value '" + index + "' not in range [0.." + (this._stringParmList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.reporting.StringParm) _stringParmList.get(index);
    }

    /**
     * Method getStringParm.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.reporting.StringParm[] getStringParm(
    ) {
        org.opennms.netmgt.config.reporting.StringParm[] array = new org.opennms.netmgt.config.reporting.StringParm[0];
        return (org.opennms.netmgt.config.reporting.StringParm[]) this._stringParmList.toArray(array);
    }

    /**
     * Method getStringParmCollection.Returns a reference to
     * '_stringParmList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.reporting.StringParm> getStringParmCollection(
    ) {
        return this._stringParmList;
    }

    /**
     * Method getStringParmCount.
     * 
     * @return the size of this collection
     */
    public int getStringParmCount(
    ) {
        return this._stringParmList.size();
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
        if (_stringParmList != null) {
           result = 37 * result + _stringParmList.hashCode();
        }
        if (_dateParmList != null) {
           result = 37 * result + _dateParmList.hashCode();
        }
        if (_intParmList != null) {
           result = 37 * result + _intParmList.hashCode();
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
     * Method iterateDateParm.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.reporting.DateParm> iterateDateParm(
    ) {
        return this._dateParmList.iterator();
    }

    /**
     * Method iterateIntParm.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.reporting.IntParm> iterateIntParm(
    ) {
        return this._intParmList.iterator();
    }

    /**
     * Method iterateStringParm.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.reporting.StringParm> iterateStringParm(
    ) {
        return this._stringParmList.iterator();
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
    public void removeAllDateParm(
    ) {
        this._dateParmList.clear();
    }

    /**
     */
    public void removeAllIntParm(
    ) {
        this._intParmList.clear();
    }

    /**
     */
    public void removeAllStringParm(
    ) {
        this._stringParmList.clear();
    }

    /**
     * Method removeDateParm.
     * 
     * @param vDateParm
     * @return true if the object was removed from the collection.
     */
    public boolean removeDateParm(
            final org.opennms.netmgt.config.reporting.DateParm vDateParm) {
        boolean removed = _dateParmList.remove(vDateParm);
        return removed;
    }

    /**
     * Method removeDateParmAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.reporting.DateParm removeDateParmAt(
            final int index) {
        java.lang.Object obj = this._dateParmList.remove(index);
        return (org.opennms.netmgt.config.reporting.DateParm) obj;
    }

    /**
     * Method removeIntParm.
     * 
     * @param vIntParm
     * @return true if the object was removed from the collection.
     */
    public boolean removeIntParm(
            final org.opennms.netmgt.config.reporting.IntParm vIntParm) {
        boolean removed = _intParmList.remove(vIntParm);
        return removed;
    }

    /**
     * Method removeIntParmAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.reporting.IntParm removeIntParmAt(
            final int index) {
        java.lang.Object obj = this._intParmList.remove(index);
        return (org.opennms.netmgt.config.reporting.IntParm) obj;
    }

    /**
     * Method removeStringParm.
     * 
     * @param vStringParm
     * @return true if the object was removed from the collection.
     */
    public boolean removeStringParm(
            final org.opennms.netmgt.config.reporting.StringParm vStringParm) {
        boolean removed = _stringParmList.remove(vStringParm);
        return removed;
    }

    /**
     * Method removeStringParmAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.reporting.StringParm removeStringParmAt(
            final int index) {
        java.lang.Object obj = this._stringParmList.remove(index);
        return (org.opennms.netmgt.config.reporting.StringParm) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vDateParm
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setDateParm(
            final int index,
            final org.opennms.netmgt.config.reporting.DateParm vDateParm)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._dateParmList.size()) {
            throw new IndexOutOfBoundsException("setDateParm: Index value '" + index + "' not in range [0.." + (this._dateParmList.size() - 1) + "]");
        }
        
        this._dateParmList.set(index, vDateParm);
    }

    /**
     * 
     * 
     * @param vDateParmArray
     */
    public void setDateParm(
            final org.opennms.netmgt.config.reporting.DateParm[] vDateParmArray) {
        //-- copy array
        _dateParmList.clear();
        
        for (int i = 0; i < vDateParmArray.length; i++) {
                this._dateParmList.add(vDateParmArray[i]);
        }
    }

    /**
     * Sets the value of '_dateParmList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vDateParmList the Vector to copy.
     */
    public void setDateParm(
            final java.util.List<org.opennms.netmgt.config.reporting.DateParm> vDateParmList) {
        // copy vector
        this._dateParmList.clear();
        
        this._dateParmList.addAll(vDateParmList);
    }

    /**
     * Sets the value of '_dateParmList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param dateParmList the Vector to set.
     */
    public void setDateParmCollection(
            final java.util.List<org.opennms.netmgt.config.reporting.DateParm> dateParmList) {
        this._dateParmList = dateParmList;
    }

    /**
     * 
     * 
     * @param index
     * @param vIntParm
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setIntParm(
            final int index,
            final org.opennms.netmgt.config.reporting.IntParm vIntParm)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._intParmList.size()) {
            throw new IndexOutOfBoundsException("setIntParm: Index value '" + index + "' not in range [0.." + (this._intParmList.size() - 1) + "]");
        }
        
        this._intParmList.set(index, vIntParm);
    }

    /**
     * 
     * 
     * @param vIntParmArray
     */
    public void setIntParm(
            final org.opennms.netmgt.config.reporting.IntParm[] vIntParmArray) {
        //-- copy array
        _intParmList.clear();
        
        for (int i = 0; i < vIntParmArray.length; i++) {
                this._intParmList.add(vIntParmArray[i]);
        }
    }

    /**
     * Sets the value of '_intParmList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vIntParmList the Vector to copy.
     */
    public void setIntParm(
            final java.util.List<org.opennms.netmgt.config.reporting.IntParm> vIntParmList) {
        // copy vector
        this._intParmList.clear();
        
        this._intParmList.addAll(vIntParmList);
    }

    /**
     * Sets the value of '_intParmList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param intParmList the Vector to set.
     */
    public void setIntParmCollection(
            final java.util.List<org.opennms.netmgt.config.reporting.IntParm> intParmList) {
        this._intParmList = intParmList;
    }

    /**
     * 
     * 
     * @param index
     * @param vStringParm
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setStringParm(
            final int index,
            final org.opennms.netmgt.config.reporting.StringParm vStringParm)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._stringParmList.size()) {
            throw new IndexOutOfBoundsException("setStringParm: Index value '" + index + "' not in range [0.." + (this._stringParmList.size() - 1) + "]");
        }
        
        this._stringParmList.set(index, vStringParm);
    }

    /**
     * 
     * 
     * @param vStringParmArray
     */
    public void setStringParm(
            final org.opennms.netmgt.config.reporting.StringParm[] vStringParmArray) {
        //-- copy array
        _stringParmList.clear();
        
        for (int i = 0; i < vStringParmArray.length; i++) {
                this._stringParmList.add(vStringParmArray[i]);
        }
    }

    /**
     * Sets the value of '_stringParmList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vStringParmList the Vector to copy.
     */
    public void setStringParm(
            final java.util.List<org.opennms.netmgt.config.reporting.StringParm> vStringParmList) {
        // copy vector
        this._stringParmList.clear();
        
        this._stringParmList.addAll(vStringParmList);
    }

    /**
     * Sets the value of '_stringParmList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param stringParmList the Vector to set.
     */
    public void setStringParmCollection(
            final java.util.List<org.opennms.netmgt.config.reporting.StringParm> stringParmList) {
        this._stringParmList = stringParmList;
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
     * org.opennms.netmgt.config.reporting.Parameters
     */
    public static org.opennms.netmgt.config.reporting.Parameters unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.reporting.Parameters) Unmarshaller.unmarshal(org.opennms.netmgt.config.reporting.Parameters.class, reader);
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
