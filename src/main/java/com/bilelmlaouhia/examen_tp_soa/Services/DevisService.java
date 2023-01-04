package com.bilelmlaouhia.examen_tp_soa.Services;

import com.bilelmlaouhia.examen_tp_soa.Business.BusinessInterfaces.DevisBusiness;
import com.bilelmlaouhia.examen_tp_soa.Entities.Devis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DevisService {
    @Autowired
    private DevisBusiness devisImp;

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
    public Devis saveDevis(@RequestBody Devis d) {

        return devisImp.saveDevis(d);
    }

@DeleteMapping("/devis/{id}")
    public void deleteDevis(@PathVariable("id") Long numDevis) {

        devisImp.deleteDevis(numDevis);
    }
}
