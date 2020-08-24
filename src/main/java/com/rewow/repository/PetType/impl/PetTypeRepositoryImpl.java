package com.rewow.repository.PetType.impl;

import com.rewow.entities.PetTypeEntity;
import com.rewow.repository.PetType.IPetTypeRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PetTypeRepositoryImpl implements PetTypeRepositoryFacade {
    private final IPetTypeRepository petTypeRepository;
    public PetTypeRepositoryImpl(IPetTypeRepository petTypeRepository){this.petTypeRepository=petTypeRepository;}

@Override
    public List<PetTypeEntity> findAll(){return petTypeRepository.findAll();}
}
