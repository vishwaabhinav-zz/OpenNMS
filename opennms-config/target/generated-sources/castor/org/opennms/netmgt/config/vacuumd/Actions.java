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
 * A collection of actions
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Actions implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * actions modify the database based on results of a
     *  trigger
     */
    private java.util.List<org.opennms.netmgt.config.vacuumd.Action> _actionList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Actions() {
        super();
        this._actionList = new java.util.ArrayList<org.opennms.netmgt.config.vacuumd.Action>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vAction
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAction(
            final org.opennms.netmgt.config.vacuumd.Action vAction)
    throws java.lang.IndexOutOfBoundsException {
        this._actionList.add(vAction);
    }

    /**
     * 
     * 
     * @param index
     * @param vAction
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAction(
            final int index,
            final org.opennms.netmgt.config.vacuumd.Action vAction)
    throws java.lang.IndexOutOfBoundsException {
        this._actionList.add(index, vAction);
    }

    /**
     * Method enumerateAction.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.vacuumd.Action> enumerateAction(
    ) {
        return java.util.Collections.enumeration(this._actionList);
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
        
        if (obj instanceof Actions) {
        
            Actions temp = (Actions)obj;
            if (this._actionList != null) {
                if (temp._actionList == null) return false;
                else if (!(this._actionList.equals(temp._actionList))) 
                    return false;
            }
            else if (temp._actionList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Method getAction.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.vacuumd.Action at the given index
     */
    public org.opennms.netmgt.config.vacuumd.Action getAction(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._actionList.size()) {
            throw new IndexOutOfBoundsException("getAction: Index value '" + index + "' not in range [0.." + (this._actionList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.vacuumd.Action) _actionList.get(index);
    }

    /**
     * Method getAction.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.vacuumd.Action[] getAction(
    ) {
        org.opennms.netmgt.config.vacuumd.Action[] array = new org.opennms.netmgt.config.vacuumd.Action[0];
        return (org.opennms.netmgt.config.vacuumd.Action[]) this._actionList.toArray(array);
    }

    /**
     * Method getActionCollection.Returns a reference to
     * '_actionList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.vacuumd.Action> getActionCollection(
    ) {
        return this._actionList;
    }

    /**
     * Method getActionCount.
     * 
     * @return the size of this collection
     */
    public int getActionCount(
    ) {
        return this._actionList.size();
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
        if (_actionList != null) {
           result = 37 * result + _actionList.hashCode();
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
     * Method iterateAction.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.vacuumd.Action> iterateAction(
    ) {
        return this._actionList.iterator();
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
     * Method removeAction.
     * 
     * @param vAction
     * @return true if the object was removed from the collection.
     */
    public boolean removeAction(
            final org.opennms.netmgt.config.vacuumd.Action vAction) {
        boolean removed = _actionList.remove(vAction);
        return removed;
    }

    /**
     * Method removeActionAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.vacuumd.Action removeActionAt(
            final int index) {
        java.lang.Object obj = this._actionList.remove(index);
        return (org.opennms.netmgt.config.vacuumd.Action) obj;
    }

    /**
     */
    public void removeAllAction(
    ) {
        this._actionList.clear();
    }

    /**
     * 
     * 
     * @param index
     * @param vAction
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setAction(
            final int index,
            final org.opennms.netmgt.config.vacuumd.Action vAction)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._actionList.size()) {
            throw new IndexOutOfBoundsException("setAction: Index value '" + index + "' not in range [0.." + (this._actionList.size() - 1) + "]");
        }
        
        this._actionList.set(index, vAction);
    }

    /**
     * 
     * 
     * @param vActionArray
     */
    public void setAction(
            final org.opennms.netmgt.config.vacuumd.Action[] vActionArray) {
        //-- copy array
        _actionList.clear();
        
        for (int i = 0; i < vActionArray.length; i++) {
                this._actionList.add(vActionArray[i]);
        }
    }

    /**
     * Sets the value of '_actionList' by copying the given Vector.
     * All elements will be checked for type safety.
     * 
     * @param vActionList the Vector to copy.
     */
    public void setAction(
            final java.util.List<org.opennms.netmgt.config.vacuumd.Action> vActionList) {
        // copy vector
        this._actionList.clear();
        
        this._actionList.addAll(vActionList);
    }

    /**
     * Sets the value of '_actionList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param actionList the Vector to set.
     */
    public void setActionCollection(
            final java.util.List<org.opennms.netmgt.config.vacuumd.Action> actionList) {
        this._actionList = actionList;
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
     * org.opennms.netmgt.config.vacuumd.Actions
     */
    public static org.opennms.netmgt.config.vacuumd.Actions unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.vacuumd.Actions) Unmarshaller.unmarshal(org.opennms.netmgt.config.vacuumd.Actions.class, reader);
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
