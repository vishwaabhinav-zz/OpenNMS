/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.report.availability;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * element name="viewInfo"
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class ViewInfo implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _viewName.
     */
    private java.lang.String _viewName;

    /**
     * Field _viewTitle.
     */
    private java.lang.String _viewTitle;

    /**
     * Field _viewComments.
     */
    private java.lang.String _viewComments;


      //----------------/
     //- Constructors -/
    //----------------/

    public ViewInfo() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'viewComments'.
     * 
     * @return the value of field 'ViewComments'.
     */
    public java.lang.String getViewComments(
    ) {
        return this._viewComments;
    }

    /**
     * Returns the value of field 'viewName'.
     * 
     * @return the value of field 'ViewName'.
     */
    public java.lang.String getViewName(
    ) {
        return this._viewName;
    }

    /**
     * Returns the value of field 'viewTitle'.
     * 
     * @return the value of field 'ViewTitle'.
     */
    public java.lang.String getViewTitle(
    ) {
        return this._viewTitle;
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
     * Sets the value of field 'viewComments'.
     * 
     * @param viewComments the value of field 'viewComments'.
     */
    public void setViewComments(
            final java.lang.String viewComments) {
        this._viewComments = viewComments;
    }

    /**
     * Sets the value of field 'viewName'.
     * 
     * @param viewName the value of field 'viewName'.
     */
    public void setViewName(
            final java.lang.String viewName) {
        this._viewName = viewName;
    }

    /**
     * Sets the value of field 'viewTitle'.
     * 
     * @param viewTitle the value of field 'viewTitle'.
     */
    public void setViewTitle(
            final java.lang.String viewTitle) {
        this._viewTitle = viewTitle;
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
     * org.opennms.report.availability.ViewInfo
     */
    public static org.opennms.report.availability.ViewInfo unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.report.availability.ViewInfo) Unmarshaller.unmarshal(org.opennms.report.availability.ViewInfo.class, reader);
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
