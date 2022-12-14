package com.idat.HospedajeMicroService.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.idat.HospedajeMicroService.dto.TuristaDTO;

@FeignClient(name = "turista-microservice", url="localhost:8090" )
public interface OpenFeignClient {
	@GetMapping("/api/turista/v1/listar") 
	public List<TuristaDTO> listarTuristas();
}
