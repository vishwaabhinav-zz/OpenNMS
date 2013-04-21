package org.opennms.features.poller.remote.gwt.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class LocationPanel_BinderImpl_GenBundle_default_StaticClientBundleGenerator implements org.opennms.features.poller.remote.gwt.client.LocationPanel_BinderImpl_GenBundle {
  private static LocationPanel_BinderImpl_GenBundle_default_StaticClientBundleGenerator _instance0 = new LocationPanel_BinderImpl_GenBundle_default_StaticClientBundleGenerator();
  private void styleInitializer() {
    style = new org.opennms.features.poller.remote.gwt.client.LocationPanel_BinderImpl_GenCss_style() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GLA0CTDDFH{position:" + ("relative")  + ";}.GLA0CTDDEH{position:" + ("absolute")  + ";right:" + ("0")  + ";left:" + ("0")  + ";bottom:" + ("0")  + ";}")) : ((".GLA0CTDDFH{position:" + ("relative")  + ";}.GLA0CTDDEH{position:" + ("absolute")  + ";left:" + ("0")  + ";right:" + ("0")  + ";bottom:" + ("0")  + ";}"));
      }
      public java.lang.String lists(){
        return "GLA0CTDDDH";
      }
      public java.lang.String listsPanel(){
        return "GLA0CTDDEH";
      }
      public java.lang.String topLevelContainer(){
        return "GLA0CTDDFH";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static org.opennms.features.poller.remote.gwt.client.LocationPanel_BinderImpl_GenCss_style get() {
      return style;
    }
  }
  public org.opennms.features.poller.remote.gwt.client.LocationPanel_BinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static org.opennms.features.poller.remote.gwt.client.LocationPanel_BinderImpl_GenCss_style style;
  
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
      case 'style': return this.@org.opennms.features.poller.remote.gwt.client.LocationPanel_BinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
