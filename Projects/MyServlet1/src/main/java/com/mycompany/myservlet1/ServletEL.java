package com.mycompany.myservlet1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/hello")
public class ServletEL extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String[] users = new String[] {"Tom", "Bob", "Sam"};
        req.setAttribute("users", users);
        getServletContext().getRequestDispatcher("/basic.jsp").forward(req, resp);
    }
}
