/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.destinationPaths;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class Path.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Path implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _name.
     */
    private java.lang.String _name;

    /**
     * Field _initialDelay.
     */
    private java.lang.String _initialDelay = "0s";

    /**
     * Field _targetList.
     */
    private java.util.List<org.opennms.netmgt.config.destinationPaths.Target> _targetList;

    /**
     * Field _escalateList.
     */
    private java.util.List<org.opennms.netmgt.config.destinationPaths.Escalate> _escalateList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Path() {
        super();
        setInitialDelay("0s");
        this._targetList = new java.util.ArrayList<org.opennms.netmgt.config.destinationPaths.Target>();
        this._escalateList = new java.util.ArrayList<org.opennms.netmgt.config.destinationPaths.Escalate>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vEscalate
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addEscalate(
            final org.opennms.netmgt.config.destinationPaths.Escalate vEscalate)
    throws java.lang.IndexOutOfBoundsException {
        this._escalateList.add(vEscalate);
    }

    /**
     * 
     * 
     * @param index
     * @param vEscalate
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addEscalate(
            final int index,
            final org.opennms.netmgt.config.destinationPaths.Escalate vEscalate)
    throws java.lang.IndexOutOfBoundsException {
        this._escalateList.add(index, vEscalate);
    }

    /**
     * 
     * 
     * @param vTarget
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addTarget(
            final org.opennms.netmgt.config.destinationPaths.Target vTarget)
    throws java.lang.IndexOutOfBoundsException {
        this._targetList.add(vTarget);
    }

    /**
     * 
     * 
     * @param index
     * @param vTarget
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addTarget(
            final int index,
            final org.opennms.netmgt.config.destinationPaths.Target vTarget)
    throws java.lang.IndexOutOfBoundsException {
        this._targetList.add(index, vTarget);
    }

    /**
     * Method enumerateEscalate.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.destinationPaths.Escalate> enumerateEscalate(
    ) {
        return java.util.Collections.enumeration(this._escalateList);
    }

    /**
     * Method enumerateTarget.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.destinationPaths.Target> enumerateTarget(
    ) {
        return java.util.Collections.enumeration(this._targetList);
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
        
        if (obj instanceof Path) {
        
            Path temp = (Path)obj;
            if (this._name != null) {
                if (temp._name == null) return false;
                else if (!(this._name.equals(temp._name))) 
                    return false;
            }
            else if (temp._name != null)
                return false;
            if (this._initialDelay != null) {
                if (temp._initialDelay == null) return false;
                else if (!(this._initialDelay.equals(temp._initialDelay))) 
                    return false;
            }
            else if (temp._initialDelay != null)
                return false;
            if (this._targetList != null) {
                if (temp._targetList == null) return false;
                else if (!(this._targetList.equals(temp._targetList))) 
                    return false;
            }
            else if (temp._targetList != null)
                return false;
            if (this._escalateList != null) {
                if (temp._escalateList == null) return false;
                else if (!(this._escalateList.equals(temp._escalateList))) 
                    return false;
            }
            else if (temp._escalateList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Method getEscalate.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.destinationPaths.Escalate at the
     * given index
     */
    public org.opennms.netmgt.config.destinationPaths.Escalate getEscalate(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._escalateList.size()) {
            throw new IndexOutOfBoundsException("getEscalate: Index value '" + index + "' not in range [0.." + (this._escalateList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.destinationPaths.Escalate) _escalateList.get(index);
    }

    /**
     * Method getEscalate.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.destinationPaths.Escalate[] getEscalate(
    ) {
        org.opennms.netmgt.config.destinationPaths.Escalate[] array = new org.opennms.netmgt.config.destinationPaths.Escalate[0];
        return (org.opennms.netmgt.config.destinationPaths.Escalate[]) this._escalateList.toArray(array);
    }

    /**
     * Method getEscalateCollection.Returns a reference to
     * '_escalateList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.destinationPaths.Escalate> getEscalateCollection(
    ) {
        return this._escalateList;
    }

    /**
     * Method getEscalateCount.
     * 
     * @return the size of this collection
     */
    public int getEscalateCount(
    ) {
        return this._escalateList.size();
    }

    /**
     * Returns the value of field 'initialDelay'.
     * 
     * @return the value of field 'InitialDelay'.
     */
    public java.lang.String getInitialDelay(
    ) {
        return this._initialDelay;
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
     * Method getTarget.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.destinationPaths.Target at the
     * given index
     */
    public org.opennms.netmgt.config.destinationPaths.Target getTarget(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._targetList.size()) {
            throw new IndexOutOfBoundsException("getTarget: Index value '" + index + "' not in range [0.." + (this._targetList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.destinationPaths.Target) _targetList.get(index);
    }

    /**
     * Method getTarget.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.destinationPaths.Target[] getTarget(
    ) {
        org.opennms.netmgt.config.destinationPaths.Target[] array = new org.opennms.netmgt.config.destinationPaths.Target[0];
        return (org.opennms.netmgt.config.destinationPaths.Target[]) this._targetList.toArray(array);
    }

    /**
     * Method getTargetCollection.Returns a reference to
     * '_targetList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.destinationPaths.Target> getTargetCollection(
    ) {
        return this._targetList;
    }

    /**
     * Method getTargetCount.
     * 
     * @return the size of this collection
     */
    public int getTargetCount(
    ) {
        return this._targetList.size();
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
        if (_initialDelay != null) {
           result = 37 * result + _initialDelay.hashCode();
        }
        if (_targetList != null) {
           result = 37 * result + _targetList.hashCode();
        }
        if (_escalateList != null) {
           result = 37 * result + _escalateList.hashCode();
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
     * Method iterateEscalate.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.destinationPaths.Escalate> iterateEscalate(
    ) {
        return this._escalateList.iterator();
    }

    /**
     * Method iterateTarget.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.destinationPaths.Target> iterateTarget(
    ) {
        return this._targetList.iterator();
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
    public void removeAllEscalate(
    ) {
        this._escalateList.clear();
    }

    /**
     */
    public void removeAllTarget(
    ) {
        this._targetList.clear();
    }

    /**
     * Method removeEscalate.
     * 
     * @param vEscalate
     * @return true if the object was removed from the collection.
     */
    public boolean removeEscalate(
            final org.opennms.netmgt.config.destinationPaths.Escalate vEscalate) {
        boolean removed = _escalateList.remove(vEscalate);
        return removed;
    }

    /**
     * Method removeEscalateAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.destinationPaths.Escalate removeEscalateAt(
            final int index) {
        java.lang.Object obj = this._escalateList.remove(index);
        return (org.opennms.netmgt.config.destinationPaths.Escalate) obj;
    }

    /**
     * Method removeTarget.
     * 
     * @param vTarget
     * @return true if the object was removed from the collection.
     */
    public boolean removeTarget(
            final org.opennms.netmgt.config.destinationPaths.Target vTarget) {
        boolean removed = _targetList.remove(vTarget);
        return removed;
    }

    /**
     * Method removeTargetAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.destinationPaths.Target removeTargetAt(
            final int index) {
        java.lang.Object obj = this._targetList.remove(index);
        return (org.opennms.netmgt.config.destinationPaths.Target) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vEscalate
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setEscalate(
            final int index,
            final org.opennms.netmgt.config.destinationPaths.Escalate vEscalate)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._escalateList.size()) {
            throw new IndexOutOfBoundsException("setEscalate: Index value '" + index + "' not in range [0.." + (this._escalateList.size() - 1) + "]");
        }
        
        this._escalateList.set(index, vEscalate);
    }

    /**
     * 
     * 
     * @param vEscalateArray
     */
    public void setEscalate(
            final org.opennms.netmgt.config.destinationPaths.Escalate[] vEscalateArray) {
        //-- copy array
        _escalateList.clear();
        
        for (int i = 0; i < vEscalateArray.length; i++) {
                this._escalateList.add(vEscalateArray[i]);
        }
    }

    /**
     * Sets the value of '_escalateList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vEscalateList the Vector to copy.
     */
    public void setEscalate(
            final java.util.List<org.opennms.netmgt.config.destinationPaths.Escalate> vEscalateList) {
        // copy vector
        this._escalateList.clear();
        
        this._escalateList.addAll(vEscalateList);
    }

    /**
     * Sets the value of '_escalateList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param escalateList the Vector to set.
     */
    public void setEscalateCollection(
            final java.util.List<org.opennms.netmgt.config.destinationPaths.Escalate> escalateList) {
        this._escalateList = escalateList;
    }

    /**
     * Sets the value of field 'initialDelay'.
     * 
     * @param initialDelay the value of field 'initialDelay'.
     */
    public void setInitialDelay(
            final java.lang.String initialDelay) {
        this._initialDelay = initialDelay;
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
     * @param vTarget
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setTarget(
            final int index,
            final org.opennms.netmgt.config.destinationPaths.Target vTarget)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._targetList.size()) {
            throw new IndexOutOfBoundsException("setTarget: Index value '" + index + "' not in range [0.." + (this._targetList.size() - 1) + "]");
        }
        
        this._targetList.set(index, vTarget);
    }

    /**
     * 
     * 
     * @param vTargetArray
     */
    public void setTarget(
            final org.opennms.netmgt.config.destinationPaths.Target[] vTargetArray) {
        //-- copy array
        _targetList.clear();
        
        for (int i = 0; i < vTargetArray.length; i++) {
                this._targetList.add(vTargetArray[i]);
        }
    }

    /**
     * Sets the value of '_targetList' by copying the given Vector.
     * All elements will be checked for type safety.
     * 
     * @param vTargetList the Vector to copy.
     */
    public void setTarget(
            final java.util.List<org.opennms.netmgt.config.destinationPaths.Target> vTargetList) {
        // copy vector
        this._targetList.clear();
        
        this._targetList.addAll(vTargetList);
    }

    /**
     * Sets the value of '_targetList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param targetList the Vector to set.
     */
    public void setTargetCollection(
            final java.util.List<org.opennms.netmgt.config.destinationPaths.Target> targetList) {
        this._targetList = targetList;
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
     * org.opennms.netmgt.config.destinationPaths.Path
     */
    public static org.opennms.netmgt.config.destinationPaths.Path unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.destinationPaths.Path) Unmarshaller.unmarshal(org.opennms.netmgt.config.destinationPaths.Path.class, reader);
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
