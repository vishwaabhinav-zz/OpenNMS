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
 * Class Created.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Created implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * internal content storage
     */
    private java.math.BigDecimal _content;

    /**
     * Field _year.
     */
    private int _year;

    /**
     * keeps track of state for field: _year
     */
    private boolean _has_year;

    /**
     * Field _month.
     */
    private java.lang.String _month;

    /**
     * Field _day.
     */
    private int _day;

    /**
     * keeps track of state for field: _day
     */
    private boolean _has_day;

    /**
     * Field _hour.
     */
    private int _hour;

    /**
     * keeps track of state for field: _hour
     */
    private boolean _has_hour;

    /**
     * Field _min.
     */
    private int _min;

    /**
     * keeps track of state for field: _min
     */
    private boolean _has_min;

    /**
     * Field _sec.
     */
    private int _sec;

    /**
     * keeps track of state for field: _sec
     */
    private boolean _has_sec;

    /**
     * Field _period.
     */
    private java.lang.String _period;


      //----------------/
     //- Constructors -/
    //----------------/

    public Created() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteDay(
    ) {
        this._has_day= false;
    }

    /**
     */
    public void deleteHour(
    ) {
        this._has_hour= false;
    }

    /**
     */
    public void deleteMin(
    ) {
        this._has_min= false;
    }

    /**
     */
    public void deleteSec(
    ) {
        this._has_sec= false;
    }

    /**
     */
    public void deleteYear(
    ) {
        this._has_year= false;
    }

    /**
     * Returns the value of field 'content'. The field 'content'
     * has the following description: internal content storage
     * 
     * @return the value of field 'Content'.
     */
    public java.math.BigDecimal getContent(
    ) {
        return this._content;
    }

    /**
     * Returns the value of field 'day'.
     * 
     * @return the value of field 'Day'.
     */
    public int getDay(
    ) {
        return this._day;
    }

    /**
     * Returns the value of field 'hour'.
     * 
     * @return the value of field 'Hour'.
     */
    public int getHour(
    ) {
        return this._hour;
    }

    /**
     * Returns the value of field 'min'.
     * 
     * @return the value of field 'Min'.
     */
    public int getMin(
    ) {
        return this._min;
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
     * Returns the value of field 'period'.
     * 
     * @return the value of field 'Period'.
     */
    public java.lang.String getPeriod(
    ) {
        return this._period;
    }

    /**
     * Returns the value of field 'sec'.
     * 
     * @return the value of field 'Sec'.
     */
    public int getSec(
    ) {
        return this._sec;
    }

    /**
     * Returns the value of field 'year'.
     * 
     * @return the value of field 'Year'.
     */
    public int getYear(
    ) {
        return this._year;
    }

    /**
     * Method hasDay.
     * 
     * @return true if at least one Day has been added
     */
    public boolean hasDay(
    ) {
        return this._has_day;
    }

    /**
     * Method hasHour.
     * 
     * @return true if at least one Hour has been added
     */
    public boolean hasHour(
    ) {
        return this._has_hour;
    }

    /**
     * Method hasMin.
     * 
     * @return true if at least one Min has been added
     */
    public boolean hasMin(
    ) {
        return this._has_min;
    }

    /**
     * Method hasSec.
     * 
     * @return true if at least one Sec has been added
     */
    public boolean hasSec(
    ) {
        return this._has_sec;
    }

    /**
     * Method hasYear.
     * 
     * @return true if at least one Year has been added
     */
    public boolean hasYear(
    ) {
        return this._has_year;
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
     * Sets the value of field 'content'. The field 'content' has
     * the following description: internal content storage
     * 
     * @param content the value of field 'content'.
     */
    public void setContent(
            final java.math.BigDecimal content) {
        this._content = content;
    }

    /**
     * Sets the value of field 'day'.
     * 
     * @param day the value of field 'day'.
     */
    public void setDay(
            final int day) {
        this._day = day;
        this._has_day = true;
    }

    /**
     * Sets the value of field 'hour'.
     * 
     * @param hour the value of field 'hour'.
     */
    public void setHour(
            final int hour) {
        this._hour = hour;
        this._has_hour = true;
    }

    /**
     * Sets the value of field 'min'.
     * 
     * @param min the value of field 'min'.
     */
    public void setMin(
            final int min) {
        this._min = min;
        this._has_min = true;
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
     * Sets the value of field 'period'.
     * 
     * @param period the value of field 'period'.
     */
    public void setPeriod(
            final java.lang.String period) {
        this._period = period;
    }

    /**
     * Sets the value of field 'sec'.
     * 
     * @param sec the value of field 'sec'.
     */
    public void setSec(
            final int sec) {
        this._sec = sec;
        this._has_sec = true;
    }

    /**
     * Sets the value of field 'year'.
     * 
     * @param year the value of field 'year'.
     */
    public void setYear(
            final int year) {
        this._year = year;
        this._has_year = true;
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
     * org.opennms.report.availability.Created
     */
    public static org.opennms.report.availability.Created unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.report.availability.Created) Unmarshaller.unmarshal(org.opennms.report.availability.Created.class, reader);
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
