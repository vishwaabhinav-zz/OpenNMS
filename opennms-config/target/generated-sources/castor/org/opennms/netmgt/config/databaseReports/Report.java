/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.databaseReports;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class Report.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Report implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * the name of this report as defined in engine
     *  configuration
     */
    private java.lang.String _id;

    /**
     * the name of this report as displayed in the webui
     *  
     */
    private java.lang.String _displayName;

    /**
     * the name of the engine to use to process and
     *  render this report
     */
    private java.lang.String _reportService;

    /**
     * report description
     */
    private java.lang.String _description;

    /**
     * determines if the report may be executed and immediately
     *  displayed in the browser. If not set OpenNMS assumes that
     * the report
     *  must be executed in batch mode.
     */
    private boolean _online;

    /**
     * keeps track of state for field: _online
     */
    private boolean _has_online;


      //----------------/
     //- Constructors -/
    //----------------/

    public Report() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteOnline(
    ) {
        this._has_online= false;
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
        
        if (obj instanceof Report) {
        
            Report temp = (Report)obj;
            if (this._id != null) {
                if (temp._id == null) return false;
                else if (!(this._id.equals(temp._id))) 
                    return false;
            }
            else if (temp._id != null)
                return false;
            if (this._displayName != null) {
                if (temp._displayName == null) return false;
                else if (!(this._displayName.equals(temp._displayName))) 
                    return false;
            }
            else if (temp._displayName != null)
                return false;
            if (this._reportService != null) {
                if (temp._reportService == null) return false;
                else if (!(this._reportService.equals(temp._reportService))) 
                    return false;
            }
            else if (temp._reportService != null)
                return false;
            if (this._description != null) {
                if (temp._description == null) return false;
                else if (!(this._description.equals(temp._description))) 
                    return false;
            }
            else if (temp._description != null)
                return false;
            if (this._online != temp._online)
                return false;
            if (this._has_online != temp._has_online)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'description'. The field
     * 'description' has the following description: report
     * description
     * 
     * @return the value of field 'Description'.
     */
    public java.lang.String getDescription(
    ) {
        return this._description;
    }

    /**
     * Returns the value of field 'displayName'. The field
     * 'displayName' has the following description: the name of
     * this report as displayed in the webui
     *  
     * 
     * @return the value of field 'DisplayName'.
     */
    public java.lang.String getDisplayName(
    ) {
        return this._displayName;
    }

    /**
     * Returns the value of field 'id'. The field 'id' has the
     * following description: the name of this report as defined in
     * engine
     *  configuration
     * 
     * @return the value of field 'Id'.
     */
    public java.lang.String getId(
    ) {
        return this._id;
    }

    /**
     * Returns the value of field 'online'. The field 'online' has
     * the following description: determines if the report may be
     * executed and immediately
     *  displayed in the browser. If not set OpenNMS assumes that
     * the report
     *  must be executed in batch mode.
     * 
     * @return the value of field 'Online'.
     */
    public boolean getOnline(
    ) {
        return this._online;
    }

    /**
     * Returns the value of field 'reportService'. The field
     * 'reportService' has the following description: the name of
     * the engine to use to process and
     *  render this report
     * 
     * @return the value of field 'ReportService'.
     */
    public java.lang.String getReportService(
    ) {
        return this._reportService;
    }

    /**
     * Method hasOnline.
     * 
     * @return true if at least one Online has been added
     */
    public boolean hasOnline(
    ) {
        return this._has_online;
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
        if (_id != null) {
           result = 37 * result + _id.hashCode();
        }
        if (_displayName != null) {
           result = 37 * result + _displayName.hashCode();
        }
        if (_reportService != null) {
           result = 37 * result + _reportService.hashCode();
        }
        if (_description != null) {
           result = 37 * result + _description.hashCode();
        }
        result = 37 * result + (_online?0:1);
        
        return result;
    }

    /**
     * Returns the value of field 'online'. The field 'online' has
     * the following description: determines if the report may be
     * executed and immediately
     *  displayed in the browser. If not set OpenNMS assumes that
     * the report
     *  must be executed in batch mode.
     * 
     * @return the value of field 'Online'.
     */
    public boolean isOnline(
    ) {
        return this._online;
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
     * Sets the value of field 'description'. The field
     * 'description' has the following description: report
     * description
     * 
     * @param description the value of field 'description'.
     */
    public void setDescription(
            final java.lang.String description) {
        this._description = description;
    }

    /**
     * Sets the value of field 'displayName'. The field
     * 'displayName' has the following description: the name of
     * this report as displayed in the webui
     *  
     * 
     * @param displayName the value of field 'displayName'.
     */
    public void setDisplayName(
            final java.lang.String displayName) {
        this._displayName = displayName;
    }

    /**
     * Sets the value of field 'id'. The field 'id' has the
     * following description: the name of this report as defined in
     * engine
     *  configuration
     * 
     * @param id the value of field 'id'.
     */
    public void setId(
            final java.lang.String id) {
        this._id = id;
    }

    /**
     * Sets the value of field 'online'. The field 'online' has the
     * following description: determines if the report may be
     * executed and immediately
     *  displayed in the browser. If not set OpenNMS assumes that
     * the report
     *  must be executed in batch mode.
     * 
     * @param online the value of field 'online'.
     */
    public void setOnline(
            final boolean online) {
        this._online = online;
        this._has_online = true;
    }

    /**
     * Sets the value of field 'reportService'. The field
     * 'reportService' has the following description: the name of
     * the engine to use to process and
     *  render this report
     * 
     * @param reportService the value of field 'reportService'.
     */
    public void setReportService(
            final java.lang.String reportService) {
        this._reportService = reportService;
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
     * org.opennms.netmgt.config.databaseReports.Report
     */
    public static org.opennms.netmgt.config.databaseReports.Report unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.databaseReports.Report) Unmarshaller.unmarshal(org.opennms.netmgt.config.databaseReports.Report.class, reader);
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
