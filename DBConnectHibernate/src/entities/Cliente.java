package entities;

public class Cliente {
	private Integer dni;
	private String nombre;
	private Integer edad;

	
	public Cliente(){}
	
	public Cliente(Integer dni, String nombre, Integer edad) {
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "DNI: " + getDni() + " Nombre: " + getNombre() + " Edad: " + getEdad();
	}

}
