package com.google.gwt.user.cellview.client;

public class CellTree_TemplateImpl implements com.google.gwt.user.cellview.client.CellTree.Template {
  
  public com.google.gwt.safehtml.shared.SafeHtml imageWrapper(java.lang.String arg0,com.google.gwt.safecss.shared.SafeStyles arg1,com.google.gwt.safehtml.shared.SafeHtml arg2) {
    StringBuilder sb = new java.lang.StringBuilder();
    sb.append("<div class=\"");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg0));
    sb.append("\" style=\"");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg1.asString()));
    sb.append("position:absolute;\">");
    sb.append(arg2.asString());
    sb.append("</div>");
return new com.google.gwt.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}
}
