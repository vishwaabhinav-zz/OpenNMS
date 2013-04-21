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
 * Class EventTranslatorConfiguration.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class EventTranslatorConfiguration implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * List of OpenNMS events for which the Event Translator 
     *  will subscribe for translation.
     *  
     */
    private org.opennms.netmgt.config.translator.Translation _translation;


      //----------------/
     //- Constructors -/
    //----------------/

    public EventTranslatorConfiguration() {
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
        
        if (obj instanceof EventTranslatorConfiguration) {
        
            EventTranslatorConfiguration temp = (EventTranslatorConfiguration)obj;
            if (this._translation != null) {
                if (temp._translation == null) return false;
                else if (!(this._translation.equals(temp._translation))) 
                    return false;
            }
            else if (temp._translation != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'translation'. The field
     * 'translation' has the following description: List of OpenNMS
     * events for which the Event Translator 
     *  will subscribe for translation.
     *  
     * 
     * @return the value of field 'Translation'.
     */
    public org.opennms.netmgt.config.translator.Translation getTranslation(
    ) {
        return this._translation;
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
        if (_translation != null) {
           result = 37 * result + _translation.hashCode();
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
     * Sets the value of field 'translation'. The field
     * 'translation' has the following description: List of OpenNMS
     * events for which the Event Translator 
     *  will subscribe for translation.
     *  
     * 
     * @param translation the value of field 'translation'.
     */
    public void setTranslation(
            final org.opennms.netmgt.config.translator.Translation translation) {
        this._translation = translation;
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
     * org.opennms.netmgt.config.translator.EventTranslatorConfiguration
     */
    public static org.opennms.netmgt.config.translator.EventTranslatorConfiguration unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.translator.EventTranslatorConfiguration) Unmarshaller.unmarshal(org.opennms.netmgt.config.translator.EventTranslatorConfiguration.class, reader);
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
