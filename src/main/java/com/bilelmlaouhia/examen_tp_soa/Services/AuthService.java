package com.bilelmlaouhia.examen_tp_soa.Services;

import com.bilelmlaouhia.examen_tp_soa.Business.BusinessInterfaces.ClientBusiness;
import com.bilelmlaouhia.examen_tp_soa.Entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthService {

    private final ClientBusiness clientBusiness;

    public AuthService(ClientBusiness clientBusiness) {
        this.clientBusiness = clientBusiness;
    }

    @PostMapping("/auth")
    public String isAuth(@RequestParam(name = "nom") String clientName, @RequestParam(name = "password") String clientPassword){
        Client c = this.clientBusiness.getClientByNomAndPassword(clientName,clientPassword);
        if(c!=null){
            return "wlc"+c.getPrenom()+"to"+c.getCin();
        }
        return null;
    }
}
