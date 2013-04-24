/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.threshd;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Threshold definition
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Threshold extends org.opennms.netmgt.config.threshd.Basethresholddef 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * RRD datasource name. Mutually exclusive with expression,
     *  but one of them must be specified
     *  
     */
    private java.lang.String _dsName;


      //----------------/
     //- Constructors -/
    //----------------/

    public Threshold() {
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
        
        if (super.equals(obj)==false)
            return false;
        
        if (obj instanceof Threshold) {
        
            Threshold temp = (Threshold)obj;
            if (this._dsName != null) {
                if (temp._dsName == null) return false;
                else if (!(this._dsName.equals(temp._dsName))) 
                    return false;
            }
            else if (temp._dsName != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'dsName'. The field 'dsName' has
     * the following description: RRD datasource name. Mutually
     * exclusive with expression,
     *  but one of them must be specified
     *  
     * 
     * @return the value of field 'DsName'.
     */
    public java.lang.String getDsName(
    ) {
        return this._dsName;
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
        if (_dsName != null) {
           result = 37 * result + _dsName.hashCode();
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
     * Sets the value of field 'dsName'. The field 'dsName' has the
     * following description: RRD datasource name. Mutually
     * exclusive with expression,
     *  but one of them must be specified
     *  
     * 
     * @param dsName the value of field 'dsName'.
     */
    public void setDsName(
            final java.lang.String dsName) {
        this._dsName = dsName;
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
     * org.opennms.netmgt.config.threshd.Basethresholddef
     */
    public static org.opennms.netmgt.config.threshd.Basethresholddef unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.threshd.Basethresholddef) Unmarshaller.unmarshal(org.opennms.netmgt.config.threshd.Threshold.class, reader);
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
