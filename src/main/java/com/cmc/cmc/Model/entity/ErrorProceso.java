package com.cmc.cmc.Model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "ERROR_PROCESO")
public class ErrorProceso {

    @Id
    @Column(name = "CORRELATIVO")
    private Integer correlativo;

    @Column(name = "SENTENCIA_ERROR", nullable = false, length = 100)
    private String sentenciaError;

    @Column(name = "MENSAJE_ERROR", nullable = false, length = 200)
    private String mensajeError;

    public Integer getCorrelativo() { return correlativo; }
    public void setCorrelativo(Integer correlativo) { this.correlativo = correlativo; }
    public String getSentenciaError() { return sentenciaError; }
    public void setSentenciaError(String sentenciaError) { this.sentenciaError = sentenciaError; }
    public String getMensajeError() { return mensajeError; }
    public void setMensajeError(String mensajeError) { this.mensajeError = mensajeError; }
}
