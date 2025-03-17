const producto = "Monitor 20 Pulgadas";

// .repeat te va a permitir repetir una cadena de texto...
const texto = "en promocion".repeat(2,4);

console.log(texto);
console.log(`${producto} ${texto} !!!`);

// Split, dividir un String

const actividad = "Estoy aprendiendo JavaScript moderno";
console.log(actividad.split(" "));

const hobbies = "Leer, caminar, escuchar musica, escribir, aprender a programar";
console.log(hobbies.split(","));

const tweet = "Aprendiendo JavaScript #JSModernoConJuan";
console.log(tweet.split("#"));