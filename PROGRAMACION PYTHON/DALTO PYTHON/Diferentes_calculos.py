"""Programa que se pida dos numeros al usuario y una operación matemática a ejecutar con estos dos numeros.
Las operaciones son:
-> Suma
-> Resta (al primero menos el segundo)
-> Multiplicación
-> División (al primero sobre el segundo)
-> Exponenciación (el primero es la base y el segundo el exponente)
->Radicación (el primero es el radicado y el segundo es el indice)
"""
def suma(a,b):
    return a+b
def resta(a,b):
    return a-b
def multiplicacion(a,b):
    return a*b
def divide(a,b):
    return a/b
def exponenciacion(a,b):
    return a**b
def radicando(a,b):
    return a ** (1/b)

n1 = int(input("Ingrese un numero: "))
n2 = int(input("Ingrese otro numero: "))

print ("1 suma")
print ("2 resta")
print("3 Multiplicación")
print("4 División")
print("5 Exponenciación")
print("6 Radicación")
opc = (int(input("Indica la opción que desees:  ")))

if opc == 1:
    print(n1, "+", n2, "=", suma(n1,n2))
elif opc == 2:
    print(n1, "-", n2, "=", resta(n1,n2))
elif opc == 3:
    print(n1, "*", n2, "=", multiplicacion(n1,n2))
elif opc == 4:
    print(n1, "/", n2, "=", divide(n1,n2))
elif opc == 5:
    print(n1, "^ /", n2, "=", exponenciacion(n1,n2))
elif opc == 6:
    print(n1, "^ 1/", n2, "=", radicando(n1,n2))
else:
    print("ERROR: Ingrese un número valido")
