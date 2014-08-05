
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.faces.application.ViewHandler;
import javax.faces.application.ViewHandlerWrapper;
import javax.faces.context.FacesContext;
import java.util.List;
import java.util.Map;

public class CustomViewHandler extends ViewHandlerWrapper {
  private static final Log log = LogFactory.getLog(CustomViewHandler.class);

  private ViewHandler wrappped;

  public CustomViewHandler(ViewHandler wrappped) {
    super();
    this.wrappped = wrappped;

  }

  @Override
  public ViewHandler getWrapped() {
    return wrappped;
  }

  @Override
  public String getActionURL(FacesContext context, String viewId) {
    String url =  super.getActionURL(context, viewId);
    log.debug("The getActionURL: " + url);
    return addContextPath(context, url);
  }

  @Override
  public String getRedirectURL(FacesContext context, String viewId, Map<String,
          List<String>> parameters, boolean includeViewParams) {
    String url =  super.getRedirectURL(context, viewId, parameters, includeViewParams);
    log.debug("The getRedirectURL: " + url);
    return url;
  }

  @Override
  public String getResourceURL(FacesContext context, String path) {
    String url = super.getResourceURL(context, path);
    log.debug("The getResourceURL: = " + url);
    return addContextPath(context, url);
  }

  private String addContextPath(FacesContext context, String url) {
    String newUrl;
    newUrl = url.substring(url.indexOf('/', 1) +1 , url.length());

    log.debug("The addContextPath: Changed URL = " + newUrl);
    return newUrl;
  }
}
