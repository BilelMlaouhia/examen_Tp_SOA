package com.bilelmlaouhia.examen_tp_soa.Entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity
@Getter
@Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class Article implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long NumArticle;
    private String libeller;
    private Double prixUnitaire;
    private Integer quantiterEnStock;
    private String image;

    @OneToMany(mappedBy = "article")
    private List<LigneDevis> ligneDevis;

}
