package com.bilelmlaouhia.examen_tp_soa.Entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class LigneDevis implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int quantite;
    @ManyToOne (fetch = FetchType.LAZY)
    private Article article;
    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "id_devis")
    private Devis devis;


}
