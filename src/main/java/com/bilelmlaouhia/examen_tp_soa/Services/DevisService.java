package com.bilelmlaouhia.examen_tp_soa.Services;

import com.bilelmlaouhia.examen_tp_soa.Entities.Article;
import com.bilelmlaouhia.examen_tp_soa.Entities.Devis;
import com.bilelmlaouhia.examen_tp_soa.Metier.DevisImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class DevisService {
    @Autowired
    private DevisImp devisImp;

    @GetMapping("/devis/id")
    public Devis getDevisByNumDevis(@PathParam("id") Long numDevis) {
        return devisImp.getDevisByNumDevis(numDevis);
    }

    @GetMapping("/devis")
    public List<Devis> getAllDevis() {
        return devisImp.getAllDevis();
    }

    @GetMapping("/devis/client/cin")
    public List<Devis> getAllDevisByClientCin(@PathParam("cin") String cin) {
        return devisImp.getAllDevisByClientCin(cin);
    }
/*
    @GetMapping("/devis/list")
    public List<Devis> getAllDevisContainArticle(@RequestBody List<Article> la) {
        return devisImp.getAllDevisContainArticle(la);
    }

 */

    @PostMapping("/devis")
    public Devis saveDevis(@RequestBody Devis d) {
        return devisImp.saveDevis(d);
    }

@DeleteMapping("/devis/id")
    public void deleteDevis(@PathParam("id") Long numDevis) {
        devisImp.deleteDevis(numDevis);
    }
}
