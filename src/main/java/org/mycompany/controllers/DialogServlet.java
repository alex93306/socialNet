package org.mycompany.controllers;

import org.mycompany.entities.Message;
import org.mycompany.factories.DialogManagerFactory;
import org.mycompany.managers.DialogManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@WebServlet(name = "DialogServlet", urlPatterns = "/dialogs2")
public class DialogServlet extends HttpServlet {
    private DialogManager dialogManager = DialogManagerFactory.getDialogManager();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Long dialogID = Long.valueOf(request.getParameter("dialogID"));
        Message message = new Message();
        message.setCreated(LocalDateTime.now());
        message.setText("Text of message");
        Message message2 = new Message();
        message2.setCreated(LocalDateTime.now().minusYears(1));
        message2.setText("Text of message2");
        List<Message> messages = Arrays.asList(message, message2);
        request.setAttribute("messages", messages);

        request.getRequestDispatcher("WEB-INF/jsp/messages.jsp");
    }
}
