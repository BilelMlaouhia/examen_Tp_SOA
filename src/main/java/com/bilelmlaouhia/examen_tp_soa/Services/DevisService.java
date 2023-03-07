package com.bilelmlaouhia.examen_tp_soa.Services;


import com.bilelmlaouhia.examen_tp_soa.Business.BusinessInterfaces.DevisBusiness;
import com.bilelmlaouhia.examen_tp_soa.Entities.Client;
import com.bilelmlaouhia.examen_tp_soa.Entities.Devis;
import com.bilelmlaouhia.examen_tp_soa.Repositories.ClientRepository;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class DevisService {
    private final DevisBusiness devisImp;
    private final ClientRepository clientRepository;

    public DevisService(DevisBusiness devsImp, ClientRepository clientRepository) {
        this.devisImp = devsImp;
        this.clientRepository = clientRepository;
    }

    @GetMapping("/devis/{id}")
    public Devis getDevisByNumDevis(@PathVariable("id") Long numDevis) {

        return devisImp.getDevisByNumDevis(numDevis);
    }

    @GetMapping("/devis")
    public List<Devis> getAllDevis() {

        return devisImp.getAllDevis();
    }

    @GetMapping("/devis/client/{cin}")
    public List<Devis> getAllDevisByClientCin(@PathVariable("cin") String cin) {
        return devisImp.getAllDevisByClientCin(cin);
    }

    @PostMapping("/devis")
    public Devis saveDevis(@RequestBody Devis devis) {

        Devis d = Devis.builder()
                .numDevis(0L)
                .dateCreation(new Date())
                .owner(new Client("112233"))
                .devisList(new ArrayList<>())

                .build();
        System.out.println(d);
      return devisImp.saveDevis(d);


    }

@DeleteMapping("/devis/{id}")
    public void deleteDevis(@PathVariable("id") Long numDevis) {

        devisImp.deleteDevis(numDevis);
    }
}
