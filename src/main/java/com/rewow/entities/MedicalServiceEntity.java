package com.rewow.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "medical_service", schema = "public", catalog = "d76p9hqs38cjgf")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MedicalServiceEntity {
    @Id
    @Column(name = "id_service")
    private Integer idService;

    @Basic
    @Column(name = "name_service")
    private String nameService;

}
