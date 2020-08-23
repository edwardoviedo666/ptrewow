package com.rewow.service.Pet.impl;

import com.rewow.commons.converter.PetConverter;
import com.rewow.commons.domains.generic.PetDTO;
import com.rewow.commons.exceptions.SystemException;
import com.rewow.entities.PetEntity;
import com.rewow.repository.Pet.impl.PetRepositoryFacade;
import com.rewow.service.Pet.IPetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PetServiceImpl implements IPetService {

    private final PetRepositoryFacade petRepository;

    @Autowired
    public PetServiceImpl(PetRepositoryFacade petRepository) {
        this.petRepository = petRepository;
    }

    @Override
    public PetDTO createPet(PetDTO petDTO) throws SystemException {
        PetEntity optPetDTO = petRepository.save(PetConverter.converterPetDTOtoInEntity(petDTO));
        return PetConverter.converterPetDTOtoInDTO(optPetDTO);
    }
}
