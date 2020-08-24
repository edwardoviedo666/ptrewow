package com.rewow.service.Pet;

import com.rewow.commons.domains.generic.PetDTO;
import com.rewow.entities.DescriptionEntity;
import javassist.NotFoundException;
import org.omg.CORBA.SystemException;

import java.util.List;


public interface IPetService {
    PetDTO createPet(PetDTO petDTO) throws SystemException, NotFoundException, com.rewow.commons.exceptions.SystemException;

    List<DescriptionEntity> getHistorical(Integer petId) throws com.rewow.commons.exceptions.SystemException;
}
