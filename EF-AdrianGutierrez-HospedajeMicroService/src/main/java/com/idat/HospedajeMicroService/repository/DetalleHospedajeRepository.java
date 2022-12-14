package com.idat.HospedajeMicroService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.HospedajeMicroService.model.HospedajeDetalle;

@Repository
public interface DetalleHospedajeRepository extends JpaRepository<HospedajeDetalle, Integer>{

}
