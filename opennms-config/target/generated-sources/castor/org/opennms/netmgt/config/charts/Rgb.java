/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.charts;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class Rgb.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Rgb implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _red.
     */
    private org.opennms.netmgt.config.charts.Red _red;

    /**
     * Field _green.
     */
    private org.opennms.netmgt.config.charts.Green _green;

    /**
     * Field _blue.
     */
    private org.opennms.netmgt.config.charts.Blue _blue;


      //----------------/
     //- Constructors -/
    //----------------/

    public Rgb() {
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
        
        if (obj instanceof Rgb) {
        
            Rgb temp = (Rgb)obj;
            if (this._red != null) {
                if (temp._red == null) return false;
                else if (!(this._red.equals(temp._red))) 
                    return false;
            }
            else if (temp._red != null)
                return false;
            if (this._green != null) {
                if (temp._green == null) return false;
                else if (!(this._green.equals(temp._green))) 
                    return false;
            }
            else if (temp._green != null)
                return false;
            if (this._blue != null) {
                if (temp._blue == null) return false;
                else if (!(this._blue.equals(temp._blue))) 
                    return false;
            }
            else if (temp._blue != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'blue'.
     * 
     * @return the value of field 'Blue'.
     */
    public org.opennms.netmgt.config.charts.Blue getBlue(
    ) {
        return this._blue;
    }

    /**
     * Returns the value of field 'green'.
     * 
     * @return the value of field 'Green'.
     */
    public org.opennms.netmgt.config.charts.Green getGreen(
    ) {
        return this._green;
    }

    /**
     * Returns the value of field 'red'.
     * 
     * @return the value of field 'Red'.
     */
    public org.opennms.netmgt.config.charts.Red getRed(
    ) {
        return this._red;
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
        if (_red != null) {
           result = 37 * result + _red.hashCode();
        }
        if (_green != null) {
           result = 37 * result + _green.hashCode();
        }
        if (_blue != null) {
           result = 37 * result + _blue.hashCode();
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
     * Sets the value of field 'blue'.
     * 
     * @param blue the value of field 'blue'.
     */
    public void setBlue(
            final org.opennms.netmgt.config.charts.Blue blue) {
        this._blue = blue;
    }

    /**
     * Sets the value of field 'green'.
     * 
     * @param green the value of field 'green'.
     */
    public void setGreen(
            final org.opennms.netmgt.config.charts.Green green) {
        this._green = green;
    }

    /**
     * Sets the value of field 'red'.
     * 
     * @param red the value of field 'red'.
     */
    public void setRed(
            final org.opennms.netmgt.config.charts.Red red) {
        this._red = red;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.opennms.netmgt.config.charts.Rgb
     */
    public static org.opennms.netmgt.config.charts.Rgb unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.charts.Rgb) Unmarshaller.unmarshal(org.opennms.netmgt.config.charts.Rgb.class, reader);
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
