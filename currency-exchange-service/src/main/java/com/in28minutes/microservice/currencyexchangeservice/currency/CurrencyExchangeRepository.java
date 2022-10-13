package com.in28minutes.microservice.currencyexchangeservice.currency;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Integer> {
  public Optional<CurrencyExchange> findOneByIdentifier(String identifier);
}
