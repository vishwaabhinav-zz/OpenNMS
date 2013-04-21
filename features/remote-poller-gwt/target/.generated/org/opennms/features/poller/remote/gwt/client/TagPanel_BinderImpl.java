package org.opennms.features.poller.remote.gwt.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class TagPanel_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, org.opennms.features.poller.remote.gwt.client.TagPanel>, org.opennms.features.poller.remote.gwt.client.TagPanel.Binder {

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final org.opennms.features.poller.remote.gwt.client.TagPanel owner) {

    org.opennms.features.poller.remote.gwt.client.TagPanel_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (org.opennms.features.poller.remote.gwt.client.TagPanel_BinderImpl_GenBundle) GWT.create(org.opennms.features.poller.remote.gwt.client.TagPanel_BinderImpl_GenBundle.class);
    org.opennms.features.poller.remote.gwt.client.TagPanel_BinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    org.opennms.features.poller.remote.gwt.client.TagPanel_BinderImpl_GenCss_tagStyles tagStyles = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.tagStyles();
    com.google.gwt.user.client.ui.Label f_Label2 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.FlowPanel tagPanel = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
    com.google.gwt.user.client.ui.Hyperlink clearTags = (com.google.gwt.user.client.ui.Hyperlink) GWT.create(com.google.gwt.user.client.ui.Hyperlink.class);
    com.google.gwt.user.client.ui.VerticalPanel f_VerticalPanel1 = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);

    f_Label2.addStyleName("" + style.panelHeader() + "");
    f_Label2.setText("Tags");
    f_VerticalPanel1.add(f_Label2);
    tagPanel.addStyleName("" + style.tagPanel() + "");
    f_VerticalPanel1.add(tagPanel);
    clearTags.addStyleName("" + style.clear() + "");
    clearTags.setText("clear selected tags");
    f_VerticalPanel1.add(clearTags);
    f_VerticalPanel1.addStyleName("" + style.outerTagPanel() + "");



    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onClearTagsClick(event);
      }
    };
    clearTags.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

    owner.clearTags = clearTags;
    owner.tagPanel = tagPanel;
    owner.tagStyles = tagStyles;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.tagStyles().ensureInjected();

    return f_VerticalPanel1;
  }
}
