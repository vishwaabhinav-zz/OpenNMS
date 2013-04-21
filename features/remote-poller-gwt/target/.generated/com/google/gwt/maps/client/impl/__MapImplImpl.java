package com.google.gwt.maps.client.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.jsio.client.*;
import com.google.gwt.maps.jsio.client.impl.*;

public class __MapImplImpl implements com.google.gwt.maps.client.impl.MapImpl {
  public native void setCenter(com.google.gwt.core.client.JavaScriptObject jsoPeer, com.google.gwt.maps.client.geom.LatLng center) /*-{
    jsoPeer.setCenter(center);
  }-*/;
  public native void enableContinuousZoom(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    jsoPeer.enableContinuousZoom();
  }-*/;
  public native com.google.gwt.maps.client.geom.Size getSize(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    var jsReturn = jsoPeer.getSize();
    return jsReturn || null;
  }-*/;
  public native boolean infoWindowEnabled(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    var jsReturn = jsoPeer.infoWindowEnabled();
    return !!jsReturn;
  }-*/;
  public native boolean pinchToZoomEnabled(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    var jsReturn = jsoPeer.pinchToZoomEnabled();
    return !!jsReturn;
  }-*/;
  public native boolean scrollWheelZoomEnabled(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    var jsReturn = jsoPeer.scrollWheelZoomEnabled();
    return !!jsReturn;
  }-*/;
  public native void panTo(com.google.gwt.core.client.JavaScriptObject jsoPeer, com.google.gwt.maps.client.geom.LatLng center) /*-{
    jsoPeer.panTo(center);
  }-*/;
  public native void panBy(com.google.gwt.core.client.JavaScriptObject jsoPeer, com.google.gwt.maps.client.geom.Size distance) /*-{
    jsoPeer.panBy(distance);
  }-*/;
  public native void disableDragging(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    jsoPeer.disableDragging();
  }-*/;
  public void bind(com.google.gwt.core.client.JavaScriptObject jso, com.google.gwt.maps.client.MapWidget obj) {
    assert JSONWrapperUtil.hasField(jso, "setCenter") : "Backing JSO missing imported function setCenter";
    assert JSONWrapperUtil.hasField(jso, "enableContinuousZoom") : "Backing JSO missing imported function enableContinuousZoom";
    assert JSONWrapperUtil.hasField(jso, "getSize") : "Backing JSO missing imported function getSize";
    assert JSONWrapperUtil.hasField(jso, "infoWindowEnabled") : "Backing JSO missing imported function infoWindowEnabled";
    assert JSONWrapperUtil.hasField(jso, "pinchToZoomEnabled") : "Backing JSO missing imported function pinchToZoomEnabled";
    assert JSONWrapperUtil.hasField(jso, "scrollWheelZoomEnabled") : "Backing JSO missing imported function scrollWheelZoomEnabled";
    assert JSONWrapperUtil.hasField(jso, "panTo") : "Backing JSO missing imported function panTo";
    assert JSONWrapperUtil.hasField(jso, "panBy") : "Backing JSO missing imported function panBy";
    assert JSONWrapperUtil.hasField(jso, "disableDragging") : "Backing JSO missing imported function disableDragging";
    assert JSONWrapperUtil.hasField(jso, "disableContinuousZoom") : "Backing JSO missing imported function disableContinuousZoom";
    assert JSONWrapperUtil.hasField(jso, "fromContainerPixelToLatLng") : "Backing JSO missing imported function fromContainerPixelToLatLng";
    assert JSONWrapperUtil.hasField(jso, "setCenter") : "Backing JSO missing imported function setCenter";
    assert JSONWrapperUtil.hasField(jso, "panDirection") : "Backing JSO missing imported function panDirection";
    assert JSONWrapperUtil.hasField(jso, "fromDivPixelToLatLng") : "Backing JSO missing imported function fromDivPixelToLatLng";
    assert JSONWrapperUtil.hasField(jso, "setCenter") : "Backing JSO missing imported function setCenter";
    assert JSONWrapperUtil.hasField(jso, "getDragObject") : "Backing JSO missing imported function getDragObject";
    assert JSONWrapperUtil.hasField(jso, "openInfoWindow") : "Backing JSO missing imported function openInfoWindow";
    assert JSONWrapperUtil.hasField(jso, "showMapBlowup") : "Backing JSO missing imported function showMapBlowup";
    assert JSONWrapperUtil.hasField(jso, "disablePinchToZoom") : "Backing JSO missing imported function disablePinchToZoom";
    assert JSONWrapperUtil.hasField(jso, "closeInfoWindow") : "Backing JSO missing imported function closeInfoWindow";
    assert JSONWrapperUtil.hasField(jso, "setUIToDefault") : "Backing JSO missing imported function setUIToDefault";
    assert JSONWrapperUtil.hasField(jso, "clearOverlays") : "Backing JSO missing imported function clearOverlays";
    assert JSONWrapperUtil.hasField(jso, "openInfoWindow") : "Backing JSO missing imported function openInfoWindow";
    assert JSONWrapperUtil.hasField(jso, "getCenter") : "Backing JSO missing imported function getCenter";
    assert JSONWrapperUtil.hasField(jso, "disableDoubleClickZoom") : "Backing JSO missing imported function disableDoubleClickZoom";
    assert JSONWrapperUtil.hasField(jso, "getMapTypes") : "Backing JSO missing imported function getMapTypes";
    assert JSONWrapperUtil.hasField(jso, "closeInfoWindow") : "Backing JSO missing imported function closeInfoWindow";
    assert JSONWrapperUtil.hasField(jso, "enableScrollWheelZoom") : "Backing JSO missing imported function enableScrollWheelZoom";
    assert JSONWrapperUtil.hasField(jso, "addControl") : "Backing JSO missing imported function addControl";
    assert JSONWrapperUtil.hasField(jso, "getDefaultUI") : "Backing JSO missing imported function getDefaultUI";
    assert JSONWrapperUtil.hasField(jso, "enablePinchToZoom") : "Backing JSO missing imported function enablePinchToZoom";
    assert JSONWrapperUtil.hasField(jso, "fromLatLngToContainerPixel") : "Backing JSO missing imported function fromLatLngToContainerPixel";
    assert JSONWrapperUtil.hasField(jso, "setZoom") : "Backing JSO missing imported function setZoom";
    assert JSONWrapperUtil.hasField(jso, "removeOverlay") : "Backing JSO missing imported function removeOverlay";
    assert JSONWrapperUtil.hasField(jso, "getZoom") : "Backing JSO missing imported function getZoom";
    assert JSONWrapperUtil.hasField(jso, "enableInfoWindow") : "Backing JSO missing imported function enableInfoWindow";
    assert JSONWrapperUtil.hasField(jso, "openInfoWindowTabs") : "Backing JSO missing imported function openInfoWindowTabs";
    assert JSONWrapperUtil.hasField(jso, "disableInfoWindow") : "Backing JSO missing imported function disableInfoWindow";
    assert JSONWrapperUtil.hasField(jso, "removeMapType") : "Backing JSO missing imported function removeMapType";
    assert JSONWrapperUtil.hasField(jso, "setMapType") : "Backing JSO missing imported function setMapType";
    assert JSONWrapperUtil.hasField(jso, "addOverlay") : "Backing JSO missing imported function addOverlay";
    assert JSONWrapperUtil.hasField(jso, "getCurrentMapType") : "Backing JSO missing imported function getCurrentMapType";
    assert JSONWrapperUtil.hasField(jso, "setUI") : "Backing JSO missing imported function setUI";
    assert JSONWrapperUtil.hasField(jso, "doubleClickZoomEnabled") : "Backing JSO missing imported function doubleClickZoomEnabled";
    assert JSONWrapperUtil.hasField(jso, "continuousZoomEnabled") : "Backing JSO missing imported function continuousZoomEnabled";
    assert JSONWrapperUtil.hasField(jso, "enableGoogleBar") : "Backing JSO missing imported function enableGoogleBar";
    assert JSONWrapperUtil.hasField(jso, "removeControl") : "Backing JSO missing imported function removeControl";
    assert JSONWrapperUtil.hasField(jso, "zoomIn") : "Backing JSO missing imported function zoomIn";
    assert JSONWrapperUtil.hasField(jso, "fromLatLngToDivPixel") : "Backing JSO missing imported function fromLatLngToDivPixel";
    assert JSONWrapperUtil.hasField(jso, "returnToSavedPosition") : "Backing JSO missing imported function returnToSavedPosition";
    assert JSONWrapperUtil.hasField(jso, "getBoundsZoomLevel") : "Backing JSO missing imported function getBoundsZoomLevel";
    assert JSONWrapperUtil.hasField(jso, "getEarthInstance") : "Backing JSO missing imported function getEarthInstance";
    assert JSONWrapperUtil.hasField(jso, "zoomOut") : "Backing JSO missing imported function zoomOut";
    assert JSONWrapperUtil.hasField(jso, "enableDragging") : "Backing JSO missing imported function enableDragging";
    assert JSONWrapperUtil.hasField(jso, "getInfoWindow") : "Backing JSO missing imported function getInfoWindow";
    assert JSONWrapperUtil.hasField(jso, "getBounds") : "Backing JSO missing imported function getBounds";
    assert JSONWrapperUtil.hasField(jso, "isLoaded") : "Backing JSO missing imported function isLoaded";
    assert JSONWrapperUtil.hasField(jso, "draggingEnabled") : "Backing JSO missing imported function draggingEnabled";
    assert JSONWrapperUtil.hasField(jso, "getPane") : "Backing JSO missing imported function getPane";
    assert JSONWrapperUtil.hasField(jso, "checkResize") : "Backing JSO missing imported function checkResize";
    assert JSONWrapperUtil.hasField(jso, "savePosition") : "Backing JSO missing imported function savePosition";
    assert JSONWrapperUtil.hasField(jso, "enableDoubleClickZoom") : "Backing JSO missing imported function enableDoubleClickZoom";
    assert JSONWrapperUtil.hasField(jso, "addMapType") : "Backing JSO missing imported function addMapType";
    assert JSONWrapperUtil.hasField(jso, "disableScrollWheelZoom") : "Backing JSO missing imported function disableScrollWheelZoom";
    assert JSONWrapperUtil.hasField(jso, "addControl") : "Backing JSO missing imported function addControl";
    assert JSONWrapperUtil.hasField(jso, "disableGoogleBar") : "Backing JSO missing imported function disableGoogleBar";
    bindNative (jso,obj);
  }
  public native void bindNative (com.google.gwt.core.client.JavaScriptObject jso, com.google.gwt.maps.client.MapWidget obj) /*-{
    if (jso.__gwtPeer) {
      @com.google.gwt.maps.jsio.client.impl.JSONWrapperUtil::throwMultipleWrapperException()();
    }
    jso.__gwtPeer = obj;
  }-*/;
  public native void disableContinuousZoom(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    jsoPeer.disableContinuousZoom();
  }-*/;
  public native com.google.gwt.maps.client.geom.LatLng fromContainerPixelToLatLng(com.google.gwt.core.client.JavaScriptObject jsoPeer, com.google.gwt.maps.client.geom.Point pixel) /*-{
    var jsReturn = jsoPeer.fromContainerPixelToLatLng(pixel);
    return jsReturn || null;
  }-*/;
  public native void setCenter(com.google.gwt.core.client.JavaScriptObject jsoPeer, com.google.gwt.maps.client.geom.LatLng center, int zoom, com.google.gwt.maps.client.MapType type) /*-{
    jsoPeer.setCenter(center, zoom, type == null ? null : type.@com.google.gwt.maps.client.MapType::jsoPeer);
  }-*/;
  public native void panDirection(com.google.gwt.core.client.JavaScriptObject jsoPeer, int dx, int dy) /*-{
    jsoPeer.panDirection(dx, dy);
  }-*/;
  public native com.google.gwt.core.client.JavaScriptObject installKeyboardHandler(com.google.gwt.maps.client.MapWidget map) /*-{
    var jsReturn = new $wnd.GKeyboardHandler(map == null ? null : map.@com.google.gwt.maps.client.MapWidget::jsoPeer);
    return jsReturn;
  }-*/;
  public native com.google.gwt.maps.client.geom.LatLng fromDivPixelToLatLng(com.google.gwt.core.client.JavaScriptObject jsoPeer, com.google.gwt.maps.client.geom.Point pixel) /*-{
    var jsReturn = jsoPeer.fromDivPixelToLatLng(pixel);
    return jsReturn || null;
  }-*/;
  public native void setCenter(com.google.gwt.core.client.JavaScriptObject jsoPeer, com.google.gwt.maps.client.geom.LatLng center, int zoom) /*-{
    jsoPeer.setCenter(center, zoom);
  }-*/;
  public native com.google.gwt.maps.client.DraggableObject getDragObject(com.google.gwt.core.client.JavaScriptObject jsoPeerPeer) /*-{
    var jsReturn = jsoPeerPeer.getDragObject();
    return jsReturn || null;
  }-*/;
  public native void openInfoWindow(com.google.gwt.maps.client.MapWidget map, com.google.gwt.maps.client.geom.LatLng point, com.google.gwt.core.client.JavaScriptObject content, com.google.gwt.core.client.JavaScriptObject options) /*-{
    map.@com.google.gwt.maps.client.MapWidget::jsoPeer.openInfoWindow(point, content, options);
  }-*/;
  public native void showMapBlowup(com.google.gwt.maps.client.MapWidget map, com.google.gwt.maps.client.geom.LatLng point, com.google.gwt.core.client.JavaScriptObject options) /*-{
    map.@com.google.gwt.maps.client.MapWidget::jsoPeer.showMapBlowup(point, options);
  }-*/;
  public native void disablePinchToZoom(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    jsoPeer.disablePinchToZoom();
  }-*/;
  public native void closeInfoWindow(com.google.gwt.maps.client.MapWidget map) /*-{
    map.@com.google.gwt.maps.client.MapWidget::jsoPeer.closeInfoWindow();
  }-*/;
  public native void setUIToDefault(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    jsoPeer.setUIToDefault();
  }-*/;
  public native void clearOverlays(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    jsoPeer.clearOverlays();
  }-*/;
  public native void openInfoWindow(com.google.gwt.maps.client.MapWidget map, com.google.gwt.maps.client.geom.LatLng point, java.lang.String content, com.google.gwt.core.client.JavaScriptObject options) /*-{
    map.@com.google.gwt.maps.client.MapWidget::jsoPeer.openInfoWindow(point, content, options);
  }-*/;
  public native com.google.gwt.maps.client.geom.LatLng getCenter(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    var jsReturn = jsoPeer.getCenter();
    return jsReturn || null;
  }-*/;
  public native void disableDoubleClickZoom(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    jsoPeer.disableDoubleClickZoom();
  }-*/;
  public native com.google.gwt.maps.jsio.client.JSList getMapTypes(com.google.gwt.core.client.JavaScriptObject jsoPeerPeer) /*-{
    var jsReturn = jsoPeerPeer.getMapTypes();
    return jsReturn == null ? null : (jsReturn.__gwtPeer || @com.google.gwt.maps.jsio.client.impl.JSListWrapper::create(Lcom/google/gwt/maps/jsio/client/impl/Extractor;)(@com.google.gwt.maps.client.MapType::__extractor).@com.google.gwt.maps.jsio.client.JSWrapper::setJavaScriptObject(Lcom/google/gwt/core/client/JavaScriptObject;)(jsReturn));
  }-*/;
  public native void closeInfoWindow(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    jsoPeer.closeInfoWindow();
  }-*/;
  public native void enableScrollWheelZoom(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    jsoPeer.enableScrollWheelZoom();
  }-*/;
  public native void addControl(com.google.gwt.core.client.JavaScriptObject jsoPeer, com.google.gwt.maps.client.control.Control control) /*-{
    jsoPeer.addControl(control == null ? null : control.@com.google.gwt.maps.client.control.Control::jsoPeer);
  }-*/;
  public native com.google.gwt.maps.client.MapUIOptions getDefaultUI(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    var jsReturn = jsoPeer.getDefaultUI();
    return jsReturn || null;
  }-*/;
  public native com.google.gwt.core.client.JavaScriptObject construct(com.google.gwt.user.client.Element container, com.google.gwt.core.client.JavaScriptObject mapOptions) /*-{
    var jsReturn = new $wnd.GMap2(container, mapOptions);
    return jsReturn;
  }-*/;
  public native void enablePinchToZoom(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    jsoPeer.enablePinchToZoom();
  }-*/;
  public native com.google.gwt.maps.client.geom.Point fromLatLngToContainerPixel(com.google.gwt.core.client.JavaScriptObject jsoPeer, com.google.gwt.maps.client.geom.LatLng latlng) /*-{
    var jsReturn = jsoPeer.fromLatLngToContainerPixel(latlng);
    return jsReturn || null;
  }-*/;
  public native void setZoom(com.google.gwt.core.client.JavaScriptObject jsoPeer, int level) /*-{
    jsoPeer.setZoom(level);
  }-*/;
  public native void removeOverlay(com.google.gwt.core.client.JavaScriptObject jsoPeer, com.google.gwt.maps.client.overlay.Overlay overlay) /*-{
    jsoPeer.removeOverlay(overlay == null ? null : overlay.@com.google.gwt.maps.client.overlay.Overlay::jsoPeer);
  }-*/;
  public native int getZoom(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    var jsReturn = jsoPeer.getZoom();
    return jsReturn;
  }-*/;
  public native void enableInfoWindow(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    jsoPeer.enableInfoWindow();
  }-*/;
  public native void openInfoWindowTabs(com.google.gwt.maps.client.MapWidget map, com.google.gwt.maps.client.geom.LatLng point, com.google.gwt.core.client.JavaScriptObject content, com.google.gwt.core.client.JavaScriptObject options) /*-{
    map.@com.google.gwt.maps.client.MapWidget::jsoPeer.openInfoWindowTabs(point, content, options);
  }-*/;
  public native void disableInfoWindow(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    jsoPeer.disableInfoWindow();
  }-*/;
  public native void removeMapType(com.google.gwt.core.client.JavaScriptObject jsoPeerPeer, com.google.gwt.maps.client.MapType type) /*-{
    jsoPeerPeer.removeMapType(type == null ? null : type.@com.google.gwt.maps.client.MapType::jsoPeer);
  }-*/;
  public native void setMapType(com.google.gwt.core.client.JavaScriptObject jsoPeerPeer, com.google.gwt.maps.client.MapType type) /*-{
    jsoPeerPeer.setMapType(type == null ? null : type.@com.google.gwt.maps.client.MapType::jsoPeer);
  }-*/;
  public native void addOverlay(com.google.gwt.core.client.JavaScriptObject jsoPeer, com.google.gwt.maps.client.overlay.Overlay overlay) /*-{
    jsoPeer.addOverlay(overlay == null ? null : overlay.@com.google.gwt.maps.client.overlay.Overlay::jsoPeer);
  }-*/;
  public native com.google.gwt.maps.client.MapType getCurrentMapType(com.google.gwt.core.client.JavaScriptObject jsoPeerPeer) /*-{
    var jsReturn = jsoPeerPeer.getCurrentMapType();
    return jsReturn == null ? null : (jsReturn.__gwtPeer || @com.google.gwt.maps.client.MapType::createPeer(Lcom/google/gwt/core/client/JavaScriptObject;)(jsReturn));
  }-*/;
  public native void setUI(com.google.gwt.core.client.JavaScriptObject jsoPeer, com.google.gwt.maps.client.MapUIOptions options) /*-{
    jsoPeer.setUI(options);
  }-*/;
  public native boolean doubleClickZoomEnabled(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    var jsReturn = jsoPeer.doubleClickZoomEnabled();
    return !!jsReturn;
  }-*/;
  public native boolean continuousZoomEnabled(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    var jsReturn = jsoPeer.continuousZoomEnabled();
    return !!jsReturn;
  }-*/;
  public native void enableGoogleBar(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    jsoPeer.enableGoogleBar();
  }-*/;
  public native void removeControl(com.google.gwt.core.client.JavaScriptObject jsoPeer, com.google.gwt.maps.client.control.Control control) /*-{
    jsoPeer.removeControl(control == null ? null : control.@com.google.gwt.maps.client.control.Control::jsoPeer);
  }-*/;
  public native void zoomIn(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    jsoPeer.zoomIn();
  }-*/;
  public native com.google.gwt.maps.client.geom.Point fromLatLngToDivPixel(com.google.gwt.core.client.JavaScriptObject jsoPeer, com.google.gwt.maps.client.geom.LatLng latlng) /*-{
    var jsReturn = jsoPeer.fromLatLngToDivPixel(latlng);
    return jsReturn || null;
  }-*/;
  public native void returnToSavedPosition(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    jsoPeer.returnToSavedPosition();
  }-*/;
  public native int getBoundsZoomLevel(com.google.gwt.core.client.JavaScriptObject jsoPeer, com.google.gwt.maps.client.geom.LatLngBounds bounds) /*-{
    var jsReturn = jsoPeer.getBoundsZoomLevel(bounds);
    return jsReturn;
  }-*/;
  public native void getEarthInstance(com.google.gwt.core.client.JavaScriptObject jsoPeer, com.google.gwt.core.client.JavaScriptObject jsoCallback) /*-{
    jsoPeer.getEarthInstance(jsoCallback);
  }-*/;
  public native void zoomOut(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    jsoPeer.zoomOut();
  }-*/;
  public native void enableDragging(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    jsoPeer.enableDragging();
  }-*/;
  public native com.google.gwt.core.client.JavaScriptObject getInfoWindow(com.google.gwt.maps.client.MapWidget map) /*-{
    var jsReturn = map.@com.google.gwt.maps.client.MapWidget::jsoPeer.getInfoWindow();
    return jsReturn || null;
  }-*/;
  public native com.google.gwt.maps.client.geom.LatLngBounds getBounds(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    var jsReturn = jsoPeer.getBounds();
    return jsReturn || null;
  }-*/;
  public native boolean isLoaded(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    var jsReturn = jsoPeer.isLoaded();
    return !!jsReturn;
  }-*/;
  public native boolean draggingEnabled(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    var jsReturn = jsoPeer.draggingEnabled();
    return !!jsReturn;
  }-*/;
  public native com.google.gwt.user.client.Element getPane(com.google.gwt.maps.client.MapWidget map, com.google.gwt.maps.jsio.client.JSOpaque id) /*-{
    var jsReturn = map.@com.google.gwt.maps.client.MapWidget::jsoPeer.getPane(eval(id.@com.google.gwt.maps.jsio.client.JSOpaque::reference));
    return jsReturn || null;
  }-*/;
  public native void checkResize(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    jsoPeer.checkResize();
  }-*/;
  public native void savePosition(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    jsoPeer.savePosition();
  }-*/;
  public native void enableDoubleClickZoom(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    jsoPeer.enableDoubleClickZoom();
  }-*/;
  public native void addMapType(com.google.gwt.core.client.JavaScriptObject jsoPeerPeer, com.google.gwt.maps.client.MapType type) /*-{
    jsoPeerPeer.addMapType(type == null ? null : type.@com.google.gwt.maps.client.MapType::jsoPeer);
  }-*/;
  public native com.google.gwt.core.client.JavaScriptObject construct(com.google.gwt.user.client.Element container) /*-{
    var jsReturn = new $wnd.GMap2(container);
    return jsReturn;
  }-*/;
  public native void disableScrollWheelZoom(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    jsoPeer.disableScrollWheelZoom();
  }-*/;
  public native void addControl(com.google.gwt.core.client.JavaScriptObject jsoPeer, com.google.gwt.maps.client.control.Control control, com.google.gwt.maps.client.control.ControlPosition position) /*-{
    jsoPeer.addControl(control == null ? null : control.@com.google.gwt.maps.client.control.Control::jsoPeer, position == null ? null : position.@com.google.gwt.maps.client.control.ControlPosition::jsoPeer);
  }-*/;
  public native void disableGoogleBar(com.google.gwt.core.client.JavaScriptObject jsoPeer) /*-{
    jsoPeer.disableGoogleBar();
  }-*/;
}
