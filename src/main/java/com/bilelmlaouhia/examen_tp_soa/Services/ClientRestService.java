package com.bilelmlaouhia.examen_tp_soa.Services;

import com.bilelmlaouhia.examen_tp_soa.Entities.Client;
import com.bilelmlaouhia.examen_tp_soa.Entities.Devis;
import com.bilelmlaouhia.examen_tp_soa.Metier.ClientImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class ClientRestService {
    @Autowired
    private ClientImp clientImp;
    @PostMapping ("/clients")
    public Client saveClient(@RequestBody Client c) {
        return clientImp.saveClient(c);
    }

    @GetMapping("/clients")
    public List<Client> getListClient() {
        return clientImp.getListClient();
    }

    @DeleteMapping("/clients/id")
    public void deleteClient(@PathParam("id") String id) {
        clientImp.deleteClient(id);
    }

    @GetMapping("/clients/id")
    public Client getClientByCIN( @PathParam("id") String cin) {
        return clientImp.getClientByCIN(cin);
    }

    @GetMapping("/clients/id/mesDevis")
    public List<Devis> getAllMyDevis(@PathParam("id") String cin){
        return clientImp.getClientByCIN(cin).getMesDevis();
    }



}
