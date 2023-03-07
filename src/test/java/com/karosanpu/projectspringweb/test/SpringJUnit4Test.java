/**
 * 
 */
package com.karosanpu.projectspringweb.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.karosanpu.projectspringweb.services.SpringService;

/**
 * @author DevPredator
 * Clase de Prueba Unitaria con Spring y JUNIT 4.
 * NOTA: No tiene soporte Spring Test para JUnit5.
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext-test.xml"})
public class SpringJUnit4Test {

	@Autowired
	private SpringService springServiceImpl;
	
	@Test
	public void test() {
		assertNotNull(this.springServiceImpl);
		System.out.println(this.springServiceImpl.mostrarNombreEmpleado());
	}

}
