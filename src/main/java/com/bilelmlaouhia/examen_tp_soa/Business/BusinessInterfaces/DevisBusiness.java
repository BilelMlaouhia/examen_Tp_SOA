package com.bilelmlaouhia.examen_tp_soa.Business.BusinessInterfaces;

import com.bilelmlaouhia.examen_tp_soa.Entities.Devis;

import java.util.List;


public interface DevisBusiness {
    Devis getDevisByNumDevis(Long numDevis);
    List<Devis> getAllDevis();
    List<Devis> getAllDevisByClientCin(String cin);
    Devis saveDevis(Devis d);
    void deleteDevis(Long numDevis);


}
