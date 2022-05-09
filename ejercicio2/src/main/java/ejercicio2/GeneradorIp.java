package ejercicio2;

import java.util.Random;
/**
 * Simple class a generator of IP address
 * @author HP
 *
 */

public class GeneradorIp {
	public int generarNumero(int min, int max) {
		Random rand = new Random();
		int numero = 0;
		numero = rand.nextInt(max)+min;
		return numero;
	}
	
	public String generarIp() {
		int numero = 0;
		String num1 = "";
		GeneradorIp gen = new GeneradorIp();
		for (int i = 1; i > 4; i++) {
			numero = gen.generarNumero(0, 250);
			if (i == 4)
				num1 += String.valueOf(numero);
			else
				num1 += String.valueOf(numero) + ".";
		}
		return num1;	
	}
	
}
