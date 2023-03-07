package com.bilelmlaouhia.examen_tp_soa.Business.Implementation;

import com.bilelmlaouhia.examen_tp_soa.Entities.Client;
import com.bilelmlaouhia.examen_tp_soa.Entities.Devis;
import com.bilelmlaouhia.examen_tp_soa.Business.BusinessInterfaces.DevisBusiness;
import com.bilelmlaouhia.examen_tp_soa.Repositories.ClientRepository;
import com.bilelmlaouhia.examen_tp_soa.Repositories.DevisRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DevisBusiness_Implementation implements DevisBusiness {

    private final DevisRepository devisRepository;
    private final ClientRepository clientRepository;

    public DevisBusiness_Implementation(DevisRepository devisRepository, ClientRepository clientRepository) {
        this.devisRepository = devisRepository;
        this.clientRepository = clientRepository;
    }

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
        System.out.println("CIN is: "+cin);
        Client c = clientRepository.findById(cin).get();
        return devisRepository.findAllByOwner(c);
    }
    @Override
    public Devis saveDevis(Devis d) {
        System.out.println(" devis depuis:  "+d);
        return devisRepository.save(d);
    }

    @Override
    public void deleteDevis(Long numDevis) {
        devisRepository.deleteById(numDevis);
    }


}
