package com.cmc.cmc.Controller;

import com.cmc.cmc.Service.DetalleAuditoresLimiteMesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/detalle-auditores-limite-mes")
public class DetalleAuditoresLimiteMesController {

    private final DetalleAuditoresLimiteMesService service;

    public DetalleAuditoresLimiteMesController(DetalleAuditoresLimiteMesService service) {
        this.service = service;
    }

    @GetMapping
    public List<Map<String, Object>> findAll() {
        return service.findAll();
    }
}
