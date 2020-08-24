package com.rewow.web.Pet;

import com.rewow.commons.constants.api.EndpointApi;
import com.rewow.commons.constants.api.PetType.IEndpointPetType;
import com.rewow.commons.domains.response.builder.ResponseBuilder;
import com.rewow.entities.PetTypeEntity;
import com.rewow.enums.TransactionState;
import com.rewow.service.PetType.IPetTypeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = EndpointApi.BASE_PATH)
@CrossOrigin(origins = "*")
public class PetTypeApi {
    private final IPetTypeService petTypeService;

    public PetTypeApi(IPetTypeService petTypeService) {
        this.petTypeService = petTypeService;
    }
    @GetMapping(IEndpointPetType.PET_TYPE)
    public ResponseEntity<?> findAll() {
        List<PetTypeEntity> petTypeResponse = petTypeService.findAll();
        return ResponseBuilder.newBuilder()
                .withResponse(petTypeResponse)
                .withPath(IEndpointPetType.PET_TYPE)
                .withMessage("successful consultation")
                .withStatus(HttpStatus.OK)
                .withTransactionState(TransactionState.OK)
                .buildResponse();
    }
}
