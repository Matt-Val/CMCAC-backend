package com.cmc.cmc.Controller;

import com.cmc.cmc.Model.dto.ComisionesMensualesRequest;
import com.cmc.cmc.Service.ProcesoComisionesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/procesos")
public class ProcesoController {

    private final ProcesoComisionesService procesoComisionesService;

    public ProcesoController(ProcesoComisionesService procesoComisionesService) {
        this.procesoComisionesService = procesoComisionesService;
    }

    // POST JSON: { "mesProceso": "202106", "montoMinimo": 300000 }
    @PostMapping("/comisiones-mensuales")
    public ResponseEntity<Void> ejecutarComisionesMensuales(@RequestBody ComisionesMensualesRequest request) {
        procesoComisionesService.ejecutarComisionesMensuales(request.getMesProceso(), request.getMontoMinimo());
        return ResponseEntity.accepted().build();
    }

    // Alternativa rápida por query params: /api/procesos/comisiones-mensuales?mes=202106&monto=300000
    @PostMapping("/comisiones-mensuales/run")
    public ResponseEntity<Void> ejecutarComisionesMensualesQP(@RequestParam("mes") String mes,
                                                              @RequestParam("monto") Integer monto) {
        procesoComisionesService.ejecutarComisionesMensuales(mes, monto);
        return ResponseEntity.accepted().build();
    }
}
