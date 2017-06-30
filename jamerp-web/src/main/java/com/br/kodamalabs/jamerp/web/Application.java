package com.br.kodamalabs.jamerp.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.br.kodamalabs.jamerp.web.controller.AgendamentoController;
import com.br.kodamalabs.jamerp.web.controller.EstudioController;
import com.br.kodamalabs.jamerp.web.controller.FuncionarioController;
import com.br.kodamalabs.jamerp.web.controller.ProdutosController;
import com.br.kodamalabs.jamerp.web.controller.Teste;

@SpringBootApplication(scanBasePackages = { "com.br.kodamalabs.jamerp"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
