package com.br.kodamalabs.serviceImpl;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.kodamalabs.domain.Agendamento;
import com.br.kodamalabs.repository.AgendamentoRepository;
import com.br.kodamalabs.service.AgendamentoService;

@Service
public class AgendamentoServiceImpl implements AgendamentoService {

    @Autowired
    private AgendamentoRepository agendamentoRepository;
    
    @Override
    public void save(Agendamento agendamento) {
        agendamentoRepository.save(agendamento);
        
    }

    @Override
    public void remove(String id) {
        agendamentoRepository.delete(new ObjectId(id));
        
    }

    @Override
    public List<Agendamento> findAll() {
        
        return agendamentoRepository.findAll();
    }

    @Override
    public Agendamento findById(String id) {
        
        return agendamentoRepository.findById(id);
    }

}
