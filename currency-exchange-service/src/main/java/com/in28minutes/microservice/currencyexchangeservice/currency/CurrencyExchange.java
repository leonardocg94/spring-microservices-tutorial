package com.in28minutes.microservice.currencyexchangeservice.currency;

import java.util.List;

public class CurrencyExchange {
  private String identifier;
  private List<Currency> values;

  public CurrencyExchange(String identifier, List<Currency> values) {
    this.identifier = identifier;
    this.values = values;
  }

  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public List<Currency> getValues() {
    return values;
  }

  public void setValues(List<Currency> values) {
    this.values = values;
  }

}
