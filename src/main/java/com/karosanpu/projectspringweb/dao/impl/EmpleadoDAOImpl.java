/**
 * 
 */
package com.karosanpu.projectspringweb.dao.impl;

import org.springframework.stereotype.Repository;

import com.karosanpu.projectspringweb.dao.EmpleadoDAO;

/**
 * @author ksanchezpu
 *
 */
@Repository
public class EmpleadoDAOImpl implements EmpleadoDAO {

	@Override
	public String consultarNombreEmpleado() {
		return "Karina Rocio Sánchez";
	}

}
