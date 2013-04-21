package org.opennms.features.poller.remote.gwt.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class OpenLayersMapPanel_OpenLayersMapPanelUiBinderImpl_GenBundle_default_StaticClientBundleGenerator implements org.opennms.features.poller.remote.gwt.client.OpenLayersMapPanel_OpenLayersMapPanelUiBinderImpl_GenBundle {
  private static OpenLayersMapPanel_OpenLayersMapPanelUiBinderImpl_GenBundle_default_StaticClientBundleGenerator _instance0 = new OpenLayersMapPanel_OpenLayersMapPanelUiBinderImpl_GenBundle_default_StaticClientBundleGenerator();
  private void styleInitializer() {
    style = new org.opennms.features.poller.remote.gwt.client.OpenLayersMapPanel_OpenLayersMapPanelUiBinderImpl_GenCss_style() {
      private boolean injected;
      public boolean ensureInjected() {
        if (!injected) {
          injected = true;
          com.google.gwt.dom.client.StyleInjector.inject(getText());
          return true;
        }
        return false;
      }
      public String getName() {
        return "style";
      }
      public String getText() {
        return ("");
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static org.opennms.features.poller.remote.gwt.client.OpenLayersMapPanel_OpenLayersMapPanelUiBinderImpl_GenCss_style get() {
      return style;
    }
  }
  public org.opennms.features.poller.remote.gwt.client.OpenLayersMapPanel_OpenLayersMapPanelUiBinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static org.opennms.features.poller.remote.gwt.client.OpenLayersMapPanel_OpenLayersMapPanelUiBinderImpl_GenCss_style style;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'style': return this.@org.opennms.features.poller.remote.gwt.client.OpenLayersMapPanel_OpenLayersMapPanelUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
