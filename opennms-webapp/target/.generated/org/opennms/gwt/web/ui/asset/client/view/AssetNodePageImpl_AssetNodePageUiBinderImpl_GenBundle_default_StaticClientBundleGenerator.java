package org.opennms.gwt.web.ui.asset.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class AssetNodePageImpl_AssetNodePageUiBinderImpl_GenBundle_default_StaticClientBundleGenerator implements org.opennms.gwt.web.ui.asset.client.view.AssetNodePageImpl_AssetNodePageUiBinderImpl_GenBundle {
  private static AssetNodePageImpl_AssetNodePageUiBinderImpl_GenBundle_default_StaticClientBundleGenerator _instance0 = new AssetNodePageImpl_AssetNodePageUiBinderImpl_GenBundle_default_StaticClientBundleGenerator();
  private void styleInitializer() {
    style = new org.opennms.gwt.web.ui.asset.client.view.AssetNodePageImpl_AssetNodePageUiBinderImpl_GenCss_style() {
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
    static org.opennms.gwt.web.ui.asset.client.view.AssetNodePageImpl_AssetNodePageUiBinderImpl_GenCss_style get() {
      return style;
    }
  }
  public org.opennms.gwt.web.ui.asset.client.view.AssetNodePageImpl_AssetNodePageUiBinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static org.opennms.gwt.web.ui.asset.client.view.AssetNodePageImpl_AssetNodePageUiBinderImpl_GenCss_style style;
  
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
      case 'style': return this.@org.opennms.gwt.web.ui.asset.client.view.AssetNodePageImpl_AssetNodePageUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
