package org.opennms.features.gwt.graph.resource.list.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.safehtml.client.SafeHtmlTemplates;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class DefaultResourceListViewImpl_DefaultResourceListViewImplUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, org.opennms.features.gwt.graph.resource.list.client.view.DefaultResourceListViewImpl>, org.opennms.features.gwt.graph.resource.list.client.view.DefaultResourceListViewImpl.DefaultResourceListViewImplUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("Search")
    SafeHtml html1();
     
  }

  Template template = GWT.create(Template.class);

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final org.opennms.features.gwt.graph.resource.list.client.view.DefaultResourceListViewImpl owner) {

    org.opennms.features.gwt.graph.resource.list.client.view.DefaultResourceListViewImpl_DefaultResourceListViewImplUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (org.opennms.features.gwt.graph.resource.list.client.view.DefaultResourceListViewImpl_DefaultResourceListViewImplUiBinderImpl_GenBundle) GWT.create(org.opennms.features.gwt.graph.resource.list.client.view.DefaultResourceListViewImpl_DefaultResourceListViewImplUiBinderImpl_GenBundle.class);
    org.opennms.features.gwt.graph.resource.list.client.view.DefaultResourceListViewImpl_DefaultResourceListViewImplUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    org.opennms.features.gwt.graph.resource.list.client.view.ResourceTable m_resourceTable = (org.opennms.features.gwt.graph.resource.list.client.view.ResourceTable) GWT.create(org.opennms.features.gwt.graph.resource.list.client.view.ResourceTable.class);
    com.google.gwt.user.client.ui.FlowPanel m_simplePagerContainer = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
    com.google.gwt.user.client.ui.Button m_searchBtn = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    com.google.gwt.user.client.ui.LayoutPanel m_layoutPanel = (com.google.gwt.user.client.ui.LayoutPanel) GWT.create(com.google.gwt.user.client.ui.LayoutPanel.class);

    m_layoutPanel.add(m_resourceTable);
    m_layoutPanel.setWidgetLeftRight(m_resourceTable, 0, com.google.gwt.dom.client.Style.Unit.PX, 0, com.google.gwt.dom.client.Style.Unit.PX);
    m_layoutPanel.setWidgetTopBottom(m_resourceTable, 0, com.google.gwt.dom.client.Style.Unit.PX, 27, com.google.gwt.dom.client.Style.Unit.PX);
    m_layoutPanel.add(m_simplePagerContainer);
    m_layoutPanel.setWidgetLeftRight(m_simplePagerContainer, 0, com.google.gwt.dom.client.Style.Unit.PX, 55, com.google.gwt.dom.client.Style.Unit.PX);
    m_layoutPanel.setWidgetTopHeight(m_simplePagerContainer, 308, com.google.gwt.dom.client.Style.Unit.PX, 23, com.google.gwt.dom.client.Style.Unit.PX);
    m_searchBtn.setHTML(template.html1().asString());
    m_searchBtn.setWidth("100%");
    m_layoutPanel.add(m_searchBtn);
    m_layoutPanel.setWidgetRightWidth(m_searchBtn, 0, com.google.gwt.dom.client.Style.Unit.PX, 55, com.google.gwt.dom.client.Style.Unit.PX);
    m_layoutPanel.setWidgetTopHeight(m_searchBtn, 308, com.google.gwt.dom.client.Style.Unit.PX, 23, com.google.gwt.dom.client.Style.Unit.PX);



    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onSearchButtonClick(event);
      }
    };
    m_searchBtn.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

    owner.m_layoutPanel = m_layoutPanel;
    owner.m_resourceTable = m_resourceTable;
    owner.m_searchBtn = m_searchBtn;
    owner.m_simplePagerContainer = m_simplePagerContainer;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return m_layoutPanel;
  }
}
