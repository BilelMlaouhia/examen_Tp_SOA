package com.bilelmlaouhia.examen_tp_soa.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Client {
    @Id
    private String cin;
    private String nom;
    private String prenom;
    private String adress;
    private String tel;

    @OneToMany
    @JsonIgnore
    @JsonSetter
    private List<Devis> mesDevis = new ArrayList<>();
}
