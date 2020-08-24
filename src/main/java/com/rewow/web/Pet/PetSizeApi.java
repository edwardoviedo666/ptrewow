package com.rewow.web.Pet;

import com.rewow.commons.constants.api.EndpointApi;
import com.rewow.commons.constants.api.PetSize.IEndpointPetSize;
import com.rewow.commons.domains.response.builder.ResponseBuilder;
import com.rewow.entities.PetSizeEntity;
import com.rewow.enums.TransactionState;
import com.rewow.service.PetSize.IPetSizeService;
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
public class PetSizeApi {
    private final IPetSizeService petSizeService;
    public PetSizeApi(IPetSizeService petSizeService){
        this.petSizeService= petSizeService;
    }
    @GetMapping(IEndpointPetSize.PET_SIZE)
    public ResponseEntity<?> findAll() {
        List<PetSizeEntity> petSizeResponse = petSizeService.findAll();
        return ResponseBuilder.newBuilder()
                .withResponse(petSizeResponse)
                .withPath(IEndpointPetSize.PET_SIZE)
                .withMessage("successful consultation")
                .withStatus(HttpStatus.OK)
                .withTransactionState(TransactionState.OK)
                .buildResponse();
    }
}

