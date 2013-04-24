package com.google.gwt.maps.client.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.jsio.client.*;
import com.google.gwt.maps.jsio.client.impl.*;

public class __InfoWindowOptionsImplImpl implements com.google.gwt.maps.client.impl.InfoWindowOptionsImpl {
  public native void setMaxWidth(com.google.gwt.core.client.JavaScriptObject jsoPeer, int maxWidth) /*-{
    jsoPeer.maxWidth = maxWidth;
  }-*/;
  public native void setMaxTitleString(com.google.gwt.core.client.JavaScriptObject jsoPeer, java.lang.String windowMaximizedTitle) /*-{
    jsoPeer.maxTitle = windowMaximizedTitle;
  }-*/;
  public native void setMapType(com.google.gwt.core.client.JavaScriptObject jsoPeer, com.google.gwt.maps.client.MapType mapType) /*-{
    jsoPeer.mapType = mapType == null ? null : mapType.@com.google.gwt.maps.client.MapType::jsoPeer;
  }-*/;
  public native void setZoomLevel(com.google.gwt.core.client.JavaScriptObject jsoPeer, int zoomLevel) /*-{
    jsoPeer.zoomLevel = zoomLevel;
  }-*/;
  public native void setSelectedTab(com.google.gwt.core.client.JavaScriptObject jsoPeer, int tab) /*-{
    jsoPeer.selectedTab = tab;
  }-*/;
  public native void setNoCloseOnClick(com.google.gwt.core.client.JavaScriptObject jsoPeer, boolean noCloseFlag) /*-{
    jsoPeer.noCloseOnClick = noCloseFlag;
  }-*/;
  public native void setMaxTitleElement(com.google.gwt.core.client.JavaScriptObject jsoPeer, com.google.gwt.core.client.JavaScriptObject maximizedTitleWidget) /*-{
    jsoPeer.maxTitle = maximizedTitleWidget;
  }-*/;
  public native com.google.gwt.core.client.JavaScriptObject construct() /*-{
    var jsReturn = new Object();
    return jsReturn;
  }-*/;
  public native void setMaxContentElement(com.google.gwt.core.client.JavaScriptObject jsoPeer, com.google.gwt.core.client.JavaScriptObject maximizedContentWidget) /*-{
    jsoPeer.maxContent = maximizedContentWidget;
  }-*/;
  public native void setOnOpenFn(com.google.gwt.core.client.JavaScriptObject jsoPeer, com.google.gwt.maps.client.impl.EventImpl.VoidCallback openFunction) /*-{
    jsoPeer.onOpenFn = (openFunction.@com.google.gwt.maps.jsio.client.JSFunction::exportedFunction || (openFunction.@com.google.gwt.maps.jsio.client.JSFunction::exportedFunction = function() {
      return openFunction.@com.google.gwt.maps.client.impl.EventImpl.VoidCallback::callbackWrapper()(
      );
    }));
  }-*/;
  public native void setOnCloseFn(com.google.gwt.core.client.JavaScriptObject jsoPeer, com.google.gwt.maps.client.impl.EventImpl.VoidCallback closeFunction) /*-{
    jsoPeer.onCloseFn = (closeFunction.@com.google.gwt.maps.jsio.client.JSFunction::exportedFunction || (closeFunction.@com.google.gwt.maps.jsio.client.JSFunction::exportedFunction = function() {
      return closeFunction.@com.google.gwt.maps.client.impl.EventImpl.VoidCallback::callbackWrapper()(
      );
    }));
  }-*/;
  public native void setMaxContentString(com.google.gwt.core.client.JavaScriptObject jsoPeer, java.lang.String windowMaximizedContent) /*-{
    jsoPeer.maxContent = windowMaximizedContent;
  }-*/;
}
