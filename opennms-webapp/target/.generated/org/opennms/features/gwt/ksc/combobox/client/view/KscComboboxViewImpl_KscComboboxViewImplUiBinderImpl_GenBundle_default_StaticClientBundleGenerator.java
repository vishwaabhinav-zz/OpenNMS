package org.opennms.features.gwt.ksc.combobox.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class KscComboboxViewImpl_KscComboboxViewImplUiBinderImpl_GenBundle_default_StaticClientBundleGenerator implements org.opennms.features.gwt.ksc.combobox.client.view.KscComboboxViewImpl_KscComboboxViewImplUiBinderImpl_GenBundle {
  private static KscComboboxViewImpl_KscComboboxViewImplUiBinderImpl_GenBundle_default_StaticClientBundleGenerator _instance0 = new KscComboboxViewImpl_KscComboboxViewImplUiBinderImpl_GenBundle_default_StaticClientBundleGenerator();
  private void styleInitializer() {
    style = new org.opennms.features.gwt.ksc.combobox.client.view.KscComboboxViewImpl_KscComboboxViewImplUiBinderImpl_GenCss_style() {
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
        return (".GALD-WOEG{border:" + ("1px"+ " " +"solid"+ " " +"#b5b8c8")  + ";}");
      }
      public java.lang.String outlineBorder(){
        return "GALD-WOEG";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static org.opennms.features.gwt.ksc.combobox.client.view.KscComboboxViewImpl_KscComboboxViewImplUiBinderImpl_GenCss_style get() {
      return style;
    }
  }
  public org.opennms.features.gwt.ksc.combobox.client.view.KscComboboxViewImpl_KscComboboxViewImplUiBinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static org.opennms.features.gwt.ksc.combobox.client.view.KscComboboxViewImpl_KscComboboxViewImplUiBinderImpl_GenCss_style style;
  
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
      case 'style': return this.@org.opennms.features.gwt.ksc.combobox.client.view.KscComboboxViewImpl_KscComboboxViewImplUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
