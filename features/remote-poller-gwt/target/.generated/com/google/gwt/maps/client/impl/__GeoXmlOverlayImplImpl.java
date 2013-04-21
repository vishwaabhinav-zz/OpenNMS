package com.google.gwt.maps.client.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.jsio.client.*;
import com.google.gwt.maps.jsio.client.impl.*;

public class __GeoXmlOverlayImplImpl extends com.google.gwt.maps.client.impl.GeoXmlOverlayImpl {
  public native void initialize(com.google.gwt.core.client.JavaScriptObject jsoPeer, com.google.gwt.maps.client.MapWidget map) /*-{
    jsoPeer.initialize(map == null ? null : map.@com.google.gwt.maps.client.MapWidget::jsoPeer);
  }-*/;
  public native void gotoDefaultViewport(com.google.gwt.core.client.JavaScriptObject jsoPeer, com.google.gwt.core.client.JavaScriptObject mapWidget) /*-{
    jsoPeer.gotoDefaultViewport(mapWidget);
  }-*/;
  public native void show(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    jsoPeer.show();
  }-*/;
  public void bindOverlay(com.google.gwt.core.client.JavaScriptObject jso, com.google.gwt.maps.client.overlay.Overlay obj) {
    assert JSONWrapperUtil.hasField(jso, "initialize") : "Backing JSO missing imported function initialize";
    assert JSONWrapperUtil.hasField(jso, "gotoDefaultViewport") : "Backing JSO missing imported function gotoDefaultViewport";
    assert JSONWrapperUtil.hasField(jso, "show") : "Backing JSO missing imported function show";
    assert JSONWrapperUtil.hasField(jso, "redraw") : "Backing JSO missing imported function redraw";
    assert JSONWrapperUtil.hasField(jso, "getDefaultBounds") : "Backing JSO missing imported function getDefaultBounds";
    assert JSONWrapperUtil.hasField(jso, "getTileLayerOverlay") : "Backing JSO missing imported function getTileLayerOverlay";
    assert JSONWrapperUtil.hasField(jso, "isHidden") : "Backing JSO missing imported function isHidden";
    assert JSONWrapperUtil.hasField(jso, "hide") : "Backing JSO missing imported function hide";
    assert JSONWrapperUtil.hasField(jso, "supportsHide") : "Backing JSO missing imported function supportsHide";
    assert JSONWrapperUtil.hasField(jso, "remove") : "Backing JSO missing imported function remove";
    assert JSONWrapperUtil.hasField(jso, "copy") : "Backing JSO missing imported function copy";
    assert JSONWrapperUtil.hasField(jso, "loadedCorrectly") : "Backing JSO missing imported function loadedCorrectly";
    assert JSONWrapperUtil.hasField(jso, "getDefaultCenter") : "Backing JSO missing imported function getDefaultCenter";
    assert JSONWrapperUtil.hasField(jso, "hasLoaded") : "Backing JSO missing imported function hasLoaded";
    assert JSONWrapperUtil.hasField(jso, "getDefaultSpan") : "Backing JSO missing imported function getDefaultSpan";
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
  public native com.google.gwt.core.client.JavaScriptObject constructGeoXmlOverlay(java.lang.String url) /*-{
    var jsReturn = new $wnd.GGeoXml(url);
    return jsReturn;
  }-*/;
  public native com.google.gwt.maps.client.geom.LatLngBounds getDefaultBounds(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    var jsReturn = jsoPeer.getDefaultBounds();
    return jsReturn || null;
  }-*/;
  public native com.google.gwt.maps.client.overlay.TileLayerOverlay getTileLayerOverlay(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    var jsReturn = jsoPeer.getTileLayerOverlay();
    return jsReturn == null ? null : (jsReturn.__gwtPeer || @com.google.gwt.maps.client.overlay.TileLayerOverlay::createPeer(Lcom/google/gwt/core/client/JavaScriptObject;)(jsReturn));
  }-*/;
  public native boolean isHidden(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    var jsReturn = jsoPeer.isHidden();
    return !!jsReturn;
  }-*/;
  public native void hide(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    jsoPeer.hide();
  }-*/;
  public native com.google.gwt.core.client.JavaScriptObject constructOverlay() /*-{
    var jsReturn = new $wnd.GOverlay();
    return jsReturn;
  }-*/;
  public native boolean supportsHide(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    var jsReturn = jsoPeer.supportsHide();
    return !!jsReturn;
  }-*/;
  public native void remove(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    jsoPeer.remove();
  }-*/;
  public native com.google.gwt.maps.client.overlay.Overlay copy(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    var jsReturn = jsoPeer.copy();
    return jsReturn == null ? null : (jsReturn.__gwtPeer || @com.google.gwt.maps.client.overlay.Overlay::createPeer(Lcom/google/gwt/core/client/JavaScriptObject;)(jsReturn));
  }-*/;
  public native java.lang.Boolean loadedCorrectly(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    var jsReturn = jsoPeer.loadedCorrectly();
    return (jsReturn == null || jsReturn == undefined) ? null : @com.google.gwt.maps.jsio.client.impl.JSONWrapperUtil::createWrapper(Z)(jsReturn);
  }-*/;
  public native com.google.gwt.maps.client.geom.LatLng getDefaultCenter(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    var jsReturn = jsoPeer.getDefaultCenter();
    return jsReturn || null;
  }-*/;
  public native boolean hasLoaded(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    var jsReturn = jsoPeer.hasLoaded();
    return !!jsReturn;
  }-*/;
  public native com.google.gwt.maps.client.geom.LatLng getDefaultSpan(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    var jsReturn = jsoPeer.getDefaultSpan();
    return jsReturn || null;
  }-*/;
}
