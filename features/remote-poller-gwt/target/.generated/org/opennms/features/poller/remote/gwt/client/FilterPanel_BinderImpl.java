package org.opennms.features.poller.remote.gwt.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class FilterPanel_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, org.opennms.features.poller.remote.gwt.client.FilterPanel>, org.opennms.features.poller.remote.gwt.client.FilterPanel.Binder {

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final org.opennms.features.poller.remote.gwt.client.FilterPanel owner) {

    org.opennms.features.poller.remote.gwt.client.FilterPanel_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (org.opennms.features.poller.remote.gwt.client.FilterPanel_BinderImpl_GenBundle) GWT.create(org.opennms.features.poller.remote.gwt.client.FilterPanel_BinderImpl_GenBundle.class);
    org.opennms.features.poller.remote.gwt.client.FilterPanel_BinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    org.opennms.features.poller.remote.gwt.client.FilterPanel_BinderImpl_GenCss_filterStyles filterStyles = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.filterStyles();
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel2 = new com.google.gwt.user.client.ui.HTMLPanel("<hr>");
    com.google.gwt.user.client.ui.Label f_Label4 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.Label noApplicationsCaption = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.VerticalPanel applicationFilters = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);
    com.google.gwt.user.client.ui.Label f_Label5 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.SuggestBox applicationNameSuggestBox = owner.applicationNameSuggestBox;
    com.google.gwt.user.client.ui.VerticalPanel f_VerticalPanel3 = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);
    com.google.gwt.user.client.ui.VerticalPanel applicationTray = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);
    com.google.gwt.user.client.ui.VerticalPanel f_VerticalPanel1 = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);

    applicationTray.add(f_HTMLPanel2);
    f_Label4.addStyleName("" + style.panelHeader() + "");
    f_Label4.setText("Selected Applications");
    f_VerticalPanel3.add(f_Label4);
    noApplicationsCaption.addStyleName("" + filterStyles.panelEntry() + "");
    noApplicationsCaption.setText("No applications selected.");
    noApplicationsCaption.setVisible(false);
    f_VerticalPanel3.add(noApplicationsCaption);
    applicationFilters.addStyleName("" + style.fullWidth() + "");
    f_VerticalPanel3.add(applicationFilters);
    f_Label5.addStyleName("" + style.selectorLabel() + "");
    f_Label5.setText("Add application:");
    f_VerticalPanel3.add(f_Label5);
    f_VerticalPanel3.add(applicationNameSuggestBox);
    f_VerticalPanel3.addStyleName("" + style.panelPadding() + "");
    applicationTray.add(f_VerticalPanel3);
    applicationTray.addStyleName("" + style.fullWidth() + "");
    f_VerticalPanel1.add(applicationTray);
    f_VerticalPanel1.addStyleName("" + style.fullWidth() + "");



    final com.google.gwt.event.logical.shared.SelectionHandler<com.google.gwt.user.client.ui.SuggestOracle.Suggestion> handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.logical.shared.SelectionHandler<com.google.gwt.user.client.ui.SuggestOracle.Suggestion>() {
      public void onSelection(com.google.gwt.event.logical.shared.SelectionEvent<com.google.gwt.user.client.ui.SuggestOracle.Suggestion> event) {
        owner.onApplicationSelect(event);
      }
    };
    applicationNameSuggestBox.addSelectionHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

    owner.applicationFilters = applicationFilters;
    owner.applicationTray = applicationTray;
    owner.filterStyles = filterStyles;
    owner.noApplicationsCaption = noApplicationsCaption;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.filterStyles().ensureInjected();

    return f_VerticalPanel1;
  }
}
