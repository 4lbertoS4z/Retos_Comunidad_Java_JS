/*
 * Reto #14
 * ¿ES UN NÚMERO DE ARMSTRONG?
 * Fecha publicación enunciado: 04/04/22
 * Fecha publicación resolución: 11/04/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Escribe una función que calcule si un número dado es un número de Amstrong (o también llamado narcisista).
 * Si no conoces qué es un número de Armstrong, debes buscar información al respecto.
 */


class NumeroArmstrong{ 
    
    boolean comprobarArmstrong(int x){ 
        int l = 0, n = x; 
        while(n!=0){ 
            l++; 
            n = n/10; 
        }
        int suma=0;
        int numero = x;
        while(numero!=0){ 
            int digit = numero%10; 
            suma += Math.pow(digit, l); 
            numero = numero/10; 
        }
        return(suma == x); 
    } 
  
    public static void main(String[] args){ 
        NumeroArmstrong n = new NumeroArmstrong(); 
        int numeroPosible = 1634; 
        if(n.comprobarArmstrong(numeroPosible))
            System.out.println("Si es un número Armstrong");
        else
            System.out.println("No es un número Armstrong");
    } 
}