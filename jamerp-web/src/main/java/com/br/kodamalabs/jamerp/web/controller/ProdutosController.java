package com.br.kodamalabs.jamerp.web.controller;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.NO_CONTENT;
import static org.springframework.http.HttpStatus.OK;
import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.PATCH;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.br.kodamalabs.jamerp.domain.Produtos;
import com.br.kodamalabs.jamerp.services.service.ProdutosService;

@RestController
@RequestMapping("/produtos")
public class ProdutosController extends BaseController<Produtos> {

    @Autowired
    private ProdutosService produtosService;

    @ResponseStatus(CREATED)
    @RequestMapping(method = { POST })
    @Override
    public void create(@RequestBody Produtos produto) {
        produtosService.save(produto);
    }

    @ResponseStatus(NO_CONTENT)
    @RequestMapping(method = { PATCH })
    @Override
    public void update(@RequestBody Produtos produto) {
        produtosService.save(produto);
    }

    @ResponseStatus(OK)
    @RequestMapping(value = "/{id}", method = { DELETE })
    @Override
    public void remove(@PathVariable String id) {
        produtosService.remove(id);
    }

    @ResponseBody()
    @RequestMapping(value = "/{id}", method = { GET })
    @Override
    public ResponseEntity<Produtos> findById(@PathVariable String id) {

        return new ResponseEntity<>(produtosService.findById(id), OK);
    }

    @ResponseBody()
    @RequestMapping(method = { GET })
    @Override
    public ResponseEntity<List<Produtos>> findAll() {

        return new ResponseEntity<List<Produtos>>(produtosService.findAll(), OK);
    }

}
