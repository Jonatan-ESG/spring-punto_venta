package punto_venta.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import punto_venta.model.Celular;

public interface ICelularDAO extends JpaRepository<Celular , Integer> {

}
