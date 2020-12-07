/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.MyClass;

/**
 *
 * @author George.Pasparakis
 */
@WebServlet(name = "XYZ", urlPatterns = {"/", "/xyz"},  
            initParams={
            @WebInitParam(name="hasLogin", value="false")})
public class XYZ extends HttpServlet {

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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet XYZ</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet XYZ at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
    // /xyz servlet == controller
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // prepare data to be sent to front end via attributes
        // the line below is considered as business logic of the servlet or for
        // the entire web app
        MyClass myClass = new MyClass("Speedy", 10, 34.67f);
        // on the request we add a new "variable" == attribute
        request.setAttribute("classData", myClass);
        
        
        // we use the technique of request.getRequestDispatcher()
        // in order to move a request from the current servlet onto
        // a new resource, e.g. html, jsp, servlet
        // this is considered a View!!!!! (speedy.jsp)
//        RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/speedy.jsp");
//        rd.forward(request, response);

        
        response.sendRedirect("WEB-INF/views/speedy.jsp");


        //processRequest(request, response);
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
