package com.cmc.cmc.Service.impl;

import com.cmc.cmc.Service.ProcesoComisionesService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.StoredProcedureQuery;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProcesoComisionesServiceImpl implements ProcesoComisionesService {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public void ejecutarComisionesMensuales(String mesProceso, Integer montoMinimo) {
        // Llama al procedimiento almacenado: SP_COMISIONES_MENSUALES('202106', 300000)
        StoredProcedureQuery sp = entityManager.createStoredProcedureQuery("SP_COMISIONES_MENSUALES");
        sp.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        sp.registerStoredProcedureParameter(2, Integer.class, ParameterMode.IN);
        sp.setParameter(1, mesProceso);
        sp.setParameter(2, montoMinimo);
        sp.execute();
    }
}
