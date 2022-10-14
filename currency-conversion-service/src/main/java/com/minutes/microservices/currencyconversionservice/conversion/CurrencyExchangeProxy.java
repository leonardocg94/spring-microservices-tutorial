package com.minutes.microservices.currencyconversionservice.conversion;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "currency-exchange-service", url = "localhost:8000")
public interface CurrencyExchangeProxy {
  @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyConversionResponse retrieveExchangeValue(@PathVariable String from, @PathVariable String to);
}
