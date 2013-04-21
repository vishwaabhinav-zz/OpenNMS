package com.google.gwt.maps.client.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.jsio.client.*;
import com.google.gwt.maps.jsio.client.impl.*;

public class __TileLayerOverlayImplImpl implements com.google.gwt.maps.client.impl.TileLayerOverlayImpl {
  public native com.google.gwt.maps.client.TileLayer getTileLayer(com.google.gwt.maps.client.overlay.TileLayerOverlay overlay) /*-{
    var jsReturn = overlay.@com.google.gwt.maps.client.overlay.Overlay::jsoPeer.getTileLayer();
    return jsReturn == null ? null : (jsReturn.__gwtPeer || @com.google.gwt.maps.client.TileLayer::createPeer(Lcom/google/gwt/core/client/JavaScriptObject;)(jsReturn));
  }-*/;
  public void bind(com.google.gwt.core.client.JavaScriptObject jso, com.google.gwt.maps.client.overlay.TileLayerOverlay obj) {
    assert JSONWrapperUtil.hasField(jso, "getTileLayer") : "Backing JSO missing imported function getTileLayer";
    assert JSONWrapperUtil.hasField(jso, "show") : "Backing JSO missing imported function show";
    assert JSONWrapperUtil.hasField(jso, "refresh") : "Backing JSO missing imported function refresh";
    assert JSONWrapperUtil.hasField(jso, "hide") : "Backing JSO missing imported function hide";
    bindNative (jso,obj);
  }
  public native void bindNative (com.google.gwt.core.client.JavaScriptObject jso, com.google.gwt.maps.client.overlay.TileLayerOverlay obj) /*-{
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
  public native com.google.gwt.core.client.JavaScriptObject construct(com.google.gwt.maps.client.TileLayer tileLayer) /*-{
    var jsReturn = new $wnd.GTileLayerOverlay(tileLayer == null ? null : tileLayer.@com.google.gwt.maps.client.TileLayer::jsoPeer);
    return jsReturn;
  }-*/;
  public native void show(com.google.gwt.maps.client.overlay.TileLayerOverlay overlay) /*-{
    overlay.@com.google.gwt.maps.client.overlay.Overlay::jsoPeer.show();
  }-*/;
  public native com.google.gwt.core.client.JavaScriptObject construct(com.google.gwt.maps.client.TileLayer tileLayer, com.google.gwt.core.client.JavaScriptObject options) /*-{
    var jsReturn = new $wnd.GTileLayerOverlay(tileLayer == null ? null : tileLayer.@com.google.gwt.maps.client.TileLayer::jsoPeer, options);
    return jsReturn;
  }-*/;
  public native void refresh(com.google.gwt.maps.client.overlay.TileLayerOverlay overlay) /*-{
    overlay.@com.google.gwt.maps.client.overlay.Overlay::jsoPeer.refresh();
  }-*/;
  public native void hide(com.google.gwt.maps.client.overlay.TileLayerOverlay overlay) /*-{
    overlay.@com.google.gwt.maps.client.overlay.Overlay::jsoPeer.hide();
  }-*/;
}
