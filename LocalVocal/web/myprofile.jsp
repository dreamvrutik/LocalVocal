<%-- 
    Document   : register
    Created on : Feb 28, 2019, 5:49:41 PM
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
    <%
        String err="-1";
        if(request.getParameter("errcode")!=null)
            err=request.getParameter("errcode");
        if(err.equals("0"))
        {
            %>
            <script>
               window.alert("Password changed successfully");
            </script>
    <%
        }
else if(err.equals("1"))
{
%>
<script>
    window.alert("Cant leave new password empty...")
</script>
            <%
}

else if(err.equals("2"))
{
%>
<script>
    window.alert("Passwords do not match")
</script>
<%
}
else if(err.equals("3"))
{
%><script>window.alert("Old Password does not match")</script><%
}
else if(err.equals("4"))
{
%><script>window.alert("Check Mobile Number")</script><%
}
    
    %>
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
                                          </div>
                    </nav>
                </div>
            </div>
        </div>
    </header>
    <!-- ##### Header Area End ##### -->

    <!-- ##### Breadcumb Area Start ##### -->
    <section class="breadcumb-area bg-img bg-overlay" style="background-image: url(img/bg-img/breadcumb3.jpg);">
        <div class="bradcumbContent">
            <p>Edit Profile</p>
            <h2><%=name%></h2>
        </div>
    </section>
    <!-- ##### Breadcumb Area End ##### -->

    <!-- ##### Login Area Start ##### -->
    <section class="login-area section-padding-100">
        <div class="container">
            <div class="row justify-content-center">
                <div class="col-12 col-lg-8">
                    <div class="login-content">
                        <h3>My Profile</h3>
                        <!-- Login Form -->
                        <div class="login-form">
                            
                            <form action="change_password" method="post">
                                <div class="form-group">
                                    <input type="hidden" class="form-control" name="name" aria-describedby="emailHelp" value="<%=name%>" disabled">
                                    </div>
                                <div class="form-group">
                                    <input type="hidden" class="form-control" name="emailing" aria-describedby="emailHelp" value="<%=email%>">
                                    
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputPassword1">Old Password</label>
                                    <input type="password" class="form-control"  name="oldpass" placeholder="Password">
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputPassword1">New Password</label>
                                    <input type="password" class="form-control" id="exampleInputPassword1" name="pwd" placeholder="Password">
                                </div>
                                    <div class="form-group">
                                    <label for="exampleInputPassword1">Retype New Password</label>
                                    <input type="password" class="form-control" id="exampleInputPassword1" name="pwd1" placeholder="Password">
                                </div>
                                <button type="submit" class="btn oneMusic-btn mt-30">Change Password</button>
                            </form>
                            <form action="change_mobile" method="post">
                                <div class="form-group">
                                    <input type="hidden" class="form-control" name="name" aria-describedby="emailHelp" value="<%=name%>" disabled">
                                    </div>
                                <div class="form-group">
                                    <input type="hidden" class="form-control" name="emailing" aria-describedby="emailHelp" value="<%=email%>">
                                    
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputPassword1">New Mobile Number</label>
                                    <input type="text" class="form-control"  name="newmobile" placeholder="New Mobile Number">
                                </div>
                                
                                <button type="submit" class="btn oneMusic-btn mt-30">Change Mobile Number</button>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- ##### Login Area End ##### -->

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
</body>

</html>
