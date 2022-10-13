package com.in28minutes.microservice.currencyexchangeservice.currency;

import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class CurrencyService {
  private CurrencyExchangeRepository currencyExchangeRepository;

  public CurrencyService(CurrencyExchangeRepository currencyExchangeRepository) {
    this.currencyExchangeRepository = currencyExchangeRepository;
  }

  public Optional<CurrencyExchange> getCurrencyExchange(String from) {
    return currencyExchangeRepository.findOneByIdentifier(from);
  }
}
