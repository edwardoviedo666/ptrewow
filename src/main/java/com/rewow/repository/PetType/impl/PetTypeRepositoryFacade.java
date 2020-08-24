package com.rewow.repository.PetType.impl;

import com.rewow.entities.PetTypeEntity;

import java.util.List;

public interface PetTypeRepositoryFacade {
    List<PetTypeEntity> findAll();
}
