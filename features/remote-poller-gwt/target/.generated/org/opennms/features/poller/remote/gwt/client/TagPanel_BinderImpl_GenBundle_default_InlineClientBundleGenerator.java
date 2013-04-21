package org.opennms.features.poller.remote.gwt.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class TagPanel_BinderImpl_GenBundle_default_InlineClientBundleGenerator implements org.opennms.features.poller.remote.gwt.client.TagPanel_BinderImpl_GenBundle {
  private static TagPanel_BinderImpl_GenBundle_default_InlineClientBundleGenerator _instance0 = new TagPanel_BinderImpl_GenBundle_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new org.opennms.features.poller.remote.gwt.client.TagPanel_BinderImpl_GenCss_style() {
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
        return (".GLA0CTDDPI{font-weight:" + ("bold")  + ";font-size:" + ("13px")  + ";}.GLA0CTDDOI{width:" + ("100%")  + ";text-align:" + ("center")  + ";vertical-align:" + ("middle")  + ";padding:" + ("10px")  + ";}.GLA0CTDDAJ{width:" + ("100%")  + ";text-align:" + ("center")  + ";vertical-align:" + ("middle")  + ";}.GLA0CTDDNI{padding:" + ("3px")  + ";font-size:") + (("0.8em")  + ";}");
      }
      public java.lang.String clear(){
        return "GLA0CTDDNI";
      }
      public java.lang.String outerTagPanel(){
        return "GLA0CTDDOI";
      }
      public java.lang.String panelHeader(){
        return "GLA0CTDDPI";
      }
      public java.lang.String tagPanel(){
        return "GLA0CTDDAJ";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static org.opennms.features.poller.remote.gwt.client.TagPanel_BinderImpl_GenCss_style get() {
      return style;
    }
  }
  public org.opennms.features.poller.remote.gwt.client.TagPanel_BinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private void tagStylesInitializer() {
    tagStyles = new org.opennms.features.poller.remote.gwt.client.TagPanel_BinderImpl_GenCss_tagStyles() {
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
        return "tagStyles";
      }
      public String getText() {
        return (".GLA0CTDDBJ,.GLA0CTDDBJ A,.GLA0CTDDBJ A:hover,.GLA0CTDDBJ A:visited{color:" + ("black")  + ";font-weight:" + ("bold")  + ";}.GLA0CTDDCJ{cursor:" + ("pointer")  + ";font-size:" + ("0.8em")  + ";display:" + ("inline")  + ";padding:" + ("3px")  + ";text-decoration:" + ("none")  + ";}.GLA0CTDDDJ{cursor:" + ("pointer")  + ";font-size:" + ("0.9em")  + ";display:" + ("inline")  + ";padding:") + (("3px")  + ";text-decoration:" + ("none")  + ";}.GLA0CTDDEJ{cursor:" + ("pointer")  + ";font-size:" + ("1em")  + ";display:" + ("inline")  + ";padding:" + ("3px")  + ";text-decoration:" + ("none")  + ";}.GLA0CTDDFJ{cursor:" + ("pointer")  + ";font-size:" + ("1.2em")  + ";display:" + ("inline")  + ";padding:" + ("3px") ) + (";text-decoration:" + ("none")  + ";}.GLA0CTDDGJ{cursor:" + ("pointer")  + ";font-size:" + ("1.4em")  + ";display:" + ("inline")  + ";padding:" + ("3px")  + ";text-decoration:" + ("none")  + ";}.GLA0CTDDHJ{cursor:" + ("pointer")  + ";font-size:" + ("1.6em")  + ";display:" + ("inline")  + ";padding:" + ("3px")  + ";text-decoration:") + (("none")  + ";}.GLA0CTDDIJ{cursor:" + ("pointer")  + ";font-size:" + ("1.8em")  + ";display:" + ("inline")  + ";padding:" + ("3px")  + ";text-decoration:" + ("none")  + ";}.GLA0CTDDJJ{cursor:" + ("pointer")  + ";font-size:" + ("2em")  + ";display:" + ("inline")  + ";padding:" + ("3px")  + ";text-decoration:" + ("none") ) + (";}.GLA0CTDDKJ{cursor:" + ("pointer")  + ";font-size:" + ("2.2em")  + ";display:" + ("inline")  + ";padding:" + ("3px")  + ";text-decoration:" + ("none")  + ";}.GLA0CTDDLJ{cursor:" + ("pointer")  + ";font-size:" + ("2.4em")  + ";display:" + ("inline")  + ";padding:" + ("3px")  + ";text-decoration:" + ("none")  + ";}");
      }
      public java.lang.String selectedTag(){
        return "GLA0CTDDBJ";
      }
      public java.lang.String tag0(){
        return "GLA0CTDDCJ";
      }
      public java.lang.String tag1(){
        return "GLA0CTDDDJ";
      }
      public java.lang.String tag2(){
        return "GLA0CTDDEJ";
      }
      public java.lang.String tag3(){
        return "GLA0CTDDFJ";
      }
      public java.lang.String tag4(){
        return "GLA0CTDDGJ";
      }
      public java.lang.String tag5(){
        return "GLA0CTDDHJ";
      }
      public java.lang.String tag6(){
        return "GLA0CTDDIJ";
      }
      public java.lang.String tag7(){
        return "GLA0CTDDJJ";
      }
      public java.lang.String tag8(){
        return "GLA0CTDDKJ";
      }
      public java.lang.String tag9(){
        return "GLA0CTDDLJ";
      }
    }
    ;
  }
  private static class tagStylesInitializer {
    static {
      _instance0.tagStylesInitializer();
    }
    static org.opennms.features.poller.remote.gwt.client.TagPanel_BinderImpl_GenCss_tagStyles get() {
      return tagStyles;
    }
  }
  public org.opennms.features.poller.remote.gwt.client.TagPanel_BinderImpl_GenCss_tagStyles tagStyles() {
    return tagStylesInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static org.opennms.features.poller.remote.gwt.client.TagPanel_BinderImpl_GenCss_style style;
  private static org.opennms.features.poller.remote.gwt.client.TagPanel_BinderImpl_GenCss_tagStyles tagStyles;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      style(), 
      tagStyles(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("style", style());
        resourceMap.put("tagStyles", tagStyles());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'style': return this.@org.opennms.features.poller.remote.gwt.client.TagPanel_BinderImpl_GenBundle::style()();
      case 'tagStyles': return this.@org.opennms.features.poller.remote.gwt.client.TagPanel_BinderImpl_GenBundle::tagStyles()();
    }
    return null;
  }-*/;
}
