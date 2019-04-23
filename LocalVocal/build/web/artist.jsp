<%-- 
    Document   : song_page
    Created on : Mar 29, 2019, 1:11:23 AM
    Author     : Vrutik
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="description" content="">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- The above 4 meta tags *must* come first in the head; any other head content must come *after* these tags -->

    <!-- Title -->
    <title>LocalVocal</title>

    <!-- Favicon -->
    <link rel="icon" href="img/core-img/favicon.ico">

    <!-- Stylesheet -->
    <link rel="stylesheet" href="style.css">

</head>

<body>
    <!-- Preloader -->
     
    <div class="preloader d-flex align-items-center justify-content-center">
        <div class="lds-ellipsis">
            <div></div>
            <div></div>
            <div></div>
            <div></div>
        </div>
    </div>
    <!-- ##### Header Area Start ##### -->
    <header class="header-area">
        <!-- Navbar Area -->
        <div class="oneMusic-main-menu">
            <div class="classy-nav-container breakpoint-off">
                <div class="container">
                    <!-- Menu -->
                    <nav class="classy-navbar justify-content-between" id="oneMusicNav">

                        <!-- Nav brand -->
                        <a class="nav-brand"><img src="img/core-img/logo.png" alt=""></a>

                        <!-- Navbar Toggler -->
                        <div class="classy-navbar-toggler">
                            <span class="navbarToggler"><span></span><span></span><span></span></span>
                        </div>

                        <!-- Menu -->
                        <div class="classy-menu">

                            <!-- Close Button -->
                            <div class="classycloseIcon">
                                <div class="cross-wrap"><span class="top"></span><span class="bottom"></span></div>
                            </div>

                            <!-- Nav Start -->
                            <div class="classynav">
                                <%
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
                                %>
                                <ul>
                                    <li><a href="main_page.jsp?email=<%=email%>">Home</a></li>
                                    <li><a href="browse.jsp?email=<%=email%>">Browse</a></li>
                                    <li><a href="discover.jsp?email=<%=email%>">Discover</a></li>
                                    <li><a href="all_playlists.jsp?email=<%=email%>">My Playlist</a></li><li><a href="surprise_me.jsp?email=<%=email%>">Surprise Me!</a></li>
                                </ul>

                                <!-- Login/Register & Cart Button -->
                                
                                <ul>
                                    <li>
                                        <div class="login-register-cart-button d-flex align-items-center">
                                    <!-- Cart Button -->
                                    <div class="cart-btn">
                                        <p><span class="icon-user-1"></span> <span><%=name%></span></p>
                                        <ul class="dropdown">
                                                            <li><a href="myprofile.jsp?email=<%=email%>">My Profile</a></li>
                                                            <li><a href="index.jsp">Logout</a></li>
                                        </ul>
                                    </div>
                                </div>
                                    </li>
                                </ul>
                            </div>
                            <!-- Nav End -->

                        </div>
                    </nav>
                </div>
            </div>
        </div>
    </header>
                                        
    <!-- ##### Header Area End ##### -->
<%@ include file="side_queue.jsp" %> 
    <!-- ##### Breadcumb Area Start ##### -->
    <section class="breadcumb-area bg-img bg-overlay" style="background-image: url(img/bg-img/breadcumb3.jpg);">
        <div class="bradcumbContent">
            
            <%
                String sname=null,sid=null;
                String aname=null,aid=null;
                ArrayList<Integer> song_here = new ArrayList<Integer>(1000);
                ArrayList<String> song_name=new ArrayList<String>(1000);
                ArrayList<String> song_photo=new ArrayList<String>(1000);
                String artists="";
                String ploc="img/album_photo/";
                String sloc="song/";
                try
                {
                    
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/localvocal?zeroDateTimeBehavior=convertToNull","root","Bits@2506");
                    Statement s=con.createStatement();
                    ResultSet rs=null;
                    Statement s1=con.createStatement();
                    ResultSet rs1=null;
                    aid=request.getParameter("artistid");
                    rs=s.executeQuery("select artistname from artists where artistid="+aid+";");
                    while(rs.next())
                    {
                        aname=rs.getString(1);
                    }
                    rs=s.executeQuery("select songid from artist_song where artistid="+aid);
                    while(rs.next())
                    {
                        rs1=s1.executeQuery("select * from songs where songid="+rs.getString(1));
                        while(rs1.next())
                        {
                            song_here.add(rs1.getInt(1));
                            song_name.add(rs1.getString(2));
                            song_photo.add(rs1.getString(3));
                        }
                    }
                    
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
            %>
            
            <h2><%=aname%></h2>
        </div>
    </section>
       
    <!-- ##### Breadcumb Area End ##### -->

    <!-- ##### Album Catagory Area Start ##### -->
    <section class="album-catagory section-padding-100-0" >
        <div class="container">
            <div class="row">
                <div class="col-12 col-lg-12">
                    <div class="new-hits-area mb-100"> 
                        <div class="section-heading text-left mb-50 wow fadeInUp" data-wow-delay="50ms">
                            <h3>Songs</h3>
                        </div>
                    
            <%
                    for(int i=0;i<song_name.size();i++)
                    {
                        
                        %>
                       <div class="single-new-item d-flex align-items-center justify-content-between wow fadeInUp" data-wow-delay="100ms">
                            <div class="first-part d-flex align-items-center">
                                <div class="thumbnail">
                                    <a href="song_page.jsp?email=<%=email%>&&songid=<%=song_here.get(i)%>"><img src="<%=song_photo.get(i)%>" alt=""/></a>
                                </div>
                                <div class="content-" style="border-bottom: 1px grey;">
                                    <h2 style="font-size: 18px;text-transform: uppercase;letter-spacing: 10px"><a href="song_page.jsp?email=<%=email%>&&songid=<%=song_here.get(i)%>"><%=song_name.get(i)%></a></h2>
                                </div>
                           </div>
                        </div>
                       
            
            <%
                }
            %>
                    </div>
                    </div>
            </div>
        </div>
        
       
        
    </section>
                <script src="js/jquery/jquery-2.2.4.min.js"></script>
    <!-- Popper js -->
    <script src="js/bootstrap/popper.min.js"></script>
    <!-- Bootstrap js -->
    <script src="js/bootstrap/bootstrap.min.js"></script>
    <!-- All Plugins js -->
    <script src="js/plugins/plugins.js"></script>
    <!-- Active js -->
    <script src="js/active.js"></script>
   
    
    <!-- ##### Contact Area Start ##### -->

    <!-- ##### Footer Area Start ##### -->
    
    <!-- ##### Footer Area Start ##### -->

    <!-- ##### All Javascript Script ##### -->
    <!-- jQuery-2.2.4 js -->
    
   
    
            <!---->
          
      
</body>

</html>

