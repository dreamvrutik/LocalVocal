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
                String artists="";
                String ploc=null;
                String sloc="song/";
                ArrayList<String> playlists=new ArrayList<String>(1000); 
                try
                {
                    
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/localvocal?zeroDateTimeBehavior=convertToNull","root","Bits@2506");
                    Statement s=con.createStatement();
                    ResultSet rs=null;
                    Statement s1=con.createStatement();
                    ResultSet rs1=null;
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
                    rs=s.executeQuery("select playlistname from playlists where email='"+email+"';");
                    while(rs.next())
                    {
                        playlists.add(rs.getString(1));
                    }
                    int flag=0;
                    rs=s.executeQuery("select count(*) from album_song where songid="+sid+";");
                    System.out.println(1);
                    while(rs.next())
                    {
                        if(rs.getInt(1)>0)
                            flag=1;
                    }
                    if(flag==1)
                    {
                        rs=s.executeQuery("select albid from album_song where songid="+sid+";");
                        System.out.println(2);
                        while(rs.next())
                        {
                            aid=rs.getString(1);
                        }
                        rs=s.executeQuery("select albname from albums where albid="+aid+";");
                        System.out.println(3);
                        while(rs.next())
                        {
                            aname=rs.getString(1);
                        }
                        System.out.println(aname);
                    }
                    rs=s.executeQuery("select artistid from artist_song where songid="+sid+";");
                    while(rs.next())
                    {
                        rs1=s1.executeQuery("select artistname from artists where artistid="+rs.getInt(1));
                        while(rs1.next())
                        {
                            artists+=rs1.getString(1);
                        }
                        if(rs.isLast())
                        {
                            
                        }
                        else
                           artists+=" , ";
                    }
                    
                    System.out.println("Artists : "+artists);
                    sloc+=sid;
                    sloc+=".mp3";
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
                ploc="song_photo/"+sid+".png";
            %>
            
            <h2><%=sname%></h2>
        </div>
    </section>
       
    <!-- ##### Breadcumb Area End ##### -->

    <!-- ##### Album Catagory Area Start ##### -->
    <section class="album-catagory section-padding-100-0" >
        <div class="container">
            <div class="section-heading">
                <img id="img" src="<%=ploc%>" alt="" style="max-height: 500px;max-width: 400px;">
                    <%
                        if(aname!=null)
                        {
                            %>
                            <h2>
                                <%=aname%>
                            </h2>
                        <h2>
                    <%
                        }
else
{
    %>
    <h2>
                            <%
}
                    %>
                    <%=artists%>
                </h2>
                <button class="open-button" onclick="openForm()">Add to Playlist <b>+</b></button>

            <div class="form-popup" id="myForm">
                <form class="form-container" action="add_song" method="post">
                    <input type="hidden" value="<%=email%>" name="mail">
                    <input type="hidden" value="<%=sid%>" name="songid">
                    <%
                        for(int i=0;i<playlists.size();i++)
                        {
                            %>
                    <label style="color: #000000;  font-size: 20px; text-transform: uppercase; letter-spacing: 2px; font-family: 'Archivo Narrow', sans-serif;"> <%=playlists.get(i)%> :</label> <label class="container1"><input type="checkbox" name="playlist" value="<%=playlists.get(i)%>" id="playlist"><span class="checkmark"></span></label><br>
                    <%
                        }
                    %>
                    

                  <button type="submit" class="btn">Add</button>
                  <button type="submit" class="btn cancel" onclick="closeForm()">Cancel</button>
                </form>
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
   
    <script>
        function openForm() {
          document.getElementById("myForm").style.display = "block";
        }

        function closeForm() {
          document.getElementById("myForm").style.display = "none";
        }
    </script>
    <!-- ##### Contact Area Start ##### -->

    <!-- ##### Footer Area Start ##### -->
    
    <!-- ##### Footer Area Start ##### -->

    <!-- ##### All Javascript Script ##### -->
    <!-- jQuery-2.2.4 js -->
    
   
    
            <!---->
          <div class="sarthak-player" >
            <audio id="sarthak-player"  controls="controls" style="margin-left: 15em;width:80em;height: 5em;">
                  <source src="<%=sloc%>" type="audio/mpeg"/>
            </audio>
        </div>
      
</body>

</html>

