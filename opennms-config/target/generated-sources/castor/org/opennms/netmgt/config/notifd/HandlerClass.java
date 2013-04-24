/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.notifd;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class HandlerClass.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class HandlerClass implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _name.
     */
    private java.lang.String _name;

    /**
     * Field _initParamsList.
     */
    private java.util.List<org.opennms.netmgt.config.notifd.InitParams> _initParamsList;


      //----------------/
     //- Constructors -/
    //----------------/

    public HandlerClass() {
        super();
        this._initParamsList = new java.util.ArrayList<org.opennms.netmgt.config.notifd.InitParams>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vInitParams
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addInitParams(
            final org.opennms.netmgt.config.notifd.InitParams vInitParams)
    throws java.lang.IndexOutOfBoundsException {
        this._initParamsList.add(vInitParams);
    }

    /**
     * 
     * 
     * @param index
     * @param vInitParams
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addInitParams(
            final int index,
            final org.opennms.netmgt.config.notifd.InitParams vInitParams)
    throws java.lang.IndexOutOfBoundsException {
        this._initParamsList.add(index, vInitParams);
    }

    /**
     * Method enumerateInitParams.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.notifd.InitParams> enumerateInitParams(
    ) {
        return java.util.Collections.enumeration(this._initParamsList);
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
        
        if (obj instanceof HandlerClass) {
        
            HandlerClass temp = (HandlerClass)obj;
            if (this._name != null) {
                if (temp._name == null) return false;
                else if (!(this._name.equals(temp._name))) 
                    return false;
            }
            else if (temp._name != null)
                return false;
            if (this._initParamsList != null) {
                if (temp._initParamsList == null) return false;
                else if (!(this._initParamsList.equals(temp._initParamsList))) 
                    return false;
            }
            else if (temp._initParamsList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Method getInitParams.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.notifd.InitParams at the given inde
     */
    public org.opennms.netmgt.config.notifd.InitParams getInitParams(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._initParamsList.size()) {
            throw new IndexOutOfBoundsException("getInitParams: Index value '" + index + "' not in range [0.." + (this._initParamsList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.notifd.InitParams) _initParamsList.get(index);
    }

    /**
     * Method getInitParams.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.notifd.InitParams[] getInitParams(
    ) {
        org.opennms.netmgt.config.notifd.InitParams[] array = new org.opennms.netmgt.config.notifd.InitParams[0];
        return (org.opennms.netmgt.config.notifd.InitParams[]) this._initParamsList.toArray(array);
    }

    /**
     * Method getInitParamsCollection.Returns a reference to
     * '_initParamsList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.notifd.InitParams> getInitParamsCollection(
    ) {
        return this._initParamsList;
    }

    /**
     * Method getInitParamsCount.
     * 
     * @return the size of this collection
     */
    public int getInitParamsCount(
    ) {
        return this._initParamsList.size();
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
        if (_initParamsList != null) {
           result = 37 * result + _initParamsList.hashCode();
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
     * Method iterateInitParams.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.notifd.InitParams> iterateInitParams(
    ) {
        return this._initParamsList.iterator();
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
    public void removeAllInitParams(
    ) {
        this._initParamsList.clear();
    }

    /**
     * Method removeInitParams.
     * 
     * @param vInitParams
     * @return true if the object was removed from the collection.
     */
    public boolean removeInitParams(
            final org.opennms.netmgt.config.notifd.InitParams vInitParams) {
        boolean removed = _initParamsList.remove(vInitParams);
        return removed;
    }

    /**
     * Method removeInitParamsAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.notifd.InitParams removeInitParamsAt(
            final int index) {
        java.lang.Object obj = this._initParamsList.remove(index);
        return (org.opennms.netmgt.config.notifd.InitParams) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vInitParams
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setInitParams(
            final int index,
            final org.opennms.netmgt.config.notifd.InitParams vInitParams)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._initParamsList.size()) {
            throw new IndexOutOfBoundsException("setInitParams: Index value '" + index + "' not in range [0.." + (this._initParamsList.size() - 1) + "]");
        }
        
        this._initParamsList.set(index, vInitParams);
    }

    /**
     * 
     * 
     * @param vInitParamsArray
     */
    public void setInitParams(
            final org.opennms.netmgt.config.notifd.InitParams[] vInitParamsArray) {
        //-- copy array
        _initParamsList.clear();
        
        for (int i = 0; i < vInitParamsArray.length; i++) {
                this._initParamsList.add(vInitParamsArray[i]);
        }
    }

    /**
     * Sets the value of '_initParamsList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vInitParamsList the Vector to copy.
     */
    public void setInitParams(
            final java.util.List<org.opennms.netmgt.config.notifd.InitParams> vInitParamsList) {
        // copy vector
        this._initParamsList.clear();
        
        this._initParamsList.addAll(vInitParamsList);
    }

    /**
     * Sets the value of '_initParamsList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param initParamsList the Vector to set.
     */
    public void setInitParamsCollection(
            final java.util.List<org.opennms.netmgt.config.notifd.InitParams> initParamsList) {
        this._initParamsList = initParamsList;
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
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.opennms.netmgt.config.notifd.HandlerClass
     */
    public static org.opennms.netmgt.config.notifd.HandlerClass unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.notifd.HandlerClass) Unmarshaller.unmarshal(org.opennms.netmgt.config.notifd.HandlerClass.class, reader);
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
