package com.example.nextProject.BackhandCode;

import java.util.List;

/**
 * Created by ubuntu on 19/12/17.
 */
public class ProductDaoImpl implements ProductDAO{
    @Override
    public Product get(int productId) {
        return null;
    }

    @Override
    public List<Product> list() {
        return null;
    }

    @Override
    public boolean add(Product product) {
        return false;
    }

    @Override
    public boolean update(Product product) {
        return false;
    }

    @Override
    public boolean delete(Product product) {
        return false;
    }

    @Override
    public List<Product> getProductsByParam(String param, int count) {
        return null;
    }

    @Override
    public List<Product> listActiveProducts() {
        return null;
    }

    @Override
    public List<Product> listActiveProductsByCategory(int categoryId) {
        return null;
    }

    @Override
    public List<Product> getLatestActiveProducts(int count) {
        return null;
    }
}
