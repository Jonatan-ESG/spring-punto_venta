package punto_venta.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import punto_venta.model.Celular;
import punto_venta.service.ICelularService;

@RestController
@RequestMapping("/ver_celular")
public class VerCelularesController {
	@Autowired
	private ICelularService service;
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE) public
	 ResponseEntity<List<Celular>> listar(){ 
		return new ResponseEntity<List<Celular>>(service.listar(), HttpStatus.OK); 
	 }
}
