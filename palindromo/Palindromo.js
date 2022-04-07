function esPalindromo(str) {
    const fraseInicial = str.replaceAll(" ","").replaceAll(",","").normalize('NFD').replace(/[\W_]/g, "").toLowerCase();
    const FraseFinal = fraseInicial.split("").reverse().join("");
  
    return fraseInicial === FraseFinal ? "es palindromo" : "no es palindromo";
  }
  
  console.log(esPalindromo("Oí lo de mamá: me dolió.")); // es palindromo
  console.log(esPalindromo("Yo dono rosas, oro no doy.")); // es palindromo
  console.log(esPalindromo("Isaac, no ronca así."))// es palindromo
  console.log(esPalindromo("otra cosa.")); // no es palindromo