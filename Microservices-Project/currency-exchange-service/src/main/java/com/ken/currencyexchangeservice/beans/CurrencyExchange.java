package com.ken.currencyexchangeservice.beans;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.math.BigDecimal;

@Entity
public class CurrencyExchange {
     @Id
     private int id;
     @Column(name="currency_from")
     private String from;
    @Column(name="currency_to")
     private String to;

     @Column(name="conv_mul")
     private int conversionMultiple;

    @Column(name="env")
    private int env;

    public CurrencyExchange() {
    }

    public CurrencyExchange(int id, String from, String to, int conversionMultiple, int env) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionMultiple = conversionMultiple;
        this.env = env;
    }

    public int getId() {
        return id;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public int getConversionMultiple() {
        return conversionMultiple;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public void setConversionMultiple(int conversionMultiple) {
        this.conversionMultiple = conversionMultiple;
    }

    public int getEnv() {
        return env;
    }

    public void setEnv(int env) {
        this.env = env;
    }
}
