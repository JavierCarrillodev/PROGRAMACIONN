#Tarea1. Cada ejercicio es una función
#Habrá un menú en mi main, que será una función que invoque a otras funciones .abs

def ejercicio_1():
    nombre = input("Introduce tu nombre: ")
    print(f"Hola{nombre}")

def ejercicio_14():
    # Inversión anual con intereses
    cantidad = float(input("Cantidad a invertir:"))
    intereses = float(input("Interes anual:"))
    annos = int(input("Años de la inversión: "))
    for contador in range(1, annos+1):
        cantidad+= (cantidad*intereses) /100
        print(f"Años {contador}: Capital ganado: {cantidad:.2f} €")


def ejercicio_2_8():

    inicio = int(input("Primer número: "))
    fin = int(input("Segundo número: "))

    for i in range (inicio, fin +1,2):
        if i % 2 !=0:
            i += 1
            print(i)
        else:
            print(i)

def es_primo(n):
    
    if n < 2:
        return False
    i = 2
    while i*i <= n:
        if n % i == 0:
            return False
        i += 1
        return True
    if es_primo():
        print(f"El numero {n}")
                
        

def menu():
    

    while True:
        print("\nSelecciona un ejercicio: ")
        print("1. Ejercicio 1")
        print("2. Ejercicio 14")
        print("3. Ejercicio_2_8")
        print("4. PRESIONE 0 para salir")

        opcion = input("Elige una opción: ")

        if opcion == "1":
            ejercicio_1()
        elif opcion == "2":
            ejercicio_14()
        elif opcion == "3":
            ejercicio_2_8()
        elif opcion == "4":
            print("Saliendo del programa...")
            break
        else:
            print("Opción incorrecta, introduce una opción valida")
menu()


