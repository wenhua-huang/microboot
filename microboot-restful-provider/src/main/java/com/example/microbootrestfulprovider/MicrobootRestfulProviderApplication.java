package com.example.microbootrestfulprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@SpringBootApplication(scanBasePackages="com.example.microbootrestfulprovider")
@EnableTransactionManagement
public class MicrobootRestfulProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicrobootRestfulProviderApplication.class, args);
	}

}
