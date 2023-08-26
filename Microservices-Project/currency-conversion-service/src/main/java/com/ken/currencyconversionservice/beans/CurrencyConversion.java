package com.ken.currencyconversionservice.beans;

public class CurrencyConversion {

    private int id;

    private String from;

    private String to;


    private int conversionMultiple;

    private int quantity;

    private int totalCalculatedAmount;
    private String env;

    public CurrencyConversion() {
    }

    public CurrencyConversion(int id, String from, String to, int conversionMultiple, int quantity, int totalCalculatedAmount, String env) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionMultiple = conversionMultiple;
        this.quantity = quantity;
        this.totalCalculatedAmount = totalCalculatedAmount;
        this.env = env;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public int getConversionMultiple() {
        return conversionMultiple;
    }

    public void setConversionMultiple(int conversionMultiple) {
        this.conversionMultiple = conversionMultiple;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getTotalCalculatedAmount() {
        return totalCalculatedAmount;
    }

    public void setTotalCalculatedAmount(int totalCalculatedAmount) {
        this.totalCalculatedAmount = totalCalculatedAmount;
    }

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }
}
