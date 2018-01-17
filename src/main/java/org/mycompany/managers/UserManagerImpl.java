package org.mycompany.managers;

import org.mycompany.dao.DAO;
import org.mycompany.dao.UserDAO;
import org.mycompany.entities.User;

/**
 * @author Alex Ramanovich
 */
public class UserManagerImpl extends AbstractManager<UserDAO, User> implements UserManager {
    public UserManagerImpl(UserDAO dao) {
        super(dao);
    }

    @Override
    public boolean authenticate(String email, String password) {
        User user = dao.find(7L);//todo:

        return false;
    }
}
