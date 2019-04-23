<%-- 
    Document   : register
    Created on : Feb 28, 2019, 5:49:41 PM
    Author     : Vrutik
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
    <script>
            req=null;
            function nm_change()
            {
                if(window.XMLHttpRequest)
                {
                    req=new XMLHttpRequest();
                }
                else
                {
                    req=new ActiveXObject("Microsoft.XMLHTTP");
                }
                req.onreadystatechange=process;
                req.open("get","./echeck.jsp?x="+document.getElementById("email").value,true);
                req.send(null);
            }
            function process()
            {
                if(req.readyState==4)
                {
                    document.getElementById("s2").innerHTML=req.responseText;
                }
            }
            
        </script>

</head>

<body>
    <!-- Preloader -->
    <%
        int ec=-1;
        if(request.getParameter("errcode")!=null)
        {
            ec=Integer.parseInt(request.getParameter("errcode"));
        }
        if(ec!=-1)
        {
            if(ec==1)
            {
                %>
                <script>
                    window.alert("Please enter all details.");
                </script>
                
                <%
            }
            else if(ec==2)
            {
                %>
                <script>
                    window.alert("Password and Retype Password do not match");
                </script>
                
                <%
            }
            else if(ec==3)
            {
                %>
                <script>
                    window.alert("User already exists.");
                </script>
                
                <%
            }
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
                        <a href="index.jsp" class="nav-brand"><img src="img/core-img/logo.png" alt=""></a>

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
                                <ul>
                                    <form action="check_login" method="POST" id="login_form">
                                        <label for="uid" id="l_name">Email id :</label>
                                        <li><input type="text" class="form-control" name="uid" placeholder="Email id" id="name"></li>
                                        <label for="pwd" id="l_pass">Password :</label>
                                        <li><input type="password" class="form-control" name="pwd" placeholder="**************" id="pass"></li>
                                        <button type="submit" id="submit_button">Login</button>
                                    </form>
                                </ul>
                                
                                <!-- Login/Register & Cart Button -->
                                <div class="login-register-cart-button d-flex align-items-center">
                                    <!-- Login/Register -->
                                    <div class="login-register-btn mr-50">
                                        <a  id="loginBtn"> Register</a>
                                    </div>

                                    <!-- Cart Button -->
                                </div>
                            </div>
                            <!-- Nav End -->

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
            <p>See what’s new</p>
            <h2>Register</h2>
        </div>
    </section>
    <!-- ##### Breadcumb Area End ##### -->

    <!-- ##### Login Area Start ##### -->
    <section class="login-area section-padding-100">
        <div class="container">
            <div class="row justify-content-center">
                <div class="col-12 col-lg-8">
                    <div class="login-content">
                        <h3>Welcome</h3>
                        <!-- Login Form -->
                        <div class="login-form">
                            <%
                                String tn=null;
                                int check=1;
                                try
                                {
                                     if(request.getParameter("name")!=null)
                                    {
                                        tn=request.getParameter("name");
                                    }

                                    if(tn.equals(null))
                                    {
                                        check=0;
                                    }
                                }
                                catch(Exception e)
                                {
                                    check=0;
                                }
                               
                            %>
                            <form action="do_register" method="post">
                                <div class="form-group">
                                    <label for="Name">UserName</label>
                                    <input type="text" class="form-control" id="exampleInputEmail1" name="name" aria-describedby="emailHelp" placeholder="Enter UserName">
                                    <small id="emailHelp" class="form-text text-muted"><i class="fa fa-lock mr-2"></i>We'll never share your name with anyone else.</small>
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputEmail1">Email address</label>
                                    <input type="email" class="form-control" id="email" name="email" aria-describedby="emailHelp" placeholder="Enter E-mail" onkeyup="nm_change()">
                                    <small id="emailHelp" class="form-text text-muted"><i class="fa fa-lock mr-2"></i>We'll never share your email with anyone else.</small>
                                    <span id="s2"><%
                                        if(check==1)
                                        {
                                            out.println("<font color='red'>Email Already Registered</font>");
                                        }
                                        %></span>
                                </div>
                                <div class="form-group">
                                    <label for="Name">Mobile Number</label>
                                    <input type="text" class="form-control" id="exampleInputEmail1" name="mobile" aria-describedby="emailHelp" placeholder="Enter MobileNumber">
                                    <small id="emailHelp" class="form-text text-muted"><i class="fa fa-lock mr-2"></i>We'll never share your mobile number with anyone else.</small>
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputPassword1">Password</label>
                                    <input type="password" class="form-control" id="exampleInputPassword1" name="pass" placeholder="Password">
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputPassword1">Retype Password</label>
                                    <input type="password" class="form-control" id="exampleInputPassword1" name="pwd1" placeholder="Password">
                                </div>
                                <button type="submit" class="btn oneMusic-btn mt-30">Register</button>
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
