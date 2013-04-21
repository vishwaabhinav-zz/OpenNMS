/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.capsd;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * SMB configuration
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class SmbConfig implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * SMB authentication
     */
    private java.util.List<org.opennms.netmgt.config.capsd.SmbAuth> _smbAuthList;


      //----------------/
     //- Constructors -/
    //----------------/

    public SmbConfig() {
        super();
        this._smbAuthList = new java.util.ArrayList<org.opennms.netmgt.config.capsd.SmbAuth>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vSmbAuth
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSmbAuth(
            final org.opennms.netmgt.config.capsd.SmbAuth vSmbAuth)
    throws java.lang.IndexOutOfBoundsException {
        this._smbAuthList.add(vSmbAuth);
    }

    /**
     * 
     * 
     * @param index
     * @param vSmbAuth
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSmbAuth(
            final int index,
            final org.opennms.netmgt.config.capsd.SmbAuth vSmbAuth)
    throws java.lang.IndexOutOfBoundsException {
        this._smbAuthList.add(index, vSmbAuth);
    }

    /**
     * Method enumerateSmbAuth.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.capsd.SmbAuth> enumerateSmbAuth(
    ) {
        return java.util.Collections.enumeration(this._smbAuthList);
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
        
        if (obj instanceof SmbConfig) {
        
            SmbConfig temp = (SmbConfig)obj;
            if (this._smbAuthList != null) {
                if (temp._smbAuthList == null) return false;
                else if (!(this._smbAuthList.equals(temp._smbAuthList))) 
                    return false;
            }
            else if (temp._smbAuthList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Method getSmbAuth.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.capsd.SmbAuth at the given index
     */
    public org.opennms.netmgt.config.capsd.SmbAuth getSmbAuth(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._smbAuthList.size()) {
            throw new IndexOutOfBoundsException("getSmbAuth: Index value '" + index + "' not in range [0.." + (this._smbAuthList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.capsd.SmbAuth) _smbAuthList.get(index);
    }

    /**
     * Method getSmbAuth.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.capsd.SmbAuth[] getSmbAuth(
    ) {
        org.opennms.netmgt.config.capsd.SmbAuth[] array = new org.opennms.netmgt.config.capsd.SmbAuth[0];
        return (org.opennms.netmgt.config.capsd.SmbAuth[]) this._smbAuthList.toArray(array);
    }

    /**
     * Method getSmbAuthCollection.Returns a reference to
     * '_smbAuthList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.capsd.SmbAuth> getSmbAuthCollection(
    ) {
        return this._smbAuthList;
    }

    /**
     * Method getSmbAuthCount.
     * 
     * @return the size of this collection
     */
    public int getSmbAuthCount(
    ) {
        return this._smbAuthList.size();
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
        if (_smbAuthList != null) {
           result = 37 * result + _smbAuthList.hashCode();
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
     * Method iterateSmbAuth.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.capsd.SmbAuth> iterateSmbAuth(
    ) {
        return this._smbAuthList.iterator();
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
    public void removeAllSmbAuth(
    ) {
        this._smbAuthList.clear();
    }

    /**
     * Method removeSmbAuth.
     * 
     * @param vSmbAuth
     * @return true if the object was removed from the collection.
     */
    public boolean removeSmbAuth(
            final org.opennms.netmgt.config.capsd.SmbAuth vSmbAuth) {
        boolean removed = _smbAuthList.remove(vSmbAuth);
        return removed;
    }

    /**
     * Method removeSmbAuthAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.capsd.SmbAuth removeSmbAuthAt(
            final int index) {
        java.lang.Object obj = this._smbAuthList.remove(index);
        return (org.opennms.netmgt.config.capsd.SmbAuth) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vSmbAuth
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSmbAuth(
            final int index,
            final org.opennms.netmgt.config.capsd.SmbAuth vSmbAuth)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._smbAuthList.size()) {
            throw new IndexOutOfBoundsException("setSmbAuth: Index value '" + index + "' not in range [0.." + (this._smbAuthList.size() - 1) + "]");
        }
        
        this._smbAuthList.set(index, vSmbAuth);
    }

    /**
     * 
     * 
     * @param vSmbAuthArray
     */
    public void setSmbAuth(
            final org.opennms.netmgt.config.capsd.SmbAuth[] vSmbAuthArray) {
        //-- copy array
        _smbAuthList.clear();
        
        for (int i = 0; i < vSmbAuthArray.length; i++) {
                this._smbAuthList.add(vSmbAuthArray[i]);
        }
    }

    /**
     * Sets the value of '_smbAuthList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vSmbAuthList the Vector to copy.
     */
    public void setSmbAuth(
            final java.util.List<org.opennms.netmgt.config.capsd.SmbAuth> vSmbAuthList) {
        // copy vector
        this._smbAuthList.clear();
        
        this._smbAuthList.addAll(vSmbAuthList);
    }

    /**
     * Sets the value of '_smbAuthList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param smbAuthList the Vector to set.
     */
    public void setSmbAuthCollection(
            final java.util.List<org.opennms.netmgt.config.capsd.SmbAuth> smbAuthList) {
        this._smbAuthList = smbAuthList;
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
     * org.opennms.netmgt.config.capsd.SmbConfig
     */
    public static org.opennms.netmgt.config.capsd.SmbConfig unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.capsd.SmbConfig) Unmarshaller.unmarshal(org.opennms.netmgt.config.capsd.SmbConfig.class, reader);
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
