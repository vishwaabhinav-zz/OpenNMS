package org.opennms.features.gwt.ksc.add.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class KscAddGraphViewImpl_KscAddGraphViewImplUiBinderImpl_GenBundle_default_InlineClientBundleGenerator implements org.opennms.features.gwt.ksc.add.client.view.KscAddGraphViewImpl_KscAddGraphViewImplUiBinderImpl_GenBundle {
  private static KscAddGraphViewImpl_KscAddGraphViewImplUiBinderImpl_GenBundle_default_InlineClientBundleGenerator _instance0 = new KscAddGraphViewImpl_KscAddGraphViewImplUiBinderImpl_GenBundle_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new org.opennms.features.gwt.ksc.add.client.view.KscAddGraphViewImpl_KscAddGraphViewImplUiBinderImpl_GenCss_style() {
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
        return (".GALD-WODG{padding:" + ("2px")  + ";margin-top:" + ("auto")  + ";margin-bottom:" + ("auto")  + ";}");
      }
      public java.lang.String outlineBorder(){
        return "GALD-WOCG";
      }
      public java.lang.String padBoxes(){
        return "GALD-WODG";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static org.opennms.features.gwt.ksc.add.client.view.KscAddGraphViewImpl_KscAddGraphViewImplUiBinderImpl_GenCss_style get() {
      return style;
    }
  }
  public org.opennms.features.gwt.ksc.add.client.view.KscAddGraphViewImpl_KscAddGraphViewImplUiBinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static org.opennms.features.gwt.ksc.add.client.view.KscAddGraphViewImpl_KscAddGraphViewImplUiBinderImpl_GenCss_style style;
  
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
      case 'style': return this.@org.opennms.features.gwt.ksc.add.client.view.KscAddGraphViewImpl_KscAddGraphViewImplUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
