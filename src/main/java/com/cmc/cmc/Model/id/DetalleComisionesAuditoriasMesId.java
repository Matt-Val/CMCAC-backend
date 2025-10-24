package com.cmc.cmc.Model.id;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class DetalleComisionesAuditoriasMesId implements Serializable {
    @Column(name = "MES_PROCESO", nullable = false)
    private Integer mesProceso;

    @Column(name = "ANNO_PROCESO", nullable = false)
    private Integer annoProceso;

    @Column(name = "RUN_AUDITOR", nullable = false, length = 15)
    private String runAuditor;

    public DetalleComisionesAuditoriasMesId() {}

    public DetalleComisionesAuditoriasMesId(Integer mesProceso, Integer annoProceso, String runAuditor) {
        this.mesProceso = mesProceso;
        this.annoProceso = annoProceso;
        this.runAuditor = runAuditor;
    }

    public Integer getMesProceso() { return mesProceso; }
    public void setMesProceso(Integer mesProceso) { this.mesProceso = mesProceso; }

    public Integer getAnnoProceso() { return annoProceso; }
    public void setAnnoProceso(Integer annoProceso) { this.annoProceso = annoProceso; }

    public String getRunAuditor() { return runAuditor; }
    public void setRunAuditor(String runAuditor) { this.runAuditor = runAuditor; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DetalleComisionesAuditoriasMesId that)) return false;
        return Objects.equals(mesProceso, that.mesProceso)
                && Objects.equals(annoProceso, that.annoProceso)
                && Objects.equals(runAuditor, that.runAuditor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mesProceso, annoProceso, runAuditor);
    }
}
