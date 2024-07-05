package Rol;

public abstract class Profesion {
	
	// Atributos
	private String nombre;
	private int nivel;
	private String dadovida;
	
	// Constructor vacío
	public Profesion() {
		super();
		
	}
	
	// Constructor
	public Profesion(String nombre, int nivel, String dadovida) {
		this.nombre = nombre;
		this.nivel = nivel;
		this.dadovida = dadovida;
	}
	
	// Getters y Setters
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
	@Override
	public String toString() {
		return this.getNivel() + "\n" + this.getDadovida();
	}
}
