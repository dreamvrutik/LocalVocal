package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <!-- The above 4 meta tags *must* come first in the head; any other head content must come *after* these tags -->\n");
      out.write("\n");
      out.write("    <!-- Title -->\n");
      out.write("    <title>One Music - Modern Music HTML5 Template</title>\n");
      out.write("\n");
      out.write("    <!-- Favicon -->\n");
      out.write("    <link rel=\"icon\" href=\"img/core-img/favicon.ico\">\n");
      out.write("\n");
      out.write("    <!-- Stylesheet -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <!-- Preloader -->\n");
      out.write("    <div class=\"preloader d-flex align-items-center justify-content-center\">\n");
      out.write("        <div class=\"lds-ellipsis\">\n");
      out.write("            <div></div>\n");
      out.write("            <div></div>\n");
      out.write("            <div></div>\n");
      out.write("            <div></div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- ##### Header Area Start ##### -->\n");
      out.write("    <header class=\"header-area\">\n");
      out.write("        <!-- Navbar Area -->\n");
      out.write("        <div class=\"oneMusic-main-menu\">\n");
      out.write("            <div class=\"classy-nav-container breakpoint-off\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <!-- Menu -->\n");
      out.write("                    <nav class=\"classy-navbar justify-content-between\" id=\"oneMusicNav\">\n");
      out.write("\n");
      out.write("                        <!-- Nav brand -->\n");
      out.write("                        <a href=\"index.jsp\" class=\"nav-brand\"><img src=\"img/core-img/logo.png\" alt=\"\"></a>\n");
      out.write("\n");
      out.write("                        <!-- Navbar Toggler -->\n");
      out.write("                        <div class=\"classy-navbar-toggler\">\n");
      out.write("                            <span class=\"navbarToggler\"><span></span><span></span><span></span></span>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!-- Menu -->\n");
      out.write("                        <div class=\"classy-menu\">\n");
      out.write("\n");
      out.write("                            <!-- Close Button -->\n");
      out.write("                            <div class=\"classycloseIcon\">\n");
      out.write("                                <div class=\"cross-wrap\"><span class=\"top\"></span><span class=\"bottom\"></span></div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <!-- Nav Start -->\n");
      out.write("                            <div class=\"classynav\">\n");
      out.write("                                <ul>\n");
      out.write("                                    <form action=\"check_login\" method=\"POST\" id=\"login_form\">\n");
      out.write("                                        <label for=\"uid\" id=\"l_name\">Email id :</label>\n");
      out.write("                                        <li><input type=\"text\" class=\"form-control\" name=\"uid\" placeholder=\"Email id\" id=\"name\"></li>\n");
      out.write("                                        <label for=\"pwd\" id=\"l_pass\">Password :</label>\n");
      out.write("                                        <li><input type=\"password\" class=\"form-control\" name=\"pwd\" placeholder=\"**************\" id=\"pass\"></li>\n");
      out.write("                                        <button type=\"submit\" id=\"submit_button\">Login</button>\n");
      out.write("                                    </form>\n");
      out.write("                                </ul>\n");
      out.write("                                \n");
      out.write("                                <!-- Login/Register & Cart Button -->\n");
      out.write("                                <div class=\"login-register-cart-button d-flex align-items-center\">\n");
      out.write("                                    <!-- Login/Register -->\n");
      out.write("                                    <div class=\"login-register-btn mr-50\">\n");
      out.write("                                        <a href=\"register.jsp\" id=\"loginBtn\"> Register</a>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <!-- Cart Button -->\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- Nav End -->\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </nav>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("    <!-- ##### Header Area End ##### -->\n");
      out.write("\n");
      out.write("    <!-- ##### Hero Area Start ##### -->\n");
      out.write("    <section class=\"hero-area\">\n");
      out.write("       \n");
      out.write("        <div class=\"hero-slides owl-carousel\">\n");
      out.write("            <!-- Single Hero Slide -->\n");
      out.write("            <div class=\"single-hero-slide d-flex align-items-center justify-content-center\">\n");
      out.write("                <!-- Slide Img -->\n");
      out.write("                <div class=\"slide-img bg-img\" style=\"background-image: url(img/bg-img/bg-1.jpg);\"></div>\n");
      out.write("                <!-- Slide Content -->\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-12\">\n");
      out.write("                            <div class=\"hero-slides-content text-center\">\n");
      out.write("                                <h6 data-animation=\"fadeInUp\" data-delay=\"100ms\">LOCAL VOCAL</h6>\n");
      out.write("                                <h2 data-animation=\"fadeInUp\" data-delay=\"300ms\">Something Related to Music... <span>Beyond Time</span></h2>\n");
      out.write("                                 </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Single Hero Slide -->\n");
      out.write("            <div class=\"single-hero-slide d-flex align-items-center justify-content-center\">\n");
      out.write("                <!-- Slide Img -->\n");
      out.write("                <div class=\"slide-img bg-img\" style=\"background-image: url(img/bg-img/bg-2.jpg);\"></div>\n");
      out.write("                <!-- Slide Content -->\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-12\">\n");
      out.write("                            <div class=\"hero-slides-content text-center\">\n");
      out.write("                                <h6 data-animation=\"fadeInUp\" data-delay=\"100ms\">LOCAL VOCAL</h6>\n");
      out.write("                                <h2 data-animation=\"fadeInUp\" data-delay=\"300ms\">Something Related to Music...<span>Colorlib Music</span></h2>\n");
      out.write("                             </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    \n");
      out.write("    ");

        int ec=-1;
        if(request.getParameter("errorcode")!=null)
        {
            ec=Integer.parseInt(request.getParameter("errorcode"));
        }
        if(ec!=-1)
        {
            if(ec==1)
            {
                
      out.write("\n");
      out.write("                <script>\n");
      out.write("                    window.alert(\"Please enter both email-id and password.\");\n");
      out.write("                </script>\n");
      out.write("                \n");
      out.write("                ");

            }
            else if(ec==2)
            {
                
      out.write("\n");
      out.write("                <script>\n");
      out.write("                    window.alert(\"Please enter valid details.\");\n");
      out.write("                </script>\n");
      out.write("                \n");
      out.write("                ");

            }
        }
        
    
      out.write("\n");
      out.write("    <!-- ##### Hero Area End ##### -->\n");
      out.write("    \n");
      out.write("    <!-- ##### Footer Area Start ##### -->\n");
      out.write("\n");
      out.write("    <!-- ##### All Javascript Script ##### -->\n");
      out.write("    <!-- jQuery-2.2.4 js -->\n");
      out.write("    <script src=\"js/jquery/jquery-2.2.4.min.js\"></script>\n");
      out.write("    <!-- Popper js -->\n");
      out.write("    <script src=\"js/bootstrap/popper.min.js\"></script>\n");
      out.write("    <!-- Bootstrap js -->\n");
      out.write("    <script src=\"js/bootstrap/bootstrap.min.js\"></script>\n");
      out.write("    <!-- All Plugins js -->\n");
      out.write("    <script src=\"js/plugins/plugins.js\"></script>\n");
      out.write("    <!-- Active js -->\n");
      out.write("    <script src=\"js/active.js\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
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
