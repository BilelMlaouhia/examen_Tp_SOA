package com.bilelmlaouhia.examen_tp_soa.Entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;



@Data @AllArgsConstructor @NoArgsConstructor
public class DevisDto {

    private Long numDevis;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dateCreation;


    private List<Article> listArticles;


    private String ownerCin;


}
