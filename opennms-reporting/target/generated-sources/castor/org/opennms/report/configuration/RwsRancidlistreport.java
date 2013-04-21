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
 * Top-level element for the rancidlistreport.xml report file.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class RwsRancidlistreport implements java.io.Serializable {


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
     * Field _groupsWithNodesWithoutconfigurationAtAll.
     */
    private int _groupsWithNodesWithoutconfigurationAtAll;

    /**
     * keeps track of state for field:
     * _groupsWithNodesWithoutconfigurationAtAll
     */
    private boolean _has_groupsWithNodesWithoutconfigurationAtAll;

    /**
     * Field _groupsWithNodesWithoutconfigurationAtReportDate.
     */
    private int _groupsWithNodesWithoutconfigurationAtReportDate;

    /**
     * keeps track of state for field:
     * _groupsWithNodesWithoutconfigurationAtReportDate
     */
    private boolean _has_groupsWithNodesWithoutconfigurationAtReportDate;

    /**
     * Field _user.
     */
    private java.lang.String _user;

    /**
     * Field _reportDate.
     */
    private java.lang.String _reportDate;

    /**
     * Field _reportRequestDate.
     */
    private java.lang.String _reportRequestDate;

    /**
     * Field _groupXSetList.
     */
    private java.util.List<org.opennms.report.configuration.GroupXSet> _groupXSetList;


      //----------------/
     //- Constructors -/
    //----------------/

    public RwsRancidlistreport() {
        super();
        this._groupXSetList = new java.util.ArrayList<org.opennms.report.configuration.GroupXSet>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vGroupXSet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addGroupXSet(
            final org.opennms.report.configuration.GroupXSet vGroupXSet)
    throws java.lang.IndexOutOfBoundsException {
        this._groupXSetList.add(vGroupXSet);
    }

    /**
     * 
     * 
     * @param index
     * @param vGroupXSet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addGroupXSet(
            final int index,
            final org.opennms.report.configuration.GroupXSet vGroupXSet)
    throws java.lang.IndexOutOfBoundsException {
        this._groupXSetList.add(index, vGroupXSet);
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
    public void deleteGroupsWithNodesWithoutconfigurationAtAll(
    ) {
        this._has_groupsWithNodesWithoutconfigurationAtAll= false;
    }

    /**
     */
    public void deleteGroupsWithNodesWithoutconfigurationAtReportDate(
    ) {
        this._has_groupsWithNodesWithoutconfigurationAtReportDate= false;
    }

    /**
     */
    public void deleteTotalGroups(
    ) {
        this._has_totalGroups= false;
    }

    /**
     * Method enumerateGroupXSet.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.report.configuration.GroupXSet> enumerateGroupXSet(
    ) {
        return java.util.Collections.enumeration(this._groupXSetList);
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
     * Method getGroupXSet.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.report.configuration.GroupXSet at the given index
     */
    public org.opennms.report.configuration.GroupXSet getGroupXSet(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._groupXSetList.size()) {
            throw new IndexOutOfBoundsException("getGroupXSet: Index value '" + index + "' not in range [0.." + (this._groupXSetList.size() - 1) + "]");
        }
        
        return (org.opennms.report.configuration.GroupXSet) _groupXSetList.get(index);
    }

    /**
     * Method getGroupXSet.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.report.configuration.GroupXSet[] getGroupXSet(
    ) {
        org.opennms.report.configuration.GroupXSet[] array = new org.opennms.report.configuration.GroupXSet[0];
        return (org.opennms.report.configuration.GroupXSet[]) this._groupXSetList.toArray(array);
    }

    /**
     * Method getGroupXSetCollection.Returns a reference to
     * '_groupXSetList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.report.configuration.GroupXSet> getGroupXSetCollection(
    ) {
        return this._groupXSetList;
    }

    /**
     * Method getGroupXSetCount.
     * 
     * @return the size of this collection
     */
    public int getGroupXSetCount(
    ) {
        return this._groupXSetList.size();
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
     * 'groupsWithNodesWithoutconfigurationAtAll'.
     * 
     * @return the value of field
     * 'GroupsWithNodesWithoutconfigurationAtAll'.
     */
    public int getGroupsWithNodesWithoutconfigurationAtAll(
    ) {
        return this._groupsWithNodesWithoutconfigurationAtAll;
    }

    /**
     * Returns the value of field
     * 'groupsWithNodesWithoutconfigurationAtReportDate'.
     * 
     * @return the value of field
     * 'GroupsWithNodesWithoutconfigurationAtReportDate'.
     */
    public int getGroupsWithNodesWithoutconfigurationAtReportDate(
    ) {
        return this._groupsWithNodesWithoutconfigurationAtReportDate;
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
     * Method hasGroupsWithNodesWithoutconfigurationAtAll.
     * 
     * @return true if at least one
     * GroupsWithNodesWithoutconfigurationAtAll has been added
     */
    public boolean hasGroupsWithNodesWithoutconfigurationAtAll(
    ) {
        return this._has_groupsWithNodesWithoutconfigurationAtAll;
    }

    /**
     * Method hasGroupsWithNodesWithoutconfigurationAtReportDate.
     * 
     * @return true if at least one
     * GroupsWithNodesWithoutconfigurationAtReportDate has been adde
     */
    public boolean hasGroupsWithNodesWithoutconfigurationAtReportDate(
    ) {
        return this._has_groupsWithNodesWithoutconfigurationAtReportDate;
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
     * Method iterateGroupXSet.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.report.configuration.GroupXSet> iterateGroupXSet(
    ) {
        return this._groupXSetList.iterator();
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
    public void removeAllGroupXSet(
    ) {
        this._groupXSetList.clear();
    }

    /**
     * Method removeGroupXSet.
     * 
     * @param vGroupXSet
     * @return true if the object was removed from the collection.
     */
    public boolean removeGroupXSet(
            final org.opennms.report.configuration.GroupXSet vGroupXSet) {
        boolean removed = _groupXSetList.remove(vGroupXSet);
        return removed;
    }

    /**
     * Method removeGroupXSetAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.report.configuration.GroupXSet removeGroupXSetAt(
            final int index) {
        java.lang.Object obj = this._groupXSetList.remove(index);
        return (org.opennms.report.configuration.GroupXSet) obj;
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
     * 
     * 
     * @param index
     * @param vGroupXSet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setGroupXSet(
            final int index,
            final org.opennms.report.configuration.GroupXSet vGroupXSet)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._groupXSetList.size()) {
            throw new IndexOutOfBoundsException("setGroupXSet: Index value '" + index + "' not in range [0.." + (this._groupXSetList.size() - 1) + "]");
        }
        
        this._groupXSetList.set(index, vGroupXSet);
    }

    /**
     * 
     * 
     * @param vGroupXSetArray
     */
    public void setGroupXSet(
            final org.opennms.report.configuration.GroupXSet[] vGroupXSetArray) {
        //-- copy array
        _groupXSetList.clear();
        
        for (int i = 0; i < vGroupXSetArray.length; i++) {
                this._groupXSetList.add(vGroupXSetArray[i]);
        }
    }

    /**
     * Sets the value of '_groupXSetList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vGroupXSetList the Vector to copy.
     */
    public void setGroupXSet(
            final java.util.List<org.opennms.report.configuration.GroupXSet> vGroupXSetList) {
        // copy vector
        this._groupXSetList.clear();
        
        this._groupXSetList.addAll(vGroupXSetList);
    }

    /**
     * Sets the value of '_groupXSetList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param groupXSetList the Vector to set.
     */
    public void setGroupXSetCollection(
            final java.util.List<org.opennms.report.configuration.GroupXSet> groupXSetList) {
        this._groupXSetList = groupXSetList;
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
     * 'groupsWithNodesWithoutconfigurationAtAll'.
     * 
     * @param groupsWithNodesWithoutconfigurationAtAll the value of
     * field 'groupsWithNodesWithoutconfigurationAtAll'.
     */
    public void setGroupsWithNodesWithoutconfigurationAtAll(
            final int groupsWithNodesWithoutconfigurationAtAll) {
        this._groupsWithNodesWithoutconfigurationAtAll = groupsWithNodesWithoutconfigurationAtAll;
        this._has_groupsWithNodesWithoutconfigurationAtAll = true;
    }

    /**
     * Sets the value of field
     * 'groupsWithNodesWithoutconfigurationAtReportDate'.
     * 
     * @param groupsWithNodesWithoutconfigurationAtReportDate the
     * value of field
     * 'groupsWithNodesWithoutconfigurationAtReportDate'.
     */
    public void setGroupsWithNodesWithoutconfigurationAtReportDate(
            final int groupsWithNodesWithoutconfigurationAtReportDate) {
        this._groupsWithNodesWithoutconfigurationAtReportDate = groupsWithNodesWithoutconfigurationAtReportDate;
        this._has_groupsWithNodesWithoutconfigurationAtReportDate = true;
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
     * org.opennms.report.configuration.RwsRancidlistreport
     */
    public static org.opennms.report.configuration.RwsRancidlistreport unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.report.configuration.RwsRancidlistreport) Unmarshaller.unmarshal(org.opennms.report.configuration.RwsRancidlistreport.class, reader);
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
