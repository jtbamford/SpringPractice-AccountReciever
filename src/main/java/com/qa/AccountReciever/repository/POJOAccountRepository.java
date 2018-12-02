package com.qa.AccountReciever.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.qa.AccountSystem.domain.POJOAccount;

@Repository
public interface POJOAccountRepository extends MongoRepository<POJOAccount,String> {

}
