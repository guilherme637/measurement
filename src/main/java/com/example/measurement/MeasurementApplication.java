package com.example.measurement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties
@SpringBootApplication
public class MeasurementApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeasurementApplication.class, args);
	}

}
