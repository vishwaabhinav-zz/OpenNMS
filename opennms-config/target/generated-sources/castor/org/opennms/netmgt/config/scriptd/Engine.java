/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.scriptd;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class Engine.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Engine implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _language.
     */
    private java.lang.String _language;

    /**
     * Field _className.
     */
    private java.lang.String _className;

    /**
     * Field _extensions.
     */
    private java.lang.String _extensions;


      //----------------/
     //- Constructors -/
    //----------------/

    public Engine() {
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
        
        if (obj instanceof Engine) {
        
            Engine temp = (Engine)obj;
            if (this._language != null) {
                if (temp._language == null) return false;
                else if (!(this._language.equals(temp._language))) 
                    return false;
            }
            else if (temp._language != null)
                return false;
            if (this._className != null) {
                if (temp._className == null) return false;
                else if (!(this._className.equals(temp._className))) 
                    return false;
            }
            else if (temp._className != null)
                return false;
            if (this._extensions != null) {
                if (temp._extensions == null) return false;
                else if (!(this._extensions.equals(temp._extensions))) 
                    return false;
            }
            else if (temp._extensions != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'className'.
     * 
     * @return the value of field 'ClassName'.
     */
    public java.lang.String getClassName(
    ) {
        return this._className;
    }

    /**
     * Returns the value of field 'extensions'.
     * 
     * @return the value of field 'Extensions'.
     */
    public java.lang.String getExtensions(
    ) {
        return this._extensions;
    }

    /**
     * Returns the value of field 'language'.
     * 
     * @return the value of field 'Language'.
     */
    public java.lang.String getLanguage(
    ) {
        return this._language;
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
        if (_language != null) {
           result = 37 * result + _language.hashCode();
        }
        if (_className != null) {
           result = 37 * result + _className.hashCode();
        }
        if (_extensions != null) {
           result = 37 * result + _extensions.hashCode();
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
     * Sets the value of field 'className'.
     * 
     * @param className the value of field 'className'.
     */
    public void setClassName(
            final java.lang.String className) {
        this._className = className;
    }

    /**
     * Sets the value of field 'extensions'.
     * 
     * @param extensions the value of field 'extensions'.
     */
    public void setExtensions(
            final java.lang.String extensions) {
        this._extensions = extensions;
    }

    /**
     * Sets the value of field 'language'.
     * 
     * @param language the value of field 'language'.
     */
    public void setLanguage(
            final java.lang.String language) {
        this._language = language;
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
     * org.opennms.netmgt.config.scriptd.Engine
     */
    public static org.opennms.netmgt.config.scriptd.Engine unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.scriptd.Engine) Unmarshaller.unmarshal(org.opennms.netmgt.config.scriptd.Engine.class, reader);
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
