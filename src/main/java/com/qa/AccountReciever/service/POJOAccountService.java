package com.qa.AccountReciever.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.AccountReciever.repository.POJOAccountRepository;
import com.qa.AccountSystem.domain.POJOAccount;

@Service
public class POJOAccountService {

	@Autowired
	private POJOAccountRepository repo;
	
	//@Autowired
	//private JSONUtil util;
	
	public POJOAccount addToDb(POJOAccount accountToAdd) {		
		//POJOAccount accountToAdd = new POJOAccount();
		//accountToAdd=util.fromJSON(account, POJOAccount.class);
		repo.insert(accountToAdd);
		return accountToAdd;
	}
	
}
