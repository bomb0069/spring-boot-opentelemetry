package com.example.telemetry.product;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.example.telemetry.price.Price;

@Repository
public class MessageClient {
    private static final Logger LOGGER = LoggerFactory.getLogger(MessageClient.class);
        
    RestTemplate restTemplate = new RestTemplate();


    public String sendMessage(int productId) {
        LOGGER.info("Sending Product Id to SendMessage Service");
        String baseUrl = "http://host.docker.internal:5000";
        String url = String.format("%s/message/send", baseUrl);
        ResponseEntity<String> price = restTemplate.getForEntity(url, String.class);
        return price.getBody();
    }

}
