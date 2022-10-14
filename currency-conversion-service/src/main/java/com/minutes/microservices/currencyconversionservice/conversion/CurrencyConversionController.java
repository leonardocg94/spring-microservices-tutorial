package com.minutes.microservices.currencyconversionservice.conversion;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CurrencyConversionController {

  private Environment enviroment;
  private CurrencyExchangeProxy proxy;

  public CurrencyConversionController(Environment enviroment, CurrencyExchangeProxy currencyExchangeProxy) {
    this.enviroment = enviroment;
    this.proxy = currencyExchangeProxy;
  }

  @GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
  public CurrencyConversionResponse getCalculatedConversion(@PathVariable String from, @PathVariable String to,
      @PathVariable Double quantity) {

    try {
      
      CurrencyConversionResponse response = new RestTemplate().getForObject(
          String.format("http://localhost:8000/currency-exchange/from/%s/to/%s", from, to),
          CurrencyConversionResponse.class);
  
      // System.out.println(response.toString());
  
      response.setQuantity(quantity);
      response.setEnviroment(String.format("puerto:%s", enviroment.getProperty("local.server.port")));
      response.calculateConversion();
      return response;
    } catch (Exception e) {
      System.out.println(e.getMessage());
      return null;
    }
  }
  @GetMapping("/currency-conversion-feing/from/{from}/to/{to}/quantity/{quantity}")
  public CurrencyConversionResponse getCalculatedConversionFeing(@PathVariable String from, @PathVariable String to,
      @PathVariable Double quantity) {

    CurrencyConversionResponse response = proxy.retrieveExchangeValue(from, to);   
    response.setQuantity(quantity);
    response.setEnviroment(String.format("puerto:%s", enviroment.getProperty("local.server.port")));
    response.calculateConversion();  

    return response;
  }
}
