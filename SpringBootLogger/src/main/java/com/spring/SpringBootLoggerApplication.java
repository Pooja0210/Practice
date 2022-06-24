package com.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootLoggerApplication {
	
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringBootLoggerApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(SpringBootLoggerApplication.class, args);
		
		LOGGER.error("Message logged at Error Level");
		LOGGER.warn("Message logged at Warn Level");
		LOGGER.info("Message logged at Info Level");
		LOGGER.debug("Message logged at Debug Level");
	}

	@RequestMapping("/")
	public String welcome() {
		return "Hello World!!";
	}

}
