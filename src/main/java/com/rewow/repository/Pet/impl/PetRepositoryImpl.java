package com.rewow.repository.Pet.impl;

import com.rewow.entities.PetEntity;
import com.rewow.repository.Pet.IPetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class PetRepositoryImpl implements PetRepositoryFacade {

    IPetRepository iPetRepository;

    @Autowired
    PetRepositoryImpl(IPetRepository iPetRepository) {
        this.iPetRepository = iPetRepository;
    }

    @Override
    public PetEntity save(PetEntity petEntity) {
        return iPetRepository.save(petEntity);
    }
}
