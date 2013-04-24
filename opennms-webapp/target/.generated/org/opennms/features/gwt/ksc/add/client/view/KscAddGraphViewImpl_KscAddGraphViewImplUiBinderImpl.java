package org.opennms.features.gwt.ksc.add.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.safehtml.client.SafeHtmlTemplates;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class KscAddGraphViewImpl_KscAddGraphViewImplUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, org.opennms.features.gwt.ksc.add.client.view.KscAddGraphViewImpl>, org.opennms.features.gwt.ksc.add.client.view.KscAddGraphViewImpl.KscAddGraphViewImplUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("Add")
    SafeHtml html1();
     
  }

  Template template = GWT.create(Template.class);

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final org.opennms.features.gwt.ksc.add.client.view.KscAddGraphViewImpl owner) {

    org.opennms.features.gwt.ksc.add.client.view.KscAddGraphViewImpl_KscAddGraphViewImplUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (org.opennms.features.gwt.ksc.add.client.view.KscAddGraphViewImpl_KscAddGraphViewImplUiBinderImpl_GenBundle) GWT.create(org.opennms.features.gwt.ksc.add.client.view.KscAddGraphViewImpl_KscAddGraphViewImplUiBinderImpl_GenBundle.class);
    org.opennms.features.gwt.ksc.add.client.view.KscAddGraphViewImpl_KscAddGraphViewImplUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    com.google.gwt.user.client.ui.Label f_Label1 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.Label m_titleLabel = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.TextBox m_titleBox = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    com.google.gwt.user.client.ui.Label m_reportLabel = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.TextBox m_textBox = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    com.google.gwt.user.client.ui.Button m_addButton = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    com.google.gwt.user.client.ui.LayoutPanel m_layoutPanel = (com.google.gwt.user.client.ui.LayoutPanel) GWT.create(com.google.gwt.user.client.ui.LayoutPanel.class);

    f_Label1.setStyleName("$" + style.padBoxes() + "");
    f_Label1.setText("Add to KSC Report");
    f_Label1.setWidth("100%");
    m_layoutPanel.add(f_Label1);
    m_layoutPanel.setWidgetLeftRight(f_Label1, 0, com.google.gwt.dom.client.Style.Unit.PX, 0, com.google.gwt.dom.client.Style.Unit.PX);
    m_layoutPanel.setWidgetTopHeight(f_Label1, 0, com.google.gwt.dom.client.Style.Unit.PX, 25, com.google.gwt.dom.client.Style.Unit.PX);
    m_titleLabel.setStyleName("$" + style.padBoxes() + "");
    m_titleLabel.setText("Title:");
    m_titleLabel.setWidth("100%");
    m_layoutPanel.add(m_titleLabel);
    m_layoutPanel.setWidgetLeftRight(m_titleLabel, 0, com.google.gwt.dom.client.Style.Unit.PX, 0, com.google.gwt.dom.client.Style.Unit.PX);
    m_layoutPanel.setWidgetTopHeight(m_titleLabel, 25, com.google.gwt.dom.client.Style.Unit.PX, 25, com.google.gwt.dom.client.Style.Unit.PX);
    m_titleBox.setStyleName("$" + style.padBoxes() + "");
    m_titleBox.setWidth("100%");
    m_layoutPanel.add(m_titleBox);
    m_layoutPanel.setWidgetLeftRight(m_titleBox, 50, com.google.gwt.dom.client.Style.Unit.PX, 0, com.google.gwt.dom.client.Style.Unit.PX);
    m_layoutPanel.setWidgetTopHeight(m_titleBox, 25, com.google.gwt.dom.client.Style.Unit.PX, 25, com.google.gwt.dom.client.Style.Unit.PX);
    m_reportLabel.setStyleName("$" + style.padBoxes() + "");
    m_reportLabel.setText("Report:");
    m_reportLabel.setWidth("100%");
    m_layoutPanel.add(m_reportLabel);
    m_layoutPanel.setWidgetLeftRight(m_reportLabel, 0, com.google.gwt.dom.client.Style.Unit.PX, 0, com.google.gwt.dom.client.Style.Unit.PX);
    m_layoutPanel.setWidgetTopHeight(m_reportLabel, 50, com.google.gwt.dom.client.Style.Unit.PX, 25, com.google.gwt.dom.client.Style.Unit.PX);
    m_textBox.setStyleName("$" + style.padBoxes() + "");
    m_textBox.setWidth("100%");
    m_layoutPanel.add(m_textBox);
    m_layoutPanel.setWidgetLeftRight(m_textBox, 50, com.google.gwt.dom.client.Style.Unit.PX, 55, com.google.gwt.dom.client.Style.Unit.PX);
    m_layoutPanel.setWidgetTopBottom(m_textBox, 50, com.google.gwt.dom.client.Style.Unit.PX, 0, com.google.gwt.dom.client.Style.Unit.PX);
    m_addButton.setHTML(template.html1().asString());
    m_addButton.setStyleName("$" + style.padBoxes() + "");
    m_addButton.setHeight("25px");
    m_addButton.setWidth("100%");
    m_layoutPanel.add(m_addButton);
    m_layoutPanel.setWidgetRightWidth(m_addButton, 0, com.google.gwt.dom.client.Style.Unit.PX, 53, com.google.gwt.dom.client.Style.Unit.PX);
    m_layoutPanel.setWidgetTopBottom(m_addButton, 50, com.google.gwt.dom.client.Style.Unit.PX, 0, com.google.gwt.dom.client.Style.Unit.PX);
    m_layoutPanel.setStyleName("" + style.outlineBorder() + "");



    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.handleAddButton(event);
      }
    };
    m_addButton.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

    owner.m_addButton = m_addButton;
    owner.m_layoutPanel = m_layoutPanel;
    owner.m_reportLabel = m_reportLabel;
    owner.m_textBox = m_textBox;
    owner.m_titleBox = m_titleBox;
    owner.m_titleLabel = m_titleLabel;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return m_layoutPanel;
  }
}
