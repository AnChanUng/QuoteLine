package com.quoteline.quote_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class QuoteServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuoteServerApplication.class, args);
	}

}