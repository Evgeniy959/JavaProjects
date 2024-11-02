package com.mycompany.servletimages;

import java.io.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

//@WebServlet(name = "helloServlet", value = "/hello-servlet")
@WebServlet(urlPatterns = {"/hello-servlet", "/servlet2"})
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        if (request.getRequestURI().equals("/servlet2"))
        //if (request.getServletPath().equals("/servlet2"))
            response.sendRedirect(request.getContextPath() + "/index.jsp");
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("<h2>" + request.getRequestURI() + "</h2>");
        out.println("<h2>" + request.getServletPath() + "</h2>");
        out.println("<h2>" + request.getContextPath() + "</h2>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}