package org.mycompany.managers;

import org.mycompany.dao.DAO;
import org.mycompany.entities.Dialog;

public class DialogManagerImpl extends AbstractManager<Dialog> implements DialogManager {
    public DialogManagerImpl(DAO<Dialog> dao) {
        super(dao);
    }
}
