package org.mycompany.dao.jdbc;

import org.mycompany.dao.DAO;
import org.mycompany.entities.AbstractEntity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AbstractJDBCDao<T extends AbstractEntity> implements DAO<T> {

    @Override
    public boolean save(T t) {
        return false;
    }

    @Override
    public T find(Long id) {
//        Connection connection = ConnectionFactory.getConnection();
//        PreparedStatement preparedStatement = connection.prepareStatement("select * from AppUser");
//        ResultSet resultSet = preparedStatement.executeQuery();
//        while (resultSet.next())
//        {
//            long userID = resultSet.getLong(0);
//            System.out.println(userID);
//
//        }
        return null;
    }

    @Override
    public void remove(Long id) {

    }
}
