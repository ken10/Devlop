package com.ken.currencyconversionservice.controller;

import com.ken.currencyconversionservice.beans.CurrencyConversion;
import com.ken.currencyconversionservice.beans.proxy.CurrencyExchangeProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

@RestController
public class CurrencyConversionService  {

    @Autowired
    private CurrencyExchangeProxy currExcPxy;

    @GetMapping("/currencyConversion/{from}/to/{to}/{quantity}")
    CurrencyConversion calculateCurrencyConversion(@PathVariable String from, @PathVariable String to, @PathVariable String quantity){

        HashMap<String, String> params = new HashMap<>();
        params.put("from", from);
        params.put("to", to);

        ResponseEntity<CurrencyConversion> resEnt = new RestTemplate().getForEntity("http://localhost:8000/currencyExchange/{from}/to/{to}",
                                                    CurrencyConversion.class, params);
        CurrencyConversion cc =   resEnt.getBody();
        // CurrencyConversion cc = new CurrencyConversion();
        return new CurrencyConversion(cc.getId(),cc.getFrom(),cc.getTo(),
                    cc.getConversionMultiple(), Integer.parseInt(quantity),
                cc.getConversionMultiple()*Integer.parseInt(quantity), cc.getEnv());


    }

    @GetMapping("/currencyConversionFeign/{from}/to/{to}/{quantity}")
    CurrencyConversion calculateCurrencyConversionUsingFeign(@PathVariable String from, @PathVariable String to, @PathVariable String quantity){


        CurrencyConversion cc =   currExcPxy.retrieveCurrExc(from,to);

        return new CurrencyConversion(cc.getId(),cc.getFrom(),cc.getTo(),
                cc.getConversionMultiple(), Integer.parseInt(quantity),
                cc.getConversionMultiple()*Integer.parseInt(quantity), cc.getEnv());


    }

}
