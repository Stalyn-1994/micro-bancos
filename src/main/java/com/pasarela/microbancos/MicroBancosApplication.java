package com.pasarela.microbancos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroBancosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroBancosApplication.class, args);
	}

}
