package com.bilelmlaouhia.examen_tp_soa.Business.InterfacesMetier;

import com.bilelmlaouhia.examen_tp_soa.Entities.Devis;

import java.util.List;


public interface DevisBusiness {
   public Devis getDevisByNumDevis(Long numDevis);
   public List<Devis> getAllDevis();
   public List<Devis> getAllDevisByClientCin(String cin);
  // public List<Devis> getAllDevisContainArticle(List<Article> la);
   public Devis saveDevis(Devis d);
   public void deleteDevis(Long numDevis);


}
