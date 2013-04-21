/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.reportd;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Behavior configuration for the Enterprise Reporting Daemon
 *  
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class ReportdConfiguration implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The base directory rendered reports are saved on the file
     * system.
     */
    private java.lang.String _storageLocation;

    /**
     * Should reports be kept after delivered?
     */
    private java.lang.String _persistReports;

    /**
     * Defines an report schedule with a cron expression
     *  
     *  http://quartz.sourceforge.net/javadoc/org/quartz/CronTrigger.html
     *  Field Name Allowed Values Allowed Special Characters
     *  Seconds 0-59 , - /
     *  Minutes 0-59 , - /
     *  Hours 0-23 , - /
     *  Day-of-month 1-31 , - ? / L W C
     *  Month 1-12 or JAN-DEC , - /
     *  Day-of-Week 1-7 or SUN-SAT , - ? / L C #
     *  Year (Opt) empty, 1970-2099 , - /
     *  
     */
    private java.util.List<org.opennms.netmgt.config.reportd.Report> _reportList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ReportdConfiguration() {
        super();
        this._reportList = new java.util.ArrayList<org.opennms.netmgt.config.reportd.Report>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vReport
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addReport(
            final org.opennms.netmgt.config.reportd.Report vReport)
    throws java.lang.IndexOutOfBoundsException {
        this._reportList.add(vReport);
    }

    /**
     * 
     * 
     * @param index
     * @param vReport
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addReport(
            final int index,
            final org.opennms.netmgt.config.reportd.Report vReport)
    throws java.lang.IndexOutOfBoundsException {
        this._reportList.add(index, vReport);
    }

    /**
     * Method enumerateReport.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.reportd.Report> enumerateReport(
    ) {
        return java.util.Collections.enumeration(this._reportList);
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
        
        if (obj instanceof ReportdConfiguration) {
        
            ReportdConfiguration temp = (ReportdConfiguration)obj;
            if (this._storageLocation != null) {
                if (temp._storageLocation == null) return false;
                else if (!(this._storageLocation.equals(temp._storageLocation))) 
                    return false;
            }
            else if (temp._storageLocation != null)
                return false;
            if (this._persistReports != null) {
                if (temp._persistReports == null) return false;
                else if (!(this._persistReports.equals(temp._persistReports))) 
                    return false;
            }
            else if (temp._persistReports != null)
                return false;
            if (this._reportList != null) {
                if (temp._reportList == null) return false;
                else if (!(this._reportList.equals(temp._reportList))) 
                    return false;
            }
            else if (temp._reportList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'persistReports'. The field
     * 'persistReports' has the following description: Should
     * reports be kept after delivered?
     * 
     * @return the value of field 'PersistReports'.
     */
    public java.lang.String getPersistReports(
    ) {
        return this._persistReports;
    }

    /**
     * Method getReport.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.reportd.Report at the given index
     */
    public org.opennms.netmgt.config.reportd.Report getReport(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._reportList.size()) {
            throw new IndexOutOfBoundsException("getReport: Index value '" + index + "' not in range [0.." + (this._reportList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.reportd.Report) _reportList.get(index);
    }

    /**
     * Method getReport.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.reportd.Report[] getReport(
    ) {
        org.opennms.netmgt.config.reportd.Report[] array = new org.opennms.netmgt.config.reportd.Report[0];
        return (org.opennms.netmgt.config.reportd.Report[]) this._reportList.toArray(array);
    }

    /**
     * Method getReportCollection.Returns a reference to
     * '_reportList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.reportd.Report> getReportCollection(
    ) {
        return this._reportList;
    }

    /**
     * Method getReportCount.
     * 
     * @return the size of this collection
     */
    public int getReportCount(
    ) {
        return this._reportList.size();
    }

    /**
     * Returns the value of field 'storageLocation'. The field
     * 'storageLocation' has the following description: The base
     * directory rendered reports are saved on the file system.
     * 
     * @return the value of field 'StorageLocation'.
     */
    public java.lang.String getStorageLocation(
    ) {
        return this._storageLocation;
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
        if (_storageLocation != null) {
           result = 37 * result + _storageLocation.hashCode();
        }
        if (_persistReports != null) {
           result = 37 * result + _persistReports.hashCode();
        }
        if (_reportList != null) {
           result = 37 * result + _reportList.hashCode();
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
     * Method iterateReport.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.reportd.Report> iterateReport(
    ) {
        return this._reportList.iterator();
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
    public void removeAllReport(
    ) {
        this._reportList.clear();
    }

    /**
     * Method removeReport.
     * 
     * @param vReport
     * @return true if the object was removed from the collection.
     */
    public boolean removeReport(
            final org.opennms.netmgt.config.reportd.Report vReport) {
        boolean removed = _reportList.remove(vReport);
        return removed;
    }

    /**
     * Method removeReportAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.reportd.Report removeReportAt(
            final int index) {
        java.lang.Object obj = this._reportList.remove(index);
        return (org.opennms.netmgt.config.reportd.Report) obj;
    }

    /**
     * Sets the value of field 'persistReports'. The field
     * 'persistReports' has the following description: Should
     * reports be kept after delivered?
     * 
     * @param persistReports the value of field 'persistReports'.
     */
    public void setPersistReports(
            final java.lang.String persistReports) {
        this._persistReports = persistReports;
    }

    /**
     * 
     * 
     * @param index
     * @param vReport
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setReport(
            final int index,
            final org.opennms.netmgt.config.reportd.Report vReport)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._reportList.size()) {
            throw new IndexOutOfBoundsException("setReport: Index value '" + index + "' not in range [0.." + (this._reportList.size() - 1) + "]");
        }
        
        this._reportList.set(index, vReport);
    }

    /**
     * 
     * 
     * @param vReportArray
     */
    public void setReport(
            final org.opennms.netmgt.config.reportd.Report[] vReportArray) {
        //-- copy array
        _reportList.clear();
        
        for (int i = 0; i < vReportArray.length; i++) {
                this._reportList.add(vReportArray[i]);
        }
    }

    /**
     * Sets the value of '_reportList' by copying the given Vector.
     * All elements will be checked for type safety.
     * 
     * @param vReportList the Vector to copy.
     */
    public void setReport(
            final java.util.List<org.opennms.netmgt.config.reportd.Report> vReportList) {
        // copy vector
        this._reportList.clear();
        
        this._reportList.addAll(vReportList);
    }

    /**
     * Sets the value of '_reportList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param reportList the Vector to set.
     */
    public void setReportCollection(
            final java.util.List<org.opennms.netmgt.config.reportd.Report> reportList) {
        this._reportList = reportList;
    }

    /**
     * Sets the value of field 'storageLocation'. The field
     * 'storageLocation' has the following description: The base
     * directory rendered reports are saved on the file system.
     * 
     * @param storageLocation the value of field 'storageLocation'.
     */
    public void setStorageLocation(
            final java.lang.String storageLocation) {
        this._storageLocation = storageLocation;
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
     * org.opennms.netmgt.config.reportd.ReportdConfiguration
     */
    public static org.opennms.netmgt.config.reportd.ReportdConfiguration unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.reportd.ReportdConfiguration) Unmarshaller.unmarshal(org.opennms.netmgt.config.reportd.ReportdConfiguration.class, reader);
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
