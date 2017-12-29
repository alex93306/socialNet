package org.mycompany.managers;

import org.mycompany.dao.DAO;
import org.mycompany.entities.AbstractEntity;

public abstract class AbstractManager<T extends AbstractEntity> implements Manager<T> {
    protected DAO<T> dao;

    public AbstractManager(DAO<T> dao) {
        this.dao = dao;
    }

    @Override
    public T save(T t) {
        return dao.save(t);
    }

    @Override
    public T find(Long id) {
        return dao.find(id);
    }

    @Override
    public void remove(Long id) {
        dao.remove(id);
    }
}
