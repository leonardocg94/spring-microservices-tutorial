package com.in28minutes.microservices.limitsservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.microservices.limitsservice.configuration.Configuration;
import com.in28minutes.microservices.limitsservice.models.Limits;

@RestController
public class LimitsController {
  
  private Configuration configuration;

  public LimitsController(Configuration configuration) {
    this.configuration = configuration;
  }

  @GetMapping("/limits")
  public Limits retrieveLimits() {
    return new Limits(configuration.getMinimum(), configuration.getMaximum());
  }
}
