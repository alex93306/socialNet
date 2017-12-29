package org.mycompany.dao;

import org.junit.BeforeClass;
import org.junit.Test;
import org.mycompany.entities.User;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

/**
 * Created by alex.ramanovich on 01.10.2017.
 */
public class UserDAOImplTest {

    private static UserDAO userDAO;

    @BeforeClass
    public static void before() {
        userDAO = new UserDAOImpl(User.class);
    }

    @Test
    public void testSaveAndGet() {
        User savedUser = new User();
        savedUser.setUsername("alex");

        Long userId = userDAO.save(savedUser);

        User userFromDB = userDAO.get(userId);
        assertEquals(savedUser, userFromDB);
    }
}