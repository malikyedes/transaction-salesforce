package com.transaction.salesforce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing

public class TransactionSalesforceApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransactionSalesforceApiApplication.class, args);
	}

}
