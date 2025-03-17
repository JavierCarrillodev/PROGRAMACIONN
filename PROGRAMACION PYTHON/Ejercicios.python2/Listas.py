# Metodos utiles para trabajar con Listas
# 1 append(item): Añade un elemento al final de la lista

frutas = ["banana", "manzana"]
frutas.append("naranja")
print("append:",frutas)

# 2. extend(intem): Añade todos los elementos de un iterable (puede ser una lista) al final de la lista
frutas = ["banana", "sandia"]
frutas.extend(["naranja", "kiwi tomate"])
print("extend():",frutas)

# 3. insert(index, item) Inserta un elemento en la lista en la posición que indica el índice
frutas = ["manzana", "banana"]
frutas.insert (1,"platano")
print("insert():",frutas)

#4. remove(item): Elimina el primer elemento especificado de la lista, si no existe, genera un error
frutas = ["manzana", "banana","naranja"]
frutas.remove ("banana")
print("remove():",frutas)

# 5. Pop([index]). Elimina y devuelve el elemnto en la posicion especificada por el indice. Si no se específica un indice, elimina y devuelve el último elemnto de la lista abs.

frutas = ["manzana", "banana","naranja"]
fruit = frutas.pop ((0)) # Elimina y devuelve el último elemento
print("Elimino el elemento de indice o pos 0:",frutas.pop(0))
print("pop():", frutas)

# 6 index(item) Devuelve el indice de la PRIMERA aparacion del elemento especificado. Si no lo encuentra, genera un error
frutas = ["manzana", "banana","naranja"]
indice = frutas.index("banana")
print(indice)

# 7 count(item) Devuelve el numero de veces que aparece un elemento en la lista
frutas = ["manzana", "banana","naranja", "banana"]
cantidad = frutas.count("banana")
print(cantidad)

# 8 sort(key=none), reserve=(False) Ordena en orden alfabético
frutas = ["manzana", "banana","naranja"]
frutas.sort()
print(frutas) 

# 9 Reserve() Invierte el orden de los elemnris de la lista
frutas = ["manzana", "banana","naranja"]
frutas.reverse()
print("reserve()",frutas) 

# 10 clear() elimina todoslso elementos de la lista dejandola vacía
frutas = ["manzana", "banana","naranja"]
frutas.clear()
print("clear() directo:",frutas)

print(type(frutas))
print(type(frutas.clear()))