package com.example.telemetry;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import com.example.telemetry.product.ProductRepository;
import com.example.telemetry.product.Product;

@SpringBootApplication
public class TelemetryApplication {

	public static void main(String[] args) {
		SpringApplication.run(TelemetryApplication.class, args);
	}
	@Bean
  	public CommandLineRunner demo(ProductRepository repository) {
    	return (args) -> {
      		repository.save(new Product(1, "Lay Classic"));
      		repository.save(new Product(2, "Pepo Cup"));
      		repository.save(new Product(3, "Pepsi Litre"));
      		repository.save(new Product(4, "Original Product without Price"));
		};
	}
}
