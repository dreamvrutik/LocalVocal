package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class music_005fplayer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\t<head>\n");
      out.write("\t\t<meta charset=\"utf-8\" />\n");
      out.write("\t\t<title>Audio Player: Responsive &amp; Touch-Friendly</title>\n");
      out.write("\t\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\n");
      out.write("\t\t<meta name=\"description\" content=\"Responsive &amp; Touch-Friendly Audio Player\" />\n");
      out.write("\t\t<meta name=\"author\" content=\"Osvaldas Valutis, www.osvaldas.info\" />\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width,initial-scale=1\" />\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"http://fonts.googleapis.com/css?family=Lato:400,700\" />\n");
      out.write("\t\t<link rel=\"shortcut icon\" href=\"../favicon.ico\">\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"css/reset.css\" />\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"css/demo.css\" />\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"css/audioplayer.css\" />\n");
      out.write("\t\t<script>\n");
      out.write("\t\t\t/*\n");
      out.write("\t\t\t\tVIEWPORT BUG FIX\n");
      out.write("\t\t\t\tiOS viewport scaling bug fix, by @mathias, @cheeaun and @jdalton\n");
      out.write("\t\t\t*/\n");
      out.write("\t\t\t(function(doc){var addEvent='addEventListener',type='gesturestart',qsa='querySelectorAll',scales=[1,1],meta=qsa in doc?doc[qsa]('meta[name=viewport]'):[];function fix(){meta.content='width=device-width,minimum-scale='+scales[0]+',maximum-scale='+scales[1];doc.removeEventListener(type,fix,true);}if((meta=meta[meta.length-1])&&addEvent in doc){fix();scales=[.25,1.6];doc[addEvent](type,fix,true);}}(document));\n");
      out.write("\t\t</script>\n");
      out.write("\t</head>\n");
      out.write("\t<body>\n");
      out.write("\t\t<div id=\"wrapper\">\n");
      out.write("\t\t\t<audio preload=\"auto\" controls>\n");
      out.write("\t\t\t\t<source src=\"audio/BlueDucks_FourFlossFiveSix.mp3\">\n");
      out.write("\t\t\t\t<source src=\"audio/BlueDucks_FourFlossFiveSix.ogg\">\n");
      out.write("\t\t\t\t<source src=\"audio/BlueDucks_FourFlossFiveSix.wav\">\n");
      out.write("\t\t\t</audio>\n");
      out.write("\t\t\t<script src=\"js/jquery.js\"></script>\n");
      out.write("\t\t\t<script src=\"js/audioplayer.js\"></script>\n");
      out.write("\t\t\t<script>$( function() { $( 'audio' ).audioPlayer(); } );</script>\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
