package com.bilelmlaouhia.examen_tp_soa.Business.Implementation;

import com.bilelmlaouhia.examen_tp_soa.Entities.Client;
import com.bilelmlaouhia.examen_tp_soa.Business.BusinessInterfaces.ClientBusiness;
import com.bilelmlaouhia.examen_tp_soa.Repositories.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientBusiness_Implementation implements ClientBusiness {


    private final ClientRepository clientRepository;

    public ClientBusiness_Implementation(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

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

    @Override
    public Client getClientByNomAndPassword(String nom, String password) {
        System.out.println("client: "+nom+" pwd: "+password);
        return this.clientRepository.getClientByNomAndPassword(nom,password);
    }


}
