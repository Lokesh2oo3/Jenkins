package com.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        out.println("<html><body>");
        out.println("<h1>WildFly 31 Deployment Test</h1>");
        out.println("<p>Status: <b>Success</b></p>");
        out.println("<p>Server Time: " + new Date().toLocaleString() + "</p>");
        out.println("<p>Deployed via Jenkins Pipeline</p>");
        out.println("</body></html>");
    }
}