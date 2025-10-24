package com.cmc.cmc.Model.entity;

import com.cmc.cmc.Model.id.DetalleComisionesAuditoriasMesId;
import jakarta.persistence.*;

@Entity
@Table(name = "DETALLE_COMISIONES_AUDITORIAS_MES")
public class DetalleComisionesAuditoriasMes {

    @EmbeddedId
    private DetalleComisionesAuditoriasMesId id;

    @Column(name = "NOMBRE_AUDITOR", nullable = false, length = 50)
    private String nombreAuditor;

    @Column(name = "NOMBRE_PROFESION", nullable = false, length = 25)
    private String nombreProfesion;

    @Column(name = "COMISION_TOTAL_AUDIT", nullable = false)
    private Integer comisionTotalAudit;

    @Column(name = "COMISION_MONTO_AUDIT", nullable = false)
    private Integer comisionMontoAudit;

    @Column(name = "COMISION_PROF_CRITICA", nullable = false)
    private Integer comisionProfCritica;

    @Column(name = "COMISION_EXTRA", nullable = false)
    private Integer comisionExtra;

    @Column(name = "TOTAL_COMISION_AUDIT", nullable = false)
    private Integer totalComisionAudit;

    @Column(name = "TOTAL_COMISION_EMPRESA", nullable = false)
    private Integer totalComisionEmpresa;

    public DetalleComisionesAuditoriasMesId getId() { return id; }
    public void setId(DetalleComisionesAuditoriasMesId id) { this.id = id; }
    public String getNombreAuditor() { return nombreAuditor; }
    public void setNombreAuditor(String nombreAuditor) { this.nombreAuditor = nombreAuditor; }
    public String getNombreProfesion() { return nombreProfesion; }
    public void setNombreProfesion(String nombreProfesion) { this.nombreProfesion = nombreProfesion; }
    public Integer getComisionTotalAudit() { return comisionTotalAudit; }
    public void setComisionTotalAudit(Integer comisionTotalAudit) { this.comisionTotalAudit = comisionTotalAudit; }
    public Integer getComisionMontoAudit() { return comisionMontoAudit; }
    public void setComisionMontoAudit(Integer comisionMontoAudit) { this.comisionMontoAudit = comisionMontoAudit; }
    public Integer getComisionProfCritica() { return comisionProfCritica; }
    public void setComisionProfCritica(Integer comisionProfCritica) { this.comisionProfCritica = comisionProfCritica; }
    public Integer getComisionExtra() { return comisionExtra; }
    public void setComisionExtra(Integer comisionExtra) { this.comisionExtra = comisionExtra; }
    public Integer getTotalComisionAudit() { return totalComisionAudit; }
    public void setTotalComisionAudit(Integer totalComisionAudit) { this.totalComisionAudit = totalComisionAudit; }
    public Integer getTotalComisionEmpresa() { return totalComisionEmpresa; }
    public void setTotalComisionEmpresa(Integer totalComisionEmpresa) { this.totalComisionEmpresa = totalComisionEmpresa; }
}
