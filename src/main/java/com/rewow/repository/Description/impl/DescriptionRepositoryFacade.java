package com.rewow.repository.Description.impl;

import com.rewow.entities.DescriptionEntity;

import java.util.List;

public interface DescriptionRepositoryFacade {
    List<DescriptionEntity> getAllByHistoryId(Integer id);
}
