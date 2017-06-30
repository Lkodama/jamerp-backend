package com.br.kodamalabs.jamerp.web.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;

public abstract class BaseController<T> {

    public abstract void create(T object);

    public abstract void update(T object);

    public abstract void remove(String id);

    public abstract ResponseEntity<T> findById(String id);

    public abstract ResponseEntity<List<T>> findAll();

}
