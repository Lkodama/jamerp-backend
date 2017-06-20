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

import com.br.kodamalabs.domain.Estudio;
import com.br.kodamalabs.service.EstudioService;

@RestController
@RequestMapping("/estudio")
public class EstudioController extends BaseController<Estudio> {

    @Autowired
    private EstudioService estudioService;

    @ResponseStatus(CREATED)
    @RequestMapping(method = { POST })
    @Override
    public void create(@RequestBody Estudio estudio) {
        estudioService.save(estudio);

    }

    @ResponseStatus(NO_CONTENT)
    @RequestMapping(method = { PATCH })
    @Override
    public void update(@RequestBody Estudio estudio) {
        estudioService.save(estudio);

    }

    @ResponseStatus(OK)
    @RequestMapping(value = "/{id}", method = { DELETE })
    @Override
    public void remove(@PathVariable String id) {
        estudioService.remove(id);

    }

    @ResponseBody
    @RequestMapping(value = "/{id}", method = { GET })
    @Override
    public ResponseEntity<Estudio> findById(@PathVariable String id) {

        return new ResponseEntity<Estudio>(estudioService.findById(id), OK);
    }

    @ResponseBody
    @RequestMapping(method = { GET })
    @Override
    public ResponseEntity<List<Estudio>> findAll() {

        return new ResponseEntity<List<Estudio>>(estudioService.findAll(), OK);
    }

}
