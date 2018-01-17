package org.mycompany.controllers;

import org.mycompany.entities.User;
import org.mycompany.factories.UserFactory;
import org.mycompany.managers.UserManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "UserServlet", urlPatterns = "/user")
public class UserServlet extends HttpServlet {
    private UserManager userManager = UserFactory.getUserManager();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = userManager.find(7L);
        request.setAttribute("user", user);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
