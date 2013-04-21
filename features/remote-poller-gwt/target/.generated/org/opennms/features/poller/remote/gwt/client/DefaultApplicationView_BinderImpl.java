package org.opennms.features.poller.remote.gwt.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.DockLayoutPanel;

public class DefaultApplicationView_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.DockLayoutPanel, org.opennms.features.poller.remote.gwt.client.DefaultApplicationView>, org.opennms.features.poller.remote.gwt.client.DefaultApplicationView.Binder {

  public com.google.gwt.user.client.ui.DockLayoutPanel createAndBindUi(final org.opennms.features.poller.remote.gwt.client.DefaultApplicationView owner) {

    org.opennms.features.poller.remote.gwt.client.DefaultApplicationView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (org.opennms.features.poller.remote.gwt.client.DefaultApplicationView_BinderImpl_GenBundle) GWT.create(org.opennms.features.poller.remote.gwt.client.DefaultApplicationView_BinderImpl_GenBundle.class);
    org.opennms.features.poller.remote.gwt.client.DefaultApplicationView_BinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    org.opennms.features.poller.remote.gwt.client.DefaultApplicationView_BinderImpl_GenCss_linkStyles linkStyles = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.linkStyles();
    com.google.gwt.user.client.ui.Hyperlink locationLink = (com.google.gwt.user.client.ui.Hyperlink) GWT.create(com.google.gwt.user.client.ui.Hyperlink.class);
    com.google.gwt.user.client.ui.Label f_Label3 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.Hyperlink applicationLink = (com.google.gwt.user.client.ui.Hyperlink) GWT.create(com.google.gwt.user.client.ui.Hyperlink.class);
    com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel2 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
    com.google.gwt.user.client.ui.CheckBox statusDown = (com.google.gwt.user.client.ui.CheckBox) GWT.create(com.google.gwt.user.client.ui.CheckBox.class);
    com.google.gwt.user.client.ui.CheckBox statusDisconnected = (com.google.gwt.user.client.ui.CheckBox) GWT.create(com.google.gwt.user.client.ui.CheckBox.class);
    com.google.gwt.user.client.ui.CheckBox statusMarginal = (com.google.gwt.user.client.ui.CheckBox) GWT.create(com.google.gwt.user.client.ui.CheckBox.class);
    com.google.gwt.user.client.ui.CheckBox statusUp = (com.google.gwt.user.client.ui.CheckBox) GWT.create(com.google.gwt.user.client.ui.CheckBox.class);
    com.google.gwt.user.client.ui.CheckBox statusStopped = (com.google.gwt.user.client.ui.CheckBox) GWT.create(com.google.gwt.user.client.ui.CheckBox.class);
    com.google.gwt.user.client.ui.CheckBox statusUnknown = (com.google.gwt.user.client.ui.CheckBox) GWT.create(com.google.gwt.user.client.ui.CheckBox.class);
    com.google.gwt.user.client.ui.HorizontalPanel statusesPanel = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
    com.google.gwt.user.client.ui.Label updateTimestamp = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.Label f_Label4 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel1 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
    org.opennms.features.poller.remote.gwt.client.LocationPanel locationPanel = (org.opennms.features.poller.remote.gwt.client.LocationPanel) GWT.create(org.opennms.features.poller.remote.gwt.client.LocationPanel.class);
    com.google.gwt.user.client.ui.SplitLayoutPanel splitPanel = (com.google.gwt.user.client.ui.SplitLayoutPanel) GWT.create(com.google.gwt.user.client.ui.SplitLayoutPanel.class);
    com.google.gwt.user.client.ui.DockLayoutPanel mainPanel = new com.google.gwt.user.client.ui.DockLayoutPanel(com.google.gwt.dom.client.Style.Unit.PX);

    locationLink.addStyleName("" + style.label() + "");
    locationLink.setText("Locations");
    f_HorizontalPanel2.add(locationLink);
    f_Label3.setText("|");
    f_Label3.addStyleName("" + style.linkBarDivider() + "");
    f_HorizontalPanel2.add(f_Label3);
    applicationLink.addStyleName("" + style.label() + "");
    applicationLink.setText("Applications");
    f_HorizontalPanel2.add(applicationLink);
    f_HorizontalPanel1.add(f_HorizontalPanel2);
    statusDown.setHTML("<img alt='Down' height='16' src='images/selected-DOWN.png' title='Down' width='16'>");
    statusDown.addStyleName("" + style.statusCheckBox() + "");
    statusDown.setFormValue("DOWN");
    statusDown.setTitle("Down");
    statusDown.setChecked(true);
    statusesPanel.add(statusDown);
    statusDisconnected.setHTML("<img alt='Disconnected' height='16' src='images/selected-DISCONNECTED.png' title='Disconnected' width='16'>");
    statusDisconnected.addStyleName("" + style.statusCheckBox() + "");
    statusDisconnected.setFormValue("DISCONNECTED");
    statusDisconnected.setTitle("Disconnected");
    statusDisconnected.setChecked(true);
    statusesPanel.add(statusDisconnected);
    statusMarginal.setHTML("<img alt='Marginal' height='16' src='images/selected-MARGINAL.png' title='Marginal' width='16'>");
    statusMarginal.addStyleName("" + style.statusCheckBox() + "");
    statusMarginal.setFormValue("MARGINAL");
    statusMarginal.setTitle("Marginal");
    statusMarginal.setChecked(true);
    statusesPanel.add(statusMarginal);
    statusUp.setHTML("<img alt='Up' height='16' src='images/selected-UP.png' title='Up' width='16'>");
    statusUp.addStyleName("" + style.statusCheckBox() + "");
    statusUp.setFormValue("UP");
    statusUp.setTitle("Up");
    statusUp.setChecked(true);
    statusesPanel.add(statusUp);
    statusStopped.setHTML("<img alt='Stopped' height='16' src='images/selected-STOPPED.png' title='Stopped' width='16'>");
    statusStopped.addStyleName("" + style.statusCheckBox() + "");
    statusStopped.setFormValue("STOPPED");
    statusStopped.setTitle("Stopped");
    statusStopped.setChecked(true);
    statusesPanel.add(statusStopped);
    statusUnknown.setHTML("<img alt='Unknown' height='16' src='images/selected-UNKNOWN.png' title='Unknown' width='16'>");
    statusUnknown.addStyleName("" + style.statusCheckBox() + "");
    statusUnknown.setFormValue("UNKNOWN");
    statusUnknown.setTitle("Unknown");
    statusUnknown.setChecked(false);
    statusesPanel.add(statusUnknown);
    statusesPanel.addStyleName("" + style.label() + "");
    statusesPanel.addStyleName("" + style.statuses() + "");
    f_HorizontalPanel1.add(statusesPanel);
    updateTimestamp.addStyleName("" + style.label() + "");
    updateTimestamp.addStyleName("" + style.fullWidth() + "");
    updateTimestamp.addStyleName("" + style.updateTimestamp() + "");
    f_HorizontalPanel1.add(updateTimestamp);
    f_Label4.setText(" ");
    f_HorizontalPanel1.add(f_Label4);
    f_HorizontalPanel1.addStyleName("" + style.fullWidth() + "");
    f_HorizontalPanel1.addStyleName("" + style.linkBar() + "");
    mainPanel.addNorth(f_HorizontalPanel1, 25);
    splitPanel.addWest(locationPanel, 250);
    mainPanel.add(splitPanel);



    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onDownClicked(event);
      }
    };
    statusDown.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onDisconnectedClicked(event);
      }
    };
    statusDisconnected.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2);

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames3 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onMarginalClicked(event);
      }
    };
    statusMarginal.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames3);

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames4 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onUpClicked(event);
      }
    };
    statusUp.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames4);

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames5 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onStoppedClicked(event);
      }
    };
    statusStopped.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames5);

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames6 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onUnknownClicked(event);
      }
    };
    statusUnknown.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames6);

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames7 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onApplicationClick(event);
      }
    };
    applicationLink.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames7);

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames8 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onLocationClick(event);
      }
    };
    locationLink.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames8);

    owner.applicationLink = applicationLink;
    owner.linkStyles = linkStyles;
    owner.locationLink = locationLink;
    owner.locationPanel = locationPanel;
    owner.mainPanel = mainPanel;
    owner.splitPanel = splitPanel;
    owner.statusDisconnected = statusDisconnected;
    owner.statusDown = statusDown;
    owner.statusMarginal = statusMarginal;
    owner.statusStopped = statusStopped;
    owner.statusUnknown = statusUnknown;
    owner.statusUp = statusUp;
    owner.statusesPanel = statusesPanel;
    owner.updateTimestamp = updateTimestamp;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.linkStyles().ensureInjected();

    return mainPanel;
  }
}
