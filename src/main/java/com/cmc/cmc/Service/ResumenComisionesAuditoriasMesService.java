package com.cmc.cmc.Service;

import com.cmc.cmc.Model.entity.ResumenComisionesAuditoriasMes;
import com.cmc.cmc.Model.id.ResumenComisionesAuditoriasMesId;

import java.util.List;
import java.util.Optional;

public interface ResumenComisionesAuditoriasMesService {
    List<ResumenComisionesAuditoriasMes> findAll();
    Optional<ResumenComisionesAuditoriasMes> findById(ResumenComisionesAuditoriasMesId id);
    ResumenComisionesAuditoriasMes save(ResumenComisionesAuditoriasMes entity);
    void deleteById(ResumenComisionesAuditoriasMesId id);
}
