/**
 * 
 */
package com.karosanpu.projectspringweb.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.karosanpu.projectspringweb.dao.EmpleadoDAO;
import com.karosanpu.projectspringweb.services.SpringService;

/**
 * @author ksanchezpu
 *
 */
@Service
public class SpringServiceImpl implements SpringService {

	@Autowired
	private EmpleadoDAO empleadoDAOImpl;
	
	@Override
	public String mostrarNombreEmpresa() {
		return "Anotaciones con Spring y JSF";
	}

	@Override
	public String mostrarNombreEmpleado() {
		return this.empleadoDAOImpl.consultarNombreEmpleado();
	}

}
