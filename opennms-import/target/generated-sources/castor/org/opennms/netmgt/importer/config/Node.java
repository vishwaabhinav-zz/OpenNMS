/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.importer.config;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * A node in OpenNMS is a network entity that is used to contain
 * network interfaces and those interface's services.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Node implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _nodeLabel.
     */
    private java.lang.String _nodeLabel;

    /**
     * This optional attribute can be used to facilitate
     * integration by making the key from the integrating DB
     * available adjacent to the OpenNMS key.
     *  
     */
    private java.lang.String _foreignId;

    /**
     * This optional attribute can be used to facilitate building
     * node relationships.
     *  
     */
    private java.lang.String _parentForeignId;

    /**
     * This optional attribute can be used to facilitate building
     * node relationships.
     *  
     */
    private java.lang.String _parentNodeLabel;

    /**
     * This optional attribute can be used to persist an asset
     * value to the building column in the OpenNMS DB.
     *  
     */
    private java.lang.String _city;

    /**
     * This optional attribute can be used to persist an asset
     * value to the building column in the OpenNMS DB.
     *  
     */
    private java.lang.String _building;

    /**
     * A network interface.
     */
    private java.util.List<org.opennms.netmgt.importer.config.Interface> _interfaceList;

    /**
     * This element is used to specify OpenNMS specific categories.
     * Note: currently, these categories are defined in a separate
     * configuration file and
     *  are related directly to monitored services. I have
     * separated out this element so that it can be referenced by
     * other entities (nodes, interfaces, etc.)
     *  however, they will be ignored until the domain model is
     * changed and the service layer is adapted for this behavior. 
     *  
     */
    private java.util.List<org.opennms.netmgt.importer.config.Category> _categoryList;

    /**
     * This element is used to specify an asset record attribute.
     */
    private java.util.List<org.opennms.netmgt.importer.config.Asset> _assetList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Node() {
        super();
        this._interfaceList = new java.util.ArrayList<org.opennms.netmgt.importer.config.Interface>();
        this._categoryList = new java.util.ArrayList<org.opennms.netmgt.importer.config.Category>();
        this._assetList = new java.util.ArrayList<org.opennms.netmgt.importer.config.Asset>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vAsset
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAsset(
            final org.opennms.netmgt.importer.config.Asset vAsset)
    throws java.lang.IndexOutOfBoundsException {
        this._assetList.add(vAsset);
    }

    /**
     * 
     * 
     * @param index
     * @param vAsset
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAsset(
            final int index,
            final org.opennms.netmgt.importer.config.Asset vAsset)
    throws java.lang.IndexOutOfBoundsException {
        this._assetList.add(index, vAsset);
    }

    /**
     * 
     * 
     * @param vCategory
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addCategory(
            final org.opennms.netmgt.importer.config.Category vCategory)
    throws java.lang.IndexOutOfBoundsException {
        this._categoryList.add(vCategory);
    }

    /**
     * 
     * 
     * @param index
     * @param vCategory
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addCategory(
            final int index,
            final org.opennms.netmgt.importer.config.Category vCategory)
    throws java.lang.IndexOutOfBoundsException {
        this._categoryList.add(index, vCategory);
    }

    /**
     * 
     * 
     * @param vInterface
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addInterface(
            final org.opennms.netmgt.importer.config.Interface vInterface)
    throws java.lang.IndexOutOfBoundsException {
        this._interfaceList.add(vInterface);
    }

    /**
     * 
     * 
     * @param index
     * @param vInterface
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addInterface(
            final int index,
            final org.opennms.netmgt.importer.config.Interface vInterface)
    throws java.lang.IndexOutOfBoundsException {
        this._interfaceList.add(index, vInterface);
    }

    /**
     * Method enumerateAsset.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.importer.config.Asset> enumerateAsset(
    ) {
        return java.util.Collections.enumeration(this._assetList);
    }

    /**
     * Method enumerateCategory.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.importer.config.Category> enumerateCategory(
    ) {
        return java.util.Collections.enumeration(this._categoryList);
    }

    /**
     * Method enumerateInterface.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.importer.config.Interface> enumerateInterface(
    ) {
        return java.util.Collections.enumeration(this._interfaceList);
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
        
        if (obj instanceof Node) {
        
            Node temp = (Node)obj;
            if (this._nodeLabel != null) {
                if (temp._nodeLabel == null) return false;
                else if (!(this._nodeLabel.equals(temp._nodeLabel))) 
                    return false;
            }
            else if (temp._nodeLabel != null)
                return false;
            if (this._foreignId != null) {
                if (temp._foreignId == null) return false;
                else if (!(this._foreignId.equals(temp._foreignId))) 
                    return false;
            }
            else if (temp._foreignId != null)
                return false;
            if (this._parentForeignId != null) {
                if (temp._parentForeignId == null) return false;
                else if (!(this._parentForeignId.equals(temp._parentForeignId))) 
                    return false;
            }
            else if (temp._parentForeignId != null)
                return false;
            if (this._parentNodeLabel != null) {
                if (temp._parentNodeLabel == null) return false;
                else if (!(this._parentNodeLabel.equals(temp._parentNodeLabel))) 
                    return false;
            }
            else if (temp._parentNodeLabel != null)
                return false;
            if (this._city != null) {
                if (temp._city == null) return false;
                else if (!(this._city.equals(temp._city))) 
                    return false;
            }
            else if (temp._city != null)
                return false;
            if (this._building != null) {
                if (temp._building == null) return false;
                else if (!(this._building.equals(temp._building))) 
                    return false;
            }
            else if (temp._building != null)
                return false;
            if (this._interfaceList != null) {
                if (temp._interfaceList == null) return false;
                else if (!(this._interfaceList.equals(temp._interfaceList))) 
                    return false;
            }
            else if (temp._interfaceList != null)
                return false;
            if (this._categoryList != null) {
                if (temp._categoryList == null) return false;
                else if (!(this._categoryList.equals(temp._categoryList))) 
                    return false;
            }
            else if (temp._categoryList != null)
                return false;
            if (this._assetList != null) {
                if (temp._assetList == null) return false;
                else if (!(this._assetList.equals(temp._assetList))) 
                    return false;
            }
            else if (temp._assetList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Method getAsset.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.importer.config.Asset at the given index
     */
    public org.opennms.netmgt.importer.config.Asset getAsset(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._assetList.size()) {
            throw new IndexOutOfBoundsException("getAsset: Index value '" + index + "' not in range [0.." + (this._assetList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.importer.config.Asset) _assetList.get(index);
    }

    /**
     * Method getAsset.Returns the contents of the collection in an
     * Array.  <p>Note:  Just in case the collection contents are
     * changing in another thread, we pass a 0-length Array of the
     * correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.importer.config.Asset[] getAsset(
    ) {
        org.opennms.netmgt.importer.config.Asset[] array = new org.opennms.netmgt.importer.config.Asset[0];
        return (org.opennms.netmgt.importer.config.Asset[]) this._assetList.toArray(array);
    }

    /**
     * Method getAssetCollection.Returns a reference to
     * '_assetList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.importer.config.Asset> getAssetCollection(
    ) {
        return this._assetList;
    }

    /**
     * Method getAssetCount.
     * 
     * @return the size of this collection
     */
    public int getAssetCount(
    ) {
        return this._assetList.size();
    }

    /**
     * Returns the value of field 'building'. The field 'building'
     * has the following description: This optional attribute can
     * be used to persist an asset value to the building column in
     * the OpenNMS DB.
     *  
     * 
     * @return the value of field 'Building'.
     */
    public java.lang.String getBuilding(
    ) {
        return this._building;
    }

    /**
     * Method getCategory.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.importer.config.Category at the given inde
     */
    public org.opennms.netmgt.importer.config.Category getCategory(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._categoryList.size()) {
            throw new IndexOutOfBoundsException("getCategory: Index value '" + index + "' not in range [0.." + (this._categoryList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.importer.config.Category) _categoryList.get(index);
    }

    /**
     * Method getCategory.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.importer.config.Category[] getCategory(
    ) {
        org.opennms.netmgt.importer.config.Category[] array = new org.opennms.netmgt.importer.config.Category[0];
        return (org.opennms.netmgt.importer.config.Category[]) this._categoryList.toArray(array);
    }

    /**
     * Method getCategoryCollection.Returns a reference to
     * '_categoryList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.importer.config.Category> getCategoryCollection(
    ) {
        return this._categoryList;
    }

    /**
     * Method getCategoryCount.
     * 
     * @return the size of this collection
     */
    public int getCategoryCount(
    ) {
        return this._categoryList.size();
    }

    /**
     * Returns the value of field 'city'. The field 'city' has the
     * following description: This optional attribute can be used
     * to persist an asset value to the building column in the
     * OpenNMS DB.
     *  
     * 
     * @return the value of field 'City'.
     */
    public java.lang.String getCity(
    ) {
        return this._city;
    }

    /**
     * Returns the value of field 'foreignId'. The field
     * 'foreignId' has the following description: This optional
     * attribute can be used to facilitate integration by making
     * the key from the integrating DB available adjacent to the
     * OpenNMS key.
     *  
     * 
     * @return the value of field 'ForeignId'.
     */
    public java.lang.String getForeignId(
    ) {
        return this._foreignId;
    }

    /**
     * Method getInterface.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.importer.config.Interface at the given
     * index
     */
    public org.opennms.netmgt.importer.config.Interface getInterface(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._interfaceList.size()) {
            throw new IndexOutOfBoundsException("getInterface: Index value '" + index + "' not in range [0.." + (this._interfaceList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.importer.config.Interface) _interfaceList.get(index);
    }

    /**
     * Method getInterface.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.importer.config.Interface[] getInterface(
    ) {
        org.opennms.netmgt.importer.config.Interface[] array = new org.opennms.netmgt.importer.config.Interface[0];
        return (org.opennms.netmgt.importer.config.Interface[]) this._interfaceList.toArray(array);
    }

    /**
     * Method getInterfaceCollection.Returns a reference to
     * '_interfaceList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.importer.config.Interface> getInterfaceCollection(
    ) {
        return this._interfaceList;
    }

    /**
     * Method getInterfaceCount.
     * 
     * @return the size of this collection
     */
    public int getInterfaceCount(
    ) {
        return this._interfaceList.size();
    }

    /**
     * Returns the value of field 'nodeLabel'.
     * 
     * @return the value of field 'NodeLabel'.
     */
    public java.lang.String getNodeLabel(
    ) {
        return this._nodeLabel;
    }

    /**
     * Returns the value of field 'parentForeignId'. The field
     * 'parentForeignId' has the following description: This
     * optional attribute can be used to facilitate building node
     * relationships.
     *  
     * 
     * @return the value of field 'ParentForeignId'.
     */
    public java.lang.String getParentForeignId(
    ) {
        return this._parentForeignId;
    }

    /**
     * Returns the value of field 'parentNodeLabel'. The field
     * 'parentNodeLabel' has the following description: This
     * optional attribute can be used to facilitate building node
     * relationships.
     *  
     * 
     * @return the value of field 'ParentNodeLabel'.
     */
    public java.lang.String getParentNodeLabel(
    ) {
        return this._parentNodeLabel;
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
        if (_nodeLabel != null) {
           result = 37 * result + _nodeLabel.hashCode();
        }
        if (_foreignId != null) {
           result = 37 * result + _foreignId.hashCode();
        }
        if (_parentForeignId != null) {
           result = 37 * result + _parentForeignId.hashCode();
        }
        if (_parentNodeLabel != null) {
           result = 37 * result + _parentNodeLabel.hashCode();
        }
        if (_city != null) {
           result = 37 * result + _city.hashCode();
        }
        if (_building != null) {
           result = 37 * result + _building.hashCode();
        }
        if (_interfaceList != null) {
           result = 37 * result + _interfaceList.hashCode();
        }
        if (_categoryList != null) {
           result = 37 * result + _categoryList.hashCode();
        }
        if (_assetList != null) {
           result = 37 * result + _assetList.hashCode();
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
     * Method iterateAsset.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.importer.config.Asset> iterateAsset(
    ) {
        return this._assetList.iterator();
    }

    /**
     * Method iterateCategory.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.importer.config.Category> iterateCategory(
    ) {
        return this._categoryList.iterator();
    }

    /**
     * Method iterateInterface.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.importer.config.Interface> iterateInterface(
    ) {
        return this._interfaceList.iterator();
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
    public void removeAllAsset(
    ) {
        this._assetList.clear();
    }

    /**
     */
    public void removeAllCategory(
    ) {
        this._categoryList.clear();
    }

    /**
     */
    public void removeAllInterface(
    ) {
        this._interfaceList.clear();
    }

    /**
     * Method removeAsset.
     * 
     * @param vAsset
     * @return true if the object was removed from the collection.
     */
    public boolean removeAsset(
            final org.opennms.netmgt.importer.config.Asset vAsset) {
        boolean removed = _assetList.remove(vAsset);
        return removed;
    }

    /**
     * Method removeAssetAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.importer.config.Asset removeAssetAt(
            final int index) {
        java.lang.Object obj = this._assetList.remove(index);
        return (org.opennms.netmgt.importer.config.Asset) obj;
    }

    /**
     * Method removeCategory.
     * 
     * @param vCategory
     * @return true if the object was removed from the collection.
     */
    public boolean removeCategory(
            final org.opennms.netmgt.importer.config.Category vCategory) {
        boolean removed = _categoryList.remove(vCategory);
        return removed;
    }

    /**
     * Method removeCategoryAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.importer.config.Category removeCategoryAt(
            final int index) {
        java.lang.Object obj = this._categoryList.remove(index);
        return (org.opennms.netmgt.importer.config.Category) obj;
    }

    /**
     * Method removeInterface.
     * 
     * @param vInterface
     * @return true if the object was removed from the collection.
     */
    public boolean removeInterface(
            final org.opennms.netmgt.importer.config.Interface vInterface) {
        boolean removed = _interfaceList.remove(vInterface);
        return removed;
    }

    /**
     * Method removeInterfaceAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.importer.config.Interface removeInterfaceAt(
            final int index) {
        java.lang.Object obj = this._interfaceList.remove(index);
        return (org.opennms.netmgt.importer.config.Interface) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vAsset
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setAsset(
            final int index,
            final org.opennms.netmgt.importer.config.Asset vAsset)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._assetList.size()) {
            throw new IndexOutOfBoundsException("setAsset: Index value '" + index + "' not in range [0.." + (this._assetList.size() - 1) + "]");
        }
        
        this._assetList.set(index, vAsset);
    }

    /**
     * 
     * 
     * @param vAssetArray
     */
    public void setAsset(
            final org.opennms.netmgt.importer.config.Asset[] vAssetArray) {
        //-- copy array
        _assetList.clear();
        
        for (int i = 0; i < vAssetArray.length; i++) {
                this._assetList.add(vAssetArray[i]);
        }
    }

    /**
     * Sets the value of '_assetList' by copying the given Vector.
     * All elements will be checked for type safety.
     * 
     * @param vAssetList the Vector to copy.
     */
    public void setAsset(
            final java.util.List<org.opennms.netmgt.importer.config.Asset> vAssetList) {
        // copy vector
        this._assetList.clear();
        
        this._assetList.addAll(vAssetList);
    }

    /**
     * Sets the value of '_assetList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param assetList the Vector to set.
     */
    public void setAssetCollection(
            final java.util.List<org.opennms.netmgt.importer.config.Asset> assetList) {
        this._assetList = assetList;
    }

    /**
     * Sets the value of field 'building'. The field 'building' has
     * the following description: This optional attribute can be
     * used to persist an asset value to the building column in the
     * OpenNMS DB.
     *  
     * 
     * @param building the value of field 'building'.
     */
    public void setBuilding(
            final java.lang.String building) {
        this._building = building;
    }

    /**
     * 
     * 
     * @param index
     * @param vCategory
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setCategory(
            final int index,
            final org.opennms.netmgt.importer.config.Category vCategory)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._categoryList.size()) {
            throw new IndexOutOfBoundsException("setCategory: Index value '" + index + "' not in range [0.." + (this._categoryList.size() - 1) + "]");
        }
        
        this._categoryList.set(index, vCategory);
    }

    /**
     * 
     * 
     * @param vCategoryArray
     */
    public void setCategory(
            final org.opennms.netmgt.importer.config.Category[] vCategoryArray) {
        //-- copy array
        _categoryList.clear();
        
        for (int i = 0; i < vCategoryArray.length; i++) {
                this._categoryList.add(vCategoryArray[i]);
        }
    }

    /**
     * Sets the value of '_categoryList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vCategoryList the Vector to copy.
     */
    public void setCategory(
            final java.util.List<org.opennms.netmgt.importer.config.Category> vCategoryList) {
        // copy vector
        this._categoryList.clear();
        
        this._categoryList.addAll(vCategoryList);
    }

    /**
     * Sets the value of '_categoryList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param categoryList the Vector to set.
     */
    public void setCategoryCollection(
            final java.util.List<org.opennms.netmgt.importer.config.Category> categoryList) {
        this._categoryList = categoryList;
    }

    /**
     * Sets the value of field 'city'. The field 'city' has the
     * following description: This optional attribute can be used
     * to persist an asset value to the building column in the
     * OpenNMS DB.
     *  
     * 
     * @param city the value of field 'city'.
     */
    public void setCity(
            final java.lang.String city) {
        this._city = city;
    }

    /**
     * Sets the value of field 'foreignId'. The field 'foreignId'
     * has the following description: This optional attribute can
     * be used to facilitate integration by making the key from the
     * integrating DB available adjacent to the OpenNMS key.
     *  
     * 
     * @param foreignId the value of field 'foreignId'.
     */
    public void setForeignId(
            final java.lang.String foreignId) {
        this._foreignId = foreignId;
    }

    /**
     * 
     * 
     * @param index
     * @param vInterface
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setInterface(
            final int index,
            final org.opennms.netmgt.importer.config.Interface vInterface)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._interfaceList.size()) {
            throw new IndexOutOfBoundsException("setInterface: Index value '" + index + "' not in range [0.." + (this._interfaceList.size() - 1) + "]");
        }
        
        this._interfaceList.set(index, vInterface);
    }

    /**
     * 
     * 
     * @param vInterfaceArray
     */
    public void setInterface(
            final org.opennms.netmgt.importer.config.Interface[] vInterfaceArray) {
        //-- copy array
        _interfaceList.clear();
        
        for (int i = 0; i < vInterfaceArray.length; i++) {
                this._interfaceList.add(vInterfaceArray[i]);
        }
    }

    /**
     * Sets the value of '_interfaceList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vInterfaceList the Vector to copy.
     */
    public void setInterface(
            final java.util.List<org.opennms.netmgt.importer.config.Interface> vInterfaceList) {
        // copy vector
        this._interfaceList.clear();
        
        this._interfaceList.addAll(vInterfaceList);
    }

    /**
     * Sets the value of '_interfaceList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param _interfaceList the Vector to set.
     */
    public void setInterfaceCollection(
            final java.util.List<org.opennms.netmgt.importer.config.Interface> _interfaceList) {
        this._interfaceList = _interfaceList;
    }

    /**
     * Sets the value of field 'nodeLabel'.
     * 
     * @param nodeLabel the value of field 'nodeLabel'.
     */
    public void setNodeLabel(
            final java.lang.String nodeLabel) {
        this._nodeLabel = nodeLabel;
    }

    /**
     * Sets the value of field 'parentForeignId'. The field
     * 'parentForeignId' has the following description: This
     * optional attribute can be used to facilitate building node
     * relationships.
     *  
     * 
     * @param parentForeignId the value of field 'parentForeignId'.
     */
    public void setParentForeignId(
            final java.lang.String parentForeignId) {
        this._parentForeignId = parentForeignId;
    }

    /**
     * Sets the value of field 'parentNodeLabel'. The field
     * 'parentNodeLabel' has the following description: This
     * optional attribute can be used to facilitate building node
     * relationships.
     *  
     * 
     * @param parentNodeLabel the value of field 'parentNodeLabel'.
     */
    public void setParentNodeLabel(
            final java.lang.String parentNodeLabel) {
        this._parentNodeLabel = parentNodeLabel;
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
     * org.opennms.netmgt.importer.config.Node
     */
    public static org.opennms.netmgt.importer.config.Node unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.importer.config.Node) Unmarshaller.unmarshal(org.opennms.netmgt.importer.config.Node.class, reader);
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
