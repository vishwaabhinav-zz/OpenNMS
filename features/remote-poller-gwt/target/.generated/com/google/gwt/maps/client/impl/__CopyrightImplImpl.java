package com.google.gwt.maps.client.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.jsio.client.*;
import com.google.gwt.maps.jsio.client.impl.*;

public class __CopyrightImplImpl implements com.google.gwt.maps.client.impl.CopyrightImpl {
  public native java.lang.String getText(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    return jsoPeer.text;
  }-*/;
  public native com.google.gwt.maps.client.geom.LatLngBounds getBounds(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    return jsoPeer.bounds || null;
  }-*/;
  public native int getId(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    return jsoPeer.id;
  }-*/;
  public native int getMinZoomLevel(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    return jsoPeer.minZoomLevel;
  }-*/;
  public native com.google.gwt.core.client.JavaScriptObject construct(int id, com.google.gwt.maps.client.geom.LatLngBounds bounds, int minZoomLevel, java.lang.String text) /*-{
    var jsReturn = new $wnd.GCopyright(id, bounds, minZoomLevel, text);
    if (!jsReturn.hasOwnProperty('text')) {
      jsReturn.text = null;
    }
    if (!jsReturn.hasOwnProperty('bounds')) {
      jsReturn.bounds = null;
    }
    if (!jsReturn.hasOwnProperty('id')) {
      jsReturn.id = 0;
    }
    if (!jsReturn.hasOwnProperty('minZoomLevel')) {
      jsReturn.minZoomLevel = 0;
    }
    return jsReturn;
  }-*/;
}
