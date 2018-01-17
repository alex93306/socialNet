package org.mycompany.dao;

import org.mycompany.dtos.UserDialogsDTO;
import org.mycompany.entities.Dialog;

import java.util.List;

public interface DialogDAO extends DAO<Dialog> {
    List<UserDialogsDTO> getDialogsByUser(Long userID);
}
