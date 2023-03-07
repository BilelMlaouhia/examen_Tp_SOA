package com.bilelmlaouhia.examen_tp_soa.Business.BusinessInterfaces;

import com.bilelmlaouhia.examen_tp_soa.Entities.Client;

import java.util.List;

public interface ClientBusiness {

     Client saveClient(Client c);
     List<Client> getListClient();
     void deleteClient(String id);
     Client getClientByCIN(String cin);
     Client getClientByNomAndPassword(String nom,String password);
}
