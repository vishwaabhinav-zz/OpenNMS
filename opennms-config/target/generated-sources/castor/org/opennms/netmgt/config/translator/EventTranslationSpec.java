/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.translator;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * This defines the allowable translations for a given
 *  event uei
 *  
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class EventTranslationSpec implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _uei.
     */
    private java.lang.String _uei;

    /**
     * The list of event mappings for this event. The first
     *  mapping that matches the event is used to translate the
     *  event into a new event.
     *  
     */
    private org.opennms.netmgt.config.translator.Mappings _mappings;


      //----------------/
     //- Constructors -/
    //----------------/

    public EventTranslationSpec() {
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
        
        if (obj instanceof EventTranslationSpec) {
        
            EventTranslationSpec temp = (EventTranslationSpec)obj;
            if (this._uei != null) {
                if (temp._uei == null) return false;
                else if (!(this._uei.equals(temp._uei))) 
                    return false;
            }
            else if (temp._uei != null)
                return false;
            if (this._mappings != null) {
                if (temp._mappings == null) return false;
                else if (!(this._mappings.equals(temp._mappings))) 
                    return false;
            }
            else if (temp._mappings != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'mappings'. The field 'mappings'
     * has the following description: The list of event mappings
     * for this event. The first
     *  mapping that matches the event is used to translate the
     *  event into a new event.
     *  
     * 
     * @return the value of field 'Mappings'.
     */
    public org.opennms.netmgt.config.translator.Mappings getMappings(
    ) {
        return this._mappings;
    }

    /**
     * Returns the value of field 'uei'.
     * 
     * @return the value of field 'Uei'.
     */
    public java.lang.String getUei(
    ) {
        return this._uei;
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
        if (_uei != null) {
           result = 37 * result + _uei.hashCode();
        }
        if (_mappings != null) {
           result = 37 * result + _mappings.hashCode();
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
     * Sets the value of field 'mappings'. The field 'mappings' has
     * the following description: The list of event mappings for
     * this event. The first
     *  mapping that matches the event is used to translate the
     *  event into a new event.
     *  
     * 
     * @param mappings the value of field 'mappings'.
     */
    public void setMappings(
            final org.opennms.netmgt.config.translator.Mappings mappings) {
        this._mappings = mappings;
    }

    /**
     * Sets the value of field 'uei'.
     * 
     * @param uei the value of field 'uei'.
     */
    public void setUei(
            final java.lang.String uei) {
        this._uei = uei;
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
     * org.opennms.netmgt.config.translator.EventTranslationSpec
     */
    public static org.opennms.netmgt.config.translator.EventTranslationSpec unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.translator.EventTranslationSpec) Unmarshaller.unmarshal(org.opennms.netmgt.config.translator.EventTranslationSpec.class, reader);
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
