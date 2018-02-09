package org.mycompany.controllers;

import org.mycompany.entities.User;
import org.mycompany.factories.UserFactory;
import org.mycompany.managers.UserManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    public static final String JSP_LOGIN = "WEB-INF/jsp/login.jsp";
    private UserManager userManager = UserFactory.getUserManager();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        User user = userManager.find(1L);
        HttpSession session = request.getSession();
        session.setAttribute("token", user);

        response.sendRedirect("/dialogs");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher(JSP_LOGIN).forward(request, response);
    }
    
}


