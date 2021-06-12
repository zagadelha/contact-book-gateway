package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//	@Bean
//	public RouteLocator myRoutes(RouteLocatorBuilder builder) {
//		System.out.println("Entrei no GATEWAY!!");
//		return builder.routes().route(p -> p.path("/").uri("http://localhost:8765/cb-core/*")).build();
//	}

//	zull.routes.auth.service-id=cb-auth
//	zull.routes.auth.path=/cb-auth
//	zull.routes.config.service-id=cb-config
//	zull.routes.config.path=/cb-config/**
//	zull.routes.core.service-id=cb-core
//	zull.routes.core.path=/cb-core/**

}
