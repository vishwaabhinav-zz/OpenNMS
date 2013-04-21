package com.google.gwt.maps.client.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.jsio.client.*;
import com.google.gwt.maps.jsio.client.impl.*;

public class __EventImplImpl extends com.google.gwt.maps.client.impl.EventImpl {
  private JavaScriptObject jsoPeer;
  public __EventImplImpl() {
    setJavaScriptObject(__nativeInit());
  }
  private native JavaScriptObject __nativeInit() /*-{
    return $wnd.GEvent;
  }-*/;
  public JavaScriptObject getJavaScriptObject() {
    return jsoPeer;
  }
  public void setJSONData(String data)
  throws JSONWrapperException {
    setJavaScriptObject(JSONWrapperUtil.evaluate(data));
  }
  public com.google.gwt.maps.client.impl.EventImpl setJavaScriptObject(JavaScriptObject obj) {
    if (obj != null) {
      assert JSONWrapperUtil.hasField(obj, "removeListener") : "Backing JSO missing imported function removeListener";
      assert JSONWrapperUtil.hasField(obj, "addListener") : "Backing JSO missing imported function addListener";
      assert JSONWrapperUtil.hasField(obj, "trigger") : "Backing JSO missing imported function trigger";
      assert JSONWrapperUtil.hasField(obj, "addListener") : "Backing JSO missing imported function addListener";
      assert JSONWrapperUtil.hasField(obj, "addListener") : "Backing JSO missing imported function addListener";
      assert JSONWrapperUtil.hasField(obj, "addListener") : "Backing JSO missing imported function addListener";
      assert JSONWrapperUtil.hasField(obj, "trigger") : "Backing JSO missing imported function trigger";
      assert JSONWrapperUtil.hasField(obj, "trigger") : "Backing JSO missing imported function trigger";
      assert JSONWrapperUtil.hasField(obj, "addListener") : "Backing JSO missing imported function addListener";
      assert JSONWrapperUtil.hasField(obj, "trigger") : "Backing JSO missing imported function trigger";
      assert JSONWrapperUtil.hasField(obj, "addListener") : "Backing JSO missing imported function addListener";
      assert JSONWrapperUtil.hasField(obj, "addListener") : "Backing JSO missing imported function addListener";
      assert JSONWrapperUtil.hasField(obj, "addListener") : "Backing JSO missing imported function addListener";
      assert JSONWrapperUtil.hasField(obj, "trigger") : "Backing JSO missing imported function trigger";
      assert JSONWrapperUtil.hasField(obj, "trigger") : "Backing JSO missing imported function trigger";
      assert JSONWrapperUtil.hasField(obj, "trigger") : "Backing JSO missing imported function trigger";
      assert JSONWrapperUtil.hasField(obj, "trigger") : "Backing JSO missing imported function trigger";
      assert JSONWrapperUtil.hasField(obj, "trigger") : "Backing JSO missing imported function trigger";
      assert JSONWrapperUtil.hasField(obj, "trigger") : "Backing JSO missing imported function trigger";
      assert JSONWrapperUtil.hasField(obj, "addListener") : "Backing JSO missing imported function addListener";
      assert JSONWrapperUtil.hasField(obj, "addListener") : "Backing JSO missing imported function addListener";
      assert JSONWrapperUtil.hasField(obj, "addListener") : "Backing JSO missing imported function addListener";
      assert JSONWrapperUtil.hasField(obj, "trigger") : "Backing JSO missing imported function trigger";
      assert JSONWrapperUtil.hasField(obj, "addListener") : "Backing JSO missing imported function addListener";
      assert JSONWrapperUtil.hasField(obj, "trigger") : "Backing JSO missing imported function trigger";
      assert JSONWrapperUtil.hasField(obj, "trigger") : "Backing JSO missing imported function trigger";
      assert JSONWrapperUtil.hasField(obj, "addListener") : "Backing JSO missing imported function addListener";
      assert JSONWrapperUtil.hasField(obj, "trigger") : "Backing JSO missing imported function trigger";
    }
    return setJavaScriptObjectNative(obj);
  }
  public native __EventImplImpl setJavaScriptObjectNative(JavaScriptObject obj) /*-{
    if (this.@com.google.gwt.maps.client.impl.__EventImplImpl::jsoPeer) {
      delete this.@com.google.gwt.maps.client.impl.__EventImplImpl::jsoPeer.__gwtPeer;
    }
    if (!obj) {
      this.@com.google.gwt.maps.client.impl.__EventImplImpl::jsoPeer = null;
      return this;
    }
    if (obj.__gwtPeer) {
      @com.google.gwt.maps.jsio.client.impl.JSONWrapperUtil::throwMultipleWrapperException()();
    }
    this.@com.google.gwt.maps.client.impl.__EventImplImpl::jsoPeer = obj;
    this.@com.google.gwt.maps.client.impl.__EventImplImpl::jsoPeer.__gwtPeer = this;
    this.@com.google.gwt.maps.client.impl.__EventImplImpl::__initializeEmptyFields(Lcom/google/gwt/core/client/JavaScriptObject;)(this.@com.google.gwt.maps.client.impl.__EventImplImpl::jsoPeer);
    return this;
  }-*/;
  public final Extractor<com.google.gwt.maps.client.impl.EventImpl> getExtractor() {
    return __extractor;
  }
  private final static Extractor __extractor = new Extractor() {public native Object fromJS(JavaScriptObject obj) /*-{
      return obj == null ? null : (obj.__gwtPeer || @com.google.gwt.maps.client.impl.__EventImplImpl::__create__com_google_gwt_maps_client_impl_EventImpl()().@com.google.gwt.maps.jsio.client.JSWrapper::setJavaScriptObject(Lcom/google/gwt/core/client/JavaScriptObject;)(obj));
    }-*/;
    public native JavaScriptObject toJS(Object obj) /*-{
      return obj == null ? null : obj.@com.google.gwt.maps.jsio.client.JSWrapper::getJavaScriptObject()();
    }-*/;
  };
  private native void __initializeEmptyFields(JavaScriptObject jso) /*-{
  }-*/;
  public native void removeListener(com.google.gwt.core.client.JavaScriptObject mapEventHandle) /*-{
    this.@com.google.gwt.maps.client.impl.__EventImplImpl::jsoPeer.removeListener(mapEventHandle);
  }-*/;
  public native com.google.gwt.core.client.JavaScriptObject addListener(com.google.gwt.core.client.JavaScriptObject source, java.lang.String event, com.google.gwt.maps.client.impl.EventImpl.LatLngCallback handler) /*-{
    var jsReturn = this.@com.google.gwt.maps.client.impl.__EventImplImpl::jsoPeer.addListener(source, event, (handler.@com.google.gwt.maps.jsio.client.JSFunction::exportedFunction || (handler.@com.google.gwt.maps.jsio.client.JSFunction::exportedFunction = function(arg0) {
      return handler.@com.google.gwt.maps.client.impl.EventImpl.LatLngCallback::callbackWrapper(Lcom/google/gwt/maps/client/geom/LatLng;)(
          arg0 || null);
    })));
    return jsReturn || null;
  }-*/;
  public native void trigger(com.google.gwt.core.client.JavaScriptObject source, java.lang.String mapEventString, com.google.gwt.maps.client.MapType type) /*-{
    this.@com.google.gwt.maps.client.impl.__EventImplImpl::jsoPeer.trigger(source, mapEventString, type == null ? null : type.@com.google.gwt.maps.client.MapType::jsoPeer);
  }-*/;
  public native com.google.gwt.core.client.JavaScriptObject addListener(com.google.gwt.core.client.JavaScriptObject source, java.lang.String event, com.google.gwt.maps.client.impl.EventImpl.VoidCallback handler) /*-{
    var jsReturn = this.@com.google.gwt.maps.client.impl.__EventImplImpl::jsoPeer.addListener(source, event, (handler.@com.google.gwt.maps.jsio.client.JSFunction::exportedFunction || (handler.@com.google.gwt.maps.jsio.client.JSFunction::exportedFunction = function() {
      return handler.@com.google.gwt.maps.client.impl.EventImpl.VoidCallback::callbackWrapper()(
      );
    })));
    return jsReturn || null;
  }-*/;
  public native com.google.gwt.core.client.JavaScriptObject addListener(com.google.gwt.core.client.JavaScriptObject source, java.lang.String event, com.google.gwt.maps.client.impl.EventImpl.OverlayCallback handler) /*-{
    var jsReturn = this.@com.google.gwt.maps.client.impl.__EventImplImpl::jsoPeer.addListener(source, event, (handler.@com.google.gwt.maps.jsio.client.JSFunction::exportedFunction || (handler.@com.google.gwt.maps.jsio.client.JSFunction::exportedFunction = function(arg0) {
      return handler.@com.google.gwt.maps.client.impl.EventImpl.OverlayCallback::callbackWrapper(Lcom/google/gwt/maps/client/overlay/Overlay;)(
          arg0 == null ? null : (arg0.__gwtPeer || @com.google.gwt.maps.client.overlay.Overlay::createPeer(Lcom/google/gwt/core/client/JavaScriptObject;)(arg0)));
    })));
    return jsReturn || null;
  }-*/;
  public native com.google.gwt.core.client.JavaScriptObject addListener(com.google.gwt.core.client.JavaScriptObject source, java.lang.String event, com.google.gwt.maps.client.impl.EventImpl.IntIntCallback handler) /*-{
    var jsReturn = this.@com.google.gwt.maps.client.impl.__EventImplImpl::jsoPeer.addListener(source, event, (handler.@com.google.gwt.maps.jsio.client.JSFunction::exportedFunction || (handler.@com.google.gwt.maps.jsio.client.JSFunction::exportedFunction = function(arg0, arg1) {
      return handler.@com.google.gwt.maps.client.impl.EventImpl.IntIntCallback::callbackWrapper(II)(
          arg0, 
          arg1);
    })));
    return jsReturn || null;
  }-*/;
  public native void trigger(com.google.gwt.core.client.JavaScriptObject source, java.lang.String mapEventString, boolean value) /*-{
    this.@com.google.gwt.maps.client.impl.__EventImplImpl::jsoPeer.trigger(source, mapEventString, value);
  }-*/;
  public native void trigger(com.google.gwt.core.client.JavaScriptObject source, java.lang.String mapEventString, int arg) /*-{
    this.@com.google.gwt.maps.client.impl.__EventImplImpl::jsoPeer.trigger(source, mapEventString, arg);
  }-*/;
  public native com.google.gwt.core.client.JavaScriptObject addListener(com.google.gwt.core.client.JavaScriptObject source, java.lang.String event, com.google.gwt.maps.client.impl.EventImpl.BooleanCallback handler) /*-{
    var jsReturn = this.@com.google.gwt.maps.client.impl.__EventImplImpl::jsoPeer.addListener(source, event, (handler.@com.google.gwt.maps.jsio.client.JSFunction::exportedFunction || (handler.@com.google.gwt.maps.jsio.client.JSFunction::exportedFunction = function(arg0) {
      return handler.@com.google.gwt.maps.client.impl.EventImpl.BooleanCallback::callbackWrapper(Z)(
          !!arg0);
    })));
    return jsReturn || null;
  }-*/;
  public native void trigger(com.google.gwt.core.client.JavaScriptObject source, java.lang.String mapEventString, com.google.gwt.maps.client.geom.LatLng latlng) /*-{
    this.@com.google.gwt.maps.client.impl.__EventImplImpl::jsoPeer.trigger(source, mapEventString, latlng);
  }-*/;
  public native com.google.gwt.core.client.JavaScriptObject addListener(com.google.gwt.core.client.JavaScriptObject source, java.lang.String event, com.google.gwt.maps.client.impl.EventImpl.OverlayLatLngCallback handler) /*-{
    var jsReturn = this.@com.google.gwt.maps.client.impl.__EventImplImpl::jsoPeer.addListener(source, event, (handler.@com.google.gwt.maps.jsio.client.JSFunction::exportedFunction || (handler.@com.google.gwt.maps.jsio.client.JSFunction::exportedFunction = function(arg0, arg1, arg2) {
      return handler.@com.google.gwt.maps.client.impl.EventImpl.OverlayLatLngCallback::callbackWrapper(Lcom/google/gwt/maps/client/overlay/Overlay;Lcom/google/gwt/maps/client/geom/LatLng;Lcom/google/gwt/maps/client/geom/LatLng;)(
          arg0 == null ? null : (arg0.__gwtPeer || @com.google.gwt.maps.client.overlay.Overlay::createPeer(Lcom/google/gwt/core/client/JavaScriptObject;)(arg0)), 
          arg1 || null, 
          arg2 || null);
    })));
    return jsReturn || null;
  }-*/;
  public native com.google.gwt.core.client.JavaScriptObject addListener(com.google.gwt.core.client.JavaScriptObject source, java.lang.String event, com.google.gwt.maps.client.impl.EventImpl.PointElementOverlayCallback handler) /*-{
    var jsReturn = this.@com.google.gwt.maps.client.impl.__EventImplImpl::jsoPeer.addListener(source, event, (handler.@com.google.gwt.maps.jsio.client.JSFunction::exportedFunction || (handler.@com.google.gwt.maps.jsio.client.JSFunction::exportedFunction = function(arg0, arg1, arg2) {
      return handler.@com.google.gwt.maps.client.impl.EventImpl.PointElementOverlayCallback::callbackWrapper(Lcom/google/gwt/maps/client/geom/Point;Lcom/google/gwt/user/client/Element;Lcom/google/gwt/maps/client/overlay/Overlay;)(
          arg0 || null, 
          arg1 || null, 
          arg2 == null ? null : (arg2.__gwtPeer || @com.google.gwt.maps.client.overlay.Overlay::createPeer(Lcom/google/gwt/core/client/JavaScriptObject;)(arg2)));
    })));
    return jsReturn || null;
  }-*/;
  public native com.google.gwt.core.client.JavaScriptObject addListener(com.google.gwt.core.client.JavaScriptObject source, java.lang.String event, com.google.gwt.maps.client.impl.EventImpl.DoubleCallback handler) /*-{
    var jsReturn = this.@com.google.gwt.maps.client.impl.__EventImplImpl::jsoPeer.addListener(source, event, (handler.@com.google.gwt.maps.jsio.client.JSFunction::exportedFunction || (handler.@com.google.gwt.maps.jsio.client.JSFunction::exportedFunction = function(arg0) {
      return handler.@com.google.gwt.maps.client.impl.EventImpl.DoubleCallback::callbackWrapper(D)(
          arg0);
    })));
    return jsReturn || null;
  }-*/;
  public native void trigger(com.google.gwt.core.client.JavaScriptObject source, java.lang.String mapEventString) /*-{
    this.@com.google.gwt.maps.client.impl.__EventImplImpl::jsoPeer.trigger(source, mapEventString);
  }-*/;
  public native void trigger(com.google.gwt.core.client.JavaScriptObject source, java.lang.String mapEventString, com.google.gwt.maps.client.streetview.StreetviewLocation value) /*-{
    this.@com.google.gwt.maps.client.impl.__EventImplImpl::jsoPeer.trigger(source, mapEventString, value);
  }-*/;
  public native void trigger(com.google.gwt.core.client.JavaScriptObject source, java.lang.String mapEventString, com.google.gwt.maps.client.geom.Point point, com.google.gwt.user.client.Element elem, com.google.gwt.maps.client.overlay.Overlay overlay) /*-{
    this.@com.google.gwt.maps.client.impl.__EventImplImpl::jsoPeer.trigger(source, mapEventString, point, elem, overlay == null ? null : overlay.@com.google.gwt.maps.client.overlay.Overlay::jsoPeer);
  }-*/;
  public native void trigger(com.google.gwt.core.client.JavaScriptObject source, java.lang.String mapEventString, double value) /*-{
    this.@com.google.gwt.maps.client.impl.__EventImplImpl::jsoPeer.trigger(source, mapEventString, value);
  }-*/;
  public native void trigger(com.google.gwt.core.client.JavaScriptObject source, java.lang.String mapEventString, com.google.gwt.maps.client.Copyright value) /*-{
    this.@com.google.gwt.maps.client.impl.__EventImplImpl::jsoPeer.trigger(source, mapEventString, value == null ? null : value.@com.google.gwt.maps.client.Copyright::jsoPeer);
  }-*/;
  public native void trigger(com.google.gwt.core.client.JavaScriptObject source, java.lang.String mapEventString, com.google.gwt.maps.client.overlay.Overlay overlay) /*-{
    this.@com.google.gwt.maps.client.impl.__EventImplImpl::jsoPeer.trigger(source, mapEventString, overlay == null ? null : overlay.@com.google.gwt.maps.client.overlay.Overlay::jsoPeer);
  }-*/;
  public native com.google.gwt.core.client.JavaScriptObject addListener(com.google.gwt.core.client.JavaScriptObject source, java.lang.String event, com.google.gwt.maps.client.impl.EventImpl.MapTypeCallback handler) /*-{
    var jsReturn = this.@com.google.gwt.maps.client.impl.__EventImplImpl::jsoPeer.addListener(source, event, (handler.@com.google.gwt.maps.jsio.client.JSFunction::exportedFunction || (handler.@com.google.gwt.maps.jsio.client.JSFunction::exportedFunction = function(arg0) {
      return handler.@com.google.gwt.maps.client.impl.EventImpl.MapTypeCallback::callbackWrapper(Lcom/google/gwt/maps/client/MapType;)(
          arg0 == null ? null : (arg0.__gwtPeer || @com.google.gwt.maps.client.MapType::createPeer(Lcom/google/gwt/core/client/JavaScriptObject;)(arg0)));
    })));
    return jsReturn || null;
  }-*/;
  public native com.google.gwt.core.client.JavaScriptObject addListener(com.google.gwt.core.client.JavaScriptObject source, java.lang.String event, com.google.gwt.maps.client.impl.EventImpl.CopyrightCallback handler) /*-{
    var jsReturn = this.@com.google.gwt.maps.client.impl.__EventImplImpl::jsoPeer.addListener(source, event, (handler.@com.google.gwt.maps.jsio.client.JSFunction::exportedFunction || (handler.@com.google.gwt.maps.jsio.client.JSFunction::exportedFunction = function(arg0) {
      return handler.@com.google.gwt.maps.client.impl.EventImpl.CopyrightCallback::callbackWrapper(Lcom/google/gwt/maps/client/Copyright;)(
          arg0 == null ? null : (arg0.__gwtPeer || @com.google.gwt.maps.client.Copyright::createPeer(Lcom/google/gwt/core/client/JavaScriptObject;)(arg0)));
    })));
    return jsReturn || null;
  }-*/;
  public native com.google.gwt.core.client.JavaScriptObject addListener(com.google.gwt.core.client.JavaScriptObject source, java.lang.String event, com.google.gwt.maps.client.impl.EventImpl.LatLngBoundsIntCallback handler) /*-{
    var jsReturn = this.@com.google.gwt.maps.client.impl.__EventImplImpl::jsoPeer.addListener(source, event, (handler.@com.google.gwt.maps.jsio.client.JSFunction::exportedFunction || (handler.@com.google.gwt.maps.jsio.client.JSFunction::exportedFunction = function(arg0, arg1) {
      return handler.@com.google.gwt.maps.client.impl.EventImpl.LatLngBoundsIntCallback::callbackWrapper(Lcom/google/gwt/maps/client/geom/LatLngBounds;I)(
          arg0 || null, 
          arg1);
    })));
    return jsReturn || null;
  }-*/;
  public native void trigger(com.google.gwt.core.client.JavaScriptObject source, java.lang.String mapEventString, int arg1, int arg2) /*-{
    this.@com.google.gwt.maps.client.impl.__EventImplImpl::jsoPeer.trigger(source, mapEventString, arg1, arg2);
  }-*/;
  public native com.google.gwt.core.client.JavaScriptObject addListener(com.google.gwt.core.client.JavaScriptObject source, java.lang.String event, com.google.gwt.maps.client.impl.EventImpl.StreetviewLocationCallback handler) /*-{
    var jsReturn = this.@com.google.gwt.maps.client.impl.__EventImplImpl::jsoPeer.addListener(source, event, (handler.@com.google.gwt.maps.jsio.client.JSFunction::exportedFunction || (handler.@com.google.gwt.maps.jsio.client.JSFunction::exportedFunction = function(arg0) {
      return handler.@com.google.gwt.maps.client.impl.EventImpl.StreetviewLocationCallback::callbackWrapper(Lcom/google/gwt/maps/client/streetview/StreetviewLocation;)(
          arg0 || null);
    })));
    return jsReturn || null;
  }-*/;
  public native void trigger(com.google.gwt.core.client.JavaScriptObject source, java.lang.String mapEventString, com.google.gwt.maps.client.overlay.Overlay overlay, com.google.gwt.maps.client.geom.LatLng latlng) /*-{
    this.@com.google.gwt.maps.client.impl.__EventImplImpl::jsoPeer.trigger(source, mapEventString, overlay == null ? null : overlay.@com.google.gwt.maps.client.overlay.Overlay::jsoPeer, latlng);
  }-*/;
  public native void trigger(com.google.gwt.core.client.JavaScriptObject source, java.lang.String mapEventString, com.google.gwt.maps.client.geom.LatLngBounds bounds, int value) /*-{
    this.@com.google.gwt.maps.client.impl.__EventImplImpl::jsoPeer.trigger(source, mapEventString, bounds, value);
  }-*/;
  public native com.google.gwt.core.client.JavaScriptObject addListener(com.google.gwt.core.client.JavaScriptObject source, java.lang.String event, com.google.gwt.maps.client.impl.EventImpl.IntCallback handler) /*-{
    var jsReturn = this.@com.google.gwt.maps.client.impl.__EventImplImpl::jsoPeer.addListener(source, event, (handler.@com.google.gwt.maps.jsio.client.JSFunction::exportedFunction || (handler.@com.google.gwt.maps.jsio.client.JSFunction::exportedFunction = function(arg0) {
      return handler.@com.google.gwt.maps.client.impl.EventImpl.IntCallback::callbackWrapper(I)(
          arg0);
    })));
    return jsReturn || null;
  }-*/;
  public native void trigger(com.google.gwt.core.client.JavaScriptObject source, java.lang.String mapEventString, com.google.gwt.maps.client.overlay.Overlay overlay, com.google.gwt.maps.client.geom.LatLng latlng1, com.google.gwt.maps.client.geom.LatLng latlng2) /*-{
    this.@com.google.gwt.maps.client.impl.__EventImplImpl::jsoPeer.trigger(source, mapEventString, overlay == null ? null : overlay.@com.google.gwt.maps.client.overlay.Overlay::jsoPeer, latlng1, latlng2);
  }-*/;
  private static com.google.gwt.maps.client.impl.EventImpl __create__com_google_gwt_maps_client_impl_EventImpl() {
    return (com.google.gwt.maps.client.impl.EventImpl)GWT.create(com.google.gwt.maps.client.impl.EventImpl.class);
  }
}
