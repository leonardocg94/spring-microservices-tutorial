package com.minutes.microservices.currencyconversionservice.conversion;

public class CurrencyConversionResponse {
  private String from;
  private String to;
  private Double conversionMultiple;
  private Double quantity;
  private Double totalConversionAmount;
  private String enviroment;

  public CurrencyConversionResponse() {}

  public CurrencyConversionResponse(String from, String to, Double conversionMultiple, Double quantity,
      Double totalConversionAmount, String enviroment) {
    this.from = from;
    this.to = to;
    this.conversionMultiple = conversionMultiple;
    this.quantity = quantity;
    this.totalConversionAmount = totalConversionAmount;
    this.enviroment = enviroment;
  }

  public void calculateConversion() {
    this.totalConversionAmount = this.quantity * this.conversionMultiple;
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

  public Double getQuantity() {
    return quantity;
  }

  public void setQuantity(Double quantity) {
    this.quantity = quantity;
  }

  public Double getTotalConversionAmount() {
    return totalConversionAmount;
  }

  public void setTotalConversionAmount(Double totalConversionAmount) {
    this.totalConversionAmount = totalConversionAmount;
  }

  public String getEnviroment() {
    return enviroment;
  }

  public void setEnviroment(String enviroment) {
    this.enviroment = enviroment;
  }

  @Override
  public String toString() {
    return "CurrencyConversionResponse [from=" + from + ", to=" + to + ", conversionMultiple=" + conversionMultiple + ", quantity="
        + quantity + ", totalConversionAmount=" + totalConversionAmount + ", enviroment=" + enviroment + "]";
  }

  

}
