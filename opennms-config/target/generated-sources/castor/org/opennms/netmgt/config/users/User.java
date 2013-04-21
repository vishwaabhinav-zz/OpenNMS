/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.users;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class User.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class User implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _readOnly.
     */
    private boolean _readOnly = false;

    /**
     * keeps track of state for field: _readOnly
     */
    private boolean _has_readOnly;

    /**
     * Field _userId.
     */
    private java.lang.String _userId;

    /**
     * Field _fullName.
     */
    private java.lang.String _fullName;

    /**
     * Field _userComments.
     */
    private java.lang.String _userComments;

    /**
     * Field _password.
     */
    private java.lang.String _password;

    /**
     * Field _contactList.
     */
    private java.util.List<org.opennms.netmgt.config.users.Contact> _contactList;

    /**
     * Field _dutyScheduleList.
     */
    private java.util.List<java.lang.String> _dutyScheduleList;

    /**
     * Field _tuiPin.
     */
    private java.lang.String _tuiPin;


      //----------------/
     //- Constructors -/
    //----------------/

    public User() {
        super();
        this._contactList = new java.util.ArrayList<org.opennms.netmgt.config.users.Contact>();
        this._dutyScheduleList = new java.util.ArrayList<java.lang.String>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vContact
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addContact(
            final org.opennms.netmgt.config.users.Contact vContact)
    throws java.lang.IndexOutOfBoundsException {
        this._contactList.add(vContact);
    }

    /**
     * 
     * 
     * @param index
     * @param vContact
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addContact(
            final int index,
            final org.opennms.netmgt.config.users.Contact vContact)
    throws java.lang.IndexOutOfBoundsException {
        this._contactList.add(index, vContact);
    }

    /**
     * 
     * 
     * @param vDutySchedule
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDutySchedule(
            final java.lang.String vDutySchedule)
    throws java.lang.IndexOutOfBoundsException {
        this._dutyScheduleList.add(vDutySchedule);
    }

    /**
     * 
     * 
     * @param index
     * @param vDutySchedule
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDutySchedule(
            final int index,
            final java.lang.String vDutySchedule)
    throws java.lang.IndexOutOfBoundsException {
        this._dutyScheduleList.add(index, vDutySchedule);
    }

    /**
     */
    public void deleteReadOnly(
    ) {
        this._has_readOnly= false;
    }

    /**
     * Method enumerateContact.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.users.Contact> enumerateContact(
    ) {
        return java.util.Collections.enumeration(this._contactList);
    }

    /**
     * Method enumerateDutySchedule.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<java.lang.String> enumerateDutySchedule(
    ) {
        return java.util.Collections.enumeration(this._dutyScheduleList);
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
        
        if (obj instanceof User) {
        
            User temp = (User)obj;
            if (this._readOnly != temp._readOnly)
                return false;
            if (this._has_readOnly != temp._has_readOnly)
                return false;
            if (this._userId != null) {
                if (temp._userId == null) return false;
                else if (!(this._userId.equals(temp._userId))) 
                    return false;
            }
            else if (temp._userId != null)
                return false;
            if (this._fullName != null) {
                if (temp._fullName == null) return false;
                else if (!(this._fullName.equals(temp._fullName))) 
                    return false;
            }
            else if (temp._fullName != null)
                return false;
            if (this._userComments != null) {
                if (temp._userComments == null) return false;
                else if (!(this._userComments.equals(temp._userComments))) 
                    return false;
            }
            else if (temp._userComments != null)
                return false;
            if (this._password != null) {
                if (temp._password == null) return false;
                else if (!(this._password.equals(temp._password))) 
                    return false;
            }
            else if (temp._password != null)
                return false;
            if (this._contactList != null) {
                if (temp._contactList == null) return false;
                else if (!(this._contactList.equals(temp._contactList))) 
                    return false;
            }
            else if (temp._contactList != null)
                return false;
            if (this._dutyScheduleList != null) {
                if (temp._dutyScheduleList == null) return false;
                else if (!(this._dutyScheduleList.equals(temp._dutyScheduleList))) 
                    return false;
            }
            else if (temp._dutyScheduleList != null)
                return false;
            if (this._tuiPin != null) {
                if (temp._tuiPin == null) return false;
                else if (!(this._tuiPin.equals(temp._tuiPin))) 
                    return false;
            }
            else if (temp._tuiPin != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Method getContact.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.users.Contact at the given index
     */
    public org.opennms.netmgt.config.users.Contact getContact(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._contactList.size()) {
            throw new IndexOutOfBoundsException("getContact: Index value '" + index + "' not in range [0.." + (this._contactList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.users.Contact) _contactList.get(index);
    }

    /**
     * Method getContact.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.users.Contact[] getContact(
    ) {
        org.opennms.netmgt.config.users.Contact[] array = new org.opennms.netmgt.config.users.Contact[0];
        return (org.opennms.netmgt.config.users.Contact[]) this._contactList.toArray(array);
    }

    /**
     * Method getContactCollection.Returns a reference to
     * '_contactList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.users.Contact> getContactCollection(
    ) {
        return this._contactList;
    }

    /**
     * Method getContactCount.
     * 
     * @return the size of this collection
     */
    public int getContactCount(
    ) {
        return this._contactList.size();
    }

    /**
     * Method getDutySchedule.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the java.lang.String at the given index
     */
    public java.lang.String getDutySchedule(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._dutyScheduleList.size()) {
            throw new IndexOutOfBoundsException("getDutySchedule: Index value '" + index + "' not in range [0.." + (this._dutyScheduleList.size() - 1) + "]");
        }
        
        return (java.lang.String) _dutyScheduleList.get(index);
    }

    /**
     * Method getDutySchedule.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public java.lang.String[] getDutySchedule(
    ) {
        java.lang.String[] array = new java.lang.String[0];
        return (java.lang.String[]) this._dutyScheduleList.toArray(array);
    }

    /**
     * Method getDutyScheduleCollection.Returns a reference to
     * '_dutyScheduleList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<java.lang.String> getDutyScheduleCollection(
    ) {
        return this._dutyScheduleList;
    }

    /**
     * Method getDutyScheduleCount.
     * 
     * @return the size of this collection
     */
    public int getDutyScheduleCount(
    ) {
        return this._dutyScheduleList.size();
    }

    /**
     * Returns the value of field 'fullName'.
     * 
     * @return the value of field 'FullName'.
     */
    public java.lang.String getFullName(
    ) {
        return this._fullName;
    }

    /**
     * Returns the value of field 'password'.
     * 
     * @return the value of field 'Password'.
     */
    public java.lang.String getPassword(
    ) {
        return this._password;
    }

    /**
     * Returns the value of field 'readOnly'.
     * 
     * @return the value of field 'ReadOnly'.
     */
    public boolean getReadOnly(
    ) {
        return this._readOnly;
    }

    /**
     * Returns the value of field 'tuiPin'.
     * 
     * @return the value of field 'TuiPin'.
     */
    public java.lang.String getTuiPin(
    ) {
        return this._tuiPin;
    }

    /**
     * Returns the value of field 'userComments'.
     * 
     * @return the value of field 'UserComments'.
     */
    public java.lang.String getUserComments(
    ) {
        return this._userComments;
    }

    /**
     * Returns the value of field 'userId'.
     * 
     * @return the value of field 'UserId'.
     */
    public java.lang.String getUserId(
    ) {
        return this._userId;
    }

    /**
     * Method hasReadOnly.
     * 
     * @return true if at least one ReadOnly has been added
     */
    public boolean hasReadOnly(
    ) {
        return this._has_readOnly;
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
        result = 37 * result + (_readOnly?0:1);
        if (_userId != null) {
           result = 37 * result + _userId.hashCode();
        }
        if (_fullName != null) {
           result = 37 * result + _fullName.hashCode();
        }
        if (_userComments != null) {
           result = 37 * result + _userComments.hashCode();
        }
        if (_password != null) {
           result = 37 * result + _password.hashCode();
        }
        if (_contactList != null) {
           result = 37 * result + _contactList.hashCode();
        }
        if (_dutyScheduleList != null) {
           result = 37 * result + _dutyScheduleList.hashCode();
        }
        if (_tuiPin != null) {
           result = 37 * result + _tuiPin.hashCode();
        }
        
        return result;
    }

    /**
     * Returns the value of field 'readOnly'.
     * 
     * @return the value of field 'ReadOnly'.
     */
    public boolean isReadOnly(
    ) {
        return this._readOnly;
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
     * Method iterateContact.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.users.Contact> iterateContact(
    ) {
        return this._contactList.iterator();
    }

    /**
     * Method iterateDutySchedule.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<java.lang.String> iterateDutySchedule(
    ) {
        return this._dutyScheduleList.iterator();
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
    public void removeAllContact(
    ) {
        this._contactList.clear();
    }

    /**
     */
    public void removeAllDutySchedule(
    ) {
        this._dutyScheduleList.clear();
    }

    /**
     * Method removeContact.
     * 
     * @param vContact
     * @return true if the object was removed from the collection.
     */
    public boolean removeContact(
            final org.opennms.netmgt.config.users.Contact vContact) {
        boolean removed = _contactList.remove(vContact);
        return removed;
    }

    /**
     * Method removeContactAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.users.Contact removeContactAt(
            final int index) {
        java.lang.Object obj = this._contactList.remove(index);
        return (org.opennms.netmgt.config.users.Contact) obj;
    }

    /**
     * Method removeDutySchedule.
     * 
     * @param vDutySchedule
     * @return true if the object was removed from the collection.
     */
    public boolean removeDutySchedule(
            final java.lang.String vDutySchedule) {
        boolean removed = _dutyScheduleList.remove(vDutySchedule);
        return removed;
    }

    /**
     * Method removeDutyScheduleAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public java.lang.String removeDutyScheduleAt(
            final int index) {
        java.lang.Object obj = this._dutyScheduleList.remove(index);
        return (java.lang.String) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vContact
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setContact(
            final int index,
            final org.opennms.netmgt.config.users.Contact vContact)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._contactList.size()) {
            throw new IndexOutOfBoundsException("setContact: Index value '" + index + "' not in range [0.." + (this._contactList.size() - 1) + "]");
        }
        
        this._contactList.set(index, vContact);
    }

    /**
     * 
     * 
     * @param vContactArray
     */
    public void setContact(
            final org.opennms.netmgt.config.users.Contact[] vContactArray) {
        //-- copy array
        _contactList.clear();
        
        for (int i = 0; i < vContactArray.length; i++) {
                this._contactList.add(vContactArray[i]);
        }
    }

    /**
     * Sets the value of '_contactList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vContactList the Vector to copy.
     */
    public void setContact(
            final java.util.List<org.opennms.netmgt.config.users.Contact> vContactList) {
        // copy vector
        this._contactList.clear();
        
        this._contactList.addAll(vContactList);
    }

    /**
     * Sets the value of '_contactList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param contactList the Vector to set.
     */
    public void setContactCollection(
            final java.util.List<org.opennms.netmgt.config.users.Contact> contactList) {
        this._contactList = contactList;
    }

    /**
     * 
     * 
     * @param index
     * @param vDutySchedule
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setDutySchedule(
            final int index,
            final java.lang.String vDutySchedule)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._dutyScheduleList.size()) {
            throw new IndexOutOfBoundsException("setDutySchedule: Index value '" + index + "' not in range [0.." + (this._dutyScheduleList.size() - 1) + "]");
        }
        
        this._dutyScheduleList.set(index, vDutySchedule);
    }

    /**
     * 
     * 
     * @param vDutyScheduleArray
     */
    public void setDutySchedule(
            final java.lang.String[] vDutyScheduleArray) {
        //-- copy array
        _dutyScheduleList.clear();
        
        for (int i = 0; i < vDutyScheduleArray.length; i++) {
                this._dutyScheduleList.add(vDutyScheduleArray[i]);
        }
    }

    /**
     * Sets the value of '_dutyScheduleList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vDutyScheduleList the Vector to copy.
     */
    public void setDutySchedule(
            final java.util.List<java.lang.String> vDutyScheduleList) {
        // copy vector
        this._dutyScheduleList.clear();
        
        this._dutyScheduleList.addAll(vDutyScheduleList);
    }

    /**
     * Sets the value of '_dutyScheduleList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param dutyScheduleList the Vector to set.
     */
    public void setDutyScheduleCollection(
            final java.util.List<java.lang.String> dutyScheduleList) {
        this._dutyScheduleList = dutyScheduleList;
    }

    /**
     * Sets the value of field 'fullName'.
     * 
     * @param fullName the value of field 'fullName'.
     */
    public void setFullName(
            final java.lang.String fullName) {
        this._fullName = fullName;
    }

    /**
     * Sets the value of field 'password'.
     * 
     * @param password the value of field 'password'.
     */
    public void setPassword(
            final java.lang.String password) {
        this._password = password;
    }

    /**
     * Sets the value of field 'readOnly'.
     * 
     * @param readOnly the value of field 'readOnly'.
     */
    public void setReadOnly(
            final boolean readOnly) {
        this._readOnly = readOnly;
        this._has_readOnly = true;
    }

    /**
     * Sets the value of field 'tuiPin'.
     * 
     * @param tuiPin the value of field 'tuiPin'.
     */
    public void setTuiPin(
            final java.lang.String tuiPin) {
        this._tuiPin = tuiPin;
    }

    /**
     * Sets the value of field 'userComments'.
     * 
     * @param userComments the value of field 'userComments'.
     */
    public void setUserComments(
            final java.lang.String userComments) {
        this._userComments = userComments;
    }

    /**
     * Sets the value of field 'userId'.
     * 
     * @param userId the value of field 'userId'.
     */
    public void setUserId(
            final java.lang.String userId) {
        this._userId = userId;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.opennms.netmgt.config.users.User
     */
    public static org.opennms.netmgt.config.users.User unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.users.User) Unmarshaller.unmarshal(org.opennms.netmgt.config.users.User.class, reader);
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
