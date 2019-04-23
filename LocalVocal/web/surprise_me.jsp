<%-- 
    Document   : surprise_me
    Created on : Apr 22, 2019, 12:39:34 PM
    Author     : Vrutik
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Random"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String email=request.getParameter("email");
            Random r=new Random();
            int sid=r.nextInt(100)+1;
            response.sendRedirect("song_page.jsp?email="+email+"&&songid="+sid);
        
        %>
    </body>
</html>
