package org.mycompany.managers;

import org.mycompany.dao.DAO;
import org.mycompany.dao.DialogDAO;
import org.mycompany.dtos.UserDialogsDTO;
import org.mycompany.entities.Dialog;

import java.util.List;

public class DialogManagerImpl extends AbstractManager<DialogDAO, Dialog> implements DialogManager {
    public DialogManagerImpl(DialogDAO dao) {
        super(dao);
    }

    @Override
    public List<UserDialogsDTO> getDialogsByUser(Long userID) {
        return dao.getDialogsByUser(userID);
    }
}
