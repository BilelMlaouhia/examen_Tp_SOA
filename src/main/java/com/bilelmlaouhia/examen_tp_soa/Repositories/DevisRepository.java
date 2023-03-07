package com.bilelmlaouhia.examen_tp_soa.Repositories;

import com.bilelmlaouhia.examen_tp_soa.Entities.Client;
import com.bilelmlaouhia.examen_tp_soa.Entities.Devis;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DevisRepository extends JpaRepository<Devis,Long> {
    public List<Devis> findAllByOwner(Client c);
}
