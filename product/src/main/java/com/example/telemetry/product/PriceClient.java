package com.example.telemetry.product;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.example.telemetry.price.Price;

@Repository
public class PriceClient {
    private static final Logger LOGGER = LoggerFactory.getLogger(PriceClient.class);
        
    RestTemplate restTemplate = new RestTemplate();


    public Price getPrice(int productId) {
        LOGGER.info("Fetching Price Details With Product Id {}", productId);
        String baseUrl = "http://host.docker.internal:8081";
        String url = String.format("%s/price/%d", baseUrl, productId);
        ResponseEntity<Price> price = restTemplate.getForEntity(url, Price.class);
        return price.getBody();
    }

}
