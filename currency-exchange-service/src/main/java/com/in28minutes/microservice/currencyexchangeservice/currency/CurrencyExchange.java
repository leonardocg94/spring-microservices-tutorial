package com.in28minutes.microservice.currencyexchangeservice.currency;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class CurrencyExchange {

  @Id
  @GeneratedValue
  private Integer id;
  private String identifier;
  @OneToMany(mappedBy = "exchange" , fetch = FetchType.EAGER)
  @Column(name = "conversions")
  private List<Currency> values;

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

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

}
