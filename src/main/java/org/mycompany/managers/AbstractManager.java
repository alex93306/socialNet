package org.mycompany.managers;

import org.mycompany.dao.AbstractDAO;
import org.mycompany.dao.DAO;
import org.mycompany.entities.AbstractEntity;

public abstract class AbstractManager<V extends DAO<T>, T extends AbstractEntity> implements Manager<T> {
    protected V dao;

    public AbstractManager(V dao) {
        this.dao = dao;
    }

    @Override
    public boolean save(T t) {
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
