package com.carwash.discoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer //to notify the server
@EnableConfigurationProperties // to share the properties
public class CarWashServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarWashServerApplication.class, args);
	}

}
