package com.google.gwt.maps.client.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.jsio.client.*;
import com.google.gwt.maps.jsio.client.impl.*;

public class __InfoWindowImplImpl implements com.google.gwt.maps.client.impl.InfoWindowImpl {
  public native void maximize(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    jsoPeer.maximize();
  }-*/;
  public native void reset(com.google.gwt.core.client.JavaScriptObject jsoPeer, com.google.gwt.maps.client.geom.LatLng point, com.google.gwt.maps.jsio.client.JSList tabs, com.google.gwt.maps.client.geom.Size size, com.google.gwt.maps.client.geom.Size offset, int selectedTab) /*-{
    jsoPeer.reset(point, tabs == null ? null : tabs.@com.google.gwt.maps.jsio.client.JSWrapper::getJavaScriptObject()(), size, offset, selectedTab);
  }-*/;
  public native void show(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    jsoPeer.show();
  }-*/;
  public native void selectTab(com.google.gwt.core.client.JavaScriptObject jsoPeer, int index) /*-{
    jsoPeer.selectTab(index);
  }-*/;
  public native void reset(com.google.gwt.core.client.JavaScriptObject jsoPeer, com.google.gwt.maps.client.geom.LatLng point, com.google.gwt.maps.jsio.client.JSList tabs, com.google.gwt.maps.client.geom.Size size) /*-{
    jsoPeer.reset(point, tabs == null ? null : tabs.@com.google.gwt.maps.jsio.client.JSWrapper::getJavaScriptObject()(), size);
  }-*/;
  public native com.google.gwt.core.client.JavaScriptObject createInfoWindowTab(java.lang.String label, com.google.gwt.user.client.Element content) /*-{
    var jsReturn = new $wnd.GInfoWindowTab(label, content);
    return jsReturn;
  }-*/;
  public native boolean isHidden(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    var jsReturn = jsoPeer.isHidden();
    return !!jsReturn;
  }-*/;
  public native void hide(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    jsoPeer.hide();
  }-*/;
  public native void enableMaximize(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    jsoPeer.enableMaximize();
  }-*/;
  public native com.google.gwt.maps.client.geom.LatLng getPoint(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    var jsReturn = jsoPeer.getPoint();
    return jsReturn || null;
  }-*/;
  public native void reset(com.google.gwt.core.client.JavaScriptObject jsoPeer, com.google.gwt.maps.client.geom.LatLng point, com.google.gwt.maps.jsio.client.JSList tabs, com.google.gwt.maps.client.geom.Size size, com.google.gwt.maps.client.geom.Size offset) /*-{
    jsoPeer.reset(point, tabs == null ? null : tabs.@com.google.gwt.maps.jsio.client.JSWrapper::getJavaScriptObject()(), size, offset);
  }-*/;
  public native void disableMaximize(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    jsoPeer.disableMaximize();
  }-*/;
  public native com.google.gwt.maps.jsio.client.JSList getContentContainers(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    var jsReturn = jsoPeer.getContentContainers();
    return jsReturn == null ? null : (jsReturn.__gwtPeer || @com.google.gwt.maps.jsio.client.impl.JSListWrapper::create(Lcom/google/gwt/maps/jsio/client/impl/Extractor;)(@com.google.gwt.maps.jsio.client.impl.JSONWrapperUtil::JSO_EXTRACTOR).@com.google.gwt.maps.jsio.client.JSWrapper::setJavaScriptObject(Lcom/google/gwt/core/client/JavaScriptObject;)(jsReturn));
  }-*/;
  public native void restore(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    jsoPeer.restore();
  }-*/;
  public native com.google.gwt.maps.client.geom.Size getPixelOffset(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    var jsReturn = jsoPeer.getPixelOffset();
    return jsReturn || null;
  }-*/;
  public native com.google.gwt.core.client.JavaScriptObject createInfoWindowTab(java.lang.String label, java.lang.String content) /*-{
    var jsReturn = new $wnd.GInfoWindowTab(label, content);
    return jsReturn;
  }-*/;
  public native int getSelectedTab(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    var jsReturn = jsoPeer.getSelectedTab();
    return jsReturn;
  }-*/;
}
