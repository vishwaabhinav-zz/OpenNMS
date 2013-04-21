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
 * Use this configuration file as an import of nodes, interfaces,
 * and services to OpenNMS by-passing several phases of discovery
 * and capabilities polling.
 *  
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class ModelImport implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _dateStamp.
     */
    private java.util.Date _dateStamp;

    /**
     * Field _lastImport.
     */
    private java.util.Date _lastImport;

    /**
     * Field _foreignSource.
     */
    private java.lang.String _foreignSource = "imported:";

    /**
     * This attribute is ignored, and kept only to preserve
     * compatibility with old import XML files.
     */
    private boolean _nonIpInterfaces = false;

    /**
     * keeps track of state for field: _nonIpInterfaces
     */
    private boolean _has_nonIpInterfaces;

    /**
     * This attribute is ignored, and kept only to preserve
     * compatibility with old import XML files.
     */
    private java.lang.String _nonIpSnmpPrimary = "N";

    /**
     * A node in OpenNMS is a network entity that is used to
     * contain network interfaces and those interface's services.
     */
    private java.util.List<org.opennms.netmgt.importer.config.Node> _nodeList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ModelImport() {
        super();
        setForeignSource("imported:");
        setNonIpSnmpPrimary("N");
        this._nodeList = new java.util.ArrayList<org.opennms.netmgt.importer.config.Node>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vNode
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addNode(
            final org.opennms.netmgt.importer.config.Node vNode)
    throws java.lang.IndexOutOfBoundsException {
        this._nodeList.add(vNode);
    }

    /**
     * 
     * 
     * @param index
     * @param vNode
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addNode(
            final int index,
            final org.opennms.netmgt.importer.config.Node vNode)
    throws java.lang.IndexOutOfBoundsException {
        this._nodeList.add(index, vNode);
    }

    /**
     */
    public void deleteNonIpInterfaces(
    ) {
        this._has_nonIpInterfaces= false;
    }

    /**
     * Method enumerateNode.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.importer.config.Node> enumerateNode(
    ) {
        return java.util.Collections.enumeration(this._nodeList);
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
        
        if (obj instanceof ModelImport) {
        
            ModelImport temp = (ModelImport)obj;
            if (this._dateStamp != null) {
                if (temp._dateStamp == null) return false;
                else if (!(this._dateStamp.equals(temp._dateStamp))) 
                    return false;
            }
            else if (temp._dateStamp != null)
                return false;
            if (this._lastImport != null) {
                if (temp._lastImport == null) return false;
                else if (!(this._lastImport.equals(temp._lastImport))) 
                    return false;
            }
            else if (temp._lastImport != null)
                return false;
            if (this._foreignSource != null) {
                if (temp._foreignSource == null) return false;
                else if (!(this._foreignSource.equals(temp._foreignSource))) 
                    return false;
            }
            else if (temp._foreignSource != null)
                return false;
            if (this._nonIpInterfaces != temp._nonIpInterfaces)
                return false;
            if (this._has_nonIpInterfaces != temp._has_nonIpInterfaces)
                return false;
            if (this._nonIpSnmpPrimary != null) {
                if (temp._nonIpSnmpPrimary == null) return false;
                else if (!(this._nonIpSnmpPrimary.equals(temp._nonIpSnmpPrimary))) 
                    return false;
            }
            else if (temp._nonIpSnmpPrimary != null)
                return false;
            if (this._nodeList != null) {
                if (temp._nodeList == null) return false;
                else if (!(this._nodeList.equals(temp._nodeList))) 
                    return false;
            }
            else if (temp._nodeList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'dateStamp'.
     * 
     * @return the value of field 'DateStamp'.
     */
    public java.util.Date getDateStamp(
    ) {
        return this._dateStamp;
    }

    /**
     * Returns the value of field 'foreignSource'.
     * 
     * @return the value of field 'ForeignSource'.
     */
    public java.lang.String getForeignSource(
    ) {
        return this._foreignSource;
    }

    /**
     * Returns the value of field 'lastImport'.
     * 
     * @return the value of field 'LastImport'.
     */
    public java.util.Date getLastImport(
    ) {
        return this._lastImport;
    }

    /**
     * Method getNode.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.importer.config.Node at the given index
     */
    public org.opennms.netmgt.importer.config.Node getNode(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._nodeList.size()) {
            throw new IndexOutOfBoundsException("getNode: Index value '" + index + "' not in range [0.." + (this._nodeList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.importer.config.Node) _nodeList.get(index);
    }

    /**
     * Method getNode.Returns the contents of the collection in an
     * Array.  <p>Note:  Just in case the collection contents are
     * changing in another thread, we pass a 0-length Array of the
     * correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.importer.config.Node[] getNode(
    ) {
        org.opennms.netmgt.importer.config.Node[] array = new org.opennms.netmgt.importer.config.Node[0];
        return (org.opennms.netmgt.importer.config.Node[]) this._nodeList.toArray(array);
    }

    /**
     * Method getNodeCollection.Returns a reference to '_nodeList'.
     * No type checking is performed on any modifications to the
     * Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.importer.config.Node> getNodeCollection(
    ) {
        return this._nodeList;
    }

    /**
     * Method getNodeCount.
     * 
     * @return the size of this collection
     */
    public int getNodeCount(
    ) {
        return this._nodeList.size();
    }

    /**
     * Returns the value of field 'nonIpInterfaces'. The field
     * 'nonIpInterfaces' has the following description: This
     * attribute is ignored, and kept only to preserve
     * compatibility with old import XML files.
     * 
     * @return the value of field 'NonIpInterfaces'.
     */
    public boolean getNonIpInterfaces(
    ) {
        return this._nonIpInterfaces;
    }

    /**
     * Returns the value of field 'nonIpSnmpPrimary'. The field
     * 'nonIpSnmpPrimary' has the following description: This
     * attribute is ignored, and kept only to preserve
     * compatibility with old import XML files.
     * 
     * @return the value of field 'NonIpSnmpPrimary'.
     */
    public java.lang.String getNonIpSnmpPrimary(
    ) {
        return this._nonIpSnmpPrimary;
    }

    /**
     * Method hasNonIpInterfaces.
     * 
     * @return true if at least one NonIpInterfaces has been added
     */
    public boolean hasNonIpInterfaces(
    ) {
        return this._has_nonIpInterfaces;
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
        if (_dateStamp != null) {
           result = 37 * result + _dateStamp.hashCode();
        }
        if (_lastImport != null) {
           result = 37 * result + _lastImport.hashCode();
        }
        if (_foreignSource != null) {
           result = 37 * result + _foreignSource.hashCode();
        }
        result = 37 * result + (_nonIpInterfaces?0:1);
        if (_nonIpSnmpPrimary != null) {
           result = 37 * result + _nonIpSnmpPrimary.hashCode();
        }
        if (_nodeList != null) {
           result = 37 * result + _nodeList.hashCode();
        }
        
        return result;
    }

    /**
     * Returns the value of field 'nonIpInterfaces'. The field
     * 'nonIpInterfaces' has the following description: This
     * attribute is ignored, and kept only to preserve
     * compatibility with old import XML files.
     * 
     * @return the value of field 'NonIpInterfaces'.
     */
    public boolean isNonIpInterfaces(
    ) {
        return this._nonIpInterfaces;
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
     * Method iterateNode.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.importer.config.Node> iterateNode(
    ) {
        return this._nodeList.iterator();
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
    public void removeAllNode(
    ) {
        this._nodeList.clear();
    }

    /**
     * Method removeNode.
     * 
     * @param vNode
     * @return true if the object was removed from the collection.
     */
    public boolean removeNode(
            final org.opennms.netmgt.importer.config.Node vNode) {
        boolean removed = _nodeList.remove(vNode);
        return removed;
    }

    /**
     * Method removeNodeAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.importer.config.Node removeNodeAt(
            final int index) {
        java.lang.Object obj = this._nodeList.remove(index);
        return (org.opennms.netmgt.importer.config.Node) obj;
    }

    /**
     * Sets the value of field 'dateStamp'.
     * 
     * @param dateStamp the value of field 'dateStamp'.
     */
    public void setDateStamp(
            final java.util.Date dateStamp) {
        this._dateStamp = dateStamp;
    }

    /**
     * Sets the value of field 'foreignSource'.
     * 
     * @param foreignSource the value of field 'foreignSource'.
     */
    public void setForeignSource(
            final java.lang.String foreignSource) {
        this._foreignSource = foreignSource;
    }

    /**
     * Sets the value of field 'lastImport'.
     * 
     * @param lastImport the value of field 'lastImport'.
     */
    public void setLastImport(
            final java.util.Date lastImport) {
        this._lastImport = lastImport;
    }

    /**
     * 
     * 
     * @param index
     * @param vNode
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setNode(
            final int index,
            final org.opennms.netmgt.importer.config.Node vNode)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._nodeList.size()) {
            throw new IndexOutOfBoundsException("setNode: Index value '" + index + "' not in range [0.." + (this._nodeList.size() - 1) + "]");
        }
        
        this._nodeList.set(index, vNode);
    }

    /**
     * 
     * 
     * @param vNodeArray
     */
    public void setNode(
            final org.opennms.netmgt.importer.config.Node[] vNodeArray) {
        //-- copy array
        _nodeList.clear();
        
        for (int i = 0; i < vNodeArray.length; i++) {
                this._nodeList.add(vNodeArray[i]);
        }
    }

    /**
     * Sets the value of '_nodeList' by copying the given Vector.
     * All elements will be checked for type safety.
     * 
     * @param vNodeList the Vector to copy.
     */
    public void setNode(
            final java.util.List<org.opennms.netmgt.importer.config.Node> vNodeList) {
        // copy vector
        this._nodeList.clear();
        
        this._nodeList.addAll(vNodeList);
    }

    /**
     * Sets the value of '_nodeList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param nodeList the Vector to set.
     */
    public void setNodeCollection(
            final java.util.List<org.opennms.netmgt.importer.config.Node> nodeList) {
        this._nodeList = nodeList;
    }

    /**
     * Sets the value of field 'nonIpInterfaces'. The field
     * 'nonIpInterfaces' has the following description: This
     * attribute is ignored, and kept only to preserve
     * compatibility with old import XML files.
     * 
     * @param nonIpInterfaces the value of field 'nonIpInterfaces'.
     */
    public void setNonIpInterfaces(
            final boolean nonIpInterfaces) {
        this._nonIpInterfaces = nonIpInterfaces;
        this._has_nonIpInterfaces = true;
    }

    /**
     * Sets the value of field 'nonIpSnmpPrimary'. The field
     * 'nonIpSnmpPrimary' has the following description: This
     * attribute is ignored, and kept only to preserve
     * compatibility with old import XML files.
     * 
     * @param nonIpSnmpPrimary the value of field 'nonIpSnmpPrimary'
     */
    public void setNonIpSnmpPrimary(
            final java.lang.String nonIpSnmpPrimary) {
        this._nonIpSnmpPrimary = nonIpSnmpPrimary;
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
     * org.opennms.netmgt.importer.config.ModelImport
     */
    public static org.opennms.netmgt.importer.config.ModelImport unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.importer.config.ModelImport) Unmarshaller.unmarshal(org.opennms.netmgt.importer.config.ModelImport.class, reader);
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
