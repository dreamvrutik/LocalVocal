/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Vrutik
 */
public class do_register extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String page=null;
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/localvocal?zeroDateTimeBehavior=convertToNull","root","Bits@2506");
                Statement s=con.createStatement();
                ResultSet rs=null;
                String name=null;
                String email=null,pwd=null,pwd1=null;
                int flag=0;
                
                if( request.getParameter("name") !=null)
                {
                    name=(String) request.getParameter("name");
                    if(!(name.equals("")))
                    {
                        flag++;
                    }
                }
                if(request.getParameter("email")!=null)
                {
                    email=(String) request.getParameter("email");
                    if(!email.equals(""))
                    {
                        flag++;
                    }
                }
                String mobile=null;
                if(request.getParameter("mobile")!=null)
                {
                    mobile=request.getParameter("mobile");
                    if(!mobile.equals("") && mobile.length()==10)
                    {
                        flag++;
                    }
                }
                if(request.getParameter("pass")!=null)
                {
                    pwd=(String) request.getParameter("pass");
                    if(!pwd.equals(""))
                    {
                        flag++;
                    }
                }
                if(request.getParameter("pwd1")!=null)
                {
                    pwd1=(String) request.getParameter("pwd1");
                    if(!pwd1.equals(""))
                    {
                        flag++;
                    }
                }
                System.out.println(name);
                System.out.println("--");
                System.out.println(email);
                System.out.println("--");
                System.out.println(pwd);
                System.out.println("--");
                System.out.println(pwd1);
                System.out.println("--");
                System.out.println(flag);
                if(flag==5)
                {
                    System.out.println("In if flag");
                    if(pwd.equals(pwd1))
                    {
                        System.out.println("In if pwd");
                        String in="insert into user_database values('"+name+"','"+email+"','"+pwd+"','"+mobile+"');";
                        rs=s.executeQuery("select count(*) from user_database where email='"+email+"';");
                        int ct=0;
                        while(rs.next())
                        {
                            ct=rs.getInt(1);
                        }
                        if(ct==1)
                        {
                            //response.sendRedirect("register.jsp?name='"+name+"'");
                            page="register.jsp?errcode=3";
                        }
                        else
                        {
                            s.execute(in);
                            in="insert into playlists values('"+email+"','My Songs');";
                            s.execute(in);
                        }
                        
                    }
                    else
                    {
                        System.out.println("in else pwd");
                        page="register.jsp?errcode=2";
                    }
                }
                else
                {
                    System.out.println("in else flag");
                   page="register.jsp?errcode=1";
                }
                System.out.println(page);
                response.sendRedirect("register.jsp");
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
