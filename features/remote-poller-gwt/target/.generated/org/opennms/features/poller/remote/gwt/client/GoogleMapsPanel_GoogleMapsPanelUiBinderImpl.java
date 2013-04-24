package org.opennms.features.poller.remote.gwt.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class GoogleMapsPanel_GoogleMapsPanelUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, org.opennms.features.poller.remote.gwt.client.GoogleMapsPanel>, org.opennms.features.poller.remote.gwt.client.GoogleMapsPanel.GoogleMapsPanelUiBinder {

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final org.opennms.features.poller.remote.gwt.client.GoogleMapsPanel owner) {

    org.opennms.features.poller.remote.gwt.client.GoogleMapsPanel_GoogleMapsPanelUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (org.opennms.features.poller.remote.gwt.client.GoogleMapsPanel_GoogleMapsPanelUiBinderImpl_GenBundle) GWT.create(org.opennms.features.poller.remote.gwt.client.GoogleMapsPanel_GoogleMapsPanelUiBinderImpl_GenBundle.class);
    org.opennms.features.poller.remote.gwt.client.GoogleMapsPanel_GoogleMapsPanelUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    com.google.gwt.maps.client.MapWidget m_mapWidget = (com.google.gwt.maps.client.MapWidget) GWT.create(com.google.gwt.maps.client.MapWidget.class);




    owner.m_mapWidget = m_mapWidget;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return m_mapWidget;
  }
}
