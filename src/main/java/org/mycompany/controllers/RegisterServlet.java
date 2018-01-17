package org.mycompany.controllers;

import org.mycompany.entities.User;
import org.mycompany.factories.UserFactory;
import org.mycompany.managers.UserManager;
import org.mycompany.validators.UserValidator;
import org.mycompany.validators.ValidationResult;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    public static final String JSP_USER_REGISTER = "WEB-INF/jsp/register.jsp";
    private UserManager userManager = UserFactory.getUserManager();
    private UserValidator userValidator = new UserValidator();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = new User();
        user.setEmail(request.getParameter("email"));
        user.setPassword(request.getParameter("password"));
        user.setFirstName(request.getParameter("firstname"));
        user.setLastName(request.getParameter("lastname"));
        ValidationResult result = new ValidationResult();
        userValidator.validateSave(user, result);
        if (result.hasError()) {
            request.setAttribute("errorResult", result);
            request.getRequestDispatcher(JSP_USER_REGISTER).forward(request, response);
            return;
        }
        userManager.save(user);
        request.setAttribute("result", "Saved!");
        request.getRequestDispatcher(JSP_USER_REGISTER).forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher(JSP_USER_REGISTER).forward(request, response);
    }
}
