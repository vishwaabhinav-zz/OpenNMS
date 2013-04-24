/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.translator;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * A mapping for a given event. This translation is only
 *  applied if it is the first that matches
 *  
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Mapping implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * An element representing an assignement to an attribute of
     * the event
     *  
     */
    private java.util.List<org.opennms.netmgt.config.translator.Assignment> _assignmentList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Mapping() {
        super();
        this._assignmentList = new java.util.ArrayList<org.opennms.netmgt.config.translator.Assignment>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vAssignment
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAssignment(
            final org.opennms.netmgt.config.translator.Assignment vAssignment)
    throws java.lang.IndexOutOfBoundsException {
        this._assignmentList.add(vAssignment);
    }

    /**
     * 
     * 
     * @param index
     * @param vAssignment
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAssignment(
            final int index,
            final org.opennms.netmgt.config.translator.Assignment vAssignment)
    throws java.lang.IndexOutOfBoundsException {
        this._assignmentList.add(index, vAssignment);
    }

    /**
     * Method enumerateAssignment.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.translator.Assignment> enumerateAssignment(
    ) {
        return java.util.Collections.enumeration(this._assignmentList);
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
        
        if (obj instanceof Mapping) {
        
            Mapping temp = (Mapping)obj;
            if (this._assignmentList != null) {
                if (temp._assignmentList == null) return false;
                else if (!(this._assignmentList.equals(temp._assignmentList))) 
                    return false;
            }
            else if (temp._assignmentList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Method getAssignment.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.translator.Assignment at the given
     * index
     */
    public org.opennms.netmgt.config.translator.Assignment getAssignment(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._assignmentList.size()) {
            throw new IndexOutOfBoundsException("getAssignment: Index value '" + index + "' not in range [0.." + (this._assignmentList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.translator.Assignment) _assignmentList.get(index);
    }

    /**
     * Method getAssignment.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.translator.Assignment[] getAssignment(
    ) {
        org.opennms.netmgt.config.translator.Assignment[] array = new org.opennms.netmgt.config.translator.Assignment[0];
        return (org.opennms.netmgt.config.translator.Assignment[]) this._assignmentList.toArray(array);
    }

    /**
     * Method getAssignmentCollection.Returns a reference to
     * '_assignmentList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.translator.Assignment> getAssignmentCollection(
    ) {
        return this._assignmentList;
    }

    /**
     * Method getAssignmentCount.
     * 
     * @return the size of this collection
     */
    public int getAssignmentCount(
    ) {
        return this._assignmentList.size();
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
        if (_assignmentList != null) {
           result = 37 * result + _assignmentList.hashCode();
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
     * Method iterateAssignment.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.translator.Assignment> iterateAssignment(
    ) {
        return this._assignmentList.iterator();
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
    public void removeAllAssignment(
    ) {
        this._assignmentList.clear();
    }

    /**
     * Method removeAssignment.
     * 
     * @param vAssignment
     * @return true if the object was removed from the collection.
     */
    public boolean removeAssignment(
            final org.opennms.netmgt.config.translator.Assignment vAssignment) {
        boolean removed = _assignmentList.remove(vAssignment);
        return removed;
    }

    /**
     * Method removeAssignmentAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.translator.Assignment removeAssignmentAt(
            final int index) {
        java.lang.Object obj = this._assignmentList.remove(index);
        return (org.opennms.netmgt.config.translator.Assignment) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vAssignment
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setAssignment(
            final int index,
            final org.opennms.netmgt.config.translator.Assignment vAssignment)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._assignmentList.size()) {
            throw new IndexOutOfBoundsException("setAssignment: Index value '" + index + "' not in range [0.." + (this._assignmentList.size() - 1) + "]");
        }
        
        this._assignmentList.set(index, vAssignment);
    }

    /**
     * 
     * 
     * @param vAssignmentArray
     */
    public void setAssignment(
            final org.opennms.netmgt.config.translator.Assignment[] vAssignmentArray) {
        //-- copy array
        _assignmentList.clear();
        
        for (int i = 0; i < vAssignmentArray.length; i++) {
                this._assignmentList.add(vAssignmentArray[i]);
        }
    }

    /**
     * Sets the value of '_assignmentList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vAssignmentList the Vector to copy.
     */
    public void setAssignment(
            final java.util.List<org.opennms.netmgt.config.translator.Assignment> vAssignmentList) {
        // copy vector
        this._assignmentList.clear();
        
        this._assignmentList.addAll(vAssignmentList);
    }

    /**
     * Sets the value of '_assignmentList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param assignmentList the Vector to set.
     */
    public void setAssignmentCollection(
            final java.util.List<org.opennms.netmgt.config.translator.Assignment> assignmentList) {
        this._assignmentList = assignmentList;
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
     * org.opennms.netmgt.config.translator.Mapping
     */
    public static org.opennms.netmgt.config.translator.Mapping unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.translator.Mapping) Unmarshaller.unmarshal(org.opennms.netmgt.config.translator.Mapping.class, reader);
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
