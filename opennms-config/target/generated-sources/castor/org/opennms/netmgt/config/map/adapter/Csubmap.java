/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.map.adapter;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class Csubmap.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Csubmap implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The Name of the submap to add.
     *  This map must exist.
     *  
     */
    private java.lang.String _name;

    /**
     * The Label of the submap
     *  
     */
    private java.lang.String _label;

    /**
     * The icon of the submap to add
     *  
     */
    private java.lang.String _icon = "map";

    /**
     * The x coordinate position of the element
     *  
     */
    private int _x;

    /**
     * keeps track of state for field: _x
     */
    private boolean _has_x;

    /**
     * The y coordinate position of the element
     *  
     */
    private int _y;

    /**
     * keeps track of state for field: _y
     */
    private boolean _has_y;

    /**
     * Whether MapsAdapter should add the submap if it has no
     * elements.
     *  
     */
    private boolean _addwithoutelements = true;

    /**
     * keeps track of state for field: _addwithoutelements
     */
    private boolean _has_addwithoutelements;


      //----------------/
     //- Constructors -/
    //----------------/

    public Csubmap() {
        super();
        setIcon("map");
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteAddwithoutelements(
    ) {
        this._has_addwithoutelements= false;
    }

    /**
     */
    public void deleteX(
    ) {
        this._has_x= false;
    }

    /**
     */
    public void deleteY(
    ) {
        this._has_y= false;
    }

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
        
        if (obj instanceof Csubmap) {
        
            Csubmap temp = (Csubmap)obj;
            if (this._name != null) {
                if (temp._name == null) return false;
                else if (!(this._name.equals(temp._name))) 
                    return false;
            }
            else if (temp._name != null)
                return false;
            if (this._label != null) {
                if (temp._label == null) return false;
                else if (!(this._label.equals(temp._label))) 
                    return false;
            }
            else if (temp._label != null)
                return false;
            if (this._icon != null) {
                if (temp._icon == null) return false;
                else if (!(this._icon.equals(temp._icon))) 
                    return false;
            }
            else if (temp._icon != null)
                return false;
            if (this._x != temp._x)
                return false;
            if (this._has_x != temp._has_x)
                return false;
            if (this._y != temp._y)
                return false;
            if (this._has_y != temp._has_y)
                return false;
            if (this._addwithoutelements != temp._addwithoutelements)
                return false;
            if (this._has_addwithoutelements != temp._has_addwithoutelements)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'addwithoutelements'. The field
     * 'addwithoutelements' has the following description: Whether
     * MapsAdapter should add the submap if it has no elements.
     *  
     * 
     * @return the value of field 'Addwithoutelements'.
     */
    public boolean getAddwithoutelements(
    ) {
        return this._addwithoutelements;
    }

    /**
     * Returns the value of field 'icon'. The field 'icon' has the
     * following description: The icon of the submap to add
     *  
     * 
     * @return the value of field 'Icon'.
     */
    public java.lang.String getIcon(
    ) {
        return this._icon;
    }

    /**
     * Returns the value of field 'label'. The field 'label' has
     * the following description: The Label of the submap
     *  
     * 
     * @return the value of field 'Label'.
     */
    public java.lang.String getLabel(
    ) {
        return this._label;
    }

    /**
     * Returns the value of field 'name'. The field 'name' has the
     * following description: The Name of the submap to add.
     *  This map must exist.
     *  
     * 
     * @return the value of field 'Name'.
     */
    public java.lang.String getName(
    ) {
        return this._name;
    }

    /**
     * Returns the value of field 'x'. The field 'x' has the
     * following description: The x coordinate position of the
     * element
     *  
     * 
     * @return the value of field 'X'.
     */
    public int getX(
    ) {
        return this._x;
    }

    /**
     * Returns the value of field 'y'. The field 'y' has the
     * following description: The y coordinate position of the
     * element
     *  
     * 
     * @return the value of field 'Y'.
     */
    public int getY(
    ) {
        return this._y;
    }

    /**
     * Method hasAddwithoutelements.
     * 
     * @return true if at least one Addwithoutelements has been adde
     */
    public boolean hasAddwithoutelements(
    ) {
        return this._has_addwithoutelements;
    }

    /**
     * Method hasX.
     * 
     * @return true if at least one X has been added
     */
    public boolean hasX(
    ) {
        return this._has_x;
    }

    /**
     * Method hasY.
     * 
     * @return true if at least one Y has been added
     */
    public boolean hasY(
    ) {
        return this._has_y;
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
        if (_label != null) {
           result = 37 * result + _label.hashCode();
        }
        if (_icon != null) {
           result = 37 * result + _icon.hashCode();
        }
        result = 37 * result + _x;
        result = 37 * result + _y;
        result = 37 * result + (_addwithoutelements?0:1);
        
        return result;
    }

    /**
     * Returns the value of field 'addwithoutelements'. The field
     * 'addwithoutelements' has the following description: Whether
     * MapsAdapter should add the submap if it has no elements.
     *  
     * 
     * @return the value of field 'Addwithoutelements'.
     */
    public boolean isAddwithoutelements(
    ) {
        return this._addwithoutelements;
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
     * Sets the value of field 'addwithoutelements'. The field
     * 'addwithoutelements' has the following description: Whether
     * MapsAdapter should add the submap if it has no elements.
     *  
     * 
     * @param addwithoutelements the value of field
     * 'addwithoutelements'.
     */
    public void setAddwithoutelements(
            final boolean addwithoutelements) {
        this._addwithoutelements = addwithoutelements;
        this._has_addwithoutelements = true;
    }

    /**
     * Sets the value of field 'icon'. The field 'icon' has the
     * following description: The icon of the submap to add
     *  
     * 
     * @param icon the value of field 'icon'.
     */
    public void setIcon(
            final java.lang.String icon) {
        this._icon = icon;
    }

    /**
     * Sets the value of field 'label'. The field 'label' has the
     * following description: The Label of the submap
     *  
     * 
     * @param label the value of field 'label'.
     */
    public void setLabel(
            final java.lang.String label) {
        this._label = label;
    }

    /**
     * Sets the value of field 'name'. The field 'name' has the
     * following description: The Name of the submap to add.
     *  This map must exist.
     *  
     * 
     * @param name the value of field 'name'.
     */
    public void setName(
            final java.lang.String name) {
        this._name = name;
    }

    /**
     * Sets the value of field 'x'. The field 'x' has the following
     * description: The x coordinate position of the element
     *  
     * 
     * @param x the value of field 'x'.
     */
    public void setX(
            final int x) {
        this._x = x;
        this._has_x = true;
    }

    /**
     * Sets the value of field 'y'. The field 'y' has the following
     * description: The y coordinate position of the element
     *  
     * 
     * @param y the value of field 'y'.
     */
    public void setY(
            final int y) {
        this._y = y;
        this._has_y = true;
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
     * org.opennms.netmgt.config.map.adapter.Csubmap
     */
    public static org.opennms.netmgt.config.map.adapter.Csubmap unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.map.adapter.Csubmap) Unmarshaller.unmarshal(org.opennms.netmgt.config.map.adapter.Csubmap.class, reader);
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
