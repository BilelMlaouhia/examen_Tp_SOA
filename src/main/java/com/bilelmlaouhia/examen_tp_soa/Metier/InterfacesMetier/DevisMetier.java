package com.bilelmlaouhia.examen_tp_soa.Metier.InterfacesMetier;

import com.bilelmlaouhia.examen_tp_soa.Entities.Article;
import com.bilelmlaouhia.examen_tp_soa.Entities.Devis;
import com.bilelmlaouhia.examen_tp_soa.Repositories.DevisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface DevisMetier {
   public Devis getDevisByNumDevis(Long numDevis);
   public List<Devis> getAllDevis();
   public List<Devis> getAllDevisByClientCin(String cin);
  // public List<Devis> getAllDevisContainArticle(List<Article> la);
   public Devis saveDevis(Devis d);
   public void deleteDevis(Long numDevis);


}
