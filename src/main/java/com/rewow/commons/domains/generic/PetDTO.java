package com.rewow.commons.domains.generic;

import lombok.*;

import javax.xml.bind.annotation.XmlRootElement;

@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
@Builder
@ToString
public class PetDTO {
    private Integer idPet;
    private String ownerName;
    private String petName;
    private Integer age;
}
