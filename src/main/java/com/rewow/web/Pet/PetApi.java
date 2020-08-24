package com.rewow.web.Pet;

import com.rewow.commons.constants.api.EndpointApi;
import com.rewow.commons.constants.api.Pet.IEndpointPet;
import com.rewow.commons.domains.generic.PetDTO;
import com.rewow.commons.domains.response.builder.ResponseBuilder;
import com.rewow.entities.DescriptionEntity;
import com.rewow.enums.TransactionState;
import com.rewow.service.Pet.IPetService;
import javassist.NotFoundException;
import org.omg.CORBA.SystemException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = EndpointApi.BASE_PATH)
@CrossOrigin(origins = "*")
public class PetApi {

    private final IPetService petService;

    @Autowired
    public PetApi(IPetService petService) {
        this.petService = petService;
    }

    @ResponseBody
    @PostMapping(IEndpointPet.PET)
    public ResponseEntity<?> createPet(@RequestBody PetDTO petDTO) throws SystemException,
            com.rewow.commons.exceptions.SystemException, NotFoundException {
        PetDTO petResponse = petService.createPet(petDTO);
        return ResponseBuilder.newBuilder()
                .withResponse(petResponse)
                .withPath(IEndpointPet.PET)
                .withMessage("successfully created")
                .withStatus(HttpStatus.CREATED)
                .withTransactionState(TransactionState.OK)
                .buildResponse();
    }

    @ResponseBody
    @GetMapping(IEndpointPet.GET_HISTORICAL)
    public ResponseEntity<?> getHistorical(@PathVariable Integer petId) throws com.rewow.commons.exceptions.SystemException {
        List<DescriptionEntity> response = petService.getHistorical(petId);
        return ResponseBuilder.newBuilder()
                .withResponse(response)
                .withPath(IEndpointPet.PET)
                .withMessage("successfully query")
                .withStatus(HttpStatus.OK)
                .withTransactionState(TransactionState.OK)
                .buildResponse();
    }

}
