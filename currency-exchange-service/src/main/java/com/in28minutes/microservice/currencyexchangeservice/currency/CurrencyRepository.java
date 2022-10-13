package com.in28minutes.microservice.currencyexchangeservice.currency;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyRepository extends JpaRepository<Currency, Integer>{
  public Optional<Currency> findOneByExchangeId(int id);
}
