package com.br.kodamalabs.jamerp.services.serviceImpl;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.kodamalabs.jamerp.domain.Estudio;
import com.br.kodamalabs.jamerp.integration.repository.EstudioRepository;
import com.br.kodamalabs.jamerp.services.service.EstudioService;

@Service
public class EstudioServiceImpl implements EstudioService {

    @Autowired
    EstudioRepository estudioRepository;

    @Override
    public void save(Estudio estudio) {
        estudioRepository.save(estudio);
    }

    @Override
    public void remove(String id) {
        estudioRepository.delete(new ObjectId(id));
    }

    @Override
    public List<Estudio> findAll() {
        return estudioRepository.findAll();
    }

    @Override
    public Estudio findById(String id) {
        return estudioRepository.findById(id);
    }

}
