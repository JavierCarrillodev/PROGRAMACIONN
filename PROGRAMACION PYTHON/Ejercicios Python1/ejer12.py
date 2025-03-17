# Con def estamos definiendo una función
def pedir_numero():
    while True:
        try:
            numero = int(input("Introduce un número entero positivo: "))
            if numero > 0:
                return numero
            else:
                print("Por favor, introduce un número mayor que 0.")
        except ValueError: # except ValueError es lanzada cuando una función espera un valor determinado pero recibe otro.
            print("Entrada no válida. Asegúrate de ingresar un número entero.")

# Función para mostrar números impares
def mostrar_impares(n):
    impares = [str(i) for i in range(1, n + 1) if i % 2 != 0]
    print(", ".join(impares))


numero = pedir_numero()
mostrar_impares(numero)
