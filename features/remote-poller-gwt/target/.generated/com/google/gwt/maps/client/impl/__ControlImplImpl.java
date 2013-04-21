package com.google.gwt.maps.client.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.jsio.client.*;
import com.google.gwt.maps.jsio.client.impl.*;

public class __ControlImplImpl implements com.google.gwt.maps.client.impl.ControlImpl {
  public void bind(com.google.gwt.core.client.JavaScriptObject jso, com.google.gwt.maps.client.control.Control.CustomControl obj) {
    bindNative (jso,obj);
  }
  public native void bindNative (com.google.gwt.core.client.JavaScriptObject jso, com.google.gwt.maps.client.control.Control.CustomControl obj) /*-{
    if (jso.__gwtPeer) {
      @com.google.gwt.maps.jsio.client.impl.JSONWrapperUtil::throwMultipleWrapperException()();
    }
    jso.__gwtPeer = obj;
    jso.initialize = function(arg0) {
      return this.__gwtPeer.@com.google.gwt.maps.client.control.Control.CustomControl::initializeControl(Lcom/google/gwt/maps/client/MapWidget;)(
          arg0 == null ? null : (arg0.__gwtPeer || @com.google.gwt.maps.client.MapWidget::createPeer(Lcom/google/gwt/core/client/JavaScriptObject;)(arg0)));
    };
    jso.getDefaultPosition = function() {
      var javaReturn = this.__gwtPeer.@com.google.gwt.maps.client.control.Control.CustomControl::getDefaultPosition()(
      );
      return javaReturn == null ? null : javaReturn.@com.google.gwt.maps.client.control.ControlPosition::jsoPeer;
    };
  }-*/;
  public native com.google.gwt.core.client.JavaScriptObject createMenuMapTypeControl() /*-{
    var jsReturn = new $wnd.GMenuMapTypeControl();
    return jsReturn;
  }-*/;
  public native com.google.gwt.core.client.JavaScriptObject createControl(boolean printable, boolean selectable) /*-{
    var jsReturn = new $wnd.GControl(printable, selectable);
    return jsReturn;
  }-*/;
  public native com.google.gwt.core.client.JavaScriptObject createOverviewMapControl() /*-{
    var jsReturn = new $wnd.GOverviewMapControl();
    return jsReturn;
  }-*/;
  public native com.google.gwt.core.client.JavaScriptObject createSmallZoomControl3D() /*-{
    var jsReturn = new $wnd.GSmallZoomControl3D();
    return jsReturn;
  }-*/;
  public native com.google.gwt.core.client.JavaScriptObject createLargeMapControl() /*-{
    var jsReturn = new $wnd.GLargeMapControl();
    return jsReturn;
  }-*/;
  public native com.google.gwt.core.client.JavaScriptObject createMapTypeControl(boolean useShortNames) /*-{
    var jsReturn = new $wnd.GMapTypeControl(useShortNames);
    return jsReturn;
  }-*/;
  public native com.google.gwt.core.client.JavaScriptObject createLargeMapControl3D() /*-{
    var jsReturn = new $wnd.GLargeMapControl3D();
    return jsReturn;
  }-*/;
  public native com.google.gwt.core.client.JavaScriptObject createMapTypeControl() /*-{
    var jsReturn = new $wnd.GMapTypeControl();
    return jsReturn;
  }-*/;
  public native com.google.gwt.core.client.JavaScriptObject createScaleControl() /*-{
    var jsReturn = new $wnd.GScaleControl();
    return jsReturn;
  }-*/;
  public native com.google.gwt.core.client.JavaScriptObject createNavLabelControl() /*-{
    var jsReturn = new $wnd.GNavLabelControl();
    return jsReturn;
  }-*/;
  public native com.google.gwt.core.client.JavaScriptObject createMenuMapTypeControl(boolean useShortNames) /*-{
    var jsReturn = new $wnd.GMenuMapTypeControl(useShortNames);
    return jsReturn;
  }-*/;
  public native com.google.gwt.core.client.JavaScriptObject createSmallMapControl() /*-{
    var jsReturn = new $wnd.GSmallMapControl();
    return jsReturn;
  }-*/;
  public native com.google.gwt.core.client.JavaScriptObject createSmallZoomControl() /*-{
    var jsReturn = new $wnd.GSmallZoomControl();
    return jsReturn;
  }-*/;
}
