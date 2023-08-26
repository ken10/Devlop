package com.ken.currencyexchangeservice.repository;

import com.ken.currencyexchangeservice.beans.CurrencyExchange;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyExchangeRepo
        extends JpaRepository<CurrencyExchange, Integer> {

    CurrencyExchange findByFromAndTo(String from, String to);

}
