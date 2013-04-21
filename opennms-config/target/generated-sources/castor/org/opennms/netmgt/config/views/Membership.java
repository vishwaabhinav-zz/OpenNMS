/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.views;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class Membership.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Membership implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _memberList.
     */
    private java.util.List<org.opennms.netmgt.config.views.Member> _memberList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Membership() {
        super();
        this._memberList = new java.util.ArrayList<org.opennms.netmgt.config.views.Member>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vMember
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addMember(
            final org.opennms.netmgt.config.views.Member vMember)
    throws java.lang.IndexOutOfBoundsException {
        this._memberList.add(vMember);
    }

    /**
     * 
     * 
     * @param index
     * @param vMember
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addMember(
            final int index,
            final org.opennms.netmgt.config.views.Member vMember)
    throws java.lang.IndexOutOfBoundsException {
        this._memberList.add(index, vMember);
    }

    /**
     * Method enumerateMember.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.views.Member> enumerateMember(
    ) {
        return java.util.Collections.enumeration(this._memberList);
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
        
        if (obj instanceof Membership) {
        
            Membership temp = (Membership)obj;
            if (this._memberList != null) {
                if (temp._memberList == null) return false;
                else if (!(this._memberList.equals(temp._memberList))) 
                    return false;
            }
            else if (temp._memberList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Method getMember.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.views.Member at the given index
     */
    public org.opennms.netmgt.config.views.Member getMember(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._memberList.size()) {
            throw new IndexOutOfBoundsException("getMember: Index value '" + index + "' not in range [0.." + (this._memberList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.views.Member) _memberList.get(index);
    }

    /**
     * Method getMember.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.views.Member[] getMember(
    ) {
        org.opennms.netmgt.config.views.Member[] array = new org.opennms.netmgt.config.views.Member[0];
        return (org.opennms.netmgt.config.views.Member[]) this._memberList.toArray(array);
    }

    /**
     * Method getMemberCollection.Returns a reference to
     * '_memberList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.views.Member> getMemberCollection(
    ) {
        return this._memberList;
    }

    /**
     * Method getMemberCount.
     * 
     * @return the size of this collection
     */
    public int getMemberCount(
    ) {
        return this._memberList.size();
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
        if (_memberList != null) {
           result = 37 * result + _memberList.hashCode();
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
     * Method iterateMember.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.views.Member> iterateMember(
    ) {
        return this._memberList.iterator();
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
    public void removeAllMember(
    ) {
        this._memberList.clear();
    }

    /**
     * Method removeMember.
     * 
     * @param vMember
     * @return true if the object was removed from the collection.
     */
    public boolean removeMember(
            final org.opennms.netmgt.config.views.Member vMember) {
        boolean removed = _memberList.remove(vMember);
        return removed;
    }

    /**
     * Method removeMemberAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.views.Member removeMemberAt(
            final int index) {
        java.lang.Object obj = this._memberList.remove(index);
        return (org.opennms.netmgt.config.views.Member) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vMember
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setMember(
            final int index,
            final org.opennms.netmgt.config.views.Member vMember)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._memberList.size()) {
            throw new IndexOutOfBoundsException("setMember: Index value '" + index + "' not in range [0.." + (this._memberList.size() - 1) + "]");
        }
        
        this._memberList.set(index, vMember);
    }

    /**
     * 
     * 
     * @param vMemberArray
     */
    public void setMember(
            final org.opennms.netmgt.config.views.Member[] vMemberArray) {
        //-- copy array
        _memberList.clear();
        
        for (int i = 0; i < vMemberArray.length; i++) {
                this._memberList.add(vMemberArray[i]);
        }
    }

    /**
     * Sets the value of '_memberList' by copying the given Vector.
     * All elements will be checked for type safety.
     * 
     * @param vMemberList the Vector to copy.
     */
    public void setMember(
            final java.util.List<org.opennms.netmgt.config.views.Member> vMemberList) {
        // copy vector
        this._memberList.clear();
        
        this._memberList.addAll(vMemberList);
    }

    /**
     * Sets the value of '_memberList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param memberList the Vector to set.
     */
    public void setMemberCollection(
            final java.util.List<org.opennms.netmgt.config.views.Member> memberList) {
        this._memberList = memberList;
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
     * org.opennms.netmgt.config.views.Membership
     */
    public static org.opennms.netmgt.config.views.Membership unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.views.Membership) Unmarshaller.unmarshal(org.opennms.netmgt.config.views.Membership.class, reader);
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
