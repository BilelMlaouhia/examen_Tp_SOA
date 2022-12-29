package com.bilelmlaouhia.examen_tp_soa.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Client {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cin;
    private String nom;
    private String prenom;
    private String adress;
    private String tel;
    @OneToMany
    private List<Devis> mesDevis = new ArrayList<>();
}
