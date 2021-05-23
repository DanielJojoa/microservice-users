package com.danieljojoa.microservicios.app.usuarios.models.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import models.entity.Alumno;
@Repository
public interface AlumnoRepository extends CrudRepository<Alumno, Long> {

}
