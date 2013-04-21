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
 * Class ImageSize.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class ImageSize implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _hzSize.
     */
    private org.opennms.netmgt.config.charts.HzSize _hzSize;

    /**
     * Field _vtSize.
     */
    private org.opennms.netmgt.config.charts.VtSize _vtSize;


      //----------------/
     //- Constructors -/
    //----------------/

    public ImageSize() {
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
        
        if (obj instanceof ImageSize) {
        
            ImageSize temp = (ImageSize)obj;
            if (this._hzSize != null) {
                if (temp._hzSize == null) return false;
                else if (!(this._hzSize.equals(temp._hzSize))) 
                    return false;
            }
            else if (temp._hzSize != null)
                return false;
            if (this._vtSize != null) {
                if (temp._vtSize == null) return false;
                else if (!(this._vtSize.equals(temp._vtSize))) 
                    return false;
            }
            else if (temp._vtSize != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'hzSize'.
     * 
     * @return the value of field 'HzSize'.
     */
    public org.opennms.netmgt.config.charts.HzSize getHzSize(
    ) {
        return this._hzSize;
    }

    /**
     * Returns the value of field 'vtSize'.
     * 
     * @return the value of field 'VtSize'.
     */
    public org.opennms.netmgt.config.charts.VtSize getVtSize(
    ) {
        return this._vtSize;
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
        if (_hzSize != null) {
           result = 37 * result + _hzSize.hashCode();
        }
        if (_vtSize != null) {
           result = 37 * result + _vtSize.hashCode();
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
     * Sets the value of field 'hzSize'.
     * 
     * @param hzSize the value of field 'hzSize'.
     */
    public void setHzSize(
            final org.opennms.netmgt.config.charts.HzSize hzSize) {
        this._hzSize = hzSize;
    }

    /**
     * Sets the value of field 'vtSize'.
     * 
     * @param vtSize the value of field 'vtSize'.
     */
    public void setVtSize(
            final org.opennms.netmgt.config.charts.VtSize vtSize) {
        this._vtSize = vtSize;
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
     * org.opennms.netmgt.config.charts.ImageSize
     */
    public static org.opennms.netmgt.config.charts.ImageSize unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.charts.ImageSize) Unmarshaller.unmarshal(org.opennms.netmgt.config.charts.ImageSize.class, reader);
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
