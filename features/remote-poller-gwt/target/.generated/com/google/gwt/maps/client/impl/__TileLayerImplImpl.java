package com.google.gwt.maps.client.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.jsio.client.*;
import com.google.gwt.maps.jsio.client.impl.*;

public class __TileLayerImplImpl implements com.google.gwt.maps.client.impl.TileLayerImpl {
  public native double getOpacity(com.google.gwt.maps.client.TileLayer jsoPeer) /*-{
    var jsReturn = jsoPeer.@com.google.gwt.maps.client.TileLayer::jsoPeer.getOpacity();
    return jsReturn;
  }-*/;
  public native int maxResolution(com.google.gwt.maps.client.TileLayer jsoPeer) /*-{
    var jsReturn = jsoPeer.@com.google.gwt.maps.client.TileLayer::jsoPeer.maxResolution();
    return jsReturn;
  }-*/;
  public native boolean isPng(com.google.gwt.maps.client.TileLayer jsoPeer) /*-{
    var jsReturn = jsoPeer.@com.google.gwt.maps.client.TileLayer::jsoPeer.isPng();
    return !!jsReturn;
  }-*/;
  public native com.google.gwt.core.client.JavaScriptObject construct() /*-{
    var jsReturn = new $wnd.GTileLayer();
    return jsReturn;
  }-*/;
  public void bind(com.google.gwt.core.client.JavaScriptObject jso, com.google.gwt.maps.client.TileLayer obj) {
    assert JSONWrapperUtil.hasField(jso, "getOpacity") : "Backing JSO missing imported function getOpacity";
    assert JSONWrapperUtil.hasField(jso, "maxResolution") : "Backing JSO missing imported function maxResolution";
    assert JSONWrapperUtil.hasField(jso, "isPng") : "Backing JSO missing imported function isPng";
    assert JSONWrapperUtil.hasField(jso, "getTileUrl") : "Backing JSO missing imported function getTileUrl";
    assert JSONWrapperUtil.hasField(jso, "minResolution") : "Backing JSO missing imported function minResolution";
    bindNative (jso,obj);
  }
  public native void bindNative (com.google.gwt.core.client.JavaScriptObject jso, com.google.gwt.maps.client.TileLayer obj) /*-{
    if (jso.__gwtPeer) {
      @com.google.gwt.maps.jsio.client.impl.JSONWrapperUtil::throwMultipleWrapperException()();
    }
    jso.__gwtPeer = obj;
    jso.getOpacity = function() {
      return this.__gwtPeer.@com.google.gwt.maps.client.TileLayer::getOpacity()(
      );
    };
    jso.getTileUrl = function(arg0, arg1) {
      return this.__gwtPeer.@com.google.gwt.maps.client.TileLayer::getTileURL(Lcom/google/gwt/maps/client/geom/Point;I)(
          arg0 || null, 
          arg1);
    };
    jso.isPng = function() {
      return this.__gwtPeer.@com.google.gwt.maps.client.TileLayer::isPng()(
      );
    };
  }-*/;
  public native java.lang.String getTileUrl(com.google.gwt.maps.client.TileLayer jsoPeer, com.google.gwt.maps.client.geom.Point tile, int zoomLevel) /*-{
    var jsReturn = jsoPeer.@com.google.gwt.maps.client.TileLayer::jsoPeer.getTileUrl(tile, zoomLevel);
    return jsReturn;
  }-*/;
  public native int minResolution(com.google.gwt.maps.client.TileLayer jsoPeer) /*-{
    var jsReturn = jsoPeer.@com.google.gwt.maps.client.TileLayer::jsoPeer.minResolution();
    return jsReturn;
  }-*/;
  public native com.google.gwt.core.client.JavaScriptObject construct(com.google.gwt.maps.client.CopyrightCollection copyrights, int minResolution, int maxResolution) /*-{
    var jsReturn = new $wnd.GTileLayer(copyrights == null ? null : copyrights.@com.google.gwt.maps.client.CopyrightCollection::jsoPeer, minResolution, maxResolution);
    return jsReturn;
  }-*/;
}
