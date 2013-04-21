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
 * Class ActionEvents.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class ActionEvents implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _actionEventList.
     */
    private java.util.List<org.opennms.netmgt.config.vacuumd.ActionEvent> _actionEventList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ActionEvents() {
        super();
        this._actionEventList = new java.util.ArrayList<org.opennms.netmgt.config.vacuumd.ActionEvent>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vActionEvent
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addActionEvent(
            final org.opennms.netmgt.config.vacuumd.ActionEvent vActionEvent)
    throws java.lang.IndexOutOfBoundsException {
        this._actionEventList.add(vActionEvent);
    }

    /**
     * 
     * 
     * @param index
     * @param vActionEvent
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addActionEvent(
            final int index,
            final org.opennms.netmgt.config.vacuumd.ActionEvent vActionEvent)
    throws java.lang.IndexOutOfBoundsException {
        this._actionEventList.add(index, vActionEvent);
    }

    /**
     * Method enumerateActionEvent.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.vacuumd.ActionEvent> enumerateActionEvent(
    ) {
        return java.util.Collections.enumeration(this._actionEventList);
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
        
        if (obj instanceof ActionEvents) {
        
            ActionEvents temp = (ActionEvents)obj;
            if (this._actionEventList != null) {
                if (temp._actionEventList == null) return false;
                else if (!(this._actionEventList.equals(temp._actionEventList))) 
                    return false;
            }
            else if (temp._actionEventList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Method getActionEvent.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.vacuumd.ActionEvent at the given
     * index
     */
    public org.opennms.netmgt.config.vacuumd.ActionEvent getActionEvent(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._actionEventList.size()) {
            throw new IndexOutOfBoundsException("getActionEvent: Index value '" + index + "' not in range [0.." + (this._actionEventList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.vacuumd.ActionEvent) _actionEventList.get(index);
    }

    /**
     * Method getActionEvent.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.vacuumd.ActionEvent[] getActionEvent(
    ) {
        org.opennms.netmgt.config.vacuumd.ActionEvent[] array = new org.opennms.netmgt.config.vacuumd.ActionEvent[0];
        return (org.opennms.netmgt.config.vacuumd.ActionEvent[]) this._actionEventList.toArray(array);
    }

    /**
     * Method getActionEventCollection.Returns a reference to
     * '_actionEventList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.vacuumd.ActionEvent> getActionEventCollection(
    ) {
        return this._actionEventList;
    }

    /**
     * Method getActionEventCount.
     * 
     * @return the size of this collection
     */
    public int getActionEventCount(
    ) {
        return this._actionEventList.size();
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
        if (_actionEventList != null) {
           result = 37 * result + _actionEventList.hashCode();
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
     * Method iterateActionEvent.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.vacuumd.ActionEvent> iterateActionEvent(
    ) {
        return this._actionEventList.iterator();
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
     * Method removeActionEvent.
     * 
     * @param vActionEvent
     * @return true if the object was removed from the collection.
     */
    public boolean removeActionEvent(
            final org.opennms.netmgt.config.vacuumd.ActionEvent vActionEvent) {
        boolean removed = _actionEventList.remove(vActionEvent);
        return removed;
    }

    /**
     * Method removeActionEventAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.vacuumd.ActionEvent removeActionEventAt(
            final int index) {
        java.lang.Object obj = this._actionEventList.remove(index);
        return (org.opennms.netmgt.config.vacuumd.ActionEvent) obj;
    }

    /**
     */
    public void removeAllActionEvent(
    ) {
        this._actionEventList.clear();
    }

    /**
     * 
     * 
     * @param index
     * @param vActionEvent
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setActionEvent(
            final int index,
            final org.opennms.netmgt.config.vacuumd.ActionEvent vActionEvent)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._actionEventList.size()) {
            throw new IndexOutOfBoundsException("setActionEvent: Index value '" + index + "' not in range [0.." + (this._actionEventList.size() - 1) + "]");
        }
        
        this._actionEventList.set(index, vActionEvent);
    }

    /**
     * 
     * 
     * @param vActionEventArray
     */
    public void setActionEvent(
            final org.opennms.netmgt.config.vacuumd.ActionEvent[] vActionEventArray) {
        //-- copy array
        _actionEventList.clear();
        
        for (int i = 0; i < vActionEventArray.length; i++) {
                this._actionEventList.add(vActionEventArray[i]);
        }
    }

    /**
     * Sets the value of '_actionEventList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vActionEventList the Vector to copy.
     */
    public void setActionEvent(
            final java.util.List<org.opennms.netmgt.config.vacuumd.ActionEvent> vActionEventList) {
        // copy vector
        this._actionEventList.clear();
        
        this._actionEventList.addAll(vActionEventList);
    }

    /**
     * Sets the value of '_actionEventList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param actionEventList the Vector to set.
     */
    public void setActionEventCollection(
            final java.util.List<org.opennms.netmgt.config.vacuumd.ActionEvent> actionEventList) {
        this._actionEventList = actionEventList;
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
     * org.opennms.netmgt.config.vacuumd.ActionEvents
     */
    public static org.opennms.netmgt.config.vacuumd.ActionEvents unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.vacuumd.ActionEvents) Unmarshaller.unmarshal(org.opennms.netmgt.config.vacuumd.ActionEvents.class, reader);
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
