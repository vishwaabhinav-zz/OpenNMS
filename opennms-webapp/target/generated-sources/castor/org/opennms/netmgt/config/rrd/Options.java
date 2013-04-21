/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.opennms.netmgt.config.rrd;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class Options.
 * 
 * @version $Revision$ $Date$
 */

@SuppressWarnings("all") public class Options implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _anti_aliasing.
     */
    private boolean _anti_aliasing;

    /**
     * keeps track of state for field: _anti_aliasing
     */
    private boolean _has_anti_aliasing;

    /**
     * Field _arrow_color.
     */
    private java.lang.String _arrow_color;

    /**
     * Field _axis_color.
     */
    private java.lang.String _axis_color;

    /**
     * Field _back_color.
     */
    private java.lang.String _back_color;

    /**
     * Field _background.
     */
    private java.lang.String _background;

    /**
     * Field _base_value.
     */
    private int _base_value;

    /**
     * keeps track of state for field: _base_value
     */
    private boolean _has_base_value;

    /**
     * Field _canvas.
     */
    private java.lang.String _canvas;

    /**
     * Field _left_padding.
     */
    private int _left_padding;

    /**
     * keeps track of state for field: _left_padding
     */
    private boolean _has_left_padding;

    /**
     * Field _default_font.
     */
    private org.opennms.netmgt.config.rrd.Default_font _default_font;

    /**
     * Field _default_font_color.
     */
    private java.lang.String _default_font_color;

    /**
     * Field _frame_color.
     */
    private java.lang.String _frame_color;

    /**
     * Field _front_grid.
     */
    private boolean _front_grid;

    /**
     * keeps track of state for field: _front_grid
     */
    private boolean _has_front_grid;

    /**
     * Field _grid_range.
     */
    private org.opennms.netmgt.config.rrd.Grid_range _grid_range;

    /**
     * Field _grid_x.
     */
    private boolean _grid_x;

    /**
     * keeps track of state for field: _grid_x
     */
    private boolean _has_grid_x;

    /**
     * Field _grid_y.
     */
    private boolean _grid_y;

    /**
     * keeps track of state for field: _grid_y
     */
    private boolean _has_grid_y;

    /**
     * Field _border.
     */
    private org.opennms.netmgt.config.rrd.Border _border;

    /**
     * Field _major_grid_color.
     */
    private java.lang.String _major_grid_color;

    /**
     * Field _major_grid_x.
     */
    private boolean _major_grid_x;

    /**
     * keeps track of state for field: _major_grid_x
     */
    private boolean _has_major_grid_x;

    /**
     * Field _major_grid_y.
     */
    private boolean _major_grid_y;

    /**
     * keeps track of state for field: _major_grid_y
     */
    private boolean _has_major_grid_y;

    /**
     * Field _minor_grid_color.
     */
    private java.lang.String _minor_grid_color;

    /**
     * Field _minor_grid_x.
     */
    private boolean _minor_grid_x;

    /**
     * keeps track of state for field: _minor_grid_x
     */
    private boolean _has_minor_grid_x;

    /**
     * Field _minor_grid_y.
     */
    private boolean _minor_grid_y;

    /**
     * keeps track of state for field: _minor_grid_y
     */
    private boolean _has_minor_grid_y;

    /**
     * Field _overlay.
     */
    private java.lang.String _overlay;

    /**
     * Field _show_legend.
     */
    private boolean _show_legend;

    /**
     * keeps track of state for field: _show_legend
     */
    private boolean _has_show_legend;

    /**
     * Field _show_signature.
     */
    private boolean _show_signature;

    /**
     * keeps track of state for field: _show_signature
     */
    private boolean _has_show_signature;

    /**
     * Field _time_axis.
     */
    private org.opennms.netmgt.config.rrd.Time_axis _time_axis;

    /**
     * Field _time_axis_label.
     */
    private java.lang.String _time_axis_label;

    /**
     * Field _title.
     */
    private java.lang.String _title;

    /**
     * Field _title_font.
     */
    private org.opennms.netmgt.config.rrd.Title_font _title_font;

    /**
     * Field _title_font_color.
     */
    private java.lang.String _title_font_color;

    /**
     * Field _units_exponent.
     */
    private int _units_exponent;

    /**
     * keeps track of state for field: _units_exponent
     */
    private boolean _has_units_exponent;

    /**
     * Field _value_axis.
     */
    private org.opennms.netmgt.config.rrd.Value_axis _value_axis;

    /**
     * Field _vertical_label.
     */
    private java.lang.String _vertical_label;


      //----------------/
     //- Constructors -/
    //----------------/

    public Options() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteAnti_aliasing(
    ) {
        this._has_anti_aliasing= false;
    }

    /**
     */
    public void deleteBase_value(
    ) {
        this._has_base_value= false;
    }

    /**
     */
    public void deleteFront_grid(
    ) {
        this._has_front_grid= false;
    }

    /**
     */
    public void deleteGrid_x(
    ) {
        this._has_grid_x= false;
    }

    /**
     */
    public void deleteGrid_y(
    ) {
        this._has_grid_y= false;
    }

    /**
     */
    public void deleteLeft_padding(
    ) {
        this._has_left_padding= false;
    }

    /**
     */
    public void deleteMajor_grid_x(
    ) {
        this._has_major_grid_x= false;
    }

    /**
     */
    public void deleteMajor_grid_y(
    ) {
        this._has_major_grid_y= false;
    }

    /**
     */
    public void deleteMinor_grid_x(
    ) {
        this._has_minor_grid_x= false;
    }

    /**
     */
    public void deleteMinor_grid_y(
    ) {
        this._has_minor_grid_y= false;
    }

    /**
     */
    public void deleteShow_legend(
    ) {
        this._has_show_legend= false;
    }

    /**
     */
    public void deleteShow_signature(
    ) {
        this._has_show_signature= false;
    }

    /**
     */
    public void deleteUnits_exponent(
    ) {
        this._has_units_exponent= false;
    }

    /**
     * Returns the value of field 'anti_aliasing'.
     * 
     * @return the value of field 'Anti_aliasing'.
     */
    public boolean getAnti_aliasing(
    ) {
        return this._anti_aliasing;
    }

    /**
     * Returns the value of field 'arrow_color'.
     * 
     * @return the value of field 'Arrow_color'.
     */
    public java.lang.String getArrow_color(
    ) {
        return this._arrow_color;
    }

    /**
     * Returns the value of field 'axis_color'.
     * 
     * @return the value of field 'Axis_color'.
     */
    public java.lang.String getAxis_color(
    ) {
        return this._axis_color;
    }

    /**
     * Returns the value of field 'back_color'.
     * 
     * @return the value of field 'Back_color'.
     */
    public java.lang.String getBack_color(
    ) {
        return this._back_color;
    }

    /**
     * Returns the value of field 'background'.
     * 
     * @return the value of field 'Background'.
     */
    public java.lang.String getBackground(
    ) {
        return this._background;
    }

    /**
     * Returns the value of field 'base_value'.
     * 
     * @return the value of field 'Base_value'.
     */
    public int getBase_value(
    ) {
        return this._base_value;
    }

    /**
     * Returns the value of field 'border'.
     * 
     * @return the value of field 'Border'.
     */
    public org.opennms.netmgt.config.rrd.Border getBorder(
    ) {
        return this._border;
    }

    /**
     * Returns the value of field 'canvas'.
     * 
     * @return the value of field 'Canvas'.
     */
    public java.lang.String getCanvas(
    ) {
        return this._canvas;
    }

    /**
     * Returns the value of field 'default_font'.
     * 
     * @return the value of field 'Default_font'.
     */
    public org.opennms.netmgt.config.rrd.Default_font getDefault_font(
    ) {
        return this._default_font;
    }

    /**
     * Returns the value of field 'default_font_color'.
     * 
     * @return the value of field 'Default_font_color'.
     */
    public java.lang.String getDefault_font_color(
    ) {
        return this._default_font_color;
    }

    /**
     * Returns the value of field 'frame_color'.
     * 
     * @return the value of field 'Frame_color'.
     */
    public java.lang.String getFrame_color(
    ) {
        return this._frame_color;
    }

    /**
     * Returns the value of field 'front_grid'.
     * 
     * @return the value of field 'Front_grid'.
     */
    public boolean getFront_grid(
    ) {
        return this._front_grid;
    }

    /**
     * Returns the value of field 'grid_range'.
     * 
     * @return the value of field 'Grid_range'.
     */
    public org.opennms.netmgt.config.rrd.Grid_range getGrid_range(
    ) {
        return this._grid_range;
    }

    /**
     * Returns the value of field 'grid_x'.
     * 
     * @return the value of field 'Grid_x'.
     */
    public boolean getGrid_x(
    ) {
        return this._grid_x;
    }

    /**
     * Returns the value of field 'grid_y'.
     * 
     * @return the value of field 'Grid_y'.
     */
    public boolean getGrid_y(
    ) {
        return this._grid_y;
    }

    /**
     * Returns the value of field 'left_padding'.
     * 
     * @return the value of field 'Left_padding'.
     */
    public int getLeft_padding(
    ) {
        return this._left_padding;
    }

    /**
     * Returns the value of field 'major_grid_color'.
     * 
     * @return the value of field 'Major_grid_color'.
     */
    public java.lang.String getMajor_grid_color(
    ) {
        return this._major_grid_color;
    }

    /**
     * Returns the value of field 'major_grid_x'.
     * 
     * @return the value of field 'Major_grid_x'.
     */
    public boolean getMajor_grid_x(
    ) {
        return this._major_grid_x;
    }

    /**
     * Returns the value of field 'major_grid_y'.
     * 
     * @return the value of field 'Major_grid_y'.
     */
    public boolean getMajor_grid_y(
    ) {
        return this._major_grid_y;
    }

    /**
     * Returns the value of field 'minor_grid_color'.
     * 
     * @return the value of field 'Minor_grid_color'.
     */
    public java.lang.String getMinor_grid_color(
    ) {
        return this._minor_grid_color;
    }

    /**
     * Returns the value of field 'minor_grid_x'.
     * 
     * @return the value of field 'Minor_grid_x'.
     */
    public boolean getMinor_grid_x(
    ) {
        return this._minor_grid_x;
    }

    /**
     * Returns the value of field 'minor_grid_y'.
     * 
     * @return the value of field 'Minor_grid_y'.
     */
    public boolean getMinor_grid_y(
    ) {
        return this._minor_grid_y;
    }

    /**
     * Returns the value of field 'overlay'.
     * 
     * @return the value of field 'Overlay'.
     */
    public java.lang.String getOverlay(
    ) {
        return this._overlay;
    }

    /**
     * Returns the value of field 'show_legend'.
     * 
     * @return the value of field 'Show_legend'.
     */
    public boolean getShow_legend(
    ) {
        return this._show_legend;
    }

    /**
     * Returns the value of field 'show_signature'.
     * 
     * @return the value of field 'Show_signature'.
     */
    public boolean getShow_signature(
    ) {
        return this._show_signature;
    }

    /**
     * Returns the value of field 'time_axis'.
     * 
     * @return the value of field 'Time_axis'.
     */
    public org.opennms.netmgt.config.rrd.Time_axis getTime_axis(
    ) {
        return this._time_axis;
    }

    /**
     * Returns the value of field 'time_axis_label'.
     * 
     * @return the value of field 'Time_axis_label'.
     */
    public java.lang.String getTime_axis_label(
    ) {
        return this._time_axis_label;
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
     * Returns the value of field 'title_font'.
     * 
     * @return the value of field 'Title_font'.
     */
    public org.opennms.netmgt.config.rrd.Title_font getTitle_font(
    ) {
        return this._title_font;
    }

    /**
     * Returns the value of field 'title_font_color'.
     * 
     * @return the value of field 'Title_font_color'.
     */
    public java.lang.String getTitle_font_color(
    ) {
        return this._title_font_color;
    }

    /**
     * Returns the value of field 'units_exponent'.
     * 
     * @return the value of field 'Units_exponent'.
     */
    public int getUnits_exponent(
    ) {
        return this._units_exponent;
    }

    /**
     * Returns the value of field 'value_axis'.
     * 
     * @return the value of field 'Value_axis'.
     */
    public org.opennms.netmgt.config.rrd.Value_axis getValue_axis(
    ) {
        return this._value_axis;
    }

    /**
     * Returns the value of field 'vertical_label'.
     * 
     * @return the value of field 'Vertical_label'.
     */
    public java.lang.String getVertical_label(
    ) {
        return this._vertical_label;
    }

    /**
     * Method hasAnti_aliasing.
     * 
     * @return true if at least one Anti_aliasing has been added
     */
    public boolean hasAnti_aliasing(
    ) {
        return this._has_anti_aliasing;
    }

    /**
     * Method hasBase_value.
     * 
     * @return true if at least one Base_value has been added
     */
    public boolean hasBase_value(
    ) {
        return this._has_base_value;
    }

    /**
     * Method hasFront_grid.
     * 
     * @return true if at least one Front_grid has been added
     */
    public boolean hasFront_grid(
    ) {
        return this._has_front_grid;
    }

    /**
     * Method hasGrid_x.
     * 
     * @return true if at least one Grid_x has been added
     */
    public boolean hasGrid_x(
    ) {
        return this._has_grid_x;
    }

    /**
     * Method hasGrid_y.
     * 
     * @return true if at least one Grid_y has been added
     */
    public boolean hasGrid_y(
    ) {
        return this._has_grid_y;
    }

    /**
     * Method hasLeft_padding.
     * 
     * @return true if at least one Left_padding has been added
     */
    public boolean hasLeft_padding(
    ) {
        return this._has_left_padding;
    }

    /**
     * Method hasMajor_grid_x.
     * 
     * @return true if at least one Major_grid_x has been added
     */
    public boolean hasMajor_grid_x(
    ) {
        return this._has_major_grid_x;
    }

    /**
     * Method hasMajor_grid_y.
     * 
     * @return true if at least one Major_grid_y has been added
     */
    public boolean hasMajor_grid_y(
    ) {
        return this._has_major_grid_y;
    }

    /**
     * Method hasMinor_grid_x.
     * 
     * @return true if at least one Minor_grid_x has been added
     */
    public boolean hasMinor_grid_x(
    ) {
        return this._has_minor_grid_x;
    }

    /**
     * Method hasMinor_grid_y.
     * 
     * @return true if at least one Minor_grid_y has been added
     */
    public boolean hasMinor_grid_y(
    ) {
        return this._has_minor_grid_y;
    }

    /**
     * Method hasShow_legend.
     * 
     * @return true if at least one Show_legend has been added
     */
    public boolean hasShow_legend(
    ) {
        return this._has_show_legend;
    }

    /**
     * Method hasShow_signature.
     * 
     * @return true if at least one Show_signature has been added
     */
    public boolean hasShow_signature(
    ) {
        return this._has_show_signature;
    }

    /**
     * Method hasUnits_exponent.
     * 
     * @return true if at least one Units_exponent has been added
     */
    public boolean hasUnits_exponent(
    ) {
        return this._has_units_exponent;
    }

    /**
     * Returns the value of field 'anti_aliasing'.
     * 
     * @return the value of field 'Anti_aliasing'.
     */
    public boolean isAnti_aliasing(
    ) {
        return this._anti_aliasing;
    }

    /**
     * Returns the value of field 'front_grid'.
     * 
     * @return the value of field 'Front_grid'.
     */
    public boolean isFront_grid(
    ) {
        return this._front_grid;
    }

    /**
     * Returns the value of field 'grid_x'.
     * 
     * @return the value of field 'Grid_x'.
     */
    public boolean isGrid_x(
    ) {
        return this._grid_x;
    }

    /**
     * Returns the value of field 'grid_y'.
     * 
     * @return the value of field 'Grid_y'.
     */
    public boolean isGrid_y(
    ) {
        return this._grid_y;
    }

    /**
     * Returns the value of field 'major_grid_x'.
     * 
     * @return the value of field 'Major_grid_x'.
     */
    public boolean isMajor_grid_x(
    ) {
        return this._major_grid_x;
    }

    /**
     * Returns the value of field 'major_grid_y'.
     * 
     * @return the value of field 'Major_grid_y'.
     */
    public boolean isMajor_grid_y(
    ) {
        return this._major_grid_y;
    }

    /**
     * Returns the value of field 'minor_grid_x'.
     * 
     * @return the value of field 'Minor_grid_x'.
     */
    public boolean isMinor_grid_x(
    ) {
        return this._minor_grid_x;
    }

    /**
     * Returns the value of field 'minor_grid_y'.
     * 
     * @return the value of field 'Minor_grid_y'.
     */
    public boolean isMinor_grid_y(
    ) {
        return this._minor_grid_y;
    }

    /**
     * Returns the value of field 'show_legend'.
     * 
     * @return the value of field 'Show_legend'.
     */
    public boolean isShow_legend(
    ) {
        return this._show_legend;
    }

    /**
     * Returns the value of field 'show_signature'.
     * 
     * @return the value of field 'Show_signature'.
     */
    public boolean isShow_signature(
    ) {
        return this._show_signature;
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
     * Sets the value of field 'anti_aliasing'.
     * 
     * @param anti_aliasing the value of field 'anti_aliasing'.
     */
    public void setAnti_aliasing(
            final boolean anti_aliasing) {
        this._anti_aliasing = anti_aliasing;
        this._has_anti_aliasing = true;
    }

    /**
     * Sets the value of field 'arrow_color'.
     * 
     * @param arrow_color the value of field 'arrow_color'.
     */
    public void setArrow_color(
            final java.lang.String arrow_color) {
        this._arrow_color = arrow_color;
    }

    /**
     * Sets the value of field 'axis_color'.
     * 
     * @param axis_color the value of field 'axis_color'.
     */
    public void setAxis_color(
            final java.lang.String axis_color) {
        this._axis_color = axis_color;
    }

    /**
     * Sets the value of field 'back_color'.
     * 
     * @param back_color the value of field 'back_color'.
     */
    public void setBack_color(
            final java.lang.String back_color) {
        this._back_color = back_color;
    }

    /**
     * Sets the value of field 'background'.
     * 
     * @param background the value of field 'background'.
     */
    public void setBackground(
            final java.lang.String background) {
        this._background = background;
    }

    /**
     * Sets the value of field 'base_value'.
     * 
     * @param base_value the value of field 'base_value'.
     */
    public void setBase_value(
            final int base_value) {
        this._base_value = base_value;
        this._has_base_value = true;
    }

    /**
     * Sets the value of field 'border'.
     * 
     * @param border the value of field 'border'.
     */
    public void setBorder(
            final org.opennms.netmgt.config.rrd.Border border) {
        this._border = border;
    }

    /**
     * Sets the value of field 'canvas'.
     * 
     * @param canvas the value of field 'canvas'.
     */
    public void setCanvas(
            final java.lang.String canvas) {
        this._canvas = canvas;
    }

    /**
     * Sets the value of field 'default_font'.
     * 
     * @param default_font the value of field 'default_font'.
     */
    public void setDefault_font(
            final org.opennms.netmgt.config.rrd.Default_font default_font) {
        this._default_font = default_font;
    }

    /**
     * Sets the value of field 'default_font_color'.
     * 
     * @param default_font_color the value of field
     * 'default_font_color'.
     */
    public void setDefault_font_color(
            final java.lang.String default_font_color) {
        this._default_font_color = default_font_color;
    }

    /**
     * Sets the value of field 'frame_color'.
     * 
     * @param frame_color the value of field 'frame_color'.
     */
    public void setFrame_color(
            final java.lang.String frame_color) {
        this._frame_color = frame_color;
    }

    /**
     * Sets the value of field 'front_grid'.
     * 
     * @param front_grid the value of field 'front_grid'.
     */
    public void setFront_grid(
            final boolean front_grid) {
        this._front_grid = front_grid;
        this._has_front_grid = true;
    }

    /**
     * Sets the value of field 'grid_range'.
     * 
     * @param grid_range the value of field 'grid_range'.
     */
    public void setGrid_range(
            final org.opennms.netmgt.config.rrd.Grid_range grid_range) {
        this._grid_range = grid_range;
    }

    /**
     * Sets the value of field 'grid_x'.
     * 
     * @param grid_x the value of field 'grid_x'.
     */
    public void setGrid_x(
            final boolean grid_x) {
        this._grid_x = grid_x;
        this._has_grid_x = true;
    }

    /**
     * Sets the value of field 'grid_y'.
     * 
     * @param grid_y the value of field 'grid_y'.
     */
    public void setGrid_y(
            final boolean grid_y) {
        this._grid_y = grid_y;
        this._has_grid_y = true;
    }

    /**
     * Sets the value of field 'left_padding'.
     * 
     * @param left_padding the value of field 'left_padding'.
     */
    public void setLeft_padding(
            final int left_padding) {
        this._left_padding = left_padding;
        this._has_left_padding = true;
    }

    /**
     * Sets the value of field 'major_grid_color'.
     * 
     * @param major_grid_color the value of field 'major_grid_color'
     */
    public void setMajor_grid_color(
            final java.lang.String major_grid_color) {
        this._major_grid_color = major_grid_color;
    }

    /**
     * Sets the value of field 'major_grid_x'.
     * 
     * @param major_grid_x the value of field 'major_grid_x'.
     */
    public void setMajor_grid_x(
            final boolean major_grid_x) {
        this._major_grid_x = major_grid_x;
        this._has_major_grid_x = true;
    }

    /**
     * Sets the value of field 'major_grid_y'.
     * 
     * @param major_grid_y the value of field 'major_grid_y'.
     */
    public void setMajor_grid_y(
            final boolean major_grid_y) {
        this._major_grid_y = major_grid_y;
        this._has_major_grid_y = true;
    }

    /**
     * Sets the value of field 'minor_grid_color'.
     * 
     * @param minor_grid_color the value of field 'minor_grid_color'
     */
    public void setMinor_grid_color(
            final java.lang.String minor_grid_color) {
        this._minor_grid_color = minor_grid_color;
    }

    /**
     * Sets the value of field 'minor_grid_x'.
     * 
     * @param minor_grid_x the value of field 'minor_grid_x'.
     */
    public void setMinor_grid_x(
            final boolean minor_grid_x) {
        this._minor_grid_x = minor_grid_x;
        this._has_minor_grid_x = true;
    }

    /**
     * Sets the value of field 'minor_grid_y'.
     * 
     * @param minor_grid_y the value of field 'minor_grid_y'.
     */
    public void setMinor_grid_y(
            final boolean minor_grid_y) {
        this._minor_grid_y = minor_grid_y;
        this._has_minor_grid_y = true;
    }

    /**
     * Sets the value of field 'overlay'.
     * 
     * @param overlay the value of field 'overlay'.
     */
    public void setOverlay(
            final java.lang.String overlay) {
        this._overlay = overlay;
    }

    /**
     * Sets the value of field 'show_legend'.
     * 
     * @param show_legend the value of field 'show_legend'.
     */
    public void setShow_legend(
            final boolean show_legend) {
        this._show_legend = show_legend;
        this._has_show_legend = true;
    }

    /**
     * Sets the value of field 'show_signature'.
     * 
     * @param show_signature the value of field 'show_signature'.
     */
    public void setShow_signature(
            final boolean show_signature) {
        this._show_signature = show_signature;
        this._has_show_signature = true;
    }

    /**
     * Sets the value of field 'time_axis'.
     * 
     * @param time_axis the value of field 'time_axis'.
     */
    public void setTime_axis(
            final org.opennms.netmgt.config.rrd.Time_axis time_axis) {
        this._time_axis = time_axis;
    }

    /**
     * Sets the value of field 'time_axis_label'.
     * 
     * @param time_axis_label the value of field 'time_axis_label'.
     */
    public void setTime_axis_label(
            final java.lang.String time_axis_label) {
        this._time_axis_label = time_axis_label;
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
     * Sets the value of field 'title_font'.
     * 
     * @param title_font the value of field 'title_font'.
     */
    public void setTitle_font(
            final org.opennms.netmgt.config.rrd.Title_font title_font) {
        this._title_font = title_font;
    }

    /**
     * Sets the value of field 'title_font_color'.
     * 
     * @param title_font_color the value of field 'title_font_color'
     */
    public void setTitle_font_color(
            final java.lang.String title_font_color) {
        this._title_font_color = title_font_color;
    }

    /**
     * Sets the value of field 'units_exponent'.
     * 
     * @param units_exponent the value of field 'units_exponent'.
     */
    public void setUnits_exponent(
            final int units_exponent) {
        this._units_exponent = units_exponent;
        this._has_units_exponent = true;
    }

    /**
     * Sets the value of field 'value_axis'.
     * 
     * @param value_axis the value of field 'value_axis'.
     */
    public void setValue_axis(
            final org.opennms.netmgt.config.rrd.Value_axis value_axis) {
        this._value_axis = value_axis;
    }

    /**
     * Sets the value of field 'vertical_label'.
     * 
     * @param vertical_label the value of field 'vertical_label'.
     */
    public void setVertical_label(
            final java.lang.String vertical_label) {
        this._vertical_label = vertical_label;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.opennms.netmgt.config.rrd.Options
     */
    public static org.opennms.netmgt.config.rrd.Options unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.opennms.netmgt.config.rrd.Options) Unmarshaller.unmarshal(org.opennms.netmgt.config.rrd.Options.class, reader);
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
