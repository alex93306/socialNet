package org.mycompany.dao.jdbc;

import org.mycompany.dao.UserDAO;
import org.mycompany.entities.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserJDBCDAOImpl implements UserDAO {


    @Override
    public boolean save(User user) {
        Connection connection = null;
        boolean result = false;
        try {
            connection = ConnectionFactory.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO AppUser(email, password, firstName, lastName) VALUES (?, ?, ?, ?)");
            preparedStatement.setString(1, user.getEmail());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.setString(3, user.getFirstName());
            preparedStatement.setString(4, user.getLastName());
            result = preparedStatement.execute();
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
    public User find(Long id) {
        Connection connection = null;
        User user = null;
        try {
            connection = ConnectionFactory.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("select * from AppUser WHERE id = ?");
            preparedStatement.setLong(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            user = null;
            while (resultSet.next()) {
                user = new User();
                long userID = resultSet.getLong("id");
                String email = resultSet.getString("email");
                user.setId(userID);
                user.setEmail(email);
                user.setFirstName(resultSet.getString("firstName"));
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
        return user;
    }

    @Override
    public void remove(Long id) {

    }
}
