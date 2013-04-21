/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.views;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class View.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class View implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _name.
     */
    private java.lang.String _name;

    /**
     * Field _title.
     */
    private java.lang.String _title;

    /**
     * Field _comment.
     */
    private java.lang.String _comment;

    /**
     * Field _common.
     */
    private org.opennms.netmgt.config.views.Common _common;

    /**
     * Field _categories.
     */
    private org.opennms.netmgt.config.views.Categories _categories;

    /**
     * Field _membership.
     */
    private org.opennms.netmgt.config.views.Membership _membership;


      //----------------/
     //- Constructors -/
    //----------------/

    public View() {
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
        
        if (obj instanceof View) {
        
            View temp = (View)obj;
            if (this._name != null) {
                if (temp._name == null) return false;
                else if (!(this._name.equals(temp._name))) 
                    return false;
            }
            else if (temp._name != null)
                return false;
            if (this._title != null) {
                if (temp._title == null) return false;
                else if (!(this._title.equals(temp._title))) 
                    return false;
            }
            else if (temp._title != null)
                return false;
            if (this._comment != null) {
                if (temp._comment == null) return false;
                else if (!(this._comment.equals(temp._comment))) 
                    return false;
            }
            else if (temp._comment != null)
                return false;
            if (this._common != null) {
                if (temp._common == null) return false;
                else if (!(this._common.equals(temp._common))) 
                    return false;
            }
            else if (temp._common != null)
                return false;
            if (this._categories != null) {
                if (temp._categories == null) return false;
                else if (!(this._categories.equals(temp._categories))) 
                    return false;
            }
            else if (temp._categories != null)
                return false;
            if (this._membership != null) {
                if (temp._membership == null) return false;
                else if (!(this._membership.equals(temp._membership))) 
                    return false;
            }
            else if (temp._membership != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'categories'.
     * 
     * @return the value of field 'Categories'.
     */
    public org.opennms.netmgt.config.views.Categories getCategories(
    ) {
        return this._categories;
    }

    /**
     * Returns the value of field 'comment'.
     * 
     * @return the value of field 'Comment'.
     */
    public java.lang.String getComment(
    ) {
        return this._comment;
    }

    /**
     * Returns the value of field 'common'.
     * 
     * @return the value of field 'Common'.
     */
    public org.opennms.netmgt.config.views.Common getCommon(
    ) {
        return this._common;
    }

    /**
     * Returns the value of field 'membership'.
     * 
     * @return the value of field 'Membership'.
     */
    public org.opennms.netmgt.config.views.Membership getMembership(
    ) {
        return this._membership;
    }

    /**
     * Returns the value of field 'name'.
     * 
     * @return the value of field 'Name'.
     */
    public java.lang.String getName(
    ) {
        return this._name;
    }

    /**
     * Returns the value of field 'title'.
     * 
     * @return the value of field 'Title'.
     */
    public java.lang.String getTitle(
    ) {
        return this._title;
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
        if (_name != null) {
           result = 37 * result + _name.hashCode();
        }
        if (_title != null) {
           result = 37 * result + _title.hashCode();
        }
        if (_comment != null) {
           result = 37 * result + _comment.hashCode();
        }
        if (_common != null) {
           result = 37 * result + _common.hashCode();
        }
        if (_categories != null) {
           result = 37 * result + _categories.hashCode();
        }
        if (_membership != null) {
           result = 37 * result + _membership.hashCode();
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
     * Sets the value of field 'categories'.
     * 
     * @param categories the value of field 'categories'.
     */
    public void setCategories(
            final org.opennms.netmgt.config.views.Categories categories) {
        this._categories = categories;
    }

    /**
     * Sets the value of field 'comment'.
     * 
     * @param comment the value of field 'comment'.
     */
    public void setComment(
            final java.lang.String comment) {
        this._comment = comment;
    }

    /**
     * Sets the value of field 'common'.
     * 
     * @param common the value of field 'common'.
     */
    public void setCommon(
            final org.opennms.netmgt.config.views.Common common) {
        this._common = common;
    }

    /**
     * Sets the value of field 'membership'.
     * 
     * @param membership the value of field 'membership'.
     */
    public void setMembership(
            final org.opennms.netmgt.config.views.Membership membership) {
        this._membership = membership;
    }

    /**
     * Sets the value of field 'name'.
     * 
     * @param name the value of field 'name'.
     */
    public void setName(
            final java.lang.String name) {
        this._name = name;
    }

    /**
     * Sets the value of field 'title'.
     * 
     * @param title the value of field 'title'.
     */
    public void setTitle(
            final java.lang.String title) {
        this._title = title;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.opennms.netmgt.config.views.View
     */
    public static org.opennms.netmgt.config.views.View unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.views.View) Unmarshaller.unmarshal(org.opennms.netmgt.config.views.View.class, reader);
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
