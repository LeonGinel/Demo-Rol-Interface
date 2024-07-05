package Rol;

public class Guerrero extends Profesion{
	
	// CONTRUCTOR
	public Guerrero() {
		super("Guerrero", 1, "D10");
	}

	// MÉTODOS
	public void ataqueFisico() {
		
	}
	
	public void defensaFisica() {
		
	}
	
	@Override
	public String toString() {
		return this.getNombre() + "\n" + this.getNivel() + "\n" + this.getDadovida();
	}
}
