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
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Report implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _reportTemplate.
     */
    private java.lang.String _reportTemplate;

    /**
     * Field _reportName.
     */
    private java.lang.String _reportName;

    /**
     * Field _reportFormat.
     */
    private java.lang.String _reportFormat = "pdf";

    /**
     * Field _reportEngine.
     */
    private java.lang.String _reportEngine = "opennms";

    /**
     * Field _cronSchedule.
     */
    private java.lang.String _cronSchedule;

    /**
     * Field _recipientList.
     */
    private java.util.List<java.lang.String> _recipientList;

    /**
     * Field _mailer.
     */
    private java.lang.String _mailer;

    /**
     * Field _parameterList.
     */
    private java.util.List<org.opennms.netmgt.config.reportd.Parameter> _parameterList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Report() {
        super();
        setReportFormat("pdf");
        setReportEngine("opennms");
        this._recipientList = new java.util.ArrayList<java.lang.String>();
        this._parameterList = new java.util.ArrayList<org.opennms.netmgt.config.reportd.Parameter>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vParameter
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addParameter(
            final org.opennms.netmgt.config.reportd.Parameter vParameter)
    throws java.lang.IndexOutOfBoundsException {
        this._parameterList.add(vParameter);
    }

    /**
     * 
     * 
     * @param index
     * @param vParameter
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addParameter(
            final int index,
            final org.opennms.netmgt.config.reportd.Parameter vParameter)
    throws java.lang.IndexOutOfBoundsException {
        this._parameterList.add(index, vParameter);
    }

    /**
     * 
     * 
     * @param vRecipient
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRecipient(
            final java.lang.String vRecipient)
    throws java.lang.IndexOutOfBoundsException {
        this._recipientList.add(vRecipient);
    }

    /**
     * 
     * 
     * @param index
     * @param vRecipient
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRecipient(
            final int index,
            final java.lang.String vRecipient)
    throws java.lang.IndexOutOfBoundsException {
        this._recipientList.add(index, vRecipient);
    }

    /**
     * Method enumerateParameter.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.reportd.Parameter> enumerateParameter(
    ) {
        return java.util.Collections.enumeration(this._parameterList);
    }

    /**
     * Method enumerateRecipient.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<java.lang.String> enumerateRecipient(
    ) {
        return java.util.Collections.enumeration(this._recipientList);
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
            if (this._reportTemplate != null) {
                if (temp._reportTemplate == null) return false;
                else if (!(this._reportTemplate.equals(temp._reportTemplate))) 
                    return false;
            }
            else if (temp._reportTemplate != null)
                return false;
            if (this._reportName != null) {
                if (temp._reportName == null) return false;
                else if (!(this._reportName.equals(temp._reportName))) 
                    return false;
            }
            else if (temp._reportName != null)
                return false;
            if (this._reportFormat != null) {
                if (temp._reportFormat == null) return false;
                else if (!(this._reportFormat.equals(temp._reportFormat))) 
                    return false;
            }
            else if (temp._reportFormat != null)
                return false;
            if (this._reportEngine != null) {
                if (temp._reportEngine == null) return false;
                else if (!(this._reportEngine.equals(temp._reportEngine))) 
                    return false;
            }
            else if (temp._reportEngine != null)
                return false;
            if (this._cronSchedule != null) {
                if (temp._cronSchedule == null) return false;
                else if (!(this._cronSchedule.equals(temp._cronSchedule))) 
                    return false;
            }
            else if (temp._cronSchedule != null)
                return false;
            if (this._recipientList != null) {
                if (temp._recipientList == null) return false;
                else if (!(this._recipientList.equals(temp._recipientList))) 
                    return false;
            }
            else if (temp._recipientList != null)
                return false;
            if (this._mailer != null) {
                if (temp._mailer == null) return false;
                else if (!(this._mailer.equals(temp._mailer))) 
                    return false;
            }
            else if (temp._mailer != null)
                return false;
            if (this._parameterList != null) {
                if (temp._parameterList == null) return false;
                else if (!(this._parameterList.equals(temp._parameterList))) 
                    return false;
            }
            else if (temp._parameterList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'cronSchedule'.
     * 
     * @return the value of field 'CronSchedule'.
     */
    public java.lang.String getCronSchedule(
    ) {
        return this._cronSchedule;
    }

    /**
     * Returns the value of field 'mailer'.
     * 
     * @return the value of field 'Mailer'.
     */
    public java.lang.String getMailer(
    ) {
        return this._mailer;
    }

    /**
     * Method getParameter.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.reportd.Parameter at the given inde
     */
    public org.opennms.netmgt.config.reportd.Parameter getParameter(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._parameterList.size()) {
            throw new IndexOutOfBoundsException("getParameter: Index value '" + index + "' not in range [0.." + (this._parameterList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.reportd.Parameter) _parameterList.get(index);
    }

    /**
     * Method getParameter.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.reportd.Parameter[] getParameter(
    ) {
        org.opennms.netmgt.config.reportd.Parameter[] array = new org.opennms.netmgt.config.reportd.Parameter[0];
        return (org.opennms.netmgt.config.reportd.Parameter[]) this._parameterList.toArray(array);
    }

    /**
     * Method getParameterCollection.Returns a reference to
     * '_parameterList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.reportd.Parameter> getParameterCollection(
    ) {
        return this._parameterList;
    }

    /**
     * Method getParameterCount.
     * 
     * @return the size of this collection
     */
    public int getParameterCount(
    ) {
        return this._parameterList.size();
    }

    /**
     * Method getRecipient.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the java.lang.String at the given index
     */
    public java.lang.String getRecipient(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._recipientList.size()) {
            throw new IndexOutOfBoundsException("getRecipient: Index value '" + index + "' not in range [0.." + (this._recipientList.size() - 1) + "]");
        }
        
        return (java.lang.String) _recipientList.get(index);
    }

    /**
     * Method getRecipient.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public java.lang.String[] getRecipient(
    ) {
        java.lang.String[] array = new java.lang.String[0];
        return (java.lang.String[]) this._recipientList.toArray(array);
    }

    /**
     * Method getRecipientCollection.Returns a reference to
     * '_recipientList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<java.lang.String> getRecipientCollection(
    ) {
        return this._recipientList;
    }

    /**
     * Method getRecipientCount.
     * 
     * @return the size of this collection
     */
    public int getRecipientCount(
    ) {
        return this._recipientList.size();
    }

    /**
     * Returns the value of field 'reportEngine'.
     * 
     * @return the value of field 'ReportEngine'.
     */
    public java.lang.String getReportEngine(
    ) {
        return this._reportEngine;
    }

    /**
     * Returns the value of field 'reportFormat'.
     * 
     * @return the value of field 'ReportFormat'.
     */
    public java.lang.String getReportFormat(
    ) {
        return this._reportFormat;
    }

    /**
     * Returns the value of field 'reportName'.
     * 
     * @return the value of field 'ReportName'.
     */
    public java.lang.String getReportName(
    ) {
        return this._reportName;
    }

    /**
     * Returns the value of field 'reportTemplate'.
     * 
     * @return the value of field 'ReportTemplate'.
     */
    public java.lang.String getReportTemplate(
    ) {
        return this._reportTemplate;
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
        if (_reportTemplate != null) {
           result = 37 * result + _reportTemplate.hashCode();
        }
        if (_reportName != null) {
           result = 37 * result + _reportName.hashCode();
        }
        if (_reportFormat != null) {
           result = 37 * result + _reportFormat.hashCode();
        }
        if (_reportEngine != null) {
           result = 37 * result + _reportEngine.hashCode();
        }
        if (_cronSchedule != null) {
           result = 37 * result + _cronSchedule.hashCode();
        }
        if (_recipientList != null) {
           result = 37 * result + _recipientList.hashCode();
        }
        if (_mailer != null) {
           result = 37 * result + _mailer.hashCode();
        }
        if (_parameterList != null) {
           result = 37 * result + _parameterList.hashCode();
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
     * Method iterateParameter.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.reportd.Parameter> iterateParameter(
    ) {
        return this._parameterList.iterator();
    }

    /**
     * Method iterateRecipient.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<java.lang.String> iterateRecipient(
    ) {
        return this._recipientList.iterator();
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
    public void removeAllParameter(
    ) {
        this._parameterList.clear();
    }

    /**
     */
    public void removeAllRecipient(
    ) {
        this._recipientList.clear();
    }

    /**
     * Method removeParameter.
     * 
     * @param vParameter
     * @return true if the object was removed from the collection.
     */
    public boolean removeParameter(
            final org.opennms.netmgt.config.reportd.Parameter vParameter) {
        boolean removed = _parameterList.remove(vParameter);
        return removed;
    }

    /**
     * Method removeParameterAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.reportd.Parameter removeParameterAt(
            final int index) {
        java.lang.Object obj = this._parameterList.remove(index);
        return (org.opennms.netmgt.config.reportd.Parameter) obj;
    }

    /**
     * Method removeRecipient.
     * 
     * @param vRecipient
     * @return true if the object was removed from the collection.
     */
    public boolean removeRecipient(
            final java.lang.String vRecipient) {
        boolean removed = _recipientList.remove(vRecipient);
        return removed;
    }

    /**
     * Method removeRecipientAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public java.lang.String removeRecipientAt(
            final int index) {
        java.lang.Object obj = this._recipientList.remove(index);
        return (java.lang.String) obj;
    }

    /**
     * Sets the value of field 'cronSchedule'.
     * 
     * @param cronSchedule the value of field 'cronSchedule'.
     */
    public void setCronSchedule(
            final java.lang.String cronSchedule) {
        this._cronSchedule = cronSchedule;
    }

    /**
     * Sets the value of field 'mailer'.
     * 
     * @param mailer the value of field 'mailer'.
     */
    public void setMailer(
            final java.lang.String mailer) {
        this._mailer = mailer;
    }

    /**
     * 
     * 
     * @param index
     * @param vParameter
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setParameter(
            final int index,
            final org.opennms.netmgt.config.reportd.Parameter vParameter)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._parameterList.size()) {
            throw new IndexOutOfBoundsException("setParameter: Index value '" + index + "' not in range [0.." + (this._parameterList.size() - 1) + "]");
        }
        
        this._parameterList.set(index, vParameter);
    }

    /**
     * 
     * 
     * @param vParameterArray
     */
    public void setParameter(
            final org.opennms.netmgt.config.reportd.Parameter[] vParameterArray) {
        //-- copy array
        _parameterList.clear();
        
        for (int i = 0; i < vParameterArray.length; i++) {
                this._parameterList.add(vParameterArray[i]);
        }
    }

    /**
     * Sets the value of '_parameterList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vParameterList the Vector to copy.
     */
    public void setParameter(
            final java.util.List<org.opennms.netmgt.config.reportd.Parameter> vParameterList) {
        // copy vector
        this._parameterList.clear();
        
        this._parameterList.addAll(vParameterList);
    }

    /**
     * Sets the value of '_parameterList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param parameterList the Vector to set.
     */
    public void setParameterCollection(
            final java.util.List<org.opennms.netmgt.config.reportd.Parameter> parameterList) {
        this._parameterList = parameterList;
    }

    /**
     * 
     * 
     * @param index
     * @param vRecipient
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setRecipient(
            final int index,
            final java.lang.String vRecipient)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._recipientList.size()) {
            throw new IndexOutOfBoundsException("setRecipient: Index value '" + index + "' not in range [0.." + (this._recipientList.size() - 1) + "]");
        }
        
        this._recipientList.set(index, vRecipient);
    }

    /**
     * 
     * 
     * @param vRecipientArray
     */
    public void setRecipient(
            final java.lang.String[] vRecipientArray) {
        //-- copy array
        _recipientList.clear();
        
        for (int i = 0; i < vRecipientArray.length; i++) {
                this._recipientList.add(vRecipientArray[i]);
        }
    }

    /**
     * Sets the value of '_recipientList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vRecipientList the Vector to copy.
     */
    public void setRecipient(
            final java.util.List<java.lang.String> vRecipientList) {
        // copy vector
        this._recipientList.clear();
        
        this._recipientList.addAll(vRecipientList);
    }

    /**
     * Sets the value of '_recipientList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param recipientList the Vector to set.
     */
    public void setRecipientCollection(
            final java.util.List<java.lang.String> recipientList) {
        this._recipientList = recipientList;
    }

    /**
     * Sets the value of field 'reportEngine'.
     * 
     * @param reportEngine the value of field 'reportEngine'.
     */
    public void setReportEngine(
            final java.lang.String reportEngine) {
        this._reportEngine = reportEngine;
    }

    /**
     * Sets the value of field 'reportFormat'.
     * 
     * @param reportFormat the value of field 'reportFormat'.
     */
    public void setReportFormat(
            final java.lang.String reportFormat) {
        this._reportFormat = reportFormat;
    }

    /**
     * Sets the value of field 'reportName'.
     * 
     * @param reportName the value of field 'reportName'.
     */
    public void setReportName(
            final java.lang.String reportName) {
        this._reportName = reportName;
    }

    /**
     * Sets the value of field 'reportTemplate'.
     * 
     * @param reportTemplate the value of field 'reportTemplate'.
     */
    public void setReportTemplate(
            final java.lang.String reportTemplate) {
        this._reportTemplate = reportTemplate;
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
     * org.opennms.netmgt.config.reportd.Report
     */
    public static org.opennms.netmgt.config.reportd.Report unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.reportd.Report) Unmarshaller.unmarshal(org.opennms.netmgt.config.reportd.Report.class, reader);
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
