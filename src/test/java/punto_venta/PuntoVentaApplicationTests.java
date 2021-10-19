package punto_venta;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import static org.junit.jupiter.api.Assertions.assertTrue;


import punto_venta.dao.IUsuarioDAO;
import punto_venta.model.Usuario;

@SpringBootTest
class PuntoVentaApplicationTests {

	@Autowired
	private IUsuarioDAO dao;
	
	@Autowired
	private BCryptPasswordEncoder bcrypt;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	public void crearUsuario() {
	
		/*
		Usuario us = new Usuario();
		us.setIdUsuario(1);
		us.setUsername("administrador");
		us.setPassword(bcrypt.encode("adM1nP4s$"));
		us.setEnabled(true);
		
		Usuario retorno = dao.save(us);		
		
		assertTrue(retorno.getPassword().equalsIgnoreCase(us.getPassword()));*/
	}

}
