package org.mycompany.conf;

import javax.sql.DataSource;

import org.mycompany.dao.UserDAO;
import org.mycompany.dao.UserDAOImpl;
import org.mycompany.entities.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

/**
 * Created by alex.ramanovich on 14.10.2017.
 */
@Configuration
@ComponentScan("org.org.mycompany.*")
public class AppConfig {

    @Bean
    public DataSource dataSource() {
        //todo: replace with pool and add properties file
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/postgres");
        dataSource.setUsername("postgres");
        dataSource.setPassword("0");

        return dataSource;
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean(DataSource dataSource) {
        LocalContainerEntityManagerFactoryBean entityManagerFactoryBean =
                new LocalContainerEntityManagerFactoryBean();
        entityManagerFactoryBean.setDataSource(dataSource);

        return entityManagerFactoryBean;
    }

    @Bean
    public UserDAO userDao() {
        UserDAOImpl userDao = new UserDAOImpl(User.class);
        return userDao;
    }
}
