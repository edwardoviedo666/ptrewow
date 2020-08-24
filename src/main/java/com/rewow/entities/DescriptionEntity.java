package com.rewow.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "description", schema = "public", catalog = "d76p9hqs38cjgf")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor

public class DescriptionEntity {
    @Id
    @Column(name = "id_description")
    private Integer idDescription;
    @Basic
    @Column(name = "text_description")
    private String textDescription;
    @Basic
    @Column(name = "date_description")
    private String dateDescription;
    @Basic
    @Column(name = "clinical_history_id_history")
    private Integer clinicalHistoryIdHistory;
    @Basic
    @Column(name = "medical_service_id_Service")
    private Integer medicalServiceIdService;


}
