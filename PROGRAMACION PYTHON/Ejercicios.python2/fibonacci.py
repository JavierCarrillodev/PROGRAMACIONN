#Funciones iterativa
# #Las que se repiten una operacion hasta que se cumple una condición
#Son utiles cuando se necesita procesar una coleccion de datos o se desea realizar uan tarea repetitiva en numeros especificos de veces
# FACTORIAL DE un NUMERO N. Es el producto de todos los núemros enteros positivos menores o iguales a ese número.abs

def factorial_iterativo():
    n = int(input("Indica el numero para hacer factorial: "))
    contador = 1
    factorial = 1
    while contador <= n:
        factorial *= contador
        contador += 1
    print(f"El factorial de {n} es {factorial}")

factorial_iterativo()






