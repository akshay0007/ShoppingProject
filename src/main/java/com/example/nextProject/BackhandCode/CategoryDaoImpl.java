package com.example.nextProject.BackhandCode;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by ubuntu on 19/12/17.
 */
@Repository("categoryDAO")
@Transactional
public class CategoryDaoImpl implements CategoryDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public Category get(int id) {
        return null;
    }

    @Override
    public List<Category> list() {
        String queryName = "FROM Category WHERE active=:active";
        Query query = sessionFactory.getCurrentSession().createQuery(queryName);
        query.setParameter("active", true);
        return query.getResultList();
    }

    @Override
    public boolean add(Category category) {
        return false;
    }

    @Override
    public boolean update(Category category) {
        return false;
    }

    @Override
    public boolean delete(Category category) {
        return false;
    }
}
