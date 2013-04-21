/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.monitoringLocations;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * The name and polling configuration for each monitoring location.
 * Note:
 *  multiple monitors can use the same monitoring location, they
 * will get assigned
 *  and ID with the name of the location prepended (example:
 * location name "SFO"
 *  instance could be "SFO-1" or "SFO-Building A" as the instance
 * is defined by
 *  the user during registration of the distributed monitor).
 *  
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Locations implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * This element contains the name of the location, the name of
     * the monitoring
     *  area (used to aggregate locations, example: Area San
     * Francisco, location name "SFO"
     *  which becomes SFO-1 or SFO-BuildingA, etc.) Additionally, a
     * geolocation can be provided
     *  (an address or other identifying location that can be
     * looked up with a geolocation
     *  API), as well as coordinates (latitude,longitude). Finally,
     * a priority can be assigned
     *  to the location, for purposes of sorting (1 = highest, 100
     * = lowest).
     *  The polling package name is used to associate with a
     * polling configuration found in the
     *  polling-configuration.xml file. 
     *  
     */
    private java.util.List<org.opennms.netmgt.config.monitoringLocations.LocationDef> _locationDefList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Locations() {
        super();
        this._locationDefList = new java.util.ArrayList<org.opennms.netmgt.config.monitoringLocations.LocationDef>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vLocationDef
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addLocationDef(
            final org.opennms.netmgt.config.monitoringLocations.LocationDef vLocationDef)
    throws java.lang.IndexOutOfBoundsException {
        this._locationDefList.add(vLocationDef);
    }

    /**
     * 
     * 
     * @param index
     * @param vLocationDef
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addLocationDef(
            final int index,
            final org.opennms.netmgt.config.monitoringLocations.LocationDef vLocationDef)
    throws java.lang.IndexOutOfBoundsException {
        this._locationDefList.add(index, vLocationDef);
    }

    /**
     * Method enumerateLocationDef.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.monitoringLocations.LocationDef> enumerateLocationDef(
    ) {
        return java.util.Collections.enumeration(this._locationDefList);
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
        
        if (obj instanceof Locations) {
        
            Locations temp = (Locations)obj;
            if (this._locationDefList != null) {
                if (temp._locationDefList == null) return false;
                else if (!(this._locationDefList.equals(temp._locationDefList))) 
                    return false;
            }
            else if (temp._locationDefList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Method getLocationDef.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.monitoringLocations.LocationDef at
     * the given index
     */
    public org.opennms.netmgt.config.monitoringLocations.LocationDef getLocationDef(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._locationDefList.size()) {
            throw new IndexOutOfBoundsException("getLocationDef: Index value '" + index + "' not in range [0.." + (this._locationDefList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.monitoringLocations.LocationDef) _locationDefList.get(index);
    }

    /**
     * Method getLocationDef.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.monitoringLocations.LocationDef[] getLocationDef(
    ) {
        org.opennms.netmgt.config.monitoringLocations.LocationDef[] array = new org.opennms.netmgt.config.monitoringLocations.LocationDef[0];
        return (org.opennms.netmgt.config.monitoringLocations.LocationDef[]) this._locationDefList.toArray(array);
    }

    /**
     * Method getLocationDefCollection.Returns a reference to
     * '_locationDefList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.monitoringLocations.LocationDef> getLocationDefCollection(
    ) {
        return this._locationDefList;
    }

    /**
     * Method getLocationDefCount.
     * 
     * @return the size of this collection
     */
    public int getLocationDefCount(
    ) {
        return this._locationDefList.size();
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
        if (_locationDefList != null) {
           result = 37 * result + _locationDefList.hashCode();
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
     * Method iterateLocationDef.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.monitoringLocations.LocationDef> iterateLocationDef(
    ) {
        return this._locationDefList.iterator();
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
    public void removeAllLocationDef(
    ) {
        this._locationDefList.clear();
    }

    /**
     * Method removeLocationDef.
     * 
     * @param vLocationDef
     * @return true if the object was removed from the collection.
     */
    public boolean removeLocationDef(
            final org.opennms.netmgt.config.monitoringLocations.LocationDef vLocationDef) {
        boolean removed = _locationDefList.remove(vLocationDef);
        return removed;
    }

    /**
     * Method removeLocationDefAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.monitoringLocations.LocationDef removeLocationDefAt(
            final int index) {
        java.lang.Object obj = this._locationDefList.remove(index);
        return (org.opennms.netmgt.config.monitoringLocations.LocationDef) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vLocationDef
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setLocationDef(
            final int index,
            final org.opennms.netmgt.config.monitoringLocations.LocationDef vLocationDef)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._locationDefList.size()) {
            throw new IndexOutOfBoundsException("setLocationDef: Index value '" + index + "' not in range [0.." + (this._locationDefList.size() - 1) + "]");
        }
        
        this._locationDefList.set(index, vLocationDef);
    }

    /**
     * 
     * 
     * @param vLocationDefArray
     */
    public void setLocationDef(
            final org.opennms.netmgt.config.monitoringLocations.LocationDef[] vLocationDefArray) {
        //-- copy array
        _locationDefList.clear();
        
        for (int i = 0; i < vLocationDefArray.length; i++) {
                this._locationDefList.add(vLocationDefArray[i]);
        }
    }

    /**
     * Sets the value of '_locationDefList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vLocationDefList the Vector to copy.
     */
    public void setLocationDef(
            final java.util.List<org.opennms.netmgt.config.monitoringLocations.LocationDef> vLocationDefList) {
        // copy vector
        this._locationDefList.clear();
        
        this._locationDefList.addAll(vLocationDefList);
    }

    /**
     * Sets the value of '_locationDefList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param locationDefList the Vector to set.
     */
    public void setLocationDefCollection(
            final java.util.List<org.opennms.netmgt.config.monitoringLocations.LocationDef> locationDefList) {
        this._locationDefList = locationDefList;
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
     * org.opennms.netmgt.config.monitoringLocations.Locations
     */
    public static org.opennms.netmgt.config.monitoringLocations.Locations unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.monitoringLocations.Locations) Unmarshaller.unmarshal(org.opennms.netmgt.config.monitoringLocations.Locations.class, reader);
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
