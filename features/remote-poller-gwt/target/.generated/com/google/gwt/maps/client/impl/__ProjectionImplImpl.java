package com.google.gwt.maps.client.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.jsio.client.*;
import com.google.gwt.maps.jsio.client.impl.*;

public class __ProjectionImplImpl implements com.google.gwt.maps.client.impl.ProjectionImpl {
  public void bind(com.google.gwt.core.client.JavaScriptObject jso, com.google.gwt.maps.client.geom.MercatorProjection obj) {
    assert JSONWrapperUtil.hasField(jso, "tileCheckRange") : "Backing JSO missing imported function tileCheckRange";
    assert JSONWrapperUtil.hasField(jso, "getWrapWidth") : "Backing JSO missing imported function getWrapWidth";
    assert JSONWrapperUtil.hasField(jso, "fromPixelToLatLng") : "Backing JSO missing imported function fromPixelToLatLng";
    assert JSONWrapperUtil.hasField(jso, "fromLatLngToPixel") : "Backing JSO missing imported function fromLatLngToPixel";
    bindNative (jso,obj);
  }
  public native void bindNative (com.google.gwt.core.client.JavaScriptObject jso, com.google.gwt.maps.client.geom.MercatorProjection obj) /*-{
    if (jso.__gwtPeer) {
      @com.google.gwt.maps.jsio.client.impl.JSONWrapperUtil::throwMultipleWrapperException()();
    }
    jso.__gwtPeer = obj;
    jso.tileCheckRange = function(arg0, arg1, arg2) {
      return this.__gwtPeer.@com.google.gwt.maps.client.geom.Projection::tileCheckRange(Lcom/google/gwt/maps/client/geom/TileIndex;II)(
          arg0 || null, 
          arg1, 
          arg2);
    };
    jso.fromPixelToLatLng = function(arg0, arg1, arg2) {
      return this.__gwtPeer.@com.google.gwt.maps.client.geom.Projection::fromPixelToLatLng(Lcom/google/gwt/maps/client/geom/Point;IZ)(
          arg0 || null, 
          arg1, 
          !!arg2);
    };
    jso.fromLatLngToPixel = function(arg0, arg1) {
      return this.__gwtPeer.@com.google.gwt.maps.client.geom.Projection::fromLatLngToPixel(Lcom/google/gwt/maps/client/geom/LatLng;I)(
          arg0 || null, 
          arg1);
    };
    jso.getWrapWidth = function(arg0) {
      return this.__gwtPeer.@com.google.gwt.maps.client.geom.Projection::getWrapWidth(I)(
          arg0);
    };
  }-*/;
  public native boolean tileCheckRange(com.google.gwt.core.client.JavaScriptObject jsoPeer, com.google.gwt.maps.client.geom.TileIndex point, int zoomLevel, int tileSize) /*-{
    var jsReturn = jsoPeer.tileCheckRange(point, zoomLevel, tileSize);
    return !!jsReturn;
  }-*/;
  public native int getWrapWidth(com.google.gwt.core.client.JavaScriptObject jsoPeer, int zoomLevel) /*-{
    var jsReturn = jsoPeer.getWrapWidth(zoomLevel);
    return jsReturn;
  }-*/;
  public native com.google.gwt.core.client.JavaScriptObject constructMercatorProjection(int zoomLevels) /*-{
    var jsReturn = new $wnd.GMercatorProjection(zoomLevels);
    return jsReturn;
  }-*/;
  public native com.google.gwt.maps.client.geom.LatLng fromPixelToLatLng(com.google.gwt.core.client.JavaScriptObject jsoPeer, com.google.gwt.maps.client.geom.Point point, int zoomLevel, boolean unbounded) /*-{
    var jsReturn = jsoPeer.fromPixelToLatLng(point, zoomLevel, unbounded);
    return jsReturn || null;
  }-*/;
  public native com.google.gwt.maps.client.geom.Point fromLatLngToPixel(com.google.gwt.core.client.JavaScriptObject jsoPeer, com.google.gwt.maps.client.geom.LatLng latlng, int zoomLevel) /*-{
    var jsReturn = jsoPeer.fromLatLngToPixel(latlng, zoomLevel);
    return jsReturn || null;
  }-*/;
  public void bind(com.google.gwt.core.client.JavaScriptObject jso, com.google.gwt.maps.client.geom.Projection obj) {
    assert JSONWrapperUtil.hasField(jso, "tileCheckRange") : "Backing JSO missing imported function tileCheckRange";
    assert JSONWrapperUtil.hasField(jso, "getWrapWidth") : "Backing JSO missing imported function getWrapWidth";
    assert JSONWrapperUtil.hasField(jso, "fromPixelToLatLng") : "Backing JSO missing imported function fromPixelToLatLng";
    assert JSONWrapperUtil.hasField(jso, "fromLatLngToPixel") : "Backing JSO missing imported function fromLatLngToPixel";
    bindNative (jso,obj);
  }
  public native void bindNative (com.google.gwt.core.client.JavaScriptObject jso, com.google.gwt.maps.client.geom.Projection obj) /*-{
    if (jso.__gwtPeer) {
      @com.google.gwt.maps.jsio.client.impl.JSONWrapperUtil::throwMultipleWrapperException()();
    }
    jso.__gwtPeer = obj;
    jso.tileCheckRange = function(arg0, arg1, arg2) {
      return this.__gwtPeer.@com.google.gwt.maps.client.geom.Projection::tileCheckRange(Lcom/google/gwt/maps/client/geom/TileIndex;II)(
          arg0 || null, 
          arg1, 
          arg2);
    };
    jso.fromPixelToLatLng = function(arg0, arg1, arg2) {
      return this.__gwtPeer.@com.google.gwt.maps.client.geom.Projection::fromPixelToLatLng(Lcom/google/gwt/maps/client/geom/Point;IZ)(
          arg0 || null, 
          arg1, 
          !!arg2);
    };
    jso.fromLatLngToPixel = function(arg0, arg1) {
      return this.__gwtPeer.@com.google.gwt.maps.client.geom.Projection::fromLatLngToPixel(Lcom/google/gwt/maps/client/geom/LatLng;I)(
          arg0 || null, 
          arg1);
    };
    jso.getWrapWidth = function(arg0) {
      return this.__gwtPeer.@com.google.gwt.maps.client.geom.Projection::getWrapWidth(I)(
          arg0);
    };
  }-*/;
  public native com.google.gwt.core.client.JavaScriptObject construct() /*-{
    var jsReturn = new $wnd.GProjection();
    return jsReturn;
  }-*/;
}
