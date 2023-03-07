package com.bilelmlaouhia.examen_tp_soa.Entities;
import lombok.*;


import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Client implements Serializable {
    public Client(String cin) {
        this.cin = cin;
    }

    @Id
    private String cin;
    private String nom;
    private String prenom;
    private String adress;
    private String tel;
    private String password;
    private String role;

    @OneToMany (mappedBy ="owner",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Devis> mesDevis = new ArrayList<>();
}
