<%-- 
    Document   : deleteplaylist
    Created on : Apr 11, 2019, 7:52:27 PM
    Author     : Vrutik
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String email=request.getParameter("email");
            String playlist=request.getParameter("playlist");
            String sid=request.getParameter("sid");
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/localvocal?zeroDateTimeBehavior=convertToNull","root","Bits@2506");
                Statement s=con.createStatement();
                ResultSet rs=null;
                s.execute("delete from playlist_songs where email='"+email+"' and playlistname='"+playlist+"' and songid="+sid+";");
                response.sendRedirect("playlist.jsp?email="+email+"&&playlist="+playlist);
                
            }
            catch(Exception e)
            {
                System.out.println(e);
            }

        
        %>
    </body>
</html>
