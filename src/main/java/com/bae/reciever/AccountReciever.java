package com.bae.reciever;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.bae.entity.AccountDTO;
import com.bae.persistence.MongoAccountRepo;

//import com.qa.account.accountapi.persistence.domain.SentAccount;
//import com.qa.account.accountapi.persistence.repository.MongoAccountRepo;

@Component
public class AccountReciever {


    @Autowired
    private MongoAccountRepo repo;

    @JmsListener(destination = "AccountQueue", containerFactory = "myFactory")
    public void receiveMessage(AccountDTO sentAccount) {
        repo.save(sentAccount);
    }
}
