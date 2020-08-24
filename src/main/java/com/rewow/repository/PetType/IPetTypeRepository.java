package com.rewow.repository.PetType;


import com.rewow.entities.PetTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPetTypeRepository extends JpaRepository<PetTypeEntity, Integer> {
}
