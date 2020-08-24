package com.rewow.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "pet_type", schema = "public", catalog = "d76p9hqs38cjgf")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PetTypeEntity {
    @Id
    @Column(name = "id_type")
    private Integer idType;
    @Basic
    @Column(name = "name")
    private String name;

}
