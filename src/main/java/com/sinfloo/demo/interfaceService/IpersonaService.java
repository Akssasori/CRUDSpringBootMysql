package com.sinfloo.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.sinfloo.demo.model.Persona;

public interface IpersonaService {
	
	public interface IpersonaServiceo{
		public List<Persona>listar();
		public Optional<Persona>listarId(int id);
		public int save(Persona p);
		public void delete(int id);
		
		
	}

	List<Persona> listar();
	
	Optional<Persona> listarId(int id);
	
	int Save(Persona p);
	
	void delete(int id);
	

}
