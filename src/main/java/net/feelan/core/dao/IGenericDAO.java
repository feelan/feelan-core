package net.feelan.core.dao;

import java.io.Serializable;
import java.util.List;

import net.feelan.core.common.Paginator;

/**
 * Data Access Object (DAO) interface.   
 * This is an interface used to tag our DAO classes and to provide common methods to all DAOs.
 *
 */
public interface IGenericDAO<T> {
    /**
    * Generic method used to get all objects of a particular type. This
    * is the same as lookup up all rows in a table.
    * @return List of populated objects
    */
    List<T> list();

    /**
     * Generic method used to get all objects of a particular type with pagination. This
     * is the same as lookup up all rows in a table.
     * @param paginator
     * @return List of populated objects
     */
    List<T> list(Paginator paginator);

    /**
     * Generic method to get an object based on identifier. 
     * An ObjectRetrievalFailureException Runtime Exception is thrown if 
     * nothing is found.
     * @param id The identifier (primary key) of the class
     * @return A populated object
     * @see org.springframework.orm.ObjectRetrievalFailureException
     */
    T load(Serializable id);

    /**
     * Generic method to insert an object
     * @param obj The object to insert
     * @return The new object's id
     */
    Serializable create(T obj);

    /**
     * Generic method to update an object
     * @param obj The object to update
     */
    void update(T obj);

    /**
     * Generic method to delete an object based on id
     * @param obj The object to delete
     */
    void delete(T obj);

}
