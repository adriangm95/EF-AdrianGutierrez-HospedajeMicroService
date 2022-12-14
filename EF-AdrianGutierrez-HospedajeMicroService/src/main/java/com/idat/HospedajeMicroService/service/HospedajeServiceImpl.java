package com.idat.HospedajeMicroService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.HospedajeMicroService.client.OpenFeignClient;
import com.idat.HospedajeMicroService.dto.TuristaDTO;
import com.idat.HospedajeMicroService.model.HospedajeDetalle;
import com.idat.HospedajeMicroService.model.TuristaHospedajeFK;
import com.idat.HospedajeMicroService.repository.DetalleHospedajeRepository;
import com.idat.HospedajeMicroService.repository.HospedajeRepository;
import com.idat.HospedajeMicroService.service.HospedajeService;
@Service
public class HospedajeServiceImpl implements HospedajeService{
	@Autowired
	private DetalleHospedajeRepository detalleRepo;
	
	@Autowired
	private OpenFeignClient client;
	
	@Override
	public void asignarTuristaHospedaje() {
	
		List<TuristaDTO> listado = client.listarTuristas();
		TuristaHospedajeFK fk = null;
		HospedajeDetalle detalle = null;
		
		for (TuristaDTO turistaDTO : listado) {
			fk = new TuristaHospedajeFK();
			fk.setIdTurista(turistaDTO.getCod());
			fk.setIdHospedaje(2);
			
			detalle = new HospedajeDetalle();
			detalle.setFk(fk);			
			detalleRepo.save(detalle);
	   }	
	}
}
