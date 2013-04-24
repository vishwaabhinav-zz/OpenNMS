package org.opennms.features.node.list.gwt.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class PageableNodeList_PageableNodeListUiBinderImpl_GenBundle_default_InlineClientBundleGenerator implements org.opennms.features.node.list.gwt.client.PageableNodeList_PageableNodeListUiBinderImpl_GenBundle {
  private static PageableNodeList_PageableNodeListUiBinderImpl_GenBundle_default_InlineClientBundleGenerator _instance0 = new PageableNodeList_PageableNodeListUiBinderImpl_GenBundle_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new org.opennms.features.node.list.gwt.client.PageableNodeList_PageableNodeListUiBinderImpl_GenCss_style() {
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
        return (".GALD-WOFG{margin-top:" + ("3px")  + ";}.GALD-WOHG{width:" + ("300px")  + ";}");
      }
      public java.lang.String selectBox(){
        return "GALD-WOFG";
      }
      public java.lang.String tabLayoutStyle(){
        return "GALD-WOGG";
      }
      public java.lang.String tableDiv(){
        return "GALD-WOHG";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static org.opennms.features.node.list.gwt.client.PageableNodeList_PageableNodeListUiBinderImpl_GenCss_style get() {
      return style;
    }
  }
  public org.opennms.features.node.list.gwt.client.PageableNodeList_PageableNodeListUiBinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static org.opennms.features.node.list.gwt.client.PageableNodeList_PageableNodeListUiBinderImpl_GenCss_style style;
  
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
      case 'style': return this.@org.opennms.features.node.list.gwt.client.PageableNodeList_PageableNodeListUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
