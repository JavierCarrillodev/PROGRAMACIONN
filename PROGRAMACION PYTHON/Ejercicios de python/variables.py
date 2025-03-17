micadena = "Mi variable tipo cadena"
print(micadena)

mientero = 5
print(micadena)

entero_a_cadena = str(mientero)
print (entero_a_cadena)
print(type(entero_a_cadena))

mibooleana = False
print(mibooleana)

#Concatenación de variables

print(micadena, entero_a_cadena, mibooleana)
print("Esto vale", mibooleana)

nuevacadena = micadena + entero_a_cadena
print(nuevacadena)

#Ejemplo de función predeterminada en el sistema
print(len(micadena)) #Me devuleve un valor
print(type(len))

#Variables creadas en unasola línea
name, apellido, edad = "Javi", "Carrillo", 20
print("Me llamo:", name, apellido, "Y tengo:", edad, "años")
edad = float(edad)
print(type(edad))

direccion: str = "Calle Peña"
direccion = True
direccion = 5
direccion = 1,4

print(direccion)
print(type(direccion))

