package Rol;

public class Caracteristicas {
	
	// Atributos
	private int fuerza;
	private int destreza;
	private int constitucion;
	private int inteligencia;
	private int sabiduria;
	private int carisma;
	
	private int vida;
	private int defensa;
	
	// Constructor vacío
	public Caracteristicas() {
		super();
		this.fuerza = 0;
		this.destreza = 0;
		this.constitucion = 0;
		this.inteligencia = 0;
		this.sabiduria = 0;
		this.carisma = 0;
		
		}
	
	// Constructor base (SIGUIENTE EJERCICIO)!!!!
	
	/*public Caracteristicas(int fuerza, int destreza, int constitucion, int inteligencia, int sabiduria, int carisma, int vida, int defensa) {
		super();
		this.setFuerza(getFuerza());
		this.setDestreza(getDestreza());
		this.setConstitucion(getConstitucion());
		this.setInteligencia(getInteligencia());
		this.setSabiduria(getSabiduria());
		this.setCarisma(getCarisma());
		
		this.setVida(vida);
		this.setDefensa(defensa);
	}*/
	
	// Getters y Setters
	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	public int getDestreza() {
		return destreza;
	}

	public void setDestreza(int destreza) {
		this.destreza = destreza;
	}

	public int getConstitucion() {
		return constitucion;
	}

	public void setConstitucion(int constitución) {
		this.constitucion = constitución;
	}

	public int getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}

	public int getSabiduria() {
		return sabiduria;
	}

	public void setSabiduria(int sabiduria) {
		this.sabiduria = sabiduria;
	}

	public int getCarisma() {
		return carisma;
	}

	public void setCarisma(int carisma) {
		this.carisma = carisma;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getDefensa() {
		return defensa;
	}

	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}
	
	// Metodo para obtener el valor de cada caracteristica
	public void generarCaracteristicas() {
		
		this.setFuerza(Dado.tiradaCaract(4, 6));
		this.setDestreza(Dado.tiradaCaract(4, 6));
		this.setConstitucion(Dado.tiradaCaract(4, 6));
		this.setInteligencia(Dado.tiradaCaract(4, 6));
		this.setSabiduria(Dado.tiradaCaract(4, 6));
		this.setCarisma(Dado.tiradaCaract(4, 6));
	}
	@Override
	public String toString() {
		return "Fue: " + this.getFuerza() + "\n" +
			   "Des: " + this.getDestreza() + "\n" +
			   "Con: " + this.getConstitucion() + "\n" +
			   "Int: " + this.getInteligencia() + "\n" +
			   "Sab: " + this.getSabiduria() + "\n" +
			   "Car: " + this.getCarisma() + "\n" +
			   "Vida: " + this.getVida() + "\n" +
			   "Defensa: " + this.getDefensa();
	}
}
