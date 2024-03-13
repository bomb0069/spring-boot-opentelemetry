package com.example.telemetry;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import com.example.telemetry.price.PriceRepository;
import com.example.telemetry.price.Price;

@SpringBootApplication
public class TelemetryApplication {

	public static void main(String[] args) {
		SpringApplication.run(TelemetryApplication.class, args);
	}

	@Bean
  	public CommandLineRunner demo(PriceRepository repository) {
    	return (args) -> {
      		repository.save( new Price(1, 50.0, 1.0));
      		repository.save(new Price(2, 150.0, 5.0));
      		repository.save(new Price(3, 200.0, 10.0));
		};
	}
}
