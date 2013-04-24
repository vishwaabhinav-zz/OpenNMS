package org.opennms.features.gwt.ksc.combobox.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.safehtml.client.SafeHtmlTemplates;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class KscComboboxViewImpl_KscComboboxViewImplUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, org.opennms.features.gwt.ksc.combobox.client.view.KscComboboxViewImpl>, org.opennms.features.gwt.ksc.combobox.client.view.KscComboboxViewImpl.KscComboboxViewImplUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("Search")
    SafeHtml html1();
     
  }

  Template template = GWT.create(Template.class);

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final org.opennms.features.gwt.ksc.combobox.client.view.KscComboboxViewImpl owner) {

    org.opennms.features.gwt.ksc.combobox.client.view.KscComboboxViewImpl_KscComboboxViewImplUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (org.opennms.features.gwt.ksc.combobox.client.view.KscComboboxViewImpl_KscComboboxViewImplUiBinderImpl_GenBundle) GWT.create(org.opennms.features.gwt.ksc.combobox.client.view.KscComboboxViewImpl_KscComboboxViewImplUiBinderImpl_GenBundle.class);
    org.opennms.features.gwt.ksc.combobox.client.view.KscComboboxViewImpl_KscComboboxViewImplUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    com.google.gwt.user.client.ui.TextBox m_textBox = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    com.google.gwt.user.client.ui.Button m_searchButton = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    com.google.gwt.user.client.ui.LayoutPanel m_layoutPanel = (com.google.gwt.user.client.ui.LayoutPanel) GWT.create(com.google.gwt.user.client.ui.LayoutPanel.class);

    m_textBox.setWidth("98%");
    m_layoutPanel.add(m_textBox);
    m_layoutPanel.setWidgetLeftRight(m_textBox, 0, com.google.gwt.dom.client.Style.Unit.PX, 53, com.google.gwt.dom.client.Style.Unit.PX);
    m_layoutPanel.setWidgetTopBottom(m_textBox, 0, com.google.gwt.dom.client.Style.Unit.PX, 0, com.google.gwt.dom.client.Style.Unit.PX);
    m_searchButton.setHTML(template.html1().asString());
    m_searchButton.setHeight("25px");
    m_searchButton.setWidth("100%");
    m_layoutPanel.add(m_searchButton);
    m_layoutPanel.setWidgetRightWidth(m_searchButton, 0, com.google.gwt.dom.client.Style.Unit.PX, 53, com.google.gwt.dom.client.Style.Unit.PX);
    m_layoutPanel.setWidgetTopBottom(m_searchButton, 0, com.google.gwt.dom.client.Style.Unit.PX, 0, com.google.gwt.dom.client.Style.Unit.PX);
    m_layoutPanel.setStyleName("" + style.outlineBorder() + "");



    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.handleSearchButton(event);
      }
    };
    m_searchButton.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

    owner.m_layoutPanel = m_layoutPanel;
    owner.m_searchButton = m_searchButton;
    owner.m_textBox = m_textBox;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return m_layoutPanel;
  }
}
