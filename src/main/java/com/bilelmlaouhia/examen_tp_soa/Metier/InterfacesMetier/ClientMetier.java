package com.bilelmlaouhia.examen_tp_soa.Metier.InterfacesMetier;

import com.bilelmlaouhia.examen_tp_soa.Entities.Client;

import java.util.List;

public interface ClientMetier {

    public Client saveClient(Client c);
    public List<Client> getListClient();
    public void deleteClient(String id);
    public Client getClientByCIN(String cin);
}
