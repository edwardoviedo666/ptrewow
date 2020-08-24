package com.rewow.entities;

import lombok.AllArgsConstructor;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "pet_size", schema = "public", catalog = "d76p9hqs38cjgf")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor

public class PetSizeEntity {
    @Id
    @Column(name = "id_size")
    private Integer idSize;
    @Basic
    @Column(name = "name")
    private String name;


}
