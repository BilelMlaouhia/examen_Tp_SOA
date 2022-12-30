package com.bilelmlaouhia.examen_tp_soa.Business.Implementation;

import com.bilelmlaouhia.examen_tp_soa.Entities.Client;
import com.bilelmlaouhia.examen_tp_soa.Business.InterfacesMetier.ClientBusiness;
import com.bilelmlaouhia.examen_tp_soa.Repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientBusiness_Implementation implements ClientBusiness {


    @Autowired
    ClientRepository clientRepository;
    @Override
    public Client saveClient(Client c) {
        return this.clientRepository.save(c);
    }

    @Override
    public List<Client> getListClient() {
        return this.clientRepository.findAll();
    }

    @Override
    public void deleteClient(String id) {
        Client c =this.clientRepository.findById(id).get();
        this.clientRepository.delete(c);
    }

    @Override
    public Client getClientByCIN(String cin) {
        return this.clientRepository.findById(cin).get();
    }


}
