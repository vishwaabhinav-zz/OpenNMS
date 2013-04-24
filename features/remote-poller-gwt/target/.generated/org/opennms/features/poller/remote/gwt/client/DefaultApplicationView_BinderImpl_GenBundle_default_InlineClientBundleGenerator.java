package org.opennms.features.poller.remote.gwt.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class DefaultApplicationView_BinderImpl_GenBundle_default_InlineClientBundleGenerator implements org.opennms.features.poller.remote.gwt.client.DefaultApplicationView_BinderImpl_GenBundle {
  private static DefaultApplicationView_BinderImpl_GenBundle_default_InlineClientBundleGenerator _instance0 = new DefaultApplicationView_BinderImpl_GenBundle_default_InlineClientBundleGenerator();
  private void linkStylesInitializer() {
    linkStyles = new org.opennms.features.poller.remote.gwt.client.DefaultApplicationView_BinderImpl_GenCss_linkStyles() {
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
        return "linkStyles";
      }
      public String getText() {
        return (".GLA0CTDDAG,.GLA0CTDDAG A{font-weight:" + ("bold")  + ";text-decoration:" + ("none")  + ";color:" + ("black")  + ";}");
      }
      public java.lang.String activeLink(){
        return "GLA0CTDDAG";
      }
    }
    ;
  }
  private static class linkStylesInitializer {
    static {
      _instance0.linkStylesInitializer();
    }
    static org.opennms.features.poller.remote.gwt.client.DefaultApplicationView_BinderImpl_GenCss_linkStyles get() {
      return linkStyles;
    }
  }
  public org.opennms.features.poller.remote.gwt.client.DefaultApplicationView_BinderImpl_GenCss_linkStyles linkStyles() {
    return linkStylesInitializer.get();
  }
  private void styleInitializer() {
    style = new org.opennms.features.poller.remote.gwt.client.DefaultApplicationView_BinderImpl_GenCss_style() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GLA0CTDDFG{width:" + ("5px")  + ";}.GLA0CTDDIG{opacity:" + ("0.3")  + ";filter:" + ("alpha(opacity=30)")  + ";text-align:" + ("left")  + ";}.GLA0CTDDHG{margin-right:" + ("20px")  + ";margin-left:" + ("auto")  + ";padding-right:" + ("10px")  + ";padding-left:" + ("10px")  + ";}.GLA0CTDDGG{padding-right:" + ("8px")  + ";padding-left:" + ("8px")  + ";}.GLA0CTDDDG{background:") + (("#d5ddf3")  + ";}.GLA0CTDDCG{padding:" + ("5px")  + ";}.GLA0CTDDBG{width:" + ("100%")  + ";}.GLA0CTDDEG{padding:" + ("5px")  + ";opacity:" + ("0.3")  + ";filter:" + ("alpha(opacity=30)")  + ";}")) : ((".GLA0CTDDFG{width:" + ("5px")  + ";}.GLA0CTDDIG{opacity:" + ("0.3")  + ";filter:" + ("alpha(opacity=30)")  + ";text-align:" + ("right")  + ";}.GLA0CTDDHG{margin-left:" + ("20px")  + ";margin-right:" + ("auto")  + ";padding-left:" + ("10px")  + ";padding-right:" + ("10px")  + ";}.GLA0CTDDGG{padding-left:" + ("8px")  + ";padding-right:" + ("8px")  + ";}.GLA0CTDDDG{background:") + (("#d5ddf3")  + ";}.GLA0CTDDCG{padding:" + ("5px")  + ";}.GLA0CTDDBG{width:" + ("100%")  + ";}.GLA0CTDDEG{padding:" + ("5px")  + ";opacity:" + ("0.3")  + ";filter:" + ("alpha(opacity=30)")  + ";}"));
      }
      public java.lang.String fullWidth(){
        return "GLA0CTDDBG";
      }
      public java.lang.String label(){
        return "GLA0CTDDCG";
      }
      public java.lang.String linkBar(){
        return "GLA0CTDDDG";
      }
      public java.lang.String linkBarDivider(){
        return "GLA0CTDDEG";
      }
      public java.lang.String padding(){
        return "GLA0CTDDFG";
      }
      public java.lang.String statusCheckBox(){
        return "GLA0CTDDGG";
      }
      public java.lang.String statuses(){
        return "GLA0CTDDHG";
      }
      public java.lang.String updateTimestamp(){
        return "GLA0CTDDIG";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static org.opennms.features.poller.remote.gwt.client.DefaultApplicationView_BinderImpl_GenCss_style get() {
      return style;
    }
  }
  public org.opennms.features.poller.remote.gwt.client.DefaultApplicationView_BinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static org.opennms.features.poller.remote.gwt.client.DefaultApplicationView_BinderImpl_GenCss_linkStyles linkStyles;
  private static org.opennms.features.poller.remote.gwt.client.DefaultApplicationView_BinderImpl_GenCss_style style;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      linkStyles(), 
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("linkStyles", linkStyles());
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'linkStyles': return this.@org.opennms.features.poller.remote.gwt.client.DefaultApplicationView_BinderImpl_GenBundle::linkStyles()();
      case 'style': return this.@org.opennms.features.poller.remote.gwt.client.DefaultApplicationView_BinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
