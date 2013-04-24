package com.google.gwt.maps.client.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.jsio.client.*;
import com.google.gwt.maps.jsio.client.impl.*;

public class __OverlayImplImpl extends com.google.gwt.maps.client.impl.OverlayImpl {
  public native void initialize(com.google.gwt.core.client.JavaScriptObject jsoPeer, com.google.gwt.maps.client.MapWidget map) /*-{
    jsoPeer.initialize(map == null ? null : map.@com.google.gwt.maps.client.MapWidget::jsoPeer);
  }-*/;
  public native void remove(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    jsoPeer.remove();
  }-*/;
  public native com.google.gwt.maps.client.overlay.Overlay copy(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    var jsReturn = jsoPeer.copy();
    return jsReturn == null ? null : (jsReturn.__gwtPeer || @com.google.gwt.maps.client.overlay.Overlay::createPeer(Lcom/google/gwt/core/client/JavaScriptObject;)(jsReturn));
  }-*/;
  public void bindOverlay(com.google.gwt.core.client.JavaScriptObject jso, com.google.gwt.maps.client.overlay.Overlay obj) {
    assert JSONWrapperUtil.hasField(jso, "initialize") : "Backing JSO missing imported function initialize";
    assert JSONWrapperUtil.hasField(jso, "remove") : "Backing JSO missing imported function remove";
    assert JSONWrapperUtil.hasField(jso, "copy") : "Backing JSO missing imported function copy";
    assert JSONWrapperUtil.hasField(jso, "redraw") : "Backing JSO missing imported function redraw";
    bindOverlayNative (jso,obj);
  }
  public native void bindOverlayNative (com.google.gwt.core.client.JavaScriptObject jso, com.google.gwt.maps.client.overlay.Overlay obj) /*-{
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
  public native void redraw(com.google.gwt.core.client.JavaScriptObject jsoPeer, boolean force) /*-{
    jsoPeer.redraw(force);
  }-*/;
  public native com.google.gwt.core.client.JavaScriptObject constructOverlay() /*-{
    var jsReturn = new $wnd.GOverlay();
    return jsReturn;
  }-*/;
}
