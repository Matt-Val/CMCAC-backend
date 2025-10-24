package com.cmc.cmc.Controller;

import com.cmc.cmc.Model.entity.ResumenComisionesAuditoriasMes;
import com.cmc.cmc.Model.id.ResumenComisionesAuditoriasMesId;
import com.cmc.cmc.Service.ResumenComisionesAuditoriasMesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/resumenes")
public class ResumenComisionesAuditoriasMesController {

    private final ResumenComisionesAuditoriasMesService service;

    public ResumenComisionesAuditoriasMesController(ResumenComisionesAuditoriasMesService service) {
        this.service = service;
    }

    @GetMapping
    public List<ResumenComisionesAuditoriasMes> findAll() {
        return service.findAll();
    }

    @GetMapping("/{mes}/{anno}/{prof}")
    public ResponseEntity<ResumenComisionesAuditoriasMes> findById(@PathVariable int mes,
                                                                   @PathVariable int anno,
                                                                   @PathVariable String prof) {
        ResumenComisionesAuditoriasMesId id = new ResumenComisionesAuditoriasMesId(mes, anno, prof);
        return service.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResumenComisionesAuditoriasMes create(@RequestBody ResumenComisionesAuditoriasMes body) {
        return service.save(body);
    }

    @PutMapping("/{mes}/{anno}/{prof}")
    public ResponseEntity<ResumenComisionesAuditoriasMes> update(@PathVariable int mes,
                                                                 @PathVariable int anno,
                                                                 @PathVariable String prof,
                                                                 @RequestBody ResumenComisionesAuditoriasMes body) {
        ResumenComisionesAuditoriasMesId id = new ResumenComisionesAuditoriasMesId(mes, anno, prof);
        if (service.findById(id).isEmpty()) return ResponseEntity.notFound().build();
        body.setId(id);
        return ResponseEntity.ok(service.save(body));
    }

    @DeleteMapping("/{mes}/{anno}/{prof}")
    public ResponseEntity<Void> delete(@PathVariable int mes,
                                       @PathVariable int anno,
                                       @PathVariable String prof) {
        ResumenComisionesAuditoriasMesId id = new ResumenComisionesAuditoriasMesId(mes, anno, prof);
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
