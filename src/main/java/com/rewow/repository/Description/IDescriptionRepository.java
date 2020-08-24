package com.rewow.repository.Description;


import com.rewow.entities.DescriptionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IDescriptionRepository extends JpaRepository<DescriptionEntity, Integer> {
    List<DescriptionEntity> findAllByClinicalHistoryIdHistory(Integer clinicalHIstoryId);
}
