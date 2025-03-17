

def contrasena_segura(contrasena):
    largo = False
    mayus = False
    numer = False
    if len(contrasena) > 8:
        largo = True
    for i in range (len(contrasena)):
        if contrasena[i].isupper():
            mayus = True
        if contrasena[i].isnumeric():
            numer = True

    if largo and mayus and numer :
        return True
    else:
        return False

contrasena = input("Ingrese una contraseña: ")
verificacion = contrasena_segura(contrasena)
if verificacion:
    print("La contraseña es segura")
else:
    print("La contraseña no es segura")