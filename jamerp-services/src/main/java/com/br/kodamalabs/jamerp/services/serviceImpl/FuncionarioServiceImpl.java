package com.br.kodamalabs.jamerp.services.serviceImpl;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.kodamalabs.jamerp.domain.Funcionario;
import com.br.kodamalabs.jamerp.integration.repository.FuncionarioRepository;
import com.br.kodamalabs.jamerp.services.service.FuncionarioService;

@Service
public class FuncionarioServiceImpl implements FuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @Override
    public void save(Funcionario funcionario) {
        funcionarioRepository.save(funcionario);

    }

    @Override
    public void remove(String id) {
        funcionarioRepository.delete(new ObjectId(id));

    }

    @Override
    public List<Funcionario> findAll() {

        return funcionarioRepository.findAll();
    }

    @Override
    public Funcionario findById(String id) {

        return funcionarioRepository.findById(id);
    }

}
