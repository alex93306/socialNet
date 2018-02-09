package org.mycompany.controllers;

import org.mycompany.entities.Dialog;
import org.mycompany.entities.DialogParticipant;
import org.mycompany.entities.User;
import org.mycompany.factories.DialogManagerFactory;
import org.mycompany.factories.UserFactory;
import org.mycompany.managers.DialogManager;
import org.mycompany.managers.UserManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@WebServlet(name = "CreateDialogServlet", urlPatterns = "/dialogs/*")
public class CreateDialogServlet extends HttpServlet {
    public static final String USER_DIALOGS_LIST_JSP = "WEB-INF/jsp/dialogs.jsp";
    private UserManager userManager = UserFactory.getUserManager();
    private DialogManager dialogManager = DialogManagerFactory.getDialogManager();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Dialog dialog = new Dialog();
        dialogManager.save(dialog);
        response.sendRedirect("/dialogs?dialogID=" + 1);

//        Long interlocutorID = 3L;
//        User user = userManager.find(interlocutorID);
//
//        DialogParticipant dialogParticipant = new DialogParticipant();
//        dialogParticipant.setDialog(dialog);
//        dialogParticipant.setUser(user);
//        dialogParticipant.setCreated(LocalDateTime.now());
//        dialogParticipant.setModified(LocalDateTime.now());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String pathInfo = request.getPathInfo();
        if ("".equals(pathInfo)){

        }
        HttpSession session = request.getSession();
        if (session == null) {
            User user = (User) session.getAttribute("user");
            Long userID = user.getId();
        } else {
            
        }
        List<User> userList = Arrays.asList(userManager.find(1L));
        request.setAttribute("userList", userList);
        request.getRequestDispatcher(USER_DIALOGS_LIST_JSP).forward(request, response);
    }
}
