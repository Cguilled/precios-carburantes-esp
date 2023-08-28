package com.gcermen.precios.carburantes.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class EstacionServicioPrecio {

    @JsonProperty("C.P.")
    private String cp;

    @JsonProperty("Dirección")
    private String dereccion;

    @JsonProperty("Horario")
    private String horario;

    @JsonProperty("Latitud")
    private String latitud;

    @JsonProperty("Localidad")
    private String localidad;

    @JsonProperty("Longitud (WGS84)")
    private String longitud;

    @JsonProperty("Margen")
    private String margen;

    @JsonProperty("Municipio")
    private String municipio;

    @JsonProperty("Provincia")
    private String provincia;

    @JsonProperty("Rótulo")
    private String rotulo;

    @JsonProperty("Precio Biodiesel")
    private String precioBiodiesel;

    @JsonProperty("Precio Bioetanol")
    private String precioBioetanol;

    @JsonProperty("Precio Gas Natural Comprimido")
    private String precioGNC;

    @JsonProperty("Precio Gas Natural Licuado")
    private String precioGNL;

    @JsonProperty("Precio Gases licuados del petróleo")
    private String precioGLP;

    @JsonProperty("Precio Gasoleo A")
    private String precioGasoleoA;

    @JsonProperty("Precio Gasoleo B")
    private String precioGasoleoB;

    @JsonProperty("Precio Gasoleo Premium")
    private String precioGasoleoPremium;

    @JsonProperty("Precio Gasolina 95 E10")
    private String precioGasolina95E10;

    @JsonProperty("Precio Gasolina 95 E5")
    private String precioGasolina95E5;

    @JsonProperty("Precio Gasolina 95 E5 Premium")
    private String precioGasolina95ESPremium;

    @JsonProperty("Precio Gasolina 98 E10")
    private String precioGasolina98E10;

    @JsonProperty("Precio Gasolina 98 E5")
    private String precioGasolina98E5;

    @JsonProperty("Precio Hidrogeno")
    private String precioHidrogeno;

    @JsonProperty("Remisión")
    private String remision;

    @JsonProperty("Tipo Venta")
    private String tipoVenta;

    @JsonProperty("% BioEtanol")
    private String porcentajeBioEtanol;

    @JsonProperty("% Éster metílico")
    private String porcentajeEsterMetilico;

    @JsonProperty("IDEESS")
    private String ideess;

    @JsonProperty("IDMunicipio")
    private String idMunicipio;

    @JsonProperty("IDProvincia")
    private String idProvincia;

    @JsonProperty("IDCCAA")
    private String idccaa;
}
