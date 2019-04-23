<%-- 
    Document   : echeck
    Created on : Mar 1, 2019, 6:11:58 PM
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
            String email=null;
            email=request.getParameter("x");
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/localvocal?zeroDateTimeBehavior=convertToNull","root","Bits@2506");
                Statement s=con.createStatement();
                ResultSet rs=null;
                rs=s.executeQuery("select count(*) from user_database where email='"+email+"';");
                int ct=0;
                while(rs.next())
                {
                    ct=rs.getInt(1);
                }
                if(ct==1)
                {
                    %>
                    <font color="red">Email Already Registered</font>
                        
                    <%
                }
            }
            catch(Exception e)
            {
                System.out.print(e);
            }
        %>
    </body>
</html>
