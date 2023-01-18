package com.modelaai.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.modelaai.api.dto.CarDTO;
import com.modelaai.api.model.Car;
import com.modelaai.api.repository.CarRepository;

@RestController
@RequestMapping("/api/car")
public class CarController {

  @Autowired
  private CarRepository repository;
  
  @PostMapping
  public void createCar(@RequestBody CarDTO req) {
    repository.save(new Car(req));
  }
}