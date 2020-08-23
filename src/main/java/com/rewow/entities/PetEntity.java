package com.rewow.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "pet", schema = "public", catalog = "d76p9hqs38cjgf")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PetEntity {
    @Id
    @Column(name = "id_pet")
    private Integer idPet;

    @Basic
    @Column(name = "owner_name")
    private String ownerName;

    @Basic
    @Column(name = "pet_name")
    private String petName;

    @Basic
    @Column(name = "age")
    private Integer age;

}
