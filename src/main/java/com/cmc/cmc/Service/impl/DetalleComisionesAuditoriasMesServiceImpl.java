package com.cmc.cmc.Service.impl;

import com.cmc.cmc.Model.entity.DetalleComisionesAuditoriasMes;
import com.cmc.cmc.Model.id.DetalleComisionesAuditoriasMesId;
import com.cmc.cmc.Repository.DetalleComisionesAuditoriasMesRepository;
import com.cmc.cmc.Service.DetalleComisionesAuditoriasMesService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DetalleComisionesAuditoriasMesServiceImpl implements DetalleComisionesAuditoriasMesService {

    private final DetalleComisionesAuditoriasMesRepository repository;

    public DetalleComisionesAuditoriasMesServiceImpl(DetalleComisionesAuditoriasMesRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<DetalleComisionesAuditoriasMes> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<DetalleComisionesAuditoriasMes> findById(DetalleComisionesAuditoriasMesId id) {
        return repository.findById(id);
    }

    @Override
    public DetalleComisionesAuditoriasMes save(DetalleComisionesAuditoriasMes entity) {
        return repository.save(entity);
    }

    @Override
    public void deleteById(DetalleComisionesAuditoriasMesId id) {
        repository.deleteById(id);
    }
}
