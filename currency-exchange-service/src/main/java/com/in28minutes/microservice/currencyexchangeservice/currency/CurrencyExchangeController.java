package com.in28minutes.microservice.currencyexchangeservice.currency;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {

    @Autowired
    private Environment enviroment;
    @Autowired
    private CurrencyService currencyService;

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyExchangeResponse retrieveExchangeValue(@PathVariable String from, @PathVariable String to)
            throws Exception {
        
        Optional<CurrencyExchange> exchange = currencyService.getCurrencyExchange(from);

        if(exchange.isEmpty())
            throw new Exception("Moneda de origen no valida");
        
        Currency val = exchange.get().getValues().stream()
                .filter(currency -> currency.getIdentifier().equals(to))
                .findFirst()
                .orElseThrow(() -> new Exception("Moneda de destino no valida"));
                

        return new CurrencyExchangeResponse(from, to, val.getValue(),
                String.format("puerto:%s", enviroment.getProperty("local.server.port")));
    }
}
