package com.example.apigateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class APIConfiguration {

    @Bean
    RouteLocator getRoutLocator(RouteLocatorBuilder builder)
    {

        // Need to do routing and logging as given in step 160 and 161
        return builder.routes().build();

    }




}
