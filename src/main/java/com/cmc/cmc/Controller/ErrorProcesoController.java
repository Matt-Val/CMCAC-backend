package com.cmc.cmc.Controller;

import com.cmc.cmc.Model.entity.ErrorProceso;
import com.cmc.cmc.Service.ErrorProcesoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/errores")
public class ErrorProcesoController {

    private final ErrorProcesoService service;

    public ErrorProcesoController(ErrorProcesoService service) {
        this.service = service;
    }

    @GetMapping
    public List<ErrorProceso> findAll() { return service.findAll(); }

    @GetMapping("/{id}")
    public ResponseEntity<ErrorProceso> findById(@PathVariable Integer id) {
        return service.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ErrorProceso create(@RequestBody ErrorProceso body) { return service.save(body); }

    @PutMapping("/{id}")
    public ResponseEntity<ErrorProceso> update(@PathVariable Integer id, @RequestBody ErrorProceso body) {
        if (service.findById(id).isEmpty()) return ResponseEntity.notFound().build();
        body.setCorrelativo(id);
        return ResponseEntity.ok(service.save(body));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
