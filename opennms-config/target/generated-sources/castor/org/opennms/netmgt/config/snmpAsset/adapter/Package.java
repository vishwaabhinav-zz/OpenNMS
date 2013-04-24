/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.snmpAsset.adapter;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class Package.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Package implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _name.
     */
    private java.lang.String _name;

    /**
     * Field _packageChoice.
     */
    private org.opennms.netmgt.config.snmpAsset.adapter.PackageChoice _packageChoice;

    /**
     * Field _assetFieldList.
     */
    private java.util.List<org.opennms.netmgt.config.snmpAsset.adapter.AssetField> _assetFieldList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Package() {
        super();
        this._assetFieldList = new java.util.ArrayList<org.opennms.netmgt.config.snmpAsset.adapter.AssetField>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vAssetField
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAssetField(
            final org.opennms.netmgt.config.snmpAsset.adapter.AssetField vAssetField)
    throws java.lang.IndexOutOfBoundsException {
        this._assetFieldList.add(vAssetField);
    }

    /**
     * 
     * 
     * @param index
     * @param vAssetField
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAssetField(
            final int index,
            final org.opennms.netmgt.config.snmpAsset.adapter.AssetField vAssetField)
    throws java.lang.IndexOutOfBoundsException {
        this._assetFieldList.add(index, vAssetField);
    }

    /**
     * Method enumerateAssetField.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.snmpAsset.adapter.AssetField> enumerateAssetField(
    ) {
        return java.util.Collections.enumeration(this._assetFieldList);
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
        
        if (obj instanceof Package) {
        
            Package temp = (Package)obj;
            if (this._name != null) {
                if (temp._name == null) return false;
                else if (!(this._name.equals(temp._name))) 
                    return false;
            }
            else if (temp._name != null)
                return false;
            if (this._packageChoice != null) {
                if (temp._packageChoice == null) return false;
                else if (!(this._packageChoice.equals(temp._packageChoice))) 
                    return false;
            }
            else if (temp._packageChoice != null)
                return false;
            if (this._assetFieldList != null) {
                if (temp._assetFieldList == null) return false;
                else if (!(this._assetFieldList.equals(temp._assetFieldList))) 
                    return false;
            }
            else if (temp._assetFieldList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Method getAssetField.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.snmpAsset.adapter.AssetField at
     * the given index
     */
    public org.opennms.netmgt.config.snmpAsset.adapter.AssetField getAssetField(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._assetFieldList.size()) {
            throw new IndexOutOfBoundsException("getAssetField: Index value '" + index + "' not in range [0.." + (this._assetFieldList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.snmpAsset.adapter.AssetField) _assetFieldList.get(index);
    }

    /**
     * Method getAssetField.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.snmpAsset.adapter.AssetField[] getAssetField(
    ) {
        org.opennms.netmgt.config.snmpAsset.adapter.AssetField[] array = new org.opennms.netmgt.config.snmpAsset.adapter.AssetField[0];
        return (org.opennms.netmgt.config.snmpAsset.adapter.AssetField[]) this._assetFieldList.toArray(array);
    }

    /**
     * Method getAssetFieldCollection.Returns a reference to
     * '_assetFieldList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.snmpAsset.adapter.AssetField> getAssetFieldCollection(
    ) {
        return this._assetFieldList;
    }

    /**
     * Method getAssetFieldCount.
     * 
     * @return the size of this collection
     */
    public int getAssetFieldCount(
    ) {
        return this._assetFieldList.size();
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
     * Returns the value of field 'packageChoice'.
     * 
     * @return the value of field 'PackageChoice'.
     */
    public org.opennms.netmgt.config.snmpAsset.adapter.PackageChoice getPackageChoice(
    ) {
        return this._packageChoice;
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
        if (_packageChoice != null) {
           result = 37 * result + _packageChoice.hashCode();
        }
        if (_assetFieldList != null) {
           result = 37 * result + _assetFieldList.hashCode();
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
     * Method iterateAssetField.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.snmpAsset.adapter.AssetField> iterateAssetField(
    ) {
        return this._assetFieldList.iterator();
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
    public void removeAllAssetField(
    ) {
        this._assetFieldList.clear();
    }

    /**
     * Method removeAssetField.
     * 
     * @param vAssetField
     * @return true if the object was removed from the collection.
     */
    public boolean removeAssetField(
            final org.opennms.netmgt.config.snmpAsset.adapter.AssetField vAssetField) {
        boolean removed = _assetFieldList.remove(vAssetField);
        return removed;
    }

    /**
     * Method removeAssetFieldAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.snmpAsset.adapter.AssetField removeAssetFieldAt(
            final int index) {
        java.lang.Object obj = this._assetFieldList.remove(index);
        return (org.opennms.netmgt.config.snmpAsset.adapter.AssetField) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vAssetField
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setAssetField(
            final int index,
            final org.opennms.netmgt.config.snmpAsset.adapter.AssetField vAssetField)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._assetFieldList.size()) {
            throw new IndexOutOfBoundsException("setAssetField: Index value '" + index + "' not in range [0.." + (this._assetFieldList.size() - 1) + "]");
        }
        
        this._assetFieldList.set(index, vAssetField);
    }

    /**
     * 
     * 
     * @param vAssetFieldArray
     */
    public void setAssetField(
            final org.opennms.netmgt.config.snmpAsset.adapter.AssetField[] vAssetFieldArray) {
        //-- copy array
        _assetFieldList.clear();
        
        for (int i = 0; i < vAssetFieldArray.length; i++) {
                this._assetFieldList.add(vAssetFieldArray[i]);
        }
    }

    /**
     * Sets the value of '_assetFieldList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vAssetFieldList the Vector to copy.
     */
    public void setAssetField(
            final java.util.List<org.opennms.netmgt.config.snmpAsset.adapter.AssetField> vAssetFieldList) {
        // copy vector
        this._assetFieldList.clear();
        
        this._assetFieldList.addAll(vAssetFieldList);
    }

    /**
     * Sets the value of '_assetFieldList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param assetFieldList the Vector to set.
     */
    public void setAssetFieldCollection(
            final java.util.List<org.opennms.netmgt.config.snmpAsset.adapter.AssetField> assetFieldList) {
        this._assetFieldList = assetFieldList;
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
     * Sets the value of field 'packageChoice'.
     * 
     * @param packageChoice the value of field 'packageChoice'.
     */
    public void setPackageChoice(
            final org.opennms.netmgt.config.snmpAsset.adapter.PackageChoice packageChoice) {
        this._packageChoice = packageChoice;
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
     * org.opennms.netmgt.config.snmpAsset.adapter.Package
     */
    public static org.opennms.netmgt.config.snmpAsset.adapter.Package unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.snmpAsset.adapter.Package) Unmarshaller.unmarshal(org.opennms.netmgt.config.snmpAsset.adapter.Package.class, reader);
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
