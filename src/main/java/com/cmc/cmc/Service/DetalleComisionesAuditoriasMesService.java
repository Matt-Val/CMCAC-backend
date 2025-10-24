package com.cmc.cmc.Service;

import com.cmc.cmc.Model.entity.DetalleComisionesAuditoriasMes;
import com.cmc.cmc.Model.id.DetalleComisionesAuditoriasMesId;

import java.util.List;
import java.util.Optional;

public interface DetalleComisionesAuditoriasMesService {
    List<DetalleComisionesAuditoriasMes> findAll();
    Optional<DetalleComisionesAuditoriasMes> findById(DetalleComisionesAuditoriasMesId id);
    DetalleComisionesAuditoriasMes save(DetalleComisionesAuditoriasMes entity);
    void deleteById(DetalleComisionesAuditoriasMesId id);
}
