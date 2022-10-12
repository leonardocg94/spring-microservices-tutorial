package com.in28minutes.microservice.currencyexchangeservice.currency;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {

    @Autowired
    private Environment enviroment;

    private List<CurrencyExchange> currencyExchanges = new ArrayList<CurrencyExchange>(List.of(
            new CurrencyExchange("USD", List.of(
                    new Currency("MXN", 20.033),
                    new Currency("EUR", 1.0315),
                    new Currency("JPY", 146.93))),
            new CurrencyExchange("MXN", List.of(
                    new Currency("USD", 0.0499),
                    new Currency("EUR", 0.0515),
                    new Currency("JPY", 7.3344))),
            new CurrencyExchange("EUR", List.of(
                    new Currency("MXN", 20.033),
                    new Currency("USD", 0.9695),
                    new Currency("JPY", 142.45))),
            new CurrencyExchange("JPY", List.of(
                    new Currency("MXN", 0.1363),
                    new Currency("USD", 0.007),
                    new Currency("EUR", 142.45)))));

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyExchangeResponse retrieveExchangeValue(@PathVariable String from, @PathVariable String to)
            throws Exception {
        Double exchange = currencyExchanges.stream()
                .filter(currEx -> currEx.getIdentifier().equals(from))
                .map(currEx -> currEx.getValues())
                .findFirst()
                .orElseThrow(() -> new Exception("Moneda de origen no valida")).stream()
                .filter(curr -> curr.getIdentifier().equals(to))
                .findFirst().orElseThrow(() -> new Exception("Moneda destino no valida")).getValue();

        return new CurrencyExchangeResponse(from, to, exchange, String.format("puerto:%s", enviroment.getProperty("local.server.port")));
    }
}
