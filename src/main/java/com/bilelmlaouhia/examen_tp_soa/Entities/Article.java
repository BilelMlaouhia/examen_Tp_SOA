package com.bilelmlaouhia.examen_tp_soa.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Article {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long NumArticle;
    private String libeller;
    private Double prixUnitaire;
    private Integer quantiterEnStock;
    @ManyToOne
    private Client owner;

}
