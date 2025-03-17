# Función para calcular el capital acumulado
def calcular_inversion(cantidad_invertida, interes_anual, años):
    for año in range(1, años + 1):
        cantidad_invertida *= (1 + interes_anual / 100)
        print(f"Año {año}: Capital acumulado: {cantidad_invertida:.2f}")

# Solicitar datos al usuario
cantidad_invertida = float(input("Introduce la cantidad a invertir: "))
interes_anual = float(input("Introduce el interés anual (%): "))
años = int(input("Introduce el número de años: "))

# Calcular e imprimir el capital acumulado
calcular_inversion(cantidad_invertida, interes_anual, años)