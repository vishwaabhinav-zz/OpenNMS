package com.google.gwt.maps.client.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.jsio.client.*;
import com.google.gwt.maps.jsio.client.impl.*;

public class __CopyrightCollectionImplImpl implements com.google.gwt.maps.client.impl.CopyrightCollectionImpl {
  public native void addCopyright(com.google.gwt.core.client.JavaScriptObject jsoPeer, com.google.gwt.maps.client.Copyright copyright) /*-{
    jsoPeer.addCopyright(copyright == null ? null : copyright.@com.google.gwt.maps.client.Copyright::jsoPeer);
  }-*/;
  public native com.google.gwt.core.client.JavaScriptObject getCopyrightNotice(com.google.gwt.core.client.JavaScriptObject jsoPeer, com.google.gwt.maps.client.geom.LatLngBounds bounds, int zoomLevel) /*-{
    var jsReturn = jsoPeer.getCopyrightNotice(bounds, zoomLevel);
    return jsReturn || null;
  }-*/;
  public native com.google.gwt.core.client.JavaScriptObject construct(java.lang.String prefix) /*-{
    var jsReturn = new $wnd.GCopyrightCollection(prefix);
    return jsReturn;
  }-*/;
  public native com.google.gwt.core.client.JavaScriptObject construct() /*-{
    var jsReturn = new $wnd.GCopyrightCollection();
    return jsReturn;
  }-*/;
  public native com.google.gwt.maps.jsio.client.JSList getCopyrights(com.google.gwt.core.client.JavaScriptObject jsoPeer, com.google.gwt.maps.client.geom.LatLngBounds bounds, int zoomLevel) /*-{
    var jsReturn = jsoPeer.getCopyrights(bounds, zoomLevel);
    return jsReturn == null ? null : (jsReturn.__gwtPeer || @com.google.gwt.maps.jsio.client.impl.JSStringListWrapper::create()().@com.google.gwt.maps.jsio.client.JSWrapper::setJavaScriptObject(Lcom/google/gwt/core/client/JavaScriptObject;)(jsReturn));
  }-*/;
}
