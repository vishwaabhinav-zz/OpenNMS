package com.google.gwt.user.cellview.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class CellList_Resources_default_StaticClientBundleGenerator implements com.google.gwt.user.cellview.client.CellList.Resources {
  private static CellList_Resources_default_StaticClientBundleGenerator _instance0 = new CellList_Resources_default_StaticClientBundleGenerator();
  private void cellListSelectedBackgroundInitializer() {
    cellListSelectedBackground = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "cellListSelectedBackground",
      com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ?bundledImage_Horizontal_rtl : bundledImage_Horizontal,
      0, 0, 82, 26, false, false
    );
  }
  private static class cellListSelectedBackgroundInitializer {
    static {
      _instance0.cellListSelectedBackgroundInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return cellListSelectedBackground;
    }
  }
  public com.google.gwt.resources.client.ImageResource cellListSelectedBackground() {
    return cellListSelectedBackgroundInitializer.get();
  }
  private void cellListStyleInitializer() {
    cellListStyle = new com.google.gwt.user.cellview.client.CellList.Style() {
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
        return "cellListStyle";
      }
      public String getText() {
        return (".GALD-WOJ,.GALD-WOL{cursor:" + ("pointer")  + ";zoom:" + ("1")  + ";}.GALD-WOK{background:" + ("#ffc")  + ";}.GALD-WOM{height:" + ((CellList_Resources_default_StaticClientBundleGenerator.this.cellListSelectedBackground()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (CellList_Resources_default_StaticClientBundleGenerator.this.cellListSelectedBackground()).getURL() + "\") -" + (CellList_Resources_default_StaticClientBundleGenerator.this.cellListSelectedBackground()).getLeft() + "px -" + (CellList_Resources_default_StaticClientBundleGenerator.this.cellListSelectedBackground()).getTop() + "px  repeat-x")  + ";background-color:" + ("#628cd5")  + ";color:" + ("white")  + ";height:" + ("auto")  + ";overflow:" + ("visible")  + ";}");
      }
      public java.lang.String cellListEvenItem(){
        return "GALD-WOJ";
      }
      public java.lang.String cellListKeyboardSelectedItem(){
        return "GALD-WOK";
      }
      public java.lang.String cellListOddItem(){
        return "GALD-WOL";
      }
      public java.lang.String cellListSelectedItem(){
        return "GALD-WOM";
      }
      public java.lang.String cellListWidget(){
        return "GALD-WON";
      }
    }
    ;
  }
  private static class cellListStyleInitializer {
    static {
      _instance0.cellListStyleInitializer();
    }
    static com.google.gwt.user.cellview.client.CellList.Style get() {
      return cellListStyle;
    }
  }
  public com.google.gwt.user.cellview.client.CellList.Style cellListStyle() {
    return cellListStyleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static final java.lang.String bundledImage_Horizontal = GWT.getModuleBaseURL() + "CD15EC0BBF9CD57F9198FD5C1C37122E.cache.png";
  private static final java.lang.String bundledImage_Horizontal_rtl = GWT.getModuleBaseURL() + "9760B036C3B6E12FF6DEEDC917855221.cache.png";
  private static com.google.gwt.resources.client.ImageResource cellListSelectedBackground;
  private static com.google.gwt.user.cellview.client.CellList.Style cellListStyle;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      cellListSelectedBackground(), 
      cellListStyle(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("cellListSelectedBackground", cellListSelectedBackground());
        resourceMap.put("cellListStyle", cellListStyle());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'cellListSelectedBackground': return this.@com.google.gwt.user.cellview.client.CellList.Resources::cellListSelectedBackground()();
      case 'cellListStyle': return this.@com.google.gwt.user.cellview.client.CellList.Resources::cellListStyle()();
    }
    return null;
  }-*/;
}
