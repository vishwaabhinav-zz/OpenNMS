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
 * Class Group.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Group implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _name.
     */
    private java.lang.String _name;

    /**
     * Field _defaultMap.
     */
    private java.lang.String _defaultMap;

    /**
     * Field _comments.
     */
    private java.lang.String _comments;

    /**
     * Field _userList.
     */
    private java.util.List<java.lang.String> _userList;

    /**
     * Field _dutyScheduleList.
     */
    private java.util.List<java.lang.String> _dutyScheduleList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Group() {
        super();
        this._userList = new java.util.ArrayList<java.lang.String>();
        this._dutyScheduleList = new java.util.ArrayList<java.lang.String>();
    }


      //-----------/
     //- Methods -/
    //-----------/

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
     * 
     * 
     * @param vUser
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addUser(
            final java.lang.String vUser)
    throws java.lang.IndexOutOfBoundsException {
        this._userList.add(vUser);
    }

    /**
     * 
     * 
     * @param index
     * @param vUser
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addUser(
            final int index,
            final java.lang.String vUser)
    throws java.lang.IndexOutOfBoundsException {
        this._userList.add(index, vUser);
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
     * Method enumerateUser.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<java.lang.String> enumerateUser(
    ) {
        return java.util.Collections.enumeration(this._userList);
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
        
        if (obj instanceof Group) {
        
            Group temp = (Group)obj;
            if (this._name != null) {
                if (temp._name == null) return false;
                else if (!(this._name.equals(temp._name))) 
                    return false;
            }
            else if (temp._name != null)
                return false;
            if (this._defaultMap != null) {
                if (temp._defaultMap == null) return false;
                else if (!(this._defaultMap.equals(temp._defaultMap))) 
                    return false;
            }
            else if (temp._defaultMap != null)
                return false;
            if (this._comments != null) {
                if (temp._comments == null) return false;
                else if (!(this._comments.equals(temp._comments))) 
                    return false;
            }
            else if (temp._comments != null)
                return false;
            if (this._userList != null) {
                if (temp._userList == null) return false;
                else if (!(this._userList.equals(temp._userList))) 
                    return false;
            }
            else if (temp._userList != null)
                return false;
            if (this._dutyScheduleList != null) {
                if (temp._dutyScheduleList == null) return false;
                else if (!(this._dutyScheduleList.equals(temp._dutyScheduleList))) 
                    return false;
            }
            else if (temp._dutyScheduleList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'comments'.
     * 
     * @return the value of field 'Comments'.
     */
    public java.lang.String getComments(
    ) {
        return this._comments;
    }

    /**
     * Returns the value of field 'defaultMap'.
     * 
     * @return the value of field 'DefaultMap'.
     */
    public java.lang.String getDefaultMap(
    ) {
        return this._defaultMap;
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
     * Returns the value of field 'name'.
     * 
     * @return the value of field 'Name'.
     */
    public java.lang.String getName(
    ) {
        return this._name;
    }

    /**
     * Method getUser.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the java.lang.String at the given index
     */
    public java.lang.String getUser(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._userList.size()) {
            throw new IndexOutOfBoundsException("getUser: Index value '" + index + "' not in range [0.." + (this._userList.size() - 1) + "]");
        }
        
        return (java.lang.String) _userList.get(index);
    }

    /**
     * Method getUser.Returns the contents of the collection in an
     * Array.  <p>Note:  Just in case the collection contents are
     * changing in another thread, we pass a 0-length Array of the
     * correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public java.lang.String[] getUser(
    ) {
        java.lang.String[] array = new java.lang.String[0];
        return (java.lang.String[]) this._userList.toArray(array);
    }

    /**
     * Method getUserCollection.Returns a reference to '_userList'.
     * No type checking is performed on any modifications to the
     * Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<java.lang.String> getUserCollection(
    ) {
        return this._userList;
    }

    /**
     * Method getUserCount.
     * 
     * @return the size of this collection
     */
    public int getUserCount(
    ) {
        return this._userList.size();
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
        if (_defaultMap != null) {
           result = 37 * result + _defaultMap.hashCode();
        }
        if (_comments != null) {
           result = 37 * result + _comments.hashCode();
        }
        if (_userList != null) {
           result = 37 * result + _userList.hashCode();
        }
        if (_dutyScheduleList != null) {
           result = 37 * result + _dutyScheduleList.hashCode();
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
     * Method iterateUser.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<java.lang.String> iterateUser(
    ) {
        return this._userList.iterator();
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
    public void removeAllDutySchedule(
    ) {
        this._dutyScheduleList.clear();
    }

    /**
     */
    public void removeAllUser(
    ) {
        this._userList.clear();
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
     * Method removeUser.
     * 
     * @param vUser
     * @return true if the object was removed from the collection.
     */
    public boolean removeUser(
            final java.lang.String vUser) {
        boolean removed = _userList.remove(vUser);
        return removed;
    }

    /**
     * Method removeUserAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public java.lang.String removeUserAt(
            final int index) {
        java.lang.Object obj = this._userList.remove(index);
        return (java.lang.String) obj;
    }

    /**
     * Sets the value of field 'comments'.
     * 
     * @param comments the value of field 'comments'.
     */
    public void setComments(
            final java.lang.String comments) {
        this._comments = comments;
    }

    /**
     * Sets the value of field 'defaultMap'.
     * 
     * @param defaultMap the value of field 'defaultMap'.
     */
    public void setDefaultMap(
            final java.lang.String defaultMap) {
        this._defaultMap = defaultMap;
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
     * @param vUser
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setUser(
            final int index,
            final java.lang.String vUser)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._userList.size()) {
            throw new IndexOutOfBoundsException("setUser: Index value '" + index + "' not in range [0.." + (this._userList.size() - 1) + "]");
        }
        
        this._userList.set(index, vUser);
    }

    /**
     * 
     * 
     * @param vUserArray
     */
    public void setUser(
            final java.lang.String[] vUserArray) {
        //-- copy array
        _userList.clear();
        
        for (int i = 0; i < vUserArray.length; i++) {
                this._userList.add(vUserArray[i]);
        }
    }

    /**
     * Sets the value of '_userList' by copying the given Vector.
     * All elements will be checked for type safety.
     * 
     * @param vUserList the Vector to copy.
     */
    public void setUser(
            final java.util.List<java.lang.String> vUserList) {
        // copy vector
        this._userList.clear();
        
        this._userList.addAll(vUserList);
    }

    /**
     * Sets the value of '_userList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param userList the Vector to set.
     */
    public void setUserCollection(
            final java.util.List<java.lang.String> userList) {
        this._userList = userList;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.opennms.netmgt.config.groups.Grou
     */
    public static org.opennms.netmgt.config.groups.Group unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.groups.Group) Unmarshaller.unmarshal(org.opennms.netmgt.config.groups.Group.class, reader);
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
