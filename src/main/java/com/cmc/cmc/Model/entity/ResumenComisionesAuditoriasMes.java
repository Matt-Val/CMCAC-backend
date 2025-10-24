package com.cmc.cmc.Model.entity;

import com.cmc.cmc.Model.id.ResumenComisionesAuditoriasMesId;
import jakarta.persistence.*;

@Entity
@Table(name = "RESUMEN_COMISIONES_AUDITORIAS_MES")
public class ResumenComisionesAuditoriasMes {

    @EmbeddedId
    private ResumenComisionesAuditoriasMesId id;

    @Column(name = "TOTAL_AUDITORES", nullable = false)
    private Integer totalAuditores;

    @Column(name = "TOTAL_CON_AUDITORIAS", nullable = false)
    private Integer totalConAuditorias;

    @Column(name = "TOTAL_SIN_AUDITORIAS", nullable = false)
    private Integer totalSinAuditorias;

    @Column(name = "MONTO_TOTAL_AUDITORIAS", nullable = false)
    private Integer montoTotalAuditorias;

    @Column(name = "MONTO_TOTAL_COMISIONES", nullable = false)
    private Integer montoTotalComisiones;

    public ResumenComisionesAuditoriasMesId getId() { return id; }
    public void setId(ResumenComisionesAuditoriasMesId id) { this.id = id; }
    public Integer getTotalAuditores() { return totalAuditores; }
    public void setTotalAuditores(Integer totalAuditores) { this.totalAuditores = totalAuditores; }
    public Integer getTotalConAuditorias() { return totalConAuditorias; }
    public void setTotalConAuditorias(Integer totalConAuditorias) { this.totalConAuditorias = totalConAuditorias; }
    public Integer getTotalSinAuditorias() { return totalSinAuditorias; }
    public void setTotalSinAuditorias(Integer totalSinAuditorias) { this.totalSinAuditorias = totalSinAuditorias; }
    public Integer getMontoTotalAuditorias() { return montoTotalAuditorias; }
    public void setMontoTotalAuditorias(Integer montoTotalAuditorias) { this.montoTotalAuditorias = montoTotalAuditorias; }
    public Integer getMontoTotalComisiones() { return montoTotalComisiones; }
    public void setMontoTotalComisiones(Integer montoTotalComisiones) { this.montoTotalComisiones = montoTotalComisiones; }
}
