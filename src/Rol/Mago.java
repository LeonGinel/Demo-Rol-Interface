package Rol;

public class Mago extends Profesion{
	
	// CONSTRUCTOR
	public Mago() {
		super("Mago", 1, "D4");
	}
	
	// MÉTODOS
	public void ataqueMagico() {
			
	}
		
	public void defensaMagica() {
			
	}
	
	@Override
	public String toString() {
		return this.getNombre() + "\n" + this.getNivel() + "\n" + this.getDadovida();
	}


	
}
