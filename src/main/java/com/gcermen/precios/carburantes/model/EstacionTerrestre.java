package com.gcermen.precios.carburantes.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class EstacionTerrestre {
    @JsonProperty("Fecha")
    private LocalDateTime fecha;

    @JsonProperty("ListaEESSPrecio")
    private List<EstacionServicioPrecio> estacionesServicioPrecios;

}
