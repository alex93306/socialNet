package org.mycompany.managers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.mycompany.dao.UserDAO;
import org.mycompany.entities.User;

import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;

/**
 * @author Alex Ramanovich
 */
@RunWith(MockitoJUnitRunner.class)
public class UserManagerImplTest {
    @InjectMocks
    private UserManagerImpl appUserManager;
    @Mock
    private UserDAO userDAO;

    @Test
    public void testSave() {
        // setup
        User user = new User();
        Long expectedUserID = new Random().nextLong();
        doReturn(expectedUserID).when(userDAO).save(user);

        // execution
        Long actualUserID = appUserManager.save(user);

        // verifying
        verify(userDAO).save(eq(user));

        // assertion
        assertEquals(expectedUserID, actualUserID);

    }

}