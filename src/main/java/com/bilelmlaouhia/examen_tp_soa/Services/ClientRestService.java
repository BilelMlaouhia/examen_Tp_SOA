package com.bilelmlaouhia.examen_tp_soa.Services;

import com.bilelmlaouhia.examen_tp_soa.Entities.Client;
import com.bilelmlaouhia.examen_tp_soa.Entities.Devis;
import com.bilelmlaouhia.examen_tp_soa.Business.Implementation.ClientBusiness_Implementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class ClientRestService {
    @Autowired
    private ClientBusiness_Implementation clientImp;
    @PostMapping ("/clients")
    public Client saveClient(@RequestBody Client c) {
        return clientImp.saveClient(c);
    }

    @GetMapping("/clients")
    public List<Client> getListClient() {
        return clientImp.getListClient();
    }

    @DeleteMapping("/clients/{id}")
    public void deleteClient(@PathVariable("id") String id) {
        clientImp.deleteClient(id);
    }

    @GetMapping("/clients/{id}")
    public Client getClientByCIN( @PathVariable("id") String cin) {
        System.out.println("get client id: "+cin);
        return clientImp.getClientByCIN(cin);
    }

    @GetMapping("/clients/{id}/mesDevis")
    public List<Devis> getAllMyDevis(@PathVariable("id") String cin){

       return clientImp.getClientByCIN(cin).getMesDevis();

    }



}