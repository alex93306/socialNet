package org.mycompany.factories;

import org.mycompany.dao.jdbc.DialogJDBCDAOImpl;
import org.mycompany.managers.DialogManager;
import org.mycompany.managers.DialogManagerImpl;

public class DialogManagerFactory {
    private DialogManagerFactory factory = new DialogManagerFactory();
    private DialogManagerFactory() {

    }

    public static DialogManager getDialogManager() {
        return new DialogManagerImpl(new DialogJDBCDAOImpl());
    }
}
