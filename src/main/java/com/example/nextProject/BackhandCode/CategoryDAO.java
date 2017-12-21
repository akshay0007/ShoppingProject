package com.example.nextProject.BackhandCode;

import java.util.List;


public interface CategoryDAO {


    Category get(int id);

    List<Category> list();

    boolean add(Category category);

    boolean update(Category category);

    boolean delete(Category category);


}