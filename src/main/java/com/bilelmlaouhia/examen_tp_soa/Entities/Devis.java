package com.bilelmlaouhia.examen_tp_soa.Entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Devis {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numDevis;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dateCreation;

    @OneToMany
    @JsonIgnore
    @JsonSetter
    private List<Article> listArticles;

    @ManyToOne
    // @JsonIgnore
   // @JsonSetter
    private Client owner;


}
