package com.rewow.repository.Pet;

import com.rewow.entities.PetEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPetRepository extends JpaRepository<PetEntity, Integer> {
}
