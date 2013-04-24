/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.rancid.adapter;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Configuration of Policy
 *  functionality
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Policies implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * This represents a policy to manage a provisioned node
     *  if matched a node will be added updated or deleted using
     *  the element attribute definitions .
     */
    private java.util.List<org.opennms.netmgt.config.rancid.adapter.PolicyManage> _policyManageList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Policies() {
        super();
        this._policyManageList = new java.util.ArrayList<org.opennms.netmgt.config.rancid.adapter.PolicyManage>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vPolicyManage
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addPolicyManage(
            final org.opennms.netmgt.config.rancid.adapter.PolicyManage vPolicyManage)
    throws java.lang.IndexOutOfBoundsException {
        this._policyManageList.add(vPolicyManage);
    }

    /**
     * 
     * 
     * @param index
     * @param vPolicyManage
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addPolicyManage(
            final int index,
            final org.opennms.netmgt.config.rancid.adapter.PolicyManage vPolicyManage)
    throws java.lang.IndexOutOfBoundsException {
        this._policyManageList.add(index, vPolicyManage);
    }

    /**
     * Method enumeratePolicyManage.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.rancid.adapter.PolicyManage> enumeratePolicyManage(
    ) {
        return java.util.Collections.enumeration(this._policyManageList);
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
        
        if (obj instanceof Policies) {
        
            Policies temp = (Policies)obj;
            if (this._policyManageList != null) {
                if (temp._policyManageList == null) return false;
                else if (!(this._policyManageList.equals(temp._policyManageList))) 
                    return false;
            }
            else if (temp._policyManageList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Method getPolicyManage.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.rancid.adapter.PolicyManage at the
     * given index
     */
    public org.opennms.netmgt.config.rancid.adapter.PolicyManage getPolicyManage(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._policyManageList.size()) {
            throw new IndexOutOfBoundsException("getPolicyManage: Index value '" + index + "' not in range [0.." + (this._policyManageList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.rancid.adapter.PolicyManage) _policyManageList.get(index);
    }

    /**
     * Method getPolicyManage.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.rancid.adapter.PolicyManage[] getPolicyManage(
    ) {
        org.opennms.netmgt.config.rancid.adapter.PolicyManage[] array = new org.opennms.netmgt.config.rancid.adapter.PolicyManage[0];
        return (org.opennms.netmgt.config.rancid.adapter.PolicyManage[]) this._policyManageList.toArray(array);
    }

    /**
     * Method getPolicyManageCollection.Returns a reference to
     * '_policyManageList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.rancid.adapter.PolicyManage> getPolicyManageCollection(
    ) {
        return this._policyManageList;
    }

    /**
     * Method getPolicyManageCount.
     * 
     * @return the size of this collection
     */
    public int getPolicyManageCount(
    ) {
        return this._policyManageList.size();
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
        if (_policyManageList != null) {
           result = 37 * result + _policyManageList.hashCode();
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
     * Method iteratePolicyManage.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.rancid.adapter.PolicyManage> iteratePolicyManage(
    ) {
        return this._policyManageList.iterator();
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
    public void removeAllPolicyManage(
    ) {
        this._policyManageList.clear();
    }

    /**
     * Method removePolicyManage.
     * 
     * @param vPolicyManage
     * @return true if the object was removed from the collection.
     */
    public boolean removePolicyManage(
            final org.opennms.netmgt.config.rancid.adapter.PolicyManage vPolicyManage) {
        boolean removed = _policyManageList.remove(vPolicyManage);
        return removed;
    }

    /**
     * Method removePolicyManageAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.rancid.adapter.PolicyManage removePolicyManageAt(
            final int index) {
        java.lang.Object obj = this._policyManageList.remove(index);
        return (org.opennms.netmgt.config.rancid.adapter.PolicyManage) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vPolicyManage
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setPolicyManage(
            final int index,
            final org.opennms.netmgt.config.rancid.adapter.PolicyManage vPolicyManage)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._policyManageList.size()) {
            throw new IndexOutOfBoundsException("setPolicyManage: Index value '" + index + "' not in range [0.." + (this._policyManageList.size() - 1) + "]");
        }
        
        this._policyManageList.set(index, vPolicyManage);
    }

    /**
     * 
     * 
     * @param vPolicyManageArray
     */
    public void setPolicyManage(
            final org.opennms.netmgt.config.rancid.adapter.PolicyManage[] vPolicyManageArray) {
        //-- copy array
        _policyManageList.clear();
        
        for (int i = 0; i < vPolicyManageArray.length; i++) {
                this._policyManageList.add(vPolicyManageArray[i]);
        }
    }

    /**
     * Sets the value of '_policyManageList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vPolicyManageList the Vector to copy.
     */
    public void setPolicyManage(
            final java.util.List<org.opennms.netmgt.config.rancid.adapter.PolicyManage> vPolicyManageList) {
        // copy vector
        this._policyManageList.clear();
        
        this._policyManageList.addAll(vPolicyManageList);
    }

    /**
     * Sets the value of '_policyManageList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param policyManageList the Vector to set.
     */
    public void setPolicyManageCollection(
            final java.util.List<org.opennms.netmgt.config.rancid.adapter.PolicyManage> policyManageList) {
        this._policyManageList = policyManageList;
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
     * org.opennms.netmgt.config.rancid.adapter.Policies
     */
    public static org.opennms.netmgt.config.rancid.adapter.Policies unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.rancid.adapter.Policies) Unmarshaller.unmarshal(org.opennms.netmgt.config.rancid.adapter.Policies.class, reader);
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
