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
 * Class Automations.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Automations implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Triggers and Actions hooked up and run by the Vacuumd
     *  schedule using interval for frequency
     */
    private java.util.List<org.opennms.netmgt.config.vacuumd.Automation> _automationList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Automations() {
        super();
        this._automationList = new java.util.ArrayList<org.opennms.netmgt.config.vacuumd.Automation>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vAutomation
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAutomation(
            final org.opennms.netmgt.config.vacuumd.Automation vAutomation)
    throws java.lang.IndexOutOfBoundsException {
        this._automationList.add(vAutomation);
    }

    /**
     * 
     * 
     * @param index
     * @param vAutomation
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAutomation(
            final int index,
            final org.opennms.netmgt.config.vacuumd.Automation vAutomation)
    throws java.lang.IndexOutOfBoundsException {
        this._automationList.add(index, vAutomation);
    }

    /**
     * Method enumerateAutomation.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.vacuumd.Automation> enumerateAutomation(
    ) {
        return java.util.Collections.enumeration(this._automationList);
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
        
        if (obj instanceof Automations) {
        
            Automations temp = (Automations)obj;
            if (this._automationList != null) {
                if (temp._automationList == null) return false;
                else if (!(this._automationList.equals(temp._automationList))) 
                    return false;
            }
            else if (temp._automationList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Method getAutomation.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.vacuumd.Automation at the given
     * index
     */
    public org.opennms.netmgt.config.vacuumd.Automation getAutomation(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._automationList.size()) {
            throw new IndexOutOfBoundsException("getAutomation: Index value '" + index + "' not in range [0.." + (this._automationList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.vacuumd.Automation) _automationList.get(index);
    }

    /**
     * Method getAutomation.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.vacuumd.Automation[] getAutomation(
    ) {
        org.opennms.netmgt.config.vacuumd.Automation[] array = new org.opennms.netmgt.config.vacuumd.Automation[0];
        return (org.opennms.netmgt.config.vacuumd.Automation[]) this._automationList.toArray(array);
    }

    /**
     * Method getAutomationCollection.Returns a reference to
     * '_automationList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.vacuumd.Automation> getAutomationCollection(
    ) {
        return this._automationList;
    }

    /**
     * Method getAutomationCount.
     * 
     * @return the size of this collection
     */
    public int getAutomationCount(
    ) {
        return this._automationList.size();
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
        if (_automationList != null) {
           result = 37 * result + _automationList.hashCode();
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
     * Method iterateAutomation.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.vacuumd.Automation> iterateAutomation(
    ) {
        return this._automationList.iterator();
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
    public void removeAllAutomation(
    ) {
        this._automationList.clear();
    }

    /**
     * Method removeAutomation.
     * 
     * @param vAutomation
     * @return true if the object was removed from the collection.
     */
    public boolean removeAutomation(
            final org.opennms.netmgt.config.vacuumd.Automation vAutomation) {
        boolean removed = _automationList.remove(vAutomation);
        return removed;
    }

    /**
     * Method removeAutomationAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.vacuumd.Automation removeAutomationAt(
            final int index) {
        java.lang.Object obj = this._automationList.remove(index);
        return (org.opennms.netmgt.config.vacuumd.Automation) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vAutomation
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setAutomation(
            final int index,
            final org.opennms.netmgt.config.vacuumd.Automation vAutomation)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._automationList.size()) {
            throw new IndexOutOfBoundsException("setAutomation: Index value '" + index + "' not in range [0.." + (this._automationList.size() - 1) + "]");
        }
        
        this._automationList.set(index, vAutomation);
    }

    /**
     * 
     * 
     * @param vAutomationArray
     */
    public void setAutomation(
            final org.opennms.netmgt.config.vacuumd.Automation[] vAutomationArray) {
        //-- copy array
        _automationList.clear();
        
        for (int i = 0; i < vAutomationArray.length; i++) {
                this._automationList.add(vAutomationArray[i]);
        }
    }

    /**
     * Sets the value of '_automationList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vAutomationList the Vector to copy.
     */
    public void setAutomation(
            final java.util.List<org.opennms.netmgt.config.vacuumd.Automation> vAutomationList) {
        // copy vector
        this._automationList.clear();
        
        this._automationList.addAll(vAutomationList);
    }

    /**
     * Sets the value of '_automationList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param automationList the Vector to set.
     */
    public void setAutomationCollection(
            final java.util.List<org.opennms.netmgt.config.vacuumd.Automation> automationList) {
        this._automationList = automationList;
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
     * org.opennms.netmgt.config.vacuumd.Automations
     */
    public static org.opennms.netmgt.config.vacuumd.Automations unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.vacuumd.Automations) Unmarshaller.unmarshal(org.opennms.netmgt.config.vacuumd.Automations.class, reader);
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
