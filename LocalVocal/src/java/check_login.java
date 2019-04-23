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
public class check_login extends HttpServlet {
    public String l_email=null;

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
            /* TODO output your page here. You may use following sample code. */
            String email=null,pwd=null;
            try
            {
                out.println(0);
                if(request.getParameter("uid")!=null)
                {
                    email=request.getParameter("uid");
                }
                out.println(1);
                if(request.getParameter("pwd")!=null)
                {
                    pwd=request.getParameter("pwd");
                }
                out.println(2);
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/localvocal?zeroDateTimeBehavior=convertToNull","root","Bits@2506");
                Statement s=con.createStatement();
                ResultSet rs=null;
                if(!email.equals("") && !pwd.equals(""))
                {
                    out.println(3);
                    out.println(email);
                    out.println(pwd);
                    rs=s.executeQuery("select count(*) from user_database where email='"+email+"';");
                    int ct=-1;
                    while(rs.next())
                    {
                        ct=rs.getInt(1);
                    }
                    if(ct==0)
                    {
                        response.sendRedirect("index.jsp?errorcode=2");
                    }
                    else
                    {
                        rs=s.executeQuery("select password from user_database where email='"+email+"';");
                        String cp=null;
                        while(rs.next())
                        {
                            cp=rs.getString(1);
                        }
                        if(cp.equals(pwd))
                        {
                            //main after login page...
                            l_email=email;
                            response.sendRedirect("main_page.jsp?email="+email);
                        }
                        else
                        {
                            response.sendRedirect("index.jsp?errorcode=2");
                        }
                    }
                }
                else
                {
                    out.println(4);
                    response.sendRedirect("index.jsp?errorcode=1");
                }
                
                
            }
            catch(Exception e)
            {
                out.println(5);
                System.out.println(e);
            }
        }
    }
    public String mail()
    {
        return l_email;
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


