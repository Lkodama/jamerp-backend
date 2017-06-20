package com.br.kodamalabs.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.br.kodamalabs.controller.AgendamentoController;
import com.br.kodamalabs.controller.EstudioController;
import com.br.kodamalabs.controller.FuncionarioController;
import com.br.kodamalabs.controller.ProdutosController;
import com.br.kodamalabs.controller.Teste;

@SpringBootApplication(scanBasePackages = { "com.br.kodamalabs"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
