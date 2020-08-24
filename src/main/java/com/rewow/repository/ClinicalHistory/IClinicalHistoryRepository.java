package com.rewow.repository.ClinicalHistory;


import com.rewow.entities.ClinicalHistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IClinicalHistoryRepository extends JpaRepository<ClinicalHistoryEntity, Integer> {
    List<ClinicalHistoryEntity> findAllByPetIdPet(Integer petIdPet);
}
