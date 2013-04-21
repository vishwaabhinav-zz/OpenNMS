package com.google.gwt.maps.client.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.jsio.client.*;
import com.google.gwt.maps.jsio.client.impl.*;

public class __TrafficOverlayImplImpl implements com.google.gwt.maps.client.impl.TrafficOverlayImpl {
  public native com.google.gwt.core.client.JavaScriptObject construct() /*-{
    var jsReturn = new $wnd.GTrafficOverlay();
    return jsReturn;
  }-*/;
  public native void setVisible(com.google.gwt.maps.client.overlay.TrafficOverlay overlay, boolean visible) /*-{
    overlay.@com.google.gwt.maps.client.overlay.Overlay::jsoPeer.setVisible(visible);
  }-*/;
  public native com.google.gwt.core.client.JavaScriptObject construct(com.google.gwt.maps.client.overlay.TrafficOverlayOptions options) /*-{
    var jsReturn = new $wnd.GTrafficOverlay(options);
    return jsReturn;
  }-*/;
}
