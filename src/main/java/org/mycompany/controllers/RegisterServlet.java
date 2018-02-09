package org.mycompany.controllers;

import org.mycompany.entities.User;
import org.mycompany.factories.UserFactory;
import org.mycompany.managers.UserManager;
import org.mycompany.transformers.UserTransformer;
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
    public static final String JSP_WAIT_EMAIL_CONFIRM = "WEB-INF/jsp/waitEmailConfirm.jsp";
    private UserManager userManager = UserFactory.getUserManager();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = UserTransformer.transform(request);
        
        ValidationResult result = new ValidationResult();
        UserValidator.validateSave(user, result);
        if (result.hasError()) {
            request.setAttribute("errorResult", result);
            request.getRequestDispatcher(LoginServlet.JSP_LOGIN).forward(request, response);
            return;
        }
        
        userManager.save(user);

        
        request.getRequestDispatcher(JSP_WAIT_EMAIL_CONFIRM).forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher(LoginServlet.JSP_LOGIN).forward(request, response);
    }
}
