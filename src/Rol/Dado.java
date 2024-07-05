package Rol;

import java.util.Arrays;
import java.util.Random;

public class Dado {
	
	// MÉTODOS
	
	/* Los métodos a continuación son estáticos para poder ser llamados desde y en cualquier momento con 
	 * diferentes parámetros para poder efectuar diferentes conbinaciones de tiradas
	 */

	// Metodo para tirar hacer una tirada de dados 
	public static int dado(int numeroDados, int carasDado) {
		Random r = new Random();
		int res = 0;
		for (int i=0; i < numeroDados; i++)
	    	res += r.nextInt(carasDado)+1;
		return res;
	}
	
	// Este método hace una tirada de dados y selecciona y suma las 3 tiradas más altas
	public static int tiradaCaract(int numeroDados, int carasDado) {
		int[] tiradas = new int[numeroDados];
		for(int i = 0; i < tiradas.length; i ++) {
			tiradas[i] = Dado.dado(1, carasDado);
		}	
		// con el metodo sort ordena los valores del array de mayor a menos
		Arrays.sort(tiradas);	
		return tiradas[1] + tiradas[2] + tiradas[3];
		}	
}
