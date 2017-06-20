package com.br.kodamalabs.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.br.kodamalabs.domain.Funcionario;

@Repository
public interface FuncionarioRepository extends MongoRepository<Funcionario, ObjectId> {

    @Query(value = "{'_id': ?0}")
    Funcionario findById(String id);

}
