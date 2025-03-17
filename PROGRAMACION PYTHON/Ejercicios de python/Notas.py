Notas = int(input("Introduce tu notas: "))

if Notas >= 0 and Notas < 5:
    print("suspenso")
elif 5 >= Notas < 6:
    print("Suficiente")

elif 6 >= Notas < 7:
    print("Bien")

elif 7 >= Notas < 8:
    print("Notable")

elif 9 >= Notas < 10:
    print("Sobresaliente")

elif  Notas == 10:
    print("Matricula de honor")

else: 
    print("No valido")
