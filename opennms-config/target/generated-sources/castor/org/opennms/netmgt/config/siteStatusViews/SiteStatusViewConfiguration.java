/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.siteStatusViews;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Level element containing surveillance view definitions
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class SiteStatusViewConfiguration implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _defaultView.
     */
    private java.lang.String _defaultView = "default";

    /**
     * Field _views.
     */
    private org.opennms.netmgt.config.siteStatusViews.Views _views;


      //----------------/
     //- Constructors -/
    //----------------/

    public SiteStatusViewConfiguration() {
        super();
        setDefaultView("default");
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
        
        if (obj instanceof SiteStatusViewConfiguration) {
        
            SiteStatusViewConfiguration temp = (SiteStatusViewConfiguration)obj;
            if (this._defaultView != null) {
                if (temp._defaultView == null) return false;
                else if (!(this._defaultView.equals(temp._defaultView))) 
                    return false;
            }
            else if (temp._defaultView != null)
                return false;
            if (this._views != null) {
                if (temp._views == null) return false;
                else if (!(this._views.equals(temp._views))) 
                    return false;
            }
            else if (temp._views != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'defaultView'.
     * 
     * @return the value of field 'DefaultView'.
     */
    public java.lang.String getDefaultView(
    ) {
        return this._defaultView;
    }

    /**
     * Returns the value of field 'views'.
     * 
     * @return the value of field 'Views'.
     */
    public org.opennms.netmgt.config.siteStatusViews.Views getViews(
    ) {
        return this._views;
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
        if (_defaultView != null) {
           result = 37 * result + _defaultView.hashCode();
        }
        if (_views != null) {
           result = 37 * result + _views.hashCode();
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
     * Sets the value of field 'defaultView'.
     * 
     * @param defaultView the value of field 'defaultView'.
     */
    public void setDefaultView(
            final java.lang.String defaultView) {
        this._defaultView = defaultView;
    }

    /**
     * Sets the value of field 'views'.
     * 
     * @param views the value of field 'views'.
     */
    public void setViews(
            final org.opennms.netmgt.config.siteStatusViews.Views views) {
        this._views = views;
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
     * org.opennms.netmgt.config.siteStatusViews.SiteStatusViewConfiguration
     */
    public static org.opennms.netmgt.config.siteStatusViews.SiteStatusViewConfiguration unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.siteStatusViews.SiteStatusViewConfiguration) Unmarshaller.unmarshal(org.opennms.netmgt.config.siteStatusViews.SiteStatusViewConfiguration.class, reader);
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
