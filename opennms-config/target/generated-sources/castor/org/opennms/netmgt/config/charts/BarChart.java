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
 * Class BarChart.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class BarChart implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _name.
     */
    private java.lang.String _name;

    /**
     * Field _domainAxisLabel.
     */
    private java.lang.String _domainAxisLabel;

    /**
     * Field _rangeAxisLabel.
     */
    private java.lang.String _rangeAxisLabel;

    /**
     * Field _subLabelClass.
     */
    private java.lang.String _subLabelClass;

    /**
     * Field _seriesColorClass.
     */
    private java.lang.String _seriesColorClass;

    /**
     * Field _drawBarOutline.
     */
    private boolean _drawBarOutline = true;

    /**
     * keeps track of state for field: _drawBarOutline
     */
    private boolean _has_drawBarOutline;

    /**
     * Field _showLegend.
     */
    private boolean _showLegend = true;

    /**
     * keeps track of state for field: _showLegend
     */
    private boolean _has_showLegend;

    /**
     * Field _showToolTips.
     */
    private boolean _showToolTips = false;

    /**
     * keeps track of state for field: _showToolTips
     */
    private boolean _has_showToolTips;

    /**
     * Field _showUrls.
     */
    private boolean _showUrls = false;

    /**
     * keeps track of state for field: _showUrls
     */
    private boolean _has_showUrls;

    /**
     * Field _variation.
     */
    private java.lang.String _variation;

    /**
     * Field _plotOrientation.
     */
    private java.lang.String _plotOrientation;

    /**
     * Field _title.
     */
    private org.opennms.netmgt.config.charts.Title _title;

    /**
     * Field _imageSize.
     */
    private org.opennms.netmgt.config.charts.ImageSize _imageSize;

    /**
     * Field _subTitleList.
     */
    private java.util.List<org.opennms.netmgt.config.charts.SubTitle> _subTitleList;

    /**
     * Field _gridLines.
     */
    private org.opennms.netmgt.config.charts.GridLines _gridLines;

    /**
     * Field _seriesDefList.
     */
    private java.util.List<org.opennms.netmgt.config.charts.SeriesDef> _seriesDefList;

    /**
     * Field _plotBackgroundColor.
     */
    private org.opennms.netmgt.config.charts.PlotBackgroundColor _plotBackgroundColor;

    /**
     * Field _chartBackgroundColor.
     */
    private org.opennms.netmgt.config.charts.ChartBackgroundColor _chartBackgroundColor;


      //----------------/
     //- Constructors -/
    //----------------/

    public BarChart() {
        super();
        this._subTitleList = new java.util.ArrayList<org.opennms.netmgt.config.charts.SubTitle>();
        this._seriesDefList = new java.util.ArrayList<org.opennms.netmgt.config.charts.SeriesDef>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vSeriesDef
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSeriesDef(
            final org.opennms.netmgt.config.charts.SeriesDef vSeriesDef)
    throws java.lang.IndexOutOfBoundsException {
        this._seriesDefList.add(vSeriesDef);
    }

    /**
     * 
     * 
     * @param index
     * @param vSeriesDef
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSeriesDef(
            final int index,
            final org.opennms.netmgt.config.charts.SeriesDef vSeriesDef)
    throws java.lang.IndexOutOfBoundsException {
        this._seriesDefList.add(index, vSeriesDef);
    }

    /**
     * 
     * 
     * @param vSubTitle
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSubTitle(
            final org.opennms.netmgt.config.charts.SubTitle vSubTitle)
    throws java.lang.IndexOutOfBoundsException {
        this._subTitleList.add(vSubTitle);
    }

    /**
     * 
     * 
     * @param index
     * @param vSubTitle
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSubTitle(
            final int index,
            final org.opennms.netmgt.config.charts.SubTitle vSubTitle)
    throws java.lang.IndexOutOfBoundsException {
        this._subTitleList.add(index, vSubTitle);
    }

    /**
     */
    public void deleteDrawBarOutline(
    ) {
        this._has_drawBarOutline= false;
    }

    /**
     */
    public void deleteShowLegend(
    ) {
        this._has_showLegend= false;
    }

    /**
     */
    public void deleteShowToolTips(
    ) {
        this._has_showToolTips= false;
    }

    /**
     */
    public void deleteShowUrls(
    ) {
        this._has_showUrls= false;
    }

    /**
     * Method enumerateSeriesDef.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.charts.SeriesDef> enumerateSeriesDef(
    ) {
        return java.util.Collections.enumeration(this._seriesDefList);
    }

    /**
     * Method enumerateSubTitle.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.charts.SubTitle> enumerateSubTitle(
    ) {
        return java.util.Collections.enumeration(this._subTitleList);
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
        
        if (obj instanceof BarChart) {
        
            BarChart temp = (BarChart)obj;
            if (this._name != null) {
                if (temp._name == null) return false;
                else if (!(this._name.equals(temp._name))) 
                    return false;
            }
            else if (temp._name != null)
                return false;
            if (this._domainAxisLabel != null) {
                if (temp._domainAxisLabel == null) return false;
                else if (!(this._domainAxisLabel.equals(temp._domainAxisLabel))) 
                    return false;
            }
            else if (temp._domainAxisLabel != null)
                return false;
            if (this._rangeAxisLabel != null) {
                if (temp._rangeAxisLabel == null) return false;
                else if (!(this._rangeAxisLabel.equals(temp._rangeAxisLabel))) 
                    return false;
            }
            else if (temp._rangeAxisLabel != null)
                return false;
            if (this._subLabelClass != null) {
                if (temp._subLabelClass == null) return false;
                else if (!(this._subLabelClass.equals(temp._subLabelClass))) 
                    return false;
            }
            else if (temp._subLabelClass != null)
                return false;
            if (this._seriesColorClass != null) {
                if (temp._seriesColorClass == null) return false;
                else if (!(this._seriesColorClass.equals(temp._seriesColorClass))) 
                    return false;
            }
            else if (temp._seriesColorClass != null)
                return false;
            if (this._drawBarOutline != temp._drawBarOutline)
                return false;
            if (this._has_drawBarOutline != temp._has_drawBarOutline)
                return false;
            if (this._showLegend != temp._showLegend)
                return false;
            if (this._has_showLegend != temp._has_showLegend)
                return false;
            if (this._showToolTips != temp._showToolTips)
                return false;
            if (this._has_showToolTips != temp._has_showToolTips)
                return false;
            if (this._showUrls != temp._showUrls)
                return false;
            if (this._has_showUrls != temp._has_showUrls)
                return false;
            if (this._variation != null) {
                if (temp._variation == null) return false;
                else if (!(this._variation.equals(temp._variation))) 
                    return false;
            }
            else if (temp._variation != null)
                return false;
            if (this._plotOrientation != null) {
                if (temp._plotOrientation == null) return false;
                else if (!(this._plotOrientation.equals(temp._plotOrientation))) 
                    return false;
            }
            else if (temp._plotOrientation != null)
                return false;
            if (this._title != null) {
                if (temp._title == null) return false;
                else if (!(this._title.equals(temp._title))) 
                    return false;
            }
            else if (temp._title != null)
                return false;
            if (this._imageSize != null) {
                if (temp._imageSize == null) return false;
                else if (!(this._imageSize.equals(temp._imageSize))) 
                    return false;
            }
            else if (temp._imageSize != null)
                return false;
            if (this._subTitleList != null) {
                if (temp._subTitleList == null) return false;
                else if (!(this._subTitleList.equals(temp._subTitleList))) 
                    return false;
            }
            else if (temp._subTitleList != null)
                return false;
            if (this._gridLines != null) {
                if (temp._gridLines == null) return false;
                else if (!(this._gridLines.equals(temp._gridLines))) 
                    return false;
            }
            else if (temp._gridLines != null)
                return false;
            if (this._seriesDefList != null) {
                if (temp._seriesDefList == null) return false;
                else if (!(this._seriesDefList.equals(temp._seriesDefList))) 
                    return false;
            }
            else if (temp._seriesDefList != null)
                return false;
            if (this._plotBackgroundColor != null) {
                if (temp._plotBackgroundColor == null) return false;
                else if (!(this._plotBackgroundColor.equals(temp._plotBackgroundColor))) 
                    return false;
            }
            else if (temp._plotBackgroundColor != null)
                return false;
            if (this._chartBackgroundColor != null) {
                if (temp._chartBackgroundColor == null) return false;
                else if (!(this._chartBackgroundColor.equals(temp._chartBackgroundColor))) 
                    return false;
            }
            else if (temp._chartBackgroundColor != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'chartBackgroundColor'.
     * 
     * @return the value of field 'ChartBackgroundColor'.
     */
    public org.opennms.netmgt.config.charts.ChartBackgroundColor getChartBackgroundColor(
    ) {
        return this._chartBackgroundColor;
    }

    /**
     * Returns the value of field 'domainAxisLabel'.
     * 
     * @return the value of field 'DomainAxisLabel'.
     */
    public java.lang.String getDomainAxisLabel(
    ) {
        return this._domainAxisLabel;
    }

    /**
     * Returns the value of field 'drawBarOutline'.
     * 
     * @return the value of field 'DrawBarOutline'.
     */
    public boolean getDrawBarOutline(
    ) {
        return this._drawBarOutline;
    }

    /**
     * Returns the value of field 'gridLines'.
     * 
     * @return the value of field 'GridLines'.
     */
    public org.opennms.netmgt.config.charts.GridLines getGridLines(
    ) {
        return this._gridLines;
    }

    /**
     * Returns the value of field 'imageSize'.
     * 
     * @return the value of field 'ImageSize'.
     */
    public org.opennms.netmgt.config.charts.ImageSize getImageSize(
    ) {
        return this._imageSize;
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
     * Returns the value of field 'plotBackgroundColor'.
     * 
     * @return the value of field 'PlotBackgroundColor'.
     */
    public org.opennms.netmgt.config.charts.PlotBackgroundColor getPlotBackgroundColor(
    ) {
        return this._plotBackgroundColor;
    }

    /**
     * Returns the value of field 'plotOrientation'.
     * 
     * @return the value of field 'PlotOrientation'.
     */
    public java.lang.String getPlotOrientation(
    ) {
        return this._plotOrientation;
    }

    /**
     * Returns the value of field 'rangeAxisLabel'.
     * 
     * @return the value of field 'RangeAxisLabel'.
     */
    public java.lang.String getRangeAxisLabel(
    ) {
        return this._rangeAxisLabel;
    }

    /**
     * Returns the value of field 'seriesColorClass'.
     * 
     * @return the value of field 'SeriesColorClass'.
     */
    public java.lang.String getSeriesColorClass(
    ) {
        return this._seriesColorClass;
    }

    /**
     * Method getSeriesDef.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.charts.SeriesDef at the given index
     */
    public org.opennms.netmgt.config.charts.SeriesDef getSeriesDef(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._seriesDefList.size()) {
            throw new IndexOutOfBoundsException("getSeriesDef: Index value '" + index + "' not in range [0.." + (this._seriesDefList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.charts.SeriesDef) _seriesDefList.get(index);
    }

    /**
     * Method getSeriesDef.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.charts.SeriesDef[] getSeriesDef(
    ) {
        org.opennms.netmgt.config.charts.SeriesDef[] array = new org.opennms.netmgt.config.charts.SeriesDef[0];
        return (org.opennms.netmgt.config.charts.SeriesDef[]) this._seriesDefList.toArray(array);
    }

    /**
     * Method getSeriesDefCollection.Returns a reference to
     * '_seriesDefList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.charts.SeriesDef> getSeriesDefCollection(
    ) {
        return this._seriesDefList;
    }

    /**
     * Method getSeriesDefCount.
     * 
     * @return the size of this collection
     */
    public int getSeriesDefCount(
    ) {
        return this._seriesDefList.size();
    }

    /**
     * Returns the value of field 'showLegend'.
     * 
     * @return the value of field 'ShowLegend'.
     */
    public boolean getShowLegend(
    ) {
        return this._showLegend;
    }

    /**
     * Returns the value of field 'showToolTips'.
     * 
     * @return the value of field 'ShowToolTips'.
     */
    public boolean getShowToolTips(
    ) {
        return this._showToolTips;
    }

    /**
     * Returns the value of field 'showUrls'.
     * 
     * @return the value of field 'ShowUrls'.
     */
    public boolean getShowUrls(
    ) {
        return this._showUrls;
    }

    /**
     * Returns the value of field 'subLabelClass'.
     * 
     * @return the value of field 'SubLabelClass'.
     */
    public java.lang.String getSubLabelClass(
    ) {
        return this._subLabelClass;
    }

    /**
     * Method getSubTitle.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.charts.SubTitle at the given index
     */
    public org.opennms.netmgt.config.charts.SubTitle getSubTitle(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._subTitleList.size()) {
            throw new IndexOutOfBoundsException("getSubTitle: Index value '" + index + "' not in range [0.." + (this._subTitleList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.charts.SubTitle) _subTitleList.get(index);
    }

    /**
     * Method getSubTitle.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.charts.SubTitle[] getSubTitle(
    ) {
        org.opennms.netmgt.config.charts.SubTitle[] array = new org.opennms.netmgt.config.charts.SubTitle[0];
        return (org.opennms.netmgt.config.charts.SubTitle[]) this._subTitleList.toArray(array);
    }

    /**
     * Method getSubTitleCollection.Returns a reference to
     * '_subTitleList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.charts.SubTitle> getSubTitleCollection(
    ) {
        return this._subTitleList;
    }

    /**
     * Method getSubTitleCount.
     * 
     * @return the size of this collection
     */
    public int getSubTitleCount(
    ) {
        return this._subTitleList.size();
    }

    /**
     * Returns the value of field 'title'.
     * 
     * @return the value of field 'Title'.
     */
    public org.opennms.netmgt.config.charts.Title getTitle(
    ) {
        return this._title;
    }

    /**
     * Returns the value of field 'variation'.
     * 
     * @return the value of field 'Variation'.
     */
    public java.lang.String getVariation(
    ) {
        return this._variation;
    }

    /**
     * Method hasDrawBarOutline.
     * 
     * @return true if at least one DrawBarOutline has been added
     */
    public boolean hasDrawBarOutline(
    ) {
        return this._has_drawBarOutline;
    }

    /**
     * Method hasShowLegend.
     * 
     * @return true if at least one ShowLegend has been added
     */
    public boolean hasShowLegend(
    ) {
        return this._has_showLegend;
    }

    /**
     * Method hasShowToolTips.
     * 
     * @return true if at least one ShowToolTips has been added
     */
    public boolean hasShowToolTips(
    ) {
        return this._has_showToolTips;
    }

    /**
     * Method hasShowUrls.
     * 
     * @return true if at least one ShowUrls has been added
     */
    public boolean hasShowUrls(
    ) {
        return this._has_showUrls;
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
        if (_domainAxisLabel != null) {
           result = 37 * result + _domainAxisLabel.hashCode();
        }
        if (_rangeAxisLabel != null) {
           result = 37 * result + _rangeAxisLabel.hashCode();
        }
        if (_subLabelClass != null) {
           result = 37 * result + _subLabelClass.hashCode();
        }
        if (_seriesColorClass != null) {
           result = 37 * result + _seriesColorClass.hashCode();
        }
        result = 37 * result + (_drawBarOutline?0:1);
        result = 37 * result + (_showLegend?0:1);
        result = 37 * result + (_showToolTips?0:1);
        result = 37 * result + (_showUrls?0:1);
        if (_variation != null) {
           result = 37 * result + _variation.hashCode();
        }
        if (_plotOrientation != null) {
           result = 37 * result + _plotOrientation.hashCode();
        }
        if (_title != null) {
           result = 37 * result + _title.hashCode();
        }
        if (_imageSize != null) {
           result = 37 * result + _imageSize.hashCode();
        }
        if (_subTitleList != null) {
           result = 37 * result + _subTitleList.hashCode();
        }
        if (_gridLines != null) {
           result = 37 * result + _gridLines.hashCode();
        }
        if (_seriesDefList != null) {
           result = 37 * result + _seriesDefList.hashCode();
        }
        if (_plotBackgroundColor != null) {
           result = 37 * result + _plotBackgroundColor.hashCode();
        }
        if (_chartBackgroundColor != null) {
           result = 37 * result + _chartBackgroundColor.hashCode();
        }
        
        return result;
    }

    /**
     * Returns the value of field 'drawBarOutline'.
     * 
     * @return the value of field 'DrawBarOutline'.
     */
    public boolean isDrawBarOutline(
    ) {
        return this._drawBarOutline;
    }

    /**
     * Returns the value of field 'showLegend'.
     * 
     * @return the value of field 'ShowLegend'.
     */
    public boolean isShowLegend(
    ) {
        return this._showLegend;
    }

    /**
     * Returns the value of field 'showToolTips'.
     * 
     * @return the value of field 'ShowToolTips'.
     */
    public boolean isShowToolTips(
    ) {
        return this._showToolTips;
    }

    /**
     * Returns the value of field 'showUrls'.
     * 
     * @return the value of field 'ShowUrls'.
     */
    public boolean isShowUrls(
    ) {
        return this._showUrls;
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
     * Method iterateSeriesDef.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.charts.SeriesDef> iterateSeriesDef(
    ) {
        return this._seriesDefList.iterator();
    }

    /**
     * Method iterateSubTitle.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.charts.SubTitle> iterateSubTitle(
    ) {
        return this._subTitleList.iterator();
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
    public void removeAllSeriesDef(
    ) {
        this._seriesDefList.clear();
    }

    /**
     */
    public void removeAllSubTitle(
    ) {
        this._subTitleList.clear();
    }

    /**
     * Method removeSeriesDef.
     * 
     * @param vSeriesDef
     * @return true if the object was removed from the collection.
     */
    public boolean removeSeriesDef(
            final org.opennms.netmgt.config.charts.SeriesDef vSeriesDef) {
        boolean removed = _seriesDefList.remove(vSeriesDef);
        return removed;
    }

    /**
     * Method removeSeriesDefAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.charts.SeriesDef removeSeriesDefAt(
            final int index) {
        java.lang.Object obj = this._seriesDefList.remove(index);
        return (org.opennms.netmgt.config.charts.SeriesDef) obj;
    }

    /**
     * Method removeSubTitle.
     * 
     * @param vSubTitle
     * @return true if the object was removed from the collection.
     */
    public boolean removeSubTitle(
            final org.opennms.netmgt.config.charts.SubTitle vSubTitle) {
        boolean removed = _subTitleList.remove(vSubTitle);
        return removed;
    }

    /**
     * Method removeSubTitleAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.charts.SubTitle removeSubTitleAt(
            final int index) {
        java.lang.Object obj = this._subTitleList.remove(index);
        return (org.opennms.netmgt.config.charts.SubTitle) obj;
    }

    /**
     * Sets the value of field 'chartBackgroundColor'.
     * 
     * @param chartBackgroundColor the value of field
     * 'chartBackgroundColor'.
     */
    public void setChartBackgroundColor(
            final org.opennms.netmgt.config.charts.ChartBackgroundColor chartBackgroundColor) {
        this._chartBackgroundColor = chartBackgroundColor;
    }

    /**
     * Sets the value of field 'domainAxisLabel'.
     * 
     * @param domainAxisLabel the value of field 'domainAxisLabel'.
     */
    public void setDomainAxisLabel(
            final java.lang.String domainAxisLabel) {
        this._domainAxisLabel = domainAxisLabel;
    }

    /**
     * Sets the value of field 'drawBarOutline'.
     * 
     * @param drawBarOutline the value of field 'drawBarOutline'.
     */
    public void setDrawBarOutline(
            final boolean drawBarOutline) {
        this._drawBarOutline = drawBarOutline;
        this._has_drawBarOutline = true;
    }

    /**
     * Sets the value of field 'gridLines'.
     * 
     * @param gridLines the value of field 'gridLines'.
     */
    public void setGridLines(
            final org.opennms.netmgt.config.charts.GridLines gridLines) {
        this._gridLines = gridLines;
    }

    /**
     * Sets the value of field 'imageSize'.
     * 
     * @param imageSize the value of field 'imageSize'.
     */
    public void setImageSize(
            final org.opennms.netmgt.config.charts.ImageSize imageSize) {
        this._imageSize = imageSize;
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
     * Sets the value of field 'plotBackgroundColor'.
     * 
     * @param plotBackgroundColor the value of field
     * 'plotBackgroundColor'.
     */
    public void setPlotBackgroundColor(
            final org.opennms.netmgt.config.charts.PlotBackgroundColor plotBackgroundColor) {
        this._plotBackgroundColor = plotBackgroundColor;
    }

    /**
     * Sets the value of field 'plotOrientation'.
     * 
     * @param plotOrientation the value of field 'plotOrientation'.
     */
    public void setPlotOrientation(
            final java.lang.String plotOrientation) {
        this._plotOrientation = plotOrientation;
    }

    /**
     * Sets the value of field 'rangeAxisLabel'.
     * 
     * @param rangeAxisLabel the value of field 'rangeAxisLabel'.
     */
    public void setRangeAxisLabel(
            final java.lang.String rangeAxisLabel) {
        this._rangeAxisLabel = rangeAxisLabel;
    }

    /**
     * Sets the value of field 'seriesColorClass'.
     * 
     * @param seriesColorClass the value of field 'seriesColorClass'
     */
    public void setSeriesColorClass(
            final java.lang.String seriesColorClass) {
        this._seriesColorClass = seriesColorClass;
    }

    /**
     * 
     * 
     * @param index
     * @param vSeriesDef
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSeriesDef(
            final int index,
            final org.opennms.netmgt.config.charts.SeriesDef vSeriesDef)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._seriesDefList.size()) {
            throw new IndexOutOfBoundsException("setSeriesDef: Index value '" + index + "' not in range [0.." + (this._seriesDefList.size() - 1) + "]");
        }
        
        this._seriesDefList.set(index, vSeriesDef);
    }

    /**
     * 
     * 
     * @param vSeriesDefArray
     */
    public void setSeriesDef(
            final org.opennms.netmgt.config.charts.SeriesDef[] vSeriesDefArray) {
        //-- copy array
        _seriesDefList.clear();
        
        for (int i = 0; i < vSeriesDefArray.length; i++) {
                this._seriesDefList.add(vSeriesDefArray[i]);
        }
    }

    /**
     * Sets the value of '_seriesDefList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vSeriesDefList the Vector to copy.
     */
    public void setSeriesDef(
            final java.util.List<org.opennms.netmgt.config.charts.SeriesDef> vSeriesDefList) {
        // copy vector
        this._seriesDefList.clear();
        
        this._seriesDefList.addAll(vSeriesDefList);
    }

    /**
     * Sets the value of '_seriesDefList' by setting it to the
     * given Vector. No type checking is performed.
     * @deprecated
     * 
     * @param seriesDefList the Vector to set.
     */
    public void setSeriesDefCollection(
            final java.util.List<org.opennms.netmgt.config.charts.SeriesDef> seriesDefList) {
        this._seriesDefList = seriesDefList;
    }

    /**
     * Sets the value of field 'showLegend'.
     * 
     * @param showLegend the value of field 'showLegend'.
     */
    public void setShowLegend(
            final boolean showLegend) {
        this._showLegend = showLegend;
        this._has_showLegend = true;
    }

    /**
     * Sets the value of field 'showToolTips'.
     * 
     * @param showToolTips the value of field 'showToolTips'.
     */
    public void setShowToolTips(
            final boolean showToolTips) {
        this._showToolTips = showToolTips;
        this._has_showToolTips = true;
    }

    /**
     * Sets the value of field 'showUrls'.
     * 
     * @param showUrls the value of field 'showUrls'.
     */
    public void setShowUrls(
            final boolean showUrls) {
        this._showUrls = showUrls;
        this._has_showUrls = true;
    }

    /**
     * Sets the value of field 'subLabelClass'.
     * 
     * @param subLabelClass the value of field 'subLabelClass'.
     */
    public void setSubLabelClass(
            final java.lang.String subLabelClass) {
        this._subLabelClass = subLabelClass;
    }

    /**
     * 
     * 
     * @param index
     * @param vSubTitle
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSubTitle(
            final int index,
            final org.opennms.netmgt.config.charts.SubTitle vSubTitle)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._subTitleList.size()) {
            throw new IndexOutOfBoundsException("setSubTitle: Index value '" + index + "' not in range [0.." + (this._subTitleList.size() - 1) + "]");
        }
        
        this._subTitleList.set(index, vSubTitle);
    }

    /**
     * 
     * 
     * @param vSubTitleArray
     */
    public void setSubTitle(
            final org.opennms.netmgt.config.charts.SubTitle[] vSubTitleArray) {
        //-- copy array
        _subTitleList.clear();
        
        for (int i = 0; i < vSubTitleArray.length; i++) {
                this._subTitleList.add(vSubTitleArray[i]);
        }
    }

    /**
     * Sets the value of '_subTitleList' by copying the given
     * Vector. All elements will be checked for type safety.
     * 
     * @param vSubTitleList the Vector to copy.
     */
    public void setSubTitle(
            final java.util.List<org.opennms.netmgt.config.charts.SubTitle> vSubTitleList) {
        // copy vector
        this._subTitleList.clear();
        
        this._subTitleList.addAll(vSubTitleList);
    }

    /**
     * Sets the value of '_subTitleList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param subTitleList the Vector to set.
     */
    public void setSubTitleCollection(
            final java.util.List<org.opennms.netmgt.config.charts.SubTitle> subTitleList) {
        this._subTitleList = subTitleList;
    }

    /**
     * Sets the value of field 'title'.
     * 
     * @param title the value of field 'title'.
     */
    public void setTitle(
            final org.opennms.netmgt.config.charts.Title title) {
        this._title = title;
    }

    /**
     * Sets the value of field 'variation'.
     * 
     * @param variation the value of field 'variation'.
     */
    public void setVariation(
            final java.lang.String variation) {
        this._variation = variation;
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
     * org.opennms.netmgt.config.charts.BarChart
     */
    public static org.opennms.netmgt.config.charts.BarChart unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.charts.BarChart) Unmarshaller.unmarshal(org.opennms.netmgt.config.charts.BarChart.class, reader);
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
