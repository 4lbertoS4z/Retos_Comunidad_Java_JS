import java.util.Scanner;
import java.text.Normalizer;
import javax.swing.event.SwingPropertyChangeSupport;

		/*
 * Reto #12
 * ¿ES UN PALÍNDROMO?
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe una función que reciba un texto y retorne verdadero o falso (Boolean) según sean o no palíndromos.
 * Un Palíndromo es una palabra o expresión que es igual si se lee de izquierda a derecha que de derecha a izquierda.
 * NO se tienen en cuenta los espacios, signos de puntuación y tildes.
 * Ejemplo: Ana lleva al oso la avellana.
 *
 
 */
public class Palindromo {
    public static void main(String[] args) {

		esPalindromo();	
	}

    public static void esPalindromo(){
        boolean palindromo=true;
		int ini=0;
        Scanner teclado =new Scanner(System.in);
		String frase;
		
		System.out.println("Dime una cadena");
		frase=teclado.nextLine();
        frase=frase.toLowerCase();
        frase = Normalizer.normalize(frase, Normalizer.Form.NFD);
        frase = frase.replaceAll("[\\p{InCombiningDiacriticalMarks}]", " ");
		frase=frase.replaceAll(" ", "");
		frase=frase.replaceAll(".","");
		
		int fin=frase.length()-1;
		while(ini<fin) {
			if(frase.charAt(ini)!=frase.charAt(fin)) {
				palindromo=false;
			}
			ini++;
			fin--;
		}
		if(palindromo) {
			System.out.println("palabra palindroma");
		}else {
			System.out.println("palabra no palindroma");
		}
        teclado.close();
    }
}

