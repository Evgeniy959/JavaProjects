package com.mycompany.myservlet1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/serv")
public class MainServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<User> usersL = new ArrayList<User>() {{
            add(new User("Tom", "USA", 25));
            add(new User("Mike", "France", 33));
            add(new User("Bob", "Bali", 45));
        }};
        req.setAttribute("users", usersL);
        getServletContext().getRequestDispatcher("/test.jsp").forward(req, resp);
    }
}
