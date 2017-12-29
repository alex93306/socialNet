package org.mycompany.managers;

import org.mycompany.dao.DAO;
import org.mycompany.dao.UserDAO;
import org.mycompany.entities.User;
import org.springframework.stereotype.Component;

/**
 * @author Alex Ramanovich
 */
@Component
public class UserManagerImpl extends AbstractManager<User> implements UserManager {
    public UserManagerImpl(UserDAO dao) {
        super(dao);
    }
}
