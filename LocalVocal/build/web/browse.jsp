<%-- 
    Document   : browse
    Created on : Apr 2, 2019, 5:32:59 PM
    Author     : Vrutik
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.util.ArrayList"%>

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
    <%
        String sq="";
        if(request.getParameter("search2")!=null)
        {
            sq=request.getParameter("search2");
        }
    
    
    %>
<%@ include file="side_queue.jsp" %> 
    <!-- ##### Breadcumb Area Start ##### -->
    <section class="breadcumb-area bg-img bg-overlay" style="background-image: url(img/bg-img/breadcumb3.jpg);">
        <div class="bradcumbContent">
            <h2> 
                <form class="example" action="browse.jsp" style="margin:auto;max-width:300px">
                    <input type="hidden" name="email" value="<%=email%>" >
                    <input type="text" placeholder="Search.." name="search2" value="<%=sq%>">
                    <button type="submit"><i class="fa fa-search"></i></button>
                </form>
            </h2>
        </div>
        
    </section>


    <!-- ##### Album Catagory Area Start ##### -->
    <section class="album-catagory section-padding-100-0">
        
        <div class="container">
               
            <%
                if(!sq.equals(""))
                {
                    ArrayList<Integer> song_here = new ArrayList<Integer>(1000);
                    ArrayList<String> song_name=new ArrayList<String>(1000);
                    ArrayList<Integer> album_here = new ArrayList<Integer>(1000);
                    ArrayList<String> album_name=new ArrayList<String>(1000);
                    ArrayList<Integer> artist_here = new ArrayList<Integer>(1000);
                    ArrayList<String> artist_name = new ArrayList<String>(1000);
                    ArrayList<String> song_photo=new ArrayList<String>(1000);
                    ArrayList<String> album_photo=new ArrayList<String>(1000);
                
       String x=sq;
       x=x.toUpperCase();
       int flag_songs=0,flag_albums=0,flag_artists=0;
       try
        { 
            Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/localvocal?zeroDateTimeBehavior=convertToNull","root","Bits@2506");
                Statement s=con.createStatement();
                ResultSet rs=null;
                if(!x.equals(null))
                {
                    rs=s.executeQuery("select songname,songid,songphotoloc from songs");
                    
                    while(rs.next())
                    {
                        String checking = rs.getString(1);
                        checking = checking.toUpperCase();
                        //System.out.println(checking+" "+x);
                        if(checking.contains(x))
                        {
                            song_here.add(rs.getInt(2));
                            song_name.add(rs.getString(1));
                            song_photo.add(rs.getString(3));
                           // System.out.println("found");
                        }
                    }
                    if(song_here.size()==0)
                        flag_songs=1;
                    
                    rs=null;
                    rs=s.executeQuery("select albname,albid,albphotoloc from albums;");
                    while(rs.next())
                    {
                        String checking = rs.getString(1);
                        checking = checking.toUpperCase();
                        
                        if(checking.contains(x))
                        {
                            album_here.add(rs.getInt(2));
                            album_name.add(rs.getString(1));
                            String y="img/";
                            y+=rs.getString(3);
                            album_photo.add(y);
                        }
                    }
                    if(album_here.size()==0)
                        flag_albums=1;
                    rs=null;
                    rs=s.executeQuery("select * from artists;");
                    while(rs.next())
                    {
                        String checking = rs.getString(2);
                        checking = checking.toUpperCase();
                        System.out.println(checking);
                        if(checking.contains(x))
                        {
                            artist_name.add(rs.getString(2));
                            artist_here.add(rs.getInt(1));
                        }
                    }
                    if(artist_here.size()==0)
                        flag_artists=1;
                        
                    
                }
                
        }
       catch(Exception e)
       {
           System.out.println("IN SEARCH ALGO"); 
       }
       
                
                    %>
            <h2>Search Results for " <%=sq%> " :</h2>
            <div class="row">
            <%
                if(flag_songs!=1)
                {
                    %>
                    <div class="col-12 col-lg-4">
                    <div class="new-hits-area mb-100"> 
                        <div class="section-heading text-left mb-50 wow fadeInUp" data-wow-delay="50ms">
                            <h3>Related Songs...</h3>
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
                                    <h4><a href="song_page.jsp?email=<%=email%>&&songid=<%=song_here.get(i)%>"><%=song_name.get(i)%></a></h4>
                                </div>
                           </div>
                        </div>
                       
            
            <%
                }
            %>
                    </div>
                    </div>
            <%    
                }
                if(flag_albums!=1)
{
                %>
            <div class="col-12 col-lg-4">
                    <div class="new-hits-area mb-100"> 
                        <div class="section-heading text-left mb-50 wow fadeInUp" data-wow-delay="50ms">
                            <h3>Related Albums...</h3>
                        </div>
                    
            <%
                    for(int i=0;i<album_name.size();i++)
                    {
                        System.out.println(album_photo.get(i));
                        
                        %>
                       <div class="single-new-item d-flex align-items-center justify-content-between wow fadeInUp" data-wow-delay="100ms">
                            <div class="first-part d-flex align-items-center">
                                <div class="thumbnail" style="max-height: 73px;max-width: 73px;">
                                    <a href="album_page.jsp?email=<%=email%>&&albumid=<%=album_here.get(i)%>"><img src="<%=album_photo.get(i)%>" alt=""></a>
                                </div>
                                <div class="content-" style="border-bottom: 1px grey;">
                                    <h4><a href="album_page.jsp?email=<%=email%>&&albumid=<%=album_here.get(i)%>"><%=album_name.get(i)%></a></h4>
                                </div>
                           </div>
                        </div>
                       
            
                        <%
                            }
%>
                    </div>
            </div>
                    
                        <%
}
                if(flag_artists!=1)
{
                %>
                        
                         <div class="col-12 col-lg-4">
                    <div class="new-hits-area mb-100"> 
                        <div class="section-heading text-left mb-50 wow fadeInUp" data-wow-delay="50ms">
                            <h3>Related Artists...</h3>
                        </div>
                    
            <%
                    for(int i=0;i<artist_here.size();i++)
                    {
                        
                        %>
                       <div class="single-new-item d-flex align-items-center justify-content-between wow fadeInUp" data-wow-delay="100ms">
                            <div class="first-part d-flex align-items-center">
                                
                                <div class="content-" style="border-bottom: 1px grey;">
                                    <h4><a href="artist.jsp?email=<%=email%>&&artistid=<%=artist_here.get(i)%>"><%=artist_name.get(i)%></a></h4>
                                </div>
                           </div>
                        </div>
                       
            
                        <%
                            }
%>
                        
                    </div>
                         </div>
                        <%
}
                    if(flag_songs==1 && flag_albums==1 && flag_artists==1)
{%>
<h2>No Related Searches</h2>
                        <%
}
}
            %>
            
                    </div>  
        </div>
     
        
        
         
    </section>
   

    
     
    <!-- ##### Contact Area Start ##### -->
    <!-- ##### Contact Area End ##### -->

    <!-- ##### Footer Area Start ##### -->
    
    <!-- ##### Footer Area Start ##### -->

    <!-- ##### All Javascript Script ##### -->
    
    <!-- jQuery-2.2.4 js -->
    <script src="js/jquery/jquery-2.2.4.min.js"></script>
    <!-- Popper js -->
    <script src="js/bootstrap/popper.min.js"></script>
    <!-- Bootstrap js -->
    <script src="js/bootstrap/bootstrap.min.js"></script>
    <!-- All Plugins js -->
    <script src="js/plugins/plugins.js"></script>
    <!-- Active js -->
    <script src="js/active.js"></script>


</html>
