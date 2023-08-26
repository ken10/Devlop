package com.ken.currencyexchangeservice.controller;

import com.ken.currencyexchangeservice.beans.CurrencyExchange;
import com.ken.currencyexchangeservice.repository.CurrencyExchangeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class CurrencyExchangeService {


    @Autowired
    private Environment env;

    @Autowired
    private CurrencyExchangeRepo currExcRepo;
    @GetMapping("/currencyExchange/{from}/to/{to}")
    Optional<CurrencyExchange> retrieveCurrExc(@PathVariable String from, @PathVariable String to)
     {
         System.out.println("API : currencyExchange");

         int port = Integer.parseInt(env.getProperty("local.server.port"));

         Optional<CurrencyExchange> currExc = currExcRepo.findById(1003);

         CurrencyExchange currExc2 = currExcRepo.findByFromAndTo("USD", "INR");
        if(currExcRepo==null)
        {
            throw new RuntimeException();
        }
         currExc2.setEnv(port);
        return Optional.ofNullable(currExc2);       //new CurrencyExchange(12,"USD","INR",80 ,port);
     }


}
