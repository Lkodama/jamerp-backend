package com.br.kodamalabs.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.br.kodamalabs.domain.Estudio;

@Repository
public interface EstudioRepository extends MongoRepository<Estudio, ObjectId> {

    @Query(value = "{'_id': ?0}")
    Estudio findById(String id);
}
