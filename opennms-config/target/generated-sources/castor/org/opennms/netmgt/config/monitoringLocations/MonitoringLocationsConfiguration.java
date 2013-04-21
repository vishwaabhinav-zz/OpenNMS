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
 * Top-level element for configuration remote monitoring locations.
 *  
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class MonitoringLocationsConfiguration implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The name and polling configuration for each monitoring
     * location. Note:
     *  multiple monitors can use the same monitoring location,
     * they will get assigned
     *  and ID with the name of the location prepended (example:
     * location name "SFO"
     *  instance could be "SFO-1" or "SFO-Building A" as the
     * instance is defined by
     *  the user during registration of the distributed monitor).
     *  
     */
    private org.opennms.netmgt.config.monitoringLocations.Locations _locations;


      //----------------/
     //- Constructors -/
    //----------------/

    public MonitoringLocationsConfiguration() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

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
        
        if (obj instanceof MonitoringLocationsConfiguration) {
        
            MonitoringLocationsConfiguration temp = (MonitoringLocationsConfiguration)obj;
            if (this._locations != null) {
                if (temp._locations == null) return false;
                else if (!(this._locations.equals(temp._locations))) 
                    return false;
            }
            else if (temp._locations != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'locations'. The field
     * 'locations' has the following description: The name and
     * polling configuration for each monitoring location. Note:
     *  multiple monitors can use the same monitoring location,
     * they will get assigned
     *  and ID with the name of the location prepended (example:
     * location name "SFO"
     *  instance could be "SFO-1" or "SFO-Building A" as the
     * instance is defined by
     *  the user during registration of the distributed monitor).
     *  
     * 
     * @return the value of field 'Locations'.
     */
    public org.opennms.netmgt.config.monitoringLocations.Locations getLocations(
    ) {
        return this._locations;
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
        if (_locations != null) {
           result = 37 * result + _locations.hashCode();
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
     * Sets the value of field 'locations'. The field 'locations'
     * has the following description: The name and polling
     * configuration for each monitoring location. Note:
     *  multiple monitors can use the same monitoring location,
     * they will get assigned
     *  and ID with the name of the location prepended (example:
     * location name "SFO"
     *  instance could be "SFO-1" or "SFO-Building A" as the
     * instance is defined by
     *  the user during registration of the distributed monitor).
     *  
     * 
     * @param locations the value of field 'locations'.
     */
    public void setLocations(
            final org.opennms.netmgt.config.monitoringLocations.Locations locations) {
        this._locations = locations;
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
     * org.opennms.netmgt.config.monitoringLocations.MonitoringLocationsConfiguration
     */
    public static org.opennms.netmgt.config.monitoringLocations.MonitoringLocationsConfiguration unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.monitoringLocations.MonitoringLocationsConfiguration) Unmarshaller.unmarshal(org.opennms.netmgt.config.monitoringLocations.MonitoringLocationsConfiguration.class, reader);
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
