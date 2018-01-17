package org.mycompany.managers;

import org.apache.commons.lang.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.mycompany.dao.UserDAO;
import org.mycompany.entities.User;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;

/**
 * @author Alex Ramanovich
 */
@RunWith(MockitoJUnitRunner.class)
public class UserManagerImplTest {
    @InjectMocks
    private UserManagerImpl manager;
    @Mock
    private UserDAO userDAO;

    @Test
    public void testSave() {
        // setup
        User user = new User();
        user.setEmail("my-email@gja.com");
        doReturn(true).when(userDAO).save(user);

        // execution
        boolean actual = manager.save(user);
        String s = "sdkfj";
        UnaryOperator<String> f = s::concat;

        // verifying
        verify(userDAO).save(eq(user));

        // assertion
        assertTrue(actual);

    }


}