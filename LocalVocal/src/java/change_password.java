/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Class.forName;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Vrutik
 */
public class change_password extends HttpServlet {

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
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/localvocal?zeroDateTimeBehavior=convertToNull","root","Bits@2506");
            Statement s=con.createStatement();
            ResultSet rs=null;
            Statement s1=con.createStatement();
            ResultSet rs1=null;
            String email=request.getParameter("emailing");
            String oldpass=request.getParameter("oldpass");
            String pwd="",pwd1="";
            System.out.println(email);
            if(request.getParameter("pwd")!=null)
            {
                pwd=request.getParameter("pwd");
            }
            if(request.getParameter("pwd1")!=null)
            {
                pwd1=request.getParameter("pwd1");
            }
            System.out.println(oldpass);
            System.out.println(pwd);
            System.out.println(pwd1);
            String errcode="0";
            if(pwd.equals("")||pwd1.equals(""))
            {
                errcode="1";
            }
            else
            {
                rs=s.executeQuery("select password from user_database where email='"+email+"';");
                while(rs.next())
                {
                    if(oldpass.equals(rs.getString(1)))
                    {
                        if(pwd.equals(pwd1))
                        {
                            s1.execute("update user_database set password='"+pwd+"' where email='"+email+"';");
                            
                        }
                        else
                        {
                            errcode="2";
                        }
                    }
                    else
                    {
                        errcode="3";
                    }
                }
            }
            response.sendRedirect("myprofile.jsp?email="+email+"&&errcode="+errcode);
            /* TODO output your page here. You may use following sample code. */
            
            
        }
        catch(Exception e)
        {
            System.out.println(e);
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
