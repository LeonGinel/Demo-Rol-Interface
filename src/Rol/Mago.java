package Rol;

public class Mago extends Profesion{
	
	// Constructor vacío
	public Mago() {
		super("Mago", 1, "D4");
	}
	
	// Metodos de ataque y defensa
	public void ataqueMagico() {
			
	}
		
	public void defensaMagica() {
			
	}
	@Override
	public String toString() {
		return this.getNombre() + "\n" + this.getNivel() + "\n" + this.getDadovida();
	}


	
}
