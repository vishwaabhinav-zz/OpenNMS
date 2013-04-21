package org.opennms.features.node.list.gwt.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.safehtml.client.SafeHtmlTemplates;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class PageableNodeList_PageableNodeListUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, org.opennms.features.node.list.gwt.client.PageableNodeList>, org.opennms.features.node.list.gwt.client.PageableNodeList.PageableNodeListUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("Search")
    SafeHtml html1();
     
    @Template("IP Interfaces")
    SafeHtml html2();
     
    @Template("Search")
    SafeHtml html3();
     
    @Template("Physical Interfaces")
    SafeHtml html4();
     
  }

  Template template = GWT.create(Template.class);

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final org.opennms.features.node.list.gwt.client.PageableNodeList owner) {

    org.opennms.features.node.list.gwt.client.PageableNodeList_PageableNodeListUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (org.opennms.features.node.list.gwt.client.PageableNodeList_PageableNodeListUiBinderImpl_GenBundle) GWT.create(org.opennms.features.node.list.gwt.client.PageableNodeList_PageableNodeListUiBinderImpl_GenBundle.class);
    org.opennms.features.node.list.gwt.client.PageableNodeList_PageableNodeListUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    org.opennms.features.node.list.gwt.client.IpInterfaceTable m_ipInterfaceTable = (org.opennms.features.node.list.gwt.client.IpInterfaceTable) GWT.create(org.opennms.features.node.list.gwt.client.IpInterfaceTable.class);
    com.google.gwt.user.client.ui.FlowPanel m_ipInterfaceTableDiv = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
    com.google.gwt.user.client.ui.FlowPanel m_ipTableDiv = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
    com.google.gwt.user.client.ui.ListBox m_ipSearchList = (com.google.gwt.user.client.ui.ListBox) GWT.create(com.google.gwt.user.client.ui.ListBox.class);
    com.google.gwt.user.client.ui.TextBox m_ipTextBox = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    com.google.gwt.user.client.ui.Button m_ipSearchBtn = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    com.google.gwt.user.client.ui.LayoutPanel f_LayoutPanel1 = (com.google.gwt.user.client.ui.LayoutPanel) GWT.create(com.google.gwt.user.client.ui.LayoutPanel.class);
    org.opennms.features.node.list.gwt.client.PhysicalInterfaceTable m_physicalInterfaceTable = (org.opennms.features.node.list.gwt.client.PhysicalInterfaceTable) GWT.create(org.opennms.features.node.list.gwt.client.PhysicalInterfaceTable.class);
    com.google.gwt.user.client.ui.FlowPanel m_physicalTableDiv = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
    com.google.gwt.user.client.ui.FlowPanel m_physTableDiv = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
    com.google.gwt.user.client.ui.ListBox m_physSearchList = (com.google.gwt.user.client.ui.ListBox) GWT.create(com.google.gwt.user.client.ui.ListBox.class);
    com.google.gwt.user.client.ui.TextBox m_physTextBox = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    com.google.gwt.user.client.ui.Button m_physSearchBtn = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    com.google.gwt.user.client.ui.LayoutPanel f_LayoutPanel2 = (com.google.gwt.user.client.ui.LayoutPanel) GWT.create(com.google.gwt.user.client.ui.LayoutPanel.class);
    com.google.gwt.user.client.ui.TabLayoutPanel m_tabLayoutPanel = new com.google.gwt.user.client.ui.TabLayoutPanel(1.25, com.google.gwt.dom.client.Style.Unit.EM);

    m_ipInterfaceTableDiv.add(m_ipInterfaceTable);
    f_LayoutPanel1.add(m_ipInterfaceTableDiv);
    f_LayoutPanel1.setWidgetLeftRight(m_ipInterfaceTableDiv, 0, com.google.gwt.dom.client.Style.Unit.PX, 0, com.google.gwt.dom.client.Style.Unit.PX);
    f_LayoutPanel1.setWidgetTopBottom(m_ipInterfaceTableDiv, 0, com.google.gwt.dom.client.Style.Unit.PX, 50, com.google.gwt.dom.client.Style.Unit.PX);
    f_LayoutPanel1.add(m_ipTableDiv);
    f_LayoutPanel1.setWidgetLeftRight(m_ipTableDiv, 25, com.google.gwt.dom.client.Style.Unit.PCT, 20, com.google.gwt.dom.client.Style.Unit.PCT);
    f_LayoutPanel1.setWidgetBottomHeight(m_ipTableDiv, 27, com.google.gwt.dom.client.Style.Unit.PX, 21, com.google.gwt.dom.client.Style.Unit.PX);
    m_ipSearchList.setStyleName("" + style.selectBox() + "");
    m_ipSearchList.setHeight("20px");
    m_ipSearchList.setWidth("100%");
    f_LayoutPanel1.add(m_ipSearchList);
    f_LayoutPanel1.setWidgetLeftRight(m_ipSearchList, 0, com.google.gwt.dom.client.Style.Unit.PCT, 70, com.google.gwt.dom.client.Style.Unit.PCT);
    f_LayoutPanel1.setWidgetBottomHeight(m_ipSearchList, 0, com.google.gwt.dom.client.Style.Unit.PX, 25, com.google.gwt.dom.client.Style.Unit.PX);
    m_ipTextBox.setWidth("100%");
    f_LayoutPanel1.add(m_ipTextBox);
    f_LayoutPanel1.setWidgetLeftRight(m_ipTextBox, 30, com.google.gwt.dom.client.Style.Unit.PCT, 30, com.google.gwt.dom.client.Style.Unit.PCT);
    f_LayoutPanel1.setWidgetBottomHeight(m_ipTextBox, 0, com.google.gwt.dom.client.Style.Unit.PX, 25, com.google.gwt.dom.client.Style.Unit.PX);
    m_ipSearchBtn.setHTML(template.html1().asString());
    m_ipSearchBtn.setHeight("25px");
    m_ipSearchBtn.setWidth("100%");
    f_LayoutPanel1.add(m_ipSearchBtn);
    f_LayoutPanel1.setWidgetLeftRight(m_ipSearchBtn, 70, com.google.gwt.dom.client.Style.Unit.PCT, 0, com.google.gwt.dom.client.Style.Unit.PCT);
    f_LayoutPanel1.setWidgetBottomHeight(m_ipSearchBtn, 0, com.google.gwt.dom.client.Style.Unit.PX, 25, com.google.gwt.dom.client.Style.Unit.PX);
    m_tabLayoutPanel.add(f_LayoutPanel1, template.html2().asString(), true);
    m_physicalTableDiv.add(m_physicalInterfaceTable);
    f_LayoutPanel2.add(m_physicalTableDiv);
    f_LayoutPanel2.setWidgetLeftRight(m_physicalTableDiv, 0, com.google.gwt.dom.client.Style.Unit.PX, 0, com.google.gwt.dom.client.Style.Unit.PX);
    f_LayoutPanel2.setWidgetTopBottom(m_physicalTableDiv, 0, com.google.gwt.dom.client.Style.Unit.PX, 50, com.google.gwt.dom.client.Style.Unit.PX);
    f_LayoutPanel2.add(m_physTableDiv);
    f_LayoutPanel2.setWidgetLeftRight(m_physTableDiv, 25, com.google.gwt.dom.client.Style.Unit.PCT, 20, com.google.gwt.dom.client.Style.Unit.PCT);
    f_LayoutPanel2.setWidgetBottomHeight(m_physTableDiv, 27, com.google.gwt.dom.client.Style.Unit.PX, 21, com.google.gwt.dom.client.Style.Unit.PX);
    m_physSearchList.setStyleName("" + style.selectBox() + "");
    m_physSearchList.setHeight("20px");
    m_physSearchList.setWidth("100%");
    f_LayoutPanel2.add(m_physSearchList);
    f_LayoutPanel2.setWidgetLeftRight(m_physSearchList, 0, com.google.gwt.dom.client.Style.Unit.PCT, 70, com.google.gwt.dom.client.Style.Unit.PCT);
    f_LayoutPanel2.setWidgetBottomHeight(m_physSearchList, 0, com.google.gwt.dom.client.Style.Unit.PX, 25, com.google.gwt.dom.client.Style.Unit.PX);
    m_physTextBox.setWidth("100%");
    f_LayoutPanel2.add(m_physTextBox);
    f_LayoutPanel2.setWidgetLeftRight(m_physTextBox, 30, com.google.gwt.dom.client.Style.Unit.PCT, 30, com.google.gwt.dom.client.Style.Unit.PCT);
    f_LayoutPanel2.setWidgetBottomHeight(m_physTextBox, 0, com.google.gwt.dom.client.Style.Unit.PX, 25, com.google.gwt.dom.client.Style.Unit.PX);
    m_physSearchBtn.setHTML(template.html3().asString());
    m_physSearchBtn.setHeight("25px");
    m_physSearchBtn.setWidth("100%");
    f_LayoutPanel2.add(m_physSearchBtn);
    f_LayoutPanel2.setWidgetLeftRight(m_physSearchBtn, 70, com.google.gwt.dom.client.Style.Unit.PCT, 0, com.google.gwt.dom.client.Style.Unit.PCT);
    f_LayoutPanel2.setWidgetBottomHeight(m_physSearchBtn, 0, com.google.gwt.dom.client.Style.Unit.PX, 25, com.google.gwt.dom.client.Style.Unit.PX);
    m_tabLayoutPanel.add(f_LayoutPanel2, template.html4().asString(), true);



    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.handleIpSearchBtnClick(event);
      }
    };
    m_ipSearchBtn.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.handlePhysSearchClick(event);
      }
    };
    m_physSearchBtn.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2);

    owner.m_ipInterfaceTable = m_ipInterfaceTable;
    owner.m_ipInterfaceTableDiv = m_ipInterfaceTableDiv;
    owner.m_ipSearchBtn = m_ipSearchBtn;
    owner.m_ipSearchList = m_ipSearchList;
    owner.m_ipTableDiv = m_ipTableDiv;
    owner.m_ipTextBox = m_ipTextBox;
    owner.m_physSearchBtn = m_physSearchBtn;
    owner.m_physSearchList = m_physSearchList;
    owner.m_physTableDiv = m_physTableDiv;
    owner.m_physTextBox = m_physTextBox;
    owner.m_physicalInterfaceTable = m_physicalInterfaceTable;
    owner.m_physicalTableDiv = m_physicalTableDiv;
    owner.m_tabLayoutPanel = m_tabLayoutPanel;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return m_tabLayoutPanel;
  }
}
