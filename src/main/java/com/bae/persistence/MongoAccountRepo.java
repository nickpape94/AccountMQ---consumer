package com.bae.persistence;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bae.entity.AccountDTO;



@Repository
public interface MongoAccountRepo extends MongoRepository<AccountDTO, Long>{
}
