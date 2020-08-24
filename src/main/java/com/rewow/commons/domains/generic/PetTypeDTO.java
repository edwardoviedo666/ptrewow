package com.rewow.commons.domains.generic;

import lombok.*;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
@Builder
@ToString
public class PetTypeDTO implements Serializable {
    private Integer idType;
    private String name;
}
