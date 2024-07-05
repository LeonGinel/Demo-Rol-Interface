package Rol;

import java.util.Arrays;
import java.util.Random;

public class Dado {
	
	public static int dado(int d, int c) {
		Random r = new Random();
		int res = 0;
		for (int i=0; i < d; i++)
	    	res += r.nextInt(c)+1;
		return res;
	}
	
		public static int tiradaCaract(int numeroDados, int carasDado) {
			int[] tiradas = new int[numeroDados];
			for(int i = 0; i < tiradas.length; i ++) {
				tiradas[i] = Dado.dado(1, carasDado);
			}
			
			Arrays.sort(tiradas);
			
			return tiradas[1] + tiradas[2] + tiradas[3];
		}	
}
