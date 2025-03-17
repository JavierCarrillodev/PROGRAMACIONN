# Programa que convierta una unidad en dias, horas, minutos y segundos a segundos.
from cloudinit.net import ipv4_mask_to_net_prefix


def calcular_segundos(dias, horas, minutos, segundo,):
    segundosTotales = 0
    segundosTotales += segundo
    segundosTotales += minutos * 60
    segundosTotales += horas * 60 * 60
    segundosTotales += dias * 24 * 60 * 60
    return segundosTotales
dias = int(input("Ingrese la cantidad de días:"))
horas = int(input("Ingrese la cantidad de horas:"))
minutos = int(input("Ingrese la cantidad de minutos:"))
segundos = int(input("Ingrese la cantidad de segundos:"))
segundosTotales = calcular_segundos(dias, horas, minutos, segundos)
print(f"La cantidad del el tiempo ingresado es: {segundosTotales}")