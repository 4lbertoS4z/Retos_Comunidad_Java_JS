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

function Armstrong(numero) {
    let digits = [...numero.toString()]
    let resultado = 0
    let power = digits.length;
    digits.forEach((digit) => {
      resultado+=Math.pow(parseInt(digit),power)
    })
    if(resultado === numero){
        return "Si es Armstrong"
    } 
    return "No es Armstrong"
  }
  
  console.log(Armstrong(153))