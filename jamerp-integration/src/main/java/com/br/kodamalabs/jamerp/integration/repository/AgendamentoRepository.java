package com.br.kodamalabs.jamerp.integration.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.br.kodamalabs.jamerp.domain.Agendamento;

@Repository
public interface AgendamentoRepository extends MongoRepository<Agendamento, ObjectId>{

    @Query(value = "{'_id': ?0}")
    Agendamento findById(String id);
}
