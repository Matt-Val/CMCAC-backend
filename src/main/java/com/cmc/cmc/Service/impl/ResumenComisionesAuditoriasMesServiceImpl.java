package com.cmc.cmc.Service.impl;

import com.cmc.cmc.Model.entity.ResumenComisionesAuditoriasMes;
import com.cmc.cmc.Model.id.ResumenComisionesAuditoriasMesId;
import com.cmc.cmc.Repository.ResumenComisionesAuditoriasMesRepository;
import com.cmc.cmc.Service.ResumenComisionesAuditoriasMesService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ResumenComisionesAuditoriasMesServiceImpl implements ResumenComisionesAuditoriasMesService {

    private final ResumenComisionesAuditoriasMesRepository repository;

    public ResumenComisionesAuditoriasMesServiceImpl(ResumenComisionesAuditoriasMesRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<ResumenComisionesAuditoriasMes> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<ResumenComisionesAuditoriasMes> findById(ResumenComisionesAuditoriasMesId id) {
        return repository.findById(id);
    }

    @Override
    public ResumenComisionesAuditoriasMes save(ResumenComisionesAuditoriasMes entity) {
        return repository.save(entity);
    }

    @Override
    public void deleteById(ResumenComisionesAuditoriasMesId id) {
        repository.deleteById(id);
    }
}
