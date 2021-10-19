package punto_venta.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import punto_venta.dao.ICelularDAO;
import punto_venta.model.Celular;
import punto_venta.service.ICelularService;

@Service
public class CelularServiceImpl implements ICelularService {

	@Autowired
	private ICelularDAO dao;	
	
	@Override
	public Celular registrar(Celular t) {
		return dao.save(t);
	}

	@Override
	public Celular modificar(Celular t) {
		return dao.save(t);
	}

	@Override
	public void eliminar(int id) {
		dao.deleteById(id);		
	}

	@Override
	public Optional<Celular> listarPorId(int id) {
		return dao.findById(id);
	}

	@Override
	public List<Celular> listar() {
		return dao.findAll();
	}

}
