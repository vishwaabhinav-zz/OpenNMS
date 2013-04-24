package org.opennms.features.gwt.graph.resource.list.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.safehtml.client.SafeHtmlTemplates;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class ReportSelectListViewImpl_ReportSelectListViewImplUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, org.opennms.features.gwt.graph.resource.list.client.view.ReportSelectListViewImpl>, org.opennms.features.gwt.graph.resource.list.client.view.ReportSelectListViewImpl.ReportSelectListViewImplUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("Clear Selection")
    SafeHtml html1();
     
    @Template("Select All")
    SafeHtml html2();
     
    @Template("Graph Selection")
    SafeHtml html3();
     
    @Template("Search")
    SafeHtml html4();
     
    @Template("Graph All")
    SafeHtml html5();
     
  }

  Template template = GWT.create(Template.class);

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final org.opennms.features.gwt.graph.resource.list.client.view.ReportSelectListViewImpl owner) {

    org.opennms.features.gwt.graph.resource.list.client.view.ReportSelectListViewImpl_ReportSelectListViewImplUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (org.opennms.features.gwt.graph.resource.list.client.view.ReportSelectListViewImpl_ReportSelectListViewImplUiBinderImpl_GenBundle) GWT.create(org.opennms.features.gwt.graph.resource.list.client.view.ReportSelectListViewImpl_ReportSelectListViewImplUiBinderImpl_GenBundle.class);
    org.opennms.features.gwt.graph.resource.list.client.view.ReportSelectListViewImpl_ReportSelectListViewImplUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    com.google.gwt.user.client.ui.FlowPanel m_treeContainer = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
    com.google.gwt.user.client.ui.Button m_removeButton = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    com.google.gwt.user.client.ui.Button m_selectAllButton = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    com.google.gwt.user.client.ui.Button m_graphButton = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    com.google.gwt.user.client.ui.Button m_searchButton = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    com.google.gwt.user.client.ui.Button m_graphAllButton = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    com.google.gwt.user.client.ui.HorizontalPanel m_buttonDiv = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
    com.google.gwt.user.client.ui.LayoutPanel m_layoutPanel = (com.google.gwt.user.client.ui.LayoutPanel) GWT.create(com.google.gwt.user.client.ui.LayoutPanel.class);

    m_treeContainer.setStyleName("" + style.divContainer() + "");
    m_layoutPanel.add(m_treeContainer);
    m_layoutPanel.setWidgetLeftRight(m_treeContainer, 0, com.google.gwt.dom.client.Style.Unit.PX, 0, com.google.gwt.dom.client.Style.Unit.PX);
    m_layoutPanel.setWidgetTopBottom(m_treeContainer, 0, com.google.gwt.dom.client.Style.Unit.PX, 40, com.google.gwt.dom.client.Style.Unit.PX);
    m_buttonDiv.setHorizontalAlignment(com.google.gwt.user.client.ui.HasHorizontalAlignment.ALIGN_CENTER);
    m_removeButton.setHTML(template.html1().asString());
    m_removeButton.setWidth("150px");
    m_buttonDiv.add(m_removeButton);
    m_selectAllButton.setHTML(template.html2().asString());
    m_selectAllButton.setWidth("150px");
    m_buttonDiv.add(m_selectAllButton);
    m_graphButton.setHTML(template.html3().asString());
    m_graphButton.setWidth("150px");
    m_buttonDiv.add(m_graphButton);
    m_searchButton.setHTML(template.html4().asString());
    m_searchButton.setWidth("150px");
    m_buttonDiv.add(m_searchButton);
    m_graphAllButton.setHTML(template.html5().asString());
    m_graphAllButton.setWidth("150px");
    m_buttonDiv.add(m_graphAllButton);
    m_buttonDiv.setStyleName("onms-table-no-borders-margin");
    m_layoutPanel.add(m_buttonDiv);
    m_layoutPanel.setWidgetLeftRight(m_buttonDiv, 0, com.google.gwt.dom.client.Style.Unit.PX, 0, com.google.gwt.dom.client.Style.Unit.PX);
    m_layoutPanel.setWidgetBottomHeight(m_buttonDiv, 0, com.google.gwt.dom.client.Style.Unit.PX, 40, com.google.gwt.dom.client.Style.Unit.PX);



    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onGraphButtonClick(event);
      }
    };
    m_graphButton.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onRemoveButtonClick(event);
      }
    };
    m_removeButton.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2);

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames3 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onSelectAllButtonClick(event);
      }
    };
    m_selectAllButton.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames3);

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames4 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onSearchButtonClick(event);
      }
    };
    m_searchButton.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames4);

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames5 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onGraphAllClick(event);
      }
    };
    m_graphAllButton.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames5);

    owner.m_graphAllButton = m_graphAllButton;
    owner.m_graphButton = m_graphButton;
    owner.m_layoutPanel = m_layoutPanel;
    owner.m_removeButton = m_removeButton;
    owner.m_searchButton = m_searchButton;
    owner.m_selectAllButton = m_selectAllButton;
    owner.m_treeContainer = m_treeContainer;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return m_layoutPanel;
  }
}
