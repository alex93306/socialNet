package org.mycompany.managers;

import org.mycompany.entities.User;

/**
 * @author Alex Ramanovich
 */
public interface UserManager extends Manager<User> {

    boolean authenticate(String email, String password);
}
