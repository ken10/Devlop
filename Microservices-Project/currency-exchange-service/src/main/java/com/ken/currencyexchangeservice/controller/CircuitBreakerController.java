package com.ken.currencyexchangeservice.controller;


import io.github.resilience4j.bulkhead.annotation.Bulkhead;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@RestController
public class CircuitBreakerController {


    private Logger logger = LoggerFactory.getLogger(CircuitBreakerController.class);

    @GetMapping("/sample-api")
    //@Retry(name = "sample-api", fallbackMethod = "hardcodedMethod")
    @CircuitBreaker(name = "default", fallbackMethod = "hardcodedMethod") //Section 6 step 165 repeat for more clarity
    @RateLimiter(name ="default")
    @Bulkhead(name ="default")
    public String SampleAPI() {

        logger.info("Sample API Covered");

        ResponseEntity<String> ent = new RestTemplate().getForEntity("http://localhost:8000/No-API", String.class);

        return ent.getBody();
    }

    public String hardcodedMethod(Exception exc) {

        return "hardcodedMethod";
    }
}
