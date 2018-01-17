package org.mycompany;

import org.mycompany.dao.DialogDAO;
import org.mycompany.dao.jdbc.DialogJDBCDAOImpl;
import org.mycompany.entities.Dialog;
import org.mycompany.factories.DialogManagerFactory;
import org.mycompany.managers.DialogManager;

public class App {
    public static void main(String[] args) {
        DialogDAO dao = new DialogJDBCDAOImpl();
        Dialog d = new Dialog();
        dao.save(d);
    }
}
