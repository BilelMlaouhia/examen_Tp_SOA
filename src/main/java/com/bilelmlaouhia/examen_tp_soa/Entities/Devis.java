package com.bilelmlaouhia.examen_tp_soa.Entities;

import com.bilelmlaouhia.examen_tp_soa.Entities.Article;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Devis {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numDevis;
    private Date dateCreation;
    @OneToMany
    private List<Article> listeArticles;


}
