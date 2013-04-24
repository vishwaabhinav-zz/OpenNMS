package com.google.gwt.maps.client.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.jsio.client.*;
import com.google.gwt.maps.jsio.client.impl.*;

public class __ControlPositionImplImpl implements com.google.gwt.maps.client.impl.ControlPositionImpl {
  public native com.google.gwt.core.client.JavaScriptObject construct(com.google.gwt.maps.jsio.client.JSOpaque anchor, com.google.gwt.maps.client.geom.Size offset) /*-{
    var jsReturn = new $wnd.GControlPosition(eval(anchor.@com.google.gwt.maps.jsio.client.JSOpaque::reference), offset);
    return jsReturn;
  }-*/;
}
