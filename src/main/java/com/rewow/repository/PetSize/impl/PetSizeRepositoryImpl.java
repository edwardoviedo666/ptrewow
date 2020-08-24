package com.rewow.repository.PetSize.impl;

import com.rewow.entities.PetSizeEntity;
import com.rewow.repository.PetSize.IPetSizeRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PetSizeRepositoryImpl implements PetSIzeRepositoryFacade {
    private final IPetSizeRepository petSizeRepository;

    public PetSizeRepositoryImpl(IPetSizeRepository petSizeRepository) {
        this.petSizeRepository = petSizeRepository;
    }

    @Override
    public List<PetSizeEntity> findAll() {
        return petSizeRepository.findAll();
    }

    public List<PetSizeEntity> findAllByName(String name) {
        return petSizeRepository.findAllByName(name);
    }
}
