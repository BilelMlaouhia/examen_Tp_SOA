package com.bilelmlaouhia.examen_tp_soa.Business.Implementation;

import com.bilelmlaouhia.examen_tp_soa.Entities.Client;
import com.bilelmlaouhia.examen_tp_soa.Entities.Devis;
import com.bilelmlaouhia.examen_tp_soa.Business.InterfacesMetier.DevisBusiness;
import com.bilelmlaouhia.examen_tp_soa.Repositories.ClientRepository;
import com.bilelmlaouhia.examen_tp_soa.Repositories.DevisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DevisBusiness_Implementation implements DevisBusiness {

    @Autowired
    private DevisRepository devisRepository;
    @Autowired
    private ClientRepository clientRepository;
    @Override
    public Devis getDevisByNumDevis(Long numDevis) {
        return devisRepository.findById(numDevis).get();
    }

    @Override
    public List<Devis> getAllDevis() {
        return devisRepository.findAll();
    }

    @Override
    public List<Devis> getAllDevisByClientCin(String cin) {
        Client c = clientRepository.findById(cin).get();
        return devisRepository.findAllByOwner(c);
    }

    /*
    @Override
    public List<Devis> getAllDevisContainArticle(List<Article> la) {
        return devisRepository.findAllByListArticles(la);
    }

     */

    @Override
    public Devis saveDevis(Devis d) {
        return devisRepository.save(d);
    }

    @Override
    public void deleteDevis(Long numDevis) {
        devisRepository.deleteById(numDevis);
    }
}
