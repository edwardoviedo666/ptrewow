package com.rewow.commons.converter;

import com.rewow.commons.domains.generic.PetDTO;
import com.rewow.commons.domains.generic.PetSizeDTO;
import com.rewow.entities.PetEntity;
import com.rewow.entities.PetSizeEntity;
import org.springframework.stereotype.Component;

@Component
public class PetSizeConverter {
    public static PetSizeEntity converterPetSizeDTOtoInEntity(PetSizeDTO petSizeDTO) {
        return PetSizeEntity.builder()
                .idSize(petSizeDTO.getIdSize())
                .name(petSizeDTO.getName())
                .build();
    }

    public static PetSizeDTO converterPetSizeDTOtoInDTO(PetSizeEntity petSizeEntity) {
        return PetSizeDTO.builder()
                .idSize(petSizeEntity.getIdSize())
                .name(petSizeEntity.getName())
                .build();
    }
}
