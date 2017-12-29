package org.mycompany.dao;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.mycompany.entities.AbstractEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by alex.ramanovich on 30.09.2017.
 */
@RunWith(MockitoJUnitRunner.class)
public class DAOImplTest {
    @InjectMocks
    private AbstractDAO<AbstractEntity> baseDao;

    @Mock
    private EntityManagerFactory emf;
    @Mock
    private EntityManager entityManager;

    @Before
    public void before() {
        doReturn(entityManager).when(emf).createEntityManager();
    }

    @Test
    public void testSave() {
        // setup
        AbstractEntity entity = new AbstractEntity();

        // execution
        Long actualID = baseDao.save(entity);

        // verifying
        verify(emf).createEntityManager();
        verify(entityManager).persist(eq(entity));

        // assertion

    }

    @Test
    public void testGet() {
        Long id = 1L;
        Object expected = "expected string";
        when(entityManager.find(Object.class, id)).thenReturn(expected);

        Object actual = baseDao.get(id);
        assertEquals(expected, actual);

        verify(emf).createEntityManager();
        verify(entityManager).find(Object.class, id);
    }
}