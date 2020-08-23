package com.rewow.commons.converter;

import com.rewow.commons.domains.generic.PetDTO;
import com.rewow.entities.PetEntity;

public class PetConverter {
    public static PetEntity converterPetDTOtoInEntity(PetDTO petDTO) {
        return PetEntity.builder()
                .idPet(petDTO.getIdPet())
                .ownerName(petDTO.getOwnerName())
                .petName(petDTO.getPetName())
//                .age(petDTO.getAge())
                .build();
    }

    public static PetDTO converterPetDTOtoInDTO(PetEntity petEntity) {
        return PetDTO.builder()
                .idPet(petEntity.getIdPet())
                .ownerName(petEntity.getOwnerName())
                .petName(petEntity.getPetName())
//                .age(petEntity.getAge())
                .build();
    }
}
