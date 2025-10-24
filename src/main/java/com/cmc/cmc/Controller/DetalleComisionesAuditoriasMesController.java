package com.cmc.cmc.Controller;

import com.cmc.cmc.Model.entity.DetalleComisionesAuditoriasMes;
import com.cmc.cmc.Model.id.DetalleComisionesAuditoriasMesId;
import com.cmc.cmc.Service.DetalleComisionesAuditoriasMesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/detalles")
public class DetalleComisionesAuditoriasMesController {

    private final DetalleComisionesAuditoriasMesService service;

    public DetalleComisionesAuditoriasMesController(DetalleComisionesAuditoriasMesService service) {
        this.service = service;
    }

    @GetMapping
    public List<DetalleComisionesAuditoriasMes> findAll() {
        return service.findAll();
    }

    @GetMapping("/{mes}/{anno}/{run}")
    public ResponseEntity<DetalleComisionesAuditoriasMes> findById(@PathVariable int mes,
                                                                   @PathVariable int anno,
                                                                   @PathVariable String run) {
        DetalleComisionesAuditoriasMesId id = new DetalleComisionesAuditoriasMesId(mes, anno, run);
        return service.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public DetalleComisionesAuditoriasMes create(@RequestBody DetalleComisionesAuditoriasMes body) {
        return service.save(body);
    }

    @PutMapping("/{mes}/{anno}/{run}")
    public ResponseEntity<DetalleComisionesAuditoriasMes> update(@PathVariable int mes,
                                                                 @PathVariable int anno,
                                                                 @PathVariable String run,
                                                                 @RequestBody DetalleComisionesAuditoriasMes body) {
        DetalleComisionesAuditoriasMesId id = new DetalleComisionesAuditoriasMesId(mes, anno, run);
        if (service.findById(id).isEmpty()) return ResponseEntity.notFound().build();
        body.setId(id);
        return ResponseEntity.ok(service.save(body));
    }

    @DeleteMapping("/{mes}/{anno}/{run}")
    public ResponseEntity<Void> delete(@PathVariable int mes,
                                       @PathVariable int anno,
                                       @PathVariable String run) {
        DetalleComisionesAuditoriasMesId id = new DetalleComisionesAuditoriasMesId(mes, anno, run);
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
