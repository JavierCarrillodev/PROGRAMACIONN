# Ejercicio que solicita leer dos números enteros de teclado y sumar todos los numeros pares en el intervalo. Tamben se debe definir un procedimiento para la lectura correcta del intervalo y una funcion para calcular la suma
def leer_intervalor():
    a = int(input("Primer numero"))
    b = int(input("Segundo numero"))
    while (a>=b):
        print("El primer numero debe de ser menor")
        a = int(input("Primer numero"))
        b = int(input("Segundo numero"))
        return a, b
    def suma_pares(a, b):
        suma = 0
        for i in range(a, b+1):
            if i % 2 == 0:
                suma += i
        return suma

    def main():
        n1, n2 = leer_intervalo()
        resultado = suma_pares(n1, n2)
        print(f"La suma de los números pares entre {n1} y {n2} es {resultado}")