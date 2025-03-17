#Ej1. Define una funcion que reciba una lista de números y retorne una nueva lista de números y retorne una nueva lista con los números pares
from Prueba import numeros


def es_par(num):
    return num % 2 == 0

def numero_pares(lista):
    pares = []
    for i in lista:
        if es_par(i):
            pares.append(i)
    return pares
listilla = [1, 2, 3, 4, 5, 6]
print(numero_pares(listilla))

listilla2 = [1 ,3 ,5 ,7 ,9 ,12 ]
print(numero_pares(listilla2))

def obtener_lista():
    lista = []

    while True:
        numeros = input("Dame números (Termina con fin):")


