edad = int(input("Cuantos años tienes: "))

if edad < 4: # Si esdad es menor a 4 nos dira lo que hay dentro de la condición
    print("Puedes entrar gratis")

elif edad >= 4 and edad < 18: # Si edad es mayor a 4 y menos a 18 nos dira lo que hay dentro de la condición
    print("Debes pagar 5€")

elif edad >= 18:
    print("Tienes que pagar 10€")


