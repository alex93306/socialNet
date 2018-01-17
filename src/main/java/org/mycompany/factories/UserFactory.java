package org.mycompany.factories;

import org.mycompany.dao.jdbc.UserJDBCDAOImpl;
import org.mycompany.managers.UserManager;
import org.mycompany.managers.UserManagerImpl;

public class UserFactory {
    private static final UserFactory userFactory = new UserFactory();
    private UserFactory() {}

    public static UserManager getUserManager() {
        return new UserManagerImpl(new UserJDBCDAOImpl());
    }


}
