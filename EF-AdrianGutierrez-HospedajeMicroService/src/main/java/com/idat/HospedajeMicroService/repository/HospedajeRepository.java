package com.idat.HospedajeMicroService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.HospedajeMicroService.model.Hospedaje;
@Repository
public interface HospedajeRepository extends JpaRepository<Hospedaje, Integer>{

}
