package com.cmc.cmc.Service.impl;

import com.cmc.cmc.Service.DetalleAuditoresLimiteMesService;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class DetalleAuditoresLimiteMesServiceImpl implements DetalleAuditoresLimiteMesService {

    private final JdbcTemplate jdbcTemplate;

    public DetalleAuditoresLimiteMesServiceImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Map<String, Object>> findAll() {
        // Devuelve todas las filas como mapa columna-valor.
        return jdbcTemplate.queryForList("SELECT * FROM DETALLE_AUDITORES_LIMITE_MES");
    }
}
