/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.collectd;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Service to be collected for addresses in this
 *  package
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Service implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * the service name
     */
    private java.lang.String _name;

    /**
     * the interval at which the service is to be
     *  collected
     */
    private long _interval;

    /**
     * keeps track of state for field: _interval
     */
    private boolean _has_interval;

    /**
     * marker to say if service is user defined, used
     *  specifically for UI purposes
     */
    private java.lang.String _userDefined;

    /**
     * status of the service, service is collected only if
     *  on
     */
    private java.lang.String _status;

    /**
     * Parameters to be used for collecting data via this service.
     *  "collection": name of data collection in
     * datacollection-config.xml ("SNMP" specific);
     *  SNMP parameters ("read-community", "version", etc) will
     * override defaults set in snmp-config.xml
     */
    private java.util.List<org.opennms.netmgt.config.collectd.Parameter> _parameterList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Service() {
        super();
        this._parameterList = new java.util.ArrayList<org.opennms.netmgt.config.collectd.Parameter>();
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
            final org.opennms.netmgt.config.collectd.Parameter vParameter)
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
            final org.opennms.netmgt.config.collectd.Parameter vParameter)
    throws java.lang.IndexOutOfBoundsException {
        this._parameterList.add(index, vParameter);
    }

    /**
     */
    public void deleteInterval(
    ) {
        this._has_interval= false;
    }

    /**
     * Method enumerateParameter.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.collectd.Parameter> enumerateParameter(
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
        
        if (obj instanceof Service) {
        
            Service temp = (Service)obj;
            if (this._name != null) {
                if (temp._name == null) return false;
                else if (!(this._name.equals(temp._name))) 
                    return false;
            }
            else if (temp._name != null)
                return false;
            if (this._interval != temp._interval)
                return false;
            if (this._has_interval != temp._has_interval)
                return false;
            if (this._userDefined != null) {
                if (temp._userDefined == null) return false;
                else if (!(this._userDefined.equals(temp._userDefined))) 
                    return false;
            }
            else if (temp._userDefined != null)
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
     * Returns the value of field 'interval'. The field 'interval'
     * has the following description: the interval at which the
     * service is to be
     *  collected
     * 
     * @return the value of field 'Interval'.
     */
    public long getInterval(
    ) {
        return this._interval;
    }

    /**
     * Returns the value of field 'name'. The field 'name' has the
     * following description: the service name
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
     * org.opennms.netmgt.config.collectd.Parameter at the given
     * index
     */
    public org.opennms.netmgt.config.collectd.Parameter getParameter(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._parameterList.size()) {
            throw new IndexOutOfBoundsException("getParameter: Index value '" + index + "' not in range [0.." + (this._parameterList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.collectd.Parameter) _parameterList.get(index);
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
    public org.opennms.netmgt.config.collectd.Parameter[] getParameter(
    ) {
        org.opennms.netmgt.config.collectd.Parameter[] array = new org.opennms.netmgt.config.collectd.Parameter[0];
        return (org.opennms.netmgt.config.collectd.Parameter[]) this._parameterList.toArray(array);
    }

    /**
     * Method getParameterCollection.Returns a reference to
     * '_parameterList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.collectd.Parameter> getParameterCollection(
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
     * Returns the value of field 'status'. The field 'status' has
     * the following description: status of the service, service is
     * collected only if
     *  on
     * 
     * @return the value of field 'Status'.
     */
    public java.lang.String getStatus(
    ) {
        return this._status;
    }

    /**
     * Returns the value of field 'userDefined'. The field
     * 'userDefined' has the following description: marker to say
     * if service is user defined, used
     *  specifically for UI purposes
     * 
     * @return the value of field 'UserDefined'.
     */
    public java.lang.String getUserDefined(
    ) {
        return this._userDefined;
    }

    /**
     * Method hasInterval.
     * 
     * @return true if at least one Interval has been added
     */
    public boolean hasInterval(
    ) {
        return this._has_interval;
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
        result = 37 * result + (int)(_interval^(_interval>>>32));
        if (_userDefined != null) {
           result = 37 * result + _userDefined.hashCode();
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
    public java.util.Iterator<org.opennms.netmgt.config.collectd.Parameter> iterateParameter(
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
            final org.opennms.netmgt.config.collectd.Parameter vParameter) {
        boolean removed = _parameterList.remove(vParameter);
        return removed;
    }

    /**
     * Method removeParameterAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.collectd.Parameter removeParameterAt(
            final int index) {
        java.lang.Object obj = this._parameterList.remove(index);
        return (org.opennms.netmgt.config.collectd.Parameter) obj;
    }

    /**
     * Sets the value of field 'interval'. The field 'interval' has
     * the following description: the interval at which the service
     * is to be
     *  collected
     * 
     * @param interval the value of field 'interval'.
     */
    public void setInterval(
            final long interval) {
        this._interval = interval;
        this._has_interval = true;
    }

    /**
     * Sets the value of field 'name'. The field 'name' has the
     * following description: the service name
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
            final org.opennms.netmgt.config.collectd.Parameter vParameter)
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
            final org.opennms.netmgt.config.collectd.Parameter[] vParameterArray) {
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
            final java.util.List<org.opennms.netmgt.config.collectd.Parameter> vParameterList) {
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
            final java.util.List<org.opennms.netmgt.config.collectd.Parameter> parameterList) {
        this._parameterList = parameterList;
    }

    /**
     * Sets the value of field 'status'. The field 'status' has the
     * following description: status of the service, service is
     * collected only if
     *  on
     * 
     * @param status the value of field 'status'.
     */
    public void setStatus(
            final java.lang.String status) {
        this._status = status;
    }

    /**
     * Sets the value of field 'userDefined'. The field
     * 'userDefined' has the following description: marker to say
     * if service is user defined, used
     *  specifically for UI purposes
     * 
     * @param userDefined the value of field 'userDefined'.
     */
    public void setUserDefined(
            final java.lang.String userDefined) {
        this._userDefined = userDefined;
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
     * org.opennms.netmgt.config.collectd.Service
     */
    public static org.opennms.netmgt.config.collectd.Service unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.collectd.Service) Unmarshaller.unmarshal(org.opennms.netmgt.config.collectd.Service.class, reader);
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
