package com.google.gwt.maps.client.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.jsio.client.*;
import com.google.gwt.maps.jsio.client.impl.*;

public class __MarkerImplImpl implements com.google.gwt.maps.client.impl.MarkerImpl {
  public native java.lang.String getTitle(com.google.gwt.maps.client.overlay.Marker marker) /*-{
    var jsReturn = marker.@com.google.gwt.maps.client.overlay.Overlay::jsoPeer.getTitle();
    return jsReturn;
  }-*/;
  public native void closeInfoWindow(com.google.gwt.maps.client.overlay.Marker marker) /*-{
    marker.@com.google.gwt.maps.client.overlay.Overlay::jsoPeer.closeInfoWindow();
  }-*/;
  public native com.google.gwt.core.client.JavaScriptObject construct(com.google.gwt.maps.client.geom.LatLng point, com.google.gwt.maps.client.overlay.MarkerOptions options) /*-{
    var jsReturn = new $wnd.GMarker(point, options);
    return jsReturn;
  }-*/;
  public native boolean draggable(com.google.gwt.maps.client.overlay.Marker marker) /*-{
    var jsReturn = marker.@com.google.gwt.maps.client.overlay.Overlay::jsoPeer.draggable();
    return !!jsReturn;
  }-*/;
  public native com.google.gwt.maps.client.geom.LatLng getLatLng(com.google.gwt.maps.client.overlay.Marker marker) /*-{
    var jsReturn = marker.@com.google.gwt.maps.client.overlay.Overlay::jsoPeer.getLatLng();
    return jsReturn || null;
  }-*/;
  public native void setLatLng(com.google.gwt.maps.client.overlay.Marker marker, com.google.gwt.maps.client.geom.LatLng point) /*-{
    marker.@com.google.gwt.maps.client.overlay.Overlay::jsoPeer.setLatLng(point);
  }-*/;
  public native void showMapBlowup(com.google.gwt.maps.client.overlay.Marker marker, com.google.gwt.core.client.JavaScriptObject options) /*-{
    marker.@com.google.gwt.maps.client.overlay.Overlay::jsoPeer.showMapBlowup(options);
  }-*/;
  public native void showMapBlowup(com.google.gwt.maps.client.overlay.Marker marker) /*-{
    marker.@com.google.gwt.maps.client.overlay.Overlay::jsoPeer.showMapBlowup();
  }-*/;
  public native void openInfoWindow(com.google.gwt.maps.client.overlay.Marker marker, com.google.gwt.core.client.JavaScriptObject content, com.google.gwt.core.client.JavaScriptObject options) /*-{
    marker.@com.google.gwt.maps.client.overlay.Overlay::jsoPeer.openInfoWindow(content, options);
  }-*/;
  public native com.google.gwt.maps.client.overlay.Icon getIcon(com.google.gwt.maps.client.overlay.Marker marker) /*-{
    var jsReturn = marker.@com.google.gwt.maps.client.overlay.Overlay::jsoPeer.getIcon();
    return jsReturn || null;
  }-*/;
  public native void setPoint(com.google.gwt.maps.client.overlay.Marker marker, com.google.gwt.maps.client.geom.LatLng point) /*-{
    marker.@com.google.gwt.maps.client.overlay.Overlay::jsoPeer.setPoint(point);
  }-*/;
  public native void setImage(com.google.gwt.maps.client.overlay.Marker marker, java.lang.String url) /*-{
    marker.@com.google.gwt.maps.client.overlay.Overlay::jsoPeer.setImage(url);
  }-*/;
  public native com.google.gwt.core.client.JavaScriptObject construct(com.google.gwt.maps.client.geom.LatLng point) /*-{
    var jsReturn = new $wnd.GMarker(point);
    return jsReturn;
  }-*/;
  public native com.google.gwt.maps.client.geom.LatLng getPoint(com.google.gwt.maps.client.overlay.Marker marker) /*-{
    var jsReturn = marker.@com.google.gwt.maps.client.overlay.Overlay::jsoPeer.getPoint();
    return jsReturn || null;
  }-*/;
  public native void openInfoWindowTabs(com.google.gwt.maps.client.overlay.Marker marker, com.google.gwt.core.client.JavaScriptObject content, com.google.gwt.core.client.JavaScriptObject options) /*-{
    marker.@com.google.gwt.maps.client.overlay.Overlay::jsoPeer.openInfoWindowTabs(content, options);
  }-*/;
  public native void disableDragging(com.google.gwt.maps.client.overlay.Marker marker) /*-{
    marker.@com.google.gwt.maps.client.overlay.Overlay::jsoPeer.disableDragging();
  }-*/;
  public native void show(com.google.gwt.maps.client.overlay.Marker marker) /*-{
    marker.@com.google.gwt.maps.client.overlay.Overlay::jsoPeer.show();
  }-*/;
  public native void hide(com.google.gwt.maps.client.overlay.Marker marker) /*-{
    marker.@com.google.gwt.maps.client.overlay.Overlay::jsoPeer.hide();
  }-*/;
  public native boolean isHidden(com.google.gwt.maps.client.overlay.Marker marker) /*-{
    var jsReturn = marker.@com.google.gwt.maps.client.overlay.Overlay::jsoPeer.isHidden();
    return !!jsReturn;
  }-*/;
  public native boolean draggingEnabled(com.google.gwt.maps.client.overlay.Marker marker) /*-{
    var jsReturn = marker.@com.google.gwt.maps.client.overlay.Overlay::jsoPeer.draggingEnabled();
    return !!jsReturn;
  }-*/;
  public native void enableDragging(com.google.gwt.maps.client.overlay.Marker marker) /*-{
    marker.@com.google.gwt.maps.client.overlay.Overlay::jsoPeer.enableDragging();
  }-*/;
}
