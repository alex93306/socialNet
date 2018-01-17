package org.mycompany.managers;

import org.mycompany.entities.AbstractEntity;

import java.util.List;

public interface Manager<T extends AbstractEntity> {
    boolean save(T t);
    T find(Long id);
    void remove(Long id);
}
