package punto_venta.service;


import java.util.List;

import punto_venta.model.Menu;



public interface IMenuService extends ICRUD<Menu>{
	
	List<Menu> listarMenuPorUsuario(String nombre);
}
