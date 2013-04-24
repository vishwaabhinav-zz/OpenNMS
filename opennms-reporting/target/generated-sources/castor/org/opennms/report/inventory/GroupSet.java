/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.report.inventory;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class GroupSet.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class GroupSet implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _groupSetName.
     */
    private java.lang.String _groupSetName;

    /**
     * Field _totalNodes.
     */
    private int _totalNodes;

    /**
     * keeps track of state for field: _totalNodes
     */
    private boolean _has_totalNodes;

    /**
     * Field _nodesMatching.
     */
    private int _nodesMatching;

    /**
     * keeps track of state for field: _nodesMatching
     */
    private boolean _has_nodesMatching;

    /**
     * Field _nodesWithoutinventoryAtAll.
     */
    private int _nodesWithoutinventoryAtAll;

    /**
     * keeps track of state for field: _nodesWithoutinventoryAtAll
     */
    private boolean _has_nodesWithoutinventoryAtAll;

    /**
     * Field _nodesWithoutinventoryAtReportDate.
     */
    private int _nodesWithoutinventoryAtReportDate;

    /**
     * keeps track of state for field:
     * _nodesWithoutinventoryAtReportDate
     */
    private boolean _has_nodesWithoutinventoryAtReportDate;

    /**
     * Field _nbisinglenodeList.
     */
    private java.util.List<org.opennms.report.inventory.Nbisinglenode> _nbisinglenodeList;


      //----------------/
     //- Constructors -/
    //----------------/

    public GroupSet() {
        super();
        this._nbisinglenodeList = new java.util.ArrayList<org.opennms.report.inventory.Nbisinglenode>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vNbisinglenode
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addNbisinglenode(
            final org.opennms.report.inventory.Nbisinglenode vNbisinglenode)
    throws java.lang.IndexOutOfBoundsException {
        this._nbisinglenodeList.add(vNbisinglenode);
    }

    /**
     * 
     * 
     * @param index
     * @param vNbisinglenode
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addNbisinglenode(
            final int index,
            final org.opennms.report.inventory.Nbisinglenode vNbisinglenode)
    throws java.lang.IndexOutOfBoundsException {
        this._nbisinglenodeList.add(index, vNbisinglenode);
    }

    /**
     */
    public void deleteNodesMatching(
    ) {
        this._has_nodesMatching= false;
    }

    /**
     */
    public void deleteNodesWithoutinventoryAtAll(
    ) {
        this._has_nodesWithoutinventoryAtAll= false;
    }

    /**
     */
    public void deleteNodesWithoutinventoryAtReportDate(
    ) {
        this._has_nodesWithoutinventoryAtReportDate= false;
    }

    /**
     */
    public void deleteTotalNodes(
    ) {
        this._has_totalNodes= false;
    }

    /**
     * Method enumerateNbisinglenode.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.report.inventory.Nbisinglenode> enumerateNbisinglenode(
    ) {
        return java.util.Collections.enumeration(this._nbisinglenodeList);
    }

    /**
     * Returns the value of field 'groupSetName'.
     * 
     * @return the value of field 'GroupSetName'.
     */
    public java.lang.String getGroupSetName(
    ) {
        return this._groupSetName;
    }

    /**
     * Method getNbisinglenode.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.report.inventory.Nbisinglenode at the given index
     */
    public org.opennms.report.inventory.Nbisinglenode getNbisinglenode(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._nbisinglenodeList.size()) {
            throw new IndexOutOfBoundsException("getNbisinglenode: Index value '" + index + "' not in range [0.." + (this._nbisinglenodeList.size() - 1) + "]");
        }
        
        return (org.opennms.report.inventory.Nbisinglenode) _nbisinglenodeList.get(index);
    }

    /**
     * Method getNbisinglenode.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.report.inventory.Nbisinglenode[] getNbisinglenode(
    ) {
        org.opennms.report.inventory.Nbisinglenode[] array = new org.opennms.report.inventory.Nbisinglenode[0];
        return (org.opennms.report.inventory.Nbisinglenode[]) this._nbisinglenodeList.toArray(array);
    }

    /**
     * Method getNbisinglenodeCollection.Returns a reference to
     * '_nbisinglenodeList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.report.inventory.Nbisinglenode> getNbisinglenodeCollection(
    ) {
        return this._nbisinglenodeList;
    }

    /**
     * Method getNbisinglenodeCount.
     * 
     * @return the size of this collection
     */
    public int getNbisinglenodeCount(
    ) {
        return this._nbisinglenodeList.size();
    }

    /**
     * Returns the value of field 'nodesMatching'.
     * 
     * @return the value of field 'NodesMatching'.
     */
    public int getNodesMatching(
    ) {
        return this._nodesMatching;
    }

    /**
     * Returns the value of field 'nodesWithoutinventoryAtAll'.
     * 
     * @return the value of field 'NodesWithoutinventoryAtAll'.
     */
    public int getNodesWithoutinventoryAtAll(
    ) {
        return this._nodesWithoutinventoryAtAll;
    }

    /**
     * Returns the value of field
     * 'nodesWithoutinventoryAtReportDate'.
     * 
     * @return the value of field
     * 'NodesWithoutinventoryAtReportDate'.
     */
    public int getNodesWithoutinventoryAtReportDate(
    ) {
        return this._nodesWithoutinventoryAtReportDate;
    }

    /**
     * Returns the value of field 'totalNodes'.
     * 
     * @return the value of field 'TotalNodes'.
     */
    public int getTotalNodes(
    ) {
        return this._totalNodes;
    }

    /**
     * Method hasNodesMatching.
     * 
     * @return true if at least one NodesMatching has been added
     */
    public boolean hasNodesMatching(
    ) {
        return this._has_nodesMatching;
    }

    /**
     * Method hasNodesWithoutinventoryAtAll.
     * 
     * @return true if at least one NodesWithoutinventoryAtAll has
     * been added
     */
    public boolean hasNodesWithoutinventoryAtAll(
    ) {
        return this._has_nodesWithoutinventoryAtAll;
    }

    /**
     * Method hasNodesWithoutinventoryAtReportDate.
     * 
     * @return true if at least one
     * NodesWithoutinventoryAtReportDate has been added
     */
    public boolean hasNodesWithoutinventoryAtReportDate(
    ) {
        return this._has_nodesWithoutinventoryAtReportDate;
    }

    /**
     * Method hasTotalNodes.
     * 
     * @return true if at least one TotalNodes has been added
     */
    public boolean hasTotalNodes(
    ) {
        return this._has_totalNodes;
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
     * Method iterateNbisinglenode.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.report.inventory.Nbisinglenode> iterateNbisinglenode(
    ) {
        return this._nbisinglenodeList.iterator();
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
    public void removeAllNbisinglenode(
    ) {
        this._nbisinglenodeList.clear();
    }

    /**
     * Method removeNbisinglenode.
     * 
     * @param vNbisinglenode
     * @return true if the object was removed from the collection.
     */
    public boolean removeNbisinglenode(
            final org.opennms.report.inventory.Nbisinglenode vNbisinglenode) {
        boolean removed = _nbisinglenodeList.remove(vNbisinglenode);
        return removed;
    }

    /**
     * Method removeNbisinglenodeAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.report.inventory.Nbisinglenode removeNbisinglenodeAt(
            final int index) {
        java.lang.Object obj = this._nbisinglenodeList.remove(index);
        return (org.opennms.report.inventory.Nbisinglenode) obj;
    }

    /**
     * Sets the value of field 'groupSetName'.
     * 
     * @param groupSetName the value of field 'groupSetName'.
     */
    public void setGroupSetName(
            final java.lang.String groupSetName) {
        this._groupSetName = groupSetName;
    }

    /**
     * 
     * 
     * @param index
     * @param vNbisinglenode
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setNbisinglenode(
            final int index,
            final org.opennms.report.inventory.Nbisinglenode vNbisinglenode)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._nbisinglenodeList.size()) {
            throw new IndexOutOfBoundsException("setNbisinglenode: Index value '" + index + "' not in range [0.." + (this._nbisinglenodeList.size() - 1) + "]");
        }
        
        this._nbisinglenodeList.set(index, vNbisinglenode);
    }

    /**
     * 
     * 
     * @param vNbisinglenodeArray
     */
    public void setNbisinglenode(
            final org.opennms.report.inventory.Nbisinglenode[] vNbisinglenodeArray) {
        //-- copy array
        _nbisinglenodeList.clear();
        
        for (int i = 0; i < vNbisinglenodeArray.length; i++) {
                this._nbisinglenodeList.add(vNbisinglenodeArray[i]);
        }
    }

    /**
     * Sets the value of '_nbisinglenodeList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vNbisinglenodeList the Vector to copy.
     */
    public void setNbisinglenode(
            final java.util.List<org.opennms.report.inventory.Nbisinglenode> vNbisinglenodeList) {
        // copy vector
        this._nbisinglenodeList.clear();
        
        this._nbisinglenodeList.addAll(vNbisinglenodeList);
    }

    /**
     * Sets the value of '_nbisinglenodeList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param nbisinglenodeList the Vector to set.
     */
    public void setNbisinglenodeCollection(
            final java.util.List<org.opennms.report.inventory.Nbisinglenode> nbisinglenodeList) {
        this._nbisinglenodeList = nbisinglenodeList;
    }

    /**
     * Sets the value of field 'nodesMatching'.
     * 
     * @param nodesMatching the value of field 'nodesMatching'.
     */
    public void setNodesMatching(
            final int nodesMatching) {
        this._nodesMatching = nodesMatching;
        this._has_nodesMatching = true;
    }

    /**
     * Sets the value of field 'nodesWithoutinventoryAtAll'.
     * 
     * @param nodesWithoutinventoryAtAll the value of field
     * 'nodesWithoutinventoryAtAll'.
     */
    public void setNodesWithoutinventoryAtAll(
            final int nodesWithoutinventoryAtAll) {
        this._nodesWithoutinventoryAtAll = nodesWithoutinventoryAtAll;
        this._has_nodesWithoutinventoryAtAll = true;
    }

    /**
     * Sets the value of field 'nodesWithoutinventoryAtReportDate'.
     * 
     * @param nodesWithoutinventoryAtReportDate the value of field
     * 'nodesWithoutinventoryAtReportDate'.
     */
    public void setNodesWithoutinventoryAtReportDate(
            final int nodesWithoutinventoryAtReportDate) {
        this._nodesWithoutinventoryAtReportDate = nodesWithoutinventoryAtReportDate;
        this._has_nodesWithoutinventoryAtReportDate = true;
    }

    /**
     * Sets the value of field 'totalNodes'.
     * 
     * @param totalNodes the value of field 'totalNodes'.
     */
    public void setTotalNodes(
            final int totalNodes) {
        this._totalNodes = totalNodes;
        this._has_totalNodes = true;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.opennms.report.inventory.GroupSet
     */
    public static org.opennms.report.inventory.GroupSet unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.report.inventory.GroupSet) Unmarshaller.unmarshal(org.opennms.report.inventory.GroupSet.class, reader);
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
