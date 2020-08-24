package com.rewow.commons.converter;


import com.rewow.commons.domains.generic.PetTypeDTO;
import com.rewow.entities.PetTypeEntity;

public class PetTypeConverter {
    public static PetTypeEntity converterPetTypeDTOtoInEntity(PetTypeDTO petTypeDTO) {
        return PetTypeEntity.builder()
                .idType(petTypeDTO.getIdType())
                .name(petTypeDTO.getName())
                .build();
    }

    public static PetTypeDTO converterPetSizeDTOtoInDTO(PetTypeEntity petTypeEntity) {
        return PetTypeDTO.builder()
                .idType(petTypeEntity.getIdType())
                .name(petTypeEntity.getName())
                .build();
    }
}
