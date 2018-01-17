package org.mycompany.dao.jdbc;

import org.mycompany.dao.DialogDAO;
import org.mycompany.dtos.UserDialogsDTO;
import org.mycompany.entities.Dialog;

import java.sql.*;
import java.time.ZoneId;
import java.util.List;

public class DialogJDBCDAOImpl implements DialogDAO {
    @Override
    public List<UserDialogsDTO> getDialogsByUser(Long userID) {
//        Connection connection = null;
//        boolean result = false;
//        try {
//            connection = ConnectionFactory.getConnection();
//            PreparedStatement preparedStatement = connection.prepareStatement("SELECT ");
//            preparedStatement.setString(1, user.getEmail());
//            preparedStatement.setString(2, user.getPassword());
//            preparedStatement.setString(3, user.getFirstName());
//            preparedStatement.setString(4, user.getLastName());
//            result = preparedStatement.execute();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (connection != null) {
//                    connection.close();
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
        return null;
}

    @Override
    public boolean save(Dialog dialog) {
        Connection connection = null;
        boolean result = false;
        try {
            connection = ConnectionFactory.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "INSERT INTO Dialogs DEFAULT VALUES", PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.executeUpdate();
            ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
            while (generatedKeys.next()){
                generatedKeys.getObject(1);
//                dialog.setId(ID);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    @Override
    public Dialog find(Long id) {
        return null;
    }

    @Override
    public void remove(Long id) {

    }
}
