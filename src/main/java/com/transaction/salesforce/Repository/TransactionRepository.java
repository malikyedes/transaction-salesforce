package com.transaction.salesforce.Repository;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.transaction.salesforce.Model.*;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, String> {

	@Query("SELECT t FROM Transaction t WHERE t.userID=?1  AND t.date BETWEEN ?2 AND ?3 AND status=?4")
	public List<Transaction> getTransactions(String userID , Timestamp startDate,
			Timestamp endDate, String status);
	
	/*@Query("SELECT t FROM Transaction t WHERE t.User_Id__c=?1  AND t.date__c BETWEEN ?2 AND ?3 AND Status__c=?4")
	public List<Transaction> getTransactions(String userID , Timestamp startDate,
			Timestamp endDate, String status);*/

}
