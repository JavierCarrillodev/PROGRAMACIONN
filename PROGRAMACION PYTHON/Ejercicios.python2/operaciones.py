

def sumar(a, b):
    return a + b
def restar(a, b):
    return  a - b
def multiplicar(a, b):
    return a * b
def dividir(a, b):
    return a / b
def input_usuario():
    return int(input('Ingrese un numero: '))
a = int(input('Ingrese un numero: '))
b = int(input('Ingrese un numero: '))

print ("1 suma")
print ("2 resta")
print("3 Multiplicación")
print("4 División")
opc = int(input("Ingrese una opcion: "))
if opc == 1:
    print(a, "+", b, "=", sumar(a,b) )
elif opc == 2:
    print(a, "-", b, "=", restar(a,b) )
elif opc == 3:
    print(a, "*", b, "=", multiplicar(a,b) )
elif opc == 4:
    print(a, "/", b, "=", dividir(a,b) )
else:
    print("Opcion invalida")