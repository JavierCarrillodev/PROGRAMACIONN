const numero1 = 20;
const numero2 = "20";
const numero3 = "Uno";
const numero4 = 20.2;

/* La función parseInt() se utiliza para convertir 
 una cadena de texto (string) en un numero ente*/
console.log(numero1);
console.log(Number.parseInt(numero1));
console.log(Number.parseFloat(numero2));
console.log(Number.parseInt(numero3));

// Revisar si un numero es entero o no
console.log(Number.isInteger(numero4));
console.log(Number.isInteger(numero3));
