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
 * Top-level element for the nodeinventoryinventory.xml
 * configuration file.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class RwsNbinventoryreport implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _totalGroups.
     */
    private int _totalGroups;

    /**
     * keeps track of state for field: _totalGroups
     */
    private boolean _has_totalGroups;

    /**
     * Field _groupsMatching.
     */
    private int _groupsMatching;

    /**
     * keeps track of state for field: _groupsMatching
     */
    private boolean _has_groupsMatching;

    /**
     * Field _groupWithoutNodes.
     */
    private int _groupWithoutNodes;

    /**
     * keeps track of state for field: _groupWithoutNodes
     */
    private boolean _has_groupWithoutNodes;

    /**
     * Field _groupsWithNodesWithoutinventoryAtAll.
     */
    private int _groupsWithNodesWithoutinventoryAtAll;

    /**
     * keeps track of state for field:
     * _groupsWithNodesWithoutinventoryAtAll
     */
    private boolean _has_groupsWithNodesWithoutinventoryAtAll;

    /**
     * Field _groupsWithNodesWithoutinventoryAtReportDate.
     */
    private int _groupsWithNodesWithoutinventoryAtReportDate;

    /**
     * keeps track of state for field:
     * _groupsWithNodesWithoutinventoryAtReportDate
     */
    private boolean _has_groupsWithNodesWithoutinventoryAtReportDate;

    /**
     * Field _user.
     */
    private java.lang.String _user;

    /**
     * Field _theField.
     */
    private java.lang.String _theField;

    /**
     * Field _reportDate.
     */
    private java.lang.String _reportDate;

    /**
     * Field _reportRequestDate.
     */
    private java.lang.String _reportRequestDate;

    /**
     * Field _groupSetList.
     */
    private java.util.List<org.opennms.report.inventory.GroupSet> _groupSetList;


      //----------------/
     //- Constructors -/
    //----------------/

    public RwsNbinventoryreport() {
        super();
        this._groupSetList = new java.util.ArrayList<org.opennms.report.inventory.GroupSet>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vGroupSet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addGroupSet(
            final org.opennms.report.inventory.GroupSet vGroupSet)
    throws java.lang.IndexOutOfBoundsException {
        this._groupSetList.add(vGroupSet);
    }

    /**
     * 
     * 
     * @param index
     * @param vGroupSet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addGroupSet(
            final int index,
            final org.opennms.report.inventory.GroupSet vGroupSet)
    throws java.lang.IndexOutOfBoundsException {
        this._groupSetList.add(index, vGroupSet);
    }

    /**
     */
    public void deleteGroupWithoutNodes(
    ) {
        this._has_groupWithoutNodes= false;
    }

    /**
     */
    public void deleteGroupsMatching(
    ) {
        this._has_groupsMatching= false;
    }

    /**
     */
    public void deleteGroupsWithNodesWithoutinventoryAtAll(
    ) {
        this._has_groupsWithNodesWithoutinventoryAtAll= false;
    }

    /**
     */
    public void deleteGroupsWithNodesWithoutinventoryAtReportDate(
    ) {
        this._has_groupsWithNodesWithoutinventoryAtReportDate= false;
    }

    /**
     */
    public void deleteTotalGroups(
    ) {
        this._has_totalGroups= false;
    }

    /**
     * Method enumerateGroupSet.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.report.inventory.GroupSet> enumerateGroupSet(
    ) {
        return java.util.Collections.enumeration(this._groupSetList);
    }

    /**
     * Method getGroupSet.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.report.inventory.GroupSet at the given index
     */
    public org.opennms.report.inventory.GroupSet getGroupSet(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._groupSetList.size()) {
            throw new IndexOutOfBoundsException("getGroupSet: Index value '" + index + "' not in range [0.." + (this._groupSetList.size() - 1) + "]");
        }
        
        return (org.opennms.report.inventory.GroupSet) _groupSetList.get(index);
    }

    /**
     * Method getGroupSet.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.report.inventory.GroupSet[] getGroupSet(
    ) {
        org.opennms.report.inventory.GroupSet[] array = new org.opennms.report.inventory.GroupSet[0];
        return (org.opennms.report.inventory.GroupSet[]) this._groupSetList.toArray(array);
    }

    /**
     * Method getGroupSetCollection.Returns a reference to
     * '_groupSetList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.report.inventory.GroupSet> getGroupSetCollection(
    ) {
        return this._groupSetList;
    }

    /**
     * Method getGroupSetCount.
     * 
     * @return the size of this collection
     */
    public int getGroupSetCount(
    ) {
        return this._groupSetList.size();
    }

    /**
     * Returns the value of field 'groupWithoutNodes'.
     * 
     * @return the value of field 'GroupWithoutNodes'.
     */
    public int getGroupWithoutNodes(
    ) {
        return this._groupWithoutNodes;
    }

    /**
     * Returns the value of field 'groupsMatching'.
     * 
     * @return the value of field 'GroupsMatching'.
     */
    public int getGroupsMatching(
    ) {
        return this._groupsMatching;
    }

    /**
     * Returns the value of field
     * 'groupsWithNodesWithoutinventoryAtAll'.
     * 
     * @return the value of field
     * 'GroupsWithNodesWithoutinventoryAtAll'.
     */
    public int getGroupsWithNodesWithoutinventoryAtAll(
    ) {
        return this._groupsWithNodesWithoutinventoryAtAll;
    }

    /**
     * Returns the value of field
     * 'groupsWithNodesWithoutinventoryAtReportDate'.
     * 
     * @return the value of field
     * 'GroupsWithNodesWithoutinventoryAtReportDate'.
     */
    public int getGroupsWithNodesWithoutinventoryAtReportDate(
    ) {
        return this._groupsWithNodesWithoutinventoryAtReportDate;
    }

    /**
     * Returns the value of field 'reportDate'.
     * 
     * @return the value of field 'ReportDate'.
     */
    public java.lang.String getReportDate(
    ) {
        return this._reportDate;
    }

    /**
     * Returns the value of field 'reportRequestDate'.
     * 
     * @return the value of field 'ReportRequestDate'.
     */
    public java.lang.String getReportRequestDate(
    ) {
        return this._reportRequestDate;
    }

    /**
     * Returns the value of field 'theField'.
     * 
     * @return the value of field 'TheField'.
     */
    public java.lang.String getTheField(
    ) {
        return this._theField;
    }

    /**
     * Returns the value of field 'totalGroups'.
     * 
     * @return the value of field 'TotalGroups'.
     */
    public int getTotalGroups(
    ) {
        return this._totalGroups;
    }

    /**
     * Returns the value of field 'user'.
     * 
     * @return the value of field 'User'.
     */
    public java.lang.String getUser(
    ) {
        return this._user;
    }

    /**
     * Method hasGroupWithoutNodes.
     * 
     * @return true if at least one GroupWithoutNodes has been added
     */
    public boolean hasGroupWithoutNodes(
    ) {
        return this._has_groupWithoutNodes;
    }

    /**
     * Method hasGroupsMatching.
     * 
     * @return true if at least one GroupsMatching has been added
     */
    public boolean hasGroupsMatching(
    ) {
        return this._has_groupsMatching;
    }

    /**
     * Method hasGroupsWithNodesWithoutinventoryAtAll.
     * 
     * @return true if at least one
     * GroupsWithNodesWithoutinventoryAtAll has been added
     */
    public boolean hasGroupsWithNodesWithoutinventoryAtAll(
    ) {
        return this._has_groupsWithNodesWithoutinventoryAtAll;
    }

    /**
     * Method hasGroupsWithNodesWithoutinventoryAtReportDate.
     * 
     * @return true if at least one
     * GroupsWithNodesWithoutinventoryAtReportDate has been added
     */
    public boolean hasGroupsWithNodesWithoutinventoryAtReportDate(
    ) {
        return this._has_groupsWithNodesWithoutinventoryAtReportDate;
    }

    /**
     * Method hasTotalGroups.
     * 
     * @return true if at least one TotalGroups has been added
     */
    public boolean hasTotalGroups(
    ) {
        return this._has_totalGroups;
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
     * Method iterateGroupSet.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.report.inventory.GroupSet> iterateGroupSet(
    ) {
        return this._groupSetList.iterator();
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
    public void removeAllGroupSet(
    ) {
        this._groupSetList.clear();
    }

    /**
     * Method removeGroupSet.
     * 
     * @param vGroupSet
     * @return true if the object was removed from the collection.
     */
    public boolean removeGroupSet(
            final org.opennms.report.inventory.GroupSet vGroupSet) {
        boolean removed = _groupSetList.remove(vGroupSet);
        return removed;
    }

    /**
     * Method removeGroupSetAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.report.inventory.GroupSet removeGroupSetAt(
            final int index) {
        java.lang.Object obj = this._groupSetList.remove(index);
        return (org.opennms.report.inventory.GroupSet) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vGroupSet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setGroupSet(
            final int index,
            final org.opennms.report.inventory.GroupSet vGroupSet)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._groupSetList.size()) {
            throw new IndexOutOfBoundsException("setGroupSet: Index value '" + index + "' not in range [0.." + (this._groupSetList.size() - 1) + "]");
        }
        
        this._groupSetList.set(index, vGroupSet);
    }

    /**
     * 
     * 
     * @param vGroupSetArray
     */
    public void setGroupSet(
            final org.opennms.report.inventory.GroupSet[] vGroupSetArray) {
        //-- copy array
        _groupSetList.clear();
        
        for (int i = 0; i < vGroupSetArray.length; i++) {
                this._groupSetList.add(vGroupSetArray[i]);
        }
    }

    /**
     * Sets the value of '_groupSetList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vGroupSetList the Vector to copy.
     */
    public void setGroupSet(
            final java.util.List<org.opennms.report.inventory.GroupSet> vGroupSetList) {
        // copy vector
        this._groupSetList.clear();
        
        this._groupSetList.addAll(vGroupSetList);
    }

    /**
     * Sets the value of '_groupSetList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param groupSetList the Vector to set.
     */
    public void setGroupSetCollection(
            final java.util.List<org.opennms.report.inventory.GroupSet> groupSetList) {
        this._groupSetList = groupSetList;
    }

    /**
     * Sets the value of field 'groupWithoutNodes'.
     * 
     * @param groupWithoutNodes the value of field
     * 'groupWithoutNodes'.
     */
    public void setGroupWithoutNodes(
            final int groupWithoutNodes) {
        this._groupWithoutNodes = groupWithoutNodes;
        this._has_groupWithoutNodes = true;
    }

    /**
     * Sets the value of field 'groupsMatching'.
     * 
     * @param groupsMatching the value of field 'groupsMatching'.
     */
    public void setGroupsMatching(
            final int groupsMatching) {
        this._groupsMatching = groupsMatching;
        this._has_groupsMatching = true;
    }

    /**
     * Sets the value of field
     * 'groupsWithNodesWithoutinventoryAtAll'.
     * 
     * @param groupsWithNodesWithoutinventoryAtAll the value of
     * field 'groupsWithNodesWithoutinventoryAtAll'.
     */
    public void setGroupsWithNodesWithoutinventoryAtAll(
            final int groupsWithNodesWithoutinventoryAtAll) {
        this._groupsWithNodesWithoutinventoryAtAll = groupsWithNodesWithoutinventoryAtAll;
        this._has_groupsWithNodesWithoutinventoryAtAll = true;
    }

    /**
     * Sets the value of field
     * 'groupsWithNodesWithoutinventoryAtReportDate'.
     * 
     * @param groupsWithNodesWithoutinventoryAtReportDate the value
     * of field 'groupsWithNodesWithoutinventoryAtReportDate'.
     */
    public void setGroupsWithNodesWithoutinventoryAtReportDate(
            final int groupsWithNodesWithoutinventoryAtReportDate) {
        this._groupsWithNodesWithoutinventoryAtReportDate = groupsWithNodesWithoutinventoryAtReportDate;
        this._has_groupsWithNodesWithoutinventoryAtReportDate = true;
    }

    /**
     * Sets the value of field 'reportDate'.
     * 
     * @param reportDate the value of field 'reportDate'.
     */
    public void setReportDate(
            final java.lang.String reportDate) {
        this._reportDate = reportDate;
    }

    /**
     * Sets the value of field 'reportRequestDate'.
     * 
     * @param reportRequestDate the value of field
     * 'reportRequestDate'.
     */
    public void setReportRequestDate(
            final java.lang.String reportRequestDate) {
        this._reportRequestDate = reportRequestDate;
    }

    /**
     * Sets the value of field 'theField'.
     * 
     * @param theField the value of field 'theField'.
     */
    public void setTheField(
            final java.lang.String theField) {
        this._theField = theField;
    }

    /**
     * Sets the value of field 'totalGroups'.
     * 
     * @param totalGroups the value of field 'totalGroups'.
     */
    public void setTotalGroups(
            final int totalGroups) {
        this._totalGroups = totalGroups;
        this._has_totalGroups = true;
    }

    /**
     * Sets the value of field 'user'.
     * 
     * @param user the value of field 'user'.
     */
    public void setUser(
            final java.lang.String user) {
        this._user = user;
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
     * org.opennms.report.inventory.RwsNbinventoryreport
     */
    public static org.opennms.report.inventory.RwsNbinventoryreport unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.report.inventory.RwsNbinventoryreport) Unmarshaller.unmarshal(org.opennms.report.inventory.RwsNbinventoryreport.class, reader);
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
