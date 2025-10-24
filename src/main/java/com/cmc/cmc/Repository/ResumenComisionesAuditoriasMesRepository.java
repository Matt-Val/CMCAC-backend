package com.cmc.cmc.Repository;

import com.cmc.cmc.Model.entity.ResumenComisionesAuditoriasMes;
import com.cmc.cmc.Model.id.ResumenComisionesAuditoriasMesId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResumenComisionesAuditoriasMesRepository extends JpaRepository<ResumenComisionesAuditoriasMes, ResumenComisionesAuditoriasMesId> {
}
