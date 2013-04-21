package com.google.gwt.maps.client.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.jsio.client.*;
import com.google.gwt.maps.jsio.client.impl.*;

public class __JsUtil__ListGeneratorImpl implements com.google.gwt.maps.client.impl.JsUtil.ListGenerator {
  public native com.google.gwt.maps.jsio.client.JSList asStringList(com.google.gwt.core.client.JavaScriptObject jso) /*-{
    var jsReturn = jso.valueOf();
    return jsReturn == null ? null : (jsReturn.__gwtPeer || @com.google.gwt.maps.jsio.client.impl.JSStringListWrapper::create()().@com.google.gwt.maps.jsio.client.JSWrapper::setJavaScriptObject(Lcom/google/gwt/core/client/JavaScriptObject;)(jsReturn));
  }-*/;
  public native com.google.gwt.maps.jsio.client.JSList asMarkerList(com.google.gwt.core.client.JavaScriptObject jso) /*-{
    var jsReturn = jso.valueOf();
    return jsReturn == null ? null : (jsReturn.__gwtPeer || @com.google.gwt.maps.jsio.client.impl.JSListWrapper::create(Lcom/google/gwt/maps/jsio/client/impl/Extractor;)(@com.google.gwt.maps.client.overlay.Marker::__extractor).@com.google.gwt.maps.jsio.client.JSWrapper::setJavaScriptObject(Lcom/google/gwt/core/client/JavaScriptObject;)(jsReturn));
  }-*/;
  public native com.google.gwt.maps.jsio.client.JSList asIntegerList(com.google.gwt.core.client.JavaScriptObject jso) /*-{
    var jsReturn = jso.valueOf();
    return jsReturn == null ? null : (jsReturn.__gwtPeer || @com.google.gwt.maps.jsio.client.impl.JSListWrapper::create(Lcom/google/gwt/maps/jsio/client/impl/Extractor;)(@com.google.gwt.maps.jsio.client.impl.JSONWrapperUtil::INTEGER_EXTRACTOR).@com.google.gwt.maps.jsio.client.JSWrapper::setJavaScriptObject(Lcom/google/gwt/core/client/JavaScriptObject;)(jsReturn));
  }-*/;
  public native com.google.gwt.maps.jsio.client.JSList asInfoWindowTabList(com.google.gwt.core.client.JavaScriptObject jso) /*-{
    var jsReturn = jso.valueOf();
    return jsReturn == null ? null : (jsReturn.__gwtPeer || @com.google.gwt.maps.jsio.client.impl.JSListWrapper::create(Lcom/google/gwt/maps/jsio/client/impl/Extractor;)(@com.google.gwt.maps.client.InfoWindowContent.InfoWindowTab::__extractor).@com.google.gwt.maps.jsio.client.JSWrapper::setJavaScriptObject(Lcom/google/gwt/core/client/JavaScriptObject;)(jsReturn));
  }-*/;
  public native com.google.gwt.core.client.JavaScriptObject newArray() /*-{
    var jsReturn = new Array();
    return jsReturn;
  }-*/;
  public native com.google.gwt.maps.jsio.client.JSList asTileLayerList(com.google.gwt.core.client.JavaScriptObject jso) /*-{
    var jsReturn = jso.valueOf();
    return jsReturn == null ? null : (jsReturn.__gwtPeer || @com.google.gwt.maps.jsio.client.impl.JSListWrapper::create(Lcom/google/gwt/maps/jsio/client/impl/Extractor;)(@com.google.gwt.maps.client.TileLayer::__extractor).@com.google.gwt.maps.jsio.client.JSWrapper::setJavaScriptObject(Lcom/google/gwt/core/client/JavaScriptObject;)(jsReturn));
  }-*/;
}
