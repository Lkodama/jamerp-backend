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

import com.br.kodamalabs.jamerp.domain.Funcionario;
import com.br.kodamalabs.jamerp.services.service.FuncionarioService;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController extends BaseController<Funcionario> {

    @Autowired
    private FuncionarioService funcionarioService;

    @RequestMapping(method = { POST })
    @ResponseStatus(CREATED)
    @Override
    public void create(@RequestBody Funcionario funcionario) {

        funcionarioService.save(funcionario);
    }

    @RequestMapping(method = { PATCH })
    @ResponseStatus(NO_CONTENT)
    @Override
    public void update(@RequestBody Funcionario funcionario) {

        funcionarioService.save(funcionario);
    }

    @RequestMapping(value = "/{id}", method = { DELETE })
    @ResponseStatus(OK)
    @Override
    public void remove(@PathVariable String id) {

        funcionarioService.remove(id);
    }

    @RequestMapping(value = "/{id}", method = { GET })
    @ResponseBody
    @Override
    public ResponseEntity<Funcionario> findById(@PathVariable String id) {

        return new ResponseEntity<>(funcionarioService.findById(id), OK);
    }

    @RequestMapping(method = { GET })
    @ResponseBody
    @Override
    public ResponseEntity<List<Funcionario>> findAll() {

        return new ResponseEntity<>(funcionarioService.findAll(), OK);
    }

}
