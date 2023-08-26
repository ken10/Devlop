package com.ken.currencyconversionservice.beans.proxy;

import com.ken.currencyconversionservice.beans.CurrencyConversion;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Optional;

@FeignClient(name="currency-exchange-service", url="localhost:8000")
//@FeignClient(name="currency-exchange-service")
public interface CurrencyExchangeProxy {

    @GetMapping("/currencyExchange/{from}/to/{to}")
    CurrencyConversion retrieveCurrExc(@PathVariable String from, @PathVariable String to);



}
