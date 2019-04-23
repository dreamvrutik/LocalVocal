<%-- 
    Document   : side_queue
    Created on : Apr 2, 2019, 6:08:59 PM
    Author     : Vrutik
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Random"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html>
  <head>
      <style>
          @import url(//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css);
@import url(https://fonts.googleapis.com/css?family=Titillium+Web:300);
.fa-2x {
font-size: 2em;
}
.fa {
position: relative;
display: table-cell;
width: 60px;
height: 36px;
text-align: center;
vertical-align: middle;
font-size:20px;
}


.main-menu:hover,nav.main-menu.expanded {
width:200px;
overflow:visible;
opacity:1;
}

.main-menu {
background:#212121;
border-right:1px solid #e5e5e5;
position:fixed;
opacity:1;
top:0;
bottom:0;
height:100vh;
left:0;
width:50px;
overflow:hidden;
-webkit-transition:width .05s linear;
transition:width .05s linear;
-webkit-transform:translateZ(0) scale(1,1);
z-index:1000;
}

.main-menu>ul {
margin:7px 0;
}

.main-menu li {
position:relative;
display:block;
width:200px;
}

.main-menu li>a {
position:relative;
display:table;
border-collapse:collapse;
border-spacing:0;
color:#999;
 font-family: arial;
font-size: 14px;
text-decoration:none;
-webkit-transform:translateZ(0) scale(1,1);
-webkit-transition:all .1s linear;
transition:all .1s linear;
  
}

.main-menu .nav-icon {
position:relative;
display:table-cell;
width:60px;
height:36px;
text-align:center;
vertical-align:middle;
font-size:18px;
}

.main-menu .nav-text {
position:relative;
display:table-cell;
vertical-align:middle;
width:190px;
  font-family: 'Titillium Web', sans-serif;
}

.main-menu>ul.logout {
position:absolute;
left:0;
bottom:0;
}

.no-touch .scrollable.hover {
overflow-y:hidden;
opacity: 1;
}

.no-touch .scrollable.hover:hover {
overflow-y:auto;
overflow:visible;
opacity: 1;
}

a:hover,a:focus {
text-decoration:none;
}

nav {
-webkit-user-select:none;
-moz-user-select:none;
-ms-user-select:none;
-o-user-select:none;
user-select:none;
}

nav ul,nav li {
outline:0;
margin:0;
padding:0;
}
.main-menu li:hover>a,nav.main-menu li.active>a,.dropdown-menu>li>a:hover,.dropdown-menu>li>a:focus,.dropdown-menu>.active>a,.dropdown-menu>.active>a:hover,.dropdown-menu>.active>a:focus,.no-touch .dashboard-page nav.dashboard-menu ul li:hover a,.dashboard-page nav.dashboard-menu ul li.active a {
color:#fff;
background-color:#5fa2db;
}
.area {
float: left;
background: #e2e2e2;
width: 100%;
height: 100%;
}
@font-face {
  font-family: 'Titillium Web';
  font-style: normal;
  font-weight: 300;
  src: local('Titillium WebLight'), local('TitilliumWeb-Light'), url(http://themes.googleusercontent.com/static/fonts/titilliumweb/v2/anMUvcNT0H1YN4FII8wpr24bNCNEoFTpS2BTjF6FB5E.woff) format('woff');
}

      </style>
      <link rel="stylesheet" href="style.css">
  </head>
  <%
      Random rand=new Random();
      int sid_random[]=new int[15];
      String snamee[]=new String[15];
      String sploc[]=new String[15];
      try
      {
          Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/localvocal?zeroDateTimeBehavior=convertToNull","root","Bits@2506");
          Statement s=con.createStatement();
          ResultSet rs=null;
          for(int i=0;i<15;i++)
          {
              sid_random[i]=rand.nextInt(100)+1;
              rs=s.executeQuery("select songname,songphotoloc from songs where songid="+sid_random[i]+";");
              while(rs.next())
              {
                  snamee[i]=rs.getString(1);
                  sploc[i]=rs.getString(2);
              }
          }
          
      }
      catch(Exception e)
      {
          System.out.println(e);
      }
      
  
  %>
  <body><div class="area"></div><nav class="main-menu">
            <ul>
                <%
                    for(int i=0;i<15;i++)
                    {
                        String m=(String)session.getAttribute("mail");
                %>
                <li style="margin-top: 8px;">
                    <a href="song_page.jsp?songid=<%=sid_random[i]%>&&email=<%=m%>">
                        <i class="fa" >
                            <img src="<%=sploc[i]%>" style="max-height: 30px;max-width: 30px;">
                            
                        </i>
                        <span class="nav-text">
                            <%=snamee[i]%>
                        </span>
                    </a>
                  
                </li>
                <%
                    
                }%>
               
            </ul>
        </nav>
      
  </body>
    </html>