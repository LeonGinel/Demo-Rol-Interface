package Rol;

public class Raza {
	
	// ATRIBUTOS
	private String nombre;
	private String caracteristicaBonificacion;
	private int bonificador;
	
	// CONTRUCTORES
	public Raza() {
		super();
	}
	
	public Raza(String nombre, String caracteristicaBonificacion, int bonificador) {
		super();
		this.nombre = nombre;
		this.caracteristicaBonificacion = caracteristicaBonificacion;
		this.bonificador = bonificador;
	}

	// GETTERS AND SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCaracteristicaBonificacion() {
		return caracteristicaBonificacion;
	}

	public void setCaracteristicaBonificacion(String caracteristicaBonificacion) {
		this.caracteristicaBonificacion = caracteristicaBonificacion;
	}

	public int getBonificador() {
		return bonificador;
	}

	public void setBonificador(int bonificador) {
		this.bonificador = bonificador;
	}
	
	// MÉTODO toString
	@Override
	public String toString() {
		return this.getNombre() + "\n" + this.getCaracteristicaBonificacion() + ": " + this.getBonificador();
	}
}
