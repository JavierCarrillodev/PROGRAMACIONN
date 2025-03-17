"""Escribe una función que reciba una lista de números y retorne una nueva lista con
solo los números pares"""
def numeros_pares(lista):
    numeros_pares = []
    numeros_impares = []
    for i in lista:
        if i % 2 == 0:
            numeros_pares.append(i)
        elif i % 2 != 0:
            numeros_impares.append(i)


    return numeros_pares, numeros_impares

