package com.gcermen.precios.carburantes.controller;

import com.gcermen.precios.carburantes.model.EstacionTerrestre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class EstacionesTerrestresController {

  @Autowired private RestTemplate restTemplate;

  @GetMapping("/estacionesTerrestres")
  public EstacionTerrestre getAllEstacionTerrestre() {
      EstacionTerrestre estacionTerrestres = restTemplate.getForObject(
        "https://sedeaplicaciones.minetur.gob.es/ServiciosRESTCarburantes/PreciosCarburantes/EstacionesTerrestres/",
        EstacionTerrestre.class);
      return estacionTerrestres;
  }
}
