import java.util.Scanner;

public class Primo{

/*
 * Enunciado: Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
 */
    public static void main(String[] args) {
		int fin=100, contador = 0;
		
		
		for (int x = 0; x <= fin; x++) {
			if (esPrimo(x)) {
				contador++;
				System.out.print(String.valueOf(x) + ",");
			}
		}
		System.out.println("Total numeros primos: "+ contador);
		
	}

	public static boolean esPrimo(int numero) {
		// El 0, 1 y 4 no son primos
		if (numero == 0 || numero == 1 || numero == 4) {
			return false;
		}
		for (int x = 2; x < numero / 2; x++) {
			// Si es divisible por cualquiera de estos números, no
			// es primo
			if (numero % x == 0)
				return false;
		}
		// Si no se pudo dividir por ninguno de los de arriba, sí es primo
		return true;
	}
}