Altura = float(input("Cuál es su altura: "))
Creditos = int(input("¿Cuantos creditos tienes?: "))

if Altura >= 137 and Creditos >= 10:
    print("Disfruta el viaje")
elif Altura < 137 and Creditos >= 10:
    print("No tienes suficiente altura")
elif Altura < 137 and Creditos < 10:
    print("No tienes suficientes creditos ni altura")
elif Altura >= 137 and Creditos < 10:
    print("No tienes suficientes creditos")

else:
    print("Error")

