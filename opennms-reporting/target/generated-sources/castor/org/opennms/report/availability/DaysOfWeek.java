/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.report.availability;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class DaysOfWeek.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class DaysOfWeek implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _dayNameList.
     */
    private java.util.List<java.lang.String> _dayNameList;


      //----------------/
     //- Constructors -/
    //----------------/

    public DaysOfWeek() {
        super();
        this._dayNameList = new java.util.ArrayList<java.lang.String>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vDayName
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDayName(
            final java.lang.String vDayName)
    throws java.lang.IndexOutOfBoundsException {
        // check for the maximum size
        if (this._dayNameList.size() >= 7) {
            throw new IndexOutOfBoundsException("addDayName has a maximum of 7");
        }
        
        this._dayNameList.add(vDayName);
    }

    /**
     * 
     * 
     * @param index
     * @param vDayName
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDayName(
            final int index,
            final java.lang.String vDayName)
    throws java.lang.IndexOutOfBoundsException {
        // check for the maximum size
        if (this._dayNameList.size() >= 7) {
            throw new IndexOutOfBoundsException("addDayName has a maximum of 7");
        }
        
        this._dayNameList.add(index, vDayName);
    }

    /**
     * Method enumerateDayName.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<java.lang.String> enumerateDayName(
    ) {
        return java.util.Collections.enumeration(this._dayNameList);
    }

    /**
     * Method getDayName.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the java.lang.String at the given index
     */
    public java.lang.String getDayName(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._dayNameList.size()) {
            throw new IndexOutOfBoundsException("getDayName: Index value '" + index + "' not in range [0.." + (this._dayNameList.size() - 1) + "]");
        }
        
        return (java.lang.String) _dayNameList.get(index);
    }

    /**
     * Method getDayName.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public java.lang.String[] getDayName(
    ) {
        java.lang.String[] array = new java.lang.String[0];
        return (java.lang.String[]) this._dayNameList.toArray(array);
    }

    /**
     * Method getDayNameCollection.Returns a reference to
     * '_dayNameList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<java.lang.String> getDayNameCollection(
    ) {
        return this._dayNameList;
    }

    /**
     * Method getDayNameCount.
     * 
     * @return the size of this collection
     */
    public int getDayNameCount(
    ) {
        return this._dayNameList.size();
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
     * Method iterateDayName.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<java.lang.String> iterateDayName(
    ) {
        return this._dayNameList.iterator();
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
    public void removeAllDayName(
    ) {
        this._dayNameList.clear();
    }

    /**
     * Method removeDayName.
     * 
     * @param vDayName
     * @return true if the object was removed from the collection.
     */
    public boolean removeDayName(
            final java.lang.String vDayName) {
        boolean removed = _dayNameList.remove(vDayName);
        return removed;
    }

    /**
     * Method removeDayNameAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public java.lang.String removeDayNameAt(
            final int index) {
        java.lang.Object obj = this._dayNameList.remove(index);
        return (java.lang.String) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vDayName
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setDayName(
            final int index,
            final java.lang.String vDayName)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._dayNameList.size()) {
            throw new IndexOutOfBoundsException("setDayName: Index value '" + index + "' not in range [0.." + (this._dayNameList.size() - 1) + "]");
        }
        
        this._dayNameList.set(index, vDayName);
    }

    /**
     * 
     * 
     * @param vDayNameArray
     */
    public void setDayName(
            final java.lang.String[] vDayNameArray) {
        //-- copy array
        _dayNameList.clear();
        
        for (int i = 0; i < vDayNameArray.length; i++) {
                this._dayNameList.add(vDayNameArray[i]);
        }
    }

    /**
     * Sets the value of '_dayNameList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vDayNameList the Vector to copy.
     */
    public void setDayName(
            final java.util.List<java.lang.String> vDayNameList) {
        // copy vector
        this._dayNameList.clear();
        
        this._dayNameList.addAll(vDayNameList);
    }

    /**
     * Sets the value of '_dayNameList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param dayNameList the Vector to set.
     */
    public void setDayNameCollection(
            final java.util.List<java.lang.String> dayNameList) {
        this._dayNameList = dayNameList;
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
     * org.opennms.report.availability.DaysOfWeek
     */
    public static org.opennms.report.availability.DaysOfWeek unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.report.availability.DaysOfWeek) Unmarshaller.unmarshal(org.opennms.report.availability.DaysOfWeek.class, reader);
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
