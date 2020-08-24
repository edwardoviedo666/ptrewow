package com.rewow.repository.PetSize;


import com.rewow.entities.PetSizeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPetSizeRepository extends JpaRepository<PetSizeEntity, Integer> {
    List<PetSizeEntity> findAllByName(String name);
}
