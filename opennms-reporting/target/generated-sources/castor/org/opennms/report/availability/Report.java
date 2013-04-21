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
 * The top-level element for availability
 *  reports.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Report implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _logo.
     */
    private java.lang.String _logo;

    /**
     * Field _created.
     */
    private org.opennms.report.availability.Created _created;

    /**
     * Field _author.
     */
    private java.lang.String _author;

    /**
     * element name="viewInfo"
     */
    private org.opennms.report.availability.ViewInfo _viewInfo;

    /**
     * Field _categories.
     */
    private org.opennms.report.availability.Categories _categories;

    /**
     * Field _catCount.
     */
    private int _catCount;

    /**
     * keeps track of state for field: _catCount
     */
    private boolean _has_catCount;

    /**
     * Field _sectionCount.
     */
    private int _sectionCount;

    /**
     * keeps track of state for field: _sectionCount
     */
    private boolean _has_sectionCount;


      //----------------/
     //- Constructors -/
    //----------------/

    public Report() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteCatCount(
    ) {
        this._has_catCount= false;
    }

    /**
     */
    public void deleteSectionCount(
    ) {
        this._has_sectionCount= false;
    }

    /**
     * Returns the value of field 'author'.
     * 
     * @return the value of field 'Author'.
     */
    public java.lang.String getAuthor(
    ) {
        return this._author;
    }

    /**
     * Returns the value of field 'catCount'.
     * 
     * @return the value of field 'CatCount'.
     */
    public int getCatCount(
    ) {
        return this._catCount;
    }

    /**
     * Returns the value of field 'categories'.
     * 
     * @return the value of field 'Categories'.
     */
    public org.opennms.report.availability.Categories getCategories(
    ) {
        return this._categories;
    }

    /**
     * Returns the value of field 'created'.
     * 
     * @return the value of field 'Created'.
     */
    public org.opennms.report.availability.Created getCreated(
    ) {
        return this._created;
    }

    /**
     * Returns the value of field 'logo'.
     * 
     * @return the value of field 'Logo'.
     */
    public java.lang.String getLogo(
    ) {
        return this._logo;
    }

    /**
     * Returns the value of field 'sectionCount'.
     * 
     * @return the value of field 'SectionCount'.
     */
    public int getSectionCount(
    ) {
        return this._sectionCount;
    }

    /**
     * Returns the value of field 'viewInfo'. The field 'viewInfo'
     * has the following description: element name="viewInfo"
     * 
     * @return the value of field 'ViewInfo'.
     */
    public org.opennms.report.availability.ViewInfo getViewInfo(
    ) {
        return this._viewInfo;
    }

    /**
     * Method hasCatCount.
     * 
     * @return true if at least one CatCount has been added
     */
    public boolean hasCatCount(
    ) {
        return this._has_catCount;
    }

    /**
     * Method hasSectionCount.
     * 
     * @return true if at least one SectionCount has been added
     */
    public boolean hasSectionCount(
    ) {
        return this._has_sectionCount;
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
     * Sets the value of field 'author'.
     * 
     * @param author the value of field 'author'.
     */
    public void setAuthor(
            final java.lang.String author) {
        this._author = author;
    }

    /**
     * Sets the value of field 'catCount'.
     * 
     * @param catCount the value of field 'catCount'.
     */
    public void setCatCount(
            final int catCount) {
        this._catCount = catCount;
        this._has_catCount = true;
    }

    /**
     * Sets the value of field 'categories'.
     * 
     * @param categories the value of field 'categories'.
     */
    public void setCategories(
            final org.opennms.report.availability.Categories categories) {
        this._categories = categories;
    }

    /**
     * Sets the value of field 'created'.
     * 
     * @param created the value of field 'created'.
     */
    public void setCreated(
            final org.opennms.report.availability.Created created) {
        this._created = created;
    }

    /**
     * Sets the value of field 'logo'.
     * 
     * @param logo the value of field 'logo'.
     */
    public void setLogo(
            final java.lang.String logo) {
        this._logo = logo;
    }

    /**
     * Sets the value of field 'sectionCount'.
     * 
     * @param sectionCount the value of field 'sectionCount'.
     */
    public void setSectionCount(
            final int sectionCount) {
        this._sectionCount = sectionCount;
        this._has_sectionCount = true;
    }

    /**
     * Sets the value of field 'viewInfo'. The field 'viewInfo' has
     * the following description: element name="viewInfo"
     * 
     * @param viewInfo the value of field 'viewInfo'.
     */
    public void setViewInfo(
            final org.opennms.report.availability.ViewInfo viewInfo) {
        this._viewInfo = viewInfo;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.opennms.report.availability.Repor
     */
    public static org.opennms.report.availability.Report unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.report.availability.Report) Unmarshaller.unmarshal(org.opennms.report.availability.Report.class, reader);
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
