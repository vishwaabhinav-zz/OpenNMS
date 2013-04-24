/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.groups;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class Role.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Role implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _name.
     */
    private java.lang.String _name;

    /**
     * Field _membershipGroup.
     */
    private java.lang.String _membershipGroup;

    /**
     * Field _supervisor.
     */
    private java.lang.String _supervisor;

    /**
     * Field _description.
     */
    private java.lang.String _description;

    /**
     * Field _scheduleList.
     */
    private java.util.List<org.opennms.netmgt.config.groups.Schedule> _scheduleList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Role() {
        super();
        this._scheduleList = new java.util.ArrayList<org.opennms.netmgt.config.groups.Schedule>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vSchedule
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSchedule(
            final org.opennms.netmgt.config.groups.Schedule vSchedule)
    throws java.lang.IndexOutOfBoundsException {
        this._scheduleList.add(vSchedule);
    }

    /**
     * 
     * 
     * @param index
     * @param vSchedule
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSchedule(
            final int index,
            final org.opennms.netmgt.config.groups.Schedule vSchedule)
    throws java.lang.IndexOutOfBoundsException {
        this._scheduleList.add(index, vSchedule);
    }

    /**
     * Method enumerateSchedule.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.groups.Schedule> enumerateSchedule(
    ) {
        return java.util.Collections.enumeration(this._scheduleList);
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
        
        if (obj instanceof Role) {
        
            Role temp = (Role)obj;
            if (this._name != null) {
                if (temp._name == null) return false;
                else if (!(this._name.equals(temp._name))) 
                    return false;
            }
            else if (temp._name != null)
                return false;
            if (this._membershipGroup != null) {
                if (temp._membershipGroup == null) return false;
                else if (!(this._membershipGroup.equals(temp._membershipGroup))) 
                    return false;
            }
            else if (temp._membershipGroup != null)
                return false;
            if (this._supervisor != null) {
                if (temp._supervisor == null) return false;
                else if (!(this._supervisor.equals(temp._supervisor))) 
                    return false;
            }
            else if (temp._supervisor != null)
                return false;
            if (this._description != null) {
                if (temp._description == null) return false;
                else if (!(this._description.equals(temp._description))) 
                    return false;
            }
            else if (temp._description != null)
                return false;
            if (this._scheduleList != null) {
                if (temp._scheduleList == null) return false;
                else if (!(this._scheduleList.equals(temp._scheduleList))) 
                    return false;
            }
            else if (temp._scheduleList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'description'.
     * 
     * @return the value of field 'Description'.
     */
    public java.lang.String getDescription(
    ) {
        return this._description;
    }

    /**
     * Returns the value of field 'membershipGroup'.
     * 
     * @return the value of field 'MembershipGroup'.
     */
    public java.lang.String getMembershipGroup(
    ) {
        return this._membershipGroup;
    }

    /**
     * Returns the value of field 'name'.
     * 
     * @return the value of field 'Name'.
     */
    public java.lang.String getName(
    ) {
        return this._name;
    }

    /**
     * Method getSchedule.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.groups.Schedule at the given index
     */
    public org.opennms.netmgt.config.groups.Schedule getSchedule(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._scheduleList.size()) {
            throw new IndexOutOfBoundsException("getSchedule: Index value '" + index + "' not in range [0.." + (this._scheduleList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.groups.Schedule) _scheduleList.get(index);
    }

    /**
     * Method getSchedule.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.groups.Schedule[] getSchedule(
    ) {
        org.opennms.netmgt.config.groups.Schedule[] array = new org.opennms.netmgt.config.groups.Schedule[0];
        return (org.opennms.netmgt.config.groups.Schedule[]) this._scheduleList.toArray(array);
    }

    /**
     * Method getScheduleCollection.Returns a reference to
     * '_scheduleList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.groups.Schedule> getScheduleCollection(
    ) {
        return this._scheduleList;
    }

    /**
     * Method getScheduleCount.
     * 
     * @return the size of this collection
     */
    public int getScheduleCount(
    ) {
        return this._scheduleList.size();
    }

    /**
     * Returns the value of field 'supervisor'.
     * 
     * @return the value of field 'Supervisor'.
     */
    public java.lang.String getSupervisor(
    ) {
        return this._supervisor;
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
        if (_membershipGroup != null) {
           result = 37 * result + _membershipGroup.hashCode();
        }
        if (_supervisor != null) {
           result = 37 * result + _supervisor.hashCode();
        }
        if (_description != null) {
           result = 37 * result + _description.hashCode();
        }
        if (_scheduleList != null) {
           result = 37 * result + _scheduleList.hashCode();
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
     * Method iterateSchedule.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.groups.Schedule> iterateSchedule(
    ) {
        return this._scheduleList.iterator();
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
    public void removeAllSchedule(
    ) {
        this._scheduleList.clear();
    }

    /**
     * Method removeSchedule.
     * 
     * @param vSchedule
     * @return true if the object was removed from the collection.
     */
    public boolean removeSchedule(
            final org.opennms.netmgt.config.groups.Schedule vSchedule) {
        boolean removed = _scheduleList.remove(vSchedule);
        return removed;
    }

    /**
     * Method removeScheduleAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.groups.Schedule removeScheduleAt(
            final int index) {
        java.lang.Object obj = this._scheduleList.remove(index);
        return (org.opennms.netmgt.config.groups.Schedule) obj;
    }

    /**
     * Sets the value of field 'description'.
     * 
     * @param description the value of field 'description'.
     */
    public void setDescription(
            final java.lang.String description) {
        this._description = description;
    }

    /**
     * Sets the value of field 'membershipGroup'.
     * 
     * @param membershipGroup the value of field 'membershipGroup'.
     */
    public void setMembershipGroup(
            final java.lang.String membershipGroup) {
        this._membershipGroup = membershipGroup;
    }

    /**
     * Sets the value of field 'name'.
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
     * @param vSchedule
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSchedule(
            final int index,
            final org.opennms.netmgt.config.groups.Schedule vSchedule)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._scheduleList.size()) {
            throw new IndexOutOfBoundsException("setSchedule: Index value '" + index + "' not in range [0.." + (this._scheduleList.size() - 1) + "]");
        }
        
        this._scheduleList.set(index, vSchedule);
    }

    /**
     * 
     * 
     * @param vScheduleArray
     */
    public void setSchedule(
            final org.opennms.netmgt.config.groups.Schedule[] vScheduleArray) {
        //-- copy array
        _scheduleList.clear();
        
        for (int i = 0; i < vScheduleArray.length; i++) {
                this._scheduleList.add(vScheduleArray[i]);
        }
    }

    /**
     * Sets the value of '_scheduleList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vScheduleList the Vector to copy.
     */
    public void setSchedule(
            final java.util.List<org.opennms.netmgt.config.groups.Schedule> vScheduleList) {
        // copy vector
        this._scheduleList.clear();
        
        this._scheduleList.addAll(vScheduleList);
    }

    /**
     * Sets the value of '_scheduleList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param scheduleList the Vector to set.
     */
    public void setScheduleCollection(
            final java.util.List<org.opennms.netmgt.config.groups.Schedule> scheduleList) {
        this._scheduleList = scheduleList;
    }

    /**
     * Sets the value of field 'supervisor'.
     * 
     * @param supervisor the value of field 'supervisor'.
     */
    public void setSupervisor(
            final java.lang.String supervisor) {
        this._supervisor = supervisor;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.opennms.netmgt.config.groups.Role
     */
    public static org.opennms.netmgt.config.groups.Role unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.groups.Role) Unmarshaller.unmarshal(org.opennms.netmgt.config.groups.Role.class, reader);
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
