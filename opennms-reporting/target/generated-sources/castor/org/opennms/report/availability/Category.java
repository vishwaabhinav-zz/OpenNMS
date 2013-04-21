/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.report.availability;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class Category.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Category implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _catName.
     */
    private java.lang.String _catName;

    /**
     * Field _catSectionsList.
     */
    private java.util.List<org.opennms.report.availability.CatSections> _catSectionsList;

    /**
     * Field _catComments.
     */
    private java.lang.String _catComments;

    /**
     * Field _warning.
     */
    private double _warning;

    /**
     * keeps track of state for field: _warning
     */
    private boolean _has_warning;

    /**
     * Field _normal.
     */
    private double _normal;

    /**
     * keeps track of state for field: _normal
     */
    private boolean _has_normal;

    /**
     * Field _catIndex.
     */
    private int _catIndex;

    /**
     * keeps track of state for field: _catIndex
     */
    private boolean _has_catIndex;

    /**
     * Field _nodeCount.
     */
    private int _nodeCount;

    /**
     * keeps track of state for field: _nodeCount
     */
    private boolean _has_nodeCount;

    /**
     * Field _ipaddrCount.
     */
    private int _ipaddrCount;

    /**
     * keeps track of state for field: _ipaddrCount
     */
    private boolean _has_ipaddrCount;

    /**
     * Field _serviceCount.
     */
    private int _serviceCount;

    /**
     * keeps track of state for field: _serviceCount
     */
    private boolean _has_serviceCount;


      //----------------/
     //- Constructors -/
    //----------------/

    public Category() {
        super();
        this._catSectionsList = new java.util.ArrayList<org.opennms.report.availability.CatSections>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vCatSections
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addCatSections(
            final org.opennms.report.availability.CatSections vCatSections)
    throws java.lang.IndexOutOfBoundsException {
        this._catSectionsList.add(vCatSections);
    }

    /**
     * 
     * 
     * @param index
     * @param vCatSections
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addCatSections(
            final int index,
            final org.opennms.report.availability.CatSections vCatSections)
    throws java.lang.IndexOutOfBoundsException {
        this._catSectionsList.add(index, vCatSections);
    }

    /**
     */
    public void deleteCatIndex(
    ) {
        this._has_catIndex= false;
    }

    /**
     */
    public void deleteIpaddrCount(
    ) {
        this._has_ipaddrCount= false;
    }

    /**
     */
    public void deleteNodeCount(
    ) {
        this._has_nodeCount= false;
    }

    /**
     */
    public void deleteNormal(
    ) {
        this._has_normal= false;
    }

    /**
     */
    public void deleteServiceCount(
    ) {
        this._has_serviceCount= false;
    }

    /**
     */
    public void deleteWarning(
    ) {
        this._has_warning= false;
    }

    /**
     * Method enumerateCatSections.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.report.availability.CatSections> enumerateCatSections(
    ) {
        return java.util.Collections.enumeration(this._catSectionsList);
    }

    /**
     * Returns the value of field 'catComments'.
     * 
     * @return the value of field 'CatComments'.
     */
    public java.lang.String getCatComments(
    ) {
        return this._catComments;
    }

    /**
     * Returns the value of field 'catIndex'.
     * 
     * @return the value of field 'CatIndex'.
     */
    public int getCatIndex(
    ) {
        return this._catIndex;
    }

    /**
     * Returns the value of field 'catName'.
     * 
     * @return the value of field 'CatName'.
     */
    public java.lang.String getCatName(
    ) {
        return this._catName;
    }

    /**
     * Method getCatSections.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.report.availability.CatSections at the given inde
     */
    public org.opennms.report.availability.CatSections getCatSections(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._catSectionsList.size()) {
            throw new IndexOutOfBoundsException("getCatSections: Index value '" + index + "' not in range [0.." + (this._catSectionsList.size() - 1) + "]");
        }
        
        return (org.opennms.report.availability.CatSections) _catSectionsList.get(index);
    }

    /**
     * Method getCatSections.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.report.availability.CatSections[] getCatSections(
    ) {
        org.opennms.report.availability.CatSections[] array = new org.opennms.report.availability.CatSections[0];
        return (org.opennms.report.availability.CatSections[]) this._catSectionsList.toArray(array);
    }

    /**
     * Method getCatSectionsCollection.Returns a reference to
     * '_catSectionsList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.report.availability.CatSections> getCatSectionsCollection(
    ) {
        return this._catSectionsList;
    }

    /**
     * Method getCatSectionsCount.
     * 
     * @return the size of this collection
     */
    public int getCatSectionsCount(
    ) {
        return this._catSectionsList.size();
    }

    /**
     * Returns the value of field 'ipaddrCount'.
     * 
     * @return the value of field 'IpaddrCount'.
     */
    public int getIpaddrCount(
    ) {
        return this._ipaddrCount;
    }

    /**
     * Returns the value of field 'nodeCount'.
     * 
     * @return the value of field 'NodeCount'.
     */
    public int getNodeCount(
    ) {
        return this._nodeCount;
    }

    /**
     * Returns the value of field 'normal'.
     * 
     * @return the value of field 'Normal'.
     */
    public double getNormal(
    ) {
        return this._normal;
    }

    /**
     * Returns the value of field 'serviceCount'.
     * 
     * @return the value of field 'ServiceCount'.
     */
    public int getServiceCount(
    ) {
        return this._serviceCount;
    }

    /**
     * Returns the value of field 'warning'.
     * 
     * @return the value of field 'Warning'.
     */
    public double getWarning(
    ) {
        return this._warning;
    }

    /**
     * Method hasCatIndex.
     * 
     * @return true if at least one CatIndex has been added
     */
    public boolean hasCatIndex(
    ) {
        return this._has_catIndex;
    }

    /**
     * Method hasIpaddrCount.
     * 
     * @return true if at least one IpaddrCount has been added
     */
    public boolean hasIpaddrCount(
    ) {
        return this._has_ipaddrCount;
    }

    /**
     * Method hasNodeCount.
     * 
     * @return true if at least one NodeCount has been added
     */
    public boolean hasNodeCount(
    ) {
        return this._has_nodeCount;
    }

    /**
     * Method hasNormal.
     * 
     * @return true if at least one Normal has been added
     */
    public boolean hasNormal(
    ) {
        return this._has_normal;
    }

    /**
     * Method hasServiceCount.
     * 
     * @return true if at least one ServiceCount has been added
     */
    public boolean hasServiceCount(
    ) {
        return this._has_serviceCount;
    }

    /**
     * Method hasWarning.
     * 
     * @return true if at least one Warning has been added
     */
    public boolean hasWarning(
    ) {
        return this._has_warning;
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
     * Method iterateCatSections.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.report.availability.CatSections> iterateCatSections(
    ) {
        return this._catSectionsList.iterator();
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
    public void removeAllCatSections(
    ) {
        this._catSectionsList.clear();
    }

    /**
     * Method removeCatSections.
     * 
     * @param vCatSections
     * @return true if the object was removed from the collection.
     */
    public boolean removeCatSections(
            final org.opennms.report.availability.CatSections vCatSections) {
        boolean removed = _catSectionsList.remove(vCatSections);
        return removed;
    }

    /**
     * Method removeCatSectionsAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.report.availability.CatSections removeCatSectionsAt(
            final int index) {
        java.lang.Object obj = this._catSectionsList.remove(index);
        return (org.opennms.report.availability.CatSections) obj;
    }

    /**
     * Sets the value of field 'catComments'.
     * 
     * @param catComments the value of field 'catComments'.
     */
    public void setCatComments(
            final java.lang.String catComments) {
        this._catComments = catComments;
    }

    /**
     * Sets the value of field 'catIndex'.
     * 
     * @param catIndex the value of field 'catIndex'.
     */
    public void setCatIndex(
            final int catIndex) {
        this._catIndex = catIndex;
        this._has_catIndex = true;
    }

    /**
     * Sets the value of field 'catName'.
     * 
     * @param catName the value of field 'catName'.
     */
    public void setCatName(
            final java.lang.String catName) {
        this._catName = catName;
    }

    /**
     * 
     * 
     * @param index
     * @param vCatSections
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setCatSections(
            final int index,
            final org.opennms.report.availability.CatSections vCatSections)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._catSectionsList.size()) {
            throw new IndexOutOfBoundsException("setCatSections: Index value '" + index + "' not in range [0.." + (this._catSectionsList.size() - 1) + "]");
        }
        
        this._catSectionsList.set(index, vCatSections);
    }

    /**
     * 
     * 
     * @param vCatSectionsArray
     */
    public void setCatSections(
            final org.opennms.report.availability.CatSections[] vCatSectionsArray) {
        //-- copy array
        _catSectionsList.clear();
        
        for (int i = 0; i < vCatSectionsArray.length; i++) {
                this._catSectionsList.add(vCatSectionsArray[i]);
        }
    }

    /**
     * Sets the value of '_catSectionsList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vCatSectionsList the Vector to copy.
     */
    public void setCatSections(
            final java.util.List<org.opennms.report.availability.CatSections> vCatSectionsList) {
        // copy vector
        this._catSectionsList.clear();
        
        this._catSectionsList.addAll(vCatSectionsList);
    }

    /**
     * Sets the value of '_catSectionsList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param catSectionsList the Vector to set.
     */
    public void setCatSectionsCollection(
            final java.util.List<org.opennms.report.availability.CatSections> catSectionsList) {
        this._catSectionsList = catSectionsList;
    }

    /**
     * Sets the value of field 'ipaddrCount'.
     * 
     * @param ipaddrCount the value of field 'ipaddrCount'.
     */
    public void setIpaddrCount(
            final int ipaddrCount) {
        this._ipaddrCount = ipaddrCount;
        this._has_ipaddrCount = true;
    }

    /**
     * Sets the value of field 'nodeCount'.
     * 
     * @param nodeCount the value of field 'nodeCount'.
     */
    public void setNodeCount(
            final int nodeCount) {
        this._nodeCount = nodeCount;
        this._has_nodeCount = true;
    }

    /**
     * Sets the value of field 'normal'.
     * 
     * @param normal the value of field 'normal'.
     */
    public void setNormal(
            final double normal) {
        this._normal = normal;
        this._has_normal = true;
    }

    /**
     * Sets the value of field 'serviceCount'.
     * 
     * @param serviceCount the value of field 'serviceCount'.
     */
    public void setServiceCount(
            final int serviceCount) {
        this._serviceCount = serviceCount;
        this._has_serviceCount = true;
    }

    /**
     * Sets the value of field 'warning'.
     * 
     * @param warning the value of field 'warning'.
     */
    public void setWarning(
            final double warning) {
        this._warning = warning;
        this._has_warning = true;
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
     * org.opennms.report.availability.Category
     */
    public static org.opennms.report.availability.Category unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.report.availability.Category) Unmarshaller.unmarshal(org.opennms.report.availability.Category.class, reader);
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
