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
public class PetSizeDTO implements Serializable {
    private Integer idSize;
    private String name;


}
