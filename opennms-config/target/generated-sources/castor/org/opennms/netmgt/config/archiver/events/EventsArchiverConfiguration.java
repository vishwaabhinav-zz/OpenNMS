/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.archiver.events;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * The top-level element for the
 *  events-archiver-configuration.xml configuration file. 
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class EventsArchiverConfiguration implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Archive age. Events older than current time minus
     *  this time are removed (is typically in days, hours, minutes
     * although
     *  seconds, milliseconds and microseconds are also
     *  supported).
     */
    private java.lang.String _archiveAge;

    /**
     * Separator used in between event table column values
     *  when an event is written to the archive file.
     */
    private java.lang.String _separator = "#";


      //----------------/
     //- Constructors -/
    //----------------/

    public EventsArchiverConfiguration() {
        super();
        setSeparator("#");
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
        
        if (obj instanceof EventsArchiverConfiguration) {
        
            EventsArchiverConfiguration temp = (EventsArchiverConfiguration)obj;
            if (this._archiveAge != null) {
                if (temp._archiveAge == null) return false;
                else if (!(this._archiveAge.equals(temp._archiveAge))) 
                    return false;
            }
            else if (temp._archiveAge != null)
                return false;
            if (this._separator != null) {
                if (temp._separator == null) return false;
                else if (!(this._separator.equals(temp._separator))) 
                    return false;
            }
            else if (temp._separator != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'archiveAge'. The field
     * 'archiveAge' has the following description: Archive age.
     * Events older than current time minus
     *  this time are removed (is typically in days, hours, minutes
     * although
     *  seconds, milliseconds and microseconds are also
     *  supported).
     * 
     * @return the value of field 'ArchiveAge'.
     */
    public java.lang.String getArchiveAge(
    ) {
        return this._archiveAge;
    }

    /**
     * Returns the value of field 'separator'. The field
     * 'separator' has the following description: Separator used in
     * between event table column values
     *  when an event is written to the archive file.
     * 
     * @return the value of field 'Separator'.
     */
    public java.lang.String getSeparator(
    ) {
        return this._separator;
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
        if (_archiveAge != null) {
           result = 37 * result + _archiveAge.hashCode();
        }
        if (_separator != null) {
           result = 37 * result + _separator.hashCode();
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
     * Sets the value of field 'archiveAge'. The field 'archiveAge'
     * has the following description: Archive age. Events older
     * than current time minus
     *  this time are removed (is typically in days, hours, minutes
     * although
     *  seconds, milliseconds and microseconds are also
     *  supported).
     * 
     * @param archiveAge the value of field 'archiveAge'.
     */
    public void setArchiveAge(
            final java.lang.String archiveAge) {
        this._archiveAge = archiveAge;
    }

    /**
     * Sets the value of field 'separator'. The field 'separator'
     * has the following description: Separator used in between
     * event table column values
     *  when an event is written to the archive file.
     * 
     * @param separator the value of field 'separator'.
     */
    public void setSeparator(
            final java.lang.String separator) {
        this._separator = separator;
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
     * org.opennms.netmgt.config.archiver.events.EventsArchiverConfiguration
     */
    public static org.opennms.netmgt.config.archiver.events.EventsArchiverConfiguration unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.archiver.events.EventsArchiverConfiguration) Unmarshaller.unmarshal(org.opennms.netmgt.config.archiver.events.EventsArchiverConfiguration.class, reader);
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
