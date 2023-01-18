package com.modelaai.api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Car {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(length = 30, nullable = false)
  private String modelo;

  @Column(length = 30, nullable = false)
  private String fabricante;

  @Column(length = 10, nullable = false)
  private String dataFabricacao;

  @Column(scale = 2, nullable = false)
  private double valor;

  @Column(precision = 4, nullable = false)
  private int anoModelo;

}
