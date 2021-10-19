package punto_venta.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Información del Celular")
@Entity
@Table(name = "celular")
public class Celular {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id_celular;

	@ApiModelProperty(notes = "Nombre de celular debe tener al menos 8")
	@Size(min = 8, max = 50, message = "nombres minimo 8 caracteres")
	@Column(name = "nombre", nullable = false, length = 50)
	String nombre;
	
	@ApiModelProperty(notes = "Es el código de barras del celular")
	@Column(name = "codigo", nullable = false, unique=true)
	String codigo;
	
	@ApiModelProperty(notes = "El precio con 2 decimales")
	@Digits(integer=10, fraction=2)
	@Column(name = "precio", nullable = false)
	Float precio;
	
	@ApiModelProperty(notes = "Existe el producto en Stock (S/N)")
	@Column(name = "disponibilidad", nullable = false, length = 1)
	String disponibilidad;

	public Integer getId() {
		return id_celular;
	}

	public void setId(Integer id_celular) {
		this.id_celular = id_celular;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	public String getDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(String disponibilidad) {
		this.disponibilidad = disponibilidad;
	}
	

}