package com.cmc.cmc.Service.impl;

import com.cmc.cmc.Model.entity.ErrorProceso;
import com.cmc.cmc.Repository.ErrorProcesoRepository;
import com.cmc.cmc.Service.ErrorProcesoService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ErrorProcesoServiceImpl implements ErrorProcesoService {

    private final ErrorProcesoRepository repository;

    public ErrorProcesoServiceImpl(ErrorProcesoRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<ErrorProceso> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<ErrorProceso> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public ErrorProceso save(ErrorProceso entity) {
        return repository.save(entity);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
