package org.mycompany.dao;

import org.mycompany.entities.AbstractEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

/**
 * @author Alex Ramanovich
 */
public abstract class AbstractDAO<T extends AbstractEntity> implements DAO<T> {

    private Class<T> type;

    public AbstractDAO(Class<T> type) {
        this.type = type;
    }

    @PersistenceUnit
    private EntityManagerFactory entityManagerFactory;

    @Override
    public boolean save(T t) {
        return false;
    }

    @Override
    public T find(Long id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            return entityManager.find(type, id);
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
    }

    @Override
    public void remove(Long id) {

    }

    public EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }

    public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }
}
