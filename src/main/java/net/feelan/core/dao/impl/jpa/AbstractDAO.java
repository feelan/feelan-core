package net.feelan.core.dao.impl.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import net.feelan.core.entity.IEntity;



public abstract class AbstractDAO<T extends IEntity> extends GenericDAO<T> {
    @PersistenceContext
    protected EntityManager entityManager;

    @Override
    protected EntityManager getEntityManager() {
        return entityManager;
    }
}
