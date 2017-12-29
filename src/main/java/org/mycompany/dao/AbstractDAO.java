package org.mycompany.dao;

import org.mycompany.entities.AbstractEntity;

/**
 * @author Alex Ramanovich
 */
public abstract class AbstractDAO<T extends AbstractEntity> implements DAO<T> {

    @Override
    public T save(T t) {
        return null;
    }

    @Override
    public T find(Long id) {
        return null;
    }

    @Override
    public void remove(Long id) {

    }
}
