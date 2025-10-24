package com.cmc.cmc.Model.dto;

public class ComisionesMensualesRequest {
    private String mesProceso; // ejemplo: "202106"
    private Integer montoMinimo; // ejemplo: 300000

    public String getMesProceso() { return mesProceso; }
    public void setMesProceso(String mesProceso) { this.mesProceso = mesProceso; }

    public Integer getMontoMinimo() { return montoMinimo; }
    public void setMontoMinimo(Integer montoMinimo) { this.montoMinimo = montoMinimo; }
}
