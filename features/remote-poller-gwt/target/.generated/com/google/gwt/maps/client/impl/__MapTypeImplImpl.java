package com.google.gwt.maps.client.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.jsio.client.*;
import com.google.gwt.maps.jsio.client.impl.*;

public class __MapTypeImplImpl implements com.google.gwt.maps.client.impl.MapTypeImpl {
  public native com.google.gwt.core.client.JavaScriptObject getMarsElevationMap() /*-{
    var jsReturn = $wnd.G_MARS_ELEVATION_MAP;
    return jsReturn;
  }-*/;
  public native com.google.gwt.core.client.JavaScriptObject getMoonMapTypes() /*-{
    var jsReturn = $wnd.G_MOON_MAP_TYPES;
    return jsReturn;
  }-*/;
  public native java.lang.String getLinkColor(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    var jsReturn = jsoPeer.getLinkColor();
    return jsReturn;
  }-*/;
  public native com.google.gwt.core.client.JavaScriptObject getMarsVisibleMap() /*-{
    var jsReturn = $wnd.G_MARS_VISIBLE_MAP;
    return jsReturn;
  }-*/;
  public native com.google.gwt.maps.jsio.client.JSList getTileLayers(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    var jsReturn = jsoPeer.getTileLayers();
    return jsReturn == null ? null : (jsReturn.__gwtPeer || @com.google.gwt.maps.jsio.client.impl.JSListWrapper::create(Lcom/google/gwt/maps/jsio/client/impl/Extractor;)(@com.google.gwt.maps.client.TileLayer::__extractor).@com.google.gwt.maps.jsio.client.JSWrapper::setJavaScriptObject(Lcom/google/gwt/core/client/JavaScriptObject;)(jsReturn));
  }-*/;
  public native java.lang.String getErrorMessage(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    var jsReturn = jsoPeer.getErrorMessage();
    return jsReturn;
  }-*/;
  public native int getTileSize(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    var jsReturn = jsoPeer.getTileSize();
    return jsReturn;
  }-*/;
  public native int getMinimumResolution(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    var jsReturn = jsoPeer.getMinimumResolution();
    return jsReturn;
  }-*/;
  public native com.google.gwt.core.client.JavaScriptObject construct(com.google.gwt.maps.jsio.client.JSList layers, com.google.gwt.maps.client.geom.Projection projection, java.lang.String name) /*-{
    var jsReturn = new $wnd.GMapType(layers == null ? null : layers.@com.google.gwt.maps.jsio.client.JSWrapper::getJavaScriptObject()(), projection == null ? null : projection.@com.google.gwt.maps.client.geom.Projection::jsoPeer, name);
    return jsReturn;
  }-*/;
  public native int getMaximumResolution(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    var jsReturn = jsoPeer.getMaximumResolution();
    return jsReturn;
  }-*/;
  public native com.google.gwt.core.client.JavaScriptObject getMapmakerMapTypes() /*-{
    var jsReturn = $wnd.G_MAPMAKER_MAP_TYPES;
    return jsReturn;
  }-*/;
  public native int getSpanZoomLevel(com.google.gwt.core.client.JavaScriptObject jsoPeer, com.google.gwt.maps.client.geom.LatLng center, com.google.gwt.maps.client.geom.LatLng span, com.google.gwt.maps.client.geom.Size viewSize) /*-{
    var jsReturn = jsoPeer.getSpanZoomLevel(center, span, viewSize);
    return jsReturn;
  }-*/;
  public native com.google.gwt.core.client.JavaScriptObject getNormalMapType() /*-{
    var jsReturn = $wnd.G_NORMAL_MAP;
    return jsReturn;
  }-*/;
  public native com.google.gwt.core.client.JavaScriptObject getAerialHybridMap() /*-{
    var jsReturn = $wnd.G_AERIAL_HYBRID_MAP;
    return jsReturn;
  }-*/;
  public native java.lang.String getTextColor(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    var jsReturn = jsoPeer.getTextColor();
    return jsReturn;
  }-*/;
  public native com.google.gwt.core.client.JavaScriptObject getSkyVisibleMap() /*-{
    var jsReturn = $wnd.G_SKY_VISIBLE_MAP;
    return jsReturn;
  }-*/;
  public native com.google.gwt.core.client.JavaScriptObject getMoonElevationMapType() /*-{
    var jsReturn = $wnd.G_MOON_ELEVATION_MAP;
    return jsReturn;
  }-*/;
  public native com.google.gwt.core.client.JavaScriptObject construct(com.google.gwt.maps.jsio.client.JSList layers, com.google.gwt.maps.client.geom.Projection projection, java.lang.String name, com.google.gwt.maps.client.MapTypeOptions opts) /*-{
    var jsReturn = new $wnd.GMapType(layers == null ? null : layers.@com.google.gwt.maps.jsio.client.JSWrapper::getJavaScriptObject()(), projection == null ? null : projection.@com.google.gwt.maps.client.geom.Projection::jsoPeer, name, opts == null ? null : opts.@com.google.gwt.maps.client.MapTypeOptions::jsoPeer);
    return jsReturn;
  }-*/;
  public native com.google.gwt.core.client.JavaScriptObject getHybridMapType() /*-{
    var jsReturn = $wnd.G_HYBRID_MAP;
    return jsReturn;
  }-*/;
  public native java.lang.String getUrlArg(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    var jsReturn = jsoPeer.getUrlArg();
    return jsReturn;
  }-*/;
  public native com.google.gwt.core.client.JavaScriptObject getMarsInfraredMap() /*-{
    var jsReturn = $wnd.G_MARS_INFRARED_MAP;
    return jsReturn;
  }-*/;
  public native com.google.gwt.core.client.JavaScriptObject getEarthMapType() /*-{
    var jsReturn = $wnd.G_SATELLITE_3D_MAP;
    return jsReturn;
  }-*/;
  public native com.google.gwt.core.client.JavaScriptObject getMapmakerNormalMap() /*-{
    var jsReturn = $wnd.G_MAPMAKER_NORMAL_MAP;
    return jsReturn;
  }-*/;
  public native com.google.gwt.core.client.JavaScriptObject getSatelliteMapType() /*-{
    var jsReturn = $wnd.G_SATELLITE_MAP;
    return jsReturn;
  }-*/;
  public native java.lang.String getName(com.google.gwt.core.client.JavaScriptObject jsoPeer, boolean shortName) /*-{
    var jsReturn = jsoPeer.getName(shortName);
    return jsReturn;
  }-*/;
  public native java.lang.String getAlt(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    var jsReturn = jsoPeer.getAlt();
    return jsReturn;
  }-*/;
  public native com.google.gwt.core.client.JavaScriptObject getMoonVisibleMap() /*-{
    var jsReturn = $wnd.G_MOON_VISIBLE_MAP;
    return jsReturn;
  }-*/;
  public void bind(com.google.gwt.core.client.JavaScriptObject jso, com.google.gwt.maps.client.MapType obj) {
    assert JSONWrapperUtil.hasField(jso, "getLinkColor") : "Backing JSO missing imported function getLinkColor";
    assert JSONWrapperUtil.hasField(jso, "getTileLayers") : "Backing JSO missing imported function getTileLayers";
    assert JSONWrapperUtil.hasField(jso, "getErrorMessage") : "Backing JSO missing imported function getErrorMessage";
    assert JSONWrapperUtil.hasField(jso, "getTileSize") : "Backing JSO missing imported function getTileSize";
    assert JSONWrapperUtil.hasField(jso, "getMinimumResolution") : "Backing JSO missing imported function getMinimumResolution";
    assert JSONWrapperUtil.hasField(jso, "getMaximumResolution") : "Backing JSO missing imported function getMaximumResolution";
    assert JSONWrapperUtil.hasField(jso, "getSpanZoomLevel") : "Backing JSO missing imported function getSpanZoomLevel";
    assert JSONWrapperUtil.hasField(jso, "getTextColor") : "Backing JSO missing imported function getTextColor";
    assert JSONWrapperUtil.hasField(jso, "getUrlArg") : "Backing JSO missing imported function getUrlArg";
    assert JSONWrapperUtil.hasField(jso, "getName") : "Backing JSO missing imported function getName";
    assert JSONWrapperUtil.hasField(jso, "getAlt") : "Backing JSO missing imported function getAlt";
    assert JSONWrapperUtil.hasField(jso, "getProjection") : "Backing JSO missing imported function getProjection";
    assert JSONWrapperUtil.hasField(jso, "getBoundsZoomLevel") : "Backing JSO missing imported function getBoundsZoomLevel";
    assert JSONWrapperUtil.hasField(jso, "getCopyrights") : "Backing JSO missing imported function getCopyrights";
    bindNative (jso,obj);
  }
  public native void bindNative (com.google.gwt.core.client.JavaScriptObject jso, com.google.gwt.maps.client.MapType obj) /*-{
    if (jso.__gwtPeer) {
      @com.google.gwt.maps.jsio.client.impl.JSONWrapperUtil::throwMultipleWrapperException()();
    }
    jso.__gwtPeer = obj;
  }-*/;
  public native com.google.gwt.maps.client.geom.Projection getProjection(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    var jsReturn = jsoPeer.getProjection();
    return jsReturn == null ? null : (jsReturn.__gwtPeer || @com.google.gwt.maps.client.geom.Projection::createPeer(Lcom/google/gwt/core/client/JavaScriptObject;)(jsReturn));
  }-*/;
  public native com.google.gwt.core.client.JavaScriptObject getAerialMap() /*-{
    var jsReturn = $wnd.G_AERIAL_MAP;
    return jsReturn;
  }-*/;
  public native com.google.gwt.core.client.JavaScriptObject getDefaultMapTypes() /*-{
    var jsReturn = $wnd.G_DEFAULT_MAP_TYPES;
    return jsReturn;
  }-*/;
  public native com.google.gwt.core.client.JavaScriptObject getMapmakerHybridMap() /*-{
    var jsReturn = $wnd.G_MAPMAKER_HYBRID_MAP;
    return jsReturn;
  }-*/;
  public native int getBoundsZoomLevel(com.google.gwt.core.client.JavaScriptObject jsoPeer, com.google.gwt.maps.client.geom.LatLngBounds bounds, com.google.gwt.maps.client.geom.Size viewSize) /*-{
    var jsReturn = jsoPeer.getBoundsZoomLevel(bounds, viewSize);
    return jsReturn;
  }-*/;
  public native com.google.gwt.core.client.JavaScriptObject getPhysicalMapType() /*-{
    var jsReturn = $wnd.G_PHYSICAL_MAP;
    return jsReturn;
  }-*/;
  public native com.google.gwt.maps.jsio.client.JSList getCopyrights(com.google.gwt.core.client.JavaScriptObject jsoPeer, com.google.gwt.maps.client.geom.LatLngBounds bounds, int zoomLevel) /*-{
    var jsReturn = jsoPeer.getCopyrights(bounds, zoomLevel);
    return jsReturn == null ? null : (jsReturn.__gwtPeer || @com.google.gwt.maps.jsio.client.impl.JSStringListWrapper::create()().@com.google.gwt.maps.jsio.client.JSWrapper::setJavaScriptObject(Lcom/google/gwt/core/client/JavaScriptObject;)(jsReturn));
  }-*/;
  public native com.google.gwt.core.client.JavaScriptObject getSkyMapTypes() /*-{
    var jsReturn = $wnd.G_SKY_MAP_TYPES;
    return jsReturn;
  }-*/;
}
