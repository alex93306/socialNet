package org.mycompany.managers;

import org.mycompany.dtos.UserDialogsDTO;
import org.mycompany.entities.Dialog;

import java.util.List;

public interface DialogManager extends Manager<Dialog> {
    List<UserDialogsDTO> getDialogsByUser(Long userID);
}
