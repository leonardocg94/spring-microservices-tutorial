package com.in28minutes.microservice.currencyexchangeservice.currency;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Currency {

  @Id
  @GeneratedValue
  private Integer id;
  private String identifier;
  @Column(name = "converted")
  private Double value;
  @ManyToOne
  private CurrencyExchange exchange;

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
