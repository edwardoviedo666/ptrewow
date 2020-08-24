package com.rewow.service.Pet.impl;

import com.rewow.commons.converter.PetConverter;
import com.rewow.commons.domains.generic.PetDTO;
import com.rewow.commons.exceptions.SystemException;
import com.rewow.entities.ClinicalHistoryEntity;
import com.rewow.entities.DescriptionEntity;
import com.rewow.entities.PetEntity;
import com.rewow.repository.ClinicalHistory.impl.ClinicalHistoryRepositoryFacade;
import com.rewow.repository.Description.impl.DescriptionRepositoryFacade;
import com.rewow.repository.Pet.impl.PetRepositoryFacade;
import com.rewow.service.Pet.IPetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetServiceImpl implements IPetService {

    private final PetRepositoryFacade petRepository;
    private final ClinicalHistoryRepositoryFacade historyRepository;
    private final DescriptionRepositoryFacade descriptionRepository;

    @Autowired
    public PetServiceImpl(PetRepositoryFacade petRepository, ClinicalHistoryRepositoryFacade historyRepository,
                          DescriptionRepositoryFacade descriptionRepository) {
        this.petRepository = petRepository;
        this.historyRepository = historyRepository;
        this.descriptionRepository = descriptionRepository;
    }

    @Override
    public PetDTO createPet(PetDTO petDTO) {
        PetEntity optPetDTO = petRepository.save(PetConverter.converterPetDTOtoInEntity(petDTO));
        return PetConverter.converterPetDTOtoInDTO(optPetDTO);
    }

    @Override
    public List<DescriptionEntity> getHistorical(Integer petId) throws SystemException {
        List<ClinicalHistoryEntity> history = historyRepository.findAllByPetIdPet(petId);
        if (!history.isEmpty()) {
            Integer idHistory = history.get(0).getIdHistory();
            return descriptionRepository.getAllByHistoryId(idHistory);
        }
        throw new SystemException("not posible list");
    }
}
