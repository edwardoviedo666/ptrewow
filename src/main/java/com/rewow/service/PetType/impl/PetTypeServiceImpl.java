package com.rewow.service.PetType.impl;


import com.rewow.entities.PetTypeEntity;
import com.rewow.repository.PetType.impl.PetTypeRepositoryFacade;
import com.rewow.service.PetType.IPetTypeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PetTypeServiceImpl implements IPetTypeService {
    private final PetTypeRepositoryFacade petTypeRepositoryFacade;

    @Autowired
    public PetTypeServiceImpl(PetTypeRepositoryFacade petTypeRepositoryFacade) {
        this.petTypeRepositoryFacade = petTypeRepositoryFacade;

    }
    @Override
    public List<PetTypeEntity> findAll() {
        return petTypeRepositoryFacade.findAll();
    }

}
