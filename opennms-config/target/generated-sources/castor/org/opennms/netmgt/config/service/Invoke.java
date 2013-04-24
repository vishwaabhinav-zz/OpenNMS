/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.service;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class Invoke.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Invoke implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _method.
     */
    private java.lang.String _method;

    /**
     * Field _pass.
     */
    private int _pass = 0;

    /**
     * keeps track of state for field: _pass
     */
    private boolean _has_pass;

    /**
     * Field _at.
     */
    private org.opennms.netmgt.config.service.types.InvokeAtType _at;

    /**
     * Field _argumentList.
     */
    private java.util.List<org.opennms.netmgt.config.service.Argument> _argumentList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Invoke() {
        super();
        this._argumentList = new java.util.ArrayList<org.opennms.netmgt.config.service.Argument>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vArgument
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addArgument(
            final org.opennms.netmgt.config.service.Argument vArgument)
    throws java.lang.IndexOutOfBoundsException {
        this._argumentList.add(vArgument);
    }

    /**
     * 
     * 
     * @param index
     * @param vArgument
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addArgument(
            final int index,
            final org.opennms.netmgt.config.service.Argument vArgument)
    throws java.lang.IndexOutOfBoundsException {
        this._argumentList.add(index, vArgument);
    }

    /**
     */
    public void deletePass(
    ) {
        this._has_pass= false;
    }

    /**
     * Method enumerateArgument.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.service.Argument> enumerateArgument(
    ) {
        return java.util.Collections.enumeration(this._argumentList);
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
        
        if (obj instanceof Invoke) {
        
            Invoke temp = (Invoke)obj;
            if (this._method != null) {
                if (temp._method == null) return false;
                else if (!(this._method.equals(temp._method))) 
                    return false;
            }
            else if (temp._method != null)
                return false;
            if (this._pass != temp._pass)
                return false;
            if (this._has_pass != temp._has_pass)
                return false;
            if (this._at != null) {
                if (temp._at == null) return false;
                else if (!(this._at.equals(temp._at))) 
                    return false;
            }
            else if (temp._at != null)
                return false;
            if (this._argumentList != null) {
                if (temp._argumentList == null) return false;
                else if (!(this._argumentList.equals(temp._argumentList))) 
                    return false;
            }
            else if (temp._argumentList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Method getArgument.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.service.Argument at the given index
     */
    public org.opennms.netmgt.config.service.Argument getArgument(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._argumentList.size()) {
            throw new IndexOutOfBoundsException("getArgument: Index value '" + index + "' not in range [0.." + (this._argumentList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.service.Argument) _argumentList.get(index);
    }

    /**
     * Method getArgument.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.service.Argument[] getArgument(
    ) {
        org.opennms.netmgt.config.service.Argument[] array = new org.opennms.netmgt.config.service.Argument[0];
        return (org.opennms.netmgt.config.service.Argument[]) this._argumentList.toArray(array);
    }

    /**
     * Method getArgumentCollection.Returns a reference to
     * '_argumentList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.service.Argument> getArgumentCollection(
    ) {
        return this._argumentList;
    }

    /**
     * Method getArgumentCount.
     * 
     * @return the size of this collection
     */
    public int getArgumentCount(
    ) {
        return this._argumentList.size();
    }

    /**
     * Returns the value of field 'at'.
     * 
     * @return the value of field 'At'.
     */
    public org.opennms.netmgt.config.service.types.InvokeAtType getAt(
    ) {
        return this._at;
    }

    /**
     * Returns the value of field 'method'.
     * 
     * @return the value of field 'Method'.
     */
    public java.lang.String getMethod(
    ) {
        return this._method;
    }

    /**
     * Returns the value of field 'pass'.
     * 
     * @return the value of field 'Pass'.
     */
    public int getPass(
    ) {
        return this._pass;
    }

    /**
     * Method hasPass.
     * 
     * @return true if at least one Pass has been added
     */
    public boolean hasPass(
    ) {
        return this._has_pass;
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
        if (_method != null) {
           result = 37 * result + _method.hashCode();
        }
        result = 37 * result + _pass;
        if (_at != null) {
           result = 37 * result + _at.hashCode();
        }
        if (_argumentList != null) {
           result = 37 * result + _argumentList.hashCode();
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
     * Method iterateArgument.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.service.Argument> iterateArgument(
    ) {
        return this._argumentList.iterator();
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
    public void removeAllArgument(
    ) {
        this._argumentList.clear();
    }

    /**
     * Method removeArgument.
     * 
     * @param vArgument
     * @return true if the object was removed from the collection.
     */
    public boolean removeArgument(
            final org.opennms.netmgt.config.service.Argument vArgument) {
        boolean removed = _argumentList.remove(vArgument);
        return removed;
    }

    /**
     * Method removeArgumentAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.service.Argument removeArgumentAt(
            final int index) {
        java.lang.Object obj = this._argumentList.remove(index);
        return (org.opennms.netmgt.config.service.Argument) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vArgument
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setArgument(
            final int index,
            final org.opennms.netmgt.config.service.Argument vArgument)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._argumentList.size()) {
            throw new IndexOutOfBoundsException("setArgument: Index value '" + index + "' not in range [0.." + (this._argumentList.size() - 1) + "]");
        }
        
        this._argumentList.set(index, vArgument);
    }

    /**
     * 
     * 
     * @param vArgumentArray
     */
    public void setArgument(
            final org.opennms.netmgt.config.service.Argument[] vArgumentArray) {
        //-- copy array
        _argumentList.clear();
        
        for (int i = 0; i < vArgumentArray.length; i++) {
                this._argumentList.add(vArgumentArray[i]);
        }
    }

    /**
     * Sets the value of '_argumentList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vArgumentList the Vector to copy.
     */
    public void setArgument(
            final java.util.List<org.opennms.netmgt.config.service.Argument> vArgumentList) {
        // copy vector
        this._argumentList.clear();
        
        this._argumentList.addAll(vArgumentList);
    }

    /**
     * Sets the value of '_argumentList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param argumentList the Vector to set.
     */
    public void setArgumentCollection(
            final java.util.List<org.opennms.netmgt.config.service.Argument> argumentList) {
        this._argumentList = argumentList;
    }

    /**
     * Sets the value of field 'at'.
     * 
     * @param at the value of field 'at'.
     */
    public void setAt(
            final org.opennms.netmgt.config.service.types.InvokeAtType at) {
        this._at = at;
    }

    /**
     * Sets the value of field 'method'.
     * 
     * @param method the value of field 'method'.
     */
    public void setMethod(
            final java.lang.String method) {
        this._method = method;
    }

    /**
     * Sets the value of field 'pass'.
     * 
     * @param pass the value of field 'pass'.
     */
    public void setPass(
            final int pass) {
        this._pass = pass;
        this._has_pass = true;
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
     * org.opennms.netmgt.config.service.Invoke
     */
    public static org.opennms.netmgt.config.service.Invoke unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.service.Invoke) Unmarshaller.unmarshal(org.opennms.netmgt.config.service.Invoke.class, reader);
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
