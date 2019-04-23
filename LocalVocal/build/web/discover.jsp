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
            
            
            
            <h2>Discover</h2>
        </div>
    </section>
       
    <!-- ##### Breadcumb Area End ##### -->

    <!-- ##### Album Catagory Area Start ##### -->
    <section class="album-catagory section-padding-100-0" >
        <div class="container">
            <div class="section-heading">
                <section  class="genre-sections">
                    <div class="img0">
                        <a href="display_genre.jsp?email=<%=email%>&&genre=pop"> <img class="img0-1" src="genre/pop.jpg" style="width:22em ;height: 15em;"></a>
                        <a href="display_genre.jsp?email=<%=email%>&&genre=romantic"><img class="img0-2" src="genre/romance.jpg" style="width:22em ;height: 15em;"></a>
                    </div>
                </section>
                <section  class="genre-sections1">
                    <div class="img1">
                        <a href="display_genre.jsp?email=<%=email%>&&genre=hip hop"><img class="img0-1" src="genre/hiphop.jpg" style="width:22em ;height: 15em;"></a>
                        <a href="display_genre.jsp?email=<%=email%>&&genre=heavy metal"><img class="img0-2" src="genre/heavymetal.jpg" style="width:22em ;height: 15em;"></a>
                    </div>
                </section>
                <section  class="genre-sections2">
                    <div class="img2">
                        <a href="display_genre.jsp?email=<%=email%>&&genre=jazz"><img class="img0-1" src="genre/jazz.jpg" style="width:22em ;height: 15em;"></a>         
                        <a href="display_genre.jsp?email=<%=email%>&&genre=rock"><img class="img0-2" src="genre/rock.jpg" style="width:22em ;height: 15em;"></a>
                    </div>
                </section>
                <section  class="genre-sections3">
                    <div class="img3">
                        <a href="display_genre.jsp?email=<%=email%>&&genre=country"><img class="img0-1" src="genre/country.jpg" style="width:22em ;height: 15em;"></a>
                        <a href="display_genre.jsp?email=<%=email%>&&genre=edm"><img class="img0-2" src="genre/edm.jpg" style="width:22em ;height: 15em;"></a>
                    </div>
                </section>
                <section  class="genre-sections4">
                    <div class="img4">
                        <a href="display_genre.jsp?email=<%=email%>&&genre=disco"><img class="img0-1" src="genre/disco.jpg" style="width:22em ;height: 15em;"></a>
                        <a href="display_genre.jsp?email=<%=email%>&&genre=punk"><img class="img0-2" src="genre/punk.jpg" style="width:22em ;height: 15em;"></a>
                    </div>
                </section>
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
    
   
    
           
      
</body>

</html>

