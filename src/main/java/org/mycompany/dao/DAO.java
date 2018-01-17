package org.mycompany.dao;

import org.mycompany.entities.AbstractEntity;

import java.sql.SQLException;

/**
 * Created by alex.ramanovich on 30.09.2017.
 */
public interface DAO<T extends AbstractEntity> {
    boolean save(T t);
    T find(Long id);
    void remove(Long id);
}
