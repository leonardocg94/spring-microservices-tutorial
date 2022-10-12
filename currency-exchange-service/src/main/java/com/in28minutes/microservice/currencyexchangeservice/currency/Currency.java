package com.in28minutes.microservice.currencyexchangeservice.currency;

public class Currency {
  private String identifier;
  private Double value;

  public Currency(String identifier, Double value) {
    this.identifier = identifier;
    this.value = value;
  }

  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public Double getValue() {
    return value;
  }

  public void setValue(Double value) {
    this.value = value;
  }

}
