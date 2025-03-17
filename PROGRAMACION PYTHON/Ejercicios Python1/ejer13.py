# Este ejercicio es parecido al anterior (ejer12) sino que ahora irá en par y no impar
def pedir_numero():
    while True:
        try:
            numero = int(input("Introduce un número entero positivo: "))
            if numero >= 0:
                return numero
            else:
                print("Por favor, introduce un número mayor o igual a 0.")
        except ValueError:
            print("Entrada no válida. Asegúrate de ingresar un número entero.")


def cuenta_atras(n):
    countdown = [str(i) for i in range(n, -1, -1)]
    print(", ".join(countdown)) # countdown es una cuenta regresiva hacia atrás


numero = pedir_numero()
cuenta_atras(numero)