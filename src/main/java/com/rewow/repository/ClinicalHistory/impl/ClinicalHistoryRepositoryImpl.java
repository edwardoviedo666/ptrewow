package com.rewow.repository.ClinicalHistory.impl;

import com.rewow.entities.ClinicalHistoryEntity;
import com.rewow.repository.ClinicalHistory.IClinicalHistoryRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClinicalHistoryRepositoryImpl implements ClinicalHistoryRepositoryFacade {
    private final IClinicalHistoryRepository clinicalHistoryRepository;

    public ClinicalHistoryRepositoryImpl(IClinicalHistoryRepository clinicalHistoryRepository) {
        this.clinicalHistoryRepository = clinicalHistoryRepository;
    }

    public List<ClinicalHistoryEntity> findAllByPetIdPet(Integer petId) {
        return clinicalHistoryRepository.findAllByPetIdPet(petId);
    }

}
