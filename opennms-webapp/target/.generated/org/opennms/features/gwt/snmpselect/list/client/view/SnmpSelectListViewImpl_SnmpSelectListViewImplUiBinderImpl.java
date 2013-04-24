package org.opennms.features.gwt.snmpselect.list.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class SnmpSelectListViewImpl_SnmpSelectListViewImplUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, org.opennms.features.gwt.snmpselect.list.client.view.SnmpSelectListViewImpl>, org.opennms.features.gwt.snmpselect.list.client.view.SnmpSelectListViewImpl.SnmpSelectListViewImplUiBinder {

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final org.opennms.features.gwt.snmpselect.list.client.view.SnmpSelectListViewImpl owner) {

    org.opennms.features.gwt.snmpselect.list.client.view.SnmpSelectListViewImpl_SnmpSelectListViewImplUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (org.opennms.features.gwt.snmpselect.list.client.view.SnmpSelectListViewImpl_SnmpSelectListViewImplUiBinderImpl_GenBundle) GWT.create(org.opennms.features.gwt.snmpselect.list.client.view.SnmpSelectListViewImpl_SnmpSelectListViewImplUiBinderImpl_GenBundle.class);
    org.opennms.features.gwt.snmpselect.list.client.view.SnmpSelectListViewImpl_SnmpSelectListViewImplUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    org.opennms.features.gwt.snmpselect.list.client.view.SnmpSelectTable m_snmpSelectTable = (org.opennms.features.gwt.snmpselect.list.client.view.SnmpSelectTable) GWT.create(org.opennms.features.gwt.snmpselect.list.client.view.SnmpSelectTable.class);
    com.google.gwt.user.client.ui.FlowPanel f_FlowPanel1 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
    com.google.gwt.user.client.ui.FlowPanel m_pagerContainer = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
    com.google.gwt.user.client.ui.LayoutPanel m_layoutPanel = (com.google.gwt.user.client.ui.LayoutPanel) GWT.create(com.google.gwt.user.client.ui.LayoutPanel.class);

    f_FlowPanel1.add(m_snmpSelectTable);
    m_layoutPanel.add(f_FlowPanel1);
    m_layoutPanel.setWidgetLeftRight(f_FlowPanel1, 0, com.google.gwt.dom.client.Style.Unit.PX, 0, com.google.gwt.dom.client.Style.Unit.PX);
    m_layoutPanel.setWidgetTopBottom(f_FlowPanel1, 0, com.google.gwt.dom.client.Style.Unit.PX, 30, com.google.gwt.dom.client.Style.Unit.PX);
    m_layoutPanel.add(m_pagerContainer);
    m_layoutPanel.setWidgetLeftRight(m_pagerContainer, 0, com.google.gwt.dom.client.Style.Unit.PX, 0, com.google.gwt.dom.client.Style.Unit.PX);
    m_layoutPanel.setWidgetBottomHeight(m_pagerContainer, 0, com.google.gwt.dom.client.Style.Unit.PX, 30, com.google.gwt.dom.client.Style.Unit.PX);



    owner.m_layoutPanel = m_layoutPanel;
    owner.m_pagerContainer = m_pagerContainer;
    owner.m_snmpSelectTable = m_snmpSelectTable;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return m_layoutPanel;
  }
}
