package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class song_005fpage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
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
      out.write("    <title>Songs</title>\n");
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
      out.write("                        <a class=\"nav-brand\"><img src=\"img/core-img/logo.png\" alt=\"\"></a>\n");
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
      out.write("                                ");

                                    String email=request.getParameter("email");  
                                    String name=null;
                                    try
                                    {
                                        Class.forName("com.mysql.jdbc.Driver");
                                        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/localvocal?zeroDateTimeBehavior=convertToNull","root","Bits@2506");
                                        Statement s=con.createStatement();
                                        ResultSet rs=null;
                                        rs=s.executeQuery("select name from user_database where email='"+email+"';");
                                        while(rs.next())
                                        {
                                            name=rs.getString(1);
                                        }
                                        name=name.toUpperCase();
                                    }
                                    catch(Exception e)
                                    {
                                        System.out.println(e);
                                    }
                                
      out.write("\n");
      out.write("                                <ul>\n");
      out.write("                                    <li><a href=\"main_page.jsp?email=");
      out.print(email);
      out.write("\">Home</a></li>\n");
      out.write("                                    <li><a href=\"albums-store.html\">Browse</a></li>\n");
      out.write("                                    <li><a href=\"event.html\">Discover</a></li>\n");
      out.write("                                    <li><a href=\"all_playlists.jsp?email=");
      out.print(email);
      out.write("\">My Playlist</a></li>\n");
      out.write("                                </ul>\n");
      out.write("\n");
      out.write("                                <!-- Login/Register & Cart Button -->\n");
      out.write("                                \n");
      out.write("                                <ul>\n");
      out.write("                                    <li>\n");
      out.write("                                        <div class=\"login-register-cart-button d-flex align-items-center\">\n");
      out.write("                                    <!-- Cart Button -->\n");
      out.write("                                    <div class=\"cart-btn\">\n");
      out.write("                                        <p><span class=\"icon-user-1\"></span> <span>");
      out.print(name);
      out.write("</span></p>\n");
      out.write("                                        <ul class=\"dropdown\">\n");
      out.write("                                                            <li><a href=\"#\">My Profile</a></li>\n");
      out.write("                                                            <li><a href=\"index.jsp\">Logout</a></li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
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
      out.write("    <!-- ##### Breadcumb Area Start ##### -->\n");
      out.write("    <section class=\"breadcumb-area bg-img bg-overlay\" style=\"background-image: url(img/bg-img/breadcumb3.jpg);\">\n");
      out.write("        <div class=\"bradcumbContent\">\n");
      out.write("            ");

                String sname=null,sid=null;
                String aname=null,aid=null;
                String artists=null;
                String ploc=null;
                
                try
                {
                    
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/localvocal?zeroDateTimeBehavior=convertToNull","root","Bits@2506");
                    Statement s=con.createStatement();
                    ResultSet rs=null;
                    sid=request.getParameter("songid");
                    rs=s.executeQuery("select songname from songs where songid="+sid+";");
                    while(rs.next())
                    {
                        sname=rs.getString(1);
                    }
                    rs=s.executeQuery("select count from songs where songid="+sid);
                    int c=0;
                    while(rs.next())
                    {
                        c=rs.getInt(1);
                    }
                    c+=1;
                    s.execute("update songs set count="+c+" where songid="+sid+";");
                    int flag=0;
                    rs=s.executeQuery("select count(*) from album_song where songid="+sid+";");
                    while(rs.next())
                    {
                        if(rs.getInt(1)>0)
                            flag=1;
                    }
                    if(flag==1)
                    {
                        rs=s.executeQuery("select albid from album_song where songid="+sid+";");
                        while(rs.next())
                        {
                            aid=rs.getString(1);
                        }
                        rs=s.executeQuery("select albname from albums where albid="+aid+";");
                        while(rs.next())
                        {
                            aname=rs.getString(1);
                        }
                    }
                    rs=s.executeQuery("select artistname from artists where songid="+sid+";");
                    while(rs.next())
                    {
                        artists+=rs.getString(1);
                        if(rs.next())
                            artists+=" , ";
                    }
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
                ploc="song_photo/"+sid+".png";
            
      out.write("\n");
      out.write("            \n");
      out.write("            <h2>");
      out.print(sname);
      out.write("</h2>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    <!-- ##### Breadcumb Area End ##### -->\n");
      out.write("\n");
      out.write("    <!-- ##### Album Catagory Area Start ##### -->\n");
      out.write("    <section class=\"album-catagory section-padding-100-0\" >\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"section-heading\">\n");
      out.write("                <img id=\"img\" src=\"img/bg-img/a1.jpg\" alt=\"\">\n");
      out.write("                <h2>Albums</h2><h2>\n");
      out.write("                    ");

                        if(aname!=null)
                        {
                            
      out.write("\n");
      out.write("                            <h2>\n");
      out.write("                                ");
      out.print(aname);
      out.write("\n");
      out.write("                            </h2>\n");
      out.write("                        <h2>\n");
      out.write("                    ");

                        }
                    
      out.write("\n");
      out.write("                    ");
      out.print(artists);
      out.write("Artists\n");
      out.write("                </h2>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </section>\n");
      out.write("    <!-- ##### Contact Area Start ##### -->\n");
      out.write("    <section class=\"contact-area section-padding-100 bg-img bg-overlay bg-fixed has-bg-img\" style=\"background-image: url(img/bg-img/bg-2.jpg);\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-12\">\n");
      out.write("                    <div class=\"section-heading white\">\n");
      out.write("                        <p>See what’s new</p>\n");
      out.write("                        <h2>Get In Touch</h2>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-12\">\n");
      out.write("                    <!-- Contact Form Area -->\n");
      out.write("                    <div class=\"contact-form-area\">\n");
      out.write("                        <form action=\"#\" method=\"post\">\n");
      out.write("                            <div class=\"row\" >\n");
      out.write("                      \n");
      out.write("                               \n");
      out.write("                                <div class=\"col-md-6 col-lg-4\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <input type=\"email\" class=\"form-control\" id=\"email\" placeholder=\"E-mail\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-lg-4\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" id=\"subject\" placeholder=\"Subject\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-12\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <textarea name=\"message\" class=\"form-control\" id=\"message\" cols=\"30\" rows=\"10\" placeholder=\"Message\"></textarea>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-12 text-center\">\n");
      out.write("                                    <button class=\"btn oneMusic-btn mt-30\" type=\"submit\">Send <i class=\"fa fa-angle-double-right\"></i></button>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    <div class=\"vruvru\">\n");
      out.write("         <audio controls width=\"400px\"> \n");
      out.write("    <source src=\"audio/dummy-audio.mp3\" type=\"audio/mpeg\"/> \n");
      out.write("   </audio>\n");
      out.write("\n");
      out.write("     </div>\n");
      out.write("    <!-- ##### Contact Area End ##### -->\n");
      out.write("\n");
      out.write("    <!-- ##### Footer Area Start ##### -->\n");
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
      out.write("\n");
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
