package com.br.kodamalabs.serviceImpl;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.kodamalabs.domain.Produtos;
import com.br.kodamalabs.repository.ProdutosRepository;
import com.br.kodamalabs.service.ProdutosService;

@Service
public class ProdutosServiceImpl implements ProdutosService {

    @Autowired
    ProdutosRepository produtosRepository;

    @Override
    public void save(Produtos produto) {
        produtosRepository.save(produto);
    }

    @Override
    public void remove(String id) {
        produtosRepository.delete(new ObjectId(id));
    }

    @Override
    public List<Produtos> findAll() {
        return produtosRepository.findAll();
    }

    @Override
    public Produtos findById(String id) {
        return produtosRepository.findById(id);
    }

}
