while True:
    try:
        n1 = int(input("Escribe un n: "))
        n2 = int(input("Escribe otro n: "))
        print(f"El res es {round(n1/n2)}")
        break 
    except ValueError:
        print(f"No has introducido un numero.")
    except ZeroDivisionError:
            print(f"No se puede dividir por 0.")
