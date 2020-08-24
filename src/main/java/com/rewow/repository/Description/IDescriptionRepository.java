package com.rewow.repository.Description;


import com.rewow.entities.DescriptionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IDescriptionRepository extends JpaRepository<DescriptionEntity, Integer> {
    List<DescriptionEntity> findAllByClinicalHistoryIdHistory(Integer clinicalHIstoryId);
}
