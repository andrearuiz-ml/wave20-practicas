package com.bootcamp.java.w20.be_java_hisp_w20_g05.repository;

import com.bootcamp.java.w20.be_java_hisp_w20_g05.model.User;

import java.util.List;
import java.util.Set;

public interface IRepository<T> {
    boolean contains(T t);
    boolean add(T t);
    Set<T> filterBy(String name);

    public Set<T> getAll();
    T getById(int id);

}
