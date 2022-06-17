package com.transaction.salesforce.Services;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component ;

import com.transaction.salesforce.Repository.TransactionRepository;
import com.transaction.salesforce.Model.*;

@Component
public class TransactionService {

	@Autowired
	TransactionRepository repository;
	
	private static final String defaultStatus = "SCHEDULED";

	public int doTransfer(String userID, String fromAccount, String toAccount, String description, BigDecimal amount) {
		String sfid = "TR" + System.currentTimeMillis();
		String externalid = "SA" + System.currentTimeMillis();

		Timestamp currentDateTime = new Timestamp(System.currentTimeMillis());

		Transaction transaction = new Transaction();
        transaction.setExternalid(externalid);
		transaction.setSfid(sfid);
		transaction.setUserID(userID);
		transaction.setFromAccount(fromAccount);
		transaction.setToAccount(toAccount);
		transaction.setDate(currentDateTime);
		transaction.setDecription(description);
		transaction.setAmount(amount);
		transaction.setStatus(defaultStatus);

		if (repository.save(transaction) != null) {
			return 1;
		} else {
			return 0;
		}
	}
	
	public List<Transaction> getTransactions(String userID , Timestamp startDate,
			Timestamp endDate, String status) {
		return repository.getTransactions(userID, startDate, endDate, status);
	}
	
	
	
	
}
