package com.rewow.service.PetSize.impl;

import com.rewow.commons.converter.PetSizeConverter;
import com.rewow.commons.domains.generic.PetSizeDTO;
import com.rewow.entities.PetSizeEntity;
import com.rewow.repository.PetSize.impl.PetSIzeRepositoryFacade;
import com.rewow.service.PetSize.IPetSizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetSizeServiceImpl implements IPetSizeService {
    private final PetSIzeRepositoryFacade petSIzeRepositoryFacade;
    private final PetSizeConverter petSizeConverter;

    public PetSizeServiceImpl(PetSIzeRepositoryFacade petSIzeRepositoryFacade,PetSizeConverter petSizeConverter ){
        this.petSIzeRepositoryFacade= petSIzeRepositoryFacade;
        this.petSizeConverter= petSizeConverter;
    }
    @Override
    public List<PetSizeEntity> findAll() {
        return petSIzeRepositoryFacade.findAll();
    }


}
