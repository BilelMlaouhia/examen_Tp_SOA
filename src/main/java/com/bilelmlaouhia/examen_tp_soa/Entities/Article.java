package com.bilelmlaouhia.examen_tp_soa.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Article {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long NumArticle;
    private String libeller;
    private Double prixUnitaire;
    private Integer quantiterEnStock;
    /*
    @ManyToOne
    @JsonIgnore
    @JsonSetter
    private Client owner;

     */
    @ManyToOne
    @JsonIgnore
    @JsonSetter
    private Devis devis;

}
