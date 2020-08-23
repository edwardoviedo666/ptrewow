package com.rewow.repository.Pet.impl;

import com.rewow.entities.PetEntity;

import java.util.Optional;

public interface PetRepositoryFacade {
    PetEntity save(PetEntity petEntity);
}
