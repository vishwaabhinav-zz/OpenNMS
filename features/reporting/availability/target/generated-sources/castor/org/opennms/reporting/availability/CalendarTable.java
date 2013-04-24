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
 * Class CalendarTable.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class CalendarTable implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _month.
     */
    private java.lang.String _month;

    /**
     * Field _daysOfWeek.
     */
    private org.opennms.reporting.availability.DaysOfWeek _daysOfWeek;

    /**
     * Field _weekList.
     */
    private java.util.List<org.opennms.reporting.availability.Week> _weekList;


      //----------------/
     //- Constructors -/
    //----------------/

    public CalendarTable() {
        super();
        this._weekList = new java.util.ArrayList<org.opennms.reporting.availability.Week>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vWeek
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addWeek(
            final org.opennms.reporting.availability.Week vWeek)
    throws java.lang.IndexOutOfBoundsException {
        // check for the maximum size
        if (this._weekList.size() >= 6) {
            throw new IndexOutOfBoundsException("addWeek has a maximum of 6");
        }
        
        this._weekList.add(vWeek);
    }

    /**
     * 
     * 
     * @param index
     * @param vWeek
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addWeek(
            final int index,
            final org.opennms.reporting.availability.Week vWeek)
    throws java.lang.IndexOutOfBoundsException {
        // check for the maximum size
        if (this._weekList.size() >= 6) {
            throw new IndexOutOfBoundsException("addWeek has a maximum of 6");
        }
        
        this._weekList.add(index, vWeek);
    }

    /**
     * Method enumerateWeek.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.reporting.availability.Week> enumerateWeek(
    ) {
        return java.util.Collections.enumeration(this._weekList);
    }

    /**
     * Returns the value of field 'daysOfWeek'.
     * 
     * @return the value of field 'DaysOfWeek'.
     */
    public org.opennms.reporting.availability.DaysOfWeek getDaysOfWeek(
    ) {
        return this._daysOfWeek;
    }

    /**
     * Returns the value of field 'month'.
     * 
     * @return the value of field 'Month'.
     */
    public java.lang.String getMonth(
    ) {
        return this._month;
    }

    /**
     * Method getWeek.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.reporting.availability.Week at the given index
     */
    public org.opennms.reporting.availability.Week getWeek(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._weekList.size()) {
            throw new IndexOutOfBoundsException("getWeek: Index value '" + index + "' not in range [0.." + (this._weekList.size() - 1) + "]");
        }
        
        return (org.opennms.reporting.availability.Week) _weekList.get(index);
    }

    /**
     * Method getWeek.Returns the contents of the collection in an
     * Array.  <p>Note:  Just in case the collection contents are
     * changing in another thread, we pass a 0-length Array of the
     * correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.reporting.availability.Week[] getWeek(
    ) {
        org.opennms.reporting.availability.Week[] array = new org.opennms.reporting.availability.Week[0];
        return (org.opennms.reporting.availability.Week[]) this._weekList.toArray(array);
    }

    /**
     * Method getWeekCollection.Returns a reference to '_weekList'.
     * No type checking is performed on any modifications to the
     * Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.reporting.availability.Week> getWeekCollection(
    ) {
        return this._weekList;
    }

    /**
     * Method getWeekCount.
     * 
     * @return the size of this collection
     */
    public int getWeekCount(
    ) {
        return this._weekList.size();
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
     * Method iterateWeek.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.reporting.availability.Week> iterateWeek(
    ) {
        return this._weekList.iterator();
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
    public void removeAllWeek(
    ) {
        this._weekList.clear();
    }

    /**
     * Method removeWeek.
     * 
     * @param vWeek
     * @return true if the object was removed from the collection.
     */
    public boolean removeWeek(
            final org.opennms.reporting.availability.Week vWeek) {
        boolean removed = _weekList.remove(vWeek);
        return removed;
    }

    /**
     * Method removeWeekAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.reporting.availability.Week removeWeekAt(
            final int index) {
        java.lang.Object obj = this._weekList.remove(index);
        return (org.opennms.reporting.availability.Week) obj;
    }

    /**
     * Sets the value of field 'daysOfWeek'.
     * 
     * @param daysOfWeek the value of field 'daysOfWeek'.
     */
    public void setDaysOfWeek(
            final org.opennms.reporting.availability.DaysOfWeek daysOfWeek) {
        this._daysOfWeek = daysOfWeek;
    }

    /**
     * Sets the value of field 'month'.
     * 
     * @param month the value of field 'month'.
     */
    public void setMonth(
            final java.lang.String month) {
        this._month = month;
    }

    /**
     * 
     * 
     * @param index
     * @param vWeek
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setWeek(
            final int index,
            final org.opennms.reporting.availability.Week vWeek)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._weekList.size()) {
            throw new IndexOutOfBoundsException("setWeek: Index value '" + index + "' not in range [0.." + (this._weekList.size() - 1) + "]");
        }
        
        this._weekList.set(index, vWeek);
    }

    /**
     * 
     * 
     * @param vWeekArray
     */
    public void setWeek(
            final org.opennms.reporting.availability.Week[] vWeekArray) {
        //-- copy array
        _weekList.clear();
        
        for (int i = 0; i < vWeekArray.length; i++) {
                this._weekList.add(vWeekArray[i]);
        }
    }

    /**
     * Sets the value of '_weekList' by copying the given Vector.
     * All elements will be checked for type safety.
     * 
     * @param vWeekList the Vector to copy.
     */
    public void setWeek(
            final java.util.List<org.opennms.reporting.availability.Week> vWeekList) {
        // copy vector
        this._weekList.clear();
        
        this._weekList.addAll(vWeekList);
    }

    /**
     * Sets the value of '_weekList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param weekList the Vector to set.
     */
    public void setWeekCollection(
            final java.util.List<org.opennms.reporting.availability.Week> weekList) {
        this._weekList = weekList;
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
     * org.opennms.reporting.availability.CalendarTable
     */
    public static org.opennms.reporting.availability.CalendarTable unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.reporting.availability.CalendarTable) Unmarshaller.unmarshal(org.opennms.reporting.availability.CalendarTable.class, reader);
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
