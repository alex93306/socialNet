package org.mycompany.dao.jdbc;

import org.apache.commons.dbcp.BasicDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionFactory {
    private static final DataSource dataSource = getDataSource();
    private ConnectionFactory connectionFactory = new ConnectionFactory();

    private static DataSource getDataSource(){
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        dataSource.setUrl("jdbc:sqlserver://localhost;database=test");//todo: rename db
        dataSource.setUsername("sa");
        dataSource.setPassword("0000");
        return dataSource;
    }
    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }

}
