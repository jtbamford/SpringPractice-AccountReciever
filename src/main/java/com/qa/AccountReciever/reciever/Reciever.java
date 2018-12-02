package com.qa.AccountReciever.reciever;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.qa.AccountReciever.service.POJOAccountService;
import com.qa.AccountSystem.domain.POJOAccount;

@Component
@CrossOrigin
public class Reciever {
	
	@Autowired
	private POJOAccountService service;
	
	@JmsListener(destination = "accountQueue", containerFactory = "myFactory")
	public POJOAccount receiveMessage(String account) {
		return service.addToDb(account);
	}

}
