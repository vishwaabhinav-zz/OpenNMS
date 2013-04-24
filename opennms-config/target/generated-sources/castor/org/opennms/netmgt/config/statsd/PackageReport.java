/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.statsd;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Report to be generated for nodes matching this
 *  package
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class PackageReport implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The report name. This is used internally to
     *  reference a configured report class.
     */
    private java.lang.String _name;

    /**
     * The report description. This is shown in the web
     *  UI.
     */
    private java.lang.String _description;

    /**
     * the schedule at which the report is to be
     *  generated
     */
    private java.lang.String _schedule;

    /**
     * the amount of time after which this report has been
     *  created that it can be purged.
     */
    private java.lang.String _retainInterval;

    /**
     * status of the report; report is generated only if
     *  on
     */
    private org.opennms.netmgt.config.statsd.types.PackageReportStatusType _status;

    /**
     * Package-specific parameters (if any) to be used
     *  for this report
     */
    private java.util.List<org.opennms.netmgt.config.statsd.Parameter> _parameterList;


      //----------------/
     //- Constructors -/
    //----------------/

    public PackageReport() {
        super();
        this._parameterList = new java.util.ArrayList<org.opennms.netmgt.config.statsd.Parameter>();
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
            final org.opennms.netmgt.config.statsd.Parameter vParameter)
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
            final org.opennms.netmgt.config.statsd.Parameter vParameter)
    throws java.lang.IndexOutOfBoundsException {
        this._parameterList.add(index, vParameter);
    }

    /**
     * Method enumerateParameter.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.statsd.Parameter> enumerateParameter(
    ) {
        return java.util.Collections.enumeration(this._parameterList);
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
        
        if (obj instanceof PackageReport) {
        
            PackageReport temp = (PackageReport)obj;
            if (this._name != null) {
                if (temp._name == null) return false;
                else if (!(this._name.equals(temp._name))) 
                    return false;
            }
            else if (temp._name != null)
                return false;
            if (this._description != null) {
                if (temp._description == null) return false;
                else if (!(this._description.equals(temp._description))) 
                    return false;
            }
            else if (temp._description != null)
                return false;
            if (this._schedule != null) {
                if (temp._schedule == null) return false;
                else if (!(this._schedule.equals(temp._schedule))) 
                    return false;
            }
            else if (temp._schedule != null)
                return false;
            if (this._retainInterval != null) {
                if (temp._retainInterval == null) return false;
                else if (!(this._retainInterval.equals(temp._retainInterval))) 
                    return false;
            }
            else if (temp._retainInterval != null)
                return false;
            if (this._status != null) {
                if (temp._status == null) return false;
                else if (!(this._status.equals(temp._status))) 
                    return false;
            }
            else if (temp._status != null)
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
     * Returns the value of field 'description'. The field
     * 'description' has the following description: The report
     * description. This is shown in the web
     *  UI.
     * 
     * @return the value of field 'Description'.
     */
    public java.lang.String getDescription(
    ) {
        return this._description;
    }

    /**
     * Returns the value of field 'name'. The field 'name' has the
     * following description: The report name. This is used
     * internally to
     *  reference a configured report class.
     * 
     * @return the value of field 'Name'.
     */
    public java.lang.String getName(
    ) {
        return this._name;
    }

    /**
     * Method getParameter.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.statsd.Parameter at the given index
     */
    public org.opennms.netmgt.config.statsd.Parameter getParameter(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._parameterList.size()) {
            throw new IndexOutOfBoundsException("getParameter: Index value '" + index + "' not in range [0.." + (this._parameterList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.statsd.Parameter) _parameterList.get(index);
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
    public org.opennms.netmgt.config.statsd.Parameter[] getParameter(
    ) {
        org.opennms.netmgt.config.statsd.Parameter[] array = new org.opennms.netmgt.config.statsd.Parameter[0];
        return (org.opennms.netmgt.config.statsd.Parameter[]) this._parameterList.toArray(array);
    }

    /**
     * Method getParameterCollection.Returns a reference to
     * '_parameterList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.statsd.Parameter> getParameterCollection(
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
     * Returns the value of field 'retainInterval'. The field
     * 'retainInterval' has the following description: the amount
     * of time after which this report has been
     *  created that it can be purged.
     * 
     * @return the value of field 'RetainInterval'.
     */
    public java.lang.String getRetainInterval(
    ) {
        return this._retainInterval;
    }

    /**
     * Returns the value of field 'schedule'. The field 'schedule'
     * has the following description: the schedule at which the
     * report is to be
     *  generated
     * 
     * @return the value of field 'Schedule'.
     */
    public java.lang.String getSchedule(
    ) {
        return this._schedule;
    }

    /**
     * Returns the value of field 'status'. The field 'status' has
     * the following description: status of the report; report is
     * generated only if
     *  on
     * 
     * @return the value of field 'Status'.
     */
    public org.opennms.netmgt.config.statsd.types.PackageReportStatusType getStatus(
    ) {
        return this._status;
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
        if (_description != null) {
           result = 37 * result + _description.hashCode();
        }
        if (_schedule != null) {
           result = 37 * result + _schedule.hashCode();
        }
        if (_retainInterval != null) {
           result = 37 * result + _retainInterval.hashCode();
        }
        if (_status != null) {
           result = 37 * result + _status.hashCode();
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
    public java.util.Iterator<org.opennms.netmgt.config.statsd.Parameter> iterateParameter(
    ) {
        return this._parameterList.iterator();
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
     * Method removeParameter.
     * 
     * @param vParameter
     * @return true if the object was removed from the collection.
     */
    public boolean removeParameter(
            final org.opennms.netmgt.config.statsd.Parameter vParameter) {
        boolean removed = _parameterList.remove(vParameter);
        return removed;
    }

    /**
     * Method removeParameterAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.statsd.Parameter removeParameterAt(
            final int index) {
        java.lang.Object obj = this._parameterList.remove(index);
        return (org.opennms.netmgt.config.statsd.Parameter) obj;
    }

    /**
     * Sets the value of field 'description'. The field
     * 'description' has the following description: The report
     * description. This is shown in the web
     *  UI.
     * 
     * @param description the value of field 'description'.
     */
    public void setDescription(
            final java.lang.String description) {
        this._description = description;
    }

    /**
     * Sets the value of field 'name'. The field 'name' has the
     * following description: The report name. This is used
     * internally to
     *  reference a configured report class.
     * 
     * @param name the value of field 'name'.
     */
    public void setName(
            final java.lang.String name) {
        this._name = name;
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
            final org.opennms.netmgt.config.statsd.Parameter vParameter)
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
            final org.opennms.netmgt.config.statsd.Parameter[] vParameterArray) {
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
            final java.util.List<org.opennms.netmgt.config.statsd.Parameter> vParameterList) {
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
            final java.util.List<org.opennms.netmgt.config.statsd.Parameter> parameterList) {
        this._parameterList = parameterList;
    }

    /**
     * Sets the value of field 'retainInterval'. The field
     * 'retainInterval' has the following description: the amount
     * of time after which this report has been
     *  created that it can be purged.
     * 
     * @param retainInterval the value of field 'retainInterval'.
     */
    public void setRetainInterval(
            final java.lang.String retainInterval) {
        this._retainInterval = retainInterval;
    }

    /**
     * Sets the value of field 'schedule'. The field 'schedule' has
     * the following description: the schedule at which the report
     * is to be
     *  generated
     * 
     * @param schedule the value of field 'schedule'.
     */
    public void setSchedule(
            final java.lang.String schedule) {
        this._schedule = schedule;
    }

    /**
     * Sets the value of field 'status'. The field 'status' has the
     * following description: status of the report; report is
     * generated only if
     *  on
     * 
     * @param status the value of field 'status'.
     */
    public void setStatus(
            final org.opennms.netmgt.config.statsd.types.PackageReportStatusType status) {
        this._status = status;
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
     * org.opennms.netmgt.config.statsd.PackageReport
     */
    public static org.opennms.netmgt.config.statsd.PackageReport unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.statsd.PackageReport) Unmarshaller.unmarshal(org.opennms.netmgt.config.statsd.PackageReport.class, reader);
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
