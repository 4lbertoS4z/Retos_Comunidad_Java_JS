/*
 * Reto #1
 * ¿ES UN ANAGRAMA?
 * Fecha publicación enunciado: 03/01/22
 * Fecha publicación resolución: 10/01/22
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe una función que reciba dos palabras (String) y retorne verdadero o falso (Boolean) según sean o no anagramas.
 * Un Anagrama consiste en formar una palabra reordenando TODAS las letras de otra palabra inicial.
 * NO hace falta comprobar que ambas palabras existan.
 * Dos palabras exactamente iguales no son anagrama.
 *

 */

 public class Anagrama{

    public static void main(String[] args) {
        isAnagrama("hoLa","Aloh");
    }

    public static void isAnagrama(String palabra1,String palabra2){
        
       
       
        palabra1=palabra1.toLowerCase();
        palabra2=palabra2.toLowerCase();
         
        //valida si tienen el mismo tamaño
        if(palabra1.length()==palabra2.length()){
         
          //recorre el largo de la primera palabra
          for(int i = 0;i<palabra1.length();i++){
         
            //si la segunda palabra no contiene algun caracter de la primera, no es un anagrama y termina
            if(!palabra2.contains(String.valueOf(palabra1.charAt(i)))){
              System.out.println("NO es un anagrama");
              return;
            }
          }
         
          //Si nada falló hasta aqui, probablemente es un anagrama
          System.out.println("SI es un anagrama");
        }
        else{
          System.out.println("La cantidad de caracteres es diferente!");
        }
    }

 }