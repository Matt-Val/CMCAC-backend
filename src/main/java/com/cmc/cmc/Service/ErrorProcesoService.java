package com.cmc.cmc.Service;

import com.cmc.cmc.Model.entity.ErrorProceso;

import java.util.List;
import java.util.Optional;

public interface ErrorProcesoService {
    List<ErrorProceso> findAll();
    Optional<ErrorProceso> findById(Integer id);
    ErrorProceso save(ErrorProceso entity);
    void deleteById(Integer id);
}
