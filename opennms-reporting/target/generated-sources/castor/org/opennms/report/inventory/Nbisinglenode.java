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
 * Class Nbisinglenode.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Nbisinglenode implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _groupname.
     */
    private java.lang.String _groupname;

    /**
     * Field _devicename.
     */
    private java.lang.String _devicename;

    /**
     * Field _configurationurl.
     */
    private java.lang.String _configurationurl;

    /**
     * Field _creationdate.
     */
    private java.util.Date _creationdate;

    /**
     * Field _status.
     */
    private java.lang.String _status;

    /**
     * Field _swconfigurationurl.
     */
    private java.lang.String _swconfigurationurl;

    /**
     * Field _version.
     */
    private java.lang.String _version;

    /**
     * Field _comment.
     */
    private java.lang.String _comment;

    /**
     * Field _inventoryElement2RPList.
     */
    private java.util.List<org.opennms.report.inventory.InventoryElement2RP> _inventoryElement2RPList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Nbisinglenode() {
        super();
        this._inventoryElement2RPList = new java.util.ArrayList<org.opennms.report.inventory.InventoryElement2RP>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vInventoryElement2RP
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addInventoryElement2RP(
            final org.opennms.report.inventory.InventoryElement2RP vInventoryElement2RP)
    throws java.lang.IndexOutOfBoundsException {
        this._inventoryElement2RPList.add(vInventoryElement2RP);
    }

    /**
     * 
     * 
     * @param index
     * @param vInventoryElement2RP
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addInventoryElement2RP(
            final int index,
            final org.opennms.report.inventory.InventoryElement2RP vInventoryElement2RP)
    throws java.lang.IndexOutOfBoundsException {
        this._inventoryElement2RPList.add(index, vInventoryElement2RP);
    }

    /**
     * Method enumerateInventoryElement2RP.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.report.inventory.InventoryElement2RP> enumerateInventoryElement2RP(
    ) {
        return java.util.Collections.enumeration(this._inventoryElement2RPList);
    }

    /**
     * Returns the value of field 'comment'.
     * 
     * @return the value of field 'Comment'.
     */
    public java.lang.String getComment(
    ) {
        return this._comment;
    }

    /**
     * Returns the value of field 'configurationurl'.
     * 
     * @return the value of field 'Configurationurl'.
     */
    public java.lang.String getConfigurationurl(
    ) {
        return this._configurationurl;
    }

    /**
     * Returns the value of field 'creationdate'.
     * 
     * @return the value of field 'Creationdate'.
     */
    public java.util.Date getCreationdate(
    ) {
        return this._creationdate;
    }

    /**
     * Returns the value of field 'devicename'.
     * 
     * @return the value of field 'Devicename'.
     */
    public java.lang.String getDevicename(
    ) {
        return this._devicename;
    }

    /**
     * Returns the value of field 'groupname'.
     * 
     * @return the value of field 'Groupname'.
     */
    public java.lang.String getGroupname(
    ) {
        return this._groupname;
    }

    /**
     * Method getInventoryElement2RP.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.report.inventory.InventoryElement2RP at the
     * given index
     */
    public org.opennms.report.inventory.InventoryElement2RP getInventoryElement2RP(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._inventoryElement2RPList.size()) {
            throw new IndexOutOfBoundsException("getInventoryElement2RP: Index value '" + index + "' not in range [0.." + (this._inventoryElement2RPList.size() - 1) + "]");
        }
        
        return (org.opennms.report.inventory.InventoryElement2RP) _inventoryElement2RPList.get(index);
    }

    /**
     * Method getInventoryElement2RP.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.report.inventory.InventoryElement2RP[] getInventoryElement2RP(
    ) {
        org.opennms.report.inventory.InventoryElement2RP[] array = new org.opennms.report.inventory.InventoryElement2RP[0];
        return (org.opennms.report.inventory.InventoryElement2RP[]) this._inventoryElement2RPList.toArray(array);
    }

    /**
     * Method getInventoryElement2RPCollection.Returns a reference
     * to '_inventoryElement2RPList'. No type checking is performed
     * on any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.report.inventory.InventoryElement2RP> getInventoryElement2RPCollection(
    ) {
        return this._inventoryElement2RPList;
    }

    /**
     * Method getInventoryElement2RPCount.
     * 
     * @return the size of this collection
     */
    public int getInventoryElement2RPCount(
    ) {
        return this._inventoryElement2RPList.size();
    }

    /**
     * Returns the value of field 'status'.
     * 
     * @return the value of field 'Status'.
     */
    public java.lang.String getStatus(
    ) {
        return this._status;
    }

    /**
     * Returns the value of field 'swconfigurationurl'.
     * 
     * @return the value of field 'Swconfigurationurl'.
     */
    public java.lang.String getSwconfigurationurl(
    ) {
        return this._swconfigurationurl;
    }

    /**
     * Returns the value of field 'version'.
     * 
     * @return the value of field 'Version'.
     */
    public java.lang.String getVersion(
    ) {
        return this._version;
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
     * Method iterateInventoryElement2RP.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.report.inventory.InventoryElement2RP> iterateInventoryElement2RP(
    ) {
        return this._inventoryElement2RPList.iterator();
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
    public void removeAllInventoryElement2RP(
    ) {
        this._inventoryElement2RPList.clear();
    }

    /**
     * Method removeInventoryElement2RP.
     * 
     * @param vInventoryElement2RP
     * @return true if the object was removed from the collection.
     */
    public boolean removeInventoryElement2RP(
            final org.opennms.report.inventory.InventoryElement2RP vInventoryElement2RP) {
        boolean removed = _inventoryElement2RPList.remove(vInventoryElement2RP);
        return removed;
    }

    /**
     * Method removeInventoryElement2RPAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.report.inventory.InventoryElement2RP removeInventoryElement2RPAt(
            final int index) {
        java.lang.Object obj = this._inventoryElement2RPList.remove(index);
        return (org.opennms.report.inventory.InventoryElement2RP) obj;
    }

    /**
     * Sets the value of field 'comment'.
     * 
     * @param comment the value of field 'comment'.
     */
    public void setComment(
            final java.lang.String comment) {
        this._comment = comment;
    }

    /**
     * Sets the value of field 'configurationurl'.
     * 
     * @param configurationurl the value of field 'configurationurl'
     */
    public void setConfigurationurl(
            final java.lang.String configurationurl) {
        this._configurationurl = configurationurl;
    }

    /**
     * Sets the value of field 'creationdate'.
     * 
     * @param creationdate the value of field 'creationdate'.
     */
    public void setCreationdate(
            final java.util.Date creationdate) {
        this._creationdate = creationdate;
    }

    /**
     * Sets the value of field 'devicename'.
     * 
     * @param devicename the value of field 'devicename'.
     */
    public void setDevicename(
            final java.lang.String devicename) {
        this._devicename = devicename;
    }

    /**
     * Sets the value of field 'groupname'.
     * 
     * @param groupname the value of field 'groupname'.
     */
    public void setGroupname(
            final java.lang.String groupname) {
        this._groupname = groupname;
    }

    /**
     * 
     * 
     * @param index
     * @param vInventoryElement2RP
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setInventoryElement2RP(
            final int index,
            final org.opennms.report.inventory.InventoryElement2RP vInventoryElement2RP)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._inventoryElement2RPList.size()) {
            throw new IndexOutOfBoundsException("setInventoryElement2RP: Index value '" + index + "' not in range [0.." + (this._inventoryElement2RPList.size() - 1) + "]");
        }
        
        this._inventoryElement2RPList.set(index, vInventoryElement2RP);
    }

    /**
     * 
     * 
     * @param vInventoryElement2RPArray
     */
    public void setInventoryElement2RP(
            final org.opennms.report.inventory.InventoryElement2RP[] vInventoryElement2RPArray) {
        //-- copy array
        _inventoryElement2RPList.clear();
        
        for (int i = 0; i < vInventoryElement2RPArray.length; i++) {
                this._inventoryElement2RPList.add(vInventoryElement2RPArray[i]);
        }
    }

    /**
     * Sets the value of '_inventoryElement2RPList' by copying the
     * given Vector. All elements will be checked for type safety.
     * 
     * @param vInventoryElement2RPList the Vector to copy.
     */
    public void setInventoryElement2RP(
            final java.util.List<org.opennms.report.inventory.InventoryElement2RP> vInventoryElement2RPList) {
        // copy vector
        this._inventoryElement2RPList.clear();
        
        this._inventoryElement2RPList.addAll(vInventoryElement2RPList);
    }

    /**
     * Sets the value of '_inventoryElement2RPList' by setting it
     * to the given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param inventoryElement2RPList the Vector to set.
     */
    public void setInventoryElement2RPCollection(
            final java.util.List<org.opennms.report.inventory.InventoryElement2RP> inventoryElement2RPList) {
        this._inventoryElement2RPList = inventoryElement2RPList;
    }

    /**
     * Sets the value of field 'status'.
     * 
     * @param status the value of field 'status'.
     */
    public void setStatus(
            final java.lang.String status) {
        this._status = status;
    }

    /**
     * Sets the value of field 'swconfigurationurl'.
     * 
     * @param swconfigurationurl the value of field
     * 'swconfigurationurl'.
     */
    public void setSwconfigurationurl(
            final java.lang.String swconfigurationurl) {
        this._swconfigurationurl = swconfigurationurl;
    }

    /**
     * Sets the value of field 'version'.
     * 
     * @param version the value of field 'version'.
     */
    public void setVersion(
            final java.lang.String version) {
        this._version = version;
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
     * org.opennms.report.inventory.Nbisinglenode
     */
    public static org.opennms.report.inventory.Nbisinglenode unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.report.inventory.Nbisinglenode) Unmarshaller.unmarshal(org.opennms.report.inventory.Nbisinglenode.class, reader);
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
