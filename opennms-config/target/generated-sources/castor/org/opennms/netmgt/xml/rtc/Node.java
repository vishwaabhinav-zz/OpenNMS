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
 * A node
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Node implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The node id
     */
    private long _nodeid;

    /**
     * keeps track of state for field: _nodeid
     */
    private boolean _has_nodeid;

    /**
     * The node availability value
     */
    private double _nodevalue;

    /**
     * keeps track of state for field: _nodevalue
     */
    private boolean _has_nodevalue;

    /**
     * The number of active services on the
     *  node
     */
    private long _nodesvccount;

    /**
     * keeps track of state for field: _nodesvccount
     */
    private boolean _has_nodesvccount;

    /**
     * The number of active services currently down on the
     *  node
     */
    private long _nodesvcdowncount;

    /**
     * keeps track of state for field: _nodesvcdowncount
     */
    private boolean _has_nodesvcdowncount;


      //----------------/
     //- Constructors -/
    //----------------/

    public Node() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteNodeid(
    ) {
        this._has_nodeid= false;
    }

    /**
     */
    public void deleteNodesvccount(
    ) {
        this._has_nodesvccount= false;
    }

    /**
     */
    public void deleteNodesvcdowncount(
    ) {
        this._has_nodesvcdowncount= false;
    }

    /**
     */
    public void deleteNodevalue(
    ) {
        this._has_nodevalue= false;
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
            if (this._nodeid != temp._nodeid)
                return false;
            if (this._has_nodeid != temp._has_nodeid)
                return false;
            if (this._nodevalue != temp._nodevalue)
                return false;
            if (this._has_nodevalue != temp._has_nodevalue)
                return false;
            if (this._nodesvccount != temp._nodesvccount)
                return false;
            if (this._has_nodesvccount != temp._has_nodesvccount)
                return false;
            if (this._nodesvcdowncount != temp._nodesvcdowncount)
                return false;
            if (this._has_nodesvcdowncount != temp._has_nodesvcdowncount)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'nodeid'. The field 'nodeid' has
     * the following description: The node id
     * 
     * @return the value of field 'Nodeid'.
     */
    public long getNodeid(
    ) {
        return this._nodeid;
    }

    /**
     * Returns the value of field 'nodesvccount'. The field
     * 'nodesvccount' has the following description: The number of
     * active services on the
     *  node
     * 
     * @return the value of field 'Nodesvccount'.
     */
    public long getNodesvccount(
    ) {
        return this._nodesvccount;
    }

    /**
     * Returns the value of field 'nodesvcdowncount'. The field
     * 'nodesvcdowncount' has the following description: The number
     * of active services currently down on the
     *  node
     * 
     * @return the value of field 'Nodesvcdowncount'.
     */
    public long getNodesvcdowncount(
    ) {
        return this._nodesvcdowncount;
    }

    /**
     * Returns the value of field 'nodevalue'. The field
     * 'nodevalue' has the following description: The node
     * availability value
     * 
     * @return the value of field 'Nodevalue'.
     */
    public double getNodevalue(
    ) {
        return this._nodevalue;
    }

    /**
     * Method hasNodeid.
     * 
     * @return true if at least one Nodeid has been added
     */
    public boolean hasNodeid(
    ) {
        return this._has_nodeid;
    }

    /**
     * Method hasNodesvccount.
     * 
     * @return true if at least one Nodesvccount has been added
     */
    public boolean hasNodesvccount(
    ) {
        return this._has_nodesvccount;
    }

    /**
     * Method hasNodesvcdowncount.
     * 
     * @return true if at least one Nodesvcdowncount has been added
     */
    public boolean hasNodesvcdowncount(
    ) {
        return this._has_nodesvcdowncount;
    }

    /**
     * Method hasNodevalue.
     * 
     * @return true if at least one Nodevalue has been added
     */
    public boolean hasNodevalue(
    ) {
        return this._has_nodevalue;
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
        result = 37 * result + (int)(_nodeid^(_nodeid>>>32));
        tmp = java.lang.Double.doubleToLongBits(_nodevalue);
        result = 37 * result + (int)(tmp^(tmp>>>32));
        result = 37 * result + (int)(_nodesvccount^(_nodesvccount>>>32));
        result = 37 * result + (int)(_nodesvcdowncount^(_nodesvcdowncount>>>32));
        
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
     * Sets the value of field 'nodeid'. The field 'nodeid' has the
     * following description: The node id
     * 
     * @param nodeid the value of field 'nodeid'.
     */
    public void setNodeid(
            final long nodeid) {
        this._nodeid = nodeid;
        this._has_nodeid = true;
    }

    /**
     * Sets the value of field 'nodesvccount'. The field
     * 'nodesvccount' has the following description: The number of
     * active services on the
     *  node
     * 
     * @param nodesvccount the value of field 'nodesvccount'.
     */
    public void setNodesvccount(
            final long nodesvccount) {
        this._nodesvccount = nodesvccount;
        this._has_nodesvccount = true;
    }

    /**
     * Sets the value of field 'nodesvcdowncount'. The field
     * 'nodesvcdowncount' has the following description: The number
     * of active services currently down on the
     *  node
     * 
     * @param nodesvcdowncount the value of field 'nodesvcdowncount'
     */
    public void setNodesvcdowncount(
            final long nodesvcdowncount) {
        this._nodesvcdowncount = nodesvcdowncount;
        this._has_nodesvcdowncount = true;
    }

    /**
     * Sets the value of field 'nodevalue'. The field 'nodevalue'
     * has the following description: The node availability value
     * 
     * @param nodevalue the value of field 'nodevalue'.
     */
    public void setNodevalue(
            final double nodevalue) {
        this._nodevalue = nodevalue;
        this._has_nodevalue = true;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.opennms.netmgt.xml.rtc.Node
     */
    public static org.opennms.netmgt.xml.rtc.Node unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.xml.rtc.Node) Unmarshaller.unmarshal(org.opennms.netmgt.xml.rtc.Node.class, reader);
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
