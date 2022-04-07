/*
 * Reto #13
 * FACTORIAL RECURSIVO
 * Fecha publicación enunciado: 28/03/22
 * Fecha publicación resolución: 04/04/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Escribe una función que calcule y retorne el factorial de un número dado de forma recursiva.
 *
 */

class Factorial{
    int factorialRecursivo (int numero){
        int resultado;
        if (numero==1) return 1;
        resultado=factorialRecursivo(numero-1)*numero;
        return resultado;
    }
}
    class Recursividad{
    public static void main(String[] args) {
        Factorial f= new Factorial();

        System.out.println("Factorial utilizando un método recursivo:");
        System.out.println("El factorial de 4 es: "+f.factorialRecursivo(4));
        System.out.println("El factorial de 5 es: "+f.factorialRecursivo(5));
        System.out.println("El factorial de 8 es: "+f.factorialRecursivo(8));
        System.out.println("El factorial de 10 es: "+f.factorialRecursivo(10));
        System.out.println();
    }
}