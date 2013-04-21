package com.google.gwt.maps.client.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.jsio.client.*;
import com.google.gwt.maps.jsio.client.impl.*;

public class __PolylineImplImpl implements com.google.gwt.maps.client.impl.PolylineImpl {
  public native void insertVertex(com.google.gwt.core.client.JavaScriptObject jsoPeer, int index, com.google.gwt.maps.client.geom.LatLng latlng) /*-{
    jsoPeer.insertVertex(index, latlng);
  }-*/;
  public native void deleteVertex(com.google.gwt.core.client.JavaScriptObject jsoPeer, int index) /*-{
    jsoPeer.deleteVertex(index);
  }-*/;
  public native double getLength(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    var jsReturn = jsoPeer.getLength();
    return jsReturn;
  }-*/;
  public native void show(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    jsoPeer.show();
  }-*/;
  public native void enableDrawing(com.google.gwt.core.client.JavaScriptObject jsoPeer, com.google.gwt.maps.client.overlay.PolyEditingOptions opts) /*-{
    jsoPeer.enableDrawing(opts);
  }-*/;
  public native com.google.gwt.core.client.JavaScriptObject construct(com.google.gwt.core.client.JsArray points) /*-{
    var jsReturn = new $wnd.GPolyline(points);
    return jsReturn;
  }-*/;
  public native com.google.gwt.core.client.JavaScriptObject construct(com.google.gwt.core.client.JsArray points, java.lang.String color, int weight, double opacity) /*-{
    var jsReturn = new $wnd.GPolyline(points, color, weight, opacity);
    return jsReturn;
  }-*/;
  public native com.google.gwt.maps.client.geom.LatLng getVertex(com.google.gwt.core.client.JavaScriptObject jsoPeer, int index) /*-{
    var jsReturn = jsoPeer.getVertex(index);
    return jsReturn || null;
  }-*/;
  public native com.google.gwt.core.client.JavaScriptObject construct(com.google.gwt.core.client.JsArray points, java.lang.String color) /*-{
    var jsReturn = new $wnd.GPolyline(points, color);
    return jsReturn;
  }-*/;
  public native boolean isHidden(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    var jsReturn = jsoPeer.isHidden();
    return !!jsReturn;
  }-*/;
  public native void hide(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    jsoPeer.hide();
  }-*/;
  public native com.google.gwt.maps.client.geom.LatLngBounds getBounds(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    var jsReturn = jsoPeer.getBounds();
    return jsReturn || null;
  }-*/;
  public native int getVertexCount(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    var jsReturn = jsoPeer.getVertexCount();
    return jsReturn;
  }-*/;
  public native boolean supportsHide(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    var jsReturn = jsoPeer.supportsHide();
    return !!jsReturn;
  }-*/;
  public native void enableDrawing(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    jsoPeer.enableDrawing();
  }-*/;
  public native void setStrokeStyle(com.google.gwt.core.client.JavaScriptObject jsoPeer, com.google.gwt.maps.client.overlay.PolyStyleOptions style) /*-{
    jsoPeer.setStrokeStyle(style);
  }-*/;
  public native void enableEditing(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    jsoPeer.enableEditing();
  }-*/;
  public native com.google.gwt.core.client.JavaScriptObject construct(com.google.gwt.core.client.JsArray points, java.lang.String color, int weight, double opacity, com.google.gwt.maps.client.overlay.PolylineOptions options) /*-{
    var jsReturn = new $wnd.GPolyline(points, color, weight, opacity, options);
    return jsReturn;
  }-*/;
  public native com.google.gwt.core.client.JavaScriptObject construct(com.google.gwt.core.client.JsArray points, java.lang.String color, int weight) /*-{
    var jsReturn = new $wnd.GPolyline(points, color, weight);
    return jsReturn;
  }-*/;
  public native void enableEditing(com.google.gwt.core.client.JavaScriptObject jsoPeer, com.google.gwt.maps.client.overlay.PolyEditingOptions opts) /*-{
    jsoPeer.enableEditing(opts);
  }-*/;
  public native void disableEditing(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    jsoPeer.disableEditing();
  }-*/;
}
