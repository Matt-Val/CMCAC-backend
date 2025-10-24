package com.cmc.cmc.Repository;

import com.cmc.cmc.Model.entity.ErrorProceso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ErrorProcesoRepository extends JpaRepository<ErrorProceso, Integer> {
}
