package com.google.gwt.maps.client.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.jsio.client.*;
import com.google.gwt.maps.jsio.client.impl.*;

public class __GroundOverlayImplImpl implements com.google.gwt.maps.client.impl.GroundOverlayImpl {
  public native void show(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    jsoPeer.show();
  }-*/;
  public native com.google.gwt.core.client.JavaScriptObject construct(java.lang.String imageUrl, com.google.gwt.maps.client.geom.LatLngBounds bounds) /*-{
    var jsReturn = new $wnd.GGroundOverlay(imageUrl, bounds);
    return jsReturn;
  }-*/;
  public native boolean isHidden(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    var jsReturn = jsoPeer.isHidden();
    return !!jsReturn;
  }-*/;
  public native void hide(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    jsoPeer.hide();
  }-*/;
}
