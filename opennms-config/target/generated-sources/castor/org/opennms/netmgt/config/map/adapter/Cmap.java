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
 * This represents a map in the opennms system.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Cmap implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The Name of the map
     *  
     */
    private java.lang.String _mapName;

    /**
     * The Owner of the map
     *  
     */
    private java.lang.String _mapOwner;

    /**
     * The Group of the map
     *  
     */
    private java.lang.String _mapGroup;

    /**
     * The Access scheme of the map
     *  
     */
    private java.lang.String _mapAccess;

    /**
     * The Background of the map
     *  
     */
    private java.lang.String _mapBG = "ffffff";

    /**
     * The map width
     *  
     */
    private int _mapWidth;

    /**
     * keeps track of state for field: _mapWidth
     */
    private boolean _has_mapWidth;

    /**
     * The map height
     *  
     */
    private int _mapHeight;

    /**
     * keeps track of state for field: _mapHeight
     */
    private boolean _has_mapHeight;

    /**
     * A Rule for adding elements to the map automatically
     */
    private java.util.List<org.opennms.netmgt.config.map.adapter.Celement> _celementList;

    /**
     * Field _csubmapList.
     */
    private java.util.List<org.opennms.netmgt.config.map.adapter.Csubmap> _csubmapList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Cmap() {
        super();
        setMapBG("ffffff");
        this._celementList = new java.util.ArrayList<org.opennms.netmgt.config.map.adapter.Celement>();
        this._csubmapList = new java.util.ArrayList<org.opennms.netmgt.config.map.adapter.Csubmap>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vCelement
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addCelement(
            final org.opennms.netmgt.config.map.adapter.Celement vCelement)
    throws java.lang.IndexOutOfBoundsException {
        this._celementList.add(vCelement);
    }

    /**
     * 
     * 
     * @param index
     * @param vCelement
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addCelement(
            final int index,
            final org.opennms.netmgt.config.map.adapter.Celement vCelement)
    throws java.lang.IndexOutOfBoundsException {
        this._celementList.add(index, vCelement);
    }

    /**
     * 
     * 
     * @param vCsubmap
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addCsubmap(
            final org.opennms.netmgt.config.map.adapter.Csubmap vCsubmap)
    throws java.lang.IndexOutOfBoundsException {
        this._csubmapList.add(vCsubmap);
    }

    /**
     * 
     * 
     * @param index
     * @param vCsubmap
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addCsubmap(
            final int index,
            final org.opennms.netmgt.config.map.adapter.Csubmap vCsubmap)
    throws java.lang.IndexOutOfBoundsException {
        this._csubmapList.add(index, vCsubmap);
    }

    /**
     */
    public void deleteMapHeight(
    ) {
        this._has_mapHeight= false;
    }

    /**
     */
    public void deleteMapWidth(
    ) {
        this._has_mapWidth= false;
    }

    /**
     * Method enumerateCelement.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.map.adapter.Celement> enumerateCelement(
    ) {
        return java.util.Collections.enumeration(this._celementList);
    }

    /**
     * Method enumerateCsubmap.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.map.adapter.Csubmap> enumerateCsubmap(
    ) {
        return java.util.Collections.enumeration(this._csubmapList);
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
        
        if (obj instanceof Cmap) {
        
            Cmap temp = (Cmap)obj;
            if (this._mapName != null) {
                if (temp._mapName == null) return false;
                else if (!(this._mapName.equals(temp._mapName))) 
                    return false;
            }
            else if (temp._mapName != null)
                return false;
            if (this._mapOwner != null) {
                if (temp._mapOwner == null) return false;
                else if (!(this._mapOwner.equals(temp._mapOwner))) 
                    return false;
            }
            else if (temp._mapOwner != null)
                return false;
            if (this._mapGroup != null) {
                if (temp._mapGroup == null) return false;
                else if (!(this._mapGroup.equals(temp._mapGroup))) 
                    return false;
            }
            else if (temp._mapGroup != null)
                return false;
            if (this._mapAccess != null) {
                if (temp._mapAccess == null) return false;
                else if (!(this._mapAccess.equals(temp._mapAccess))) 
                    return false;
            }
            else if (temp._mapAccess != null)
                return false;
            if (this._mapBG != null) {
                if (temp._mapBG == null) return false;
                else if (!(this._mapBG.equals(temp._mapBG))) 
                    return false;
            }
            else if (temp._mapBG != null)
                return false;
            if (this._mapWidth != temp._mapWidth)
                return false;
            if (this._has_mapWidth != temp._has_mapWidth)
                return false;
            if (this._mapHeight != temp._mapHeight)
                return false;
            if (this._has_mapHeight != temp._has_mapHeight)
                return false;
            if (this._celementList != null) {
                if (temp._celementList == null) return false;
                else if (!(this._celementList.equals(temp._celementList))) 
                    return false;
            }
            else if (temp._celementList != null)
                return false;
            if (this._csubmapList != null) {
                if (temp._csubmapList == null) return false;
                else if (!(this._csubmapList.equals(temp._csubmapList))) 
                    return false;
            }
            else if (temp._csubmapList != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Method getCelement.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.map.adapter.Celement at the given
     * index
     */
    public org.opennms.netmgt.config.map.adapter.Celement getCelement(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._celementList.size()) {
            throw new IndexOutOfBoundsException("getCelement: Index value '" + index + "' not in range [0.." + (this._celementList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.map.adapter.Celement) _celementList.get(index);
    }

    /**
     * Method getCelement.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.map.adapter.Celement[] getCelement(
    ) {
        org.opennms.netmgt.config.map.adapter.Celement[] array = new org.opennms.netmgt.config.map.adapter.Celement[0];
        return (org.opennms.netmgt.config.map.adapter.Celement[]) this._celementList.toArray(array);
    }

    /**
     * Method getCelementCollection.Returns a reference to
     * '_celementList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.map.adapter.Celement> getCelementCollection(
    ) {
        return this._celementList;
    }

    /**
     * Method getCelementCount.
     * 
     * @return the size of this collection
     */
    public int getCelementCount(
    ) {
        return this._celementList.size();
    }

    /**
     * Method getCsubmap.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.map.adapter.Csubmap at the given
     * index
     */
    public org.opennms.netmgt.config.map.adapter.Csubmap getCsubmap(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._csubmapList.size()) {
            throw new IndexOutOfBoundsException("getCsubmap: Index value '" + index + "' not in range [0.." + (this._csubmapList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.map.adapter.Csubmap) _csubmapList.get(index);
    }

    /**
     * Method getCsubmap.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.map.adapter.Csubmap[] getCsubmap(
    ) {
        org.opennms.netmgt.config.map.adapter.Csubmap[] array = new org.opennms.netmgt.config.map.adapter.Csubmap[0];
        return (org.opennms.netmgt.config.map.adapter.Csubmap[]) this._csubmapList.toArray(array);
    }

    /**
     * Method getCsubmapCollection.Returns a reference to
     * '_csubmapList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.map.adapter.Csubmap> getCsubmapCollection(
    ) {
        return this._csubmapList;
    }

    /**
     * Method getCsubmapCount.
     * 
     * @return the size of this collection
     */
    public int getCsubmapCount(
    ) {
        return this._csubmapList.size();
    }

    /**
     * Returns the value of field 'mapAccess'. The field
     * 'mapAccess' has the following description: The Access scheme
     * of the map
     *  
     * 
     * @return the value of field 'MapAccess'.
     */
    public java.lang.String getMapAccess(
    ) {
        return this._mapAccess;
    }

    /**
     * Returns the value of field 'mapBG'. The field 'mapBG' has
     * the following description: The Background of the map
     *  
     * 
     * @return the value of field 'MapBG'.
     */
    public java.lang.String getMapBG(
    ) {
        return this._mapBG;
    }

    /**
     * Returns the value of field 'mapGroup'. The field 'mapGroup'
     * has the following description: The Group of the map
     *  
     * 
     * @return the value of field 'MapGroup'.
     */
    public java.lang.String getMapGroup(
    ) {
        return this._mapGroup;
    }

    /**
     * Returns the value of field 'mapHeight'. The field
     * 'mapHeight' has the following description: The map height
     *  
     * 
     * @return the value of field 'MapHeight'.
     */
    public int getMapHeight(
    ) {
        return this._mapHeight;
    }

    /**
     * Returns the value of field 'mapName'. The field 'mapName'
     * has the following description: The Name of the map
     *  
     * 
     * @return the value of field 'MapName'.
     */
    public java.lang.String getMapName(
    ) {
        return this._mapName;
    }

    /**
     * Returns the value of field 'mapOwner'. The field 'mapOwner'
     * has the following description: The Owner of the map
     *  
     * 
     * @return the value of field 'MapOwner'.
     */
    public java.lang.String getMapOwner(
    ) {
        return this._mapOwner;
    }

    /**
     * Returns the value of field 'mapWidth'. The field 'mapWidth'
     * has the following description: The map width
     *  
     * 
     * @return the value of field 'MapWidth'.
     */
    public int getMapWidth(
    ) {
        return this._mapWidth;
    }

    /**
     * Method hasMapHeight.
     * 
     * @return true if at least one MapHeight has been added
     */
    public boolean hasMapHeight(
    ) {
        return this._has_mapHeight;
    }

    /**
     * Method hasMapWidth.
     * 
     * @return true if at least one MapWidth has been added
     */
    public boolean hasMapWidth(
    ) {
        return this._has_mapWidth;
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
        if (_mapName != null) {
           result = 37 * result + _mapName.hashCode();
        }
        if (_mapOwner != null) {
           result = 37 * result + _mapOwner.hashCode();
        }
        if (_mapGroup != null) {
           result = 37 * result + _mapGroup.hashCode();
        }
        if (_mapAccess != null) {
           result = 37 * result + _mapAccess.hashCode();
        }
        if (_mapBG != null) {
           result = 37 * result + _mapBG.hashCode();
        }
        result = 37 * result + _mapWidth;
        result = 37 * result + _mapHeight;
        if (_celementList != null) {
           result = 37 * result + _celementList.hashCode();
        }
        if (_csubmapList != null) {
           result = 37 * result + _csubmapList.hashCode();
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
     * Method iterateCelement.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.map.adapter.Celement> iterateCelement(
    ) {
        return this._celementList.iterator();
    }

    /**
     * Method iterateCsubmap.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.map.adapter.Csubmap> iterateCsubmap(
    ) {
        return this._csubmapList.iterator();
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
     */
    public void removeAllCelement(
    ) {
        this._celementList.clear();
    }

    /**
     */
    public void removeAllCsubmap(
    ) {
        this._csubmapList.clear();
    }

    /**
     * Method removeCelement.
     * 
     * @param vCelement
     * @return true if the object was removed from the collection.
     */
    public boolean removeCelement(
            final org.opennms.netmgt.config.map.adapter.Celement vCelement) {
        boolean removed = _celementList.remove(vCelement);
        return removed;
    }

    /**
     * Method removeCelementAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.map.adapter.Celement removeCelementAt(
            final int index) {
        java.lang.Object obj = this._celementList.remove(index);
        return (org.opennms.netmgt.config.map.adapter.Celement) obj;
    }

    /**
     * Method removeCsubmap.
     * 
     * @param vCsubmap
     * @return true if the object was removed from the collection.
     */
    public boolean removeCsubmap(
            final org.opennms.netmgt.config.map.adapter.Csubmap vCsubmap) {
        boolean removed = _csubmapList.remove(vCsubmap);
        return removed;
    }

    /**
     * Method removeCsubmapAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.map.adapter.Csubmap removeCsubmapAt(
            final int index) {
        java.lang.Object obj = this._csubmapList.remove(index);
        return (org.opennms.netmgt.config.map.adapter.Csubmap) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vCelement
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setCelement(
            final int index,
            final org.opennms.netmgt.config.map.adapter.Celement vCelement)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._celementList.size()) {
            throw new IndexOutOfBoundsException("setCelement: Index value '" + index + "' not in range [0.." + (this._celementList.size() - 1) + "]");
        }
        
        this._celementList.set(index, vCelement);
    }

    /**
     * 
     * 
     * @param vCelementArray
     */
    public void setCelement(
            final org.opennms.netmgt.config.map.adapter.Celement[] vCelementArray) {
        //-- copy array
        _celementList.clear();
        
        for (int i = 0; i < vCelementArray.length; i++) {
                this._celementList.add(vCelementArray[i]);
        }
    }

    /**
     * Sets the value of '_celementList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vCelementList the Vector to copy.
     */
    public void setCelement(
            final java.util.List<org.opennms.netmgt.config.map.adapter.Celement> vCelementList) {
        // copy vector
        this._celementList.clear();
        
        this._celementList.addAll(vCelementList);
    }

    /**
     * Sets the value of '_celementList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param celementList the Vector to set.
     */
    public void setCelementCollection(
            final java.util.List<org.opennms.netmgt.config.map.adapter.Celement> celementList) {
        this._celementList = celementList;
    }

    /**
     * 
     * 
     * @param index
     * @param vCsubmap
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setCsubmap(
            final int index,
            final org.opennms.netmgt.config.map.adapter.Csubmap vCsubmap)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._csubmapList.size()) {
            throw new IndexOutOfBoundsException("setCsubmap: Index value '" + index + "' not in range [0.." + (this._csubmapList.size() - 1) + "]");
        }
        
        this._csubmapList.set(index, vCsubmap);
    }

    /**
     * 
     * 
     * @param vCsubmapArray
     */
    public void setCsubmap(
            final org.opennms.netmgt.config.map.adapter.Csubmap[] vCsubmapArray) {
        //-- copy array
        _csubmapList.clear();
        
        for (int i = 0; i < vCsubmapArray.length; i++) {
                this._csubmapList.add(vCsubmapArray[i]);
        }
    }

    /**
     * Sets the value of '_csubmapList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vCsubmapList the Vector to copy.
     */
    public void setCsubmap(
            final java.util.List<org.opennms.netmgt.config.map.adapter.Csubmap> vCsubmapList) {
        // copy vector
        this._csubmapList.clear();
        
        this._csubmapList.addAll(vCsubmapList);
    }

    /**
     * Sets the value of '_csubmapList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param csubmapList the Vector to set.
     */
    public void setCsubmapCollection(
            final java.util.List<org.opennms.netmgt.config.map.adapter.Csubmap> csubmapList) {
        this._csubmapList = csubmapList;
    }

    /**
     * Sets the value of field 'mapAccess'. The field 'mapAccess'
     * has the following description: The Access scheme of the map
     *  
     * 
     * @param mapAccess the value of field 'mapAccess'.
     */
    public void setMapAccess(
            final java.lang.String mapAccess) {
        this._mapAccess = mapAccess;
    }

    /**
     * Sets the value of field 'mapBG'. The field 'mapBG' has the
     * following description: The Background of the map
     *  
     * 
     * @param mapBG the value of field 'mapBG'.
     */
    public void setMapBG(
            final java.lang.String mapBG) {
        this._mapBG = mapBG;
    }

    /**
     * Sets the value of field 'mapGroup'. The field 'mapGroup' has
     * the following description: The Group of the map
     *  
     * 
     * @param mapGroup the value of field 'mapGroup'.
     */
    public void setMapGroup(
            final java.lang.String mapGroup) {
        this._mapGroup = mapGroup;
    }

    /**
     * Sets the value of field 'mapHeight'. The field 'mapHeight'
     * has the following description: The map height
     *  
     * 
     * @param mapHeight the value of field 'mapHeight'.
     */
    public void setMapHeight(
            final int mapHeight) {
        this._mapHeight = mapHeight;
        this._has_mapHeight = true;
    }

    /**
     * Sets the value of field 'mapName'. The field 'mapName' has
     * the following description: The Name of the map
     *  
     * 
     * @param mapName the value of field 'mapName'.
     */
    public void setMapName(
            final java.lang.String mapName) {
        this._mapName = mapName;
    }

    /**
     * Sets the value of field 'mapOwner'. The field 'mapOwner' has
     * the following description: The Owner of the map
     *  
     * 
     * @param mapOwner the value of field 'mapOwner'.
     */
    public void setMapOwner(
            final java.lang.String mapOwner) {
        this._mapOwner = mapOwner;
    }

    /**
     * Sets the value of field 'mapWidth'. The field 'mapWidth' has
     * the following description: The map width
     *  
     * 
     * @param mapWidth the value of field 'mapWidth'.
     */
    public void setMapWidth(
            final int mapWidth) {
        this._mapWidth = mapWidth;
        this._has_mapWidth = true;
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
     * org.opennms.netmgt.config.map.adapter.Cmap
     */
    public static org.opennms.netmgt.config.map.adapter.Cmap unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.map.adapter.Cmap) Unmarshaller.unmarshal(org.opennms.netmgt.config.map.adapter.Cmap.class, reader);
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
