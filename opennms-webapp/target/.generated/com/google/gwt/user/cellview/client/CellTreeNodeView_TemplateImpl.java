package com.google.gwt.user.cellview.client;

public class CellTreeNodeView_TemplateImpl implements com.google.gwt.user.cellview.client.CellTreeNodeView.Template {
  
  public com.google.gwt.safehtml.shared.SafeHtml outerDiv(com.google.gwt.safecss.shared.SafeStyles arg0,java.lang.String arg1,com.google.gwt.safehtml.shared.SafeHtml arg2) {
    StringBuilder sb = new java.lang.StringBuilder();
    sb.append("<div><div style=\"");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg0.asString()));
    sb.append("\" class=\"");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg1));
    sb.append("\">");
    sb.append(arg2.asString());
    sb.append("</div></div>");
return new com.google.gwt.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}

public com.google.gwt.safehtml.shared.SafeHtml innerDiv(com.google.gwt.safecss.shared.SafeStyles arg0,java.lang.String arg1,com.google.gwt.safehtml.shared.SafeHtml arg2,java.lang.String arg3,com.google.gwt.safehtml.shared.SafeHtml arg4) {
StringBuilder sb = new java.lang.StringBuilder();
sb.append("<div onclick=\"\" style=\"");
sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg0.asString()));
sb.append("position:relative;\" class=\"");
sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg1));
sb.append("\">");
sb.append(arg2.asString());
sb.append("<div class=\"");
sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg3));
sb.append("\">");
sb.append(arg4.asString());
sb.append("</div></div>");
return new com.google.gwt.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}
}
