package org.opennms.features.poller.remote.gwt.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class FilterPanel_BinderImpl_GenBundle_default_StaticClientBundleGenerator implements org.opennms.features.poller.remote.gwt.client.FilterPanel_BinderImpl_GenBundle {
  private static FilterPanel_BinderImpl_GenBundle_default_StaticClientBundleGenerator _instance0 = new FilterPanel_BinderImpl_GenBundle_default_StaticClientBundleGenerator();
  private void filterStylesInitializer() {
    filterStyles = new org.opennms.features.poller.remote.gwt.client.FilterPanel_BinderImpl_GenCss_filterStyles() {
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
        return "filterStyles";
      }
      public String getText() {
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GLA0CTDDOG{width:" + ("14px")  + ";padding-left:" + ("3px")  + ";}.GLA0CTDDMG{font-weight:" + ("bold")  + ";padding-left:" + ("3px")  + ";}.GLA0CTDDNG{padding-top:" + ("3px")  + ";padding-bottom:" + ("3px")  + ";font-size:" + ("small")  + ";}")) : ((".GLA0CTDDOG{width:" + ("14px")  + ";padding-right:" + ("3px")  + ";}.GLA0CTDDMG{font-weight:" + ("bold")  + ";padding-right:" + ("3px")  + ";}.GLA0CTDDNG{padding-top:" + ("3px")  + ";padding-bottom:" + ("3px")  + ";font-size:" + ("small")  + ";}"));
      }
      public java.lang.String panelCaption(){
        return "GLA0CTDDMG";
      }
      public java.lang.String panelEntry(){
        return "GLA0CTDDNG";
      }
      public java.lang.String panelIcon(){
        return "GLA0CTDDOG";
      }
    }
    ;
  }
  private static class filterStylesInitializer {
    static {
      _instance0.filterStylesInitializer();
    }
    static org.opennms.features.poller.remote.gwt.client.FilterPanel_BinderImpl_GenCss_filterStyles get() {
      return filterStyles;
    }
  }
  public org.opennms.features.poller.remote.gwt.client.FilterPanel_BinderImpl_GenCss_filterStyles filterStyles() {
    return filterStylesInitializer.get();
  }
  private void styleInitializer() {
    style = new org.opennms.features.poller.remote.gwt.client.FilterPanel_BinderImpl_GenCss_style() {
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
        return (".GLA0CTDDPG{width:" + ("100%")  + ";}.GLA0CTDDCH{font-weight:" + ("bold")  + ";font-size:" + ("10px")  + ";}.GLA0CTDDAH{font-weight:" + ("bold")  + ";font-size:" + ("13px")  + ";}.GLA0CTDDBH{padding:" + ("10px")  + ";}");
      }
      public java.lang.String fullWidth(){
        return "GLA0CTDDPG";
      }
      public java.lang.String panelHeader(){
        return "GLA0CTDDAH";
      }
      public java.lang.String panelPadding(){
        return "GLA0CTDDBH";
      }
      public java.lang.String selectorLabel(){
        return "GLA0CTDDCH";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static org.opennms.features.poller.remote.gwt.client.FilterPanel_BinderImpl_GenCss_style get() {
      return style;
    }
  }
  public org.opennms.features.poller.remote.gwt.client.FilterPanel_BinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static org.opennms.features.poller.remote.gwt.client.FilterPanel_BinderImpl_GenCss_filterStyles filterStyles;
  private static org.opennms.features.poller.remote.gwt.client.FilterPanel_BinderImpl_GenCss_style style;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      filterStyles(), 
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("filterStyles", filterStyles());
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'filterStyles': return this.@org.opennms.features.poller.remote.gwt.client.FilterPanel_BinderImpl_GenBundle::filterStyles()();
      case 'style': return this.@org.opennms.features.poller.remote.gwt.client.FilterPanel_BinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
