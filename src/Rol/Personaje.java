package Rol;

public class Personaje {
	
	// Atributos
	private String nombre;
	private Caracteristicas caracteristicas;
	private Profesion profesion;
	private Raza raza;
	private Boolean jugador;
	
	// Constructores 
	public Personaje() {
		super();
	}
	
	// Constructor 1
	public Personaje(String nombre, Caracteristicas caracteristicas, Profesion profesion, Raza raza) {
		this.nombre = nombre;
		this.profesion = profesion;
		this.raza = raza;
	}
	
	// Constructor 2
	public Personaje(String nombre, Caracteristicas caracteristicas, Profesion profesion, Raza raza, Boolean jugador) {
		this.nombre = nombre;
		this.caracteristicas = caracteristicas;
		this.profesion = profesion;
		this.raza = raza;
		this.jugador = jugador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Caracteristicas getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(Caracteristicas caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	public Profesion getProfesion() {
		return profesion;
	}

	public void setProfesion(Profesion profesion) {
		this.profesion = profesion;
	}

	public Raza getRaza() {
		return raza;
	}

	public void setRaza(Raza raza) {
		this.raza = raza;
	}

	public Boolean getJugador() {
		return jugador;
	}

	public void setJugador(Boolean jugador) {
		this.jugador = jugador;
	}
	
	//toString override
	@Override
	public String toString() {
		return "Nombre: " + this.getNombre() + "\n" + 
			   "Características: " + this.getCaracteristicas().toString() + "\n" + 
			   "Profesión: " + this.getProfesion() + "\n" + 
			   "Raza: " + this.getRaza() + "\n" + 
			   "Jugador: " + this.getJugador();
	}

}
