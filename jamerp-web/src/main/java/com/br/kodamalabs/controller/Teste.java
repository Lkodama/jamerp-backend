package com.br.kodamalabs.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Teste {

    @RequestMapping(value = "/teste",method = {GET})
    public void teste(){
        System.out.println("HELLO");
    }
}
