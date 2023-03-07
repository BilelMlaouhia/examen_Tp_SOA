package com.bilelmlaouhia.examen_tp_soa.Entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;


@Entity
@Getter
@Setter
@AllArgsConstructor @NoArgsConstructor
@ToString
@Builder
public class Devis implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numDevis;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dateCreation;

//    @OneToMany (mappedBy = "NumArticle",fetch = FetchType.LAZY)
//    private List<Article> listArticles;

    @ManyToOne (fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "cin")
    private Client owner;
    @OneToMany(mappedBy = "devis")
    private List<LigneDevis> devisList;


}
