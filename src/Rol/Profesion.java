package Rol;

public abstract class Profesion {
	
	// ATRIBUTOS
	private String nombre;
	private int nivel;
	private String dadovida;
	
	// CONTRUCTORES
	public Profesion() {
		super();
		
	}

	public Profesion(String nombre, int nivel, String dadovida) {
		this.nombre = nombre;
		this.nivel = nivel;
		this.dadovida = dadovida;
	}
	
	// GETTERS AND SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public String getDadovida() {
		return dadovida;
	}

	public void setDadovida(String dadovida) {
		this.dadovida = dadovida;
	}
	
	// MÉTODO toString
	@Override
	public String toString() {
		return this.getNivel() + "\n" + this.getDadovida();
	}
}
