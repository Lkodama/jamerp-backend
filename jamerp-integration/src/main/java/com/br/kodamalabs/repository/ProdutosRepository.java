package com.br.kodamalabs.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.br.kodamalabs.domain.Produtos;

@Repository
public interface ProdutosRepository extends MongoRepository<Produtos, ObjectId> {

    @Query(value = "{'_id': ?0}")
    Produtos findById(String id);
}
