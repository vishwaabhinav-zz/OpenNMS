/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.syslogd;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * List of Strings to UEI matches
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class UeiMatch implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The name of a syslog facility. If present, the facility of
     *  an incoming message must match one of the facilities named
     *  by an instance of this tag within the ueiMatch.
     *  
     */
    private java.util.List<java.lang.String> _facilityList;

    /**
     * The name of a syslog severity. If present, the severity of
     *  an incoming message must match one of the severities named
     *  by an instance of this tag within the ueiMatch.
     *  
     */
    private java.util.List<java.lang.String> _severityList;

    /**
     * String against which to match the process name; interpreted
     *  as a regular expression. If no process name is present in
     *  the incoming message, any process-match elements will be
     *  considered non-matches.
     *  
     */
    private org.opennms.netmgt.config.syslogd.ProcessMatch _processMatch;

    /**
     * String against which to match the hostname; interpreted
     *  as a regular expression.
     *  
     */
    private org.opennms.netmgt.config.syslogd.HostnameMatch _hostnameMatch;

    /**
     * String against which to match the host IP address;
     * interpreted
     *  as a regular expression.
     *  
     */
    private org.opennms.netmgt.config.syslogd.HostaddrMatch _hostaddrMatch;

    /**
     * String against which to match the message body; interpreted
     *  as a substring or a regular expression according to the
     *  value of the "type" attribute
     *  
     */
    private org.opennms.netmgt.config.syslogd.Match _match;

    /**
     * UEI
     */
    private java.lang.String _uei;

    /**
     * For regex matches, assign the value of a matching group
     *  to a named event parameter
     *  
     */
    private java.util.List<org.opennms.netmgt.config.syslogd.ParameterAssignment> _parameterAssignmentList;


      //----------------/
     //- Constructors -/
    //----------------/

    public UeiMatch() {
        super();
        this._facilityList = new java.util.ArrayList<java.lang.String>();
        this._severityList = new java.util.ArrayList<java.lang.String>();
        this._parameterAssignmentList = new java.util.ArrayList<org.opennms.netmgt.config.syslogd.ParameterAssignment>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vFacility
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addFacility(
            final java.lang.String vFacility)
    throws java.lang.IndexOutOfBoundsException {
        this._facilityList.add(vFacility);
    }

    /**
     * 
     * 
     * @param index
     * @param vFacility
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addFacility(
            final int index,
            final java.lang.String vFacility)
    throws java.lang.IndexOutOfBoundsException {
        this._facilityList.add(index, vFacility);
    }

    /**
     * 
     * 
     * @param vParameterAssignment
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addParameterAssignment(
            final org.opennms.netmgt.config.syslogd.ParameterAssignment vParameterAssignment)
    throws java.lang.IndexOutOfBoundsException {
        this._parameterAssignmentList.add(vParameterAssignment);
    }

    /**
     * 
     * 
     * @param index
     * @param vParameterAssignment
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addParameterAssignment(
            final int index,
            final org.opennms.netmgt.config.syslogd.ParameterAssignment vParameterAssignment)
    throws java.lang.IndexOutOfBoundsException {
        this._parameterAssignmentList.add(index, vParameterAssignment);
    }

    /**
     * 
     * 
     * @param vSeverity
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSeverity(
            final java.lang.String vSeverity)
    throws java.lang.IndexOutOfBoundsException {
        this._severityList.add(vSeverity);
    }

    /**
     * 
     * 
     * @param index
     * @param vSeverity
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSeverity(
            final int index,
            final java.lang.String vSeverity)
    throws java.lang.IndexOutOfBoundsException {
        this._severityList.add(index, vSeverity);
    }

    /**
     * Method enumerateFacility.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<java.lang.String> enumerateFacility(
    ) {
        return java.util.Collections.enumeration(this._facilityList);
    }

    /**
     * Method enumerateParameterAssignment.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.syslogd.ParameterAssignment> enumerateParameterAssignment(
    ) {
        return java.util.Collections.enumeration(this._parameterAssignmentList);
    }

    /**
     * Method enumerateSeverity.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<java.lang.String> enumerateSeverity(
    ) {
        return java.util.Collections.enumeration(this._severityList);
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
        
        if (obj instanceof UeiMatch) {
        
            UeiMatch temp = (UeiMatch)obj;
            if (this._facilityList != null) {
                if (temp._facilityList == null) return false;
                else if (!(this._facilityList.equals(temp._facilityList))) 
                    return false;
            }
            else if (temp._facilityList != null)
                return false;
            if (this._severityList != null) {
                if (temp._severityList == null) return false;
                else if (!(this._severityList.equals(temp._severityList))) 
                    return false;
            }
            else if (temp._severityList != null)
                return false;
            if (this._processMatch != null) {
                if (temp._processMatch == null) return false;
                else if (!(this._processMatch.equals(temp._processMatch))) 
                    return false;
            }
            else if (temp._processMatch != null)
                return false;
            if (this._hostnameMatch != null) {
                if (temp._hostnameMatch == null) return false;
                else if (!(this._hostnameMatch.equals(temp._hostnameMatch))) 
                    return false;
            }
            else if (temp._hostnameMatch != null)
                return false;
            if (this._hostaddrMatch != null) {
                if (temp._hostaddrMatch == null) return false;
                else if (!(this._hostaddrMatch.equals(temp._hostaddrMatch))) 
                    return false;
            }
            else if (temp._hostaddrMatch != null)
                return false;
            if (this._match != null) {
                if (temp._match == null) return false;
                else if (!(this._match.equals(temp._match))) 
                    return false;
            }
            else if (temp._match != null)
                return false;
            if (this._uei != null) {
                if (temp._uei == null) return false;
                else if (!(this._uei.equals(temp._uei))) 
                    return false;
            }
            else if (temp._uei != null)
                return false;
            if (this._parameterAssignmentList != null) {
                if (temp._parameterAssignmentList == null) return false;
                else if (!(this._parameterAssignmentList.equals(temp._parameterAssignmentList))) 
                    return false;
            }
            else if (temp._parameterAssignmentList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Method getFacility.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the java.lang.String at the given index
     */
    public java.lang.String getFacility(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._facilityList.size()) {
            throw new IndexOutOfBoundsException("getFacility: Index value '" + index + "' not in range [0.." + (this._facilityList.size() - 1) + "]");
        }
        
        return (java.lang.String) _facilityList.get(index);
    }

    /**
     * Method getFacility.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public java.lang.String[] getFacility(
    ) {
        java.lang.String[] array = new java.lang.String[0];
        return (java.lang.String[]) this._facilityList.toArray(array);
    }

    /**
     * Method getFacilityCollection.Returns a reference to
     * '_facilityList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<java.lang.String> getFacilityCollection(
    ) {
        return this._facilityList;
    }

    /**
     * Method getFacilityCount.
     * 
     * @return the size of this collection
     */
    public int getFacilityCount(
    ) {
        return this._facilityList.size();
    }

    /**
     * Returns the value of field 'hostaddrMatch'. The field
     * 'hostaddrMatch' has the following description: String
     * against which to match the host IP address; interpreted
     *  as a regular expression.
     *  
     * 
     * @return the value of field 'HostaddrMatch'.
     */
    public org.opennms.netmgt.config.syslogd.HostaddrMatch getHostaddrMatch(
    ) {
        return this._hostaddrMatch;
    }

    /**
     * Returns the value of field 'hostnameMatch'. The field
     * 'hostnameMatch' has the following description: String
     * against which to match the hostname; interpreted
     *  as a regular expression.
     *  
     * 
     * @return the value of field 'HostnameMatch'.
     */
    public org.opennms.netmgt.config.syslogd.HostnameMatch getHostnameMatch(
    ) {
        return this._hostnameMatch;
    }

    /**
     * Returns the value of field 'match'. The field 'match' has
     * the following description: String against which to match the
     * message body; interpreted
     *  as a substring or a regular expression according to the
     *  value of the "type" attribute
     *  
     * 
     * @return the value of field 'Match'.
     */
    public org.opennms.netmgt.config.syslogd.Match getMatch(
    ) {
        return this._match;
    }

    /**
     * Method getParameterAssignment.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.syslogd.ParameterAssignment at the
     * given index
     */
    public org.opennms.netmgt.config.syslogd.ParameterAssignment getParameterAssignment(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._parameterAssignmentList.size()) {
            throw new IndexOutOfBoundsException("getParameterAssignment: Index value '" + index + "' not in range [0.." + (this._parameterAssignmentList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.syslogd.ParameterAssignment) _parameterAssignmentList.get(index);
    }

    /**
     * Method getParameterAssignment.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.syslogd.ParameterAssignment[] getParameterAssignment(
    ) {
        org.opennms.netmgt.config.syslogd.ParameterAssignment[] array = new org.opennms.netmgt.config.syslogd.ParameterAssignment[0];
        return (org.opennms.netmgt.config.syslogd.ParameterAssignment[]) this._parameterAssignmentList.toArray(array);
    }

    /**
     * Method getParameterAssignmentCollection.Returns a reference
     * to '_parameterAssignmentList'. No type checking is performed
     * on any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.syslogd.ParameterAssignment> getParameterAssignmentCollection(
    ) {
        return this._parameterAssignmentList;
    }

    /**
     * Method getParameterAssignmentCount.
     * 
     * @return the size of this collection
     */
    public int getParameterAssignmentCount(
    ) {
        return this._parameterAssignmentList.size();
    }

    /**
     * Returns the value of field 'processMatch'. The field
     * 'processMatch' has the following description: String against
     * which to match the process name; interpreted
     *  as a regular expression. If no process name is present in
     *  the incoming message, any process-match elements will be
     *  considered non-matches.
     *  
     * 
     * @return the value of field 'ProcessMatch'.
     */
    public org.opennms.netmgt.config.syslogd.ProcessMatch getProcessMatch(
    ) {
        return this._processMatch;
    }

    /**
     * Method getSeverity.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the java.lang.String at the given index
     */
    public java.lang.String getSeverity(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._severityList.size()) {
            throw new IndexOutOfBoundsException("getSeverity: Index value '" + index + "' not in range [0.." + (this._severityList.size() - 1) + "]");
        }
        
        return (java.lang.String) _severityList.get(index);
    }

    /**
     * Method getSeverity.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public java.lang.String[] getSeverity(
    ) {
        java.lang.String[] array = new java.lang.String[0];
        return (java.lang.String[]) this._severityList.toArray(array);
    }

    /**
     * Method getSeverityCollection.Returns a reference to
     * '_severityList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<java.lang.String> getSeverityCollection(
    ) {
        return this._severityList;
    }

    /**
     * Method getSeverityCount.
     * 
     * @return the size of this collection
     */
    public int getSeverityCount(
    ) {
        return this._severityList.size();
    }

    /**
     * Returns the value of field 'uei'. The field 'uei' has the
     * following description: UEI
     * 
     * @return the value of field 'Uei'.
     */
    public java.lang.String getUei(
    ) {
        return this._uei;
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
        if (_facilityList != null) {
           result = 37 * result + _facilityList.hashCode();
        }
        if (_severityList != null) {
           result = 37 * result + _severityList.hashCode();
        }
        if (_processMatch != null) {
           result = 37 * result + _processMatch.hashCode();
        }
        if (_hostnameMatch != null) {
           result = 37 * result + _hostnameMatch.hashCode();
        }
        if (_hostaddrMatch != null) {
           result = 37 * result + _hostaddrMatch.hashCode();
        }
        if (_match != null) {
           result = 37 * result + _match.hashCode();
        }
        if (_uei != null) {
           result = 37 * result + _uei.hashCode();
        }
        if (_parameterAssignmentList != null) {
           result = 37 * result + _parameterAssignmentList.hashCode();
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
     * Method iterateFacility.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<java.lang.String> iterateFacility(
    ) {
        return this._facilityList.iterator();
    }

    /**
     * Method iterateParameterAssignment.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.syslogd.ParameterAssignment> iterateParameterAssignment(
    ) {
        return this._parameterAssignmentList.iterator();
    }

    /**
     * Method iterateSeverity.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<java.lang.String> iterateSeverity(
    ) {
        return this._severityList.iterator();
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
    public void removeAllFacility(
    ) {
        this._facilityList.clear();
    }

    /**
     */
    public void removeAllParameterAssignment(
    ) {
        this._parameterAssignmentList.clear();
    }

    /**
     */
    public void removeAllSeverity(
    ) {
        this._severityList.clear();
    }

    /**
     * Method removeFacility.
     * 
     * @param vFacility
     * @return true if the object was removed from the collection.
     */
    public boolean removeFacility(
            final java.lang.String vFacility) {
        boolean removed = _facilityList.remove(vFacility);
        return removed;
    }

    /**
     * Method removeFacilityAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public java.lang.String removeFacilityAt(
            final int index) {
        java.lang.Object obj = this._facilityList.remove(index);
        return (java.lang.String) obj;
    }

    /**
     * Method removeParameterAssignment.
     * 
     * @param vParameterAssignment
     * @return true if the object was removed from the collection.
     */
    public boolean removeParameterAssignment(
            final org.opennms.netmgt.config.syslogd.ParameterAssignment vParameterAssignment) {
        boolean removed = _parameterAssignmentList.remove(vParameterAssignment);
        return removed;
    }

    /**
     * Method removeParameterAssignmentAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.syslogd.ParameterAssignment removeParameterAssignmentAt(
            final int index) {
        java.lang.Object obj = this._parameterAssignmentList.remove(index);
        return (org.opennms.netmgt.config.syslogd.ParameterAssignment) obj;
    }

    /**
     * Method removeSeverity.
     * 
     * @param vSeverity
     * @return true if the object was removed from the collection.
     */
    public boolean removeSeverity(
            final java.lang.String vSeverity) {
        boolean removed = _severityList.remove(vSeverity);
        return removed;
    }

    /**
     * Method removeSeverityAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public java.lang.String removeSeverityAt(
            final int index) {
        java.lang.Object obj = this._severityList.remove(index);
        return (java.lang.String) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vFacility
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setFacility(
            final int index,
            final java.lang.String vFacility)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._facilityList.size()) {
            throw new IndexOutOfBoundsException("setFacility: Index value '" + index + "' not in range [0.." + (this._facilityList.size() - 1) + "]");
        }
        
        this._facilityList.set(index, vFacility);
    }

    /**
     * 
     * 
     * @param vFacilityArray
     */
    public void setFacility(
            final java.lang.String[] vFacilityArray) {
        //-- copy array
        _facilityList.clear();
        
        for (int i = 0; i < vFacilityArray.length; i++) {
                this._facilityList.add(vFacilityArray[i]);
        }
    }

    /**
     * Sets the value of '_facilityList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vFacilityList the Vector to copy.
     */
    public void setFacility(
            final java.util.List<java.lang.String> vFacilityList) {
        // copy vector
        this._facilityList.clear();
        
        this._facilityList.addAll(vFacilityList);
    }

    /**
     * Sets the value of '_facilityList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param facilityList the Vector to set.
     */
    public void setFacilityCollection(
            final java.util.List<java.lang.String> facilityList) {
        this._facilityList = facilityList;
    }

    /**
     * Sets the value of field 'hostaddrMatch'. The field
     * 'hostaddrMatch' has the following description: String
     * against which to match the host IP address; interpreted
     *  as a regular expression.
     *  
     * 
     * @param hostaddrMatch the value of field 'hostaddrMatch'.
     */
    public void setHostaddrMatch(
            final org.opennms.netmgt.config.syslogd.HostaddrMatch hostaddrMatch) {
        this._hostaddrMatch = hostaddrMatch;
    }

    /**
     * Sets the value of field 'hostnameMatch'. The field
     * 'hostnameMatch' has the following description: String
     * against which to match the hostname; interpreted
     *  as a regular expression.
     *  
     * 
     * @param hostnameMatch the value of field 'hostnameMatch'.
     */
    public void setHostnameMatch(
            final org.opennms.netmgt.config.syslogd.HostnameMatch hostnameMatch) {
        this._hostnameMatch = hostnameMatch;
    }

    /**
     * Sets the value of field 'match'. The field 'match' has the
     * following description: String against which to match the
     * message body; interpreted
     *  as a substring or a regular expression according to the
     *  value of the "type" attribute
     *  
     * 
     * @param match the value of field 'match'.
     */
    public void setMatch(
            final org.opennms.netmgt.config.syslogd.Match match) {
        this._match = match;
    }

    /**
     * 
     * 
     * @param index
     * @param vParameterAssignment
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setParameterAssignment(
            final int index,
            final org.opennms.netmgt.config.syslogd.ParameterAssignment vParameterAssignment)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._parameterAssignmentList.size()) {
            throw new IndexOutOfBoundsException("setParameterAssignment: Index value '" + index + "' not in range [0.." + (this._parameterAssignmentList.size() - 1) + "]");
        }
        
        this._parameterAssignmentList.set(index, vParameterAssignment);
    }

    /**
     * 
     * 
     * @param vParameterAssignmentArray
     */
    public void setParameterAssignment(
            final org.opennms.netmgt.config.syslogd.ParameterAssignment[] vParameterAssignmentArray) {
        //-- copy array
        _parameterAssignmentList.clear();
        
        for (int i = 0; i < vParameterAssignmentArray.length; i++) {
                this._parameterAssignmentList.add(vParameterAssignmentArray[i]);
        }
    }

    /**
     * Sets the value of '_parameterAssignmentList' by copying the
     * given Vector. All elements will be checked for type safety.
     * 
     * @param vParameterAssignmentList the Vector to copy.
     */
    public void setParameterAssignment(
            final java.util.List<org.opennms.netmgt.config.syslogd.ParameterAssignment> vParameterAssignmentList) {
        // copy vector
        this._parameterAssignmentList.clear();
        
        this._parameterAssignmentList.addAll(vParameterAssignmentList);
    }

    /**
     * Sets the value of '_parameterAssignmentList' by setting it
     * to the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param parameterAssignmentList the Vector to set.
     */
    public void setParameterAssignmentCollection(
            final java.util.List<org.opennms.netmgt.config.syslogd.ParameterAssignment> parameterAssignmentList) {
        this._parameterAssignmentList = parameterAssignmentList;
    }

    /**
     * Sets the value of field 'processMatch'. The field
     * 'processMatch' has the following description: String against
     * which to match the process name; interpreted
     *  as a regular expression. If no process name is present in
     *  the incoming message, any process-match elements will be
     *  considered non-matches.
     *  
     * 
     * @param processMatch the value of field 'processMatch'.
     */
    public void setProcessMatch(
            final org.opennms.netmgt.config.syslogd.ProcessMatch processMatch) {
        this._processMatch = processMatch;
    }

    /**
     * 
     * 
     * @param index
     * @param vSeverity
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSeverity(
            final int index,
            final java.lang.String vSeverity)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._severityList.size()) {
            throw new IndexOutOfBoundsException("setSeverity: Index value '" + index + "' not in range [0.." + (this._severityList.size() - 1) + "]");
        }
        
        this._severityList.set(index, vSeverity);
    }

    /**
     * 
     * 
     * @param vSeverityArray
     */
    public void setSeverity(
            final java.lang.String[] vSeverityArray) {
        //-- copy array
        _severityList.clear();
        
        for (int i = 0; i < vSeverityArray.length; i++) {
                this._severityList.add(vSeverityArray[i]);
        }
    }

    /**
     * Sets the value of '_severityList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vSeverityList the Vector to copy.
     */
    public void setSeverity(
            final java.util.List<java.lang.String> vSeverityList) {
        // copy vector
        this._severityList.clear();
        
        this._severityList.addAll(vSeverityList);
    }

    /**
     * Sets the value of '_severityList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param severityList the Vector to set.
     */
    public void setSeverityCollection(
            final java.util.List<java.lang.String> severityList) {
        this._severityList = severityList;
    }

    /**
     * Sets the value of field 'uei'. The field 'uei' has the
     * following description: UEI
     * 
     * @param uei the value of field 'uei'.
     */
    public void setUei(
            final java.lang.String uei) {
        this._uei = uei;
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
     * org.opennms.netmgt.config.syslogd.UeiMatch
     */
    public static org.opennms.netmgt.config.syslogd.UeiMatch unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.syslogd.UeiMatch) Unmarshaller.unmarshal(org.opennms.netmgt.config.syslogd.UeiMatch.class, reader);
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
