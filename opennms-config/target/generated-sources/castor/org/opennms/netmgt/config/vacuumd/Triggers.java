/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.vacuumd;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * A collection of triggers
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Triggers implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * A query to the database with a resultset used for
     *  actions
     */
    private java.util.List<org.opennms.netmgt.config.vacuumd.Trigger> _triggerList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Triggers() {
        super();
        this._triggerList = new java.util.ArrayList<org.opennms.netmgt.config.vacuumd.Trigger>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vTrigger
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addTrigger(
            final org.opennms.netmgt.config.vacuumd.Trigger vTrigger)
    throws java.lang.IndexOutOfBoundsException {
        this._triggerList.add(vTrigger);
    }

    /**
     * 
     * 
     * @param index
     * @param vTrigger
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addTrigger(
            final int index,
            final org.opennms.netmgt.config.vacuumd.Trigger vTrigger)
    throws java.lang.IndexOutOfBoundsException {
        this._triggerList.add(index, vTrigger);
    }

    /**
     * Method enumerateTrigger.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.vacuumd.Trigger> enumerateTrigger(
    ) {
        return java.util.Collections.enumeration(this._triggerList);
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
        
        if (obj instanceof Triggers) {
        
            Triggers temp = (Triggers)obj;
            if (this._triggerList != null) {
                if (temp._triggerList == null) return false;
                else if (!(this._triggerList.equals(temp._triggerList))) 
                    return false;
            }
            else if (temp._triggerList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Method getTrigger.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.vacuumd.Trigger at the given index
     */
    public org.opennms.netmgt.config.vacuumd.Trigger getTrigger(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._triggerList.size()) {
            throw new IndexOutOfBoundsException("getTrigger: Index value '" + index + "' not in range [0.." + (this._triggerList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.vacuumd.Trigger) _triggerList.get(index);
    }

    /**
     * Method getTrigger.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.vacuumd.Trigger[] getTrigger(
    ) {
        org.opennms.netmgt.config.vacuumd.Trigger[] array = new org.opennms.netmgt.config.vacuumd.Trigger[0];
        return (org.opennms.netmgt.config.vacuumd.Trigger[]) this._triggerList.toArray(array);
    }

    /**
     * Method getTriggerCollection.Returns a reference to
     * '_triggerList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.vacuumd.Trigger> getTriggerCollection(
    ) {
        return this._triggerList;
    }

    /**
     * Method getTriggerCount.
     * 
     * @return the size of this collection
     */
    public int getTriggerCount(
    ) {
        return this._triggerList.size();
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
        if (_triggerList != null) {
           result = 37 * result + _triggerList.hashCode();
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
     * Method iterateTrigger.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.vacuumd.Trigger> iterateTrigger(
    ) {
        return this._triggerList.iterator();
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
    public void removeAllTrigger(
    ) {
        this._triggerList.clear();
    }

    /**
     * Method removeTrigger.
     * 
     * @param vTrigger
     * @return true if the object was removed from the collection.
     */
    public boolean removeTrigger(
            final org.opennms.netmgt.config.vacuumd.Trigger vTrigger) {
        boolean removed = _triggerList.remove(vTrigger);
        return removed;
    }

    /**
     * Method removeTriggerAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.vacuumd.Trigger removeTriggerAt(
            final int index) {
        java.lang.Object obj = this._triggerList.remove(index);
        return (org.opennms.netmgt.config.vacuumd.Trigger) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vTrigger
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setTrigger(
            final int index,
            final org.opennms.netmgt.config.vacuumd.Trigger vTrigger)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._triggerList.size()) {
            throw new IndexOutOfBoundsException("setTrigger: Index value '" + index + "' not in range [0.." + (this._triggerList.size() - 1) + "]");
        }
        
        this._triggerList.set(index, vTrigger);
    }

    /**
     * 
     * 
     * @param vTriggerArray
     */
    public void setTrigger(
            final org.opennms.netmgt.config.vacuumd.Trigger[] vTriggerArray) {
        //-- copy array
        _triggerList.clear();
        
        for (int i = 0; i < vTriggerArray.length; i++) {
                this._triggerList.add(vTriggerArray[i]);
        }
    }

    /**
     * Sets the value of '_triggerList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vTriggerList the Vector to copy.
     */
    public void setTrigger(
            final java.util.List<org.opennms.netmgt.config.vacuumd.Trigger> vTriggerList) {
        // copy vector
        this._triggerList.clear();
        
        this._triggerList.addAll(vTriggerList);
    }

    /**
     * Sets the value of '_triggerList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param triggerList the Vector to set.
     */
    public void setTriggerCollection(
            final java.util.List<org.opennms.netmgt.config.vacuumd.Trigger> triggerList) {
        this._triggerList = triggerList;
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
     * org.opennms.netmgt.config.vacuumd.Triggers
     */
    public static org.opennms.netmgt.config.vacuumd.Triggers unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.vacuumd.Triggers) Unmarshaller.unmarshal(org.opennms.netmgt.config.vacuumd.Triggers.class, reader);
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
