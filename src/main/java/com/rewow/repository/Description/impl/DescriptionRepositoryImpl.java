package com.rewow.repository.Description.impl;

import com.rewow.entities.DescriptionEntity;
import com.rewow.repository.Description.IDescriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DescriptionRepositoryImpl implements DescriptionRepositoryFacade {
    private final IDescriptionRepository iDescriptionRepository;

    @Autowired
    public DescriptionRepositoryImpl(IDescriptionRepository iDescriptionRepository) {
        this.iDescriptionRepository = iDescriptionRepository;
    }

    @Override
    public List<DescriptionEntity> getAllByHistoryId(Integer id) {
        return iDescriptionRepository.findAllByClinicalHistoryIdHistory(id);
    }
}
