''' Programa que lea una cantidad en segundo y muestre su equivalente en semanas, dias, horas, minutos, segundos. Según el formato de los siguientes ejemplos:
2178585 segundos equivalen a [ 3] semanas, 4 días, 05:09:45'''

#Declaro constantes

SEG_MIM = 60
MIN_HORA = 60
HORAS_DIAS = 24 
DIAS_SEMANA = 7

#Hago conversiones pero siguen siendo constantes

SEG_HORA = SEG_MIM * MIN_HORA
SEG_DIA = SEG_HORA * HORAS_DIAS
SEG_SEMANA = SEG_DIA * DIAS_SEMANA

seg_totales = int(input("Introduce segundos: "))

semanas = seg_totales // SEG_SEMANA
resto = seg_totales % SEG_SEMANA

dias = resto // SEG_DIA
resto= resto % SEG_DIA

Horas = resto // SEG_HORA
resto = resto % SEG_HORA

Minutos = resto // SEG_MIM
Segundos = resto % SEG_MIM

print(f"{seg_totales} equivalen a [{semanas:2}] semanas, {dias} dias, {Horas:02}:{Minutos:02}:{Segundos:02} ")