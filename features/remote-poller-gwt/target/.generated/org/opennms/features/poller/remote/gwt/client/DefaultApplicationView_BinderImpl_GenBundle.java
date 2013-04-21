package org.opennms.features.poller.remote.gwt.client;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.DataResource;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.ImageResource.ImageOptions;
import com.google.gwt.resources.client.CssResource.Import;

public interface DefaultApplicationView_BinderImpl_GenBundle extends ClientBundle {
  @Source("uibinder:org.opennms.features.poller.remote.gwt.client.DefaultApplicationView_BinderImpl_GenCss_style.css")
  DefaultApplicationView_BinderImpl_GenCss_style style();

  @Source("uibinder:org.opennms.features.poller.remote.gwt.client.DefaultApplicationView_BinderImpl_GenCss_linkStyles.css")
  DefaultApplicationView_BinderImpl_GenCss_linkStyles linkStyles();

}
