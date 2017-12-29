package org.mycompany.managers;

import org.mycompany.entities.AbstractEntity;

public interface Manager<T extends AbstractEntity> {
    T save(T t);
    T find(Long id);
    void remove(Long id);
}
