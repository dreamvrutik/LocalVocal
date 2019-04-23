package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class main_005fpage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/side_queue.jsp");
  }

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
      out.write("    <title>Home</title>\n");
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
      out.write("    \n");
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
      out.write("                                 ");

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
      out.write("                                    <li><a href=\"browse.jsp\">Browse</a></li>\n");
      out.write("                                    <li><a href=\"event.html\">Discover</a></li>\n");
      out.write("                                    <li><a href=\"all_playlists.jsp?email=");
      out.print(email);
      out.write("\">My Playlist</a></li>\n");
      out.write("                                </ul>\n");
      out.write("\n");
      out.write("                                <!-- Login/Register & Cart Button -->\n");
      out.write("                               \n");
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("      <style>\n");
      out.write("          @import url(//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css);\n");
      out.write("@import url(https://fonts.googleapis.com/css?family=Titillium+Web:300);\n");
      out.write(".fa-2x {\n");
      out.write("font-size: 2em;\n");
      out.write("}\n");
      out.write(".fa {\n");
      out.write("position: relative;\n");
      out.write("display: table-cell;\n");
      out.write("width: 60px;\n");
      out.write("height: 36px;\n");
      out.write("text-align: center;\n");
      out.write("vertical-align: middle;\n");
      out.write("font-size:20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".main-menu:hover,nav.main-menu.expanded {\n");
      out.write("width:200px;\n");
      out.write("overflow:visible;\n");
      out.write("opacity:1;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".main-menu {\n");
      out.write("background:#212121;\n");
      out.write("border-right:1px solid #e5e5e5;\n");
      out.write("position:fixed;\n");
      out.write("opacity:1;\n");
      out.write("top:0;\n");
      out.write("bottom:0;\n");
      out.write("height:100vh;\n");
      out.write("left:0;\n");
      out.write("width:50px;\n");
      out.write("overflow:hidden;\n");
      out.write("-webkit-transition:width .05s linear;\n");
      out.write("transition:width .05s linear;\n");
      out.write("-webkit-transform:translateZ(0) scale(1,1);\n");
      out.write("z-index:1000;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".main-menu>ul {\n");
      out.write("margin:7px 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".main-menu li {\n");
      out.write("position:relative;\n");
      out.write("display:block;\n");
      out.write("width:200px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".main-menu li>a {\n");
      out.write("position:relative;\n");
      out.write("display:table;\n");
      out.write("border-collapse:collapse;\n");
      out.write("border-spacing:0;\n");
      out.write("color:#999;\n");
      out.write(" font-family: arial;\n");
      out.write("font-size: 14px;\n");
      out.write("text-decoration:none;\n");
      out.write("-webkit-transform:translateZ(0) scale(1,1);\n");
      out.write("-webkit-transition:all .1s linear;\n");
      out.write("transition:all .1s linear;\n");
      out.write("  \n");
      out.write("}\n");
      out.write("\n");
      out.write(".main-menu .nav-icon {\n");
      out.write("position:relative;\n");
      out.write("display:table-cell;\n");
      out.write("width:60px;\n");
      out.write("height:36px;\n");
      out.write("text-align:center;\n");
      out.write("vertical-align:middle;\n");
      out.write("font-size:18px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".main-menu .nav-text {\n");
      out.write("position:relative;\n");
      out.write("display:table-cell;\n");
      out.write("vertical-align:middle;\n");
      out.write("width:190px;\n");
      out.write("  font-family: 'Titillium Web', sans-serif;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".main-menu>ul.logout {\n");
      out.write("position:absolute;\n");
      out.write("left:0;\n");
      out.write("bottom:0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".no-touch .scrollable.hover {\n");
      out.write("overflow-y:hidden;\n");
      out.write("opacity: 1;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".no-touch .scrollable.hover:hover {\n");
      out.write("overflow-y:auto;\n");
      out.write("overflow:visible;\n");
      out.write("opacity: 1;\n");
      out.write("}\n");
      out.write("\n");
      out.write("a:hover,a:focus {\n");
      out.write("text-decoration:none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("nav {\n");
      out.write("-webkit-user-select:none;\n");
      out.write("-moz-user-select:none;\n");
      out.write("-ms-user-select:none;\n");
      out.write("-o-user-select:none;\n");
      out.write("user-select:none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("nav ul,nav li {\n");
      out.write("outline:0;\n");
      out.write("margin:0;\n");
      out.write("padding:0;\n");
      out.write("}\n");
      out.write(".main-menu li:hover>a,nav.main-menu li.active>a,.dropdown-menu>li>a:hover,.dropdown-menu>li>a:focus,.dropdown-menu>.active>a,.dropdown-menu>.active>a:hover,.dropdown-menu>.active>a:focus,.no-touch .dashboard-page nav.dashboard-menu ul li:hover a,.dashboard-page nav.dashboard-menu ul li.active a {\n");
      out.write("color:#fff;\n");
      out.write("background-color:#5fa2db;\n");
      out.write("}\n");
      out.write(".area {\n");
      out.write("float: left;\n");
      out.write("background: #e2e2e2;\n");
      out.write("width: 100%;\n");
      out.write("height: 100%;\n");
      out.write("}\n");
      out.write("@font-face {\n");
      out.write("  font-family: 'Titillium Web';\n");
      out.write("  font-style: normal;\n");
      out.write("  font-weight: 300;\n");
      out.write("  src: local('Titillium WebLight'), local('TitilliumWeb-Light'), url(http://themes.googleusercontent.com/static/fonts/titilliumweb/v2/anMUvcNT0H1YN4FII8wpr24bNCNEoFTpS2BTjF6FB5E.woff) format('woff');\n");
      out.write("}\n");
      out.write("\n");
      out.write("      </style>\n");
      out.write("      <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("  </head>\n");
      out.write("  <body><div class=\"area\"></div><nav class=\"main-menu\">\n");
      out.write("            <ul>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"http://justinfarrow.com\">\n");
      out.write("                        <i class=\"fa fa-home fa-2x\"></i>\n");
      out.write("                        <span class=\"nav-text\">\n");
      out.write("                            Dashboard\n");
      out.write("                        </span>\n");
      out.write("                    </a>\n");
      out.write("                  \n");
      out.write("                </li>\n");
      out.write("                <li class=\"has-subnav\">\n");
      out.write("                    <a href=\"#\">\n");
      out.write("                        <i class=\"fa fa-laptop fa-2x\"></i>\n");
      out.write("                        <span class=\"nav-text\">\n");
      out.write("                            Stars Components\n");
      out.write("                        </span>\n");
      out.write("                    </a>\n");
      out.write("                    \n");
      out.write("                </li>\n");
      out.write("                <li class=\"has-subnav\">\n");
      out.write("                    <a href=\"#\">\n");
      out.write("                       <i class=\"fa fa-list fa-2x\"></i>\n");
      out.write("                        <span class=\"nav-text\">\n");
      out.write("                            Forms\n");
      out.write("                        </span>\n");
      out.write("                    </a>\n");
      out.write("                    \n");
      out.write("                </li>\n");
      out.write("                <li class=\"has-subnav\">\n");
      out.write("                    <a href=\"#\">\n");
      out.write("                       <i class=\"fa fa-folder-open fa-2x\"></i>\n");
      out.write("                        <span class=\"nav-text\">\n");
      out.write("                            Pages\n");
      out.write("                        </span>\n");
      out.write("                    </a>\n");
      out.write("                   \n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#\">\n");
      out.write("                        <i class=\"fa fa-bar-chart-o fa-2x\"></i>\n");
      out.write("                        <span class=\"nav-text\">\n");
      out.write("                            Graphs and Statistics\n");
      out.write("                        </span>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#\">\n");
      out.write("                        <i class=\"fa fa-font fa-2x\"></i>\n");
      out.write("                        <span class=\"nav-text\">\n");
      out.write("                           Quotes\n");
      out.write("                        </span>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                   <a href=\"#\">\n");
      out.write("                       <i class=\"fa fa-table fa-2x\"></i>\n");
      out.write("                        <span class=\"nav-text\">\n");
      out.write("                            Tables\n");
      out.write("                        </span>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                   <a href=\"#\">\n");
      out.write("                        <i class=\"fa fa-map-marker fa-2x\"></i>\n");
      out.write("                        <span class=\"nav-text\">\n");
      out.write("                            Maps\n");
      out.write("                        </span>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#\">\n");
      out.write("                       <i class=\"fa fa-info fa-2x\"></i>\n");
      out.write("                        <span class=\"nav-text\">\n");
      out.write("                            Documentation\n");
      out.write("                        </span>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("            <ul class=\"logout\">\n");
      out.write("                <li>\n");
      out.write("                   <a href=\"#\">\n");
      out.write("                         <i class=\"fa fa-power-off fa-2x\"></i>\n");
      out.write("                        <span class=\"nav-text\">\n");
      out.write("                            Logout\n");
      out.write("                        </span>\n");
      out.write("                    </a>\n");
      out.write("                </li>  \n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("      \n");
      out.write("  </body>\n");
      out.write("    </html>");
      out.write(" \n");
      out.write("    <!-- ##### Breadcumb Area Start ##### -->\n");
      out.write("    <section class=\"breadcumb-area bg-img bg-overlay\" style=\"background-image: url(img/bg-img/breadcumb3.jpg);\">\n");
      out.write("        <div class=\"bradcumbContent\">\n");
      out.write("            <p>See What's Trending</p>\n");
      out.write("            <h2>Home</h2>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    <!-- ##### Breadcumb Area End ##### -->\n");
      out.write("\n");
      out.write("    <!-- ##### Album Catagory Area Start ##### -->\n");
      out.write("    <section class=\"album-catagory section-padding-100-0\">\n");
      out.write("        <div class=\"container\"><h2>Trending Albums</h2></div>\n");
      out.write("        <div class=\"container\" text-align:centre>\n");
      out.write("            ");

                try
                {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/localvocal?zeroDateTimeBehavior=convertToNull","root","Bits@2506");
                    Statement s=con.createStatement();
                    ResultSet rs=null;
                    rs=s.executeQuery("select * from albums order by count desc;");
                    int ct=0;
                    
      out.write("<div class=\"row oneMusic-albums\">");

                    while(rs.next())
                    {
                        String album_name=rs.getString(2);
                        String album_photo=rs.getString(3);
                        
      out.write("\n");
      out.write("                        <div class=\"col-12 col-sm-4 col-md-3 col-lg-2 single-album-item t c p\">\n");
      out.write("                            <div class=\"single-album\">\n");
      out.write("                                <img src=");
      out.print(album_photo);
      out.write(" alt=\"\">\n");
      out.write("                                <div class=\"album-info\">\n");
      out.write("                                    <a href=\"#\">\n");
      out.write("                                        <h5>");
      out.print(album_name);
      out.write("</h5>\n");
      out.write("                                    </a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("            \n");
      out.write("            ");

                        ct++;
                        if(ct==12)
                            break;
                    }
                    
      out.write("</div>");

                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
            
            
            
            
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container\"><h2>Trending Songs</h2></div>\n");
      out.write("        <div class=\"container\" text-align:centre>\n");
      out.write("            ");

                try
                {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/localvocal?zeroDateTimeBehavior=convertToNull","root","Bits@2506");
                    Statement s=con.createStatement();
                    ResultSet rs=null;
                    rs=s.executeQuery("select * from songs order by count desc;");
                    int ct=0;
                    
      out.write("<div class=\"row oneMusic-albums\">");

                    while(rs.next())
                    {   
                        String song_name=rs.getString(2);
                        String song_photo=rs.getString(3);
                        String song_loc=rs.getString(4);
                        String sid=rs.getString(1);
                        
      out.write("\n");
      out.write("                        <div class=\"col-12 col-sm-4 col-md-3 col-lg-2 single-album-item t c p\">\n");
      out.write("                            <div class=\"single-album\">\n");
      out.write("                                <img src=");
      out.print(song_photo);
      out.write(" alt=\"\">\n");
      out.write("                                <div class=\"album-info\">\n");
      out.write("                                    <a href=\"song_page.jsp?songid=");
      out.print(sid);
      out.write("&&email=");
      out.print(email);
      out.write("\">\n");
      out.write("                                        <h5 margin top=\"3em\">");
      out.print(song_name);
      out.write("</h5>\n");
      out.write("                                    </a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("            \n");
      out.write("            ");

                        ct++;
                        if(ct==12)
                            break;
                    }
                    
      out.write("</div>");

                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
            
            
            
            
      out.write("\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </section>\n");
      out.write("    \n");
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
      out.write("    \n");
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
