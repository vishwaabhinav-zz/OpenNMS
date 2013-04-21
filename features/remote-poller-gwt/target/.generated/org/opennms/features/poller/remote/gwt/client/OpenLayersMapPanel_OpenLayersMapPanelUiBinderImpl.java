package org.opennms.features.poller.remote.gwt.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class OpenLayersMapPanel_OpenLayersMapPanelUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, org.opennms.features.poller.remote.gwt.client.OpenLayersMapPanel>, org.opennms.features.poller.remote.gwt.client.OpenLayersMapPanel.OpenLayersMapPanelUiBinder {

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final org.opennms.features.poller.remote.gwt.client.OpenLayersMapPanel owner) {

    org.opennms.features.poller.remote.gwt.client.OpenLayersMapPanel_OpenLayersMapPanelUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (org.opennms.features.poller.remote.gwt.client.OpenLayersMapPanel_OpenLayersMapPanelUiBinderImpl_GenBundle) GWT.create(org.opennms.features.poller.remote.gwt.client.OpenLayersMapPanel_OpenLayersMapPanelUiBinderImpl_GenBundle.class);
    org.opennms.features.poller.remote.gwt.client.OpenLayersMapPanel_OpenLayersMapPanelUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    com.google.gwt.user.client.ui.SimplePanel m_mapHolder = (com.google.gwt.user.client.ui.SimplePanel) GWT.create(com.google.gwt.user.client.ui.SimplePanel.class);




    owner.m_mapHolder = m_mapHolder;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return m_mapHolder;
  }
}
