package com.danieljojoa.microservicios.app.usuarios.services;
import org.springframework.stereotype.Service;

import com.danieljojoa.microservicios.app.usuarios.models.repository.AlumnoRepository;
import com.danieljojoa.microservicios.commons.services.CommonServiceImpl;

import models.entity.Alumno;
@Service
public class AlumnoServiceImpl extends CommonServiceImpl<Alumno, AlumnoRepository> implements AlumnoService{
	


}
