package com.br.kodamalabs.controller;

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

import com.br.kodamalabs.domain.Agendamento;
import com.br.kodamalabs.service.AgendamentoService;

@RestController
@RequestMapping("/agendamento")
public class AgendamentoController extends BaseController<Agendamento> {

    @Autowired
    private AgendamentoService agendamentoService;

    @RequestMapping(method = POST)
    @ResponseStatus(CREATED)
    @Override
    public void create(@RequestBody Agendamento agendamento) {
        agendamentoService.save(agendamento);
    }

    @RequestMapping(method = PATCH)
    @ResponseStatus(NO_CONTENT)
    @Override
    public void update(@RequestBody Agendamento agendamento) {
        agendamentoService.save(agendamento);

    }

    @RequestMapping(value = "/{id}", method = DELETE)
    @ResponseStatus(OK)
    @Override
    public void remove(@PathVariable String id) {
        agendamentoService.remove(id);

    }

    @RequestMapping(value = "/{id}", method = GET)
    @ResponseBody
    @Override
    public ResponseEntity<Agendamento> findById(@PathVariable String id) {
        
        return new ResponseEntity<>(agendamentoService.findById(id),OK);
    }

    @RequestMapping(method = GET)
    @ResponseBody
    @Override
    public ResponseEntity<List<Agendamento>> findAll() {
        
        return new ResponseEntity<>(agendamentoService.findAll(),OK);
    }

}
