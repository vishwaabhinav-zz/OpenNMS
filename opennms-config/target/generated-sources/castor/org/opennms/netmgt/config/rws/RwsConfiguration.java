/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.rws;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Top-level element for the rws-configuration.xml configuration
 * file.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class RwsConfiguration implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Base Url(s) for Rancid Server.
     */
    private org.opennms.netmgt.config.rws.BaseUrl _baseUrl;

    /**
     * Stand By Url(s) for Rancid Servers.
     */
    private java.util.List<org.opennms.netmgt.config.rws.StandbyUrl> _standbyUrlList;


      //----------------/
     //- Constructors -/
    //----------------/

    public RwsConfiguration() {
        super();
        this._standbyUrlList = new java.util.ArrayList<org.opennms.netmgt.config.rws.StandbyUrl>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vStandbyUrl
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addStandbyUrl(
            final org.opennms.netmgt.config.rws.StandbyUrl vStandbyUrl)
    throws java.lang.IndexOutOfBoundsException {
        this._standbyUrlList.add(vStandbyUrl);
    }

    /**
     * 
     * 
     * @param index
     * @param vStandbyUrl
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addStandbyUrl(
            final int index,
            final org.opennms.netmgt.config.rws.StandbyUrl vStandbyUrl)
    throws java.lang.IndexOutOfBoundsException {
        this._standbyUrlList.add(index, vStandbyUrl);
    }

    /**
     * Method enumerateStandbyUrl.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.rws.StandbyUrl> enumerateStandbyUrl(
    ) {
        return java.util.Collections.enumeration(this._standbyUrlList);
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
        
        if (obj instanceof RwsConfiguration) {
        
            RwsConfiguration temp = (RwsConfiguration)obj;
            if (this._baseUrl != null) {
                if (temp._baseUrl == null) return false;
                else if (!(this._baseUrl.equals(temp._baseUrl))) 
                    return false;
            }
            else if (temp._baseUrl != null)
                return false;
            if (this._standbyUrlList != null) {
                if (temp._standbyUrlList == null) return false;
                else if (!(this._standbyUrlList.equals(temp._standbyUrlList))) 
                    return false;
            }
            else if (temp._standbyUrlList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'baseUrl'. The field 'baseUrl'
     * has the following description: Base Url(s) for Rancid
     * Server.
     * 
     * @return the value of field 'BaseUrl'.
     */
    public org.opennms.netmgt.config.rws.BaseUrl getBaseUrl(
    ) {
        return this._baseUrl;
    }

    /**
     * Method getStandbyUrl.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.rws.StandbyUrl at the given index
     */
    public org.opennms.netmgt.config.rws.StandbyUrl getStandbyUrl(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._standbyUrlList.size()) {
            throw new IndexOutOfBoundsException("getStandbyUrl: Index value '" + index + "' not in range [0.." + (this._standbyUrlList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.rws.StandbyUrl) _standbyUrlList.get(index);
    }

    /**
     * Method getStandbyUrl.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.rws.StandbyUrl[] getStandbyUrl(
    ) {
        org.opennms.netmgt.config.rws.StandbyUrl[] array = new org.opennms.netmgt.config.rws.StandbyUrl[0];
        return (org.opennms.netmgt.config.rws.StandbyUrl[]) this._standbyUrlList.toArray(array);
    }

    /**
     * Method getStandbyUrlCollection.Returns a reference to
     * '_standbyUrlList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.rws.StandbyUrl> getStandbyUrlCollection(
    ) {
        return this._standbyUrlList;
    }

    /**
     * Method getStandbyUrlCount.
     * 
     * @return the size of this collection
     */
    public int getStandbyUrlCount(
    ) {
        return this._standbyUrlList.size();
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
        if (_baseUrl != null) {
           result = 37 * result + _baseUrl.hashCode();
        }
        if (_standbyUrlList != null) {
           result = 37 * result + _standbyUrlList.hashCode();
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
     * Method iterateStandbyUrl.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.rws.StandbyUrl> iterateStandbyUrl(
    ) {
        return this._standbyUrlList.iterator();
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
    public void removeAllStandbyUrl(
    ) {
        this._standbyUrlList.clear();
    }

    /**
     * Method removeStandbyUrl.
     * 
     * @param vStandbyUrl
     * @return true if the object was removed from the collection.
     */
    public boolean removeStandbyUrl(
            final org.opennms.netmgt.config.rws.StandbyUrl vStandbyUrl) {
        boolean removed = _standbyUrlList.remove(vStandbyUrl);
        return removed;
    }

    /**
     * Method removeStandbyUrlAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.rws.StandbyUrl removeStandbyUrlAt(
            final int index) {
        java.lang.Object obj = this._standbyUrlList.remove(index);
        return (org.opennms.netmgt.config.rws.StandbyUrl) obj;
    }

    /**
     * Sets the value of field 'baseUrl'. The field 'baseUrl' has
     * the following description: Base Url(s) for Rancid Server.
     * 
     * @param baseUrl the value of field 'baseUrl'.
     */
    public void setBaseUrl(
            final org.opennms.netmgt.config.rws.BaseUrl baseUrl) {
        this._baseUrl = baseUrl;
    }

    /**
     * 
     * 
     * @param index
     * @param vStandbyUrl
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setStandbyUrl(
            final int index,
            final org.opennms.netmgt.config.rws.StandbyUrl vStandbyUrl)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._standbyUrlList.size()) {
            throw new IndexOutOfBoundsException("setStandbyUrl: Index value '" + index + "' not in range [0.." + (this._standbyUrlList.size() - 1) + "]");
        }
        
        this._standbyUrlList.set(index, vStandbyUrl);
    }

    /**
     * 
     * 
     * @param vStandbyUrlArray
     */
    public void setStandbyUrl(
            final org.opennms.netmgt.config.rws.StandbyUrl[] vStandbyUrlArray) {
        //-- copy array
        _standbyUrlList.clear();
        
        for (int i = 0; i < vStandbyUrlArray.length; i++) {
                this._standbyUrlList.add(vStandbyUrlArray[i]);
        }
    }

    /**
     * Sets the value of '_standbyUrlList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vStandbyUrlList the Vector to copy.
     */
    public void setStandbyUrl(
            final java.util.List<org.opennms.netmgt.config.rws.StandbyUrl> vStandbyUrlList) {
        // copy vector
        this._standbyUrlList.clear();
        
        this._standbyUrlList.addAll(vStandbyUrlList);
    }

    /**
     * Sets the value of '_standbyUrlList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param standbyUrlList the Vector to set.
     */
    public void setStandbyUrlCollection(
            final java.util.List<org.opennms.netmgt.config.rws.StandbyUrl> standbyUrlList) {
        this._standbyUrlList = standbyUrlList;
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
     * org.opennms.netmgt.config.rws.RwsConfiguration
     */
    public static org.opennms.netmgt.config.rws.RwsConfiguration unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.rws.RwsConfiguration) Unmarshaller.unmarshal(org.opennms.netmgt.config.rws.RwsConfiguration.class, reader);
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
