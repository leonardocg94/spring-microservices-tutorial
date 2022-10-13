package com.in28minutes.microservice.currencyexchangeservice.currency;

public class CurrencyExchangeResponse {

  private String from;
  private String to;
  private Double conversionMultiple;
  private String enviroment;

  public CurrencyExchangeResponse() {
  }

  public CurrencyExchangeResponse(String from, String to, Double conversionMultiple, String enviroment) {
    this.from = from;
    this.to = to;
    this.conversionMultiple = conversionMultiple;
    this.enviroment = enviroment;
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

  public Double getConversionMultiple() {
    return conversionMultiple;
  }

  public void setConversionMultiple(Double conversionMultiple) {
    this.conversionMultiple = conversionMultiple;
  }

  public String getEnviroment() {
    return enviroment;
  }

  public void setEnviroment(String enviroment) {
    this.enviroment = enviroment;
  }

}
