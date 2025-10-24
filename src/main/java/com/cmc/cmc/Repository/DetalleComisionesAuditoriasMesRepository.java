package com.cmc.cmc.Repository;

import com.cmc.cmc.Model.entity.DetalleComisionesAuditoriasMes;
import com.cmc.cmc.Model.id.DetalleComisionesAuditoriasMesId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetalleComisionesAuditoriasMesRepository extends JpaRepository<DetalleComisionesAuditoriasMes, DetalleComisionesAuditoriasMesId> {
}
