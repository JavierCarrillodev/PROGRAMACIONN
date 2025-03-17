contrasena = "Nevado"
contador = 0
while True:
    contrasena_input = input("Introduzca la Contrasena correcta:")
    contador += 1
    if contador > 3:
        print("Has fallado mas de tres veces vuelve a intentarlo mas tarde")
    elif contrasena_input == "Nevado":
        print("Contrasena correcta")
        break
    else:
        print("Contrasena incorrecta, Introduce otra contrasena:")
