/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.report.configuration;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class GroupXSet.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class GroupXSet implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _groupXSetName.
     */
    private java.lang.String _groupXSetName;

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
     * Field _nodesWithoutconfigurationAtAll.
     */
    private int _nodesWithoutconfigurationAtAll;

    /**
     * keeps track of state for field:
     * _nodesWithoutconfigurationAtAll
     */
    private boolean _has_nodesWithoutconfigurationAtAll;

    /**
     * Field _nodesWithoutconfigurationAtReportDate.
     */
    private int _nodesWithoutconfigurationAtReportDate;

    /**
     * keeps track of state for field:
     * _nodesWithoutconfigurationAtReportDate
     */
    private boolean _has_nodesWithoutconfigurationAtReportDate;

    /**
     * Field _nodeSetList.
     */
    private java.util.List<org.opennms.report.configuration.NodeSet> _nodeSetList;


      //----------------/
     //- Constructors -/
    //----------------/

    public GroupXSet() {
        super();
        this._nodeSetList = new java.util.ArrayList<org.opennms.report.configuration.NodeSet>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vNodeSet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addNodeSet(
            final org.opennms.report.configuration.NodeSet vNodeSet)
    throws java.lang.IndexOutOfBoundsException {
        this._nodeSetList.add(vNodeSet);
    }

    /**
     * 
     * 
     * @param index
     * @param vNodeSet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addNodeSet(
            final int index,
            final org.opennms.report.configuration.NodeSet vNodeSet)
    throws java.lang.IndexOutOfBoundsException {
        this._nodeSetList.add(index, vNodeSet);
    }

    /**
     */
    public void deleteNodesMatching(
    ) {
        this._has_nodesMatching= false;
    }

    /**
     */
    public void deleteNodesWithoutconfigurationAtAll(
    ) {
        this._has_nodesWithoutconfigurationAtAll= false;
    }

    /**
     */
    public void deleteNodesWithoutconfigurationAtReportDate(
    ) {
        this._has_nodesWithoutconfigurationAtReportDate= false;
    }

    /**
     */
    public void deleteTotalNodes(
    ) {
        this._has_totalNodes= false;
    }

    /**
     * Method enumerateNodeSet.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.report.configuration.NodeSet> enumerateNodeSet(
    ) {
        return java.util.Collections.enumeration(this._nodeSetList);
    }

    /**
     * Returns the value of field 'groupXSetName'.
     * 
     * @return the value of field 'GroupXSetName'.
     */
    public java.lang.String getGroupXSetName(
    ) {
        return this._groupXSetName;
    }

    /**
     * Method getNodeSet.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.report.configuration.NodeSet at the given index
     */
    public org.opennms.report.configuration.NodeSet getNodeSet(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._nodeSetList.size()) {
            throw new IndexOutOfBoundsException("getNodeSet: Index value '" + index + "' not in range [0.." + (this._nodeSetList.size() - 1) + "]");
        }
        
        return (org.opennms.report.configuration.NodeSet) _nodeSetList.get(index);
    }

    /**
     * Method getNodeSet.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.report.configuration.NodeSet[] getNodeSet(
    ) {
        org.opennms.report.configuration.NodeSet[] array = new org.opennms.report.configuration.NodeSet[0];
        return (org.opennms.report.configuration.NodeSet[]) this._nodeSetList.toArray(array);
    }

    /**
     * Method getNodeSetCollection.Returns a reference to
     * '_nodeSetList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.report.configuration.NodeSet> getNodeSetCollection(
    ) {
        return this._nodeSetList;
    }

    /**
     * Method getNodeSetCount.
     * 
     * @return the size of this collection
     */
    public int getNodeSetCount(
    ) {
        return this._nodeSetList.size();
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
     * Returns the value of field 'nodesWithoutconfigurationAtAll'.
     * 
     * @return the value of field 'NodesWithoutconfigurationAtAll'.
     */
    public int getNodesWithoutconfigurationAtAll(
    ) {
        return this._nodesWithoutconfigurationAtAll;
    }

    /**
     * Returns the value of field
     * 'nodesWithoutconfigurationAtReportDate'.
     * 
     * @return the value of field
     * 'NodesWithoutconfigurationAtReportDate'.
     */
    public int getNodesWithoutconfigurationAtReportDate(
    ) {
        return this._nodesWithoutconfigurationAtReportDate;
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
     * Method hasNodesWithoutconfigurationAtAll.
     * 
     * @return true if at least one NodesWithoutconfigurationAtAll
     * has been added
     */
    public boolean hasNodesWithoutconfigurationAtAll(
    ) {
        return this._has_nodesWithoutconfigurationAtAll;
    }

    /**
     * Method hasNodesWithoutconfigurationAtReportDate.
     * 
     * @return true if at least one
     * NodesWithoutconfigurationAtReportDate has been added
     */
    public boolean hasNodesWithoutconfigurationAtReportDate(
    ) {
        return this._has_nodesWithoutconfigurationAtReportDate;
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
     * Method iterateNodeSet.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.report.configuration.NodeSet> iterateNodeSet(
    ) {
        return this._nodeSetList.iterator();
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
    public void removeAllNodeSet(
    ) {
        this._nodeSetList.clear();
    }

    /**
     * Method removeNodeSet.
     * 
     * @param vNodeSet
     * @return true if the object was removed from the collection.
     */
    public boolean removeNodeSet(
            final org.opennms.report.configuration.NodeSet vNodeSet) {
        boolean removed = _nodeSetList.remove(vNodeSet);
        return removed;
    }

    /**
     * Method removeNodeSetAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.report.configuration.NodeSet removeNodeSetAt(
            final int index) {
        java.lang.Object obj = this._nodeSetList.remove(index);
        return (org.opennms.report.configuration.NodeSet) obj;
    }

    /**
     * Sets the value of field 'groupXSetName'.
     * 
     * @param groupXSetName the value of field 'groupXSetName'.
     */
    public void setGroupXSetName(
            final java.lang.String groupXSetName) {
        this._groupXSetName = groupXSetName;
    }

    /**
     * 
     * 
     * @param index
     * @param vNodeSet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setNodeSet(
            final int index,
            final org.opennms.report.configuration.NodeSet vNodeSet)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._nodeSetList.size()) {
            throw new IndexOutOfBoundsException("setNodeSet: Index value '" + index + "' not in range [0.." + (this._nodeSetList.size() - 1) + "]");
        }
        
        this._nodeSetList.set(index, vNodeSet);
    }

    /**
     * 
     * 
     * @param vNodeSetArray
     */
    public void setNodeSet(
            final org.opennms.report.configuration.NodeSet[] vNodeSetArray) {
        //-- copy array
        _nodeSetList.clear();
        
        for (int i = 0; i < vNodeSetArray.length; i++) {
                this._nodeSetList.add(vNodeSetArray[i]);
        }
    }

    /**
     * Sets the value of '_nodeSetList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vNodeSetList the Vector to copy.
     */
    public void setNodeSet(
            final java.util.List<org.opennms.report.configuration.NodeSet> vNodeSetList) {
        // copy vector
        this._nodeSetList.clear();
        
        this._nodeSetList.addAll(vNodeSetList);
    }

    /**
     * Sets the value of '_nodeSetList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param nodeSetList the Vector to set.
     */
    public void setNodeSetCollection(
            final java.util.List<org.opennms.report.configuration.NodeSet> nodeSetList) {
        this._nodeSetList = nodeSetList;
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
     * Sets the value of field 'nodesWithoutconfigurationAtAll'.
     * 
     * @param nodesWithoutconfigurationAtAll the value of field
     * 'nodesWithoutconfigurationAtAll'.
     */
    public void setNodesWithoutconfigurationAtAll(
            final int nodesWithoutconfigurationAtAll) {
        this._nodesWithoutconfigurationAtAll = nodesWithoutconfigurationAtAll;
        this._has_nodesWithoutconfigurationAtAll = true;
    }

    /**
     * Sets the value of field
     * 'nodesWithoutconfigurationAtReportDate'.
     * 
     * @param nodesWithoutconfigurationAtReportDate the value of
     * field 'nodesWithoutconfigurationAtReportDate'.
     */
    public void setNodesWithoutconfigurationAtReportDate(
            final int nodesWithoutconfigurationAtReportDate) {
        this._nodesWithoutconfigurationAtReportDate = nodesWithoutconfigurationAtReportDate;
        this._has_nodesWithoutconfigurationAtReportDate = true;
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
     * @return the unmarshaled
     * org.opennms.report.configuration.GroupXSet
     */
    public static org.opennms.report.configuration.GroupXSet unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.report.configuration.GroupXSet) Unmarshaller.unmarshal(org.opennms.report.configuration.GroupXSet.class, reader);
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
