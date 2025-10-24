package com.cmc.cmc.Model.id;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ResumenComisionesAuditoriasMesId implements Serializable {
    @Column(name = "MES_PROCESO", nullable = false)
    private Integer mesProceso;

    @Column(name = "ANNO_PROCESO", nullable = false)
    private Integer annoProceso;

    @Column(name = "NOMBRE_PROFESION", nullable = false, length = 25)
    private String nombreProfesion;

    public ResumenComisionesAuditoriasMesId() {}

    public ResumenComisionesAuditoriasMesId(Integer mesProceso, Integer annoProceso, String nombreProfesion) {
        this.mesProceso = mesProceso;
        this.annoProceso = annoProceso;
        this.nombreProfesion = nombreProfesion;
    }

    public Integer getMesProceso() { return mesProceso; }
    public void setMesProceso(Integer mesProceso) { this.mesProceso = mesProceso; }

    public Integer getAnnoProceso() { return annoProceso; }
    public void setAnnoProceso(Integer annoProceso) { this.annoProceso = annoProceso; }

    public String getNombreProfesion() { return nombreProfesion; }
    public void setNombreProfesion(String nombreProfesion) { this.nombreProfesion = nombreProfesion; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ResumenComisionesAuditoriasMesId that)) return false;
        return Objects.equals(mesProceso, that.mesProceso)
                && Objects.equals(annoProceso, that.annoProceso)
                && Objects.equals(nombreProfesion, that.nombreProfesion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mesProceso, annoProceso, nombreProfesion);
    }
}
