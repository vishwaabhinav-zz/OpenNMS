/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.views;

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
     * Field _label.
     */
    private java.lang.String _label;

    /**
     * Field _categoryComment.
     */
    private java.lang.String _categoryComment;

    /**
     * Field _normal.
     */
    private double _normal;

    /**
     * keeps track of state for field: _normal
     */
    private boolean _has_normal;

    /**
     * Field _warning.
     */
    private double _warning;

    /**
     * keeps track of state for field: _warning
     */
    private boolean _has_warning;

    /**
     * Field _serviceList.
     */
    private java.util.List<java.lang.String> _serviceList;

    /**
     * Field _rule.
     */
    private java.lang.String _rule;


      //----------------/
     //- Constructors -/
    //----------------/

    public Category() {
        super();
        this._serviceList = new java.util.ArrayList<java.lang.String>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vService
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addService(
            final java.lang.String vService)
    throws java.lang.IndexOutOfBoundsException {
        this._serviceList.add(vService);
    }

    /**
     * 
     * 
     * @param index
     * @param vService
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addService(
            final int index,
            final java.lang.String vService)
    throws java.lang.IndexOutOfBoundsException {
        this._serviceList.add(index, vService);
    }

    /**
     */
    public void deleteNormal(
    ) {
        this._has_normal= false;
    }

    /**
     */
    public void deleteWarning(
    ) {
        this._has_warning= false;
    }

    /**
     * Method enumerateService.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<java.lang.String> enumerateService(
    ) {
        return java.util.Collections.enumeration(this._serviceList);
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
            if (this._label != null) {
                if (temp._label == null) return false;
                else if (!(this._label.equals(temp._label))) 
                    return false;
            }
            else if (temp._label != null)
                return false;
            if (this._categoryComment != null) {
                if (temp._categoryComment == null) return false;
                else if (!(this._categoryComment.equals(temp._categoryComment))) 
                    return false;
            }
            else if (temp._categoryComment != null)
                return false;
            if (this._normal != temp._normal)
                return false;
            if (this._has_normal != temp._has_normal)
                return false;
            if (this._warning != temp._warning)
                return false;
            if (this._has_warning != temp._has_warning)
                return false;
            if (this._serviceList != null) {
                if (temp._serviceList == null) return false;
                else if (!(this._serviceList.equals(temp._serviceList))) 
                    return false;
            }
            else if (temp._serviceList != null)
                return false;
            if (this._rule != null) {
                if (temp._rule == null) return false;
                else if (!(this._rule.equals(temp._rule))) 
                    return false;
            }
            else if (temp._rule != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'categoryComment'.
     * 
     * @return the value of field 'CategoryComment'.
     */
    public java.lang.String getCategoryComment(
    ) {
        return this._categoryComment;
    }

    /**
     * Returns the value of field 'label'.
     * 
     * @return the value of field 'Label'.
     */
    public java.lang.String getLabel(
    ) {
        return this._label;
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
     * Returns the value of field 'rule'.
     * 
     * @return the value of field 'Rule'.
     */
    public java.lang.String getRule(
    ) {
        return this._rule;
    }

    /**
     * Method getService.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the java.lang.String at the given index
     */
    public java.lang.String getService(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._serviceList.size()) {
            throw new IndexOutOfBoundsException("getService: Index value '" + index + "' not in range [0.." + (this._serviceList.size() - 1) + "]");
        }
        
        return (java.lang.String) _serviceList.get(index);
    }

    /**
     * Method getService.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public java.lang.String[] getService(
    ) {
        java.lang.String[] array = new java.lang.String[0];
        return (java.lang.String[]) this._serviceList.toArray(array);
    }

    /**
     * Method getServiceCollection.Returns a reference to
     * '_serviceList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<java.lang.String> getServiceCollection(
    ) {
        return this._serviceList;
    }

    /**
     * Method getServiceCount.
     * 
     * @return the size of this collection
     */
    public int getServiceCount(
    ) {
        return this._serviceList.size();
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
     * Method hasNormal.
     * 
     * @return true if at least one Normal has been added
     */
    public boolean hasNormal(
    ) {
        return this._has_normal;
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
        if (_label != null) {
           result = 37 * result + _label.hashCode();
        }
        if (_categoryComment != null) {
           result = 37 * result + _categoryComment.hashCode();
        }
        tmp = java.lang.Double.doubleToLongBits(_normal);
        result = 37 * result + (int)(tmp^(tmp>>>32));
        tmp = java.lang.Double.doubleToLongBits(_warning);
        result = 37 * result + (int)(tmp^(tmp>>>32));
        if (_serviceList != null) {
           result = 37 * result + _serviceList.hashCode();
        }
        if (_rule != null) {
           result = 37 * result + _rule.hashCode();
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
     * Method iterateService.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<java.lang.String> iterateService(
    ) {
        return this._serviceList.iterator();
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
    public void removeAllService(
    ) {
        this._serviceList.clear();
    }

    /**
     * Method removeService.
     * 
     * @param vService
     * @return true if the object was removed from the collection.
     */
    public boolean removeService(
            final java.lang.String vService) {
        boolean removed = _serviceList.remove(vService);
        return removed;
    }

    /**
     * Method removeServiceAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public java.lang.String removeServiceAt(
            final int index) {
        java.lang.Object obj = this._serviceList.remove(index);
        return (java.lang.String) obj;
    }

    /**
     * Sets the value of field 'categoryComment'.
     * 
     * @param categoryComment the value of field 'categoryComment'.
     */
    public void setCategoryComment(
            final java.lang.String categoryComment) {
        this._categoryComment = categoryComment;
    }

    /**
     * Sets the value of field 'label'.
     * 
     * @param label the value of field 'label'.
     */
    public void setLabel(
            final java.lang.String label) {
        this._label = label;
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
     * Sets the value of field 'rule'.
     * 
     * @param rule the value of field 'rule'.
     */
    public void setRule(
            final java.lang.String rule) {
        this._rule = rule;
    }

    /**
     * 
     * 
     * @param index
     * @param vService
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setService(
            final int index,
            final java.lang.String vService)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._serviceList.size()) {
            throw new IndexOutOfBoundsException("setService: Index value '" + index + "' not in range [0.." + (this._serviceList.size() - 1) + "]");
        }
        
        this._serviceList.set(index, vService);
    }

    /**
     * 
     * 
     * @param vServiceArray
     */
    public void setService(
            final java.lang.String[] vServiceArray) {
        //-- copy array
        _serviceList.clear();
        
        for (int i = 0; i < vServiceArray.length; i++) {
                this._serviceList.add(vServiceArray[i]);
        }
    }

    /**
     * Sets the value of '_serviceList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vServiceList the Vector to copy.
     */
    public void setService(
            final java.util.List<java.lang.String> vServiceList) {
        // copy vector
        this._serviceList.clear();
        
        this._serviceList.addAll(vServiceList);
    }

    /**
     * Sets the value of '_serviceList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param serviceList the Vector to set.
     */
    public void setServiceCollection(
            final java.util.List<java.lang.String> serviceList) {
        this._serviceList = serviceList;
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
     * org.opennms.netmgt.config.views.Category
     */
    public static org.opennms.netmgt.config.views.Category unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.views.Category) Unmarshaller.unmarshal(org.opennms.netmgt.config.views.Category.class, reader);
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
