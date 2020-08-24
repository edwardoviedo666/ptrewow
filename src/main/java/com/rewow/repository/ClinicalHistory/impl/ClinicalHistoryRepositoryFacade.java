package com.rewow.repository.ClinicalHistory.impl;

import com.rewow.entities.ClinicalHistoryEntity;

import java.util.List;

public interface ClinicalHistoryRepositoryFacade {
    List<ClinicalHistoryEntity> findAllByPetIdPet(Integer petId);
}
