#Eje2 Crea una funcion que reciba una cadena de texto y cuente cuántas palabras tiene.

def contar_palabras(cadena):
    Palabras = cadena.split()
    return len(Palabras)

# Ejemplo de uso
cadena = "pepe tenia un camion rojo"
print(contar_palabras(cadena))


# Ahora introducido por el usuario
texto2 = input("Introduce una frase: ")
print(f"El texto tiene: {contar_palabras(texto2)} Palabras")

print(f"El texto2 {texto2} tiene {contar_palabras(texto2)} palabras")