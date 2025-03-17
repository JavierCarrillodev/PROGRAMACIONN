#Pedir numeros hasta que pongas 0 y se pare. Contar los numeros neagtivos qie se han introducidos

def contar_numeros_negativos():
    negativos = 0

    while True:
        pedir_numeros = int(input("Introduce numeros, si quieres termianar pon 0:"))
        if pedir_numeros == 0:
            print("Terminaste")
            break
        if pedir_numeros <0:
            negativos += 1
    return negativos
negativos = contar_numeros_negativos()
print(f"Los numeros negativos son: {negativos}")