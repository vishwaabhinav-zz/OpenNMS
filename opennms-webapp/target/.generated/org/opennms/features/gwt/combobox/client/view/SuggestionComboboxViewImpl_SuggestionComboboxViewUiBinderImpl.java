package org.opennms.features.gwt.combobox.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.safehtml.client.SafeHtmlTemplates;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class SuggestionComboboxViewImpl_SuggestionComboboxViewUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, org.opennms.features.gwt.combobox.client.view.SuggestionComboboxViewImpl>, org.opennms.features.gwt.combobox.client.view.SuggestionComboboxViewImpl.SuggestionComboboxViewUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("Search")
    SafeHtml html1();
     
  }

  Template template = GWT.create(Template.class);

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final org.opennms.features.gwt.combobox.client.view.SuggestionComboboxViewImpl owner) {

    org.opennms.features.gwt.combobox.client.view.SuggestionComboboxViewImpl_SuggestionComboboxViewUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (org.opennms.features.gwt.combobox.client.view.SuggestionComboboxViewImpl_SuggestionComboboxViewUiBinderImpl_GenBundle) GWT.create(org.opennms.features.gwt.combobox.client.view.SuggestionComboboxViewImpl_SuggestionComboboxViewUiBinderImpl_GenBundle.class);
    org.opennms.features.gwt.combobox.client.view.SuggestionComboboxViewImpl_SuggestionComboboxViewUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    com.google.gwt.user.client.ui.TextBox m_textBox = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    com.google.gwt.user.client.ui.Button m_goButton = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    com.google.gwt.user.client.ui.LayoutPanel m_layoutPanel = (com.google.gwt.user.client.ui.LayoutPanel) GWT.create(com.google.gwt.user.client.ui.LayoutPanel.class);

    m_textBox.setWidth("100%");
    m_layoutPanel.add(m_textBox);
    m_layoutPanel.setWidgetLeftRight(m_textBox, 0, com.google.gwt.dom.client.Style.Unit.PX, 53, com.google.gwt.dom.client.Style.Unit.PX);
    m_layoutPanel.setWidgetTopBottom(m_textBox, 0, com.google.gwt.dom.client.Style.Unit.PX, 0, com.google.gwt.dom.client.Style.Unit.PX);
    m_goButton.setHTML(template.html1().asString());
    m_goButton.setHeight("25px");
    m_goButton.setWidth("53px");
    m_layoutPanel.add(m_goButton);
    m_layoutPanel.setWidgetRightWidth(m_goButton, 0, com.google.gwt.dom.client.Style.Unit.PX, 53, com.google.gwt.dom.client.Style.Unit.PX);
    m_layoutPanel.setWidgetTopBottom(m_goButton, 0, com.google.gwt.dom.client.Style.Unit.PX, 0, com.google.gwt.dom.client.Style.Unit.PX);
    m_layoutPanel.setStyleName("" + style.outlineBorder() + "");



    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onGoButtonClickHandler(event);
      }
    };
    m_goButton.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

    owner.m_goButton = m_goButton;
    owner.m_layoutPanel = m_layoutPanel;
    owner.m_textBox = m_textBox;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return m_layoutPanel;
  }
}
