/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.xml.rtc;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * A category
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Category implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The category label
     */
    private java.lang.String _catlabel;

    /**
     * The category availability value
     */
    private double _catvalue;

    /**
     * keeps track of state for field: _catvalue
     */
    private boolean _has_catvalue;

    /**
     * A node that belongs to this
     *  category
     */
    private java.util.List<org.opennms.netmgt.xml.rtc.Node> _nodeList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Category() {
        super();
        this._nodeList = new java.util.ArrayList<org.opennms.netmgt.xml.rtc.Node>();
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
            final org.opennms.netmgt.xml.rtc.Node vNode)
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
            final org.opennms.netmgt.xml.rtc.Node vNode)
    throws java.lang.IndexOutOfBoundsException {
        this._nodeList.add(index, vNode);
    }

    /**
     */
    public void deleteCatvalue(
    ) {
        this._has_catvalue= false;
    }

    /**
     * Method enumerateNode.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.xml.rtc.Node> enumerateNode(
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
        
        if (obj instanceof Category) {
        
            Category temp = (Category)obj;
            if (this._catlabel != null) {
                if (temp._catlabel == null) return false;
                else if (!(this._catlabel.equals(temp._catlabel))) 
                    return false;
            }
            else if (temp._catlabel != null)
                return false;
            if (this._catvalue != temp._catvalue)
                return false;
            if (this._has_catvalue != temp._has_catvalue)
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
     * Returns the value of field 'catlabel'. The field 'catlabel'
     * has the following description: The category label
     * 
     * @return the value of field 'Catlabel'.
     */
    public java.lang.String getCatlabel(
    ) {
        return this._catlabel;
    }

    /**
     * Returns the value of field 'catvalue'. The field 'catvalue'
     * has the following description: The category availability
     * value
     * 
     * @return the value of field 'Catvalue'.
     */
    public double getCatvalue(
    ) {
        return this._catvalue;
    }

    /**
     * Method getNode.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the org.opennms.netmgt.xml.rtc.Node at
     * the given index
     */
    public org.opennms.netmgt.xml.rtc.Node getNode(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._nodeList.size()) {
            throw new IndexOutOfBoundsException("getNode: Index value '" + index + "' not in range [0.." + (this._nodeList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.xml.rtc.Node) _nodeList.get(index);
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
    public org.opennms.netmgt.xml.rtc.Node[] getNode(
    ) {
        org.opennms.netmgt.xml.rtc.Node[] array = new org.opennms.netmgt.xml.rtc.Node[0];
        return (org.opennms.netmgt.xml.rtc.Node[]) this._nodeList.toArray(array);
    }

    /**
     * Method getNodeCollection.Returns a reference to '_nodeList'.
     * No type checking is performed on any modifications to the
     * Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.xml.rtc.Node> getNodeCollection(
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
     * Method hasCatvalue.
     * 
     * @return true if at least one Catvalue has been added
     */
    public boolean hasCatvalue(
    ) {
        return this._has_catvalue;
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
        if (_catlabel != null) {
           result = 37 * result + _catlabel.hashCode();
        }
        tmp = java.lang.Double.doubleToLongBits(_catvalue);
        result = 37 * result + (int)(tmp^(tmp>>>32));
        if (_nodeList != null) {
           result = 37 * result + _nodeList.hashCode();
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
     * Method iterateNode.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.xml.rtc.Node> iterateNode(
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
            final org.opennms.netmgt.xml.rtc.Node vNode) {
        boolean removed = _nodeList.remove(vNode);
        return removed;
    }

    /**
     * Method removeNodeAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.xml.rtc.Node removeNodeAt(
            final int index) {
        java.lang.Object obj = this._nodeList.remove(index);
        return (org.opennms.netmgt.xml.rtc.Node) obj;
    }

    /**
     * Sets the value of field 'catlabel'. The field 'catlabel' has
     * the following description: The category label
     * 
     * @param catlabel the value of field 'catlabel'.
     */
    public void setCatlabel(
            final java.lang.String catlabel) {
        this._catlabel = catlabel;
    }

    /**
     * Sets the value of field 'catvalue'. The field 'catvalue' has
     * the following description: The category availability value
     * 
     * @param catvalue the value of field 'catvalue'.
     */
    public void setCatvalue(
            final double catvalue) {
        this._catvalue = catvalue;
        this._has_catvalue = true;
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
            final org.opennms.netmgt.xml.rtc.Node vNode)
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
            final org.opennms.netmgt.xml.rtc.Node[] vNodeArray) {
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
            final java.util.List<org.opennms.netmgt.xml.rtc.Node> vNodeList) {
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
            final java.util.List<org.opennms.netmgt.xml.rtc.Node> nodeList) {
        this._nodeList = nodeList;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.opennms.netmgt.xml.rtc.Category
     */
    public static org.opennms.netmgt.xml.rtc.Category unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.xml.rtc.Category) Unmarshaller.unmarshal(org.opennms.netmgt.xml.rtc.Category.class, reader);
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
