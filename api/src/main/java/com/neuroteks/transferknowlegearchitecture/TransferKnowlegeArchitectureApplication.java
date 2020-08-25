package com.neuroteks.transferknowlegearchitecture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
public class TransferKnowlegeArchitectureApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransferKnowlegeArchitectureApplication.class, args);
	}

}
