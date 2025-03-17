def crear_contrasena_random(num):
    chars = "abcdefghijk"
    num_entero =str(num)
    num = int(num_entero[0])
    c1 = num - 2
    c2 = num
    c3 = num - 5
    contrasena = f"{chars[c1]}{chars[c2]}{chars[c3]}{num*2}"
    return contrasena

contrasena = crear_contrasena_random(1)
frase = f"Tu contraseña nueva es: {contrasena}"
print(frase)
