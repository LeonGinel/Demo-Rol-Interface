package Rol;

public class Guerrero extends Profesion{
	
	// Constructor vacío
	public Guerrero() {
		super("Guerrero", 1, "D10");
	}

	// Metodos de ataque y defensa
	public void ataqueFisico() {
		
	}
	
	public void defensaFisica() {
		
	}
	@Override
	public String toString() {
		return this.getNombre() + "\n" + this.getNivel() + "\n" + this.getDadovida();
	}
}
