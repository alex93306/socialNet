package org.mycompany.transformers;

import org.mycompany.entities.User;

import javax.servlet.http.HttpServletRequest;

public class UserTransformer{
    
    public static User transform(HttpServletRequest request) {
        User user = new User();
        user.setEmail(request.getParameter("email"));
        user.setPassword(request.getParameter("password"));
        user.setFirstName(request.getParameter("first_name"));
        user.setLastName(request.getParameter("last_name"));
        
        return user;
    }
}
