package com.br.kodamalabs.service;

import java.util.List;

public interface BaseService<T> {
    
    void save(T object);
    
    void remove(String id);
    
    List<T> findAll();
    
    T findById(String id);

}
