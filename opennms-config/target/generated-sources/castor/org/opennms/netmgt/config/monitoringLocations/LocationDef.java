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
 * This element contains the name of the location, the name of the
 * monitoring
 *  area (used to aggregate locations, example: Area San Francisco,
 * location name "SFO"
 *  which becomes SFO-1 or SFO-BuildingA, etc.) Additionally, a
 * geolocation can be provided
 *  (an address or other identifying location that can be looked up
 * with a geolocation
 *  API), as well as coordinates (latitude,longitude). Finally, a
 * priority can be assigned
 *  to the location, for purposes of sorting (1 = highest, 100 =
 * lowest).
 *  The polling package name is used to associate with a polling
 * configuration found in the
 *  polling-configuration.xml file. 
 *  
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class LocationDef implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _locationName.
     */
    private java.lang.String _locationName;

    /**
     * Field _monitoringArea.
     */
    private java.lang.String _monitoringArea;

    /**
     * Field _pollingPackageName.
     */
    private java.lang.String _pollingPackageName;

    /**
     * Field _geolocation.
     */
    private java.lang.String _geolocation;

    /**
     * Field _coordinates.
     */
    private java.lang.String _coordinates;

    /**
     * Field _priority.
     */
    private long _priority = 100;

    /**
     * keeps track of state for field: _priority
     */
    private boolean _has_priority;

    /**
     * An collection of tags.
     */
    private org.opennms.netmgt.config.tags.Tags _tags;


      //----------------/
     //- Constructors -/
    //----------------/

    public LocationDef() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deletePriority(
    ) {
        this._has_priority= false;
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
        
        if (obj instanceof LocationDef) {
        
            LocationDef temp = (LocationDef)obj;
            if (this._locationName != null) {
                if (temp._locationName == null) return false;
                else if (!(this._locationName.equals(temp._locationName))) 
                    return false;
            }
            else if (temp._locationName != null)
                return false;
            if (this._monitoringArea != null) {
                if (temp._monitoringArea == null) return false;
                else if (!(this._monitoringArea.equals(temp._monitoringArea))) 
                    return false;
            }
            else if (temp._monitoringArea != null)
                return false;
            if (this._pollingPackageName != null) {
                if (temp._pollingPackageName == null) return false;
                else if (!(this._pollingPackageName.equals(temp._pollingPackageName))) 
                    return false;
            }
            else if (temp._pollingPackageName != null)
                return false;
            if (this._geolocation != null) {
                if (temp._geolocation == null) return false;
                else if (!(this._geolocation.equals(temp._geolocation))) 
                    return false;
            }
            else if (temp._geolocation != null)
                return false;
            if (this._coordinates != null) {
                if (temp._coordinates == null) return false;
                else if (!(this._coordinates.equals(temp._coordinates))) 
                    return false;
            }
            else if (temp._coordinates != null)
                return false;
            if (this._priority != temp._priority)
                return false;
            if (this._has_priority != temp._has_priority)
                return false;
            if (this._tags != null) {
                if (temp._tags == null) return false;
                else if (!(this._tags.equals(temp._tags))) 
                    return false;
            }
            else if (temp._tags != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'coordinates'.
     * 
     * @return the value of field 'Coordinates'.
     */
    public java.lang.String getCoordinates(
    ) {
        return this._coordinates;
    }

    /**
     * Returns the value of field 'geolocation'.
     * 
     * @return the value of field 'Geolocation'.
     */
    public java.lang.String getGeolocation(
    ) {
        return this._geolocation;
    }

    /**
     * Returns the value of field 'locationName'.
     * 
     * @return the value of field 'LocationName'.
     */
    public java.lang.String getLocationName(
    ) {
        return this._locationName;
    }

    /**
     * Returns the value of field 'monitoringArea'.
     * 
     * @return the value of field 'MonitoringArea'.
     */
    public java.lang.String getMonitoringArea(
    ) {
        return this._monitoringArea;
    }

    /**
     * Returns the value of field 'pollingPackageName'.
     * 
     * @return the value of field 'PollingPackageName'.
     */
    public java.lang.String getPollingPackageName(
    ) {
        return this._pollingPackageName;
    }

    /**
     * Returns the value of field 'priority'.
     * 
     * @return the value of field 'Priority'.
     */
    public long getPriority(
    ) {
        return this._priority;
    }

    /**
     * Returns the value of field 'tags'. The field 'tags' has the
     * following description: An collection of tags.
     * 
     * @return the value of field 'Tags'.
     */
    public org.opennms.netmgt.config.tags.Tags getTags(
    ) {
        return this._tags;
    }

    /**
     * Method hasPriority.
     * 
     * @return true if at least one Priority has been added
     */
    public boolean hasPriority(
    ) {
        return this._has_priority;
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
        if (_locationName != null) {
           result = 37 * result + _locationName.hashCode();
        }
        if (_monitoringArea != null) {
           result = 37 * result + _monitoringArea.hashCode();
        }
        if (_pollingPackageName != null) {
           result = 37 * result + _pollingPackageName.hashCode();
        }
        if (_geolocation != null) {
           result = 37 * result + _geolocation.hashCode();
        }
        if (_coordinates != null) {
           result = 37 * result + _coordinates.hashCode();
        }
        result = 37 * result + (int)(_priority^(_priority>>>32));
        if (_tags != null) {
           result = 37 * result + _tags.hashCode();
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
     * Sets the value of field 'coordinates'.
     * 
     * @param coordinates the value of field 'coordinates'.
     */
    public void setCoordinates(
            final java.lang.String coordinates) {
        this._coordinates = coordinates;
    }

    /**
     * Sets the value of field 'geolocation'.
     * 
     * @param geolocation the value of field 'geolocation'.
     */
    public void setGeolocation(
            final java.lang.String geolocation) {
        this._geolocation = geolocation;
    }

    /**
     * Sets the value of field 'locationName'.
     * 
     * @param locationName the value of field 'locationName'.
     */
    public void setLocationName(
            final java.lang.String locationName) {
        this._locationName = locationName;
    }

    /**
     * Sets the value of field 'monitoringArea'.
     * 
     * @param monitoringArea the value of field 'monitoringArea'.
     */
    public void setMonitoringArea(
            final java.lang.String monitoringArea) {
        this._monitoringArea = monitoringArea;
    }

    /**
     * Sets the value of field 'pollingPackageName'.
     * 
     * @param pollingPackageName the value of field
     * 'pollingPackageName'.
     */
    public void setPollingPackageName(
            final java.lang.String pollingPackageName) {
        this._pollingPackageName = pollingPackageName;
    }

    /**
     * Sets the value of field 'priority'.
     * 
     * @param priority the value of field 'priority'.
     */
    public void setPriority(
            final long priority) {
        this._priority = priority;
        this._has_priority = true;
    }

    /**
     * Sets the value of field 'tags'. The field 'tags' has the
     * following description: An collection of tags.
     * 
     * @param tags the value of field 'tags'.
     */
    public void setTags(
            final org.opennms.netmgt.config.tags.Tags tags) {
        this._tags = tags;
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
     * org.opennms.netmgt.config.monitoringLocations.LocationDef
     */
    public static org.opennms.netmgt.config.monitoringLocations.LocationDef unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.monitoringLocations.LocationDef) Unmarshaller.unmarshal(org.opennms.netmgt.config.monitoringLocations.LocationDef.class, reader);
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
