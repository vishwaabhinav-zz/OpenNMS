package com.google.gwt.user.client;

public class UserAgentAsserter_UserAgentPropertyImplGecko1_8 implements com.google.gwt.user.client.UserAgentAsserter.UserAgentProperty {
  
  public boolean getUserAgentRuntimeWarning() {
    return true;
  }
  
  
  public native String getRuntimeValue() /*-{
    var ua = navigator.userAgent.toLowerCase();
    var makeVersion = function(result) {
      return (parseInt(result[1]) * 1000) + parseInt(result[2]);
    };
    if ((function() { 
      return (ua.indexOf('opera') != -1);
})()) return 'opera';
    if ((function() { 
      return (ua.indexOf('webkit') != -1);
})()) return 'safari';
    if ((function() { 
      return (ua.indexOf('msie') != -1 && ($doc.documentMode >= 9));
})()) return 'ie9';
    if ((function() { 
      return (ua.indexOf('msie') != -1 && ($doc.documentMode >= 8));
})()) return 'ie8';
    if ((function() { 
      var result = /msie ([0-9]+)\.([0-9]+)/.exec(ua);
      if (result && result.length == 3)
        return (makeVersion(result) >= 6000);
})()) return 'ie6';
    if ((function() { 
      return (ua.indexOf('gecko') != -1);
})()) return 'gecko1_8';
    return 'unknown';
  }-*/;
  
  
  public String getCompileTimeValue() {
    return "gecko1_8";
  }
}
