package com.rewow.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "clinical_history", schema = "public", catalog = "d76p9hqs38cjgf")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClinicalHistoryEntity {
    @Id
    @Column(name = "id_history")
    private Integer idHistory;

    @Basic
    @Column(name = "pet_id_pet")
    private Integer petIdPet;

}
