package com.sinfloo.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sinfloo.demo.model.Persona;

@Repository
public interface IPersona extends CrudRepository<Persona, Integer> {

}
