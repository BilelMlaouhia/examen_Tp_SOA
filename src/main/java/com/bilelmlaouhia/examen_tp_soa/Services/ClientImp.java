package com.bilelmlaouhia.examen_tp_soa.Services;

import com.bilelmlaouhia.examen_tp_soa.Repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ClientImp {

    ClientRepository clientRepository;
    public ClientImp(ClientRepository clientRepository){
        this.clientRepository = clientRepository;
    }




}
