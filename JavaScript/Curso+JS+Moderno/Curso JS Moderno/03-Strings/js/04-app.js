const producto = "                Monitor 20 Pulgadas          ";

console.log(producto)
console.log(producto.length)

// Eliminar del inicio...
console.log(producto.trimStart());

// Eliminar espacio del final
console.log(producto.trimEnd());

console.log (producto.trimStart().trimEnd());

// Eliminar espacio de los dos lados
console.log(producto.trim());