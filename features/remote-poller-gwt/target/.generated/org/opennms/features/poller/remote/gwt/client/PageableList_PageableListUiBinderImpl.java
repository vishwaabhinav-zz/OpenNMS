package org.opennms.features.poller.remote.gwt.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class PageableList_PageableListUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, org.opennms.features.poller.remote.gwt.client.PageableList>, org.opennms.features.poller.remote.gwt.client.PageableList.PageableListUiBinder {

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final org.opennms.features.poller.remote.gwt.client.PageableList owner) {

    org.opennms.features.poller.remote.gwt.client.PageableList_PageableListUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (org.opennms.features.poller.remote.gwt.client.PageableList_PageableListUiBinderImpl_GenBundle) GWT.create(org.opennms.features.poller.remote.gwt.client.PageableList_PageableListUiBinderImpl_GenBundle.class);
    org.opennms.features.poller.remote.gwt.client.PageableList_PageableListUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    org.opennms.features.poller.remote.gwt.client.PageableList_PageableListUiBinderImpl_GenCss_locationDetailStyle locationDetailStyle = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.locationDetailStyle();
    org.opennms.features.poller.remote.gwt.client.PageableList_PageableListUiBinderImpl_GenCss_applicationDetailStyle applicationDetailStyle = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.applicationDetailStyle();
    com.google.gwt.user.client.ui.FlexTable dataList = (com.google.gwt.user.client.ui.FlexTable) GWT.create(com.google.gwt.user.client.ui.FlexTable.class);
    com.google.gwt.user.client.ui.FlowPanel f_FlowPanel2 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
    com.google.gwt.user.client.ui.Hyperlink prevBtn = (com.google.gwt.user.client.ui.Hyperlink) GWT.create(com.google.gwt.user.client.ui.Hyperlink.class);
    com.google.gwt.user.client.ui.Label pageStatsLabel = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.Hyperlink nextBtn = (com.google.gwt.user.client.ui.Hyperlink) GWT.create(com.google.gwt.user.client.ui.Hyperlink.class);
    com.google.gwt.user.client.ui.HorizontalPanel pagingControls = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
    com.google.gwt.user.client.ui.DockLayoutPanel f_DockLayoutPanel1 = new com.google.gwt.user.client.ui.DockLayoutPanel(com.google.gwt.dom.client.Style.Unit.PX);

    dataList.setWidth("100%");
    f_FlowPanel2.add(dataList);
    f_FlowPanel2.setStyleName("" + style.tableContainer() + "");
    prevBtn.addStyleName("" + style.prevBtnLayoutStyle() + "");
    prevBtn.setText("« prev");
    pagingControls.add(prevBtn);
    pageStatsLabel.addStyleName("" + style.labelLayoutStyle() + "");
    pagingControls.add(pageStatsLabel);
    nextBtn.addStyleName("" + style.nextBtnLayoutStyle() + "");
    nextBtn.setText("next »");
    pagingControls.add(nextBtn);
    pagingControls.addStyleName("" + style.pagingControls() + "");
    f_DockLayoutPanel1.addSouth(pagingControls, 26);
    f_DockLayoutPanel1.add(f_FlowPanel2);
    f_DockLayoutPanel1.setHeight("100%");
    f_DockLayoutPanel1.setWidth("100%");



    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onItemClickHandler(event);
      }
    };
    dataList.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onPrevBtnClick(event);
      }
    };
    prevBtn.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2);

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames3 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onNextBtnClick(event);
      }
    };
    nextBtn.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames3);

    owner.dataList = dataList;
    owner.locationDetailStyle = locationDetailStyle;
    owner.nextBtn = nextBtn;
    owner.pageStatsLabel = pageStatsLabel;
    owner.pagingControls = pagingControls;
    owner.prevBtn = prevBtn;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.locationDetailStyle().ensureInjected();
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.applicationDetailStyle().ensureInjected();

    return f_DockLayoutPanel1;
  }
}
