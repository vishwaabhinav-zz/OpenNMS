package org.opennms.features.poller.remote.gwt.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class LocationPanel_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, org.opennms.features.poller.remote.gwt.client.LocationPanel>, org.opennms.features.poller.remote.gwt.client.LocationPanel.Binder {

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final org.opennms.features.poller.remote.gwt.client.LocationPanel owner) {

    org.opennms.features.poller.remote.gwt.client.LocationPanel_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (org.opennms.features.poller.remote.gwt.client.LocationPanel_BinderImpl_GenBundle) GWT.create(org.opennms.features.poller.remote.gwt.client.LocationPanel_BinderImpl_GenBundle.class);
    org.opennms.features.poller.remote.gwt.client.LocationPanel_BinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    org.opennms.features.poller.remote.gwt.client.FilterPanel filterPanel = (org.opennms.features.poller.remote.gwt.client.FilterPanel) GWT.create(org.opennms.features.poller.remote.gwt.client.FilterPanel.class);
    java.lang.String domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
    org.opennms.features.poller.remote.gwt.client.TagPanel tagPanel = (org.opennms.features.poller.remote.gwt.client.TagPanel) GWT.create(org.opennms.features.poller.remote.gwt.client.TagPanel.class);
    com.google.gwt.user.client.ui.HTMLPanel filterOptionsPanel = new com.google.gwt.user.client.ui.HTMLPanel("<span id='" + domId0 + "'></span> <hr> <span id='" + domId1 + "'></span> <hr>");
    com.google.gwt.user.client.ui.FlowPanel f_FlowPanel1 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
    org.opennms.features.poller.remote.gwt.client.PageableApplicationList applicationList = (org.opennms.features.poller.remote.gwt.client.PageableApplicationList) GWT.create(org.opennms.features.poller.remote.gwt.client.PageableApplicationList.class);
    org.opennms.features.poller.remote.gwt.client.PageableLocationList locationList = (org.opennms.features.poller.remote.gwt.client.PageableLocationList) GWT.create(org.opennms.features.poller.remote.gwt.client.PageableLocationList.class);
    com.google.gwt.user.client.ui.FlowPanel listsPanel = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
    com.google.gwt.user.client.ui.FlowPanel locationPanel = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);

    f_FlowPanel1.add(filterOptionsPanel);
    locationPanel.add(f_FlowPanel1);
    applicationList.setStyleName("" + style.lists() + "");
    listsPanel.add(applicationList);
    locationList.setStyleName("" + style.lists() + "");
    listsPanel.add(locationList);
    listsPanel.setStyleName("" + style.listsPanel() + "");
    locationPanel.add(listsPanel);
    locationPanel.setStyleName("" + style.topLevelContainer() + "");

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(filterOptionsPanel.getElement());
    com.google.gwt.user.client.Element domId0Element = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    com.google.gwt.user.client.Element domId1Element = com.google.gwt.dom.client.Document.get().getElementById(domId1).cast();
    attachRecord0.detach();
    filterOptionsPanel.addAndReplaceElement(filterPanel, domId0Element);
    filterOptionsPanel.addAndReplaceElement(tagPanel, domId1Element);


    owner.applicationList = applicationList;
    owner.filterOptionsPanel = filterOptionsPanel;
    owner.filterPanel = filterPanel;
    owner.listsPanel = listsPanel;
    owner.locationList = locationList;
    owner.locationPanel = locationPanel;
    owner.tagPanel = tagPanel;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return locationPanel;
  }
}
