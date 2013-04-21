package com.google.gwt.maps.client.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.jsio.client.*;
import com.google.gwt.maps.jsio.client.impl.*;

public class __StreetviewOverlayImplImpl implements com.google.gwt.maps.client.impl.StreetviewOverlayImpl {
  public native com.google.gwt.core.client.JavaScriptObject construct() /*-{
    var jsReturn = new $wnd.GStreetviewOverlay();
    return jsReturn;
  }-*/;
  public void bind(com.google.gwt.core.client.JavaScriptObject jso, com.google.gwt.maps.client.overlay.StreetviewOverlay obj) {
    bindNative (jso,obj);
  }
  public native void bindNative (com.google.gwt.core.client.JavaScriptObject jso, com.google.gwt.maps.client.overlay.StreetviewOverlay obj) /*-{
    if (jso.__gwtPeer) {
      @com.google.gwt.maps.jsio.client.impl.JSONWrapperUtil::throwMultipleWrapperException()();
    }
    jso.__gwtPeer = obj;
    jso.copy = function() {
      var javaReturn = this.__gwtPeer.@com.google.gwt.maps.client.overlay.Overlay::copy()(
      );
      return javaReturn == null ? null : javaReturn.@com.google.gwt.maps.client.overlay.Overlay::jsoPeer;
    };
    jso.redraw = function(arg0) {
      return this.__gwtPeer.@com.google.gwt.maps.client.overlay.Overlay::redraw(Z)(
          !!arg0);
    };
    jso.initialize = function(arg0) {
      return this.__gwtPeer.@com.google.gwt.maps.client.overlay.Overlay::initialize(Lcom/google/gwt/maps/client/MapWidget;)(
          arg0 == null ? null : (arg0.__gwtPeer || @com.google.gwt.maps.client.MapWidget::createPeer(Lcom/google/gwt/core/client/JavaScriptObject;)(arg0)));
    };
    jso.remove = function() {
      return this.__gwtPeer.@com.google.gwt.maps.client.overlay.Overlay::remove()(
      );
    };
  }-*/;
}
